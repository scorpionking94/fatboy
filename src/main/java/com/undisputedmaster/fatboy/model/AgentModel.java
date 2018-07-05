package com.undisputedmaster.fatboy.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


/**
 * Created by Swapnil.Khandizod on 05-07-2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgentModel {

    @JsonProperty("email")
    @NotNull
    private String email;

    @JsonProperty("password")
    @NotNull
    private String password;

    @JsonProperty("firstName")
    @NotNull
    private String firstName;

    @JsonProperty("middleName")
    @NotNull
    private String middleName;

    @JsonProperty("lastName")
    @NotNull
    private String lastName;

    @JsonProperty("dateOfBirth")
    @NotNull
    private LocalDate dateOfBirth;

    @JsonProperty("gender")
    @NotNull
    private String gender;

    @JsonProperty("currentAddress")
    @NotNull
    private String currentAddress;

    @JsonProperty("city")
    @NotNull
    private String city;

    @JsonProperty("state")
    @NotNull
    private String state;

    @JsonProperty("country")
    private String country="INDIA";

    @JsonProperty("countryCode")
    private String countryCode="+91";

    @JsonProperty("aadharId")
    @NotNull
    private long aadharId;

    @JsonProperty("panId")
    @NotNull
    private String panId;

    @JsonProperty("contactNumber")
    @NotNull
    private long contactNumber;

    @JsonProperty("paymentProvider")
    @NotNull
    private long paymentProvider;

    @JsonProperty("referredBy")
    @NotNull
    private String referredBy;

    @JsonProperty("balance")
    private double balance=0;

    @JsonProperty("rating")
    private int rating=0;

    @JsonProperty("profileCount")
    private long profileCount=0;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public long getAadharId() {
        return aadharId;
    }

    public void setAadharId(long aadharId) {
        this.aadharId = aadharId;
    }

    public String getPanId() {
        return panId;
    }

    public void setPanId(String panId) {
        this.panId = panId;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public long getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(long paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getProfileCount() {
        return profileCount;
    }

    public void setProfileCount(long profileCount) {
        this.profileCount = profileCount;
    }
}
