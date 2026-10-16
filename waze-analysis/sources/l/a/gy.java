package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class gy extends com.google.v.du<gy, gx> implements com.google.v.fj {
    public static final int AREA_EXIT_COORDINATES_FIELD_NUMBER = 1;
    private static final gy DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<gy> PARSER;
    private afx areaExitCoordinates_;
    private int bitField0_;

    static {
        gy gyVar = new gy();
        DEFAULT_INSTANCE = gyVar;
        com.google.v.du.registerDefaultInstance(gy.class, gyVar);
    }

    private gy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreaExitCoordinates() {
        this.areaExitCoordinates_ = null;
        this.bitField0_ &= -2;
    }

    public static gy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAreaExitCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.areaExitCoordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.areaExitCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static gx newBuilder() {
        return (gx) DEFAULT_INSTANCE.createBuilder();
    }

    public static gy parseDelimitedFrom(InputStream inputStream) {
        return (gy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gy parseFrom(com.google.v.v vVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreaExitCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.areaExitCoordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "areaExitCoordinates_"});
        }
        if (iOrdinal == 3) {
            return new gy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public afx getAreaExitCoordinates() {
        afx afxVar = this.areaExitCoordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public boolean hasAreaExitCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public static gx newBuilder(gy gyVar) {
        return (gx) DEFAULT_INSTANCE.createBuilder(gyVar);
    }

    public static gy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gy parseFrom(com.google.v.z zVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gy parseFrom(InputStream inputStream) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gy parseFrom(ByteBuffer byteBuffer) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gy parseFrom(byte[] bArr) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
