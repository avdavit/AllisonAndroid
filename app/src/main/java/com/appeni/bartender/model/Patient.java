
package com.appeni.bartender.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Patient {


    private Order[] orders;
    private boolean isOrderOpen = false;
    private boolean isLoading = true;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("account_id")
    @Expose
    private String accountId;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("group_id")
    @Expose
    private Object groupId;
    @SerializedName("marketing_id")
    @Expose
    private Object marketingId;
    @SerializedName("website_id")
    @Expose
    private String websiteId;
    @SerializedName("parent_id")
    @Expose
    private Object parentId;
    @SerializedName("facebook_id")
    @Expose
    private Object facebookId;
    @SerializedName("twitter_id")
    @Expose
    private Object twitterId;
    @SerializedName("google_id")
    @Expose
    private Object googleId;
    @SerializedName("commission_id")
    @Expose
    private Object commissionId;
    @SerializedName("badges")
    @Expose
    private Object badges;
    @SerializedName("tokens")
    @Expose
    private Object tokens;
    @SerializedName("login_token")
    @Expose
    private Object loginToken;
    @SerializedName("shareable")
    @Expose
    private String shareable;
    @SerializedName("source")
    @Expose
    private Object source;
    @SerializedName("admin")
    @Expose
    private String admin;
    @SerializedName("setup")
    @Expose
    private String setup;
    @SerializedName("profile_picture")
    @Expose
    private Object profilePicture;
    @SerializedName("profile_source")
    @Expose
    private String profileSource;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("type_sub")
    @Expose
    private Object typeSub;
    @SerializedName("data")
    @Expose
    private PatientData patientData;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("employee")
    @Expose
    private String employee;
    @SerializedName("company_name")
    @Expose
    private Object companyName;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("middle_name")
    @Expose
    private Object middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("hashed_password")
    @Expose
    private Object hashedPassword;
    @SerializedName("reset_key")
    @Expose
    private Object resetKey;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("phone2")
    @Expose
    private String phone2;
    @SerializedName("phone3")
    @Expose
    private Object phone3;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("address2")
    @Expose
    private Object address2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("store_zip")
    @Expose
    private Object storeZip;
    @SerializedName("country")
    @Expose
    private Object country;
    @SerializedName("birthdate")
    @Expose
    private String birthdate;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("dob_m")
    @Expose
    private Object dobM;
    @SerializedName("dob_d")
    @Expose
    private Object dobD;
    @SerializedName("dob_y")
    @Expose
    private Object dobY;
    @SerializedName("bio")
    @Expose
    private Object bio;
    @SerializedName("newsletter")
    @Expose
    private Object newsletter;
    @SerializedName("license")
    @Expose
    private Object license;
    @SerializedName("facebook")
    @Expose
    private Object facebook;
    @SerializedName("twitter")
    @Expose
    private Object twitter;
    @SerializedName("linkedin")
    @Expose
    private Object linkedin;
    @SerializedName("instagram")
    @Expose
    private Object instagram;
    @SerializedName("google_plus")
    @Expose
    private Object googlePlus;
    @SerializedName("pinterest")
    @Expose
    private Object pinterest;
    @SerializedName("snapchat")
    @Expose
    private Object snapchat;
    @SerializedName("yelp")
    @Expose
    private Object yelp;
    @SerializedName("last_active")
    @Expose
    private Object lastActive;
    @SerializedName("last_login")
    @Expose
    private Object lastLogin;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("referred_by")
    @Expose
    private Object referredBy;
    @SerializedName("ssn")
    @Expose
    private Object ssn;
    @SerializedName("dln")
    @Expose
    private Object dln;
    @SerializedName("dln_exp")
    @Expose
    private Object dlnExp;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("wage")
    @Expose
    private Object wage;
    @SerializedName("notes")
    @Expose
    private Object notes;
    @SerializedName("acceptTerms")
    @Expose
    private Object acceptTerms;
    @SerializedName("current_location")
    @Expose
    private Object currentLocation;
    @SerializedName("lat")
    @Expose
    private Object lat;
    @SerializedName("lng")
    @Expose
    private Object lng;
    @SerializedName("rotation")
    @Expose
    private String rotation;
    @SerializedName("online")
    @Expose
    private String online;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("invitation")
    @Expose
    private Object invitation;
    @SerializedName("session_id")
    @Expose
    private Object sessionId;
    @SerializedName("ip_address")
    @Expose
    private Object ipAddress;
    @SerializedName("user_agent")
    @Expose
    private Object userAgent;
    @SerializedName("session_url")
    @Expose
    private Object sessionUrl;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("suspended")
    @Expose
    private String suspended;
    @SerializedName("status")
    @Expose
    private String status;

    public boolean getIsOrderOpen() {
        return isOrderOpen;
    }

    public void setIsOrderOpen(boolean isOrderOpen) {
        this.isOrderOpen = isOrderOpen;
    }

    public boolean getIsLoading() {
        return isLoading;
    }

    public void setIsLoading(boolean isLoading) {
        this.isLoading = isLoading;
    }

    public Order[] getOrders() {
        if (orders == null) orders = new Order[0];
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getMarketingId() {
        return marketingId;
    }

    public void setMarketingId(Object marketingId) {
        this.marketingId = marketingId;
    }

    public String getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Object getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(Object facebookId) {
        this.facebookId = facebookId;
    }

    public Object getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(Object twitterId) {
        this.twitterId = twitterId;
    }

    public Object getGoogleId() {
        return googleId;
    }

    public void setGoogleId(Object googleId) {
        this.googleId = googleId;
    }

    public Object getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Object commissionId) {
        this.commissionId = commissionId;
    }

    public Object getBadges() {
        return badges;
    }

    public void setBadges(Object badges) {
        this.badges = badges;
    }

    public Object getTokens() {
        return tokens;
    }

    public void setTokens(Object tokens) {
        this.tokens = tokens;
    }

    public Object getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(Object loginToken) {
        this.loginToken = loginToken;
    }

    public String getShareable() {
        return shareable;
    }

    public void setShareable(String shareable) {
        this.shareable = shareable;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public Object getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Object profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getProfileSource() {
        return profileSource;
    }

    public void setProfileSource(String profileSource) {
        this.profileSource = profileSource;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getTypeSub() {
        return typeSub;
    }

    public void setTypeSub(Object typeSub) {
        this.typeSub = typeSub;
    }

    public PatientData getPatientData() {
        return patientData;
    }

    public void setPatientData(PatientData data) {
        this.patientData = patientData;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Object getCompanyName() {
        return companyName;
    }

    public void setCompanyName(Object companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(Object hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public Object getResetKey() {
        return resetKey;
    }

    public void setResetKey(Object resetKey) {
        this.resetKey = resetKey;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Object getPhone3() {
        return phone3;
    }

    public void setPhone3(Object phone3) {
        this.phone3 = phone3;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Object getStoreZip() {
        return storeZip;
    }

    public void setStoreZip(Object storeZip) {
        this.storeZip = storeZip;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getDobM() {
        return dobM;
    }

    public void setDobM(Object dobM) {
        this.dobM = dobM;
    }

    public Object getDobD() {
        return dobD;
    }

    public void setDobD(Object dobD) {
        this.dobD = dobD;
    }

    public Object getDobY() {
        return dobY;
    }

    public void setDobY(Object dobY) {
        this.dobY = dobY;
    }

    public Object getBio() {
        return bio;
    }

    public void setBio(Object bio) {
        this.bio = bio;
    }

    public Object getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Object newsletter) {
        this.newsletter = newsletter;
    }

    public Object getLicense() {
        return license;
    }

    public void setLicense(Object license) {
        this.license = license;
    }

    public Object getFacebook() {
        return facebook;
    }

    public void setFacebook(Object facebook) {
        this.facebook = facebook;
    }

    public Object getTwitter() {
        return twitter;
    }

    public void setTwitter(Object twitter) {
        this.twitter = twitter;
    }

    public Object getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(Object linkedin) {
        this.linkedin = linkedin;
    }

    public Object getInstagram() {
        return instagram;
    }

    public void setInstagram(Object instagram) {
        this.instagram = instagram;
    }

    public Object getGooglePlus() {
        return googlePlus;
    }

    public void setGooglePlus(Object googlePlus) {
        this.googlePlus = googlePlus;
    }

    public Object getPinterest() {
        return pinterest;
    }

    public void setPinterest(Object pinterest) {
        this.pinterest = pinterest;
    }

    public Object getSnapchat() {
        return snapchat;
    }

    public void setSnapchat(Object snapchat) {
        this.snapchat = snapchat;
    }

    public Object getYelp() {
        return yelp;
    }

    public void setYelp(Object yelp) {
        this.yelp = yelp;
    }

    public Object getLastActive() {
        return lastActive;
    }

    public void setLastActive(Object lastActive) {
        this.lastActive = lastActive;
    }

    public Object getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Object lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(Object referredBy) {
        this.referredBy = referredBy;
    }

    public Object getSsn() {
        return ssn;
    }

    public void setSsn(Object ssn) {
        this.ssn = ssn;
    }

    public Object getDln() {
        return dln;
    }

    public void setDln(Object dln) {
        this.dln = dln;
    }

    public Object getDlnExp() {
        return dlnExp;
    }

    public void setDlnExp(Object dlnExp) {
        this.dlnExp = dlnExp;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public Object getWage() {
        return wage;
    }

    public void setWage(Object wage) {
        this.wage = wage;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public Object getAcceptTerms() {
        return acceptTerms;
    }

    public void setAcceptTerms(Object acceptTerms) {
        this.acceptTerms = acceptTerms;
    }

    public Object getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Object currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLng() {
        return lng;
    }

    public void setLng(Object lng) {
        this.lng = lng;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Object getInvitation() {
        return invitation;
    }

    public void setInvitation(Object invitation) {
        this.invitation = invitation;
    }

    public Object getSessionId() {
        return sessionId;
    }

    public void setSessionId(Object sessionId) {
        this.sessionId = sessionId;
    }

    public Object getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Object ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Object getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(Object userAgent) {
        this.userAgent = userAgent;
    }

    public Object getSessionUrl() {
        return sessionUrl;
    }

    public void setSessionUrl(Object sessionUrl) {
        this.sessionUrl = sessionUrl;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getSuspended() {
        return suspended;
    }

    public void setSuspended(String suspended) {
        this.suspended = suspended;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
