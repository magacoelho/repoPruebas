package es.upm.miw.dos.repositorio;

public class Fraction {
	private int numerator;

private int denominator;

public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
}

public Fraction() {
    this(1, 1);
}

public int getNumerator() {
    return numerator;
}

public int getDenominator() {
    return denominator;
}

public double decimal() {
    return (double) numerator / denominator;
}
public void metodoAgregadoEnRemoto(){
	
// mas cosas	
	
}

}
