package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class afm extends com.google.v.du<afm, afl> implements com.google.v.fj {
    public static final int ABNORMAL_EXIT_FIELD_NUMBER = 4;
    public static final int APP_WATCHDOG_FIELD_NUMBER = 1;
    public static final int BAD_ACCESS_FIELD_NUMBER = 3;
    private static final afm DEFAULT_INSTANCE;
    public static final int ILLEGAL_INSTRUCTION_FIELD_NUMBER = 5;
    public static final int MEMORY_RESOURCE_LIMIT_FIELD_NUMBER = 2;
    public static final int NORMAL_APP_EXIT_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<afm> PARSER;
    private long abnormalExit_;
    private long appWatchdog_;
    private long badAccess_;
    private int bitField0_;
    private long illegalInstruction_;
    private long memoryResourceLimit_;
    private long normalAppExit_;

    static {
        afm afmVar = new afm();
        DEFAULT_INSTANCE = afmVar;
        com.google.v.du.registerDefaultInstance(afm.class, afmVar);
    }

    private afm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbnormalExit() {
        this.bitField0_ &= -9;
        this.abnormalExit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppWatchdog() {
        this.bitField0_ &= -2;
        this.appWatchdog_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadAccess() {
        this.bitField0_ &= -5;
        this.badAccess_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIllegalInstruction() {
        this.bitField0_ &= -17;
        this.illegalInstruction_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryResourceLimit() {
        this.bitField0_ &= -3;
        this.memoryResourceLimit_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNormalAppExit() {
        this.bitField0_ &= -33;
        this.normalAppExit_ = 0L;
    }

    public static afm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static afl newBuilder() {
        return (afl) DEFAULT_INSTANCE.createBuilder();
    }

    public static afm parseDelimitedFrom(InputStream inputStream) {
        return (afm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afm parseFrom(com.google.v.v vVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<afm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbnormalExit(long j2) {
        this.bitField0_ |= 8;
        this.abnormalExit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppWatchdog(long j2) {
        this.bitField0_ |= 1;
        this.appWatchdog_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadAccess(long j2) {
        this.bitField0_ |= 4;
        this.badAccess_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIllegalInstruction(long j2) {
        this.bitField0_ |= 16;
        this.illegalInstruction_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryResourceLimit(long j2) {
        this.bitField0_ |= 2;
        this.memoryResourceLimit_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNormalAppExit(long j2) {
        this.bitField0_ |= 32;
        this.normalAppExit_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "appWatchdog_", "memoryResourceLimit_", "badAccess_", "abnormalExit_", "illegalInstruction_", "normalAppExit_"});
        }
        if (iOrdinal == 3) {
            return new afm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new afl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<afm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (afm.class) {
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

    public long getBadAccess() {
        return this.badAccess_;
    }

    public long getIllegalInstruction() {
        return this.illegalInstruction_;
    }

    public long getMemoryResourceLimit() {
        return this.memoryResourceLimit_;
    }

    public long getNormalAppExit() {
        return this.normalAppExit_;
    }

    public boolean hasAbnormalExit() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAppWatchdog() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBadAccess() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIllegalInstruction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMemoryResourceLimit() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNormalAppExit() {
        return (this.bitField0_ & 32) != 0;
    }

    public static afl newBuilder(afm afmVar) {
        return (afl) DEFAULT_INSTANCE.createBuilder(afmVar);
    }

    public static afm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static afm parseFrom(com.google.v.z zVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static afm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static afm parseFrom(InputStream inputStream) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static afm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static afm parseFrom(ByteBuffer byteBuffer) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static afm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static afm parseFrom(byte[] bArr) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static afm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (afm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
