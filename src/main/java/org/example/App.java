package org.example;

import org.example.custom.ArrayList;
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        ArrayList android = new ArrayList();
        android.add("Nougat");
        android.add("Pie");
        android.add("oreo");
        System.out.println(android.get(0));
        System.out.println("Length:"+android.length());
        android.remove(0);
        System.out.println(android.get(0));
    }
}
