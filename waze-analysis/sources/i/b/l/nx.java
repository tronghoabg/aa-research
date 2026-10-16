package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nx extends com.google.v.du<nx, nw> implements com.google.v.fj {
    private static final nx DEFAULT_INSTANCE;
    public static final int ENCODED_S2_POINTS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<nx> PARSER = null;
    public static final int SERVER_SEGMENT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.v encodedS2Points_ = com.google.v.v.f13054a;
    private int serverSegmentId_;

    static {
        nx nxVar = new nx();
        DEFAULT_INSTANCE = nxVar;
        com.google.v.du.registerDefaultInstance(nx.class, nxVar);
    }

    private nx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodedS2Points() {
        this.bitField0_ &= -3;
        this.encodedS2Points_ = getDefaultInstance().getEncodedS2Points();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSegmentId() {
        this.bitField0_ &= -2;
        this.serverSegmentId_ = 0;
    }

    public static nx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nw newBuilder() {
        return (nw) DEFAULT_INSTANCE.createBuilder();
    }

    public static nx parseDelimitedFrom(InputStream inputStream) {
        return (nx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nx parseFrom(com.google.v.v vVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.encodedS2Points_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSegmentId(int i2) {
        this.bitField0_ |= 1;
        this.serverSegmentId_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"bitField0_", "serverSegmentId_", "encodedS2Points_"});
        }
        if (iOrdinal == 3) {
            return new nx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nx.class) {
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

    public int getServerSegmentId() {
        return this.serverSegmentId_;
    }

    public boolean hasEncodedS2Points() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasServerSegmentId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nw newBuilder(nx nxVar) {
        return (nw) DEFAULT_INSTANCE.createBuilder(nxVar);
    }

    public static nx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nx parseFrom(com.google.v.z zVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nx parseFrom(InputStream inputStream) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nx parseFrom(ByteBuffer byteBuffer) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nx parseFrom(byte[] bArr) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
