package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bii extends com.google.v.du<bii, bih> implements com.google.v.fj {
    private static final bii DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bii> PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 1;
    public static final int SIZE_BYTES_FIELD_NUMBER = 2;
    public static final int TILE_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private long latencyMs_;
    private long priority_;
    private long sizeBytes_;
    private long tileId_;

    static {
        bii biiVar = new bii();
        DEFAULT_INSTANCE = biiVar;
        com.google.v.du.registerDefaultInstance(bii.class, biiVar);
    }

    private bii() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -5;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -2;
        this.priority_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSizeBytes() {
        this.bitField0_ &= -3;
        this.sizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -9;
        this.tileId_ = 0L;
    }

    public static bii getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bih newBuilder() {
        return (bih) DEFAULT_INSTANCE.createBuilder();
    }

    public static bii parseDelimitedFrom(InputStream inputStream) {
        return (bii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bii parseFrom(com.google.v.v vVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bii> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 4;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(long j2) {
        this.bitField0_ |= 1;
        this.priority_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizeBytes(long j2) {
        this.bitField0_ |= 2;
        this.sizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(long j2) {
        this.bitField0_ |= 8;
        this.tileId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "priority_", "sizeBytes_", "latencyMs_", "tileId_"});
        }
        if (iOrdinal == 3) {
            return new bii();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bih(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bii> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bii.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getLatencyMs() {
        return this.latencyMs_;
    }

    public long getPriority() {
        return this.priority_;
    }

    public long getSizeBytes() {
        return this.sizeBytes_;
    }

    public long getTileId() {
        return this.tileId_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSizeBytes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static bih newBuilder(bii biiVar) {
        return (bih) DEFAULT_INSTANCE.createBuilder(biiVar);
    }

    public static bii parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bii) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bii parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bii parseFrom(com.google.v.z zVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bii parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bii parseFrom(InputStream inputStream) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bii parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bii parseFrom(ByteBuffer byteBuffer) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bii parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bii parseFrom(byte[] bArr) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bii parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bii) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
