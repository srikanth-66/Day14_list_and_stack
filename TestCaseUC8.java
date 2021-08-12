package TestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Classes.UC8;

class TestCaseUC8 {

	@Test
	void passTest() {
		UC8 uc=new UC8();
		int result=uc.insertAfter(40);
		System.out.println(result);
		assertEquals(1, result);
	}

}
