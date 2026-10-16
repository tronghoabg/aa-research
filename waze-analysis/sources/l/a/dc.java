package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class dc extends com.google.v.du<dc, db> implements com.google.v.fj {
    public static final int ABOVE_SPEED_LIMIT_FIELD_NUMBER = 4;
    public static final int ALERTER_INFO_FIELD_NUMBER = 1;
    public static final int ALERTER_NOT_VISIBLE_REASON_FIELD_NUMBER = 8;
    private static final dc DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_REPORT_METERS_FIELD_NUMBER = 3;
    public static final int IS_PERSONALIZED_FIELD_NUMBER = 9;
    public static final int NEW_ALERTER_COMPONENT_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<dc> PARSER = null;
    public static final int SILENT_FIELD_NUMBER = 7;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 6;
    public static final int TIMEOUT_SECONDS_FIELD_NUMBER = 2;
    private boolean aboveSpeedLimit_;
    private ck alerterInfo_;
    private int alerterNotVisibleReason_;
    private int bitField0_;
    private long distanceToReportMeters_;
    private boolean isPersonalized_;
    private boolean newAlerterComponent_;
    private boolean silent_;
    private boolean soundEnabled_;
    private long timeoutSeconds_;

    static {
        dc dcVar = new dc();
        DEFAULT_INSTANCE = dcVar;
        com.google.v.du.registerDefaultInstance(dc.class, dcVar);
    }

    private dc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAboveSpeedLimit() {
        this.bitField0_ &= -9;
        this.aboveSpeedLimit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterNotVisibleReason() {
        this.alerterNotVisibleReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToReportMeters() {
        this.bitField0_ &= -5;
        this.distanceToReportMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPersonalized() {
        this.bitField0_ &= -129;
        this.isPersonalized_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAlerterComponent() {
        this.bitField0_ &= -17;
        this.newAlerterComponent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.bitField0_ &= -65;
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -33;
        this.soundEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutSeconds() {
        this.bitField0_ &= -3;
        this.timeoutSeconds_ = 0L;
    }

    public static dc getDefaultInstance() {
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

    public static db newBuilder() {
        return (db) DEFAULT_INSTANCE.createBuilder();
    }

    public static dc parseDelimitedFrom(InputStream inputStream) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(com.google.v.v vVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboveSpeedLimit(boolean z) {
        this.bitField0_ |= 8;
        this.aboveSpeedLimit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.alerterInfo_ = ckVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterNotVisibleReason(da daVar) {
        this.alerterNotVisibleReason_ = daVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterNotVisibleReasonValue(int i2) {
        this.alerterNotVisibleReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToReportMeters(long j2) {
        this.bitField0_ |= 4;
        this.distanceToReportMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPersonalized(boolean z) {
        this.bitField0_ |= 128;
        this.isPersonalized_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAlerterComponent(boolean z) {
        this.bitField0_ |= 16;
        this.newAlerterComponent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z) {
        this.bitField0_ |= 64;
        this.silent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 32;
        this.soundEnabled_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\b\f\tဇ\u0007", new Object[]{"bitField0_", "alerterInfo_", "timeoutSeconds_", "distanceToReportMeters_", "aboveSpeedLimit_", "newAlerterComponent_", "soundEnabled_", "silent_", "alerterNotVisibleReason_", "isPersonalized_"});
        }
        if (iOrdinal == 3) {
            return new dc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new db(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dc.class) {
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

    public ck getAlerterInfo() {
        ck ckVar = this.alerterInfo_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public da getAlerterNotVisibleReason() {
        int i2 = this.alerterNotVisibleReason_;
        da daVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : da.CAPPED : da.GROUPED : da.SILENT : da.ALERTER_NOT_VISIBLE_REASON_UNSPECIFIED;
        return daVar == null ? da.UNRECOGNIZED : daVar;
    }

    public int getAlerterNotVisibleReasonValue() {
        return this.alerterNotVisibleReason_;
    }

    public long getDistanceToReportMeters() {
        return this.distanceToReportMeters_;
    }

    public boolean getIsPersonalized() {
        return this.isPersonalized_;
    }

    public boolean getNewAlerterComponent() {
        return this.newAlerterComponent_;
    }

    @Deprecated
    public boolean getSilent() {
        return this.silent_;
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public long getTimeoutSeconds() {
        return this.timeoutSeconds_;
    }

    public boolean hasAboveSpeedLimit() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAlerterInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceToReportMeters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsPersonalized() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasNewAlerterComponent() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasSilent() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeoutSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public static db newBuilder(dc dcVar) {
        return (db) DEFAULT_INSTANCE.createBuilder(dcVar);
    }

    public static dc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dc parseFrom(com.google.v.z zVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dc parseFrom(InputStream inputStream) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dc parseFrom(ByteBuffer byteBuffer) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dc parseFrom(byte[] bArr) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
