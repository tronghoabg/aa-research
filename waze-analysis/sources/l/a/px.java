package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class px extends com.google.v.du<px, pt> implements com.google.v.fj {
    public static final int CARD_SOURCE_FIELD_NUMBER = 3;
    public static final int CARD_TRIGGER_FIELD_NUMBER = 1;
    private static final px DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 4;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<px> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private int cardSource_;
    private int cardTrigger_;
    private afx destinationCoordinates_;
    private int destinationType_;
    private String venueId_ = "";

    static {
        px pxVar = new px();
        DEFAULT_INSTANCE = pxVar;
        com.google.v.du.registerDefaultInstance(px.class, pxVar);
    }

    private px() {
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
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static px getDefaultInstance() {
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

    public static pt newBuilder() {
        return (pt) DEFAULT_INSTANCE.createBuilder();
    }

    public static px parseDelimitedFrom(InputStream inputStream) {
        return (px) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static px parseFrom(com.google.v.v vVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<px> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 1;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f\u0004ဉ\u0000\u0005Ȉ", new Object[]{"bitField0_", "cardTrigger_", "destinationType_", "cardSource_", "destinationCoordinates_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new px();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<px> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (px.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
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

    public pv getCardTrigger() {
        pv pvVarA = pv.a(this.cardTrigger_);
        return pvVarA == null ? pv.UNRECOGNIZED : pvVarA;
    }

    public int getCardTriggerValue() {
        return this.cardTrigger_;
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public pw getDestinationType() {
        pw pwVarA = pw.a(this.destinationType_);
        return pwVarA == null ? pw.UNRECOGNIZED : pwVarA;
    }

    public int getDestinationTypeValue() {
        return this.destinationType_;
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

    public static pt newBuilder(px pxVar) {
        return (pt) DEFAULT_INSTANCE.createBuilder(pxVar);
    }

    public static px parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (px) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static px parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static px parseFrom(com.google.v.z zVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static px parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static px parseFrom(InputStream inputStream) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static px parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static px parseFrom(ByteBuffer byteBuffer) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static px parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static px parseFrom(byte[] bArr) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static px parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (px) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
