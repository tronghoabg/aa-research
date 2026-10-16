package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bib extends com.google.v.du<bib, bia> implements com.google.v.fj {
    private static final bib DEFAULT_INSTANCE;
    public static final int LATENCY_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<bib> PARSER = null;
    public static final int SIZE_BYTES_FIELD_NUMBER = 2;
    public static final int TILES_COUNT_FIELD_NUMBER = 1;
    private int bitField0_;
    private long latencyMs_;
    private long sizeBytes_;
    private long tilesCount_;

    static {
        bib bibVar = new bib();
        DEFAULT_INSTANCE = bibVar;
        com.google.v.du.registerDefaultInstance(bib.class, bibVar);
    }

    private bib() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyMs() {
        this.bitField0_ &= -5;
        this.latencyMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSizeBytes() {
        this.bitField0_ &= -3;
        this.sizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTilesCount() {
        this.bitField0_ &= -2;
        this.tilesCount_ = 0L;
    }

    public static bib getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bia newBuilder() {
        return (bia) DEFAULT_INSTANCE.createBuilder();
    }

    public static bib parseDelimitedFrom(InputStream inputStream) {
        return (bib) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bib parseFrom(com.google.v.v vVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bib> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyMs(long j2) {
        this.bitField0_ |= 4;
        this.latencyMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSizeBytes(long j2) {
        this.bitField0_ |= 2;
        this.sizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTilesCount(long j2) {
        this.bitField0_ |= 1;
        this.tilesCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "tilesCount_", "sizeBytes_", "latencyMs_"});
        }
        if (iOrdinal == 3) {
            return new bib();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bia(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bib> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bib.class) {
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

    public long getSizeBytes() {
        return this.sizeBytes_;
    }

    public long getTilesCount() {
        return this.tilesCount_;
    }

    public boolean hasLatencyMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSizeBytes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTilesCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bia newBuilder(bib bibVar) {
        return (bia) DEFAULT_INSTANCE.createBuilder(bibVar);
    }

    public static bib parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bib) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bib parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bib parseFrom(com.google.v.z zVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bib parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bib parseFrom(InputStream inputStream) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bib parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bib parseFrom(ByteBuffer byteBuffer) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bib parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bib parseFrom(byte[] bArr) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bib parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bib) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
