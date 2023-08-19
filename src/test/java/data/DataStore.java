package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataStore {

    @DataProvider(name = "SingleColumnValue")
    public Object[][] storeSingleColumnValue() {
        return new Object[][] {
                {"Rifat"},
                {"Farid"},
                {"Ashraf"}
        };
    }

    @Test(dataProvider = "SingleColumnValue")
    public void run(String name) {
        System.out.println("Name is: " + name);
    }

    @DataProvider(name = "MultipleColumnValues")
    public Object[][] storeMultipleColumnValues() {
        return new Object[][] {
                {"Rifat", "Florida", 33018},
                {"Farid", "New York", 12457},
                {"Ashraf", "Bangladesh", 32205}
        };
    }

    @Test(dataProvider = "MultipleColumnValues")
    public void run(String name, String state, int zipCode) {
        System.out.println("Name is: " + name);
        System.out.println("State is: " + state);
        System.out.println("Zip code is: " + zipCode);
    }

    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprRates() {
        return new Object[][] {
                {"200000","15000","3","3.130%"}
        };
    }
}
