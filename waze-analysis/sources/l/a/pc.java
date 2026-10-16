package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class pc extends com.google.v.du<pc, pb> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    private static final pc DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_ALERT_METERS_FIELD_NUMBER = 3;
    public static final int GUARDIAN_LENGTH_METERS_FIELD_NUMBER = 4;
    public static final int NEW_ALERTER_COMPONENT_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<pc> PARSER = null;
    public static final int SILENT_FIELD_NUMBER = 6;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 7;
    public static final int SPEED_LIMIT_KPH_FIELD_NUMBER = 8;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 2;
    private ck alerterInfo_;
    private int bitField0_;
    private long distanceToAlertMeters_;
    private long guardianLengthMeters_;
    private boolean newAlerterComponent_;
    private boolean silent_;
    private boolean soundEnabled_;
    private long speedLimitKph_;
    private long timeoutSeconds_;

    static {
        pc pcVar = new pc();
        DEFAULT_INSTANCE = pcVar;
        com.google.v.du.registerDefaultInstance(pc.class, pcVar);
    }

    private pc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToAlertMeters() {
        this.bitField0_ &= -5;
        this.distanceToAlertMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGuardianLengthMeters() {
        this.bitField0_ &= -9;
        this.guardianLengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAlerterComponent() {
        this.bitField0_ &= -17;
        this.newAlerterComponent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.bitField0_ &= -33;
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -65;
        this.soundEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitKph() {
        this.bitField0_ &= -129;
        this.speedLimitKph_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -3;
        this.timeoutSeconds_ = 0L;
    }

    public static pc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.alerterInfo_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            cj cjVarNewBuilder = ck.newBuilder(ckVar2);
            cjVarNewBuilder.mergeFrom((cj) ckVar);
            ckVar = cjVarNewBuilder.buildPartial();
        }
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    public static pb newBuilder() {
        return (pb) DEFAULT_INSTANCE.createBuilder();
    }

    public static pc parseDelimitedFrom(InputStream inputStream) {
        return (pc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pc parseFrom(com.google.v.v vVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToAlertMeters(long j2) {
        this.bitField0_ |= 4;
        this.distanceToAlertMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGuardianLengthMeters(long j2) {
        this.bitField0_ |= 8;
        this.guardianLengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAlerterComponent(boolean z) {
        this.bitField0_ |= 16;
        this.newAlerterComponent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z) {
        this.bitField0_ |= 32;
        this.silent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 64;
        this.soundEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitKph(long j2) {
        this.bitField0_ |= 128;
        this.speedLimitKph_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutSeconds(long j2) {
        this.bitField0_ |= 2;
        this.timeoutSeconds_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဂ\u0007", new Object[]{"bitField0_", "alerterInfo_", "timeoutSeconds_", "distanceToAlertMeters_", "guardianLengthMeters_", "newAlerterComponent_", "silent_", "soundEnabled_", "speedLimitKph_"});
        }
        if (iOrdinal == 3) {
            return new pc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new pb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<pc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (pc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public long getDistanceToAlertMeters() {
        return this.distanceToAlertMeters_;
    }

    public long getGuardianLengthMeters() {
        return this.guardianLengthMeters_;
    }

    public boolean getNewAlerterComponent() {
        return this.newAlerterComponent_;
    }

    public boolean getSilent() {
        return this.silent_;
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public long getSpeedLimitKph() {
        return this.speedLimitKph_;
    }

    public long getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceToAlertMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGuardianLengthMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasNewAlerterComponent() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSilent() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSpeedLimitKph() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static pb newBuilder(pc pcVar) {
        return (pb) DEFAULT_INSTANCE.createBuilder(pcVar);
    }

    public static pc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pc parseFrom(com.google.v.z zVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static pc parseFrom(InputStream inputStream) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pc parseFrom(ByteBuffer byteBuffer) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pc parseFrom(byte[] bArr) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
