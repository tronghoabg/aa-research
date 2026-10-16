package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class rz extends com.google.v.du<rz, ry> implements com.google.v.fj {
    private static final rz DEFAULT_INSTANCE;
    public static final int ENCODEDS2POINTS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<rz> PARSER;
    private int bitField0_;
    private com.google.v.v encodedS2Points_ = com.google.v.v.f13054a;

    static {
        rz rzVar = new rz();
        DEFAULT_INSTANCE = rzVar;
        com.google.v.du.registerDefaultInstance(rz.class, rzVar);
    }

    private rz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodedS2Points() {
        this.bitField0_ &= -2;
        this.encodedS2Points_ = getDefaultInstance().getEncodedS2Points();
    }

    public static rz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ry newBuilder() {
        return (ry) DEFAULT_INSTANCE.createBuilder();
    }

    public static rz parseDelimitedFrom(InputStream inputStream) {
        return (rz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rz parseFrom(com.google.v.v vVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<rz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.encodedS2Points_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "encodedS2Points_"});
        }
        if (iOrdinal == 3) {
            return new rz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ry(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<rz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (rz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getEncodedS2Points() {
        return this.encodedS2Points_;
    }

    public boolean hasEncodedS2Points() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ry newBuilder(rz rzVar) {
        return (ry) DEFAULT_INSTANCE.createBuilder(rzVar);
    }

    public static rz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static rz parseFrom(com.google.v.z zVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static rz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static rz parseFrom(InputStream inputStream) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static rz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static rz parseFrom(ByteBuffer byteBuffer) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static rz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static rz parseFrom(byte[] bArr) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static rz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (rz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
