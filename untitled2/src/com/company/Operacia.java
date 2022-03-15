package com.company;

public class Operacia {
    private int lol;
    private String[] ss;
    private int result;
    int[] sl = new int[3];

    public Operacia(String[] slovo){
        ss = slovo;
    }

    public int perevod_rim(){

        String[] rim = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        for (int j = 0; j < 10; j++) {
            if (ss[0].equals(rim[j]))
                sl[0] = j+1;
            if (ss[2].equals(rim[j]))
                sl[2] = j+1;
        }
        if (sl[0]<=sl[2])
            return 0;
        else
            return 1;
    }

    public void perevod_arab(){
        String[] arab = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (int j = 0; j < 10; j++) {
            if (ss[0].equals(arab[j]))
                sl[0] = j+1;
            if (ss[2].equals(arab[j]))
                sl[2] = j+1;
        }
    }

    public int vichisl(){
        String[] opera = new String[]{"+", "-", "*", "/"};

        if (ss[1].equals(opera[0]))
            result = sl[0] + sl[2];
        if (ss[1].equals(opera[1]))
            result = sl[0] - sl[2];
        if (ss[1].equals(opera[2]))
            result = sl[0] * sl[2];
        if (ss[1].equals(opera[3]))
            result = sl[0] / sl[2];

        return result;
    }

    public String result_rim(){
        String[] rim = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] rimd = new String[]{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};

        String rr;
        String po = "";
        String vo = "";
        int l = result;
        int k = 0;

        while(l>0) {
            k++;
            l /= 10;
        }

        if ((k==2)||(k==3)) {
            int nn = result / 10;
            int ww = result % 10;

            for (int j = 0; j < 10; j++) {
                if (nn == j+1)
                    po = rimd[j];
                if (ww == j+1)
                    vo = rim[j];
            }
            po = po + vo;
        }

        if (k==1){
            for (int j = 0; j < 10; j++) {
                if (result == j+1)
                    po = rim[j];
            }
        }
        return po;
    }
}



