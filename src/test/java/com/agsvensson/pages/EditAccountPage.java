package com.agsvensson.pages;

import com.agsvensson.core.Driver;
import com.agsvensson.maps.EditAccountMap;
import org.openqa.selenium.support.PageFactory;

public class EditAccountPage {

    EditAccountMap editAccountMap;

    public EditAccountPage() {
        editAccountMap = new EditAccountMap();
        PageFactory.initElements(Driver.getDriver(), editAccountMap);
    }

    public void setFirstName(String firstName) {
        Driver.visibilityOf(editAccountMap.inpFirstName);
        editAccountMap.inpFirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        editAccountMap.inpLastName.sendKeys(lastName);
    }

    public void clickBtnSave() {
        editAccountMap.btnSave.click();
    }

}
