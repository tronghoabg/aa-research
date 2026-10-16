package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afp extends com.google.v.du<afp, afk> implements com.google.v.fj {
    public static final int APP_LAUNCH_DURATIONS_FIELD_NUMBER = 13;
    public static final int APP_USAGE_DURATIONS_FIELD_NUMBER = 9;
    public static final int AVERAGE_SUSPENDED_MEMORY_USAGE_KILOBYTES_FIELD_NUMBER = 7;
    public static final int BACKGROUND_EXITS_FIELD_NUMBER = 10;
    public static final int CPU_INSTRUCTIONS_FIELD_NUMBER = 5;
    public static final int CPU_SECONDS_FIELD_NUMBER = 4;
    private static final afp DEFAULT_INSTANCE;
    public static final int DISK_WRITE_KILOBYTES_FIELD_NUMBER = 3;
    public static final int FOREGROUND_EXITS_FIELD_NUMBER = 11;
    public static final int NETWORK_TRANSFER_KILOBYTES_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<afp> PARSER = null;
    public static final int PEAK_MEMORY_USAGE_KILOBYTES_FIELD_NUMBER = 6;
    public static final int PERIOD_END_TIMESTAMP_UNIX_FIELD_NUMBER = 2;
    public static final int PERIOD_START_TIMESTAMP_UNIX_FIELD_NUMBER = 1;
    public static final int TOTAL_APP_HANG_DURATION_MS_FIELD_NUMBER = 12;
    private aff appLaunchDurations_;
    private afh appUsageDurations_;
    private long averageSuspendedMemoryUsageKilobytes_;
    private afj backgroundExits_;
    private int bitField0_;
    private long cpuInstructions_;
    private long cpuSeconds_;
    private long diskWriteKilobytes_;
    private afm foregroundExits_;
    private afo networkTransferKilobytes_;
    private long peakMemoryUsageKilobytes_;
    private long periodEndTimestampUnix_;
    private long periodStartTimestampUnix_;
    private long totalAppHangDurationMs_;

    static {
        afp afpVar = new afp();
        DEFAULT_INSTANCE = afpVar;
        com.google.v.du.registerDefaultInstance(afp.class, afpVar);
    }

    private afp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppLaunchDurations() {
        this.appLaunchDurations_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppUsageDurations() {
        this.appUsageDurations_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageSuspendedMemoryUsageKilobytes() {
        this.bitField0_ &= -65;
        this.averageSuspendedMemoryUsageKilobytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundExits() {
        this.backgroundExits_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuInstructions() {
        this.bitField0_ &= -17;
        this.cpuInstructions_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuSeconds() {
        this.bitField0_ &= -9;
        this.cpuSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDiskWriteKilobytes() {
        this.bitField0_ &= -5;
        this.diskWriteKilobytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForegroundExits() {
        this.foregroundExits_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkTransferKilobytes() {
        this.networkTransferKilobytes_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeakMemoryUsageKilobytes() {
        this.bitField0_ &= -33;
        this.peakMemoryUsageKilobytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodEndTimestampUnix() {
        this.bitField0_ &= -3;
        this.periodEndTimestampUnix_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodStartTimestampUnix() {
        this.bitField0_ &= -2;
        this.periodStartTimestampUnix_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalAppHangDurationMs() {
        this.bitField0_ &= -2049;
        this.totalAppHangDurationMs_ = 0L;
    }

    public static afp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppLaunchDurations(aff affVar) {
        Objects.requireNonNull(affVar);
        aff affVar2 = this.appLaunchDurations_;
        if (affVar2 != null && affVar2 != aff.getDefaultInstance()) {
            afe afeVarNewBuilder = aff.newBuilder(affVar2);
            afeVarNewBuilder.mergeFrom((afe) affVar);
            affVar = afeVarNewBuilder.buildPartial();
        }
        this.appLaunchDurations_ = affVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAppUsageDurations(afh afhVar) {
        Objects.requireNonNull(afhVar);
        afh afhVar2 = this.appUsageDurations_;
        if (afhVar2 != null && afhVar2 != afh.getDefaultInstance()) {
            afg afgVarNewBuilder = afh.newBuilder(afhVar2);
            afgVarNewBuilder.mergeFrom((afg) afhVar);
            afhVar = afgVarNewBuilder.buildPartial();
        }
        this.appUsageDurations_ = afhVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackgroundExits(afj afjVar) {
        Objects.requireNonNull(afjVar);
        afj afjVar2 = this.backgroundExits_;
        if (afjVar2 != null && afjVar2 != afj.getDefaultInstance()) {
            afi afiVarNewBuilder = afj.newBuilder(afjVar2);
            afiVarNewBuilder.mergeFrom((afi) afjVar);
            afjVar = afiVarNewBuilder.buildPartial();
        }
        this.backgroundExits_ = afjVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeForegroundExits(afm afmVar) {
        Objects.requireNonNull(afmVar);
        afm afmVar2 = this.foregroundExits_;
        if (afmVar2 != null && afmVar2 != afm.getDefaultInstance()) {
            afl aflVarNewBuilder = afm.newBuilder(afmVar2);
            aflVarNewBuilder.mergeFrom((afl) afmVar);
            afmVar = aflVarNewBuilder.buildPartial();
        }
        this.foregroundExits_ = afmVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkTransferKilobytes(afo afoVar) {
        Objects.requireNonNull(afoVar);
        afo afoVar2 = this.networkTransferKilobytes_;
        if (afoVar2 != null && afoVar2 != afo.getDefaultInstance()) {
            afn afnVarNewBuilder = afo.newBuilder(afoVar2);
            afnVarNewBuilder.mergeFrom((afn) afoVar);
            afoVar = afnVarNewBuilder.buildPartial();
        }
        this.networkTransferKilobytes_ = afoVar;
        this.bitField0_ |= 128;
    }

    public static afk newBuilder() {
        return (afk) DEFAULT_INSTANCE.createBuilder();
    }

    public static afp parseDelimitedFrom(InputStream inputStream) {
        return (afp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afp parseFrom(com.google.v.v vVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppLaunchDurations(aff affVar) {
        Objects.requireNonNull(affVar);
        this.appLaunchDurations_ = affVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppUsageDurations(afh afhVar) {
        Objects.requireNonNull(afhVar);
        this.appUsageDurations_ = afhVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageSuspendedMemoryUsageKilobytes(long j2) {
        this.bitField0_ |= 64;
        this.averageSuspendedMemoryUsageKilobytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundExits(afj afjVar) {
        Objects.requireNonNull(afjVar);
        this.backgroundExits_ = afjVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuInstructions(long j2) {
        this.bitField0_ |= 16;
        this.cpuInstructions_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuSeconds(long j2) {
        this.bitField0_ |= 8;
        this.cpuSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDiskWriteKilobytes(long j2) {
        this.bitField0_ |= 4;
        this.diskWriteKilobytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForegroundExits(afm afmVar) {
        Objects.requireNonNull(afmVar);
        this.foregroundExits_ = afmVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkTransferKilobytes(afo afoVar) {
        Objects.requireNonNull(afoVar);
        this.networkTransferKilobytes_ = afoVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeakMemoryUsageKilobytes(long j2) {
        this.bitField0_ |= 32;
        this.peakMemoryUsageKilobytes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodEndTimestampUnix(long j2) {
        this.bitField0_ |= 2;
        this.periodEndTimestampUnix_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodStartTimestampUnix(long j2) {
        this.bitField0_ |= 1;
        this.periodStartTimestampUnix_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalAppHangDurationMs(long j2) {
        this.bitField0_ |= 2048;
        this.totalAppHangDurationMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဂ\u000b\rဉ\f", new Object[]{"bitField0_", "periodStartTimestampUnix_", "periodEndTimestampUnix_", "diskWriteKilobytes_", "cpuSeconds_", "cpuInstructions_", "peakMemoryUsageKilobytes_", "averageSuspendedMemoryUsageKilobytes_", "networkTransferKilobytes_", "appUsageDurations_", "backgroundExits_", "foregroundExits_", "totalAppHangDurationMs_", "appLaunchDurations_"});
        }
        if (iOrdinal == 3) {
            return new afp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aff getAppLaunchDurations() {
        aff affVar = this.appLaunchDurations_;
        return affVar == null ? aff.getDefaultInstance() : affVar;
    }

    public afh getAppUsageDurations() {
        afh afhVar = this.appUsageDurations_;
        return afhVar == null ? afh.getDefaultInstance() : afhVar;
    }

    public long getAverageSuspendedMemoryUsageKilobytes() {
        return this.averageSuspendedMemoryUsageKilobytes_;
    }

    public afj getBackgroundExits() {
        afj afjVar = this.backgroundExits_;
        return afjVar == null ? afj.getDefaultInstance() : afjVar;
    }

    public long getCpuInstructions() {
        return this.cpuInstructions_;
    }

    public long getCpuSeconds() {
        return this.cpuSeconds_;
    }

    public long getDiskWriteKilobytes() {
        return this.diskWriteKilobytes_;
    }

    public afm getForegroundExits() {
        afm afmVar = this.foregroundExits_;
        return afmVar == null ? afm.getDefaultInstance() : afmVar;
    }

    public afo getNetworkTransferKilobytes() {
        afo afoVar = this.networkTransferKilobytes_;
        return afoVar == null ? afo.getDefaultInstance() : afoVar;
    }

    public long getPeakMemoryUsageKilobytes() {
        return this.peakMemoryUsageKilobytes_;
    }

    public long getPeriodEndTimestampUnix() {
        return this.periodEndTimestampUnix_;
    }

    public long getPeriodStartTimestampUnix() {
        return this.periodStartTimestampUnix_;
    }

    public long getTotalAppHangDurationMs() {
        return this.totalAppHangDurationMs_;
    }

    public boolean hasAppLaunchDurations() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasAppUsageDurations() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAverageSuspendedMemoryUsageKilobytes() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasBackgroundExits() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCpuInstructions() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCpuSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDiskWriteKilobytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasForegroundExits() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasNetworkTransferKilobytes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPeakMemoryUsageKilobytes() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPeriodEndTimestampUnix() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPeriodStartTimestampUnix() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTotalAppHangDurationMs() {
        return (this.bitField0_ & 2048) != 0;
    }

    public static afk newBuilder(afp afpVar) {
        return (afk) DEFAULT_INSTANCE.createBuilder(afpVar);
    }

    public static afp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afp parseFrom(com.google.v.z zVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afp parseFrom(InputStream inputStream) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afp parseFrom(ByteBuffer byteBuffer) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afp parseFrom(byte[] bArr) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
