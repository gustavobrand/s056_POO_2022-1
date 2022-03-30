/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tad_lists01;

import CreditCards.CreditCardTop;
import CreditCards.S028_aula01_creditcard_v02;
// import com.sun.javafx.image.impl.IntArgb;
import net.datastructures.*;

/**
 *
 * @author brandg
 */
public class TAD_Lists01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        SinglyLinkedList<Integer> testsingle;
//        testsingle = new SinglyLinkedList<Integer>();
//        testsingle.addLast(1);
//        System.out.println(testsingle);
//        testsingle.addLast(2);
//        System.out.println(testsingle);
//        testsingle.addLast(3);
//        System.out.println(testsingle);
//        testsingle.addFirst(5);
//        System.out.println(testsingle);
//        testsingle.addFirst(6);
//        System.out.println(testsingle);
//        testsingle.removeFirst();
//        System.out.println(testsingle);
//        testsingle.removeFirst();
//        System.out.println(testsingle);
        
        DoublyLinkedList<Integer> testdouble;
        testdouble = new DoublyLinkedList<Integer>();
        testdouble.addLast(1);
        System.out.println(testdouble);
        testdouble.addLast(2);
        System.out.println(testdouble);
        testdouble.addLast(3);
        System.out.println(testdouble);
        testdouble.addFirst(5);
        System.out.println(testdouble);
        testdouble.addFirst(6);
        System.out.println(testdouble);
        testdouble.removeFirst();
        System.out.println(testdouble);
        testdouble.removeLast();
        System.out.println(testdouble);
        testdouble.removeFirst();
        System.out.println(testdouble);
        testdouble.removeLast();
        System.out.println(testdouble);
        
        DoublyLinkedList<S028_aula01_creditcard_v02> testCredit;
        testCredit = new DoublyLinkedList<S028_aula01_creditcard_v02>();

        testCredit.addFirst(new S028_aula01_creditcard_v02(
        		"Joao", "Itau", "45822", 1000));
        testCredit.addFirst(new CreditCardTop(
        		"Joao", "Itau", "45822"));
        
        System.out.println(testCredit);
        System.out.println();
        
        for (NodeDouble<S028_aula01_creditcard_v02> cc : testCredit) {
        	System.out.println(cc);
        }
        
        
    }
    
}
