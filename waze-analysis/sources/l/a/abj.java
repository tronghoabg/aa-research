package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abj extends com.google.v.du<abj, abi> implements com.google.v.fj {
    public static final int CURRENT_APP_SIZE_BYTES_FIELD_NUMBER = 7;
    public static final int CURRENT_CACHE_SIZE_BYTES_FIELD_NUMBER = 9;
    public static final int CURRENT_DATA_SIZE_BYTES_FIELD_NUMBER = 8;
    public static final int CURRENT_JVM_HEAP_ALLOCATED_BYTES_FIELD_NUMBER = 6;
    public static final int CURRENT_JVM_HEAP_SIZE_BYTES_FIELD_NUMBER = 5;
    private static final abj DEFAULT_INSTANCE;
    public static final int NATIVE_HEAP_ALLOCATED_BYTES_FIELD_NUMBER = 4;
    public static final int NATIVE_HEAP_SIZE_BYTES_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<abj> PARSER = null;
    public static final int TOTAL_FOREGROUND_SECONDS_FIELD_NUMBER = 11;
    public static final int TOTAL_RECEIVED_BYTES_FIELD_NUMBER = 1;
    public static final int TOTAL_SENT_BYTES_FIELD_NUMBER = 2;
    public static final int TOTAL_UPTIME_SECONDS_FIELD_NUMBER = 10;
    private int bitField0_;
    private long currentAppSizeBytes_;
    private long currentCacheSizeBytes_;
    private long currentDataSizeBytes_;
    private long currentJvmHeapAllocatedBytes_;
    private long currentJvmHeapSizeBytes_;
    private long nativeHeapAllocatedBytes_;
    private long nativeHeapSizeBytes_;
    private long totalForegroundSeconds_;
    private long totalReceivedBytes_;
    private long totalSentBytes_;
    private long totalUptimeSeconds_;

    static {
        abj abjVar = new abj();
        DEFAULT_INSTANCE = abjVar;
        com.google.v.du.registerDefaultInstance(abj.class, abjVar);
    }

    private abj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentAppSizeBytes() {
        this.bitField0_ &= -65;
        this.currentAppSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentCacheSizeBytes() {
        this.bitField0_ &= -257;
        this.currentCacheSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentDataSizeBytes() {
        this.bitField0_ &= -129;
        this.currentDataSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentJvmHeapAllocatedBytes() {
        this.bitField0_ &= -33;
        this.currentJvmHeapAllocatedBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentJvmHeapSizeBytes() {
        this.bitField0_ &= -17;
        this.currentJvmHeapSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeHeapAllocatedBytes() {
        this.bitField0_ &= -9;
        this.nativeHeapAllocatedBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNativeHeapSizeBytes() {
        this.bitField0_ &= -5;
        this.nativeHeapSizeBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalForegroundSeconds() {
        this.bitField0_ &= -1025;
        this.totalForegroundSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalReceivedBytes() {
        this.bitField0_ &= -2;
        this.totalReceivedBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSentBytes() {
        this.bitField0_ &= -3;
        this.totalSentBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalUptimeSeconds() {
        this.bitField0_ &= -513;
        this.totalUptimeSeconds_ = 0L;
    }

    public static abj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abi newBuilder() {
        return (abi) DEFAULT_INSTANCE.createBuilder();
    }

    public static abj parseDelimitedFrom(InputStream inputStream) {
        return (abj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abj parseFrom(com.google.v.v vVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentAppSizeBytes(long j2) {
        this.bitField0_ |= 64;
        this.currentAppSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentCacheSizeBytes(long j2) {
        this.bitField0_ |= 256;
        this.currentCacheSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentDataSizeBytes(long j2) {
        this.bitField0_ |= 128;
        this.currentDataSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentJvmHeapAllocatedBytes(long j2) {
        this.bitField0_ |= 32;
        this.currentJvmHeapAllocatedBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentJvmHeapSizeBytes(long j2) {
        this.bitField0_ |= 16;
        this.currentJvmHeapSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeHeapAllocatedBytes(long j2) {
        this.bitField0_ |= 8;
        this.nativeHeapAllocatedBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNativeHeapSizeBytes(long j2) {
        this.bitField0_ |= 4;
        this.nativeHeapSizeBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalForegroundSeconds(long j2) {
        this.bitField0_ |= 1024;
        this.totalForegroundSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalReceivedBytes(long j2) {
        this.bitField0_ |= 1;
        this.totalReceivedBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSentBytes(long j2) {
        this.bitField0_ |= 2;
        this.totalSentBytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalUptimeSeconds(long j2) {
        this.bitField0_ |= 512;
        this.totalUptimeSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n", new Object[]{"bitField0_", "totalReceivedBytes_", "totalSentBytes_", "nativeHeapSizeBytes_", "nativeHeapAllocatedBytes_", "currentJvmHeapSizeBytes_", "currentJvmHeapAllocatedBytes_", "currentAppSizeBytes_", "currentDataSizeBytes_", "currentCacheSizeBytes_", "totalUptimeSeconds_", "totalForegroundSeconds_"});
        }
        if (iOrdinal == 3) {
            return new abj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getCurrentAppSizeBytes() {
        return this.currentAppSizeBytes_;
    }

    public long getCurrentCacheSizeBytes() {
        return this.currentCacheSizeBytes_;
    }

    public long getCurrentDataSizeBytes() {
        return this.currentDataSizeBytes_;
    }

    public long getCurrentJvmHeapAllocatedBytes() {
        return this.currentJvmHeapAllocatedBytes_;
    }

    public long getCurrentJvmHeapSizeBytes() {
        return this.currentJvmHeapSizeBytes_;
    }

    public long getNativeHeapAllocatedBytes() {
        return this.nativeHeapAllocatedBytes_;
    }

    public long getNativeHeapSizeBytes() {
        return this.nativeHeapSizeBytes_;
    }

    public long getTotalForegroundSeconds() {
        return this.totalForegroundSeconds_;
    }

    public long getTotalReceivedBytes() {
        return this.totalReceivedBytes_;
    }

    public long getTotalSentBytes() {
        return this.totalSentBytes_;
    }

    public long getTotalUptimeSeconds() {
        return this.totalUptimeSeconds_;
    }

    public boolean hasCurrentAppSizeBytes() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCurrentCacheSizeBytes() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasCurrentDataSizeBytes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCurrentJvmHeapAllocatedBytes() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCurrentJvmHeapSizeBytes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNativeHeapAllocatedBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNativeHeapSizeBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTotalForegroundSeconds() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTotalReceivedBytes() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTotalSentBytes() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTotalUptimeSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    public static abi newBuilder(abj abjVar) {
        return (abi) DEFAULT_INSTANCE.createBuilder(abjVar);
    }

    public static abj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abj parseFrom(com.google.v.z zVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abj parseFrom(InputStream inputStream) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abj parseFrom(ByteBuffer byteBuffer) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abj parseFrom(byte[] bArr) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
