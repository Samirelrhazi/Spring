package ser.com.tienda;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ser.com.tienda.util.Validator;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@SpringBootTest
class SerTiendaIncienso2023ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testIsAlfanumeric() {
		assertAll(() -> assertTrue(Validator.isAlfanumeric("test12")),
				() -> assertFalse(Validator.isAlfanumeric("Texo")),
				() -> assertFalse(Validator.isAlfanumeric("@@@@")),
				() -> assertFalse(Validator.isAlfanumeric("       ")));

	}

	@Test
	void testIsVacio() {
		assertAll(() -> assertTrue(Validator.isVacio("")), 
				() -> assertFalse(Validator.isVacio("Texto")));

	}

	@Test
	void testCumplePhoneNumber() {
		assertAll(() -> assertTrue(Validator.cumplePhoneNumber("606040450")),
				() -> assertFalse(Validator.cumplePhoneNumber("text00000")),
				() -> assertFalse(Validator.cumplePhoneNumber("0101001010101010")),
				() -> assertFalse(Validator.cumplePhoneNumber("15")));
	}

	@Test
	void testIsEmailValido() {
		assertAll(() -> assertTrue(Validator.isEmailValido("text@test.com")),
				() -> assertFalse(Validator.isEmailValido("testeando")),
				() -> assertFalse(Validator.isEmailValido("prueba@")),
				() -> assertFalse(Validator.isEmailValido("Pruebaprueba.com")),
				() -> assertFalse(Validator.isEmailValido("Prueba.com")));
	}

	@Test
	void testCumpleDNI() {
		assertAll(() -> assertTrue(Validator.cumpleDNI("11.123.123-L")),
				() -> assertFalse(Validator.cumpleDNI("1111111111L")), () -> assertFalse(Validator.cumpleDNI("123L")),
				() -> assertFalse(Validator.cumpleDNI("LLLLLLLLL")));
	}

	@Test
	void testCumpleRangoIntIntInt() {
		assertAll(() -> assertTrue(Validator.cumpleRango(5, 1, 10)), () -> assertFalse(Validator.cumpleRango(1, 2, 3)),
				() -> assertFalse(Validator.cumpleRango(10, 4, 5)));
	}

	@Test
	void testCumpleRangoDoubleIntInt() {
		assertAll(() -> assertTrue(Validator.cumpleRango(5.5, 1, 10)),
				() -> assertFalse(Validator.cumpleRango(1.8, 2, 3)),
				() -> assertFalse(Validator.cumpleRango(10.23, 4, 5)));
	}

	@Test
	void testCumpleLongitudMin() {
		assertAll(() -> assertTrue(Validator.cumpleLongitudMin("Prueba", 5)),
				() -> assertFalse(Validator.cumpleLongitudMin("Prueba", 20)));
	}

	@Test
	void testCumpleLongitudMax() {
		assertAll(() -> assertTrue(Validator.cumpleLongitudMax("Prueba", 20)),
				() -> assertFalse(Validator.cumpleLongitudMax("Prueba", 3)));
	}

	@Test
	void testCumpleLongitud() {
		assertAll(() -> assertTrue(Validator.cumpleLongitud("Prueba", 3, 10)),
				() -> assertFalse(Validator.cumpleLongitud("Prueba", 10, 20)),
				() -> assertFalse(Validator.cumpleLongitud("Prueba", 3, 4)));
	}

	@Test
	void testValDateMin() {

		assertAll(() -> assertTrue(Validator.valDateMin(LocalDate.parse("2023-04-12"), LocalDate.parse("2001-12-29"))),
				() -> assertFalse(Validator.valDateMin(LocalDate.parse("2001-12-29"), LocalDate.parse("2023-04-12"))));

	}

	@Test
	void testValDateMax() {

		assertAll(() -> assertTrue(Validator.valDateMax(LocalDate.parse("2023-04-12"), LocalDate.parse("2077-01-01"))),
				() -> assertFalse(Validator.valDateMax(LocalDate.parse("2023-04-12"), LocalDate.parse("2001-12-29"))));

	}

	@Test
	void testEsFechaValida() {

		assertAll(() -> assertTrue(Validator.esFechaValida("2022-04-12")),
				() -> assertTrue(Validator.esFechaValida("2001-12-29")),
				() -> assertTrue(Validator.esFechaValida("2077-01-01")),
				() -> assertFalse(Validator.esFechaValida("12-04-2023")),
				() -> assertFalse(Validator.esFechaValida("2023/04/12")),
				() -> assertFalse(Validator.esFechaValida("2023-04-100")),
				() -> assertFalse(Validator.esFechaValida("2022-100-12")),
				() -> assertFalse(Validator.esFechaValida("100000-04-12")));

	}

	@Test
	void testEsPasswordValida() {
		assertAll(() -> assertTrue(Validator.esPasswordValida("Prueba1234#")),
				() -> assertFalse(Validator.esPasswordValida("prueba")),
				() -> assertFalse(Validator.esPasswordValida("Prueba1234")),
				() -> assertFalse(Validator.esPasswordValida("Prueba.")),
				() -> assertFalse(Validator.esPasswordValida("1234#")),
				() -> assertFalse(Validator.esPasswordValida("PruebasPruebas123456789.")),
				() -> assertFalse(Validator.esPasswordValida("Pr1.")));
	}

}
