package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bgs extends com.google.v.du<bgs, bgp> implements com.google.v.fj {
    public static final int CARD_TRIGGER_FIELD_NUMBER = 1;
    private static final bgs DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 4;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bgs> PARSER = null;
    public static final int RT_INFO_FIELD_NUMBER = 5;
    public static final int SERVER_SUGGESTION_CARD_ID_FIELD_NUMBER = 6;
    public static final int VENUE_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private int cardTrigger_;
    private afx destinationCoordinates_;
    private int destinationType_;
    private awz rtInfo_;
    private String venueId_ = "";
    private String serverSuggestionCardId_ = "";

    static {
        bgs bgsVar = new bgs();
        DEFAULT_INSTANCE = bgsVar;
        com.google.v.du.registerDefaultInstance(bgs.class, bgsVar);
    }

    private bgs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardTrigger() {
        this.cardTrigger_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtInfo() {
        this.rtInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSuggestionCardId() {
        this.serverSuggestionCardId_ = getDefaultInstance().getServerSuggestionCardId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static bgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.destinationCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRtInfo(awz awzVar) {
        Objects.requireNonNull(awzVar);
        awz awzVar2 = this.rtInfo_;
        if (awzVar2 != null && awzVar2 != awz.getDefaultInstance()) {
            awy awyVarNewBuilder = awz.newBuilder(awzVar2);
            awyVarNewBuilder.mergeFrom((awy) awzVar);
            awzVar = awyVarNewBuilder.buildPartial();
        }
        this.rtInfo_ = awzVar;
        this.bitField0_ |= 2;
    }

    public static bgp newBuilder() {
        return (bgp) DEFAULT_INSTANCE.createBuilder();
    }

    public static bgs parseDelimitedFrom(InputStream inputStream) {
        return (bgs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgs parseFrom(com.google.v.v vVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bgs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTrigger(bgq bgqVar) {
        this.cardTrigger_ = bgqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTriggerValue(int i2) {
        this.cardTrigger_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationType(bgr bgrVar) {
        this.destinationType_ = bgrVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationTypeValue(int i2) {
        this.destinationType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtInfo(awz awzVar) {
        Objects.requireNonNull(awzVar);
        this.rtInfo_ = awzVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionCardId(String str) {
        Objects.requireNonNull(str);
        this.serverSuggestionCardId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSuggestionCardIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.serverSuggestionCardId_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\f\u0003Ȉ\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ", new Object[]{"bitField0_", "cardTrigger_", "destinationType_", "venueId_", "destinationCoordinates_", "rtInfo_", "serverSuggestionCardId_"});
        }
        if (iOrdinal == 3) {
            return new bgs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bgp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bgs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bgs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bgq getCardTrigger() {
        int i2 = this.cardTrigger_;
        bgq bgqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bgq.ETA_CHECK : bgq.CALENDAR_EVENT : bgq.PLANNED_DRIVE : bgq.RESUME : bgq.PREDICTION : bgq.CARD_TRIGGER_UNSPECIFIED;
        return bgqVar == null ? bgq.UNRECOGNIZED : bgqVar;
    }

    public int getCardTriggerValue() {
        return this.cardTrigger_;
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public bgr getDestinationType() {
        int i2 = this.destinationType_;
        bgr bgrVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bgr.NEW_DESTINATION : bgr.RECENT : bgr.FAVORITE : bgr.WORK : bgr.HOME : bgr.DESTINATION_TYPE_UNSPECIFIED;
        return bgrVar == null ? bgr.UNRECOGNIZED : bgrVar;
    }

    public int getDestinationTypeValue() {
        return this.destinationType_;
    }

    public awz getRtInfo() {
        awz awzVar = this.rtInfo_;
        return awzVar == null ? awz.getDefaultInstance() : awzVar;
    }

    public String getServerSuggestionCardId() {
        return this.serverSuggestionCardId_;
    }

    public com.google.v.v getServerSuggestionCardIdBytes() {
        return com.google.v.v.s(this.serverSuggestionCardId_);
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRtInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bgp newBuilder(bgs bgsVar) {
        return (bgp) DEFAULT_INSTANCE.createBuilder(bgsVar);
    }

    public static bgs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bgs parseFrom(com.google.v.z zVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bgs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bgs parseFrom(InputStream inputStream) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bgs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bgs parseFrom(ByteBuffer byteBuffer) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bgs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bgs parseFrom(byte[] bArr) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bgs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bgs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
