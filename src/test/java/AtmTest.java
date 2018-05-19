
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldHaveADefaultBalanceOf100() {
		Atm underTest = new Atm(100);
		int check = underTest.getBalance();
		assertEquals(100, check);
	}

	@Test
	public void shouldHaveADefaultBalanceOf200() {
		Atm underTest = new Atm(200);
		int check = underTest.getBalance();
		assertEquals(200, check);
	}

	@Test
	public void shouldHaveADefaultBalanceOf50AfterWithdrawalOf50() {
		Atm underTest = new Atm(100);
		underTest.withdrawl(50);
		int check = underTest.getBalance();
		assertEquals(50, check);
	}

	@Test
	public void shouldHaveABalanceOf100AfterDepositOf50() {
		Atm underTest = new Atm(50);
		underTest.deposit(50);
		int check = underTest.getBalance();
		assertEquals(100, check);
	}

	@Test
	public void shouldAllowAccessWithPin() {
		Atm underTest = new Atm(0);
		boolean check = underTest.allowAccess("1234");
		assertTrue(check);
	}

	@Test
	public void ShouldDenyAccessWithBadPin() {
		Atm underTest = new Atm(0);
		boolean check = underTest.allowAccess("1235");
		assertFalse(check);
	}

	@Test
	public void shouldDenyWithdrawalIfAmountIsGreaterThanBalance() {
		Atm underTest = new Atm(100);
		underTest.withdrawl(101);
		int check = underTest.getBalance();
		assertEquals(100, check);
	}

	@Test
	public void shouldAllowWithdrawalThatAreNotMultiplesOfTen() {
		Atm underTest = new Atm(100);
		underTest.withdrawl(25);
		int check = underTest.getBalance();
		assertEquals(100, check);
	}
	
	@Test 
	public void shouldGetRequiredPin() {
		Atm underTest = new Atm(0); 
		String check = underTest.getRequiredPin(); 
		assertEquals("1234", check);
	}
}