package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bjk extends com.google.v.du<bjk, bjj> implements com.google.v.fj {
    private static final bjk DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bjk> PARSER = null;
    public static final int TOTAL_DOWNLOADED_TILES_SIZE_BYTES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long totalDownloadedTilesSizeBytes_;

    static {
        bjk bjkVar = new bjk();
        DEFAULT_INSTANCE = bjkVar;
        com.google.v.du.registerDefaultInstance(bjk.class, bjkVar);
    }

    private bjk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDownloadedTilesSizeBytes() {
        this.bitField0_ &= -2;
        this.totalDownloadedTilesSizeBytes_ = 0L;
    }

    public static bjk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bjj newBuilder() {
        return (bjj) DEFAULT_INSTANCE.createBuilder();
    }

    public static bjk parseDelimitedFrom(InputStream inputStream) {
        return (bjk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjk parseFrom(com.google.v.v vVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bjk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDownloadedTilesSizeBytes(long j2) {
        this.bitField0_ |= 1;
        this.totalDownloadedTilesSizeBytes_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "totalDownloadedTilesSizeBytes_"});
        }
        if (iOrdinal == 3) {
            return new bjk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bjk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bjk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getTotalDownloadedTilesSizeBytes() {
        return this.totalDownloadedTilesSizeBytes_;
    }

    public boolean hasTotalDownloadedTilesSizeBytes() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bjj newBuilder(bjk bjkVar) {
        return (bjj) DEFAULT_INSTANCE.createBuilder(bjkVar);
    }

    public static bjk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bjk parseFrom(com.google.v.z zVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bjk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bjk parseFrom(InputStream inputStream) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bjk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bjk parseFrom(ByteBuffer byteBuffer) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bjk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bjk parseFrom(byte[] bArr) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bjk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bjk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
