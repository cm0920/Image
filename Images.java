/*
 * Note: these methods are public in order for them to be used by other files
 * in this assignment; DO NOT change them to private.  You may add additional
 * private methods to implement required functionality if you would like.
 *
 * You should remove the stub lines from each method and replace them with your
 * implementation that returns an updated image.
 */

import acm.graphics.*;

public class Images implements ImageConversions {

    public GImage flipHorizontal(GImage source) {
        
        int[][] pixels = source.getPixelArray();
        int[][] flip = new int[pixels.length][pixels[0].length];
        for(int i = 0; i < flip.length; i++){
            for(int j = 0; j < flip[i].length; j++){
                int axis = flip[i].length - 1 - j;
                flip[i][j] = pixels[i][axis];
            }
        }
        
        return new GImage(flip);
    }

    public GImage rotateLeft(GImage source) {
        
        int[][] pixels = source.getPixelArray();
        int[][] left = new int[pixels[0].length][pixels.length];
        for(int i = 0; i < left.length; i++){
            for(int j = 0; j < left[i].length; j++){
                int c = pixels[0].length - 1 - i;
                left[i][j] = pixels[j][c];
            }
            
        }
        return new GImage(left);
    }

    public GImage rotateRight(GImage source) {
        
        int[][] pixels = source.getPixelArray();
        int[][] right = new int[pixels[0].length][pixels.length];
        for(int i = 0; i < right.length; i++){
            for(int j = 0; j < right[i].length; j++){
                int r = pixels.length - 1 - j;
                right[i][j] = pixels[r][i];
            }
        }
        return new GImage(right);
    }

    public GImage greenScreen(GImage source) {
        int[][] pixels = source.getPixelArray();
        for(int[] p: pixels){
            for(int j = 0; j < p.length; j++){
                int r = GImage.getRed(p[j]);
                int g = GImage.getGreen(p[j]);
                int b = GImage.getBlue(p[j]);
                if(g >= (2 * Math.max(r, b))){ // accounts that not every "green" pixel is java's Color.GREEN
                    p[j] = GImage.createRGBPixel(r, g, b, 0);
                }
            }
        }
        return new GImage(pixels);
    }

    public GImage equalize(GImage source) {
        // TODO
        return null;
    }

    public GImage negative(GImage source) {
        
        int[][] pixels = source.getPixelArray();
        for(int[] p: pixels){
            for(int j = 0; j < p.length; j++){
                int r = GImage.getRed(p[j]);
                int g = GImage.getGreen(p[j]);
                int b = GImage.getBlue(p[j]);
                p[j] = GImage.createRGBPixel(255 - r, 255 - g, 255 - b);
            }
        }
        return new GImage(pixels);
    }

    public GImage translate(GImage source, int dx, int dy) {
        // TODO
        int[][] pixels = source.getPixelArray();
        int[][] trans = new int[pixels.length][pixels[0].length];
        for(int i = 0; i < pixels.length; i++){
            for(int j = 0; j < pixels[0].length; j++){
                int r = 0;
            }
        }
        return null;
    }

    public GImage blur(GImage source) {
        // TODO
        return null;
    }
}
