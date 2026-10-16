package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class qq extends com.google.v.du<qq, qn> implements com.google.v.fj {
    public static final int CHIP_INDEX_FIELD_NUMBER = 3;
    public static final int CHIP_TRIGGER_FIELD_NUMBER = 1;
    private static final qq DEFAULT_INSTANCE;
    public static final int DESTINATION_COORDINATES_FIELD_NUMBER = 4;
    public static final int DESTINATION_TYPE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<qq> PARSER = null;
    public static final int VENUE_ID_FIELD_NUMBER = 5;
    private int bitField0_;
    private long chipIndex_;
    private int chipTrigger_;
    private afx destinationCoordinates_;
    private int destinationType_;
    private String venueId_ = "";

    static {
        qq qqVar = new qq();
        DEFAULT_INSTANCE = qqVar;
        com.google.v.du.registerDefaultInstance(qq.class, qqVar);
    }

    private qq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChipIndex() {
        this.bitField0_ &= -2;
        this.chipIndex_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChipTrigger() {
        this.chipTrigger_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationCoordinates() {
        this.destinationCoordinates_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationType() {
        this.destinationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static qq getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static qn newBuilder() {
        return (qn) DEFAULT_INSTANCE.createBuilder();
    }

    public static qq parseDelimitedFrom(InputStream inputStream) {
        return (qq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qq parseFrom(com.google.v.v vVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChipIndex(long j2) {
        this.bitField0_ |= 1;
        this.chipIndex_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChipTrigger(qo qoVar) {
        this.chipTrigger_ = qoVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChipTriggerValue(int i2) {
        this.chipTrigger_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.destinationCoordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationType(qp qpVar) {
        this.destinationType_ = qpVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဂ\u0000\u0004ဉ\u0001\u0005Ȉ", new Object[]{"bitField0_", "chipTrigger_", "destinationType_", "chipIndex_", "destinationCoordinates_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new qq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qq> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qq.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getChipIndex() {
        return this.chipIndex_;
    }

    public qo getChipTrigger() {
        int i2 = this.chipTrigger_;
        qo qoVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : qo.MORE : qo.STICKY : qo.NEW_FAVORITE_CTA : qo.SET_WORK_CTA : qo.SET_HOME_CTA : qo.CHIP_TRIGGER_UNSPECIFIED;
        return qoVar == null ? qo.UNRECOGNIZED : qoVar;
    }

    public int getChipTriggerValue() {
        return this.chipTrigger_;
    }

    public afx getDestinationCoordinates() {
        afx afxVar = this.destinationCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public qp getDestinationType() {
        int i2 = this.destinationType_;
        qp qpVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : qp.FAVORITE : qp.WORK : qp.HOME : qp.DESTINATION_TYPE_UNSPECIFIED;
        return qpVar == null ? qp.UNRECOGNIZED : qpVar;
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

    public boolean hasChipIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDestinationCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public static qn newBuilder(qq qqVar) {
        return (qn) DEFAULT_INSTANCE.createBuilder(qqVar);
    }

    public static qq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qq parseFrom(com.google.v.z zVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qq parseFrom(InputStream inputStream) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qq parseFrom(ByteBuffer byteBuffer) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qq parseFrom(byte[] bArr) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
