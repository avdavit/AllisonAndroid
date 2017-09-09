
package com.appeni.bartender.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("account_id_default")
    @Expose
    private Object accountIdDefault;
    @SerializedName("admin")
    @Expose
    private String admin;
    @SerializedName("sub_admin")
    @Expose
    private String subAdmin;
    @SerializedName("default_module_id")
    @Expose
    private Object defaultModuleId;
    @SerializedName("default_list_view")
    @Expose
    private String defaultListView;
    @SerializedName("setup")
    @Expose
    private String setup;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("commission_id")
    @Expose
    private Object commissionId;
    @SerializedName("accounts_plan_id")
    @Expose
    private Object accountsPlanId;
    @SerializedName("admin_theme")
    @Expose
    private String adminTheme;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("lastname")
    @Expose
    private String lastname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("hashed_password")
    @Expose
    private String hashedPassword;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("userpic")
    @Expose
    private String userpic;
    @SerializedName("profile_cover")
    @Expose
    private Object profileCover;
    @SerializedName("access")
    @Expose
    private String access;
    @SerializedName("access_crm")
    @Expose
    private String accessCrm;
    @SerializedName("access_website")
    @Expose
    private String accessWebsite;
    @SerializedName("site_access")
    @Expose
    private Object siteAccess;
    @SerializedName("permission_id")
    @Expose
    private String permissionId;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("last_active")
    @Expose
    private String lastActive;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("status")
    @Expose
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getAccountIdDefault() {
        return accountIdDefault;
    }

    public void setAccountIdDefault(Object accountIdDefault) {
        this.accountIdDefault = accountIdDefault;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getSubAdmin() {
        return subAdmin;
    }

    public void setSubAdmin(String subAdmin) {
        this.subAdmin = subAdmin;
    }

    public Object getDefaultModuleId() {
        return defaultModuleId;
    }

    public void setDefaultModuleId(Object defaultModuleId) {
        this.defaultModuleId = defaultModuleId;
    }

    public String getDefaultListView() {
        return defaultListView;
    }

    public void setDefaultListView(String defaultListView) {
        this.defaultListView = defaultListView;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Object commissionId) {
        this.commissionId = commissionId;
    }

    public Object getAccountsPlanId() {
        return accountsPlanId;
    }

    public void setAccountsPlanId(Object accountsPlanId) {
        this.accountsPlanId = accountsPlanId;
    }

    public String getAdminTheme() {
        return adminTheme;
    }

    public void setAdminTheme(String adminTheme) {
        this.adminTheme = adminTheme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public Object getProfileCover() {
        return profileCover;
    }

    public void setProfileCover(Object profileCover) {
        this.profileCover = profileCover;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccessCrm() {
        return accessCrm;
    }

    public void setAccessCrm(String accessCrm) {
        this.accessCrm = accessCrm;
    }

    public String getAccessWebsite() {
        return accessWebsite;
    }

    public void setAccessWebsite(String accessWebsite) {
        this.accessWebsite = accessWebsite;
    }

    public Object getSiteAccess() {
        return siteAccess;
    }

    public void setSiteAccess(Object siteAccess) {
        this.siteAccess = siteAccess;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastActive() {
        return lastActive;
    }

    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
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
