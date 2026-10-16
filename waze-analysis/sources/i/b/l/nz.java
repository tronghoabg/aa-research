package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nz extends com.google.v.du<nz, ny> implements com.google.v.fj {
    private static final nz DEFAULT_INSTANCE;
    public static final int FROM_SEGMENT_ENCODED_S2_POINTS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<nz> PARSER = null;
    public static final int SERVER_FROM_SEGMENT_ID_FIELD_NUMBER = 1;
    public static final int TO_SEGMENT_ENCODED_S2_POINTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private com.google.v.v fromSegmentEncodedS2Points_;
    private int serverFromSegmentId_;
    private com.google.v.v toSegmentEncodedS2Points_;

    static {
        nz nzVar = new nz();
        DEFAULT_INSTANCE = nzVar;
        com.google.v.du.registerDefaultInstance(nz.class, nzVar);
    }

    private nz() {
        com.google.v.v vVar = com.google.v.v.f13054a;
        this.fromSegmentEncodedS2Points_ = vVar;
        this.toSegmentEncodedS2Points_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSegmentEncodedS2Points() {
        this.bitField0_ &= -3;
        this.fromSegmentEncodedS2Points_ = getDefaultInstance().getFromSegmentEncodedS2Points();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerFromSegmentId() {
        this.bitField0_ &= -2;
        this.serverFromSegmentId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToSegmentEncodedS2Points() {
        this.bitField0_ &= -5;
        this.toSegmentEncodedS2Points_ = getDefaultInstance().getToSegmentEncodedS2Points();
    }

    public static nz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ny newBuilder() {
        return (ny) DEFAULT_INSTANCE.createBuilder();
    }

    public static nz parseDelimitedFrom(InputStream inputStream) {
        return (nz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nz parseFrom(com.google.v.v vVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSegmentEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.fromSegmentEncodedS2Points_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerFromSegmentId(int i2) {
        this.bitField0_ |= 1;
        this.serverFromSegmentId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSegmentEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4;
        this.toSegmentEncodedS2Points_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "serverFromSegmentId_", "fromSegmentEncodedS2Points_", "toSegmentEncodedS2Points_"});
        }
        if (iOrdinal == 3) {
            return new nz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ny(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getFromSegmentEncodedS2Points() {
        return this.fromSegmentEncodedS2Points_;
    }

    public int getServerFromSegmentId() {
        return this.serverFromSegmentId_;
    }

    public com.google.v.v getToSegmentEncodedS2Points() {
        return this.toSegmentEncodedS2Points_;
    }

    public boolean hasFromSegmentEncodedS2Points() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasServerFromSegmentId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToSegmentEncodedS2Points() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ny newBuilder(nz nzVar) {
        return (ny) DEFAULT_INSTANCE.createBuilder(nzVar);
    }

    public static nz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nz parseFrom(com.google.v.z zVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nz parseFrom(InputStream inputStream) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nz parseFrom(ByteBuffer byteBuffer) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nz parseFrom(byte[] bArr) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
