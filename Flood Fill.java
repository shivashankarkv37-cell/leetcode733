class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor == color) {
            return image;
        }
        dfs(image,sr,sc,oldColor,color);
        return image;
    }
    public void dfs(int[][] image,int r, int c, int oldColor,int newColor) {
        image[r][c] = newColor;
        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };
        for(int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr >= 0 && nr < image.length && nc >= 0 && nc < image[0].length && image[nr][nc] == oldColor) {
                dfs(image,nr,nc,oldColor,newColor);
            }
        }
    }
}
