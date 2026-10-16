package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afj extends com.google.v.du<afj, afi> implements com.google.v.fj {
    public static final int ABNORMAL_EXIT_FIELD_NUMBER = 3;
    public static final int APP_WATCHDOG_FIELD_NUMBER = 1;
    public static final int BACKGROUND_TASK_ASSERTION_TIMEOUT_FIELD_NUMBER = 9;
    public static final int BAD_ACCESS_FIELD_NUMBER = 7;
    public static final int CPU_RESOURCE_LIMIT_FIELD_NUMBER = 8;
    private static final afj DEFAULT_INSTANCE;
    public static final int ILLEGAL_INSTRUCTION_FIELD_NUMBER = 5;
    public static final int MEMORY_PRESSURE_FIELD_NUMBER = 6;
    public static final int MEMORY_RESOURCE_LIMIT_FIELD_NUMBER = 2;
    public static final int NORMAL_APP_EXIT_FIELD_NUMBER = 10;
    private static volatile com.google.v.fo<afj> PARSER = null;
    public static final int SUSPENDED_WITH_LOCKED_FILE_FIELD_NUMBER = 4;
    private long abnormalExit_;
    private long appWatchdog_;
    private long backgroundTaskAssertionTimeout_;
    private long badAccess_;
    private int bitField0_;
    private long cpuResourceLimit_;
    private long illegalInstruction_;
    private long memoryPressure_;
    private long memoryResourceLimit_;
    private long normalAppExit_;
    private long suspendedWithLockedFile_;

    static {
        afj afjVar = new afj();
        DEFAULT_INSTANCE = afjVar;
        com.google.v.du.registerDefaultInstance(afj.class, afjVar);
    }

    private afj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbnormalExit() {
        this.bitField0_ &= -5;
        this.abnormalExit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppWatchdog() {
        this.bitField0_ &= -2;
        this.appWatchdog_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundTaskAssertionTimeout() {
        this.bitField0_ &= -257;
        this.backgroundTaskAssertionTimeout_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadAccess() {
        this.bitField0_ &= -65;
        this.badAccess_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuResourceLimit() {
        this.bitField0_ &= -129;
        this.cpuResourceLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIllegalInstruction() {
        this.bitField0_ &= -17;
        this.illegalInstruction_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryPressure() {
        this.bitField0_ &= -33;
        this.memoryPressure_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryResourceLimit() {
        this.bitField0_ &= -3;
        this.memoryResourceLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalAppExit() {
        this.bitField0_ &= -513;
        this.normalAppExit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuspendedWithLockedFile() {
        this.bitField0_ &= -9;
        this.suspendedWithLockedFile_ = 0L;
    }

    public static afj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afi newBuilder() {
        return (afi) DEFAULT_INSTANCE.createBuilder();
    }

    public static afj parseDelimitedFrom(InputStream inputStream) {
        return (afj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afj parseFrom(com.google.v.v vVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbnormalExit(long j2) {
        this.bitField0_ |= 4;
        this.abnormalExit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppWatchdog(long j2) {
        this.bitField0_ |= 1;
        this.appWatchdog_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundTaskAssertionTimeout(long j2) {
        this.bitField0_ |= 256;
        this.backgroundTaskAssertionTimeout_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadAccess(long j2) {
        this.bitField0_ |= 64;
        this.badAccess_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuResourceLimit(long j2) {
        this.bitField0_ |= 128;
        this.cpuResourceLimit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIllegalInstruction(long j2) {
        this.bitField0_ |= 16;
        this.illegalInstruction_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryPressure(long j2) {
        this.bitField0_ |= 32;
        this.memoryPressure_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryResourceLimit(long j2) {
        this.bitField0_ |= 2;
        this.memoryResourceLimit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalAppExit(long j2) {
        this.bitField0_ |= 512;
        this.normalAppExit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuspendedWithLockedFile(long j2) {
        this.bitField0_ |= 8;
        this.suspendedWithLockedFile_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "appWatchdog_", "memoryResourceLimit_", "abnormalExit_", "suspendedWithLockedFile_", "illegalInstruction_", "memoryPressure_", "badAccess_", "cpuResourceLimit_", "backgroundTaskAssertionTimeout_", "normalAppExit_"});
        }
        if (iOrdinal == 3) {
            return new afj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAbnormalExit() {
        return this.abnormalExit_;
    }

    public long getAppWatchdog() {
        return this.appWatchdog_;
    }

    public long getBackgroundTaskAssertionTimeout() {
        return this.backgroundTaskAssertionTimeout_;
    }

    public long getBadAccess() {
        return this.badAccess_;
    }

    public long getCpuResourceLimit() {
        return this.cpuResourceLimit_;
    }

    public long getIllegalInstruction() {
        return this.illegalInstruction_;
    }

    public long getMemoryPressure() {
        return this.memoryPressure_;
    }

    public long getMemoryResourceLimit() {
        return this.memoryResourceLimit_;
    }

    public long getNormalAppExit() {
        return this.normalAppExit_;
    }

    public long getSuspendedWithLockedFile() {
        return this.suspendedWithLockedFile_;
    }

    public boolean hasAbnormalExit() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppWatchdog() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBackgroundTaskAssertionTimeout() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasBadAccess() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCpuResourceLimit() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIllegalInstruction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMemoryPressure() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMemoryResourceLimit() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNormalAppExit() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasSuspendedWithLockedFile() {
        return (this.bitField0_ & 8) != 0;
    }

    public static afi newBuilder(afj afjVar) {
        return (afi) DEFAULT_INSTANCE.createBuilder(afjVar);
    }

    public static afj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afj parseFrom(com.google.v.z zVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afj parseFrom(InputStream inputStream) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afj parseFrom(ByteBuffer byteBuffer) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afj parseFrom(byte[] bArr) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
