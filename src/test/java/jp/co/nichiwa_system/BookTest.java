package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {

	@Test
	public void testNull() {
		Database db = new Database();
		Book book = db.findBook("バグがない");
		assertEquals(-1, book.getPrice());
	}
}
