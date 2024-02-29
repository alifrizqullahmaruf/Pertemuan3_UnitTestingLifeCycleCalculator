import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class KalkulatorTest {
    static Kalkulator kalk;

    @BeforeAll
    static void initClass(){
        kalk = new Kalkulator(2,8);
        System.out.println("Before all di jalankan");
    }

    @Test
    void tambah() {
        int actual = kalk.tambah();
        int expect = 10;
        System.out.println("Menjalankan test method tambah");
        assertEquals(expect, actual);
    }

    @Test
    void kurang() {
        int hasil = kalk.kurang();
        System.out.println("Menjalankan test method kurang");
        assertNotNull(hasil);
    }
    @Test
    void bagi() {
        int actual = kalk.bagi();
        int expect = 0;
        System.out.println("Menjalankan test method bagi");
        assertEquals(expect, actual);
    }

    @Test
    void kali() {
        int actual = kalk.kali();
        int expect = 16;
        System.out.println("Menjalankan test method kali");
        assertEquals(expect,actual);
    }



    @Test
    void penjumlahanNilaiPositif() {
        // Input
        Kalkulator kalk = new Kalkulator(2, 3);

        // Provide expected & actual value
        assertEquals(5, kalk.tambah());
        // Automatically verify result & give alert
    }
    @Test
    void penjumlahanNilaiNegatif() {
        Kalkulator kalk = new Kalkulator(-2, -6);
        assertEquals(-8, kalk.kurang());
    }

    @Test
    void pembagianNegatif(){
        Kalkulator kalk = new Kalkulator(8,2);
        assertEquals(4,kalk.bagi());
    }

    @Test
    void perkalianNegatif(){
        Kalkulator kalk = new Kalkulator(8,2);
        assertEquals(16,kalk.kali());
    }
    @AfterEach
    void closeMethod()
    {
        System.out.println("After each method dijalankan");
    }
    @AfterAll
    static void closeClass()
    {
        System.out.println("After all dijalankan");
    }
}