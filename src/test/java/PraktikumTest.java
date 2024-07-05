import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.RestAssured;
import org.example.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PraktikumTest {

private final String firstParameter;
private final boolean expected;

public PraktikumTest(String firstParameter, boolean expected) {
    this.firstParameter = firstParameter;
    this.expected = expected;
}
@Parameterized.Parameters
    public static Object [][] getAccountData(){
    return new Object[][]{
            {"", false},
            {" ", false},
            {" name", false},
            {"name ", false},
            {"namename", false},
            {"name name", true},
    };
}
@Test
@DisplayName("Проверка требований")
@Description("Тест: можно ли напечатать строку на карте. Например, «Тимоти Шаламе» — можно, а «ТимотейШевроле» — нет.")
public void shouldBeEmbossed() {
    Account account = new Account("Тимоти Шаламе");
    boolean actual;
    actual = account.checkNameToEmboss(firstParameter);
    assertEquals(expected, actual);
}
}
