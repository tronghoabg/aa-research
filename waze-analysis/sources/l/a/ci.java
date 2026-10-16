package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ci extends com.google.v.du<ci, cg> implements com.google.v.fj {
    public static final int ABOVE_SPEED_LIMIT_FIELD_NUMBER = 3;
    public static final int ACTION_FIELD_NUMBER = 2;
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    public static final int BEFORE_OR_AFTER_REPORT_FIELD_NUMBER = 5;
    private static final ci DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_REPORT_METERS_FIELD_NUMBER = 9;
    public static final int NEW_ALERTER_COMPONENT_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<ci> PARSER = null;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 7;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 4;
    public static final int TIMER_DEFAULT_FIELD_NUMBER = 8;
    private boolean aboveSpeedLimit_;
    private int action_;
    private ck alerterInfo_;
    private int beforeOrAfterReport_;
    private int bitField0_;
    private long distanceToReportMeters_;
    private boolean newAlerterComponent_;
    private boolean soundEnabled_;
    private long timeoutSeconds_;
    private int timerDefault_;

    static {
        ci ciVar = new ci();
        DEFAULT_INSTANCE = ciVar;
        com.google.v.du.registerDefaultInstance(ci.class, ciVar);
    }

    private ci() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAboveSpeedLimit() {
        this.bitField0_ &= -3;
        this.aboveSpeedLimit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeforeOrAfterReport() {
        this.beforeOrAfterReport_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToReportMeters() {
        this.bitField0_ &= -33;
        this.distanceToReportMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAlerterComponent() {
        this.bitField0_ &= -9;
        this.newAlerterComponent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -17;
        this.soundEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -5;
        this.timeoutSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimerDefault() {
        this.timerDefault_ = 0;
    }

    public static ci getDefaultInstance() {
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

    public static cg newBuilder() {
        return (cg) DEFAULT_INSTANCE.createBuilder();
    }

    public static ci parseDelimitedFrom(InputStream inputStream) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(com.google.v.v vVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ci> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboveSpeedLimit(boolean z) {
        this.bitField0_ |= 2;
        this.aboveSpeedLimit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(ce ceVar) {
        this.action_ = ceVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeforeOrAfterReport(cf cfVar) {
        this.beforeOrAfterReport_ = cfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeforeOrAfterReportValue(int i2) {
        this.beforeOrAfterReport_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToReportMeters(long j2) {
        this.bitField0_ |= 32;
        this.distanceToReportMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAlerterComponent(boolean z) {
        this.bitField0_ |= 8;
        this.newAlerterComponent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 16;
        this.soundEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutSeconds(long j2) {
        this.bitField0_ |= 4;
        this.timeoutSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerDefault(ch chVar) {
        this.timerDefault_ = chVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimerDefaultValue(int i2) {
        this.timerDefault_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဇ\u0001\u0004ဂ\u0002\u0005\f\u0006ဇ\u0003\u0007ဇ\u0004\b\f\tဂ\u0005", new Object[]{"bitField0_", "alerterInfo_", "action_", "aboveSpeedLimit_", "timeoutSeconds_", "beforeOrAfterReport_", "newAlerterComponent_", "soundEnabled_", "timerDefault_", "distanceToReportMeters_"});
        }
        if (iOrdinal == 3) {
            return new ci();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ci> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ci.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAboveSpeedLimit() {
        return this.aboveSpeedLimit_;
    }

    public ce getAction() {
        ce ceVar;
        switch (this.action_) {
            case 0:
                ceVar = ce.ACTION_UNSPECIFIED;
                break;
            case 1:
                ceVar = ce.THUMBS_UP;
                break;
            case 2:
                ceVar = ce.THUMBS_DOWN;
                break;
            case 3:
                ceVar = ce.REROUTE;
                break;
            case 4:
                ceVar = ce.CANCEL_REROUTE;
                break;
            case 5:
                ceVar = ce.BACK;
                break;
            case 6:
                ceVar = ce.COLLAPSE;
                break;
            case 7:
                ceVar = ce.DRAG_MAP;
                break;
            case 8:
                ceVar = ce.TAP_BACKGROUND;
                break;
            case 9:
                ceVar = ce.TIMEOUT;
                break;
            case 10:
                ceVar = ce.ALTERNATIVE_ROUTE;
                break;
            case 11:
                ceVar = ce.PERSONALIZED_END;
                break;
            default:
                ceVar = null;
                break;
        }
        return ceVar == null ? ce.UNRECOGNIZED : ceVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public cf getBeforeOrAfterReport() {
        int i2 = this.beforeOrAfterReport_;
        cf cfVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : cf.AFTER : cf.BEFORE : cf.BEFORE_OR_AFTER_REPORT_UNSPECIFIED;
        return cfVar == null ? cf.UNRECOGNIZED : cfVar;
    }

    public int getBeforeOrAfterReportValue() {
        return this.beforeOrAfterReport_;
    }

    public long getDistanceToReportMeters() {
        return this.distanceToReportMeters_;
    }

    public boolean getNewAlerterComponent() {
        return this.newAlerterComponent_;
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public long getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    public ch getTimerDefault() {
        int i2 = this.timerDefault_;
        ch chVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : ch.REJECT : ch.ACCEPT : ch.TIMER_DEFAULT_UNSPECIFIED;
        return chVar == null ? ch.UNRECOGNIZED : chVar;
    }

    public int getTimerDefaultValue() {
        return this.timerDefault_;
    }

    public boolean hasAboveSpeedLimit() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceToReportMeters() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNewAlerterComponent() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public static cg newBuilder(ci ciVar) {
        return (cg) DEFAULT_INSTANCE.createBuilder(ciVar);
    }

    public static ci parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ci parseFrom(com.google.v.z zVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ci parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ci parseFrom(InputStream inputStream) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ci parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ci parseFrom(ByteBuffer byteBuffer) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ci parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ci parseFrom(byte[] bArr) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ci parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ci) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
