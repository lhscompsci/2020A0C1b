package com.wtxcompsci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner infile = new Scanner(new File("input.dat"));

        ArrayList<Long> list = new ArrayList<>();

        long answer = 0;

        while (infile.hasNext()){
            list.add(infile.nextLong());
        }
        for(int i = 0; i < list.size(); i++)
            for(int j = i+1; j<list.size(); j++)
                for(int k = j+1; k<list.size(); k++)
                    if((list.get(i)+list.get(j)+list.get(k))==2020L) {
                        answer = list.get(i) * list.get(j) * list.get(k);
                        break;
                    }

        System.out.println(answer);

    }
}
