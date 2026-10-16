package i.b.v;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ed extends com.google.v.du<ed, ec> implements ee {
    public static final int ADDRESS_FIELD_NUMBER = 118;
    public static final int AD_CONTEXT_FIELD_NUMBER = 170;
    public static final int AD_KEYWORDS_FIELD_NUMBER = 152;
    public static final int AD_LOCKED_FIELD_NUMBER = 151;
    public static final int AD_LOGO_ID_FIELD_NUMBER = 171;
    public static final int ALIASES_FIELD_NUMBER = 107;
    public static final int APPROVED_FIELD_NUMBER = 146;
    public static final int AREA_FIELD_NUMBER = 131;
    public static final int BOOKING_OFFERS_FIELD_NUMBER = 176;
    public static final int BRAND_FIELD_NUMBER = 125;
    public static final int BRAND_ID_FIELD_NUMBER = 164;
    public static final int CATEGORIES_FIELD_NUMBER = 103;
    public static final int CHANGED_PRODUCTS_FIELD_NUMBER = 139;
    public static final int CHANGE_CANDIDATES_FIELD_NUMBER = 140;
    public static final int CHILDREN_FIELD_NUMBER = 136;
    public static final int CITY_FIELD_NUMBER = 115;
    public static final int CITY_ID_FIELD_NUMBER = 126;
    public static final int COUNTRY_FIELD_NUMBER = 117;
    public static final int COUNTRY_ID_FIELD_NUMBER = 156;
    public static final int CREATED_BY_FIELD_NUMBER = 142;
    public static final int CREATED_BY_INFO_FIELD_NUMBER = 158;
    public static final int CREATION_DATE_FIELD_NUMBER = 141;
    public static final int CRISIS_LOCATION_ATTRIBUTES_FIELD_NUMBER = 180;
    public static final int CURRENCY_FIELD_NUMBER = 178;
    private static final ed DEFAULT_INSTANCE;
    public static final int DELETED_FIELD_NUMBER = 129;
    public static final int DESCRIPTION_FIELD_NUMBER = 106;
    public static final int EMAIL_FIELD_NUMBER = 122;
    public static final int EMERGENCY_SHELTER_ATTRIBUTES_FIELD_NUMBER = 166;
    public static final int ENGLISH_NAME_FIELD_NUMBER = 105;
    public static final int ENTRY_EXIT_POINTS_FIELD_NUMBER = 135;
    public static final int ENTRY_POINT_ON_STREET_FIELD_NUMBER = 168;
    public static final int EV_CHARGING_STATION_ATTRIBUTES_FIELD_NUMBER = 175;
    public static final int EXTERNAL_PROVIDERS_FIELD_NUMBER = 130;
    public static final int FAX_FIELD_NUMBER = 121;
    public static final int HAS_MORE_DATA_FIELD_NUMBER = 162;
    public static final int HAS_PENDING_UPDATE_REQUESTS_BY_USER_FIELD_NUMBER = 157;
    public static final int HOURS_FIELD_NUMBER = 132;
    public static final int HOUSE_NUMBER_FIELD_NUMBER = 113;
    public static final int ID_FIELD_NUMBER = 100;
    public static final int IMAGES_FIELD_NUMBER = 133;
    public static final int IS_NULL_FIELD_NUMBER = 165;
    public static final int LASTUPDATE_BY_FIELD_NUMBER = 144;
    public static final int LASTUPDATE_DATE_FIELD_NUMBER = 143;
    public static final int LAST_UPDATED_BY_INFO_FIELD_NUMBER = 159;
    public static final int LOCATION_FIELD_NUMBER = 109;
    public static final int LOCK_LEVEL_FIELD_NUMBER = 145;
    public static final int MERGED_FROM_FIELD_NUMBER = 174;
    public static final int MERGED_TO_FIELD_NUMBER = 173;
    public static final int NAME_FIELD_NUMBER = 104;
    public static final int NO_PREVIEW_FIELD_NUMBER = 155;
    public static final int ORIGINAL_PRODUCTS_FIELD_NUMBER = 138;
    public static final int PARENT_FIELD_NUMBER = 137;
    public static final int PARKING_FIELD_NUMBER = 134;
    public static final int PARKING_LOT_ATTRIBUTES_FIELD_NUMBER = 163;
    private static volatile com.google.v.fo<ed> PARSER = null;
    public static final int PENDING_REQUESTS_FIELD_NUMBER = 149;
    public static final int PHONE_FIELD_NUMBER = 120;
    public static final int POLYGON_FIELD_NUMBER = 111;
    public static final int PRICE_TYPE_FIELD_NUMBER = 112;
    public static final int PROVIDER_FIELD_NUMBER = 101;
    public static final int PROVIDER_ID_FIELD_NUMBER = 169;
    public static final int RESIDENTIAL_FIELD_NUMBER = 147;
    public static final int SEGMENT_ID_FIELD_NUMBER = 128;
    public static final int SERVICES_FIELD_NUMBER = 110;
    public static final int SHOULD_APPEAR_IN_AUTO_COMPLETE_FIELD_NUMBER = 167;
    public static final int STATE_FIELD_NUMBER = 116;
    public static final int STREET_FIELD_NUMBER = 114;
    public static final int STREET_ID_FIELD_NUMBER = 127;
    public static final int TIMEZONE_FIELD_NUMBER = 177;
    public static final int TRAFFIC_EVENT_ID_FIELD_NUMBER = 181;
    public static final int TWITTER_FIELD_NUMBER = 123;
    public static final int UNLISTED_FIELD_NUMBER = 148;
    public static final int UPDATED_IMAGES_FIELD_NUMBER = 179;
    public static final int URL_DISPLAY_NAME_FIELD_NUMBER = 154;
    public static final int URL_FIELD_NUMBER = 124;
    public static final int VENUE_ID_FIELD_NUMBER = 102;
    public static final int ZIP_FIELD_NUMBER = 119;
    private fo adKeywords_;
    private eq adLocked_;
    private fq address_;
    private fo aliases_;
    private eq approved_;
    private double area_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private eo bookingOffers_;
    private fq brandId_;
    private fq brand_;
    private fo categories_;
    private fo children_;
    private fg cityId_;
    private fq city_;
    private fg countryId_;
    private fq country_;
    private dx createdByInfo_;
    private long createdBy_;
    private long creationDate_;
    private eu crisisLocationAttributes_;
    private boolean deleted_;
    private fq description_;
    private fq email_;
    private ey emergencyShelterAttributes_;
    private fq englishName_;
    private fa entryExitPoints_;
    private boolean entryPointOnStreet_;
    private ew evChargingStationAttributes_;
    private fq fax_;
    private boolean hasMoreData_;
    private boolean hasPendingUpdateRequestsByUser_;
    private fi hours_;
    private fq houseNumber_;
    private boolean isNull_;
    private long lastUpdateDate_;
    private dx lastUpdatedByInfo_;
    private es location_;
    private fe lockLevel_;
    private fz mergedTo_;
    private fq name_;
    private eq noPreview_;
    private fq parent_;
    private fm parkingLotAttributes_;
    private fk parking_;
    private fq phone_;
    private fc polygon_;
    private fq priceType_;
    private eq residential_;
    private fg segmentId_;
    private fo services_;
    private boolean shouldAppearInAutoComplete_;
    private fq state_;
    private fg streetId_;
    private fq street_;
    private fq timezone_;
    private fq trafficEventId_;
    private fq twitter_;
    private eq unlisted_;
    private boolean updatedImages_;
    private fq urlDisplayName_;
    private fq url_;
    private fz venueId_;
    private fq zip_;
    private byte memoizedIsInitialized = 2;
    private String id_ = "";
    private String provider_ = "";
    private com.google.v.eo<bo> externalProviders_ = emptyProtobufList();
    private com.google.v.eo<ce> images_ = emptyProtobufList();
    private com.google.v.eo<de> originalProducts_ = emptyProtobufList();
    private com.google.v.eo<r> changedProducts_ = emptyProtobufList();
    private com.google.v.eo<l> changeCandidates_ = emptyProtobufList();
    private com.google.v.en lastUpdateBy_ = emptyLongList();
    private com.google.v.eo<gw> pendingRequests_ = emptyProtobufList();
    private String providerId_ = "";
    private String adContext_ = "";
    private String adLogoId_ = "";
    private com.google.v.eo<fz> mergedFrom_ = emptyProtobufList();
    private String currency_ = "";

    static {
        ed edVar = new ed();
        DEFAULT_INSTANCE = edVar;
        com.google.v.du.registerDefaultInstance(ed.class, edVar);
    }

    private ed() {
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
    public void addAllExternalProviders(Iterable<? extends bo> iterable) {
        ensureExternalProvidersIsMutable();
        com.google.v.c.addAll(iterable, this.externalProviders_);
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
    public void addAllOriginalProducts(Iterable<? extends de> iterable) {
        ensureOriginalProductsIsMutable();
        com.google.v.c.addAll(iterable, this.originalProducts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPendingRequests(Iterable<? extends gw> iterable) {
        ensurePendingRequestsIsMutable();
        com.google.v.c.addAll(iterable, this.pendingRequests_);
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
    public void addExternalProviders(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.add(i2, boVar);
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
    public void addOriginalProducts(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureOriginalProductsIsMutable();
        this.originalProducts_.add(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPendingRequests(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensurePendingRequestsIsMutable();
        this.pendingRequests_.add(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdContext() {
        this.bitField1_ &= -67108865;
        this.adContext_ = getDefaultInstance().getAdContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdKeywords() {
        this.adKeywords_ = null;
        this.bitField1_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdLocked() {
        this.adLocked_ = null;
        this.bitField1_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdLogoId() {
        this.bitField1_ &= -134217729;
        this.adLogoId_ = getDefaultInstance().getAdLogoId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApproved() {
        this.approved_ = null;
        this.bitField1_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArea() {
        this.bitField0_ &= -536870913;
        this.area_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookingOffers() {
        this.bookingOffers_ = null;
        this.bitField1_ &= -1073741825;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.brand_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.brandId_ = null;
        this.bitField1_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = null;
        this.bitField0_ &= -9;
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
        this.children_ = null;
        this.bitField1_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.city_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCityId() {
        this.cityId_ = null;
        this.bitField0_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountry() {
        this.country_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountryId() {
        this.countryId_ = null;
        this.bitField1_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedBy() {
        this.bitField1_ &= -17;
        this.createdBy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreatedByInfo() {
        this.createdByInfo_ = null;
        this.bitField1_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreationDate() {
        this.bitField1_ &= -9;
        this.creationDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrisisLocationAttributes() {
        this.crisisLocationAttributes_ = null;
        this.bitField2_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrency() {
        this.bitField2_ &= -2;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeleted() {
        this.bitField0_ &= -268435457;
        this.deleted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmail() {
        this.email_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEmergencyShelterAttributes() {
        this.emergencyShelterAttributes_ = null;
        this.bitField1_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnglishName() {
        this.englishName_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryExitPoints() {
        this.entryExitPoints_ = null;
        this.bitField1_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointOnStreet() {
        this.bitField1_ &= -16777217;
        this.entryPointOnStreet_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargingStationAttributes() {
        this.evChargingStationAttributes_ = null;
        this.bitField1_ &= -536870913;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExternalProviders() {
        this.externalProviders_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFax() {
        this.fax_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMoreData() {
        this.bitField1_ &= -262145;
        this.hasMoreData_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasPendingUpdateRequestsByUser() {
        this.bitField1_ &= -32769;
        this.hasPendingUpdateRequestsByUser_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHours() {
        this.hours_ = null;
        this.bitField0_ &= -1073741825;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHouseNumber() {
        this.houseNumber_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImages() {
        this.images_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNull() {
        this.bitField1_ &= -2097153;
        this.isNull_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdateBy() {
        this.lastUpdateBy_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdateDate() {
        this.bitField1_ &= -33;
        this.lastUpdateDate_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUpdatedByInfo() {
        this.lastUpdatedByInfo_ = null;
        this.bitField1_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLockLevel() {
        this.lockLevel_ = null;
        this.bitField1_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergedFrom() {
        this.mergedFrom_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMergedTo() {
        this.mergedTo_ = null;
        this.bitField1_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoPreview() {
        this.noPreview_ = null;
        this.bitField1_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalProducts() {
        this.originalProducts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = null;
        this.bitField1_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.parking_ = null;
        this.bitField0_ &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingLotAttributes() {
        this.parkingLotAttributes_ = null;
        this.bitField1_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPendingRequests() {
        this.pendingRequests_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhone() {
        this.phone_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceType() {
        this.priceType_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.bitField0_ &= -3;
        this.provider_ = getDefaultInstance().getProvider();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField1_ &= -33554433;
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.residential_ = null;
        this.bitField1_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.segmentId_ = null;
        this.bitField0_ &= -134217729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServices() {
        this.services_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldAppearInAutoComplete() {
        this.bitField1_ &= -8388609;
        this.shouldAppearInAutoComplete_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.street_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreetId() {
        this.streetId_ = null;
        this.bitField0_ &= -67108865;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimezone() {
        this.timezone_ = null;
        this.bitField1_ &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficEventId() {
        this.trafficEventId_ = null;
        this.bitField2_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTwitter() {
        this.twitter_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnlisted() {
        this.unlisted_ = null;
        this.bitField1_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdatedImages() {
        this.bitField2_ &= -3;
        this.updatedImages_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlDisplayName() {
        this.urlDisplayName_ = null;
        this.bitField1_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZip() {
        this.zip_ = null;
        this.bitField0_ &= -262145;
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

    private void ensureExternalProvidersIsMutable() {
        com.google.v.eo<bo> eoVar = this.externalProviders_;
        if (eoVar.c()) {
            return;
        }
        this.externalProviders_ = com.google.v.du.mutableCopy(eoVar);
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

    private void ensureOriginalProductsIsMutable() {
        com.google.v.eo<de> eoVar = this.originalProducts_;
        if (eoVar.c()) {
            return;
        }
        this.originalProducts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePendingRequestsIsMutable() {
        com.google.v.eo<gw> eoVar = this.pendingRequests_;
        if (eoVar.c()) {
            return;
        }
        this.pendingRequests_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ed getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdKeywords(fo foVar) {
        Objects.requireNonNull(foVar);
        fo foVar2 = this.adKeywords_;
        if (foVar2 != null && foVar2 != fo.getDefaultInstance()) {
            fn fnVarNewBuilder = fo.newBuilder(foVar2);
            fnVarNewBuilder.mergeFrom((fn) foVar);
            foVar = fnVarNewBuilder.buildPartial();
        }
        this.adKeywords_ = foVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdLocked(eq eqVar) {
        Objects.requireNonNull(eqVar);
        eq eqVar2 = this.adLocked_;
        if (eqVar2 != null && eqVar2 != eq.getDefaultInstance()) {
            ep epVarNewBuilder = eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.adLocked_ = eqVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddress(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.address_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.address_ = fqVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAliases(fo foVar) {
        Objects.requireNonNull(foVar);
        fo foVar2 = this.aliases_;
        if (foVar2 != null && foVar2 != fo.getDefaultInstance()) {
            fn fnVarNewBuilder = fo.newBuilder(foVar2);
            fnVarNewBuilder.mergeFrom((fn) foVar);
            foVar = fnVarNewBuilder.buildPartial();
        }
        this.aliases_ = foVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApproved(eq eqVar) {
        Objects.requireNonNull(eqVar);
        eq eqVar2 = this.approved_;
        if (eqVar2 != null && eqVar2 != eq.getDefaultInstance()) {
            ep epVarNewBuilder = eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.approved_ = eqVar;
        this.bitField1_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBookingOffers(eo eoVar) {
        Objects.requireNonNull(eoVar);
        eo eoVar2 = this.bookingOffers_;
        if (eoVar2 != null && eoVar2 != eo.getDefaultInstance()) {
            en enVarNewBuilder = eo.newBuilder(eoVar2);
            enVarNewBuilder.mergeFrom((en) eoVar);
            eoVar = enVarNewBuilder.buildPartial();
        }
        this.bookingOffers_ = eoVar;
        this.bitField1_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBrand(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.brand_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.brand_ = fqVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBrandId(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.brandId_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.brandId_ = fqVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCategories(fo foVar) {
        Objects.requireNonNull(foVar);
        fo foVar2 = this.categories_;
        if (foVar2 != null && foVar2 != fo.getDefaultInstance()) {
            fn fnVarNewBuilder = fo.newBuilder(foVar2);
            fnVarNewBuilder.mergeFrom((fn) foVar);
            foVar = fnVarNewBuilder.buildPartial();
        }
        this.categories_ = foVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeChildren(fo foVar) {
        Objects.requireNonNull(foVar);
        fo foVar2 = this.children_;
        if (foVar2 != null && foVar2 != fo.getDefaultInstance()) {
            fn fnVarNewBuilder = fo.newBuilder(foVar2);
            fnVarNewBuilder.mergeFrom((fn) foVar);
            foVar = fnVarNewBuilder.buildPartial();
        }
        this.children_ = foVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCity(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.city_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.city_ = fqVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCityId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        fg fgVar2 = this.cityId_;
        if (fgVar2 != null && fgVar2 != fg.getDefaultInstance()) {
            ff ffVarNewBuilder = fg.newBuilder(fgVar2);
            ffVarNewBuilder.mergeFrom((ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.cityId_ = fgVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountry(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.country_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.country_ = fqVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCountryId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        fg fgVar2 = this.countryId_;
        if (fgVar2 != null && fgVar2 != fg.getDefaultInstance()) {
            ff ffVarNewBuilder = fg.newBuilder(fgVar2);
            ffVarNewBuilder.mergeFrom((ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.countryId_ = fgVar;
        this.bitField1_ |= 16384;
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
        this.bitField1_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrisisLocationAttributes(eu euVar) {
        Objects.requireNonNull(euVar);
        eu euVar2 = this.crisisLocationAttributes_;
        if (euVar2 != null && euVar2 != eu.getDefaultInstance()) {
            et etVarNewBuilder = eu.newBuilder(euVar2);
            etVarNewBuilder.mergeFrom((et) euVar);
            euVar = etVarNewBuilder.buildPartial();
        }
        this.crisisLocationAttributes_ = euVar;
        this.bitField2_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDescription(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.description_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.description_ = fqVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmail(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.email_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.email_ = fqVar;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEmergencyShelterAttributes(ey eyVar) {
        Objects.requireNonNull(eyVar);
        ey eyVar2 = this.emergencyShelterAttributes_;
        if (eyVar2 != null && eyVar2 != ey.getDefaultInstance()) {
            ex exVarNewBuilder = ey.newBuilder(eyVar2);
            exVarNewBuilder.mergeFrom((ex) eyVar);
            eyVar = exVarNewBuilder.buildPartial();
        }
        this.emergencyShelterAttributes_ = eyVar;
        this.bitField1_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnglishName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.englishName_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.englishName_ = fqVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEntryExitPoints(fa faVar) {
        Objects.requireNonNull(faVar);
        fa faVar2 = this.entryExitPoints_;
        if (faVar2 != null && faVar2 != fa.getDefaultInstance()) {
            ez ezVarNewBuilder = fa.newBuilder(faVar2);
            ezVarNewBuilder.mergeFrom((ez) faVar);
            faVar = ezVarNewBuilder.buildPartial();
        }
        this.entryExitPoints_ = faVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvChargingStationAttributes(ew ewVar) {
        Objects.requireNonNull(ewVar);
        ew ewVar2 = this.evChargingStationAttributes_;
        if (ewVar2 != null && ewVar2 != ew.getDefaultInstance()) {
            ev evVarNewBuilder = ew.newBuilder(ewVar2);
            evVarNewBuilder.mergeFrom((ev) ewVar);
            ewVar = evVarNewBuilder.buildPartial();
        }
        this.evChargingStationAttributes_ = ewVar;
        this.bitField1_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFax(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.fax_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.fax_ = fqVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHours(fi fiVar) {
        Objects.requireNonNull(fiVar);
        fi fiVar2 = this.hours_;
        if (fiVar2 != null && fiVar2 != fi.getDefaultInstance()) {
            fh fhVarNewBuilder = fi.newBuilder(fiVar2);
            fhVarNewBuilder.mergeFrom((fh) fiVar);
            fiVar = fhVarNewBuilder.buildPartial();
        }
        this.hours_ = fiVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHouseNumber(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.houseNumber_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.houseNumber_ = fqVar;
        this.bitField0_ |= 4096;
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
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.location_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.location_ = esVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLockLevel(fe feVar) {
        Objects.requireNonNull(feVar);
        fe feVar2 = this.lockLevel_;
        if (feVar2 != null && feVar2 != fe.getDefaultInstance()) {
            fd fdVarNewBuilder = fe.newBuilder(feVar2);
            fdVarNewBuilder.mergeFrom((fd) feVar);
            feVar = fdVarNewBuilder.buildPartial();
        }
        this.lockLevel_ = feVar;
        this.bitField1_ |= 64;
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
        this.bitField1_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.name_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.name_ = fqVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNoPreview(eq eqVar) {
        Objects.requireNonNull(eqVar);
        eq eqVar2 = this.noPreview_;
        if (eqVar2 != null && eqVar2 != eq.getDefaultInstance()) {
            ep epVarNewBuilder = eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.noPreview_ = eqVar;
        this.bitField1_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParent(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.parent_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.parent_ = fqVar;
        this.bitField1_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParking(fk fkVar) {
        Objects.requireNonNull(fkVar);
        fk fkVar2 = this.parking_;
        if (fkVar2 != null && fkVar2 != fk.getDefaultInstance()) {
            fj fjVarNewBuilder = fk.newBuilder(fkVar2);
            fjVarNewBuilder.mergeFrom((fj) fkVar);
            fkVar = fjVarNewBuilder.buildPartial();
        }
        this.parking_ = fkVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParkingLotAttributes(fm fmVar) {
        Objects.requireNonNull(fmVar);
        fm fmVar2 = this.parkingLotAttributes_;
        if (fmVar2 != null && fmVar2 != fm.getDefaultInstance()) {
            fl flVarNewBuilder = fm.newBuilder(fmVar2);
            flVarNewBuilder.mergeFrom((fl) fmVar);
            fmVar = flVarNewBuilder.buildPartial();
        }
        this.parkingLotAttributes_ = fmVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePhone(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.phone_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.phone_ = fqVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygon(fc fcVar) {
        Objects.requireNonNull(fcVar);
        fc fcVar2 = this.polygon_;
        if (fcVar2 != null && fcVar2 != fc.getDefaultInstance()) {
            fb fbVarNewBuilder = fc.newBuilder(fcVar2);
            fbVarNewBuilder.mergeFrom((fb) fcVar);
            fcVar = fbVarNewBuilder.buildPartial();
        }
        this.polygon_ = fcVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriceType(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.priceType_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.priceType_ = fqVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResidential(eq eqVar) {
        Objects.requireNonNull(eqVar);
        eq eqVar2 = this.residential_;
        if (eqVar2 != null && eqVar2 != eq.getDefaultInstance()) {
            ep epVarNewBuilder = eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.residential_ = eqVar;
        this.bitField1_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        fg fgVar2 = this.segmentId_;
        if (fgVar2 != null && fgVar2 != fg.getDefaultInstance()) {
            ff ffVarNewBuilder = fg.newBuilder(fgVar2);
            ffVarNewBuilder.mergeFrom((ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.segmentId_ = fgVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServices(fo foVar) {
        Objects.requireNonNull(foVar);
        fo foVar2 = this.services_;
        if (foVar2 != null && foVar2 != fo.getDefaultInstance()) {
            fn fnVarNewBuilder = fo.newBuilder(foVar2);
            fnVarNewBuilder.mergeFrom((fn) foVar);
            foVar = fnVarNewBuilder.buildPartial();
        }
        this.services_ = foVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeState(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.state_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.state_ = fqVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreet(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.street_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.street_ = fqVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStreetId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        fg fgVar2 = this.streetId_;
        if (fgVar2 != null && fgVar2 != fg.getDefaultInstance()) {
            ff ffVarNewBuilder = fg.newBuilder(fgVar2);
            ffVarNewBuilder.mergeFrom((ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.streetId_ = fgVar;
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimezone(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.timezone_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.timezone_ = fqVar;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficEventId(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.trafficEventId_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.trafficEventId_ = fqVar;
        this.bitField2_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTwitter(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.twitter_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.twitter_ = fqVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnlisted(eq eqVar) {
        Objects.requireNonNull(eqVar);
        eq eqVar2 = this.unlisted_;
        if (eqVar2 != null && eqVar2 != eq.getDefaultInstance()) {
            ep epVarNewBuilder = eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.unlisted_ = eqVar;
        this.bitField1_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUrl(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.url_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.url_ = fqVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUrlDisplayName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.urlDisplayName_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.urlDisplayName_ = fqVar;
        this.bitField1_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        fz fzVar2 = this.venueId_;
        if (fzVar2 != null && fzVar2 != fz.getDefaultInstance()) {
            fy fyVarNewBuilder = fz.newBuilder(fzVar2);
            fyVarNewBuilder.mergeFrom((fy) fzVar);
            fzVar = fyVarNewBuilder.buildPartial();
        }
        this.venueId_ = fzVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeZip(fq fqVar) {
        Objects.requireNonNull(fqVar);
        fq fqVar2 = this.zip_;
        if (fqVar2 != null && fqVar2 != fq.getDefaultInstance()) {
            fp fpVarNewBuilder = fq.newBuilder(fqVar2);
            fpVarNewBuilder.mergeFrom((fp) fqVar);
            fqVar = fpVarNewBuilder.buildPartial();
        }
        this.zip_ = fqVar;
        this.bitField0_ |= 262144;
    }

    public static ec newBuilder() {
        return (ec) DEFAULT_INSTANCE.createBuilder();
    }

    public static ed parseDelimitedFrom(InputStream inputStream) {
        return (ed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ed parseFrom(com.google.v.v vVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ed> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void removeExternalProviders(int i2) {
        ensureExternalProvidersIsMutable();
        this.externalProviders_.remove(i2);
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
    public void removePendingRequests(int i2) {
        ensurePendingRequestsIsMutable();
        this.pendingRequests_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdContext(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 67108864;
        this.adContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdContextBytes(com.google.v.v vVar) {
        this.adContext_ = vVar.u();
        this.bitField1_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdKeywords(fo foVar) {
        Objects.requireNonNull(foVar);
        this.adKeywords_ = foVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLocked(eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.adLocked_ = eqVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLogoId(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 134217728;
        this.adLogoId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdLogoIdBytes(com.google.v.v vVar) {
        this.adLogoId_ = vVar.u();
        this.bitField1_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.address_ = fqVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(fo foVar) {
        Objects.requireNonNull(foVar);
        this.aliases_ = foVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApproved(eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.approved_ = eqVar;
        this.bitField1_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArea(double d2) {
        this.bitField0_ |= 536870912;
        this.area_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookingOffers(eo eoVar) {
        Objects.requireNonNull(eoVar);
        this.bookingOffers_ = eoVar;
        this.bitField1_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.brand_ = fqVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.brandId_ = fqVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(fo foVar) {
        Objects.requireNonNull(foVar);
        this.categories_ = foVar;
        this.bitField0_ |= 8;
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
    public void setChildren(fo foVar) {
        Objects.requireNonNull(foVar);
        this.children_ = foVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.city_ = fqVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.cityId_ = fgVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.country_ = fqVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.countryId_ = fgVar;
        this.bitField1_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedBy(long j2) {
        this.bitField1_ |= 16;
        this.createdBy_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.createdByInfo_ = dxVar;
        this.bitField1_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreationDate(long j2) {
        this.bitField1_ |= 8;
        this.creationDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrisisLocationAttributes(eu euVar) {
        Objects.requireNonNull(euVar);
        this.crisisLocationAttributes_ = euVar;
        this.bitField2_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        Objects.requireNonNull(str);
        this.bitField2_ |= 1;
        this.currency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyBytes(com.google.v.v vVar) {
        this.currency_ = vVar.u();
        this.bitField2_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleted(boolean z) {
        this.bitField0_ |= 268435456;
        this.deleted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.description_ = fqVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmail(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.email_ = fqVar;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmergencyShelterAttributes(ey eyVar) {
        Objects.requireNonNull(eyVar);
        this.emergencyShelterAttributes_ = eyVar;
        this.bitField1_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnglishName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.englishName_ = fqVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryExitPoints(fa faVar) {
        Objects.requireNonNull(faVar);
        this.entryExitPoints_ = faVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointOnStreet(boolean z) {
        this.bitField1_ |= 16777216;
        this.entryPointOnStreet_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvChargingStationAttributes(ew ewVar) {
        Objects.requireNonNull(ewVar);
        this.evChargingStationAttributes_ = ewVar;
        this.bitField1_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalProviders(int i2, bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.set(i2, boVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFax(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.fax_ = fqVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMoreData(boolean z) {
        this.bitField1_ |= 262144;
        this.hasMoreData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasPendingUpdateRequestsByUser(boolean z) {
        this.bitField1_ |= 32768;
        this.hasPendingUpdateRequestsByUser_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHours(fi fiVar) {
        Objects.requireNonNull(fiVar);
        this.hours_ = fiVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHouseNumber(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.houseNumber_ = fqVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(int i2, ce ceVar) {
        Objects.requireNonNull(ceVar);
        ensureImagesIsMutable();
        this.images_.set(i2, ceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNull(boolean z) {
        this.bitField1_ |= 2097152;
        this.isNull_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdateBy(int i2, long j2) {
        ensureLastUpdateByIsMutable();
        this.lastUpdateBy_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdateDate(long j2) {
        this.bitField1_ |= 32;
        this.lastUpdateDate_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUpdatedByInfo(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.lastUpdatedByInfo_ = dxVar;
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(es esVar) {
        Objects.requireNonNull(esVar);
        this.location_ = esVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLockLevel(fe feVar) {
        Objects.requireNonNull(feVar);
        this.lockLevel_ = feVar;
        this.bitField1_ |= 64;
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
        this.bitField1_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.name_ = fqVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoPreview(eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.noPreview_ = eqVar;
        this.bitField1_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalProducts(int i2, de deVar) {
        Objects.requireNonNull(deVar);
        ensureOriginalProductsIsMutable();
        this.originalProducts_.set(i2, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.parent_ = fqVar;
        this.bitField1_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(fk fkVar) {
        Objects.requireNonNull(fkVar);
        this.parking_ = fkVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingLotAttributes(fm fmVar) {
        Objects.requireNonNull(fmVar);
        this.parkingLotAttributes_ = fmVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPendingRequests(int i2, gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensurePendingRequestsIsMutable();
        this.pendingRequests_.set(i2, gwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhone(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.phone_ = fqVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(fc fcVar) {
        Objects.requireNonNull(fcVar);
        this.polygon_ = fcVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceType(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.priceType_ = fqVar;
        this.bitField0_ |= 2048;
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
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(com.google.v.v vVar) {
        this.providerId_ = vVar.u();
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.residential_ = eqVar;
        this.bitField1_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.segmentId_ = fgVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServices(fo foVar) {
        Objects.requireNonNull(foVar);
        this.services_ = foVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldAppearInAutoComplete(boolean z) {
        this.bitField1_ |= 8388608;
        this.shouldAppearInAutoComplete_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.state_ = fqVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.street_ = fqVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetId(fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.streetId_ = fgVar;
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimezone(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.timezone_ = fqVar;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficEventId(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.trafficEventId_ = fqVar;
        this.bitField2_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTwitter(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.twitter_ = fqVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnlisted(eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.unlisted_ = eqVar;
        this.bitField1_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdatedImages(boolean z) {
        this.bitField2_ |= 2;
        this.updatedImages_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.url_ = fqVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlDisplayName(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.urlDisplayName_ = fqVar;
        this.bitField1_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.venueId_ = fzVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZip(fq fqVar) {
        Objects.requireNonNull(fqVar);
        this.zip_ = fqVar;
        this.bitField0_ |= 262144;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001L\u0000\u0003dµL\u0000\b\bdဈ\u0000eဈ\u0001fဉ\u0002gဉ\u0003hဉ\u0004iဉ\u0005jဉ\u0006kဉ\u0007mᐉ\bnဉ\toᐉ\npဉ\u000bqဉ\frဉ\rsဉ\u000etဉ\u000fuဉ\u0010vဉ\u0011wဉ\u0012xဉ\u0013yဉ\u0014zဉ\u0015{ဉ\u0016|ဉ\u0017}ဉ\u0018~ဉ\u0019\u007fဉ\u001a\u0080ဉ\u001b\u0081ဇ\u001c\u0082\u001b\u0083က\u001d\u0084ဉ\u001e\u0085Л\u0086ဉ\u001f\u0087ᐉ \u0088ဉ!\u0089ဉ\"\u008aЛ\u008bЛ\u008cЛ\u008dဂ#\u008eဂ$\u008fဂ%\u0090\u0014\u0091ဉ&\u0092ဉ'\u0093ဉ(\u0094ဉ)\u0095Л\u0097ဉ*\u0098ဉ+\u009aဉ,\u009bဉ-\u009cဉ.\u009dဇ/\u009eဉ0\u009fဉ1¢ဇ2£ဉ3¤ဉ4¥ဇ5¦ဉ6§ဇ7¨ဇ8©ဈ9ªဈ:«ဈ;\u00adဉ<®\u001b¯ဉ=°ဉ>±ဉ?²ဈ@³ဇA´ဉBµဉC", new Object[]{"bitField0_", "bitField1_", "bitField2_", "id_", "provider_", "venueId_", "categories_", "name_", "englishName_", "description_", "aliases_", "location_", "services_", "polygon_", "priceType_", "houseNumber_", "street_", "city_", "state_", "country_", "address_", "zip_", "phone_", "fax_", "email_", "twitter_", "url_", "brand_", "cityId_", "streetId_", "segmentId_", "deleted_", "externalProviders_", bo.class, "area_", "hours_", "images_", ce.class, "parking_", "entryExitPoints_", "children_", "parent_", "originalProducts_", de.class, "changedProducts_", r.class, "changeCandidates_", l.class, "creationDate_", "createdBy_", "lastUpdateDate_", "lastUpdateBy_", "lockLevel_", "approved_", "residential_", "unlisted_", "pendingRequests_", gw.class, "adLocked_", "adKeywords_", "urlDisplayName_", "noPreview_", "countryId_", "hasPendingUpdateRequestsByUser_", "createdByInfo_", "lastUpdatedByInfo_", "hasMoreData_", "parkingLotAttributes_", "brandId_", "isNull_", "emergencyShelterAttributes_", "shouldAppearInAutoComplete_", "entryPointOnStreet_", "providerId_", "adContext_", "adLogoId_", "mergedTo_", "mergedFrom_", fz.class, "evChargingStationAttributes_", "bookingOffers_", "timezone_", "currency_", "updatedImages_", "crisisLocationAttributes_", "trafficEventId_"});
            case 3:
                return new ed();
            case 4:
                return new ec(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ed> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ed.class) {
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

    public String getAdContext() {
        return this.adContext_;
    }

    public com.google.v.v getAdContextBytes() {
        return com.google.v.v.s(this.adContext_);
    }

    public fo getAdKeywords() {
        fo foVar = this.adKeywords_;
        return foVar == null ? fo.getDefaultInstance() : foVar;
    }

    public eq getAdLocked() {
        eq eqVar = this.adLocked_;
        return eqVar == null ? eq.getDefaultInstance() : eqVar;
    }

    public String getAdLogoId() {
        return this.adLogoId_;
    }

    public com.google.v.v getAdLogoIdBytes() {
        return com.google.v.v.s(this.adLogoId_);
    }

    public fq getAddress() {
        fq fqVar = this.address_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fo getAliases() {
        fo foVar = this.aliases_;
        return foVar == null ? fo.getDefaultInstance() : foVar;
    }

    public eq getApproved() {
        eq eqVar = this.approved_;
        return eqVar == null ? eq.getDefaultInstance() : eqVar;
    }

    public double getArea() {
        return this.area_;
    }

    public eo getBookingOffers() {
        eo eoVar = this.bookingOffers_;
        return eoVar == null ? eo.getDefaultInstance() : eoVar;
    }

    public fq getBrand() {
        fq fqVar = this.brand_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getBrandId() {
        fq fqVar = this.brandId_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fo getCategories() {
        fo foVar = this.categories_;
        return foVar == null ? fo.getDefaultInstance() : foVar;
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

    public fo getChildren() {
        fo foVar = this.children_;
        return foVar == null ? fo.getDefaultInstance() : foVar;
    }

    public fq getCity() {
        fq fqVar = this.city_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fg getCityId() {
        fg fgVar = this.cityId_;
        return fgVar == null ? fg.getDefaultInstance() : fgVar;
    }

    public fq getCountry() {
        fq fqVar = this.country_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fg getCountryId() {
        fg fgVar = this.countryId_;
        return fgVar == null ? fg.getDefaultInstance() : fgVar;
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

    public eu getCrisisLocationAttributes() {
        eu euVar = this.crisisLocationAttributes_;
        return euVar == null ? eu.getDefaultInstance() : euVar;
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

    public fq getDescription() {
        fq fqVar = this.description_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getEmail() {
        fq fqVar = this.email_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public ey getEmergencyShelterAttributes() {
        ey eyVar = this.emergencyShelterAttributes_;
        return eyVar == null ? ey.getDefaultInstance() : eyVar;
    }

    public fq getEnglishName() {
        fq fqVar = this.englishName_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fa getEntryExitPoints() {
        fa faVar = this.entryExitPoints_;
        return faVar == null ? fa.getDefaultInstance() : faVar;
    }

    public boolean getEntryPointOnStreet() {
        return this.entryPointOnStreet_;
    }

    public ew getEvChargingStationAttributes() {
        ew ewVar = this.evChargingStationAttributes_;
        return ewVar == null ? ew.getDefaultInstance() : ewVar;
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

    public fq getFax() {
        fq fqVar = this.fax_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public boolean getHasMoreData() {
        return this.hasMoreData_;
    }

    public boolean getHasPendingUpdateRequestsByUser() {
        return this.hasPendingUpdateRequestsByUser_;
    }

    public fi getHours() {
        fi fiVar = this.hours_;
        return fiVar == null ? fi.getDefaultInstance() : fiVar;
    }

    public fq getHouseNumber() {
        fq fqVar = this.houseNumber_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
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

    public es getLocation() {
        es esVar = this.location_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public fe getLockLevel() {
        fe feVar = this.lockLevel_;
        return feVar == null ? fe.getDefaultInstance() : feVar;
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

    public fq getName() {
        fq fqVar = this.name_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public eq getNoPreview() {
        eq eqVar = this.noPreview_;
        return eqVar == null ? eq.getDefaultInstance() : eqVar;
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

    public fq getParent() {
        fq fqVar = this.parent_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fk getParking() {
        fk fkVar = this.parking_;
        return fkVar == null ? fk.getDefaultInstance() : fkVar;
    }

    public fm getParkingLotAttributes() {
        fm fmVar = this.parkingLotAttributes_;
        return fmVar == null ? fm.getDefaultInstance() : fmVar;
    }

    public gw getPendingRequests(int i2) {
        return this.pendingRequests_.get(i2);
    }

    public int getPendingRequestsCount() {
        return this.pendingRequests_.size();
    }

    public List<gw> getPendingRequestsList() {
        return this.pendingRequests_;
    }

    public gx getPendingRequestsOrBuilder(int i2) {
        return this.pendingRequests_.get(i2);
    }

    public List<? extends gx> getPendingRequestsOrBuilderList() {
        return this.pendingRequests_;
    }

    public fq getPhone() {
        fq fqVar = this.phone_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fc getPolygon() {
        fc fcVar = this.polygon_;
        return fcVar == null ? fc.getDefaultInstance() : fcVar;
    }

    public fq getPriceType() {
        fq fqVar = this.priceType_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
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

    public eq getResidential() {
        eq eqVar = this.residential_;
        return eqVar == null ? eq.getDefaultInstance() : eqVar;
    }

    public fg getSegmentId() {
        fg fgVar = this.segmentId_;
        return fgVar == null ? fg.getDefaultInstance() : fgVar;
    }

    public fo getServices() {
        fo foVar = this.services_;
        return foVar == null ? fo.getDefaultInstance() : foVar;
    }

    public boolean getShouldAppearInAutoComplete() {
        return this.shouldAppearInAutoComplete_;
    }

    public fq getState() {
        fq fqVar = this.state_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getStreet() {
        fq fqVar = this.street_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fg getStreetId() {
        fg fgVar = this.streetId_;
        return fgVar == null ? fg.getDefaultInstance() : fgVar;
    }

    public fq getTimezone() {
        fq fqVar = this.timezone_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getTrafficEventId() {
        fq fqVar = this.trafficEventId_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getTwitter() {
        fq fqVar = this.twitter_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public eq getUnlisted() {
        eq eqVar = this.unlisted_;
        return eqVar == null ? eq.getDefaultInstance() : eqVar;
    }

    public boolean getUpdatedImages() {
        return this.updatedImages_;
    }

    public fq getUrl() {
        fq fqVar = this.url_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fq getUrlDisplayName() {
        fq fqVar = this.urlDisplayName_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public fz getVenueId() {
        fz fzVar = this.venueId_;
        return fzVar == null ? fz.getDefaultInstance() : fzVar;
    }

    public fq getZip() {
        fq fqVar = this.zip_;
        return fqVar == null ? fq.getDefaultInstance() : fqVar;
    }

    public boolean hasAdContext() {
        return (this.bitField1_ & 67108864) != 0;
    }

    public boolean hasAdKeywords() {
        return (this.bitField1_ & 2048) != 0;
    }

    public boolean hasAdLocked() {
        return (this.bitField1_ & 1024) != 0;
    }

    public boolean hasAdLogoId() {
        return (this.bitField1_ & 134217728) != 0;
    }

    public boolean hasAddress() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasAliases() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasApproved() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasArea() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasBookingOffers() {
        return (this.bitField1_ & 1073741824) != 0;
    }

    public boolean hasBrand() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasBrandId() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public boolean hasCategories() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasChildren() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasCityId() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasCountryId() {
        return (this.bitField1_ & 16384) != 0;
    }

    public boolean hasCreatedBy() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasCreatedByInfo() {
        return (this.bitField1_ & 65536) != 0;
    }

    public boolean hasCreationDate() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasCrisisLocationAttributes() {
        return (this.bitField2_ & 4) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField2_ & 1) != 0;
    }

    public boolean hasDeleted() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasEmail() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasEmergencyShelterAttributes() {
        return (this.bitField1_ & 4194304) != 0;
    }

    public boolean hasEnglishName() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEntryExitPoints() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasEntryPointOnStreet() {
        return (this.bitField1_ & 16777216) != 0;
    }

    public boolean hasEvChargingStationAttributes() {
        return (this.bitField1_ & 536870912) != 0;
    }

    public boolean hasFax() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasHasMoreData() {
        return (this.bitField1_ & 262144) != 0;
    }

    public boolean hasHasPendingUpdateRequestsByUser() {
        return (this.bitField1_ & 32768) != 0;
    }

    public boolean hasHours() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasHouseNumber() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsNull() {
        return (this.bitField1_ & 2097152) != 0;
    }

    public boolean hasLastUpdateDate() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasLastUpdatedByInfo() {
        return (this.bitField1_ & 131072) != 0;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasLockLevel() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasMergedTo() {
        return (this.bitField1_ & 268435456) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNoPreview() {
        return (this.bitField1_ & 8192) != 0;
    }

    public boolean hasParent() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasParking() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasParkingLotAttributes() {
        return (this.bitField1_ & 524288) != 0;
    }

    public boolean hasPhone() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasPolygon() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPriceType() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasProvider() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProviderId() {
        return (this.bitField1_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasResidential() {
        return (this.bitField1_ & 256) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasServices() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasShouldAppearInAutoComplete() {
        return (this.bitField1_ & 8388608) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasStreetId() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasTimezone() {
        return (this.bitField1_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasTrafficEventId() {
        return (this.bitField2_ & 8) != 0;
    }

    public boolean hasTwitter() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasUnlisted() {
        return (this.bitField1_ & 512) != 0;
    }

    public boolean hasUpdatedImages() {
        return (this.bitField2_ & 2) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasUrlDisplayName() {
        return (this.bitField1_ & 4096) != 0;
    }

    public boolean hasVenueId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasZip() {
        return (this.bitField0_ & 262144) != 0;
    }

    public static ec newBuilder(ed edVar) {
        return (ec) DEFAULT_INSTANCE.createBuilder(edVar);
    }

    public static ed parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ed) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ed parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ed parseFrom(com.google.v.z zVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ed parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
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
    public void addExternalProviders(bo boVar) {
        Objects.requireNonNull(boVar);
        ensureExternalProvidersIsMutable();
        this.externalProviders_.add(boVar);
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
    public void addPendingRequests(gw gwVar) {
        Objects.requireNonNull(gwVar);
        ensurePendingRequestsIsMutable();
        this.pendingRequests_.add(gwVar);
    }

    public static ed parseFrom(InputStream inputStream) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ed parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ed parseFrom(ByteBuffer byteBuffer) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ed parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ed parseFrom(byte[] bArr) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ed parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ed) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
