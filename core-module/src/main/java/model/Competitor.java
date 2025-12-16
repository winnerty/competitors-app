package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Competitor {

    @JsonProperty("family_name")
    private String familyName;

    @JsonProperty("middle_name")
    private String middleName;

    @JsonProperty("given_name")
    private String givenName;

    @JsonProperty("family_name_local")
    private String familyNameLocal;

    @JsonProperty("middle_name_local")
    private String middleNameLocal;

    @JsonProperty("given_name_local")
    private String givenNameLocal;

    @JsonProperty("short_name")
    private String shortName;

    private String gender;
    private String folder;
    private String name;

    @JsonProperty("picture_filename")
    private String pictureFilename;

    private String ftechique; // Typo is in the JSON source, so we match it.

    private String side;
    private String coach;

    @JsonProperty("best_result")
    private String bestResult;

    private String height;

    @JsonProperty("birth_date")
    private String birthDate;

    private String country;

    @JsonProperty("id_country")
    private String idCountry;

    @JsonProperty("country_short")
    private String countryShort;

    @JsonProperty("file_flag")
    private String fileFlag;

    private String club;
    private String belt;

    @JsonProperty("youtube_links")
    private String youtubeLinks;

    private String status;
    private String archived;
    private List<String> categories;

    @JsonProperty("dob_year")
    private String dobYear;

    private String age;

    @JsonProperty("death_age")
    private String deathAge;

    @JsonProperty("personal_picture")
    private String personalPicture;

    public Competitor() {
        // Default constructor for Jackson
    }

    // Getters
    public String getFamilyName() {
        return familyName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getFamilyNameLocal() {
        return familyNameLocal;
    }

    public String getMiddleNameLocal() {
        return middleNameLocal;
    }

    public String getGivenNameLocal() {
        return givenNameLocal;
    }

    public String getShortName() {
        return shortName;
    }

    public String getGender() {
        return gender;
    }

    public String getFolder() {
        return folder;
    }

    public String getName() {
        return name;
    }

    public String getPictureFilename() {
        return pictureFilename;
    }

    public String getFtechique() {
        return ftechique;
    }

    public String getSide() {
        return side;
    }

    public String getCoach() {
        return coach;
    }

    public String getBestResult() {
        return bestResult;
    }

    public String getHeight() {
        return height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCountry() {
        return country;
    }

    public String getIdCountry() {
        return idCountry;
    }

    public String getCountryShort() {
        return countryShort;
    }

    public String getFileFlag() {
        return fileFlag;
    }

    public String getClub() {
        return club;
    }

    public String getBelt() {
        return belt;
    }

    public String getYoutubeLinks() {
        return youtubeLinks;
    }

    public String getStatus() {
        return status;
    }

    public String getArchived() {
        return archived;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getDobYear() {
        return dobYear;
    }

    public String getAge() {
        return age;
    }

    public String getDeathAge() {
        return deathAge;
    }

    public String getPersonalPicture() {
        return personalPicture;
    }

    // Setters
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setFamilyNameLocal(String familyNameLocal) {
        this.familyNameLocal = familyNameLocal;
    }

    public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }

    public void setGivenNameLocal(String givenNameLocal) {
        this.givenNameLocal = givenNameLocal;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPictureFilename(String pictureFilename) {
        this.pictureFilename = pictureFilename;
    }

    public void setFtechique(String ftechique) {
        this.ftechique = ftechique;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setBestResult(String bestResult) {
        this.bestResult = bestResult;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIdCountry(String idCountry) {
        this.idCountry = idCountry;
    }

    public void setCountryShort(String countryShort) {
        this.countryShort = countryShort;
    }

    public void setFileFlag(String fileFlag) {
        this.fileFlag = fileFlag;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setBelt(String belt) {
        this.belt = belt;
    }

    public void setYoutubeLinks(String youtubeLinks) {
        this.youtubeLinks = youtubeLinks;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setArchived(String archived) {
        this.archived = archived;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public void setDobYear(String dobYear) {
        this.dobYear = dobYear;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDeathAge(String deathAge) {
        this.deathAge = deathAge;
    }

    public void setPersonalPicture(String personalPicture) {
        this.personalPicture = personalPicture;
    }

    @Override
    public String toString() {
        return "Competitor{" +
                "familyName='" + familyName + '\'' +
                ", givenName='" + givenName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}