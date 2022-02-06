package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
import digital.innovation.one.utils.interno.SumHelper;

import java.sql.*;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(3, 3));

        SumHelper sumHelper = new SumHelper();
        System.out.println(sumHelper.execute(5, 5));

    }
}
