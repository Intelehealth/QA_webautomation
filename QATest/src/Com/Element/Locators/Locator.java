package Com.Element.Locators;

public class Locator {

	//public static final String Username = "/html/body/app-root/app-main/app-login-page/div/div/div[1]/div[3]/form/div/div[1]/div[2]/div/input";
	public static final String Username = "/html/body/app-root/app-main/app-login-page/div/div/div[1]/div[3]/form/div/div[1]/div[2]/div/input";
	public static final String Password = "/html/body/app-root/app-main/app-login-page/div/div/div[1]/div[3]/form/div/div[1]/div[3]/div/div/input";

	public static final String Login_submit = "/html/body/app-root/app-main/app-login-page/div/div/div[1]/div[3]/form/div/div[2]/div/button";
	public static final String PatientId = "//*[@id=\"search-patient\"]/div/div/input";
	public static final String SearchPatient = "//*[@id=\"search-patient\"]/div/button/i";
	public static final String ViewPatient = "//*[@id=\"mat-dialog-0\"]/app-find-patient/mat-dialog-content/div/div/div/button";
	public static final String ScrolldownTillLast = "window.scrollTo(0,document.body.scrollHeight)";
	public static final String StartVisit = "start-visit";
	public static final String Patient_interaction = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[1]/app-patient-interaction/form/div[1]/mat-radio-group/mat-radio-button[1]/label/div[1]/div[1]";
	public static final String Patient_interaction_Submit = "//*[@id=\"patient-interaction\"]/button/span";
	public static final String Type_diagnosis = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[2]/app-diagnosis/div/form/mat-form-field/div/div[1]/div/input";
	public static final String Diagnosis_Name = "mat-option-text";
	public static final String Diagnosis_Radio1 = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[2]/app-diagnosis/div/form/div/section[1]/mat-radio-group/mat-radio-button[1]/label/div[1]/div[1]";
    public static final String Diagnosis_Radio2 = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[2]/app-diagnosis/div/form/div/section[2]/mat-radio-group/mat-radio-button[2]/label/div[1]/div[1]";
    public static final String Diagnosis_Submit = "//*[@id=\"diagnosis-submit\"]/span";
    public static final String Medication_Name = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/mat-form-field/div/div[1]/div/input";
    
    public static final String Strength = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[1]/div[1]/input";
    public static final String Units_Mg = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[1]/div[2]/input";
    public static final String Medication_Amount = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[1]/div[3]/input";
    public static final String Units_Tab = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[1]/div[4]/input";
    public static final String Medication_Frequency = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[1]/div[5]/input";
    public static final String Medication_Duration = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[3]/div[1]/div/input";
    public static final String Units_Days = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/div[3]/div[2]/div/input";
    public static final String Medication_Submit = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[3]/app-prescribed-medication/div/form/div/button/span";
    public static final String Prescribed_test = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[4]/app-prescribed-test/div/form/mat-form-field/div/div[1]/div/input";
    public static final String Prescribed_testname = "ng-star-inserted";
    public static final String Add_test = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[4]/app-prescribed-test/div/form/button/span";
    public static final String Followup_date = "//*[@id=\"followup-button\"]/p/mat-form-field/div/div[1]/div[2]/mat-datepicker-toggle/button";
    public static final String Year_range = "//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]/span";
    public static final String Select_year = "ng-star-inserted";
    public static final String Select_month = "ng-star-inserted";
    public static final String Select_day = "ng-star-inserted";
    public static final String Followup_submit = "/html/body/app-root/app-main/app-visit-summary/div[2]/div/mat-card[7]/app-follow-up/div/form/div/button";
    public static final String Sign_submit = "//*[@id=\"sign-button\"]/span";
    public static final String Accept_message = "ok-button";
    public static final String Logout = "logout-link";
    public static final String HomeDisplay = "/html/body/app-root/app-main/app-navbar/div/nav/div/ul/li[1]/a";
    public static final String ExpectedUrl = "https://hstraining.uninhibited.org.in/intelehealth/index.html#/home";
    public static final String ExpectedUrlAfterLogout = "https://hstraining.uninhibited.org.in/intelehealth/index.html#/";
}
