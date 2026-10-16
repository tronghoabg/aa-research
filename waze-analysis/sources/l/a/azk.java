package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class azk extends com.google.v.du<azk, azj> implements com.google.v.fj {
    public static final int BOOK_PARKING_INDICATION_SHOWN_FIELD_NUMBER = 14;
    public static final int CATEGORICAL_GROUP_SEARCH_NAME_FIELD_NUMBER = 3;
    public static final int CATEGORICAL_SEARCH_NAME_FIELD_NUMBER = 2;
    private static final azk DEFAULT_INSTANCE;
    public static final int DISTANCE_FROM_CURRENT_LOCATION_METERS_FIELD_NUMBER = 5;
    public static final int ELECTRIC_VEHICLE_CHARGING_STATION_INFORMATION_FIELD_NUMBER = 10;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int PARKING_FIELD_NUMBER = 12;
    public static final int PARKING_PRICES_SHOWN_FIELD_NUMBER = 13;
    private static volatile com.google.v.fo<azk> PARSER = null;
    public static final int SEARCH_AGAIN_FIELD_NUMBER = 11;
    public static final int SEARCH_ID_FIELD_NUMBER = 6;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 15;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    public static final int VENUE_OPENING_STATUS_FIELD_NUMBER = 7;
    public static final int VENUE_PRICE_LEVEL_FIELD_NUMBER = 9;
    public static final int VENUE_RATING_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean bookParkingIndicationShown_;
    private int categoricalGroupSearchName_;
    private long distanceFromCurrentLocationMeters_;
    private tn electricVehicleChargingStationInformation_;
    private long index_;
    private boolean parkingPricesShown_;
    private boolean parking_;
    private boolean searchAgain_;
    private int triggeringPlatform_;
    private int venueOpeningStatus_;
    private long venuePriceLevel_;
    private float venueRating_;
    private String categoricalSearchName_ = "";
    private String venueId_ = "";
    private String searchId_ = "";

    static {
        azk azkVar = new azk();
        DEFAULT_INSTANCE = azkVar;
        com.google.v.du.registerDefaultInstance(azk.class, azkVar);
    }

    private azk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookParkingIndicationShown() {
        this.bitField0_ &= -257;
        this.bookParkingIndicationShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalGroupSearchName() {
        this.categoricalGroupSearchName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoricalSearchName() {
        this.categoricalSearchName_ = getDefaultInstance().getCategoricalSearchName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceFromCurrentLocationMeters() {
        this.bitField0_ &= -3;
        this.distanceFromCurrentLocationMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleChargingStationInformation() {
        this.electricVehicleChargingStationInformation_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.bitField0_ &= -65;
        this.parking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingPricesShown() {
        this.bitField0_ &= -129;
        this.parkingPricesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchAgain() {
        this.bitField0_ &= -33;
        this.searchAgain_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSearchId() {
        this.searchId_ = getDefaultInstance().getSearchId();
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
    public void clearVenueOpeningStatus() {
        this.venueOpeningStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenuePriceLevel() {
        this.bitField0_ &= -9;
        this.venuePriceLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueRating() {
        this.bitField0_ &= -5;
        this.venueRating_ = 0.0f;
    }

    public static azk getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 16;
    }

    public static azj newBuilder() {
        return (azj) DEFAULT_INSTANCE.createBuilder();
    }

    public static azk parseDelimitedFrom(InputStream inputStream) {
        return (azk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azk parseFrom(com.google.v.v vVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<azk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookParkingIndicationShown(boolean z) {
        this.bitField0_ |= 256;
        this.bookParkingIndicationShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchName(ayn aynVar) {
        this.categoricalGroupSearchName_ = aynVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalGroupSearchNameValue(int i2) {
        this.categoricalGroupSearchName_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchName(String str) {
        Objects.requireNonNull(str);
        this.categoricalSearchName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoricalSearchNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.categoricalSearchName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceFromCurrentLocationMeters(long j2) {
        this.bitField0_ |= 2;
        this.distanceFromCurrentLocationMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 1;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(boolean z) {
        this.bitField0_ |= 64;
        this.parking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingPricesShown(boolean z) {
        this.bitField0_ |= 128;
        this.parkingPricesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchAgain(boolean z) {
        this.bitField0_ |= 32;
        this.searchAgain_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchId(String str) {
        Objects.requireNonNull(str);
        this.searchId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSearchIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.searchId_ = vVar.u();
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
    public void setVenueOpeningStatus(bps bpsVar) {
        this.venueOpeningStatus_ = bpsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningStatusValue(int i2) {
        this.venueOpeningStatus_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenuePriceLevel(long j2) {
        this.bitField0_ |= 8;
        this.venuePriceLevel_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueRating(float f2) {
        this.bitField0_ |= 4;
        this.venueRating_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဂ\u0000\u0002Ȉ\u0003\f\u0004Ȉ\u0005ဂ\u0001\u0006Ȉ\u0007\f\bခ\u0002\tဂ\u0003\nဉ\u0004\u000bဇ\u0005\fဇ\u0006\rဇ\u0007\u000eဇ\b\u000f\f", new Object[]{"bitField0_", "index_", "categoricalSearchName_", "categoricalGroupSearchName_", "venueId_", "distanceFromCurrentLocationMeters_", "searchId_", "venueOpeningStatus_", "venueRating_", "venuePriceLevel_", "electricVehicleChargingStationInformation_", "searchAgain_", "parking_", "parkingPricesShown_", "bookParkingIndicationShown_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new azk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<azk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (azk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBookParkingIndicationShown() {
        return this.bookParkingIndicationShown_;
    }

    public ayn getCategoricalGroupSearchName() {
        ayn aynVarA = ayn.a(this.categoricalGroupSearchName_);
        return aynVarA == null ? ayn.UNRECOGNIZED : aynVarA;
    }

    public int getCategoricalGroupSearchNameValue() {
        return this.categoricalGroupSearchName_;
    }

    public String getCategoricalSearchName() {
        return this.categoricalSearchName_;
    }

    public com.google.v.v getCategoricalSearchNameBytes() {
        return com.google.v.v.s(this.categoricalSearchName_);
    }

    public long getDistanceFromCurrentLocationMeters() {
        return this.distanceFromCurrentLocationMeters_;
    }

    public tn getElectricVehicleChargingStationInformation() {
        tn tnVar = this.electricVehicleChargingStationInformation_;
        return tnVar == null ? tn.getDefaultInstance() : tnVar;
    }

    public long getIndex() {
        return this.index_;
    }

    public boolean getParking() {
        return this.parking_;
    }

    public boolean getParkingPricesShown() {
        return this.parkingPricesShown_;
    }

    public boolean getSearchAgain() {
        return this.searchAgain_;
    }

    public String getSearchId() {
        return this.searchId_;
    }

    public com.google.v.v getSearchIdBytes() {
        return com.google.v.v.s(this.searchId_);
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

    public bps getVenueOpeningStatus() {
        bps bpsVarA = bps.a(this.venueOpeningStatus_);
        return bpsVarA == null ? bps.UNRECOGNIZED : bpsVarA;
    }

    public int getVenueOpeningStatusValue() {
        return this.venueOpeningStatus_;
    }

    public long getVenuePriceLevel() {
        return this.venuePriceLevel_;
    }

    public float getVenueRating() {
        return this.venueRating_;
    }

    public boolean hasBookParkingIndicationShown() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDistanceFromCurrentLocationMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasElectricVehicleChargingStationInformation() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasParking() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasParkingPricesShown() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSearchAgain() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVenuePriceLevel() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVenueRating() {
        return (this.bitField0_ & 4) != 0;
    }

    public static azj newBuilder(azk azkVar) {
        return (azj) DEFAULT_INSTANCE.createBuilder(azkVar);
    }

    public static azk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static azk parseFrom(com.google.v.z zVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static azk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static azk parseFrom(InputStream inputStream) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static azk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static azk parseFrom(ByteBuffer byteBuffer) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static azk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static azk parseFrom(byte[] bArr) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static azk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (azk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
