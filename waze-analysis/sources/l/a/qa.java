package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qa extends com.google.v.du<qa, pz> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 12;
    public static final int CARD_SOURCE_FIELD_NUMBER = 7;
    public static final int CARD_TRIGGER_FIELD_NUMBER = 5;
    public static final int CONTEXT_FIELD_NUMBER = 4;
    public static final int DECORATED_FIELD_NUMBER = 8;
    private static final qa DEFAULT_INSTANCE;
    public static final int DESTINATION_CARD_FIELD_NUMBER = 13;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 11;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 6;
    public static final int ETA_SHOWN_FIELD_NUMBER = 1;
    public static final int INDEX_FIELD_NUMBER = 9;
    public static final int LEAVE_ARRIVE_SHOWN_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<qa> PARSER = null;
    public static final int RT_TRAFFIC_SHOWN_FIELD_NUMBER = 2;
    public static final int VENUE_ID_FIELD_NUMBER = 10;
    private int action_;
    private int bitField0_;
    private int cardSource_;
    private int cardTrigger_;
    private int context_;
    private boolean decorated_;
    private px destinationCard_;
    private afx destinationCoordinates_;
    private int destinationType_;
    private boolean etaShown_;
    private long index_;
    private boolean leaveArriveShown_;
    private boolean rtTrafficShown_;
    private String venueId_ = "";

    static {
        qa qaVar = new qa();
        DEFAULT_INSTANCE = qaVar;
        com.google.v.du.registerDefaultInstance(qa.class, qaVar);
    }

    private qa() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardSource() {
        this.cardSource_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardTrigger() {
        this.cardTrigger_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecorated() {
        this.bitField0_ &= -9;
        this.decorated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCard() {
        this.destinationCard_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaShown() {
        this.bitField0_ &= -2;
        this.etaShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -17;
        this.index_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeaveArriveShown() {
        this.bitField0_ &= -5;
        this.leaveArriveShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRtTrafficShown() {
        this.bitField0_ &= -3;
        this.rtTrafficShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static qa getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationCard(px pxVar) {
        Objects.requireNonNull(pxVar);
        px pxVar2 = this.destinationCard_;
        if (pxVar2 != null && pxVar2 != px.getDefaultInstance()) {
            pt ptVarNewBuilder = px.newBuilder(pxVar2);
            ptVarNewBuilder.mergeFrom((pt) pxVar);
            pxVar = ptVarNewBuilder.buildPartial();
        }
        this.destinationCard_ = pxVar;
        this.bitField0_ |= 64;
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
        this.bitField0_ |= 32;
    }

    public static pz newBuilder() {
        return (pz) DEFAULT_INSTANCE.createBuilder();
    }

    public static qa parseDelimitedFrom(InputStream inputStream) {
        return (qa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qa parseFrom(com.google.v.v vVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qa> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(py pyVar) {
        this.action_ = pyVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardSource(pu puVar) {
        this.cardSource_ = puVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardSourceValue(int i2) {
        this.cardSource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTrigger(pv pvVar) {
        this.cardTrigger_ = pvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardTriggerValue(int i2) {
        this.cardTrigger_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(qg qgVar) {
        this.context_ = qgVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecorated(boolean z) {
        this.bitField0_ |= 8;
        this.decorated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCard(px pxVar) {
        Objects.requireNonNull(pxVar);
        this.destinationCard_ = pxVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationType(pw pwVar) {
        this.destinationType_ = pwVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationTypeValue(int i2) {
        this.destinationType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaShown(boolean z) {
        this.bitField0_ |= 1;
        this.etaShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(long j2) {
        this.bitField0_ |= 16;
        this.index_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLeaveArriveShown(boolean z) {
        this.bitField0_ |= 4;
        this.leaveArriveShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRtTrafficShown(boolean z) {
        this.bitField0_ |= 2;
        this.rtTrafficShown_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004\f\u0005\f\u0006\f\u0007\f\bဇ\u0003\tဂ\u0004\nȈ\u000bဉ\u0005\f\f\rဉ\u0006", new Object[]{"bitField0_", "etaShown_", "rtTrafficShown_", "leaveArriveShown_", "context_", "cardTrigger_", "destinationType_", "cardSource_", "decorated_", "index_", "venueId_", "destinationCoordinates_", "action_", "destinationCard_"});
        }
        if (iOrdinal == 3) {
            return new qa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qa> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qa.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public py getAction() {
        int i2 = this.action_;
        py pyVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : py.OPTIONS_FROM_SWIPE : py.LONG_PRESS : py.CLICK : py.ACTION_UNSPECIFIED;
        return pyVar == null ? py.UNRECOGNIZED : pyVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    @Deprecated
    public pu getCardSource() {
        pu puVarA = pu.a(this.cardSource_);
        return puVarA == null ? pu.UNRECOGNIZED : puVarA;
    }

    @Deprecated
    public int getCardSourceValue() {
        return this.cardSource_;
    }

    @Deprecated
    public pv getCardTrigger() {
        pv pvVarA = pv.a(this.cardTrigger_);
        return pvVarA == null ? pv.UNRECOGNIZED : pvVarA;
    }

    @Deprecated
    public int getCardTriggerValue() {
        return this.cardTrigger_;
    }

    public qg getContext() {
        qg qgVarA = qg.a(this.context_);
        return qgVarA == null ? qg.UNRECOGNIZED : qgVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public boolean getDecorated() {
        return this.decorated_;
    }

    public px getDestinationCard() {
        px pxVar = this.destinationCard_;
        return pxVar == null ? px.getDefaultInstance() : pxVar;
    }

    @Deprecated
    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    @Deprecated
    public pw getDestinationType() {
        pw pwVarA = pw.a(this.destinationType_);
        return pwVarA == null ? pw.UNRECOGNIZED : pwVarA;
    }

    @Deprecated
    public int getDestinationTypeValue() {
        return this.destinationType_;
    }

    public boolean getEtaShown() {
        return this.etaShown_;
    }

    public long getIndex() {
        return this.index_;
    }

    public boolean getLeaveArriveShown() {
        return this.leaveArriveShown_;
    }

    public boolean getRtTrafficShown() {
        return this.rtTrafficShown_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasDecorated() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDestinationCard() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEtaShown() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasLeaveArriveShown() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRtTrafficShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public static pz newBuilder(qa qaVar) {
        return (pz) DEFAULT_INSTANCE.createBuilder(qaVar);
    }

    public static qa parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qa) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qa parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qa parseFrom(com.google.v.z zVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qa parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qa parseFrom(InputStream inputStream) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qa parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qa parseFrom(ByteBuffer byteBuffer) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qa parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qa parseFrom(byte[] bArr) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qa parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qa) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
