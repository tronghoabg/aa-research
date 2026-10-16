package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class az extends com.google.v.du<az, ax> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BOOK_PARKING_SHOWN_FIELD_NUMBER = 13;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final az DEFAULT_INSTANCE;
    public static final int ELECTRIC_VEHICLE_CHARGING_STATION_INFORMATION_FIELD_NUMBER = 9;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 15;
    public static final int IS_AD_FIELD_NUMBER = 14;
    public static final int PARKING_FIELD_NUMBER = 10;
    public static final int PARKING_PRICES_SHOWN_FIELD_NUMBER = 12;
    public static final int PARKING_VENUE_ID_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<az> PARSER = null;
    public static final int RESIDENTIAL_FIELD_NUMBER = 3;
    public static final int SOURCE_FIELD_NUMBER = 5;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 16;
    public static final int VENUE_ID_FIELD_NUMBER = 4;
    public static final int VENUE_OPENING_STATUS_FIELD_NUMBER = 6;
    public static final int VENUE_PRICE_LEVEL_FIELD_NUMBER = 8;
    public static final int VENUE_RATING_FIELD_NUMBER = 7;
    private int action_;
    private int bitField0_;
    private boolean bookParkingShown_;
    private int context_;
    private tn electricVehicleChargingStationInformation_;
    private zh googleAdInformation_;
    private boolean isAd_;
    private boolean parkingPricesShown_;
    private boolean parking_;
    private boolean residential_;
    private int source_;
    private int triggeringPlatform_;
    private int venueOpeningStatus_;
    private long venuePriceLevel_;
    private double venueRating_;
    private String venueId_ = "";
    private String parkingVenueId_ = "";

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookParkingShown() {
        this.bitField0_ &= -65;
        this.bookParkingShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElectricVehicleChargingStationInformation() {
        this.electricVehicleChargingStationInformation_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAd() {
        this.bitField0_ &= -129;
        this.isAd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.bitField0_ &= -17;
        this.parking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingPricesShown() {
        this.bitField0_ &= -33;
        this.parkingPricesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingVenueId() {
        this.parkingVenueId_ = getDefaultInstance().getParkingVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.bitField0_ &= -2;
        this.residential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
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
        this.bitField0_ &= -5;
        this.venuePriceLevel_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueRating() {
        this.bitField0_ &= -3;
        this.venueRating_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static az getDefaultInstance() {
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
        this.bitField0_ |= 8;
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
        this.bitField0_ |= 256;
    }

    public static ax newBuilder() {
        return (ax) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aw awVar) {
        this.action_ = awVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookParkingShown(boolean z) {
        this.bitField0_ |= 64;
        this.bookParkingShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(ba baVar) {
        this.context_ = baVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElectricVehicleChargingStationInformation(tn tnVar) {
        Objects.requireNonNull(tnVar);
        this.electricVehicleChargingStationInformation_ = tnVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAd(boolean z) {
        this.bitField0_ |= 128;
        this.isAd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(boolean z) {
        this.bitField0_ |= 16;
        this.parking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingPricesShown(boolean z) {
        this.bitField0_ |= 32;
        this.parkingPricesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingVenueId(String str) {
        Objects.requireNonNull(str);
        this.parkingVenueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.parkingVenueId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(boolean z) {
        this.bitField0_ |= 1;
        this.residential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(ay ayVar) {
        this.source_ = ayVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i2) {
        this.source_ = i2;
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
        this.bitField0_ |= 4;
        this.venuePriceLevel_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueRating(double d2) {
        this.bitField0_ |= 2;
        this.venueRating_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004Ȉ\u0005\f\u0006\f\u0007က\u0001\bဂ\u0002\tဉ\u0003\nဇ\u0004\u000bȈ\fဇ\u0005\rဇ\u0006\u000eဇ\u0007\u000fဉ\b\u0010\f", new Object[]{"bitField0_", "action_", "context_", "residential_", "venueId_", "source_", "venueOpeningStatus_", "venueRating_", "venuePriceLevel_", "electricVehicleChargingStationInformation_", "parking_", "parkingVenueId_", "parkingPricesShown_", "bookParkingShown_", "isAd_", "googleAdInformation_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ax(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aw getAction() {
        aw awVar;
        switch (this.action_) {
            case 0:
                awVar = aw.ACTION_UNSPECIFIED;
                break;
            case 1:
                awVar = aw.ADD_FAVORITE;
                break;
            case 2:
                awVar = aw.ADD_PHOTO;
                break;
            case 3:
                awVar = aw.BACK;
                break;
            case 4:
                awVar = aw.BEST_PARKING;
                break;
            case 5:
                awVar = aw.CALL;
                break;
            case 6:
                awVar = aw.EDIT;
                break;
            case 7:
                awVar = aw.GO;
                break;
            case 8:
                awVar = aw.IMAGE;
                break;
            case 9:
                awVar = aw.MORE_PARKING;
                break;
            case 10:
                awVar = aw.MORE;
                break;
            case 11:
                awVar = aw.REPORT_PROBLEM;
                break;
            case 12:
                awVar = aw.SEND_LOCATION;
                break;
            case 13:
                awVar = aw.WEBSITE;
                break;
            case 14:
                awVar = aw.X;
                break;
            case 15:
                awVar = aw.SHOW_ON_MAP;
                break;
            case 16:
                awVar = aw.REMOVE_FAVORITE;
                break;
            case 17:
                awVar = aw.SET_START_POINT;
                break;
            case 18:
                awVar = aw.CALENDAR_CONFIRM;
                break;
            case 19:
                awVar = aw.CALENDAR_CHANGE;
                break;
            case 20:
                awVar = aw.CALENDAR_REMOVE;
                break;
            case 21:
                awVar = aw.ADD_STOP;
                break;
            case 22:
                awVar = aw.NEW_DRIVE;
                break;
            case 23:
                awVar = aw.PARKING_INFO;
                break;
            case 24:
                awVar = aw.BOOK_PARKING;
                break;
            case 25:
                awVar = aw.WHY_THIS_AD;
                break;
            case 26:
                awVar = aw.AD_BANNER;
                break;
            default:
                awVar = null;
                break;
        }
        return awVar == null ? aw.UNRECOGNIZED : awVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public boolean getBookParkingShown() {
        return this.bookParkingShown_;
    }

    public ba getContext() {
        ba baVarA = ba.a(this.context_);
        return baVarA == null ? ba.UNRECOGNIZED : baVarA;
    }

    public int getContextValue() {
        return this.context_;
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

    public String getParkingVenueId() {
        return this.parkingVenueId_;
    }

    public com.google.v.v getParkingVenueIdBytes() {
        return com.google.v.v.s(this.parkingVenueId_);
    }

    public boolean getResidential() {
        return this.residential_;
    }

    public ay getSource() {
        int i2 = this.source_;
        ay ayVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ay.LIST : ay.PIN : ay.SOURCE_UNSPECIFIED;
        return ayVar == null ? ay.UNRECOGNIZED : ayVar;
    }

    public int getSourceValue() {
        return this.source_;
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

    public double getVenueRating() {
        return this.venueRating_;
    }

    public boolean hasBookParkingShown() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasElectricVehicleChargingStationInformation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIsAd() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasParking() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasParkingPricesShown() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasResidential() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVenuePriceLevel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVenueRating() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ax newBuilder(az azVar) {
        return (ax) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
