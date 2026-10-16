package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bmd extends com.google.v.du<bmd, bmc> implements com.google.v.fj {
    public static final int CACHE_ITEMS_COUNT_FIELD_NUMBER = 2;
    public static final int CACHE_TOTAL_SIZE_KB_FIELD_NUMBER = 1;
    private static final bmd DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bmd> PARSER;
    private int bitField0_;
    private long cacheItemsCount_;
    private long cacheTotalSizeKb_;

    static {
        bmd bmdVar = new bmd();
        DEFAULT_INSTANCE = bmdVar;
        com.google.v.du.registerDefaultInstance(bmd.class, bmdVar);
    }

    private bmd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheItemsCount() {
        this.bitField0_ &= -3;
        this.cacheItemsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCacheTotalSizeKb() {
        this.bitField0_ &= -2;
        this.cacheTotalSizeKb_ = 0L;
    }

    public static bmd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bmc newBuilder() {
        return (bmc) DEFAULT_INSTANCE.createBuilder();
    }

    public static bmd parseDelimitedFrom(InputStream inputStream) {
        return (bmd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmd parseFrom(com.google.v.v vVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bmd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheItemsCount(long j2) {
        this.bitField0_ |= 2;
        this.cacheItemsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCacheTotalSizeKb(long j2) {
        this.bitField0_ |= 1;
        this.cacheTotalSizeKb_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "cacheTotalSizeKb_", "cacheItemsCount_"});
        }
        if (iOrdinal == 3) {
            return new bmd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bmc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bmd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bmd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCacheItemsCount() {
        return this.cacheItemsCount_;
    }

    public long getCacheTotalSizeKb() {
        return this.cacheTotalSizeKb_;
    }

    public boolean hasCacheItemsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCacheTotalSizeKb() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bmc newBuilder(bmd bmdVar) {
        return (bmc) DEFAULT_INSTANCE.createBuilder(bmdVar);
    }

    public static bmd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bmd parseFrom(com.google.v.z zVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bmd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bmd parseFrom(InputStream inputStream) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bmd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bmd parseFrom(ByteBuffer byteBuffer) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bmd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bmd parseFrom(byte[] bArr) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bmd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bmd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
