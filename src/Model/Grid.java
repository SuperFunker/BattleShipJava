package Model;

public class Grid {
    int playerId;
    Square[][] grid = new Square[10][10];

    public Grid(int playerId) {
        this.playerId = playerId;

        char _letter = 'A';
        int _number = 1;
        for (int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 10; k++)
            {
                if (_number > 10)
                {
                    _number = 1;
                }
                grid[i][k] = new Square(i,k,_letter + String.valueOf(_number),false);
                _number++;
            }
            _letter++;
        }
    }

    public void PrintGrid()
    {
        for(int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 10; k++)
            {
                System.out.println(grid[i][k].pos + " " + grid[i][k].isOccupied + " || " + grid[i][k].x + grid[i][k].y);
            }
        }
    }
}
