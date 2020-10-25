package miniplc0java.analyser;

import miniplc0java.analyser.Analyser;
import miniplc0java.error.CompileError;
import miniplc0java.tokenizer.StringIter;
import miniplc0java.tokenizer.Tokenizer;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class AnalyserTest {
    private Analyser init(){
        File file = new File("/Users/wzy/Desktop/miniplc0-java-master/src/main/java/miniplc0java/analyser/txt.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        StringIter it = new StringIter(sc);
        Tokenizer tokenizer = new Tokenizer(it);
        Analyser analyser =new Analyser(tokenizer);
        return analyser;
    }

    @Test
    public void TestAnalyser() throws CompileError {
        Analyser analyser=init();
        System.out.println(analyser.analyse());
    }
}
