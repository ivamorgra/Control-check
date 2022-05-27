package acme.testing.any.chirp;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.TestHarness;

public class AnyChirpListAllTest extends TestHarness{
	
	
	
	@ParameterizedTest
	@CsvFileSource(resources = "/any/chirp/chirp.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void positive(final int recordIndex, final String title, final String author, final String creationMoment, final String body, final String email) {
		super.clickOnMenu("Anonymous", "List chirps");

		super.checkListingExists();
		super.sortListing(0, "asc");
		super.checkColumnHasValue(recordIndex, 2, author  );
		super.checkColumnHasValue(recordIndex, 1, title );
		super.checkColumnHasValue(recordIndex, 0, creationMoment);
		super.checkColumnHasValue(recordIndex, 3, body);
		super.checkColumnHasValue(recordIndex, 4, email);
		
		
		super.clickOnListingRecord(recordIndex);
		super.checkFormExists();
		super.checkInputBoxHasValue("title", title);
		super.checkInputBoxHasValue("author", author);
		super.checkInputBoxHasValue("body", body);
		super.checkInputBoxHasValue("email", email);
	}
}
