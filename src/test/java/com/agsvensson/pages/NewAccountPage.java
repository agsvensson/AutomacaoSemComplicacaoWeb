package com.agsvensson.pages;

import com.agsvensson.core.Driver;
import com.agsvensson.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage() {
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount() {
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }


}
