package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ol extends com.google.v.du<ol, ok> implements com.google.v.fj {
    public static final int COORDINATE_FIELD_NUMBER = 1;
    private static final ol DEFAULT_INSTANCE;
    public static final int FROMNODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ol> PARSER = null;
    public static final int TIMESTAMP_MILLISECONDS_FIELD_NUMBER = 4;
    public static final int TONODE_FIELD_NUMBER = 3;
    private int bitField0_;
    private i.b.s coordinate_;
    private long fromNode_;
    private long timestampMilliseconds_;
    private long toNode_;

    static {
        ol olVar = new ol();
        DEFAULT_INSTANCE = olVar;
        com.google.v.du.registerDefaultInstance(ol.class, olVar);
    }

    private ol() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -3;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMilliseconds() {
        this.bitField0_ &= -9;
        this.timestampMilliseconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -5;
        this.toNode_ = 0L;
    }

    public static ol getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.coordinate_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    public static ok newBuilder() {
        return (ok) DEFAULT_INSTANCE.createBuilder();
    }

    public static ol parseDelimitedFrom(InputStream inputStream) {
        return (ol) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ol parseFrom(com.google.v.v vVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ol> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 2;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMilliseconds(long j2) {
        this.bitField0_ |= 8;
        this.timestampMilliseconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 4;
        this.toNode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "coordinate_", "fromNode_", "toNode_", "timestampMilliseconds_"});
        }
        if (iOrdinal == 3) {
            return new ol();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ok(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ol> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ol.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getCoordinate() {
        i.b.s sVar = this.coordinate_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    public long getTimestampMilliseconds() {
        return this.timestampMilliseconds_;
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimestampMilliseconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ok newBuilder(ol olVar) {
        return (ok) DEFAULT_INSTANCE.createBuilder(olVar);
    }

    public static ol parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ol) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ol parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ol parseFrom(com.google.v.z zVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ol parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ol parseFrom(InputStream inputStream) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ol parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ol parseFrom(ByteBuffer byteBuffer) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ol parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ol parseFrom(byte[] bArr) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ol parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ol) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
