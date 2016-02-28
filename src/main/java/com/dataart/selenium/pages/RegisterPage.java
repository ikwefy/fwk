package com.dataart.selenium.pages;

/**
* Created by kdrobyazgin on 8/18/2015.
*/

import com.dataart.selenium.framework.BasePage;
import com.dataart.selenium.models.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = RNAME_TEXT_FIELD_XPATH)
    WebElement nameTextField;
    @FindBy(xpath = RFIRSTNAME_TEXT_FIELD_XPATH)
    WebElement firstNameTextField;
    @FindBy(xpath = RLASTNAME_TEXT_FIELD_XPATH)
    WebElement lastNameTextField;
    @FindBy(xpath = RPASSWORD_TEXT_FIELD_XPATH)
    WebElement passwordTextField;
    @FindBy(xpath = RCONFIRMPASSWORD_TEXT_FIELD_XPATH)
    WebElement confirmPasswordTextField;
    @FindBy(xpath = RROLE_SELECT_XPATH)
    WebElement roleDropDown;
    @FindBy(xpath = REGISTER_BUTTON_XPATH)
    WebElement registerButton;


    public void registerAs (User newuser) {
        nameTextField.clear();
        firstNameTextField.clear();
        lastNameTextField.clear();
        passwordTextField.clear();
        confirmPasswordTextField.clear();
        nameTextField.sendKeys(newuser.getUsername());
        firstNameTextField.sendKeys(newuser.getFname());
        lastNameTextField.sendKeys(newuser.getLname());
        passwordTextField.sendKeys(newuser.getPassword());
        confirmPasswordTextField.sendKeys(newuser.getPassword());
//        return initPage(HomePage.class);
        roleDropDown.click();
        registerButton.click();
    }

    public static final String RNAME_TEXT_FIELD_XPATH = "//div[1]/form/table/tbody/tr[1]/td[2]/input";
    public static final String RFIRSTNAME_TEXT_FIELD_XPATH = "//div[1]/form/table/tbody/tr[2]/td[2]/input";
    public static final String RLASTNAME_TEXT_FIELD_XPATH = "//div[1]/form/table/tbody/tr[3]/td[2]/input";
    public static final String RPASSWORD_TEXT_FIELD_XPATH = "//div[1]/form/table/tbody/tr[4]/td[2]/input";
    public static final String RCONFIRMPASSWORD_TEXT_FIELD_XPATH = "//div[1]/form/table/tbody/tr[5]/td[2]/input";
    public static final String RROLE_SELECT_XPATH = "/html/body/div/form/table/tbody/tr[6]/td[2]/select/option[1]";
    public static final String REGISTER_BUTTON_XPATH = "//div[1]/form/input";
}
