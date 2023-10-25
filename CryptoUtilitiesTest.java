import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Put your name here
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test //Boundary Case
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testReduceToGCD_35_7() {
        NaturalNumber n = new NaturalNumber2(35);
        NaturalNumber nExpected = new NaturalNumber2(7);
        NaturalNumber m = new NaturalNumber2(7);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //Challenging Routine Case (High Number)
    public void testReduceToGCD_150_80() {
        NaturalNumber n = new NaturalNumber2(150);
        NaturalNumber nExpected = new NaturalNumber2(10);
        NaturalNumber m = new NaturalNumber2(80);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //Challenging Routine Case (Prime Numbers)
    public void testReduceToGCD_43_11() {
        NaturalNumber n = new NaturalNumber2(43);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(11);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /*
     * Tests of isEven
     */

    @Test //Boundary Case
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test //Boundary Case
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test //Routine Case
    public void testIsEven_13() {
        NaturalNumber n = new NaturalNumber2(13);
        NaturalNumber nExpected = new NaturalNumber2(13);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test //Routine Case
    public void testIsEven_52() {
        NaturalNumber n = new NaturalNumber2(52);
        NaturalNumber nExpected = new NaturalNumber2(52);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test //Challenging Routine Case (High Number)
    public void testIsEven_10001() {
        NaturalNumber n = new NaturalNumber2(10001);
        NaturalNumber nExpected = new NaturalNumber2(10001);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /*
     * Tests of powerMod
     */

    @Test //Boundary Case
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Exponent Boundary Test:
    public void testPowerMod_100_1_40() {
        NaturalNumber n = new NaturalNumber2(100);
        NaturalNumber nExpected = new NaturalNumber2(20);
        NaturalNumber p = new NaturalNumber2(1);
        NaturalNumber pExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(40);
        NaturalNumber mExpected = new NaturalNumber2(40);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testPowerMod_40_40_40() {
        NaturalNumber n = new NaturalNumber2(40);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(40);
        NaturalNumber pExpected = new NaturalNumber2(40);
        NaturalNumber m = new NaturalNumber2(40);
        NaturalNumber mExpected = new NaturalNumber2(40);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testPowerMod_2_3_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(3);
        NaturalNumber pExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Routine Case
    public void testPowerMod_55_44_33() {
        NaturalNumber n = new NaturalNumber2(55);
        NaturalNumber nExpected = new NaturalNumber2(22);
        NaturalNumber p = new NaturalNumber2(44);
        NaturalNumber pExpected = new NaturalNumber2(44);
        NaturalNumber m = new NaturalNumber2(33);
        NaturalNumber mExpected = new NaturalNumber2(33);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Boundary Case
    public void isWitnessToCompositeness_2_3() {
        NaturalNumber w = new NaturalNumber2(2);
        NaturalNumber wExpected = new NaturalNumber2(2);
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(4);
        boolean composite = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, composite);
    }

    @Test //Routine Case
    public void isWitnessToCompositeness_4_6() {
        NaturalNumber w = new NaturalNumber2(4);
        NaturalNumber wExpected = new NaturalNumber2(4);
        NaturalNumber n = new NaturalNumber2(6);
        NaturalNumber nExpected = new NaturalNumber2(6);
        boolean composite = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, composite);
    }

    @Test //Routine Case
    public void isWitnessToCompositeness_5_11() {
        NaturalNumber w = new NaturalNumber2(5);
        NaturalNumber wExpected = new NaturalNumber2(5);
        NaturalNumber n = new NaturalNumber2(11);
        NaturalNumber nExpected = new NaturalNumber2(11);
        boolean composite = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(false, composite);
    }

    @Test //Challenging Routine Case (High Number)
    public void isWitnessToCompositeness_98_100() {
        NaturalNumber w = new NaturalNumber2(98);
        NaturalNumber wExpected = new NaturalNumber2(98);
        NaturalNumber n = new NaturalNumber2(100);
        NaturalNumber nExpected = new NaturalNumber2(100);
        boolean composite = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, composite);
    }

    @Test //Routine Case
    public void isWitnessToCompositeness_7_12() {
        NaturalNumber w = new NaturalNumber2(7);
        NaturalNumber wExpected = new NaturalNumber2(7);
        NaturalNumber n = new NaturalNumber2(12);
        NaturalNumber nExpected = new NaturalNumber2(12);
        boolean composite = CryptoUtilities.isWitnessToCompositeness(w, n);
        assertEquals(wExpected, w);
        assertEquals(nExpected, n);
        assertEquals(true, composite);
    }

    @Test //Boundary/Routine Case
    public void isPrimeTwo_5() {
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, prime);
    }

    @Test //Routine Case
    public void isPrimeTwo_10() {
        NaturalNumber n = new NaturalNumber2(10);
        NaturalNumber nExpected = new NaturalNumber2(10);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(false, prime);
    }

    @Test //Routine Case
    public void isPrimeTwo_23() {
        NaturalNumber n = new NaturalNumber2(23);
        NaturalNumber nExpected = new NaturalNumber2(23);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, prime);
    }

    @Test //Routine Case
    public void isPrimeTwo_41() {
        NaturalNumber n = new NaturalNumber2(41);
        NaturalNumber nExpected = new NaturalNumber2(41);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, prime);
    }

    @Test //Boundary Case
    public void isPrimeTwo_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(2);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, prime);
    }

    @Test //Boundary Case
    public void isPrimeTwo_3() {
        NaturalNumber n = new NaturalNumber2(3);
        NaturalNumber nExpected = new NaturalNumber2(3);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(true, prime);
    }

    @Test //Challenging Routine Case (High Number)
    public void isPrimeTwo_1000000() {
        NaturalNumber n = new NaturalNumber2(1000000);
        NaturalNumber nExpected = new NaturalNumber2(1000000);
        boolean prime = CryptoUtilities.isPrime2(n);
        assertEquals(nExpected, n);
        assertEquals(false, prime);
    }

    @Test //Boundary Case
    public void generateNextLikelyPrime_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(3);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Routine Case
    public void generateNextLikelyPrime_5() {
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Routine Case
    public void generateNextLikelyPrime_14() {
        NaturalNumber n = new NaturalNumber2(14);
        NaturalNumber nExpected = new NaturalNumber2(17);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Routine Case
    public void generateNextLikelyPrime_33() {
        NaturalNumber n = new NaturalNumber2(33);
        NaturalNumber nExpected = new NaturalNumber2(37);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Routine Case
    public void generateNextLikelyPrime_54() {
        NaturalNumber n = new NaturalNumber2(54);
        NaturalNumber nExpected = new NaturalNumber2(59);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Routine Case
    public void generateNextLikelyPrime_72() {
        NaturalNumber n = new NaturalNumber2(72);
        NaturalNumber nExpected = new NaturalNumber2(73);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }

    @Test //Challenging Routine Case (Many iterations)
    public void generateNextLikelyPrime_115() {
        NaturalNumber n = new NaturalNumber2(115);
        NaturalNumber nExpected = new NaturalNumber2(127);
        CryptoUtilities.generateNextLikelyPrime(n);
        assertEquals(nExpected, n);
    }
}