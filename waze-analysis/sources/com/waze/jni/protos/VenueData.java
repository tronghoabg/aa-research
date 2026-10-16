package com.waze.jni.protos;

import androidx.camera.video.AudioStats;
import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.CandidateProduct;
import com.waze.jni.protos.EVChargingVenue;
import com.waze.jni.protos.OpeningHours;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.Reporter;
import com.waze.jni.protos.VenueImage;
import com.waze.jni.protos.places.Address;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class VenueData extends du<VenueData, Builder> implements VenueDataOrBuilder {
    public static final int ABOUT_FIELD_NUMBER = 18;
    public static final int ADDRESS_FIELD_NUMBER = 9;
    public static final int ALIASES_FIELD_NUMBER = 16;
    public static final int BRAND_FIELD_NUMBER = 10;
    public static final int BRAND_ID_FIELD_NUMBER = 26;
    public static final int BUSINESS_STATUS_FIELD_NUMBER = 30;
    public static final int CATEGORIES_FIELD_NUMBER = 13;
    private static final VenueData DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 11;
    public static final int EV_CHARGING_VENUE_FIELD_NUMBER = 27;
    public static final int HAS_MORE_DATA_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGES_FIELD_NUMBER = 7;
    public static final int IS_RESIDENCE_FIELD_NUMBER = 5;
    public static final int IS_UPDATABLE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEW_IMAGE_IDS_FIELD_NUMBER = 8;
    public static final int OPENING_HOURS_FIELD_NUMBER = 15;
    private static volatile fo<VenueData> PARSER = null;
    public static final int PHONE_NUMBER_FIELD_NUMBER = 19;
    public static final int POSITION_FIELD_NUMBER = 12;
    public static final int PRICE_LEVEL_FIELD_NUMBER = 29;
    public static final int PRODUCTS_FIELD_NUMBER = 17;
    public static final int PROVIDER_ID_FIELD_NUMBER = 3;
    public static final int RATING_FIELD_NUMBER = 28;
    public static final int REPORTER_FIELD_NUMBER = 24;
    public static final int ROUTING_CONTEXT_FIELD_NUMBER = 23;
    public static final int SERVICES_FIELD_NUMBER = 14;
    public static final int TAKEOVER_IMAGE_FIELD_NUMBER = 31;
    public static final int TAKEOVER_LABEL_FIELD_NUMBER = 32;
    public static final int UPDATER_FIELD_NUMBER = 25;
    public static final int VENUE_CONTEXT_FIELD_NUMBER = 22;
    public static final int WEBSITE_DISPLAY_TEXT_FIELD_NUMBER = 21;
    public static final int WEBSITE_FIELD_NUMBER = 20;
    private Address address_;
    private int bitField0_;
    private int businessStatus_;
    private EVChargingVenue evChargingVenue_;
    private boolean hasMoreData_;
    private boolean isResidence_;
    private boolean isUpdatable_;
    private Position.IntPosition position_;
    private int priceLevel_;
    private double rating_;
    private Reporter reporter_;
    private Reporter updater_;
    private String id_ = "";
    private String name_ = "";
    private String providerId_ = "";
    private eo<VenueImage> images_ = emptyProtobufList();
    private eo<String> newImageIds_ = emptyProtobufList();
    private String brandId_ = "";
    private String brand_ = "";
    private String details_ = "";
    private eo<String> categories_ = emptyProtobufList();
    private eo<String> services_ = emptyProtobufList();
    private eo<OpeningHours> openingHours_ = emptyProtobufList();
    private eo<String> aliases_ = emptyProtobufList();
    private eo<CandidateProduct> products_ = emptyProtobufList();
    private String about_ = "";
    private String phoneNumber_ = "";
    private String website_ = "";
    private String websiteDisplayText_ = "";
    private String venueContext_ = "";
    private String routingContext_ = "";
    private String takeoverImage_ = "";
    private String takeoverLabel_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.VenueData$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        VenueData venueData = new VenueData();
        DEFAULT_INSTANCE = venueData;
        du.registerDefaultInstance(VenueData.class, venueData);
    }

    private VenueData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliases(String str) {
        Objects.requireNonNull(str);
        ensureAliasesIsMutable();
        this.aliases_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAliasesBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureAliasesIsMutable();
        this.aliases_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAliases(Iterable<String> iterable) {
        ensureAliasesIsMutable();
        c.addAll(iterable, this.aliases_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCategories(Iterable<String> iterable) {
        ensureCategoriesIsMutable();
        c.addAll(iterable, this.categories_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllImages(Iterable<? extends VenueImage> iterable) {
        ensureImagesIsMutable();
        c.addAll(iterable, this.images_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNewImageIds(Iterable<String> iterable) {
        ensureNewImageIdsIsMutable();
        c.addAll(iterable, this.newImageIds_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOpeningHours(Iterable<? extends OpeningHours> iterable) {
        ensureOpeningHoursIsMutable();
        c.addAll(iterable, this.openingHours_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducts(Iterable<? extends CandidateProduct> iterable) {
        ensureProductsIsMutable();
        c.addAll(iterable, this.products_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServices(Iterable<String> iterable) {
        ensureServicesIsMutable();
        c.addAll(iterable, this.services_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategories(String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCategoriesBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureCategoriesIsMutable();
        this.categories_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(int i2, VenueImage venueImage) {
        Objects.requireNonNull(venueImage);
        ensureImagesIsMutable();
        this.images_.add(i2, venueImage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNewImageIds(String str) {
        Objects.requireNonNull(str);
        ensureNewImageIdsIsMutable();
        this.newImageIds_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNewImageIdsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureNewImageIdsIsMutable();
        this.newImageIds_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpeningHours(int i2, OpeningHours openingHours) {
        Objects.requireNonNull(openingHours);
        ensureOpeningHoursIsMutable();
        this.openingHours_.add(i2, openingHours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducts(int i2, CandidateProduct candidateProduct) {
        Objects.requireNonNull(candidateProduct);
        ensureProductsIsMutable();
        this.products_.add(i2, candidateProduct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServices(String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServicesBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureServicesIsMutable();
        this.services_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbout() {
        this.bitField0_ &= -2049;
        this.about_ = getDefaultInstance().getAbout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAliases() {
        this.aliases_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrand() {
        this.bitField0_ &= -257;
        this.brand_ = getDefaultInstance().getBrand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.bitField0_ &= -129;
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessStatus() {
        this.bitField0_ &= -4194305;
        this.businessStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategories() {
        this.categories_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.bitField0_ &= -513;
        this.details_ = getDefaultInstance().getDetails();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvChargingVenue() {
        this.evChargingVenue_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMoreData() {
        this.bitField0_ &= -33;
        this.hasMoreData_ = false;
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
    public void clearIsResidence() {
        this.bitField0_ &= -17;
        this.isResidence_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUpdatable() {
        this.bitField0_ &= -9;
        this.isUpdatable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -3;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewImageIds() {
        this.newImageIds_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpeningHours() {
        this.openingHours_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhoneNumber() {
        this.bitField0_ &= -4097;
        this.phoneNumber_ = getDefaultInstance().getPhoneNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceLevel() {
        this.bitField0_ &= -2097153;
        this.priceLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducts() {
        this.products_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProviderId() {
        this.bitField0_ &= -5;
        this.providerId_ = getDefaultInstance().getProviderId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.bitField0_ &= -1048577;
        this.rating_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReporter() {
        this.reporter_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingContext() {
        this.bitField0_ &= -65537;
        this.routingContext_ = getDefaultInstance().getRoutingContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServices() {
        this.services_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeoverImage() {
        this.bitField0_ &= -8388609;
        this.takeoverImage_ = getDefaultInstance().getTakeoverImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTakeoverLabel() {
        this.bitField0_ &= -16777217;
        this.takeoverLabel_ = getDefaultInstance().getTakeoverLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdater() {
        this.updater_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueContext() {
        this.bitField0_ &= -32769;
        this.venueContext_ = getDefaultInstance().getVenueContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebsite() {
        this.bitField0_ &= -8193;
        this.website_ = getDefaultInstance().getWebsite();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebsiteDisplayText() {
        this.bitField0_ &= -16385;
        this.websiteDisplayText_ = getDefaultInstance().getWebsiteDisplayText();
    }

    private void ensureAliasesIsMutable() {
        eo<String> eoVar = this.aliases_;
        if (eoVar.c()) {
            return;
        }
        this.aliases_ = du.mutableCopy(eoVar);
    }

    private void ensureCategoriesIsMutable() {
        eo<String> eoVar = this.categories_;
        if (eoVar.c()) {
            return;
        }
        this.categories_ = du.mutableCopy(eoVar);
    }

    private void ensureImagesIsMutable() {
        eo<VenueImage> eoVar = this.images_;
        if (eoVar.c()) {
            return;
        }
        this.images_ = du.mutableCopy(eoVar);
    }

    private void ensureNewImageIdsIsMutable() {
        eo<String> eoVar = this.newImageIds_;
        if (eoVar.c()) {
            return;
        }
        this.newImageIds_ = du.mutableCopy(eoVar);
    }

    private void ensureOpeningHoursIsMutable() {
        eo<OpeningHours> eoVar = this.openingHours_;
        if (eoVar.c()) {
            return;
        }
        this.openingHours_ = du.mutableCopy(eoVar);
    }

    private void ensureProductsIsMutable() {
        eo<CandidateProduct> eoVar = this.products_;
        if (eoVar.c()) {
            return;
        }
        this.products_ = du.mutableCopy(eoVar);
    }

    private void ensureServicesIsMutable() {
        eo<String> eoVar = this.services_;
        if (eoVar.c()) {
            return;
        }
        this.services_ = du.mutableCopy(eoVar);
    }

    public static VenueData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddress(Address address) {
        Objects.requireNonNull(address);
        Address address2 = this.address_;
        if (address2 != null && address2 != Address.getDefaultInstance()) {
            Address.Builder builderNewBuilder = Address.newBuilder(address2);
            builderNewBuilder.mergeFrom((Address.Builder) address);
            address = builderNewBuilder.buildPartial();
        }
        this.address_ = address;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvChargingVenue(EVChargingVenue eVChargingVenue) {
        Objects.requireNonNull(eVChargingVenue);
        EVChargingVenue eVChargingVenue2 = this.evChargingVenue_;
        if (eVChargingVenue2 != null && eVChargingVenue2 != EVChargingVenue.getDefaultInstance()) {
            EVChargingVenue.Builder builderNewBuilder = EVChargingVenue.newBuilder(eVChargingVenue2);
            builderNewBuilder.mergeFrom((EVChargingVenue.Builder) eVChargingVenue);
            eVChargingVenue = builderNewBuilder.buildPartial();
        }
        this.evChargingVenue_ = eVChargingVenue;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReporter(Reporter reporter) {
        Objects.requireNonNull(reporter);
        Reporter reporter2 = this.reporter_;
        if (reporter2 != null && reporter2 != Reporter.getDefaultInstance()) {
            Reporter.Builder builderNewBuilder = Reporter.newBuilder(reporter2);
            builderNewBuilder.mergeFrom((Reporter.Builder) reporter);
            reporter = builderNewBuilder.buildPartial();
        }
        this.reporter_ = reporter;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdater(Reporter reporter) {
        Objects.requireNonNull(reporter);
        Reporter reporter2 = this.updater_;
        if (reporter2 != null && reporter2 != Reporter.getDefaultInstance()) {
            Reporter.Builder builderNewBuilder = Reporter.newBuilder(reporter2);
            builderNewBuilder.mergeFrom((Reporter.Builder) reporter);
            reporter = builderNewBuilder.buildPartial();
        }
        this.updater_ = reporter;
        this.bitField0_ |= 262144;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static VenueData parseDelimitedFrom(InputStream inputStream) {
        return (VenueData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueData parseFrom(v vVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<VenueData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeImages(int i2) {
        ensureImagesIsMutable();
        this.images_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOpeningHours(int i2) {
        ensureOpeningHoursIsMutable();
        this.openingHours_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProducts(int i2) {
        ensureProductsIsMutable();
        this.products_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbout(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.about_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.about_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(Address address) {
        Objects.requireNonNull(address);
        this.address_ = address;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAliases(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAliasesIsMutable();
        this.aliases_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrand(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.brand_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.brand_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.brandId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.brandId_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessStatus(BusinessStatus businessStatus) {
        this.businessStatus_ = businessStatus.getNumber();
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessStatusValue(int i2) {
        this.bitField0_ |= 4194304;
        this.businessStatus_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategories(int i2, String str) {
        Objects.requireNonNull(str);
        ensureCategoriesIsMutable();
        this.categories_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.details_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.details_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvChargingVenue(EVChargingVenue eVChargingVenue) {
        Objects.requireNonNull(eVChargingVenue);
        this.evChargingVenue_ = eVChargingVenue;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMoreData(boolean z) {
        this.bitField0_ |= 32;
        this.hasMoreData_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.id_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImages(int i2, VenueImage venueImage) {
        Objects.requireNonNull(venueImage);
        ensureImagesIsMutable();
        this.images_.set(i2, venueImage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsResidence(boolean z) {
        this.bitField0_ |= 16;
        this.isResidence_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUpdatable(boolean z) {
        this.bitField0_ |= 8;
        this.isUpdatable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.name_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewImageIds(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNewImageIdsIsMutable();
        this.newImageIds_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpeningHours(int i2, OpeningHours openingHours) {
        Objects.requireNonNull(openingHours);
        ensureOpeningHoursIsMutable();
        this.openingHours_.set(i2, openingHours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneNumber(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4096;
        this.phoneNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhoneNumberBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.phoneNumber_ = vVar.u();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceLevel(int i2) {
        this.bitField0_ |= 2097152;
        this.priceLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducts(int i2, CandidateProduct candidateProduct) {
        Objects.requireNonNull(candidateProduct);
        ensureProductsIsMutable();
        this.products_.set(i2, candidateProduct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.providerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProviderIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.providerId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(double d2) {
        this.bitField0_ |= 1048576;
        this.rating_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReporter(Reporter reporter) {
        Objects.requireNonNull(reporter);
        this.reporter_ = reporter;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 65536;
        this.routingContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routingContext_ = vVar.u();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServices(int i2, String str) {
        Objects.requireNonNull(str);
        ensureServicesIsMutable();
        this.services_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverImage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8388608;
        this.takeoverImage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverImageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.takeoverImage_ = vVar.u();
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.takeoverLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeoverLabelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.takeoverLabel_ = vVar.u();
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdater(Reporter reporter) {
        Objects.requireNonNull(reporter);
        this.updater_ = reporter;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContext(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.venueContext_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueContextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueContext_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsite(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8192;
        this.website_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsiteBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.website_ = vVar.u();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsiteDisplayText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16384;
        this.websiteDisplayText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsiteDisplayTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.websiteDisplayText_ = vVar.u();
        this.bitField0_ |= 16384;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000 \u0000\u0001\u0001  \u0000\u0007\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007\u001b\bȚ\tဉ\u0006\nለ\b\u000bለ\t\fဉ\n\rȚ\u000eȚ\u000f\u001b\u0010Ț\u0011\u001b\u0012ለ\u000b\u0013ለ\f\u0014ለ\r\u0015ለ\u000e\u0016ለ\u000f\u0017ለ\u0010\u0018ဉ\u0011\u0019ဉ\u0012\u001aለ\u0007\u001bဉ\u0013\u001cက\u0014\u001dင\u0015\u001eဌ\u0016\u001fለ\u0017 ለ\u0018", new Object[]{"bitField0_", "id_", "name_", "providerId_", "isUpdatable_", "isResidence_", "hasMoreData_", "images_", VenueImage.class, "newImageIds_", "address_", "brand_", "details_", "position_", "categories_", "services_", "openingHours_", OpeningHours.class, "aliases_", "products_", CandidateProduct.class, "about_", "phoneNumber_", "website_", "websiteDisplayText_", "venueContext_", "routingContext_", "reporter_", "updater_", "brandId_", "evChargingVenue_", "rating_", "priceLevel_", "businessStatus_", "takeoverImage_", "takeoverLabel_"});
        }
        if (iOrdinal == 3) {
            return new VenueData();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<VenueData> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (VenueData.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getAbout() {
        return this.about_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getAboutBytes() {
        return v.s(this.about_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public Address getAddress() {
        Address address = this.address_;
        return address == null ? Address.getDefaultInstance() : address;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getAliases(int i2) {
        return this.aliases_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getAliasesBytes(int i2) {
        return v.s(this.aliases_.get(i2));
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getBrand() {
        return this.brand_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getBrandBytes() {
        return v.s(this.brand_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getBrandId() {
        return this.brandId_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getBrandIdBytes() {
        return v.s(this.brandId_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public BusinessStatus getBusinessStatus() {
        BusinessStatus businessStatusForNumber = BusinessStatus.forNumber(this.businessStatus_);
        return businessStatusForNumber == null ? BusinessStatus.UNRECOGNIZED : businessStatusForNumber;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getBusinessStatusValue() {
        return this.businessStatus_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getCategories(int i2) {
        return this.categories_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getCategoriesBytes(int i2) {
        return v.s(this.categories_.get(i2));
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getCategoriesCount() {
        return this.categories_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<String> getCategoriesList() {
        return this.categories_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getDetails() {
        return this.details_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getDetailsBytes() {
        return v.s(this.details_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public EVChargingVenue getEvChargingVenue() {
        EVChargingVenue eVChargingVenue = this.evChargingVenue_;
        return eVChargingVenue == null ? EVChargingVenue.getDefaultInstance() : eVChargingVenue;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean getHasMoreData() {
        return this.hasMoreData_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getIdBytes() {
        return v.s(this.id_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public VenueImage getImages(int i2) {
        return this.images_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getImagesCount() {
        return this.images_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<VenueImage> getImagesList() {
        return this.images_;
    }

    public VenueImageOrBuilder getImagesOrBuilder(int i2) {
        return this.images_.get(i2);
    }

    public List<? extends VenueImageOrBuilder> getImagesOrBuilderList() {
        return this.images_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean getIsResidence() {
        return this.isResidence_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean getIsUpdatable() {
        return this.isUpdatable_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getNameBytes() {
        return v.s(this.name_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getNewImageIds(int i2) {
        return this.newImageIds_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getNewImageIdsBytes(int i2) {
        return v.s(this.newImageIds_.get(i2));
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getNewImageIdsCount() {
        return this.newImageIds_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<String> getNewImageIdsList() {
        return this.newImageIds_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public OpeningHours getOpeningHours(int i2) {
        return this.openingHours_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getOpeningHoursCount() {
        return this.openingHours_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<OpeningHours> getOpeningHoursList() {
        return this.openingHours_;
    }

    public OpeningHoursOrBuilder getOpeningHoursOrBuilder(int i2) {
        return this.openingHours_.get(i2);
    }

    public List<? extends OpeningHoursOrBuilder> getOpeningHoursOrBuilderList() {
        return this.openingHours_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getPhoneNumber() {
        return this.phoneNumber_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getPhoneNumberBytes() {
        return v.s(this.phoneNumber_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getPriceLevel() {
        return this.priceLevel_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public CandidateProduct getProducts(int i2) {
        return this.products_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getProductsCount() {
        return this.products_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<CandidateProduct> getProductsList() {
        return this.products_;
    }

    public CandidateProductOrBuilder getProductsOrBuilder(int i2) {
        return this.products_.get(i2);
    }

    public List<? extends CandidateProductOrBuilder> getProductsOrBuilderList() {
        return this.products_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getProviderId() {
        return this.providerId_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getProviderIdBytes() {
        return v.s(this.providerId_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public double getRating() {
        return this.rating_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public Reporter getReporter() {
        Reporter reporter = this.reporter_;
        return reporter == null ? Reporter.getDefaultInstance() : reporter;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getRoutingContext() {
        return this.routingContext_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getRoutingContextBytes() {
        return v.s(this.routingContext_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getServices(int i2) {
        return this.services_.get(i2);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getServicesBytes(int i2) {
        return v.s(this.services_.get(i2));
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public int getServicesCount() {
        return this.services_.size();
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public List<String> getServicesList() {
        return this.services_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getTakeoverImage() {
        return this.takeoverImage_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getTakeoverImageBytes() {
        return v.s(this.takeoverImage_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getTakeoverLabel() {
        return this.takeoverLabel_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getTakeoverLabelBytes() {
        return v.s(this.takeoverLabel_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public Reporter getUpdater() {
        Reporter reporter = this.updater_;
        return reporter == null ? Reporter.getDefaultInstance() : reporter;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getVenueContext() {
        return this.venueContext_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getVenueContextBytes() {
        return v.s(this.venueContext_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getWebsite() {
        return this.website_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getWebsiteBytes() {
        return v.s(this.website_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public String getWebsiteDisplayText() {
        return this.websiteDisplayText_;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public v getWebsiteDisplayTextBytes() {
        return v.s(this.websiteDisplayText_);
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasAbout() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasAddress() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasBrand() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasBrandId() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasBusinessStatus() {
        return (this.bitField0_ & 4194304) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasDetails() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasEvChargingVenue() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasHasMoreData() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasIsResidence() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasIsUpdatable() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasPhoneNumber() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasPriceLevel() {
        return (this.bitField0_ & 2097152) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasProviderId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasRating() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasReporter() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasRoutingContext() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasTakeoverImage() {
        return (this.bitField0_ & 8388608) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasTakeoverLabel() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasUpdater() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasVenueContext() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasWebsite() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.waze.jni.protos.VenueDataOrBuilder
    public boolean hasWebsiteDisplayText() {
        return (this.bitField0_ & 16384) != 0;
    }

    public static Builder newBuilder(VenueData venueData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(venueData);
    }

    public static VenueData parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (VenueData) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueData parseFrom(v vVar, de deVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static VenueData parseFrom(z zVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static VenueData parseFrom(z zVar, de deVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(VenueImage venueImage) {
        Objects.requireNonNull(venueImage);
        ensureImagesIsMutable();
        this.images_.add(venueImage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOpeningHours(OpeningHours openingHours) {
        Objects.requireNonNull(openingHours);
        ensureOpeningHoursIsMutable();
        this.openingHours_.add(openingHours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducts(CandidateProduct candidateProduct) {
        Objects.requireNonNull(candidateProduct);
        ensureProductsIsMutable();
        this.products_.add(candidateProduct);
    }

    public static VenueData parseFrom(InputStream inputStream) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VenueData parseFrom(InputStream inputStream, de deVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static VenueData parseFrom(ByteBuffer byteBuffer) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static VenueData parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<VenueData, Builder> implements VenueDataOrBuilder {
        private Builder() {
            super(VenueData.DEFAULT_INSTANCE);
        }

        public Builder addAliases(String str) {
            copyOnWrite();
            ((VenueData) this.instance).addAliases(str);
            return this;
        }

        public Builder addAliasesBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).addAliasesBytes(vVar);
            return this;
        }

        public Builder addAllAliases(Iterable<String> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllAliases(iterable);
            return this;
        }

        public Builder addAllCategories(Iterable<String> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllCategories(iterable);
            return this;
        }

        public Builder addAllImages(Iterable<? extends VenueImage> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllImages(iterable);
            return this;
        }

        public Builder addAllNewImageIds(Iterable<String> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllNewImageIds(iterable);
            return this;
        }

        public Builder addAllOpeningHours(Iterable<? extends OpeningHours> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllOpeningHours(iterable);
            return this;
        }

        public Builder addAllProducts(Iterable<? extends CandidateProduct> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllProducts(iterable);
            return this;
        }

        public Builder addAllServices(Iterable<String> iterable) {
            copyOnWrite();
            ((VenueData) this.instance).addAllServices(iterable);
            return this;
        }

        public Builder addCategories(String str) {
            copyOnWrite();
            ((VenueData) this.instance).addCategories(str);
            return this;
        }

        public Builder addCategoriesBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).addCategoriesBytes(vVar);
            return this;
        }

        public Builder addImages(int i2, VenueImage.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addImages(i2, builder.build());
            return this;
        }

        public Builder addNewImageIds(String str) {
            copyOnWrite();
            ((VenueData) this.instance).addNewImageIds(str);
            return this;
        }

        public Builder addNewImageIdsBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).addNewImageIdsBytes(vVar);
            return this;
        }

        public Builder addOpeningHours(int i2, OpeningHours.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addOpeningHours(i2, builder.build());
            return this;
        }

        public Builder addProducts(int i2, CandidateProduct.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addProducts(i2, builder.build());
            return this;
        }

        public Builder addServices(String str) {
            copyOnWrite();
            ((VenueData) this.instance).addServices(str);
            return this;
        }

        public Builder addServicesBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).addServicesBytes(vVar);
            return this;
        }

        public Builder clearAbout() {
            copyOnWrite();
            ((VenueData) this.instance).clearAbout();
            return this;
        }

        public Builder clearAddress() {
            copyOnWrite();
            ((VenueData) this.instance).clearAddress();
            return this;
        }

        public Builder clearAliases() {
            copyOnWrite();
            ((VenueData) this.instance).clearAliases();
            return this;
        }

        public Builder clearBrand() {
            copyOnWrite();
            ((VenueData) this.instance).clearBrand();
            return this;
        }

        public Builder clearBrandId() {
            copyOnWrite();
            ((VenueData) this.instance).clearBrandId();
            return this;
        }

        public Builder clearBusinessStatus() {
            copyOnWrite();
            ((VenueData) this.instance).clearBusinessStatus();
            return this;
        }

        public Builder clearCategories() {
            copyOnWrite();
            ((VenueData) this.instance).clearCategories();
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((VenueData) this.instance).clearDetails();
            return this;
        }

        public Builder clearEvChargingVenue() {
            copyOnWrite();
            ((VenueData) this.instance).clearEvChargingVenue();
            return this;
        }

        public Builder clearHasMoreData() {
            copyOnWrite();
            ((VenueData) this.instance).clearHasMoreData();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((VenueData) this.instance).clearId();
            return this;
        }

        public Builder clearImages() {
            copyOnWrite();
            ((VenueData) this.instance).clearImages();
            return this;
        }

        public Builder clearIsResidence() {
            copyOnWrite();
            ((VenueData) this.instance).clearIsResidence();
            return this;
        }

        public Builder clearIsUpdatable() {
            copyOnWrite();
            ((VenueData) this.instance).clearIsUpdatable();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((VenueData) this.instance).clearName();
            return this;
        }

        public Builder clearNewImageIds() {
            copyOnWrite();
            ((VenueData) this.instance).clearNewImageIds();
            return this;
        }

        public Builder clearOpeningHours() {
            copyOnWrite();
            ((VenueData) this.instance).clearOpeningHours();
            return this;
        }

        public Builder clearPhoneNumber() {
            copyOnWrite();
            ((VenueData) this.instance).clearPhoneNumber();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((VenueData) this.instance).clearPosition();
            return this;
        }

        public Builder clearPriceLevel() {
            copyOnWrite();
            ((VenueData) this.instance).clearPriceLevel();
            return this;
        }

        public Builder clearProducts() {
            copyOnWrite();
            ((VenueData) this.instance).clearProducts();
            return this;
        }

        public Builder clearProviderId() {
            copyOnWrite();
            ((VenueData) this.instance).clearProviderId();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((VenueData) this.instance).clearRating();
            return this;
        }

        public Builder clearReporter() {
            copyOnWrite();
            ((VenueData) this.instance).clearReporter();
            return this;
        }

        public Builder clearRoutingContext() {
            copyOnWrite();
            ((VenueData) this.instance).clearRoutingContext();
            return this;
        }

        public Builder clearServices() {
            copyOnWrite();
            ((VenueData) this.instance).clearServices();
            return this;
        }

        public Builder clearTakeoverImage() {
            copyOnWrite();
            ((VenueData) this.instance).clearTakeoverImage();
            return this;
        }

        public Builder clearTakeoverLabel() {
            copyOnWrite();
            ((VenueData) this.instance).clearTakeoverLabel();
            return this;
        }

        public Builder clearUpdater() {
            copyOnWrite();
            ((VenueData) this.instance).clearUpdater();
            return this;
        }

        public Builder clearVenueContext() {
            copyOnWrite();
            ((VenueData) this.instance).clearVenueContext();
            return this;
        }

        public Builder clearWebsite() {
            copyOnWrite();
            ((VenueData) this.instance).clearWebsite();
            return this;
        }

        public Builder clearWebsiteDisplayText() {
            copyOnWrite();
            ((VenueData) this.instance).clearWebsiteDisplayText();
            return this;
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getAbout() {
            return ((VenueData) this.instance).getAbout();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getAboutBytes() {
            return ((VenueData) this.instance).getAboutBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public Address getAddress() {
            return ((VenueData) this.instance).getAddress();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getAliases(int i2) {
            return ((VenueData) this.instance).getAliases(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getAliasesBytes(int i2) {
            return ((VenueData) this.instance).getAliasesBytes(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getAliasesCount() {
            return ((VenueData) this.instance).getAliasesCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<String> getAliasesList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getAliasesList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getBrand() {
            return ((VenueData) this.instance).getBrand();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getBrandBytes() {
            return ((VenueData) this.instance).getBrandBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getBrandId() {
            return ((VenueData) this.instance).getBrandId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getBrandIdBytes() {
            return ((VenueData) this.instance).getBrandIdBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public BusinessStatus getBusinessStatus() {
            return ((VenueData) this.instance).getBusinessStatus();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getBusinessStatusValue() {
            return ((VenueData) this.instance).getBusinessStatusValue();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getCategories(int i2) {
            return ((VenueData) this.instance).getCategories(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getCategoriesBytes(int i2) {
            return ((VenueData) this.instance).getCategoriesBytes(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getCategoriesCount() {
            return ((VenueData) this.instance).getCategoriesCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<String> getCategoriesList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getCategoriesList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getDetails() {
            return ((VenueData) this.instance).getDetails();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getDetailsBytes() {
            return ((VenueData) this.instance).getDetailsBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public EVChargingVenue getEvChargingVenue() {
            return ((VenueData) this.instance).getEvChargingVenue();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean getHasMoreData() {
            return ((VenueData) this.instance).getHasMoreData();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getId() {
            return ((VenueData) this.instance).getId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getIdBytes() {
            return ((VenueData) this.instance).getIdBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public VenueImage getImages(int i2) {
            return ((VenueData) this.instance).getImages(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getImagesCount() {
            return ((VenueData) this.instance).getImagesCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<VenueImage> getImagesList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getImagesList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean getIsResidence() {
            return ((VenueData) this.instance).getIsResidence();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean getIsUpdatable() {
            return ((VenueData) this.instance).getIsUpdatable();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getName() {
            return ((VenueData) this.instance).getName();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getNameBytes() {
            return ((VenueData) this.instance).getNameBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getNewImageIds(int i2) {
            return ((VenueData) this.instance).getNewImageIds(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getNewImageIdsBytes(int i2) {
            return ((VenueData) this.instance).getNewImageIdsBytes(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getNewImageIdsCount() {
            return ((VenueData) this.instance).getNewImageIdsCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<String> getNewImageIdsList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getNewImageIdsList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public OpeningHours getOpeningHours(int i2) {
            return ((VenueData) this.instance).getOpeningHours(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getOpeningHoursCount() {
            return ((VenueData) this.instance).getOpeningHoursCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<OpeningHours> getOpeningHoursList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getOpeningHoursList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getPhoneNumber() {
            return ((VenueData) this.instance).getPhoneNumber();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getPhoneNumberBytes() {
            return ((VenueData) this.instance).getPhoneNumberBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public Position.IntPosition getPosition() {
            return ((VenueData) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getPriceLevel() {
            return ((VenueData) this.instance).getPriceLevel();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public CandidateProduct getProducts(int i2) {
            return ((VenueData) this.instance).getProducts(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getProductsCount() {
            return ((VenueData) this.instance).getProductsCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<CandidateProduct> getProductsList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getProductsList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getProviderId() {
            return ((VenueData) this.instance).getProviderId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getProviderIdBytes() {
            return ((VenueData) this.instance).getProviderIdBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public double getRating() {
            return ((VenueData) this.instance).getRating();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public Reporter getReporter() {
            return ((VenueData) this.instance).getReporter();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getRoutingContext() {
            return ((VenueData) this.instance).getRoutingContext();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getRoutingContextBytes() {
            return ((VenueData) this.instance).getRoutingContextBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getServices(int i2) {
            return ((VenueData) this.instance).getServices(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getServicesBytes(int i2) {
            return ((VenueData) this.instance).getServicesBytes(i2);
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public int getServicesCount() {
            return ((VenueData) this.instance).getServicesCount();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public List<String> getServicesList() {
            return DesugarCollections.unmodifiableList(((VenueData) this.instance).getServicesList());
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getTakeoverImage() {
            return ((VenueData) this.instance).getTakeoverImage();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getTakeoverImageBytes() {
            return ((VenueData) this.instance).getTakeoverImageBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getTakeoverLabel() {
            return ((VenueData) this.instance).getTakeoverLabel();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getTakeoverLabelBytes() {
            return ((VenueData) this.instance).getTakeoverLabelBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public Reporter getUpdater() {
            return ((VenueData) this.instance).getUpdater();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getVenueContext() {
            return ((VenueData) this.instance).getVenueContext();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getVenueContextBytes() {
            return ((VenueData) this.instance).getVenueContextBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getWebsite() {
            return ((VenueData) this.instance).getWebsite();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getWebsiteBytes() {
            return ((VenueData) this.instance).getWebsiteBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public String getWebsiteDisplayText() {
            return ((VenueData) this.instance).getWebsiteDisplayText();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public v getWebsiteDisplayTextBytes() {
            return ((VenueData) this.instance).getWebsiteDisplayTextBytes();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasAbout() {
            return ((VenueData) this.instance).hasAbout();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasAddress() {
            return ((VenueData) this.instance).hasAddress();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasBrand() {
            return ((VenueData) this.instance).hasBrand();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasBrandId() {
            return ((VenueData) this.instance).hasBrandId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasBusinessStatus() {
            return ((VenueData) this.instance).hasBusinessStatus();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasDetails() {
            return ((VenueData) this.instance).hasDetails();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasEvChargingVenue() {
            return ((VenueData) this.instance).hasEvChargingVenue();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasHasMoreData() {
            return ((VenueData) this.instance).hasHasMoreData();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasId() {
            return ((VenueData) this.instance).hasId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasIsResidence() {
            return ((VenueData) this.instance).hasIsResidence();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasIsUpdatable() {
            return ((VenueData) this.instance).hasIsUpdatable();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasName() {
            return ((VenueData) this.instance).hasName();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasPhoneNumber() {
            return ((VenueData) this.instance).hasPhoneNumber();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasPosition() {
            return ((VenueData) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasPriceLevel() {
            return ((VenueData) this.instance).hasPriceLevel();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasProviderId() {
            return ((VenueData) this.instance).hasProviderId();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasRating() {
            return ((VenueData) this.instance).hasRating();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasReporter() {
            return ((VenueData) this.instance).hasReporter();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasRoutingContext() {
            return ((VenueData) this.instance).hasRoutingContext();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasTakeoverImage() {
            return ((VenueData) this.instance).hasTakeoverImage();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasTakeoverLabel() {
            return ((VenueData) this.instance).hasTakeoverLabel();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasUpdater() {
            return ((VenueData) this.instance).hasUpdater();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasVenueContext() {
            return ((VenueData) this.instance).hasVenueContext();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasWebsite() {
            return ((VenueData) this.instance).hasWebsite();
        }

        @Override // com.waze.jni.protos.VenueDataOrBuilder
        public boolean hasWebsiteDisplayText() {
            return ((VenueData) this.instance).hasWebsiteDisplayText();
        }

        public Builder mergeAddress(Address address) {
            copyOnWrite();
            ((VenueData) this.instance).mergeAddress(address);
            return this;
        }

        public Builder mergeEvChargingVenue(EVChargingVenue eVChargingVenue) {
            copyOnWrite();
            ((VenueData) this.instance).mergeEvChargingVenue(eVChargingVenue);
            return this;
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((VenueData) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder mergeReporter(Reporter reporter) {
            copyOnWrite();
            ((VenueData) this.instance).mergeReporter(reporter);
            return this;
        }

        public Builder mergeUpdater(Reporter reporter) {
            copyOnWrite();
            ((VenueData) this.instance).mergeUpdater(reporter);
            return this;
        }

        public Builder removeImages(int i2) {
            copyOnWrite();
            ((VenueData) this.instance).removeImages(i2);
            return this;
        }

        public Builder removeOpeningHours(int i2) {
            copyOnWrite();
            ((VenueData) this.instance).removeOpeningHours(i2);
            return this;
        }

        public Builder removeProducts(int i2) {
            copyOnWrite();
            ((VenueData) this.instance).removeProducts(i2);
            return this;
        }

        public Builder setAbout(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setAbout(str);
            return this;
        }

        public Builder setAboutBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setAboutBytes(vVar);
            return this;
        }

        public Builder setAddress(Address.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setAddress(builder.build());
            return this;
        }

        public Builder setAliases(int i2, String str) {
            copyOnWrite();
            ((VenueData) this.instance).setAliases(i2, str);
            return this;
        }

        public Builder setBrand(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setBrand(str);
            return this;
        }

        public Builder setBrandBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setBrandBytes(vVar);
            return this;
        }

        public Builder setBrandId(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setBrandId(str);
            return this;
        }

        public Builder setBrandIdBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setBrandIdBytes(vVar);
            return this;
        }

        public Builder setBusinessStatus(BusinessStatus businessStatus) {
            copyOnWrite();
            ((VenueData) this.instance).setBusinessStatus(businessStatus);
            return this;
        }

        public Builder setBusinessStatusValue(int i2) {
            copyOnWrite();
            ((VenueData) this.instance).setBusinessStatusValue(i2);
            return this;
        }

        public Builder setCategories(int i2, String str) {
            copyOnWrite();
            ((VenueData) this.instance).setCategories(i2, str);
            return this;
        }

        public Builder setDetails(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setDetails(str);
            return this;
        }

        public Builder setDetailsBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setDetailsBytes(vVar);
            return this;
        }

        public Builder setEvChargingVenue(EVChargingVenue.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setEvChargingVenue(builder.build());
            return this;
        }

        public Builder setHasMoreData(boolean z) {
            copyOnWrite();
            ((VenueData) this.instance).setHasMoreData(z);
            return this;
        }

        public Builder setId(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setId(str);
            return this;
        }

        public Builder setIdBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setIdBytes(vVar);
            return this;
        }

        public Builder setImages(int i2, VenueImage.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setImages(i2, builder.build());
            return this;
        }

        public Builder setIsResidence(boolean z) {
            copyOnWrite();
            ((VenueData) this.instance).setIsResidence(z);
            return this;
        }

        public Builder setIsUpdatable(boolean z) {
            copyOnWrite();
            ((VenueData) this.instance).setIsUpdatable(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setNameBytes(vVar);
            return this;
        }

        public Builder setNewImageIds(int i2, String str) {
            copyOnWrite();
            ((VenueData) this.instance).setNewImageIds(i2, str);
            return this;
        }

        public Builder setOpeningHours(int i2, OpeningHours.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setOpeningHours(i2, builder.build());
            return this;
        }

        public Builder setPhoneNumber(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setPhoneNumber(str);
            return this;
        }

        public Builder setPhoneNumberBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setPhoneNumberBytes(vVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setPriceLevel(int i2) {
            copyOnWrite();
            ((VenueData) this.instance).setPriceLevel(i2);
            return this;
        }

        public Builder setProducts(int i2, CandidateProduct.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setProducts(i2, builder.build());
            return this;
        }

        public Builder setProviderId(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setProviderId(str);
            return this;
        }

        public Builder setProviderIdBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setProviderIdBytes(vVar);
            return this;
        }

        public Builder setRating(double d2) {
            copyOnWrite();
            ((VenueData) this.instance).setRating(d2);
            return this;
        }

        public Builder setReporter(Reporter.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setReporter(builder.build());
            return this;
        }

        public Builder setRoutingContext(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setRoutingContext(str);
            return this;
        }

        public Builder setRoutingContextBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setRoutingContextBytes(vVar);
            return this;
        }

        public Builder setServices(int i2, String str) {
            copyOnWrite();
            ((VenueData) this.instance).setServices(i2, str);
            return this;
        }

        public Builder setTakeoverImage(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setTakeoverImage(str);
            return this;
        }

        public Builder setTakeoverImageBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setTakeoverImageBytes(vVar);
            return this;
        }

        public Builder setTakeoverLabel(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setTakeoverLabel(str);
            return this;
        }

        public Builder setTakeoverLabelBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setTakeoverLabelBytes(vVar);
            return this;
        }

        public Builder setUpdater(Reporter.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).setUpdater(builder.build());
            return this;
        }

        public Builder setVenueContext(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setVenueContext(str);
            return this;
        }

        public Builder setVenueContextBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setVenueContextBytes(vVar);
            return this;
        }

        public Builder setWebsite(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setWebsite(str);
            return this;
        }

        public Builder setWebsiteBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setWebsiteBytes(vVar);
            return this;
        }

        public Builder setWebsiteDisplayText(String str) {
            copyOnWrite();
            ((VenueData) this.instance).setWebsiteDisplayText(str);
            return this;
        }

        public Builder setWebsiteDisplayTextBytes(v vVar) {
            copyOnWrite();
            ((VenueData) this.instance).setWebsiteDisplayTextBytes(vVar);
            return this;
        }

        public Builder addImages(int i2, VenueImage venueImage) {
            copyOnWrite();
            ((VenueData) this.instance).addImages(i2, venueImage);
            return this;
        }

        public Builder addOpeningHours(int i2, OpeningHours openingHours) {
            copyOnWrite();
            ((VenueData) this.instance).addOpeningHours(i2, openingHours);
            return this;
        }

        public Builder addProducts(int i2, CandidateProduct candidateProduct) {
            copyOnWrite();
            ((VenueData) this.instance).addProducts(i2, candidateProduct);
            return this;
        }

        public Builder setAddress(Address address) {
            copyOnWrite();
            ((VenueData) this.instance).setAddress(address);
            return this;
        }

        public Builder setEvChargingVenue(EVChargingVenue eVChargingVenue) {
            copyOnWrite();
            ((VenueData) this.instance).setEvChargingVenue(eVChargingVenue);
            return this;
        }

        public Builder setImages(int i2, VenueImage venueImage) {
            copyOnWrite();
            ((VenueData) this.instance).setImages(i2, venueImage);
            return this;
        }

        public Builder setOpeningHours(int i2, OpeningHours openingHours) {
            copyOnWrite();
            ((VenueData) this.instance).setOpeningHours(i2, openingHours);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((VenueData) this.instance).setPosition(intPosition);
            return this;
        }

        public Builder setProducts(int i2, CandidateProduct candidateProduct) {
            copyOnWrite();
            ((VenueData) this.instance).setProducts(i2, candidateProduct);
            return this;
        }

        public Builder setReporter(Reporter reporter) {
            copyOnWrite();
            ((VenueData) this.instance).setReporter(reporter);
            return this;
        }

        public Builder setUpdater(Reporter reporter) {
            copyOnWrite();
            ((VenueData) this.instance).setUpdater(reporter);
            return this;
        }

        public Builder addImages(VenueImage.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addImages(builder.build());
            return this;
        }

        public Builder addOpeningHours(OpeningHours.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addOpeningHours(builder.build());
            return this;
        }

        public Builder addProducts(CandidateProduct.Builder builder) {
            copyOnWrite();
            ((VenueData) this.instance).addProducts(builder.build());
            return this;
        }

        public Builder addImages(VenueImage venueImage) {
            copyOnWrite();
            ((VenueData) this.instance).addImages(venueImage);
            return this;
        }

        public Builder addOpeningHours(OpeningHours openingHours) {
            copyOnWrite();
            ((VenueData) this.instance).addOpeningHours(openingHours);
            return this;
        }

        public Builder addProducts(CandidateProduct candidateProduct) {
            copyOnWrite();
            ((VenueData) this.instance).addProducts(candidateProduct);
            return this;
        }
    }

    public static VenueData parseFrom(byte[] bArr) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VenueData parseFrom(byte[] bArr, de deVar) {
        return (VenueData) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
