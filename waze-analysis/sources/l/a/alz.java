package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class alz extends com.google.v.du<alz, aly> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int AREA_ID_FIELD_NUMBER = 2;
    public static final int COORDINATES_FIELD_NUMBER = 3;
    private static final alz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<alz> PARSER;
    private int action_;
    private long areaId_;
    private int bitField0_;
    private afx coordinates_;

    static {
        alz alzVar = new alz();
        DEFAULT_INSTANCE = alzVar;
        com.google.v.du.registerDefaultInstance(alz.class, alzVar);
    }

    private alz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaId() {
        this.bitField0_ &= -2;
        this.areaId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -3;
    }

    public static alz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    public static aly newBuilder() {
        return (aly) DEFAULT_INSTANCE.createBuilder();
    }

    public static alz parseDelimitedFrom(InputStream inputStream) {
        return (alz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alz parseFrom(com.google.v.v vVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<alz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(alx alxVar) {
        this.action_ = alxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaId(long j2) {
        this.bitField0_ |= 1;
        this.areaId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "action_", "areaId_", "coordinates_"});
        }
        if (iOrdinal == 3) {
            return new alz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aly(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<alz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (alz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public alx getAction() {
        int i2 = this.action_;
        alx alxVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : alx.CONFIRM : alx.CLOSE : alx.ACTION_UNSPECIFIED;
        return alxVar == null ? alx.UNRECOGNIZED : alxVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public long getAreaId() {
        return this.areaId_;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasAreaId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aly newBuilder(alz alzVar) {
        return (aly) DEFAULT_INSTANCE.createBuilder(alzVar);
    }

    public static alz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static alz parseFrom(com.google.v.z zVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static alz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static alz parseFrom(InputStream inputStream) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static alz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static alz parseFrom(ByteBuffer byteBuffer) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static alz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static alz parseFrom(byte[] bArr) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static alz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (alz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
