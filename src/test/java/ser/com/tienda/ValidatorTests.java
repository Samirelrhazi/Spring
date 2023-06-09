package ser.com.tienda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ser.com.tienda.util.Validator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@SpringBootTest
class ValidatorTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testIsAlfanumeric() {
		assertAll(() -> assertTrue(Validator.isAlfanumeric("Testf3")),
				() -> assertFalse(Validator.isAlfanumeric("Texo ")),
				() -> assertFalse(Validator.isAlfanumeric("  ")));

	}

	@Test
	void testIsVacio() {
		assertAll(() -> assertTrue(Validator.isVacio("")), 
				() -> assertFalse(Validator.isVacio("Texto")),
				() -> assertFalse(Validator.isVacio("null"))
				);

	}

	@Test
	void testCumplePhoneNumber() {
	assertAll(() -> assertTrue(Validator.cumplePhoneNumber("0212121212")),
	() -> assertFalse(Validator.cumplePhoneNumber("10134125253045434531010")),
	() -> assertFalse(Validator.cumplePhoneNumber("15tdg")));
	}
	
	
	
	@Test
	void testIsEmailValido() {
		assertAll(() -> assertTrue(Validator.isEmailValido("text@test.com")),
				() -> assertFalse(Validator.isEmailValido("testeando")),
				() -> assertFalse(Validator.isEmailValido("@")),
				() -> assertFalse(Validator.isEmailValido("@test.com")),
				() -> assertFalse(Validator.isEmailValido(""))
				);
	}

	@Test
	void testCumpleDNI() {
		assertAll(() -> assertTrue(Validator.cumpleDNI("99.999.999-R")),
				() -> assertFalse(Validator.cumpleDNI("testdni1")),
				() -> assertFalse(Validator.cumpleDNI("ab2kna0")),
				() -> assertFalse(Validator.cumpleDNI("       ")));
	}

	@Test
	void testCumpleRangoInt() {
		assertAll(() -> assertTrue(Validator.cumpleRango(1, 0, 2)), 
				() -> assertFalse(Validator.cumpleRango(0, 1, 2)),
				() -> assertFalse(Validator.cumpleRango(320, 0, 1)));
	}

	@Test
	void testCumpleRangoDouble() {
		assertAll(() -> assertTrue(Validator.cumpleRango(1.1, 0,2)),
				() -> assertFalse(Validator.cumpleRango(0.4, 1, 100)),
				() -> assertFalse(Validator.cumpleRango(100,2,12)));
	}

	@Test
	void testCumpleLongitudMin() {
		assertAll(() -> assertTrue(Validator.cumpleLongitudMin("testeando", 2)),
				() -> assertFalse(Validator.cumpleLongitudMin("test", 10)));
	}

	@Test
	void testCumpleLongitudMax() {
		assertAll(() -> assertTrue(Validator.cumpleLongitudMax("testeando", 10)),
				() -> assertFalse(Validator.cumpleLongitudMax("test", 1)));
	}

	@Test
	void testCumpleLongitud() {
		assertAll(() -> assertTrue(Validator.cumpleLongitud("cinco", 5, 10)),
				() -> assertFalse(Validator.cumpleLongitud("", 1, 5)),
				() -> assertFalse(Validator.cumpleLongitud("sa", 3, 4)));
	}

	@Test
	void testValDateMin() {

		assertAll(() -> assertTrue(Validator.valDateMin(LocalDate.parse("1999-09-09"), LocalDate.parse("1999-09-08"))),
				() -> assertFalse(Validator.valDateMin(LocalDate.parse("1998-01-01"), LocalDate.parse("1999-01-01"))),
				() -> assertFalse(Validator.valDateMin(LocalDate.parse("2000-02-20"), LocalDate.parse("2012-12-12")))
				);
	}

	@Test
	void testValDateMax() {

		assertAll(() -> assertTrue(Validator.valDateMax(LocalDate.parse("1999-09-09"), LocalDate.parse("2000-09-08"))),
				() -> assertFalse(Validator.valDateMax(LocalDate.parse("1998-01-01"), LocalDate.parse("1997-01-01"))),
				() -> assertFalse(Validator.valDateMax(LocalDate.parse("2000-02-20"), LocalDate.parse("1999-12-12")))
				);

	}

	@Test
	void testEsFechaValida() {

		assertAll(() -> assertTrue(Validator.esFechaValida("09/09/1999")),
				() -> assertFalse(Validator.esFechaValida("2000/02/02"))
				);

	}

	

}
