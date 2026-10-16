package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bm extends com.google.v.du<bm, bj> implements com.google.v.fj {
    public static final int BOOK_PARKING_SHOWN_FIELD_NUMBER = 11;
    private static final bm DEFAULT_INSTANCE;
    public static final int HAS_MORE_PARKING_LOTS_FIELD_NUMBER = 4;
    public static final int PARKING_NOT_SUGGESTED_REASON_FIELD_NUMBER = 1;
    public static final int PARKING_PRICES_SHOWN_FIELD_NUMBER = 10;
    public static final int PARKING_SUGGESTED_FIELD_NUMBER = 9;
    public static final int PARKING_VENUE_ID_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<bm> PARSER = null;
    public static final int POPULAR_PARKING_FIELD_NUMBER = 3;
    public static final int SHOWN_AT_TOP_FIELD_NUMBER = 2;
    public static final int VENUE_ID_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean bookParkingShown_;
    private boolean hasMoreParkingLots_;
    private int parkingNotSuggestedReason_;
    private boolean parkingPricesShown_;
    private boolean parkingSuggested_;
    private boolean popularParking_;
    private int shownAtTop_;
    private String parkingVenueId_ = "";
    private String venueId_ = "";

    static {
        bm bmVar = new bm();
        DEFAULT_INSTANCE = bmVar;
        com.google.v.du.registerDefaultInstance(bm.class, bmVar);
    }

    private bm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBookParkingShown() {
        this.bitField0_ &= -17;
        this.bookParkingShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMoreParkingLots() {
        this.bitField0_ &= -3;
        this.hasMoreParkingLots_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingNotSuggestedReason() {
        this.parkingNotSuggestedReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingPricesShown() {
        this.bitField0_ &= -9;
        this.parkingPricesShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingSuggested() {
        this.bitField0_ &= -5;
        this.parkingSuggested_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParkingVenueId() {
        this.parkingVenueId_ = getDefaultInstance().getParkingVenueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopularParking() {
        this.bitField0_ &= -2;
        this.popularParking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShownAtTop() {
        this.shownAtTop_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static bm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bj newBuilder() {
        return (bj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bm parseDelimitedFrom(InputStream inputStream) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(com.google.v.v vVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBookParkingShown(boolean z) {
        this.bitField0_ |= 16;
        this.bookParkingShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMoreParkingLots(boolean z) {
        this.bitField0_ |= 2;
        this.hasMoreParkingLots_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNotSuggestedReason(bk bkVar) {
        this.parkingNotSuggestedReason_ = bkVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingNotSuggestedReasonValue(int i2) {
        this.parkingNotSuggestedReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingPricesShown(boolean z) {
        this.bitField0_ |= 8;
        this.parkingPricesShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParkingSuggested(boolean z) {
        this.bitField0_ |= 4;
        this.parkingSuggested_ = z;
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
    public void setPopularParking(boolean z) {
        this.bitField0_ |= 1;
        this.popularParking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownAtTop(bl blVar) {
        this.shownAtTop_ = blVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShownAtTopValue(int i2) {
        this.shownAtTop_ = i2;
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဇ\u0000\u0004ဇ\u0001\u0005Ȉ\u0006Ȉ\tဇ\u0002\nဇ\u0003\u000bဇ\u0004", new Object[]{"bitField0_", "parkingNotSuggestedReason_", "shownAtTop_", "popularParking_", "hasMoreParkingLots_", "parkingVenueId_", "venueId_", "parkingSuggested_", "parkingPricesShown_", "bookParkingShown_"});
        }
        if (iOrdinal == 3) {
            return new bm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getBookParkingShown() {
        return this.bookParkingShown_;
    }

    public boolean getHasMoreParkingLots() {
        return this.hasMoreParkingLots_;
    }

    public bk getParkingNotSuggestedReason() {
        bk bkVar;
        switch (this.parkingNotSuggestedReason_) {
            case 0:
                bkVar = bk.REASON_UNSPECIFIED;
                break;
            case 1:
                bkVar = bk.CAR_WASH;
                break;
            case 2:
                bkVar = bk.CHARGING_STATION;
                break;
            case 3:
                bkVar = bk.GAS_STATION;
                break;
            case 4:
                bkVar = bk.NO_RESULTS;
                break;
            case 5:
                bkVar = bk.PARKING_LOT;
                break;
            case 6:
                bkVar = bk.VENUE_FAILED;
                break;
            default:
                bkVar = null;
                break;
        }
        return bkVar == null ? bk.UNRECOGNIZED : bkVar;
    }

    public int getParkingNotSuggestedReasonValue() {
        return this.parkingNotSuggestedReason_;
    }

    public boolean getParkingPricesShown() {
        return this.parkingPricesShown_;
    }

    public boolean getParkingSuggested() {
        return this.parkingSuggested_;
    }

    public String getParkingVenueId() {
        return this.parkingVenueId_;
    }

    public com.google.v.v getParkingVenueIdBytes() {
        return com.google.v.v.s(this.parkingVenueId_);
    }

    public boolean getPopularParking() {
        return this.popularParking_;
    }

    public bl getShownAtTop() {
        int i2 = this.shownAtTop_;
        bl blVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : bl.NONE : bl.POPULAR : bl.NEAREST : bl.SHOWN_AT_TOP_UNSPECIFIED;
        return blVar == null ? bl.UNRECOGNIZED : blVar;
    }

    public int getShownAtTopValue() {
        return this.shownAtTop_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasBookParkingShown() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHasMoreParkingLots() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParkingPricesShown() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasParkingSuggested() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPopularParking() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bj newBuilder(bm bmVar) {
        return (bj) DEFAULT_INSTANCE.createBuilder(bmVar);
    }

    public static bm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bm parseFrom(com.google.v.z zVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bm parseFrom(InputStream inputStream) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bm parseFrom(ByteBuffer byteBuffer) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bm parseFrom(byte[] bArr) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
