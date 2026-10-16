package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bc extends com.google.v.du<bc, bb> implements com.google.v.fj {
    public static final int AD_BANNER_INFORMATION_FIELD_NUMBER = 13;
    public static final int AD_BUSINESS_NAME_FIELD_NUMBER = 11;
    public static final int BOOK_PARKING_SHOWN_FIELD_NUMBER = 8;
    private static final bc DEFAULT_INSTANCE;
    public static final int ELECTRIC_VEHICLE_CHARGING_STATION_INFORMATION_FIELD_NUMBER = 5;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 12;
    public static final int IS_AD_FIELD_NUMBER = 10;
    public static final int PARKING_FIELD_NUMBER = 6;
    public static final int PARKING_PRICES_SHOWN_FIELD_NUMBER = 9;
    private static volatile com.google.v.fo<bc> PARSER = null;
    public static final int RESIDENTIAL_FIELD_NUMBER = 7;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 14;
    public static final int VENUE_ID_FIELD_NUMBER = 1;
    public static final int VENUE_OPENING_INFORMATION_FIELD_NUMBER = 2;
    public static final int VENUE_PRICE_INFORMATION_FIELD_NUMBER = 4;
    public static final int VENUE_RATING_INFORMATION_FIELD_NUMBER = 3;
    private yn adBannerInformation_;
    private int bitField0_;
    private boolean bookParkingShown_;
    private tn electricVehicleChargingStationInformation_;
    private zh googleAdInformation_;
    private boolean isAd_;
    private boolean parkingPricesShown_;
    private boolean parking_;
    private boolean residential_;
    private int triggeringPlatform_;
    private int venueOpeningInformation_;
    private long venuePriceInformation_;
    private float venueRatingInformation_;
    private String venueId_ = "";
    private String adBusinessName_ = "";

    static {
        bc bcVar = new bc();
        DEFAULT_INSTANCE = bcVar;
        com.google.v.du.registerDefaultInstance(bc.class, bcVar);
    }

    private bc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdBannerInformation() {
        this.adBannerInformation_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdBusinessName() {
        this.bitField0_ &= -257;
        this.adBusinessName_ = getDefaultInstance().getAdBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookParkingShown() {
        this.bitField0_ &= -33;
        this.bookParkingShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleChargingStationInformation() {
        this.electricVehicleChargingStationInformation_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAd() {
        this.bitField0_ &= -129;
        this.isAd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.bitField0_ &= -9;
        this.parking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingPricesShown() {
        this.bitField0_ &= -65;
        this.parkingPricesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.bitField0_ &= -17;
        this.residential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueOpeningInformation() {
        this.venueOpeningInformation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenuePriceInformation() {
        this.bitField0_ &= -3;
        this.venuePriceInformation_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueRatingInformation() {
        this.bitField0_ &= -2;
        this.venueRatingInformation_ = 0.0f;
    }

    public static bc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdBannerInformation(yn ynVar) {
        Objects.requireNonNull(ynVar);
        yn ynVar2 = this.adBannerInformation_;
        if (ynVar2 != null && ynVar2 != yn.getDefaultInstance()) {
            ym ymVarNewBuilder = yn.newBuilder(ynVar2);
            ymVarNewBuilder.mergeFrom((ym) ynVar);
            ynVar = ymVarNewBuilder.buildPartial();
        }
        this.adBannerInformation_ = ynVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        tn tnVar2 = this.electricVehicleChargingStationInformation_;
        if (tnVar2 != null && tnVar2 != tn.getDefaultInstance()) {
            tm tmVarNewBuilder = tn.newBuilder(tnVar2);
            tmVarNewBuilder.mergeFrom((tm) tnVar);
            tnVar = tmVarNewBuilder.buildPartial();
        }
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        zh zhVar2 = this.googleAdInformation_;
        if (zhVar2 != null && zhVar2 != zh.getDefaultInstance()) {
            zg zgVarNewBuilder = zh.newBuilder(zhVar2);
            zgVarNewBuilder.mergeFrom((zg) zhVar);
            zhVar = zgVarNewBuilder.buildPartial();
        }
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 512;
    }

    public static bb newBuilder() {
        return (bb) DEFAULT_INSTANCE.createBuilder();
    }

    public static bc parseDelimitedFrom(InputStream inputStream) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(com.google.v.v vVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBannerInformation(yn ynVar) {
        Objects.requireNonNull(ynVar);
        this.adBannerInformation_ = ynVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBusinessName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.adBusinessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBusinessNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adBusinessName_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookParkingShown(boolean z) {
        this.bitField0_ |= 32;
        this.bookParkingShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAd(boolean z) {
        this.bitField0_ |= 128;
        this.isAd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(boolean z) {
        this.bitField0_ |= 8;
        this.parking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingPricesShown(boolean z) {
        this.bitField0_ |= 64;
        this.parkingPricesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(boolean z) {
        this.bitField0_ |= 16;
        this.residential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningInformation(bps bpsVar) {
        this.venueOpeningInformation_ = bpsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningInformationValue(int i2) {
        this.venueOpeningInformation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenuePriceInformation(long j2) {
        this.bitField0_ |= 2;
        this.venuePriceInformation_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueRatingInformation(float f2) {
        this.bitField0_ |= 1;
        this.venueRatingInformation_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003ခ\u0000\u0004ဂ\u0001\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဇ\u0006\nဇ\u0007\u000bለ\b\fဉ\t\rဉ\n\u000e\f", new Object[]{"bitField0_", "venueId_", "venueOpeningInformation_", "venueRatingInformation_", "venuePriceInformation_", "electricVehicleChargingStationInformation_", "parking_", "residential_", "bookParkingShown_", "parkingPricesShown_", "isAd_", "adBusinessName_", "googleAdInformation_", "adBannerInformation_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new bc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public yn getAdBannerInformation() {
        yn ynVar = this.adBannerInformation_;
        return ynVar == null ? yn.getDefaultInstance() : ynVar;
    }

    public String getAdBusinessName() {
        return this.adBusinessName_;
    }

    public com.google.v.v getAdBusinessNameBytes() {
        return com.google.v.v.s(this.adBusinessName_);
    }

    public boolean getBookParkingShown() {
        return this.bookParkingShown_;
    }

    public tn getElectricVehicleChargingStationInformation() {
        tn tnVar = this.electricVehicleChargingStationInformation_;
        return tnVar == null ? tn.getDefaultInstance() : tnVar;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean getIsAd() {
        return this.isAd_;
    }

    public boolean getParking() {
        return this.parking_;
    }

    public boolean getParkingPricesShown() {
        return this.parkingPricesShown_;
    }

    public boolean getResidential() {
        return this.residential_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public bps getVenueOpeningInformation() {
        bps bpsVarA = bps.a(this.venueOpeningInformation_);
        return bpsVarA == null ? bps.UNRECOGNIZED : bpsVarA;
    }

    public int getVenueOpeningInformationValue() {
        return this.venueOpeningInformation_;
    }

    public long getVenuePriceInformation() {
        return this.venuePriceInformation_;
    }

    public float getVenueRatingInformation() {
        return this.venueRatingInformation_;
    }

    public boolean hasAdBannerInformation() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasAdBusinessName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasBookParkingShown() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasElectricVehicleChargingStationInformation() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasIsAd() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasParking() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasParkingPricesShown() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResidential() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVenuePriceInformation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVenueRatingInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bb newBuilder(bc bcVar) {
        return (bb) DEFAULT_INSTANCE.createBuilder(bcVar);
    }

    public static bc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bc parseFrom(com.google.v.z zVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bc parseFrom(InputStream inputStream) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bc parseFrom(ByteBuffer byteBuffer) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bc parseFrom(byte[] bArr) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
