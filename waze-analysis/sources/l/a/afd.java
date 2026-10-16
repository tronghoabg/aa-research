package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afd extends com.google.v.du<afd, afc> implements com.google.v.fj {
    private static final afd DEFAULT_INSTANCE;
    public static final int HANG_DURATIONS_MS_FIELD_NUMBER = 4;
    public static final int LAUNCH_DURATIONS_MS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<afd> PARSER = null;
    public static final int PERIOD_END_TIMESTAMP_SECOND_FIELD_NUMBER = 2;
    public static final int PERIOD_START_TIMESTAMP_SECOND_FIELD_NUMBER = 1;
    private int bitField0_;
    private long periodEndTimestampSecond_;
    private long periodStartTimestampSecond_;
    private int launchDurationsMsMemoizedSerializedSize = -1;
    private int hangDurationsMsMemoizedSerializedSize = -1;
    private com.google.v.en launchDurationsMs_ = emptyLongList();
    private com.google.v.en hangDurationsMs_ = emptyLongList();

    static {
        afd afdVar = new afd();
        DEFAULT_INSTANCE = afdVar;
        com.google.v.du.registerDefaultInstance(afd.class, afdVar);
    }

    private afd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHangDurationsMs(Iterable<? extends Long> iterable) {
        ensureHangDurationsMsIsMutable();
        com.google.v.c.addAll(iterable, this.hangDurationsMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLaunchDurationsMs(Iterable<? extends Long> iterable) {
        ensureLaunchDurationsMsIsMutable();
        com.google.v.c.addAll(iterable, this.launchDurationsMs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHangDurationsMs(long j2) {
        ensureHangDurationsMsIsMutable();
        this.hangDurationsMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLaunchDurationsMs(long j2) {
        ensureLaunchDurationsMsIsMutable();
        this.launchDurationsMs_.g(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHangDurationsMs() {
        this.hangDurationsMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchDurationsMs() {
        this.launchDurationsMs_ = emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodEndTimestampSecond() {
        this.bitField0_ &= -3;
        this.periodEndTimestampSecond_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodStartTimestampSecond() {
        this.bitField0_ &= -2;
        this.periodStartTimestampSecond_ = 0L;
    }

    private void ensureHangDurationsMsIsMutable() {
        com.google.v.en enVar = this.hangDurationsMs_;
        if (enVar.c()) {
            return;
        }
        this.hangDurationsMs_ = com.google.v.du.mutableCopy(enVar);
    }

    private void ensureLaunchDurationsMsIsMutable() {
        com.google.v.en enVar = this.launchDurationsMs_;
        if (enVar.c()) {
            return;
        }
        this.launchDurationsMs_ = com.google.v.du.mutableCopy(enVar);
    }

    public static afd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afc newBuilder() {
        return (afc) DEFAULT_INSTANCE.createBuilder();
    }

    public static afd parseDelimitedFrom(InputStream inputStream) {
        return (afd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afd parseFrom(com.google.v.v vVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHangDurationsMs(int i2, long j2) {
        ensureHangDurationsMsIsMutable();
        this.hangDurationsMs_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchDurationsMs(int i2, long j2) {
        ensureLaunchDurationsMsIsMutable();
        this.launchDurationsMs_.d(i2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodEndTimestampSecond(long j2) {
        this.bitField0_ |= 2;
        this.periodEndTimestampSecond_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodStartTimestampSecond(long j2) {
        this.bitField0_ |= 1;
        this.periodStartTimestampSecond_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003%\u0004%", new Object[]{"bitField0_", "periodStartTimestampSecond_", "periodEndTimestampSecond_", "launchDurationsMs_", "hangDurationsMs_"});
        }
        if (iOrdinal == 3) {
            return new afd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afd> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afd.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getHangDurationsMs(int i2) {
        return this.hangDurationsMs_.a(i2);
    }

    public int getHangDurationsMsCount() {
        return this.hangDurationsMs_.size();
    }

    public List<Long> getHangDurationsMsList() {
        return this.hangDurationsMs_;
    }

    public long getLaunchDurationsMs(int i2) {
        return this.launchDurationsMs_.a(i2);
    }

    public int getLaunchDurationsMsCount() {
        return this.launchDurationsMs_.size();
    }

    public List<Long> getLaunchDurationsMsList() {
        return this.launchDurationsMs_;
    }

    public long getPeriodEndTimestampSecond() {
        return this.periodEndTimestampSecond_;
    }

    public long getPeriodStartTimestampSecond() {
        return this.periodStartTimestampSecond_;
    }

    public boolean hasPeriodEndTimestampSecond() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPeriodStartTimestampSecond() {
        return (this.bitField0_ & 1) != 0;
    }

    public static afc newBuilder(afd afdVar) {
        return (afc) DEFAULT_INSTANCE.createBuilder(afdVar);
    }

    public static afd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afd parseFrom(com.google.v.z zVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afd parseFrom(InputStream inputStream) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afd parseFrom(ByteBuffer byteBuffer) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afd parseFrom(byte[] bArr) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
