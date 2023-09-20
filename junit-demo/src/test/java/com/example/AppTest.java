package com.example;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    Alogrithm a;
    Scanner scanner;
    File file = new File("src/test/resources/testData.txt");
    static int testCount = 1;

    @Before
    public void initiate() {
        a = new Alogrithm();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void kadensAlgorithmTest() {
        System.out.println("test case 1");
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        assertEquals(7, a.kadensAlgorithm(arr));
    }
    // run Algo for various inputs

    @Test
    public void kadensAlgorithmMultipleInputsTest() throws IOException {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] strArray = line.split(" ");
            int[] intArray = new int[strArray.length];

            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            int expectedSum = Integer.parseInt(scanner.nextLine());

            int actualSum = a.kadensAlgorithm(intArray);

            // assertEquals(expectedSum, actualSum);
            if (expectedSum != actualSum) {
                System.out.println("Test case #" + testCount + " failed.");
                System.out.println("Input values: " + line);
                System.out.println("Expected sum: " + expectedSum);
                System.out.println("Actual sum: " + actualSum);
            }
            assertEquals("Test case #" + testCount + " failed", expectedSum, actualSum);
            testCount++;

        }
    }

    @After
    public void rele() {
        scanner.close();
    }
}
