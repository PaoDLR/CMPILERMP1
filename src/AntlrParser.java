import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.util.ArrayList;


public class AntlrParser {

    public static void main (String[] args) {

        try {
        ArrayList<String> sal = new ArrayList();
        int ctr = 1;


            //Julian's: "C:\Users\GeneralTank\Documents\4th Year 1st Term\CMPILER\CMPILERMP1\src\test.txt"
            //Pao's: "D:\School\CMPILER\PE1\Code\CMPILERMP1\\test.txt"
            File f = new File("D:\\School\\CMPILER\\PE1\\Code\\CMPILERMP1\\test.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String s;

            while ((s = br.readLine()) != null) {

                sal.add(s);

            }

            for (int i = 0; i < sal.size(); i++) {

                String on = sal.get(i).replaceAll(" ", "");
                CharStream cs = CharStreams.fromString(on);
                GrammarLexer gl = new GrammarLexer(cs);
                CommonTokenStream cts = new CommonTokenStream(gl);
                GrammarParser gp = new GrammarParser(cts);
                ParseTree pt = gp.output();

                if (pt.getText().replaceAll(" ", "").length() == on.length() && gp.getNumberOfSyntaxErrors() == 0)
                    System.out.println(ctr + ") Accepted");
                else
                    System.out.println(ctr + ") Rejected");

                ctr++;

            }
/*
        int i = 0;
        while(s != null){

            if (i < sal.size()) {
                String on = sal.get(i).replaceAll(" ", "");
                CharStream cs = CharStreams.fromString(on);
                GrammarLexer gl = new GrammarLexer(cs);
                CommonTokenStream cts = new CommonTokenStream(gl);
                GrammarParser gp = new GrammarParser(cts);
                ParseTree pt = gp.output();

                if (pt.getText().replaceAll(" ", "").length() == on.length() && gp.getNumberOfSyntaxErrors() == 0)
                    System.out.println(on + " has been Accepted :)");
                else
                    System.out.println(on + " has been Rejected :(");
            }else
                {
                    System.out.println("end");
            }
            */

        } catch (Error e) {
            //e.printStackTrace();
        } catch (IOException e) {
            //e.printStackTrace();
        }
    }}
