//OperasiTest.java
package soal6b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestOperasi {
	Operasi op = new Operasi();
	int result1;
	double result2;
	@Test
    public void testKali() {
        result1 = op.kali(20,30);
        assertEquals(600, result1);

    }
	@Test
    public void testBagi() {
        result2 = op.bagi(72,5);
        assertEquals(14,4, result2);

    }
	@Test
    public void testTambah() {
        result1 = op.tambah(7,5);
        assertEquals(12, result1);

    }
	@Test
	public void testKurang() {
        result1 = op.kurang(72,5);
        assertEquals(67, result1);

    }
	@Test
	public void testMain() {
        PrintStream originalOut = System.out;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bos));
		
		// action
		String result ="11x2=22\n11/2=5.5\n11+2=13\n11-2=9\n";
		assertNotNull(result, "gh");
		Operasi.main(null);
		// assertion
		assertEquals(result, bos.toString());

		// undo the binding in System
		System.setOut(originalOut);

    }
}