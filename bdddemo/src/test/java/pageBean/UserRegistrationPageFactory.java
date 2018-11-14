package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationPageFactory {

	WebDriver driver;
	
	@FindBy(id= "txtUserName")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "txtConfPassword")
	WebElement cpassword;
	
	@FindBy(id = "txtFirstName")
	WebElement fname;
	
	@FindBy(id = "txtLastName")
	WebElement lname;
	
	@FindBy(name = "gender")
	WebElement gender;
	
	@FindBy(id = "DOB")
	WebElement dob;
	
	@FindBy(id = "txtEmail")
	WebElement email;
	
	@FindBy(id = "txtAddress")
	WebElement address;
	
	@FindBy(name = "City")
	WebElement city;
	
	@FindBy(id = "txtPhone")
	WebElement phone;
	
	@FindBy(name = "chkHobbies")
	WebElement hobbies;

	@FindBy(name = "submit")
	WebElement submit;
	
	public WebElement getUsername() {
		return username;
	}


	public void setUsername(String uname) throws Exception {
		username.sendKeys(uname);
		Thread.sleep(3000);
	}
	
	
	public WebElement getPassword() {
		return password;
	}


	public void setPassword(String pass) {
		password.sendKeys(pass);
	}


	public WebElement getCpassword() {
		return cpassword;
	}


	public void setCpassword(String cpass) {
		cpassword.sendKeys(cpass);
	}


	public WebElement getFname() {
		return fname;
	}


	public void setFname(String fn) {
		fname.sendKeys(fn);
	}


	public WebElement getLname() {
		return lname;
	}


	public void setLname(String ln) {
		lname.sendKeys(ln);
	}


	public WebElement getGender() {
		return gender;
	}


	public void setGender(String gen) {
		gender.sendKeys(gen);
	}


	public WebElement getDob() {
		return dob;
	}


	public void setDob(String dateofbirth) {
		dob.sendKeys(dateofbirth);
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(String mail) {
		email.sendKeys(mail);
	}


	public WebElement getAddress() {
		return address;
	}


	public void setAddress(String addr) {
		address.sendKeys(addr);
	}


	public WebElement getCity() {
		return city;
	}


	public void setCity(String cities) {
		city.sendKeys(cities);
	}


	public WebElement getPhone() {
		return phone;
	}


	public void setPhone(String mobile) {
		phone.sendKeys(mobile);
	}


	public WebElement getHobbies() {
		return hobbies;
	}


	public void setHobbies(String hobby) {
		hobbies.sendKeys(hobby);
	}
	
	


	public WebElement getSubmit() {
		return submit;
	}


	public void setSubmit() {
		submit.click();
	}


	public UserRegistrationPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	       PageFactory.initElements(driver, this);
	}
}
