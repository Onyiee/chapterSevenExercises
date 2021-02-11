package ChapterSevenExercises.numberSevenPointOneZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionTest {
    SalesCommission salesCommission;

    @BeforeEach
    void setUp() {
        salesCommission = new SalesCommission();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatPayForSalesPeopleCanBeCalculated(){
        salesCommission.setGrossSales(5000);
        salesCommission.setPayForSalesPeople();
        assertEquals(650,salesCommission.getPayForSalesPeople());
    }
}