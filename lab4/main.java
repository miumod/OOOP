package lab4;


import java.io.IOException;
import static lab4.Tribe.OutputOfFile;


public class main {
    public static void main(String[] args) throws IOException {
        Tribe [] tribes;
        tribes=new Tribe[3];
        for (int i=0; i<3; i++)
            tribes[i]=new Tribe();
        for(int i=0;i<3;i++)
            tribes[i].InputInFile();
        OutputOfFile();
    }
}



