package i.b.v;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ef extends com.google.v.du<ef, eb> implements gh {
    public static final int ADDRESS_DETAILS_FIELD_NUMBER = 160;
    public static final int ADDRESS_FIELD_NUMBER = 118;
    public static final int AD_KEYWORDS_FIELD_NUMBER = 153;
    public static final int AD_LOCKED_FIELD_NUMBER = 151;
    public static final int ALIASES_FIELD_NUMBER = 107;
    public static final int APPROVED_FIELD_NUMBER = 146;
    public static final int AREA_FIELD_NUMBER = 131;
    public static final int BOOKING_OFFERS_FIELD_NUMBER = 175;
    public static final int BRAND_FIELD_NUMBER = 125;
    public static final int BRAND_ID_FIELD_NUMBER = 165;
    public static final int CATEGORIES_FIELD_NUMBER = 103;
    public static final int CHANGED_PRODUCTS_FIELD_NUMBER = 139;
    public static final int CHANGE_CANDIDATES_FIELD_NUMBER = 140;
    public static final int CHILDREN_FIELD_NUMBER = 136;
    public static final int CITYID_FIELD_NUMBER = 126;
    public static final int CITY_FIELD_NUMBER = 115;
    public static final int COUNTRY_FIELD_NUMBER = 117;
    public static final int COUNTRY_ID_FIELD_NUMBER = 156;
    public static final int CREATED_BY_FIELD_NUMBER = 142;
    public static final int CREATED_BY_INFO_FIELD_NUMBER = 158;
    public static final int CREATION_DATE_FIELD_NUMBER = 141;
    public static final int CRISIS_LOCATION_ATTRIBUTES_FIELD_NUMBER = 180;
    public static final int CURRENCY_FIELD_NUMBER = 149;
    private static final ef DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 129;
    public static final int DESCRIPTION_FIELD_NUMBER = 106;
    public static final int EMAIL_FIELD_NUMBER = 122;
    public static final int EMERGENCY_SHELTER_ATTRIBUTES_FIELD_NUMBER = 167;
    public static final int ENGLISH_NAME_FIELD_NUMBER = 105;
    public static final int ENTRY_EXIT_POINTS_FIELD_NUMBER = 135;
    public static final int ENTRY_POINT_ON_STREET_FIELD_NUMBER = 168;
    public static final int EV_CHARGING_VENUE_FIELD_NUMBER = 173;
    public static final int EXTERNAL_PROVIDERS_FIELD_NUMBER = 130;
    public static final int FAX_FIELD_NUMBER = 121;
    public static final int FORMATTED_NAME_FIELD_NUMBER = 163;
    public static final int GOOGLEPLACEATTRIBUTES_FIELD_NUMBER = 174;
    public static final int HAS_MORE_DATA_FIELD_NUMBER = 162;
    public static final int HAS_PENDING_UPDATE_REQUESTS_BY_USER_FIELD_NUMBER = 157;
    public static final int HOURS_FIELD_NUMBER = 132;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 113;
    public static final int IMAGES_FIELD_NUMBER = 133;
    public static final int INTERNAL_VENUE_ID_FIELD_NUMBER = 102;
    public static final int IS_NULL_FIELD_NUMBER = 166;
    public static final int LAST_UPDATED_BY_INFO_FIELD_NUMBER = 159;
    public static final int LAST_UPDATE_BY_FIELD_NUMBER = 144;
    public static final int LAST_UPDATE_DATE_FIELD_NUMBER = 143;
    public static final int LOCATION_FIELD_NUMBER = 109;
    public static final int LOCK_LEVEL_FIELD_NUMBER = 145;
    public static final int MERGED_FROM_FIELD_NUMBER = 171;
    public static final int MERGED_TO_FIELD_NUMBER = 170;
    public static final int NAME_FIELD_NUMBER = 104;
    public static final int NATIVE_CATEGORIES_FIELD_NUMBER = 161;
    public static final int NO_PREVIEW_FIELD_NUMBER = 155;
    public static final int ORIGINAL_PRODUCTS_FIELD_NUMBER = 138;
    public static final int PARENT_FIELD_NUMBER = 137;
    public static final int PARKING_FIELD_NUMBER = 134;
    public static final int PARKING_LOT_ATTRIBUTES_FIELD_NUMBER = 164;
    private static volatile com.google.v.fo<ef> PARSER = null;
    public static final int PHONE_FIELD_NUMBER = 120;
    public static final int POLYGON_FIELD_NUMBER = 111;
    public static final int PRICETYPE_FIELD_NUMBER = 112;
    public static final int PRODUCT_FIELD_NUMBER = 150;
    public static final int PROVIDER_FIELD_NUMBER = 101;
    public static final int PROVIDER_ID_FIELD_NUMBER = 100;
    public static final int RESIDENTIAL_FIELD_NUMBER = 147;
    public static final int SECONDARY_HOURS_FIELD_NUMBER = 177;
    public static final int SEGMENT_ID_FIELD_NUMBER = 128;
    public static final int SERVICES_FIELD_NUMBER = 110;
    public static final int STATE_FIELD_NUMBER = 116;
    public static final int STREET_FIELD_NUMBER = 114;
    public static final int STREET_ID_FIELD_NUMBER = 127;
    public static final int TAKEOVER_INFO_FIELD_NUMBER = 178;
    public static final int TIMEZONE_FIELD_NUMBER = 176;
    public static final int TRAFFIC_EVENT_ID_FIELD_NUMBER = 181;
    public static final int TWITTER_FIELD_NUMBER = 123;
    public static final int UNLISTED_FIELD_NUMBER = 148;
    public static final int URL_DISPLAY_NAME_FIELD_NUMBER = 154;
    public static final int URL_FIELD_NUMBER = 124;
    public static final int VENUE_ID_FIELD_NUMBER = 152;
    public static final int ZIP_FIELD_NUMBER = 119;
    private boolean adLocked_;
    private boolean approved_;
    private double area_;
    private int bitField0_;
    private int bitField1_;
    private long cityId_;
    private long countryId_;
    private dx createdByInfo_;
    private long createdBy_;
    private long creationDate_;
    private x crisisLocationAttributes_;
    private boolean deleted_;
    private bf emergencyShelterAttributes_;
    private boolean entryPointOnStreet_;
    private bd evChargingVenue_;
    private cc googlePlaceAttributes_;
    private boolean hasMoreData_;
    private boolean hasPendingUpdateRequestsByUser_;
    private fz internalVenueId_;
    private boolean isNull_;
    private long lastUpdateDate_;
    private dx lastUpdatedByInfo_;
    private u location_;
    private int lockLevel_;
    private fz mergedTo_;
    private boolean noPreview_;
    private cw parkingLotAttributes_;
    private boolean residential_;
    private long segmentId_;
    private long streetId_;
    private du takeoverInfo_;
    private boolean unlisted_;
    private byte memoizedIsInitialized = 2;
    private String providerId_ = "";
    private String provider_ = "";
    private com.google.v.eo<String> categories_ = emptyProtobufList();
    private com.google.v.eo<String> nativeCategories_ = emptyProtobufList();
    private String name_ = "";
    private String englishName_ = "";
    private String description_ = "";
    private com.google.v.eo<String> aliases_ = emptyProtobufList();
    private com.google.v.eo<String> services_ = emptyProtobufList();
    private com.google.v.eo<u> polygon_ = emptyProtobufList();
    private String priceType_ = "";
    private String houseNumber_ = "";
    private String street_ = "";
    private String city_ = "";
    private String state_ = "";
    private String country_ = "";
    private String address_ = "";
    private String zip_ = "";
    private String addressDetails_ = "";
    private String phone_ = "";
    private String fax_ = "";
    private String email_ = "";
    private String twitter_ = "";
    private String url_ = "";
    private String brand_ = "";
    private com.google.v.eo<bo> externalProviders_ = emptyProtobufList();
    private com.google.v.eo<ch> hours_ = emptyProtobufList();
    private com.google.v.eo<ce> images_ = emptyProtobufList();
    private com.google.v.eo<ck> parking_ = emptyProtobufList();
    private com.google.v.eo<bi> entryExitPoints_ = emptyProtobufList();
    private com.google.v.eo<String> children_ = emptyProtobufList();
    private String parent_ = "";
    private com.google.v.eo<de> originalProducts_ = emptyProtobufList();
    private com.google.v.eo<r> changedProducts_ = emptyProtobufList();
    private com.google.v.eo<l> changeCandidates_ = emptyProtobufList();
    private com.google.v.en lastUpdateBy_ = emptyLongList();
    private String currency_ = "";
    private com.google.v.eo<cz> product_ = emptyProtobufList();
    private String venueId_ = "";
    private com.google.v.eo<String> adKeywords_ = emptyProtobufList();
    private String urlDisplayName_ = "";
    private String formattedName_ = "";
    private String brandId_ = "";
    private com.google.v.eo<fz> mergedFrom_ = emptyProtobufList();
    private com.google.v.eo<i> bookingOffers_ = emptyProtobufList();
    private String timezone_ = "";
    private com.google.v.eo<dl> secondaryHours_ = emptyProtobufList();
    private String trafficEventId_ = "";

    static {
        ef efVar = new ef();
        DEFAULT_INSTANCE = efVar;
        com.google.v.du.registerDefaultInstance(ef.class, efVar);
    }

    private ef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdKeywords(String str) {
        Objects.requireNonNull(str);
        ensureAdKeywordsIsMutable();
        this.adKeywords_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdKeywordsBytes(com.google.v.v vVar) {
        ensureAdKeywordsIsMutable();
        this.adKeywords_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliases(String str) {
        Objects.requireNonNull(str);
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliasesBytes(com.google.v.v vVar) {
        ensureAliasesIsMutable();
        this.aliases_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdKeywords(Iterable<String> iterable) {
        ensureAdKeywordsIsMutable();
        com.google.v.c.addAll(iterable, this.adKeywords_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        com.google.v.c.addAll(iterable, this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBookingOffers(Iterable<? extends i> iterable) {
        ensureBookingOffersIsMutable();
        com.google.v.c.addAll(iterable, this.bookingOffers_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategories(Iterable<String> iterable) {
        ensureCategoriesIsMutable();
        com.google.v.c.addAll(iterable, this.categories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChangeCandidates(Iterable<? extends l> iterable) {
        ensureChangeCandidatesIsMutable();
        com.google.v.c.addAll(iterable, this.changeCandidates_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChangedProducts(Iterable<? extends r> iterable) {
        ensureChangedProductsIsMutable();
        com.google.v.c.addAll(iterable, this.changedProducts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChildren(Iterable<String> iterable) {
        ensureChildrenIsMutable();
        com.google.v.c.addAll(iterable, this.children_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntryExitPoints(Iterable<? extends bi> iterable) {
        ensureEntryExitPointsIsMutable();
        com.google.v.c.addAll(iterable, this.entryExitPoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExternalProviders(Iterable<? extends bo> iterable) {
        ensureExternalProvidersIsMutable();
        com.google.v.c.addAll(iterable, this.externalProviders_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHours(Iterable<? extends ch> iterable) {
        ensureHoursIsMutable();
        com.google.v.c.addAll(iterable, this.hours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImages(Iterable<? extends ce> iterable) {
        ensureImagesIsMutable();
        com.google.v.c.addAll(iterable, this.images_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLastUpdateBy(Iterable<? extends Long> iterable) {
        ensureLastUpdateByIsMutable();
        com.google.v.c.addAll(iterable, this.lastUpdateBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMergedFrom(Iterable<? extends fz> iterable) {
        ensureMergedFromIsMutable();
        com.google.v.c.addAll(iterable, this.mergedFrom_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNativeCategories(Iterable<String> iterable) {
        ensureNativeCategoriesIsMutable();
        com.google.v.c.addAll(iterable, this.nativeCategories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOriginalProducts(Iterable<? extends de> iterable) {
        ensureOriginalProductsIsMutable();
        com.google.v.c.addAll(iterable, this.originalProducts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParking(Iterable<? extends ck> iterable) {
        ensureParkingIsMutable();
        com.google.v.c.addAll(iterable, this.parking_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolygon(Iterable<? extends u> iterable) {
        ensurePolygonIsMutable();
        com.google.v.c.addAll(iterable, this.polygon_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProduct(Iterable<? extends cz> iterable) {
        ensureProductIsMutable();
        com.google.v.c.addAll(iterable, this.product_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSecondaryHours(Iterable<? extends dl> iterable) {
        ensureSecondaryHoursIsMutable();
        com.google.v.c.addAll(iterable, this.secondaryHours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServices(Iterable<String> iterable) {
        ensureServicesIsMutable();
        com.google.v.c.addAll(iterable, this.services_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBookingOffers(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureBookingOffersIsMutable();
        this.bookingOffers_.add(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategories(String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoriesBytes(com.google.v.v vVar) {
        ensureCategoriesIsMutable();
        this.categories_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangeCandidates(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureChangeCandidatesIsMutable();
        this.changeCandidates_.add(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangedProducts(int i2, r rVar) {
        Objects.requireNonNull(rVar);
        ensureChangedProductsIsMutable();
        this.changedProducts_.add(i2, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildren(String str) {
        Objects.requireNonNull(str);
        ensureChildrenIsMutable();
        this.children_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChildrenBytes(com.google.v.v vVar) {
        ensureChildrenIsMutable();
        this.children_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryExitPoints(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryExitPointsIsMutable();
        this.entryExitPoints_.add(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalProviders(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.add(i2, boVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureHoursIsMutable();
        this.hours_.add(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(int i2, ce ceVar) {
        Objects.requireNonNull(ceVar);
        ensureImagesIsMutable();
        this.images_.add(i2, ceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLastUpdateBy(long j2) {
        ensureLastUpdateByIsMutable();
        this.lastUpdateBy_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMergedFrom(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedFromIsMutable();
        this.mergedFrom_.add(i2, fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativeCategories(String str) {
        Objects.requireNonNull(str);
        ensureNativeCategoriesIsMutable();
        this.nativeCategories_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNativeCategoriesBytes(com.google.v.v vVar) {
        ensureNativeCategoriesIsMutable();
        this.nativeCategories_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOriginalProducts(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureOriginalProductsIsMutable();
        this.originalProducts_.add(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParking(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureParkingIsMutable();
        this.parking_.add(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygon(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensurePolygonIsMutable();
        this.polygon_.add(i2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureProductIsMutable();
        this.product_.add(i2, czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSecondaryHours(int i2, dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureSecondaryHoursIsMutable();
        this.secondaryHours_.add(i2, dlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServices(String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServicesBytes(com.google.v.v vVar) {
        ensureServicesIsMutable();
        this.services_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdKeywords() {
        this.adKeywords_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdLocked() {
        this.bitField1_ &= -17;
        this.adLocked_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.bitField0_ &= -8193;
        this.address_ = getDefaultInstance().getAddress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressDetails() {
        this.bitField0_ &= -32769;
        this.addressDetails_ = getDefaultInstance().getAddressDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApproved() {
        this.bitField1_ &= -2;
        this.approved_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArea() {
        this.bitField0_ &= -67108865;
        this.area_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookingOffers() {
        this.bookingOffers_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.bitField0_ &= -2097153;
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.bitField1_ &= -32769;
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeCandidates() {
        this.changeCandidates_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangedProducts() {
        this.changedProducts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChildren() {
        this.children_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -1025;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityId() {
        this.bitField0_ &= -4194305;
        this.cityId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.bitField0_ &= -4097;
        this.country_ = getDefaultInstance().getCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryId() {
        this.bitField1_ &= -257;
        this.countryId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedBy() {
        this.bitField0_ &= -536870913;
        this.createdBy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedByInfo() {
        this.createdByInfo_ = null;
        this.bitField1_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationDate() {
        this.bitField0_ &= -268435457;
        this.creationDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrisisLocationAttributes() {
        this.crisisLocationAttributes_ = null;
        this.bitField1_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrency() {
        this.bitField1_ &= -9;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleted() {
        this.bitField0_ &= -33554433;
        this.deleted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -33;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.bitField0_ &= -262145;
        this.email_ = getDefaultInstance().getEmail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmergencyShelterAttributes() {
        this.emergencyShelterAttributes_ = null;
        this.bitField1_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnglishName() {
        this.bitField0_ &= -17;
        this.englishName_ = getDefaultInstance().getEnglishName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryExitPoints() {
        this.entryExitPoints_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointOnStreet() {
        this.bitField1_ &= -262145;
        this.entryPointOnStreet_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargingVenue() {
        this.evChargingVenue_ = null;
        this.bitField1_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalProviders() {
        this.externalProviders_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFax() {
        this.bitField0_ &= -131073;
        this.fax_ = getDefaultInstance().getFax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFormattedName() {
        this.bitField1_ &= -8193;
        this.formattedName_ = getDefaultInstance().getFormattedName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGooglePlaceAttributes() {
        this.googlePlaceAttributes_ = null;
        this.bitField1_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMoreData() {
        this.bitField1_ &= -4097;
        this.hasMoreData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasPendingUpdateRequestsByUser() {
        this.bitField1_ &= -513;
        this.hasPendingUpdateRequestsByUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.bitField0_ &= -257;
        this.houseNumber_ = getDefaultInstance().getHouseNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImages() {
        this.images_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternalVenueId() {
        this.internalVenueId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNull() {
        this.bitField1_ &= -65537;
        this.isNull_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdateBy() {
        this.lastUpdateBy_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdateDate() {
        this.bitField0_ &= -1073741825;
        this.lastUpdateDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdatedByInfo() {
        this.lastUpdatedByInfo_ = null;
        this.bitField1_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockLevel() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.lockLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergedFrom() {
        this.mergedFrom_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergedTo() {
        this.mergedTo_ = null;
        this.bitField1_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -9;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeCategories() {
        this.nativeCategories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoPreview() {
        this.bitField1_ &= -129;
        this.noPreview_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalProducts() {
        this.originalProducts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.bitField0_ &= -134217729;
        this.parent_ = getDefaultInstance().getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.parking_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingLotAttributes() {
        this.parkingLotAttributes_ = null;
        this.bitField1_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.bitField0_ &= -65537;
        this.phone_ = getDefaultInstance().getPhone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceType() {
        this.bitField0_ &= -129;
        this.priceType_ = getDefaultInstance().getPriceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProduct() {
        this.product_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -3;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField0_ &= -2;
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.bitField1_ &= -3;
        this.residential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryHours() {
        this.secondaryHours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.bitField0_ &= -16777217;
        this.segmentId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServices() {
        this.services_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.bitField0_ &= -2049;
        this.state_ = getDefaultInstance().getState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -513;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetId() {
        this.bitField0_ &= -8388609;
        this.streetId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeoverInfo() {
        this.takeoverInfo_ = null;
        this.bitField1_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimezone() {
        this.bitField1_ &= -4194305;
        this.timezone_ = getDefaultInstance().getTimezone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficEventId() {
        this.bitField1_ &= -33554433;
        this.trafficEventId_ = getDefaultInstance().getTrafficEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTwitter() {
        this.bitField0_ &= -524289;
        this.twitter_ = getDefaultInstance().getTwitter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlisted() {
        this.bitField1_ &= -5;
        this.unlisted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -1048577;
        this.url_ = getDefaultInstance().getUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlDisplayName() {
        this.bitField1_ &= -65;
        this.urlDisplayName_ = getDefaultInstance().getUrlDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.bitField1_ &= -33;
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZip() {
        this.bitField0_ &= -16385;
        this.zip_ = getDefaultInstance().getZip();
    }

    private void ensureAdKeywordsIsMutable() {
        com.google.v.eo<String> eoVar = this.adKeywords_;
        if (eoVar.c()) {
            return;
        }
        this.adKeywords_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAliasesIsMutable() {
        com.google.v.eo<String> eoVar = this.aliases_;
        if (eoVar.c()) {
            return;
        }
        this.aliases_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureBookingOffersIsMutable() {
        com.google.v.eo<i> eoVar = this.bookingOffers_;
        if (eoVar.c()) {
            return;
        }
        this.bookingOffers_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureCategoriesIsMutable() {
        com.google.v.eo<String> eoVar = this.categories_;
        if (eoVar.c()) {
            return;
        }
        this.categories_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChangeCandidatesIsMutable() {
        com.google.v.eo<l> eoVar = this.changeCandidates_;
        if (eoVar.c()) {
            return;
        }
        this.changeCandidates_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChangedProductsIsMutable() {
        com.google.v.eo<r> eoVar = this.changedProducts_;
        if (eoVar.c()) {
            return;
        }
        this.changedProducts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChildrenIsMutable() {
        com.google.v.eo<String> eoVar = this.children_;
        if (eoVar.c()) {
            return;
        }
        this.children_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEntryExitPointsIsMutable() {
        com.google.v.eo<bi> eoVar = this.entryExitPoints_;
        if (eoVar.c()) {
            return;
        }
        this.entryExitPoints_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureExternalProvidersIsMutable() {
        com.google.v.eo<bo> eoVar = this.externalProviders_;
        if (eoVar.c()) {
            return;
        }
        this.externalProviders_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureHoursIsMutable() {
        com.google.v.eo<ch> eoVar = this.hours_;
        if (eoVar.c()) {
            return;
        }
        this.hours_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureImagesIsMutable() {
        com.google.v.eo<ce> eoVar = this.images_;
        if (eoVar.c()) {
            return;
        }
        this.images_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureLastUpdateByIsMutable() {
        com.google.v.en enVar = this.lastUpdateBy_;
        if (enVar.c()) {
            return;
        }
        this.lastUpdateBy_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureMergedFromIsMutable() {
        com.google.v.eo<fz> eoVar = this.mergedFrom_;
        if (eoVar.c()) {
            return;
        }
        this.mergedFrom_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNativeCategoriesIsMutable() {
        com.google.v.eo<String> eoVar = this.nativeCategories_;
        if (eoVar.c()) {
            return;
        }
        this.nativeCategories_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureOriginalProductsIsMutable() {
        com.google.v.eo<de> eoVar = this.originalProducts_;
        if (eoVar.c()) {
            return;
        }
        this.originalProducts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureParkingIsMutable() {
        com.google.v.eo<ck> eoVar = this.parking_;
        if (eoVar.c()) {
            return;
        }
        this.parking_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePolygonIsMutable() {
        com.google.v.eo<u> eoVar = this.polygon_;
        if (eoVar.c()) {
            return;
        }
        this.polygon_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureProductIsMutable() {
        com.google.v.eo<cz> eoVar = this.product_;
        if (eoVar.c()) {
            return;
        }
        this.product_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSecondaryHoursIsMutable() {
        com.google.v.eo<dl> eoVar = this.secondaryHours_;
        if (eoVar.c()) {
            return;
        }
        this.secondaryHours_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureServicesIsMutable() {
        com.google.v.eo<String> eoVar = this.services_;
        if (eoVar.c()) {
            return;
        }
        this.services_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ef getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCreatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.createdByInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.createdByInfo_ = dxVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrisisLocationAttributes(x xVar) {
        Objects.requireNonNull(xVar);
        x xVar2 = this.crisisLocationAttributes_;
        if (xVar2 != null && xVar2 != x.getDefaultInstance()) {
            w wVarNewBuilder = x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.crisisLocationAttributes_ = xVar;
        this.bitField1_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmergencyShelterAttributes(bf bfVar) {
        Objects.requireNonNull(bfVar);
        bf bfVar2 = this.emergencyShelterAttributes_;
        if (bfVar2 != null && bfVar2 != bf.getDefaultInstance()) {
            be beVarNewBuilder = bf.newBuilder(bfVar2);
            beVarNewBuilder.mergeFrom((be) bfVar);
            bfVar = beVarNewBuilder.buildPartial();
        }
        this.emergencyShelterAttributes_ = bfVar;
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvChargingVenue(bd bdVar) {
        Objects.requireNonNull(bdVar);
        bd bdVar2 = this.evChargingVenue_;
        if (bdVar2 != null && bdVar2 != bd.getDefaultInstance()) {
            au auVarNewBuilder = bd.newBuilder(bdVar2);
            auVarNewBuilder.mergeFrom((au) bdVar);
            bdVar = auVarNewBuilder.buildPartial();
        }
        this.evChargingVenue_ = bdVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGooglePlaceAttributes(cc ccVar) {
        Objects.requireNonNull(ccVar);
        cc ccVar2 = this.googlePlaceAttributes_;
        if (ccVar2 != null && ccVar2 != cc.getDefaultInstance()) {
            by byVarNewBuilder = cc.newBuilder(ccVar2);
            byVarNewBuilder.mergeFrom((by) ccVar);
            ccVar = byVarNewBuilder.buildPartial();
        }
        this.googlePlaceAttributes_ = ccVar;
        this.bitField1_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInternalVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        fz fzVar2 = this.internalVenueId_;
        if (fzVar2 != null && fzVar2 != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder(fzVar2);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.internalVenueId_ = fzVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLastUpdatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.lastUpdatedByInfo_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.lastUpdatedByInfo_ = dxVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.location_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.location_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMergedTo(fz fzVar) {
        Objects.requireNonNull(fzVar);
        fz fzVar2 = this.mergedTo_;
        if (fzVar2 != null && fzVar2 != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder(fzVar2);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.mergedTo_ = fzVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingLotAttributes(cw cwVar) {
        Objects.requireNonNull(cwVar);
        cw cwVar2 = this.parkingLotAttributes_;
        if (cwVar2 != null && cwVar2 != cw.getDefaultInstance()) {
            cl clVarNewBuilder = cw.newBuilder(cwVar2);
            clVarNewBuilder.mergeFrom((cl) cwVar);
            cwVar = clVarNewBuilder.buildPartial();
        }
        this.parkingLotAttributes_ = cwVar;
        this.bitField1_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTakeoverInfo(du duVar) {
        Objects.requireNonNull(duVar);
        du duVar2 = this.takeoverInfo_;
        if (duVar2 != null && duVar2 != du.getDefaultInstance()) {
            dt dtVarNewBuilder = du.newBuilder(duVar2);
            dtVarNewBuilder.mergeFrom((dt) duVar);
            duVar = dtVarNewBuilder.buildPartial();
        }
        this.takeoverInfo_ = duVar;
        this.bitField1_ |= 16777216;
    }

    public static eb newBuilder() {
        return (eb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ef parseDelimitedFrom(InputStream inputStream) {
        return (ef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ef parseFrom(com.google.v.v vVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ef> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBookingOffers(int i2) {
        ensureBookingOffersIsMutable();
        this.bookingOffers_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangeCandidates(int i2) {
        ensureChangeCandidatesIsMutable();
        this.changeCandidates_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChangedProducts(int i2) {
        ensureChangedProductsIsMutable();
        this.changedProducts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntryExitPoints(int i2) {
        ensureEntryExitPointsIsMutable();
        this.entryExitPoints_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExternalProviders(int i2) {
        ensureExternalProvidersIsMutable();
        this.externalProviders_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHours(int i2) {
        ensureHoursIsMutable();
        this.hours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImages(int i2) {
        ensureImagesIsMutable();
        this.images_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMergedFrom(int i2) {
        ensureMergedFromIsMutable();
        this.mergedFrom_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOriginalProducts(int i2) {
        ensureOriginalProductsIsMutable();
        this.originalProducts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParking(int i2) {
        ensureParkingIsMutable();
        this.parking_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolygon(int i2) {
        ensurePolygonIsMutable();
        this.polygon_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProduct(int i2) {
        ensureProductIsMutable();
        this.product_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSecondaryHours(int i2) {
        ensureSecondaryHoursIsMutable();
        this.secondaryHours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdKeywords(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAdKeywordsIsMutable();
        this.adKeywords_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLocked(boolean z) {
        this.bitField1_ |= 16;
        this.adLocked_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.address_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressBytes(com.google.v.v vVar) {
        this.address_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressDetails(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.addressDetails_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressDetailsBytes(com.google.v.v vVar) {
        this.addressDetails_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAliasesIsMutable();
        this.aliases_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApproved(boolean z) {
        this.bitField1_ |= 1;
        this.approved_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArea(double d2) {
        this.bitField0_ |= 67108864;
        this.area_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookingOffers(int i2, i iVar) {
        Objects.requireNonNull(iVar);
        ensureBookingOffersIsMutable();
        this.bookingOffers_.set(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2097152;
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(com.google.v.v vVar) {
        this.brand_ = vVar.u();
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 32768;
        this.brandId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIdBytes(com.google.v.v vVar) {
        this.brandId_ = vVar.u();
        this.bitField1_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeCandidates(int i2, l lVar) {
        Objects.requireNonNull(lVar);
        ensureChangeCandidatesIsMutable();
        this.changeCandidates_.set(i2, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangedProducts(int i2, r rVar) {
        Objects.requireNonNull(rVar);
        ensureChangedProductsIsMutable();
        this.changedProducts_.set(i2, rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChildren(int i2, String str) {
        Objects.requireNonNull(str);
        ensureChildrenIsMutable();
        this.children_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityId(long j2) {
        this.bitField0_ |= 4194304;
        this.cityId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.country_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryBytes(com.google.v.v vVar) {
        this.country_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryId(long j2) {
        this.bitField1_ |= 256;
        this.countryId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedBy(long j2) {
        this.bitField0_ |= 536870912;
        this.createdBy_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.createdByInfo_ = dxVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationDate(long j2) {
        this.bitField0_ |= 268435456;
        this.creationDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrisisLocationAttributes(x xVar) {
        Objects.requireNonNull(xVar);
        this.crisisLocationAttributes_ = xVar;
        this.bitField1_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 8;
        this.currency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyBytes(com.google.v.v vVar) {
        this.currency_ = vVar.u();
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleted(boolean z) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.deleted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.email_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmailBytes(com.google.v.v vVar) {
        this.email_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmergencyShelterAttributes(bf bfVar) {
        Objects.requireNonNull(bfVar);
        this.emergencyShelterAttributes_ = bfVar;
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnglishName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.englishName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnglishNameBytes(com.google.v.v vVar) {
        this.englishName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryExitPoints(int i2, bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryExitPointsIsMutable();
        this.entryExitPoints_.set(i2, biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointOnStreet(boolean z) {
        this.bitField1_ |= 262144;
        this.entryPointOnStreet_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvChargingVenue(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.evChargingVenue_ = bdVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalProviders(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.set(i2, boVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFax(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 131072;
        this.fax_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaxBytes(com.google.v.v vVar) {
        this.fax_ = vVar.u();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormattedName(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 8192;
        this.formattedName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFormattedNameBytes(com.google.v.v vVar) {
        this.formattedName_ = vVar.u();
        this.bitField1_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGooglePlaceAttributes(cc ccVar) {
        Objects.requireNonNull(ccVar);
        this.googlePlaceAttributes_ = ccVar;
        this.bitField1_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMoreData(boolean z) {
        this.bitField1_ |= 4096;
        this.hasMoreData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasPendingUpdateRequestsByUser(boolean z) {
        this.bitField1_ |= 512;
        this.hasPendingUpdateRequestsByUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(int i2, ch chVar) {
        Objects.requireNonNull(chVar);
        ensureHoursIsMutable();
        this.hours_.set(i2, chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.houseNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumberBytes(com.google.v.v vVar) {
        this.houseNumber_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(int i2, ce ceVar) {
        Objects.requireNonNull(ceVar);
        ensureImagesIsMutable();
        this.images_.set(i2, ceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternalVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.internalVenueId_ = fzVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNull(boolean z) {
        this.bitField1_ |= 65536;
        this.isNull_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdateBy(int i2, long j2) {
        ensureLastUpdateByIsMutable();
        this.lastUpdateBy_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdateDate(long j2) {
        this.bitField0_ |= 1073741824;
        this.lastUpdateDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.lastUpdatedByInfo_ = dxVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(u uVar) {
        Objects.requireNonNull(uVar);
        this.location_ = uVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockLevel(int i2) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.lockLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergedFrom(int i2, fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedFromIsMutable();
        this.mergedFrom_.set(i2, fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMergedTo(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.mergedTo_ = fzVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeCategories(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNativeCategoriesIsMutable();
        this.nativeCategories_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoPreview(boolean z) {
        this.bitField1_ |= 128;
        this.noPreview_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalProducts(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureOriginalProductsIsMutable();
        this.originalProducts_.set(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 134217728;
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(com.google.v.v vVar) {
        this.parent_ = vVar.u();
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureParkingIsMutable();
        this.parking_.set(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingLotAttributes(cw cwVar) {
        Objects.requireNonNull(cwVar);
        this.parkingLotAttributes_ = cwVar;
        this.bitField1_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.phone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneBytes(com.google.v.v vVar) {
        this.phone_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(int i2, u uVar) {
        Objects.requireNonNull(uVar);
        ensurePolygonIsMutable();
        this.polygon_.set(i2, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.priceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceTypeBytes(com.google.v.v vVar) {
        this.priceType_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(int i2, cz czVar) {
        Objects.requireNonNull(czVar);
        ensureProductIsMutable();
        this.product_.set(i2, czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.provider_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderBytes(com.google.v.v vVar) {
        this.provider_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(com.google.v.v vVar) {
        this.providerId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(boolean z) {
        this.bitField1_ |= 2;
        this.residential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryHours(int i2, dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureSecondaryHoursIsMutable();
        this.secondaryHours_.set(i2, dlVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(long j2) {
        this.bitField0_ |= 16777216;
        this.segmentId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServices(int i2, String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.state_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateBytes(com.google.v.v vVar) {
        this.state_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetId(long j2) {
        this.bitField0_ |= 8388608;
        this.streetId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverInfo(du duVar) {
        Objects.requireNonNull(duVar);
        this.takeoverInfo_ = duVar;
        this.bitField1_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimezone(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 4194304;
        this.timezone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimezoneBytes(com.google.v.v vVar) {
        this.timezone_ = vVar.u();
        this.bitField1_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficEventId(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.trafficEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficEventIdBytes(com.google.v.v vVar) {
        this.trafficEventId_ = vVar.u();
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTwitter(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 524288;
        this.twitter_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTwitterBytes(com.google.v.v vVar) {
        this.twitter_ = vVar.u();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlisted(boolean z) {
        this.bitField1_ |= 4;
        this.unlisted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1048576;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        this.url_ = vVar.u();
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlDisplayName(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 64;
        this.urlDisplayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlDisplayNameBytes(com.google.v.v vVar) {
        this.urlDisplayName_ = vVar.u();
        this.bitField1_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 32;
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        this.venueId_ = vVar.u();
        this.bitField1_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZip(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.zip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZipBytes(com.google.v.v vVar) {
        this.zip_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001N\u0000\u0002dµN\u0000\u0014\u0007dဈ\u0000eဈ\u0001fဉ\u0002g\u001ahဈ\u0003iဈ\u0004jဈ\u0005k\u001amᐉ\u0006n\u001aoЛpဈ\u0007qဈ\brဈ\tsဈ\ntဈ\u000buဈ\fvဈ\rwဈ\u000exဈ\u0010yဈ\u0011zဈ\u0012{ဈ\u0013|ဈ\u0014}ဈ\u0015~ဂ\u0016\u007fဂ\u0017\u0080ဂ\u0018\u0081ဇ\u0019\u0082\u001b\u0083က\u001a\u0084\u001b\u0085Л\u0086\u001b\u0087Л\u0088\u001a\u0089ဈ\u001b\u008aЛ\u008bЛ\u008cЛ\u008dဂ\u001c\u008eဂ\u001d\u008fဂ\u001e\u0090\u0014\u0091င\u001f\u0092ဇ \u0093ဇ!\u0094ဇ\"\u0095ဈ#\u0096\u001b\u0097ဇ$\u0098ဈ%\u0099\u001a\u009aဈ&\u009bဇ'\u009cဂ(\u009dဇ)\u009eဉ*\u009fဉ+ ဈ\u000f¡\u001a¢ဇ,£ဈ-¤ဉ.¥ဈ/¦ဇ0§ဉ1¨ဇ2ªဉ3«\u001b\u00adဉ4®ဉ5¯\u001b°ဈ6±\u001b²ဉ8´ဉ7µဈ9", new Object[]{"bitField0_", "bitField1_", "providerId_", "provider_", "internalVenueId_", "categories_", "name_", "englishName_", "description_", "aliases_", "location_", "services_", "polygon_", u.class, "priceType_", "houseNumber_", "street_", "city_", "state_", "country_", "address_", "zip_", "phone_", "fax_", "email_", "twitter_", "url_", "brand_", "cityId_", "streetId_", "segmentId_", "deleted_", "externalProviders_", bo.class, "area_", "hours_", ch.class, "images_", ce.class, "parking_", ck.class, "entryExitPoints_", bi.class, "children_", "parent_", "originalProducts_", de.class, "changedProducts_", r.class, "changeCandidates_", l.class, "creationDate_", "createdBy_", "lastUpdateDate_", "lastUpdateBy_", "lockLevel_", "approved_", "residential_", "unlisted_", "currency_", "product_", cz.class, "adLocked_", "venueId_", "adKeywords_", "urlDisplayName_", "noPreview_", "countryId_", "hasPendingUpdateRequestsByUser_", "createdByInfo_", "lastUpdatedByInfo_", "addressDetails_", "nativeCategories_", "hasMoreData_", "formattedName_", "parkingLotAttributes_", "brandId_", "isNull_", "emergencyShelterAttributes_", "entryPointOnStreet_", "mergedTo_", "mergedFrom_", fz.class, "evChargingVenue_", "googlePlaceAttributes_", "bookingOffers_", i.class, "timezone_", "secondaryHours_", dl.class, "takeoverInfo_", "crisisLocationAttributes_", "trafficEventId_"});
            case 3:
                return new ef();
            case 4:
                return new eb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ef> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ef.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getAdKeywords(int i2) {
        return this.adKeywords_.get(i2);
    }

    public com.google.v.v getAdKeywordsBytes(int i2) {
        return com.google.v.v.s(this.adKeywords_.get(i2));
    }

    public int getAdKeywordsCount() {
        return this.adKeywords_.size();
    }

    public List<String> getAdKeywordsList() {
        return this.adKeywords_;
    }

    public boolean getAdLocked() {
        return this.adLocked_;
    }

    public String getAddress() {
        return this.address_;
    }

    public com.google.v.v getAddressBytes() {
        return com.google.v.v.s(this.address_);
    }

    public String getAddressDetails() {
        return this.addressDetails_;
    }

    public com.google.v.v getAddressDetailsBytes() {
        return com.google.v.v.s(this.addressDetails_);
    }

    public String getAliases(int i2) {
        return this.aliases_.get(i2);
    }

    public com.google.v.v getAliasesBytes(int i2) {
        return com.google.v.v.s(this.aliases_.get(i2));
    }

    public int getAliasesCount() {
        return this.aliases_.size();
    }

    public List<String> getAliasesList() {
        return this.aliases_;
    }

    public boolean getApproved() {
        return this.approved_;
    }

    public double getArea() {
        return this.area_;
    }

    public i getBookingOffers(int i2) {
        return this.bookingOffers_.get(i2);
    }

    public int getBookingOffersCount() {
        return this.bookingOffers_.size();
    }

    public List<i> getBookingOffersList() {
        return this.bookingOffers_;
    }

    public j getBookingOffersOrBuilder(int i2) {
        return this.bookingOffers_.get(i2);
    }

    public List<? extends j> getBookingOffersOrBuilderList() {
        return this.bookingOffers_;
    }

    public String getBrand() {
        return this.brand_;
    }

    public com.google.v.v getBrandBytes() {
        return com.google.v.v.s(this.brand_);
    }

    public String getBrandId() {
        return this.brandId_;
    }

    public com.google.v.v getBrandIdBytes() {
        return com.google.v.v.s(this.brandId_);
    }

    public String getCategories(int i2) {
        return this.categories_.get(i2);
    }

    public com.google.v.v getCategoriesBytes(int i2) {
        return com.google.v.v.s(this.categories_.get(i2));
    }

    public int getCategoriesCount() {
        return this.categories_.size();
    }

    public List<String> getCategoriesList() {
        return this.categories_;
    }

    @Deprecated
    public l getChangeCandidates(int i2) {
        return this.changeCandidates_.get(i2);
    }

    @Deprecated
    public int getChangeCandidatesCount() {
        return this.changeCandidates_.size();
    }

    @Deprecated
    public List<l> getChangeCandidatesList() {
        return this.changeCandidates_;
    }

    @Deprecated
    public m getChangeCandidatesOrBuilder(int i2) {
        return this.changeCandidates_.get(i2);
    }

    @Deprecated
    public List<? extends m> getChangeCandidatesOrBuilderList() {
        return this.changeCandidates_;
    }

    public r getChangedProducts(int i2) {
        return this.changedProducts_.get(i2);
    }

    public int getChangedProductsCount() {
        return this.changedProducts_.size();
    }

    public List<r> getChangedProductsList() {
        return this.changedProducts_;
    }

    public s getChangedProductsOrBuilder(int i2) {
        return this.changedProducts_.get(i2);
    }

    public List<? extends s> getChangedProductsOrBuilderList() {
        return this.changedProducts_;
    }

    public String getChildren(int i2) {
        return this.children_.get(i2);
    }

    public com.google.v.v getChildrenBytes(int i2) {
        return com.google.v.v.s(this.children_.get(i2));
    }

    public int getChildrenCount() {
        return this.children_.size();
    }

    public List<String> getChildrenList() {
        return this.children_;
    }

    public String getCity() {
        return this.city_;
    }

    public com.google.v.v getCityBytes() {
        return com.google.v.v.s(this.city_);
    }

    public long getCityId() {
        return this.cityId_;
    }

    public String getCountry() {
        return this.country_;
    }

    public com.google.v.v getCountryBytes() {
        return com.google.v.v.s(this.country_);
    }

    public long getCountryId() {
        return this.countryId_;
    }

    public long getCreatedBy() {
        return this.createdBy_;
    }

    public dx getCreatedByInfo() {
        dx dxVar = this.createdByInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public long getCreationDate() {
        return this.creationDate_;
    }

    public x getCrisisLocationAttributes() {
        x xVar = this.crisisLocationAttributes_;
        return xVar == null ? x.getDefaultInstance() : xVar;
    }

    public String getCurrency() {
        return this.currency_;
    }

    public com.google.v.v getCurrencyBytes() {
        return com.google.v.v.s(this.currency_);
    }

    public boolean getDeleted() {
        return this.deleted_;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public String getEmail() {
        return this.email_;
    }

    public com.google.v.v getEmailBytes() {
        return com.google.v.v.s(this.email_);
    }

    public bf getEmergencyShelterAttributes() {
        bf bfVar = this.emergencyShelterAttributes_;
        return bfVar == null ? bf.getDefaultInstance() : bfVar;
    }

    public String getEnglishName() {
        return this.englishName_;
    }

    public com.google.v.v getEnglishNameBytes() {
        return com.google.v.v.s(this.englishName_);
    }

    public bi getEntryExitPoints(int i2) {
        return this.entryExitPoints_.get(i2);
    }

    public int getEntryExitPointsCount() {
        return this.entryExitPoints_.size();
    }

    public List<bi> getEntryExitPointsList() {
        return this.entryExitPoints_;
    }

    public bj getEntryExitPointsOrBuilder(int i2) {
        return this.entryExitPoints_.get(i2);
    }

    public List<? extends bj> getEntryExitPointsOrBuilderList() {
        return this.entryExitPoints_;
    }

    public boolean getEntryPointOnStreet() {
        return this.entryPointOnStreet_;
    }

    public bd getEvChargingVenue() {
        bd bdVar = this.evChargingVenue_;
        return bdVar == null ? bd.getDefaultInstance() : bdVar;
    }

    public bo getExternalProviders(int i2) {
        return this.externalProviders_.get(i2);
    }

    public int getExternalProvidersCount() {
        return this.externalProviders_.size();
    }

    public List<bo> getExternalProvidersList() {
        return this.externalProviders_;
    }

    public bp getExternalProvidersOrBuilder(int i2) {
        return this.externalProviders_.get(i2);
    }

    public List<? extends bp> getExternalProvidersOrBuilderList() {
        return this.externalProviders_;
    }

    public String getFax() {
        return this.fax_;
    }

    public com.google.v.v getFaxBytes() {
        return com.google.v.v.s(this.fax_);
    }

    public String getFormattedName() {
        return this.formattedName_;
    }

    public com.google.v.v getFormattedNameBytes() {
        return com.google.v.v.s(this.formattedName_);
    }

    public cc getGooglePlaceAttributes() {
        cc ccVar = this.googlePlaceAttributes_;
        return ccVar == null ? cc.getDefaultInstance() : ccVar;
    }

    public boolean getHasMoreData() {
        return this.hasMoreData_;
    }

    public boolean getHasPendingUpdateRequestsByUser() {
        return this.hasPendingUpdateRequestsByUser_;
    }

    public ch getHours(int i2) {
        return this.hours_.get(i2);
    }

    public int getHoursCount() {
        return this.hours_.size();
    }

    public List<ch> getHoursList() {
        return this.hours_;
    }

    public ci getHoursOrBuilder(int i2) {
        return this.hours_.get(i2);
    }

    public List<? extends ci> getHoursOrBuilderList() {
        return this.hours_;
    }

    public String getHouseNumber() {
        return this.houseNumber_;
    }

    public com.google.v.v getHouseNumberBytes() {
        return com.google.v.v.s(this.houseNumber_);
    }

    public ce getImages(int i2) {
        return this.images_.get(i2);
    }

    public int getImagesCount() {
        return this.images_.size();
    }

    public List<ce> getImagesList() {
        return this.images_;
    }

    public cf getImagesOrBuilder(int i2) {
        return this.images_.get(i2);
    }

    public List<? extends cf> getImagesOrBuilderList() {
        return this.images_;
    }

    public fz getInternalVenueId() {
        fz fzVar = this.internalVenueId_;
        return fzVar == null ? fz.getDefaultInstance() : fzVar;
    }

    public boolean getIsNull() {
        return this.isNull_;
    }

    public long getLastUpdateBy(int i2) {
        return this.lastUpdateBy_.a(i2);
    }

    public int getLastUpdateByCount() {
        return this.lastUpdateBy_.size();
    }

    public List<Long> getLastUpdateByList() {
        return this.lastUpdateBy_;
    }

    public long getLastUpdateDate() {
        return this.lastUpdateDate_;
    }

    public dx getLastUpdatedByInfo() {
        dx dxVar = this.lastUpdatedByInfo_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public u getLocation() {
        u uVar = this.location_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public int getLockLevel() {
        return this.lockLevel_;
    }

    public fz getMergedFrom(int i2) {
        return this.mergedFrom_.get(i2);
    }

    public int getMergedFromCount() {
        return this.mergedFrom_.size();
    }

    public List<fz> getMergedFromList() {
        return this.mergedFrom_;
    }

    public ga getMergedFromOrBuilder(int i2) {
        return this.mergedFrom_.get(i2);
    }

    public List<? extends ga> getMergedFromOrBuilderList() {
        return this.mergedFrom_;
    }

    public fz getMergedTo() {
        fz fzVar = this.mergedTo_;
        return fzVar == null ? fz.getDefaultInstance() : fzVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public String getNativeCategories(int i2) {
        return this.nativeCategories_.get(i2);
    }

    public com.google.v.v getNativeCategoriesBytes(int i2) {
        return com.google.v.v.s(this.nativeCategories_.get(i2));
    }

    public int getNativeCategoriesCount() {
        return this.nativeCategories_.size();
    }

    public List<String> getNativeCategoriesList() {
        return this.nativeCategories_;
    }

    public boolean getNoPreview() {
        return this.noPreview_;
    }

    public de getOriginalProducts(int i2) {
        return this.originalProducts_.get(i2);
    }

    public int getOriginalProductsCount() {
        return this.originalProducts_.size();
    }

    public List<de> getOriginalProductsList() {
        return this.originalProducts_;
    }

    public df getOriginalProductsOrBuilder(int i2) {
        return this.originalProducts_.get(i2);
    }

    public List<? extends df> getOriginalProductsOrBuilderList() {
        return this.originalProducts_;
    }

    public String getParent() {
        return this.parent_;
    }

    public com.google.v.v getParentBytes() {
        return com.google.v.v.s(this.parent_);
    }

    public ck getParking(int i2) {
        return this.parking_.get(i2);
    }

    public int getParkingCount() {
        return this.parking_.size();
    }

    public List<ck> getParkingList() {
        return this.parking_;
    }

    public cw getParkingLotAttributes() {
        cw cwVar = this.parkingLotAttributes_;
        return cwVar == null ? cw.getDefaultInstance() : cwVar;
    }

    public cx getParkingOrBuilder(int i2) {
        return this.parking_.get(i2);
    }

    public List<? extends cx> getParkingOrBuilderList() {
        return this.parking_;
    }

    public String getPhone() {
        return this.phone_;
    }

    public com.google.v.v getPhoneBytes() {
        return com.google.v.v.s(this.phone_);
    }

    public u getPolygon(int i2) {
        return this.polygon_.get(i2);
    }

    public int getPolygonCount() {
        return this.polygon_.size();
    }

    public List<u> getPolygonList() {
        return this.polygon_;
    }

    public v getPolygonOrBuilder(int i2) {
        return this.polygon_.get(i2);
    }

    public List<? extends v> getPolygonOrBuilderList() {
        return this.polygon_;
    }

    public String getPriceType() {
        return this.priceType_;
    }

    public com.google.v.v getPriceTypeBytes() {
        return com.google.v.v.s(this.priceType_);
    }

    public cz getProduct(int i2) {
        return this.product_.get(i2);
    }

    public int getProductCount() {
        return this.product_.size();
    }

    public List<cz> getProductList() {
        return this.product_;
    }

    public da getProductOrBuilder(int i2) {
        return this.product_.get(i2);
    }

    public List<? extends da> getProductOrBuilderList() {
        return this.product_;
    }

    public String getProvider() {
        return this.provider_;
    }

    public com.google.v.v getProviderBytes() {
        return com.google.v.v.s(this.provider_);
    }

    public String getProviderId() {
        return this.providerId_;
    }

    public com.google.v.v getProviderIdBytes() {
        return com.google.v.v.s(this.providerId_);
    }

    public boolean getResidential() {
        return this.residential_;
    }

    public dl getSecondaryHours(int i2) {
        return this.secondaryHours_.get(i2);
    }

    public int getSecondaryHoursCount() {
        return this.secondaryHours_.size();
    }

    public List<dl> getSecondaryHoursList() {
        return this.secondaryHours_;
    }

    public dm getSecondaryHoursOrBuilder(int i2) {
        return this.secondaryHours_.get(i2);
    }

    public List<? extends dm> getSecondaryHoursOrBuilderList() {
        return this.secondaryHours_;
    }

    public long getSegmentId() {
        return this.segmentId_;
    }

    public String getServices(int i2) {
        return this.services_.get(i2);
    }

    public com.google.v.v getServicesBytes(int i2) {
        return com.google.v.v.s(this.services_.get(i2));
    }

    public int getServicesCount() {
        return this.services_.size();
    }

    public List<String> getServicesList() {
        return this.services_;
    }

    public String getState() {
        return this.state_;
    }

    public com.google.v.v getStateBytes() {
        return com.google.v.v.s(this.state_);
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public long getStreetId() {
        return this.streetId_;
    }

    public du getTakeoverInfo() {
        du duVar = this.takeoverInfo_;
        return duVar == null ? du.getDefaultInstance() : duVar;
    }

    public String getTimezone() {
        return this.timezone_;
    }

    public com.google.v.v getTimezoneBytes() {
        return com.google.v.v.s(this.timezone_);
    }

    public String getTrafficEventId() {
        return this.trafficEventId_;
    }

    public com.google.v.v getTrafficEventIdBytes() {
        return com.google.v.v.s(this.trafficEventId_);
    }

    public String getTwitter() {
        return this.twitter_;
    }

    public com.google.v.v getTwitterBytes() {
        return com.google.v.v.s(this.twitter_);
    }

    public boolean getUnlisted() {
        return this.unlisted_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public String getUrlDisplayName() {
        return this.urlDisplayName_;
    }

    public com.google.v.v getUrlDisplayNameBytes() {
        return com.google.v.v.s(this.urlDisplayName_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public String getZip() {
        return this.zip_;
    }

    public com.google.v.v getZipBytes() {
        return com.google.v.v.s(this.zip_);
    }

    public boolean hasAdLocked() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasAddress() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAddressDetails() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasApproved() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasArea() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasBrand() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasBrandId() {
        return (this.bitField1_ & 32768) != 0;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCityId() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasCountryId() {
        return (this.bitField1_ & 256) != 0;
    }

    public boolean hasCreatedBy() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasCreatedByInfo() {
        return (this.bitField1_ & 1024) != 0;
    }

    public boolean hasCreationDate() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasCrisisLocationAttributes() {
        return (this.bitField1_ & 8388608) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasDeleted() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasEmergencyShelterAttributes() {
        return (this.bitField1_ & 131072) != 0;
    }

    public boolean hasEnglishName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEntryPointOnStreet() {
        return (this.bitField1_ & 262144) != 0;
    }

    public boolean hasEvChargingVenue() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public boolean hasFax() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasFormattedName() {
        return (this.bitField1_ & 8192) != 0;
    }

    public boolean hasGooglePlaceAttributes() {
        return (this.bitField1_ & 2097152) != 0;
    }

    public boolean hasHasMoreData() {
        return (this.bitField1_ & 4096) != 0;
    }

    public boolean hasHasPendingUpdateRequestsByUser() {
        return (this.bitField1_ & 512) != 0;
    }

    public boolean hasHouseNumber() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasInternalVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsNull() {
        return (this.bitField1_ & 65536) != 0;
    }

    public boolean hasLastUpdateDate() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasLastUpdatedByInfo() {
        return (this.bitField1_ & 2048) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLockLevel() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasMergedTo() {
        return (this.bitField1_ & 524288) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNoPreview() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasParent() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasParkingLotAttributes() {
        return (this.bitField1_ & 16384) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasPriceType() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProviderId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasResidential() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasStreetId() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasTakeoverInfo() {
        return (this.bitField1_ & 16777216) != 0;
    }

    public boolean hasTimezone() {
        return (this.bitField1_ & 4194304) != 0;
    }

    public boolean hasTrafficEventId() {
        return (this.bitField1_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasTwitter() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasUnlisted() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasUrlDisplayName() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasZip() {
        return (this.bitField0_ & 16384) != 0;
    }

    public static eb newBuilder(ef efVar) {
        return (eb) DEFAULT_INSTANCE.createBuilder(efVar);
    }

    public static ef parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ef parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ef parseFrom(com.google.v.z zVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ef parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBookingOffers(i iVar) {
        Objects.requireNonNull(iVar);
        ensureBookingOffersIsMutable();
        this.bookingOffers_.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangeCandidates(l lVar) {
        Objects.requireNonNull(lVar);
        ensureChangeCandidatesIsMutable();
        this.changeCandidates_.add(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangedProducts(r rVar) {
        Objects.requireNonNull(rVar);
        ensureChangedProductsIsMutable();
        this.changedProducts_.add(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntryExitPoints(bi biVar) {
        Objects.requireNonNull(biVar);
        ensureEntryExitPointsIsMutable();
        this.entryExitPoints_.add(biVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExternalProviders(bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.add(boVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHours(ch chVar) {
        Objects.requireNonNull(chVar);
        ensureHoursIsMutable();
        this.hours_.add(chVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ensureImagesIsMutable();
        this.images_.add(ceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMergedFrom(fz fzVar) {
        Objects.requireNonNull(fzVar);
        ensureMergedFromIsMutable();
        this.mergedFrom_.add(fzVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOriginalProducts(de deVar) {
        Objects.requireNonNull(deVar);
        ensureOriginalProductsIsMutable();
        this.originalProducts_.add(deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParking(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureParkingIsMutable();
        this.parking_.add(ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygon(u uVar) {
        Objects.requireNonNull(uVar);
        ensurePolygonIsMutable();
        this.polygon_.add(uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProduct(cz czVar) {
        Objects.requireNonNull(czVar);
        ensureProductIsMutable();
        this.product_.add(czVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSecondaryHours(dl dlVar) {
        Objects.requireNonNull(dlVar);
        ensureSecondaryHoursIsMutable();
        this.secondaryHours_.add(dlVar);
    }

    public static ef parseFrom(InputStream inputStream) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ef parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ef parseFrom(ByteBuffer byteBuffer) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ef parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ef parseFrom(byte[] bArr) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ef parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
