package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aok extends com.google.v.du<aok, aoi> implements com.google.v.fj {
    public static final int ACCOUNT_RESTORED_FIELD_NUMBER = 7;
    public static final int CONTEXT_FIELD_NUMBER = 2;
    public static final int CREDENTIALS_FOUND_FIELD_NUMBER = 8;
    private static final aok DEFAULT_INSTANCE;
    public static final int EXPERIMENT_FIELD_NUMBER = 5;
    public static final int EXPERIMENT_GROUP_FIELD_NUMBER = 6;
    public static final int NEW_USER_TYPE_FIELD_NUMBER = 3;
    public static final int ONBOARDING_DURATION_SECONDS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<aok> PARSER = null;
    public static final int RECOVERY_ATTEMPT_FIELD_NUMBER = 9;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    private boolean accountRestored_;
    private int bitField0_;
    private int context_;
    private boolean credentialsFound_;
    private int newUserType_;
    private long onboardingDurationSeconds_;
    private boolean recoveryAttempt_;
    private auc regulationFlags_;
    private String experiment_ = "";
    private String experimentGroup_ = "";

    static {
        aok aokVar = new aok();
        DEFAULT_INSTANCE = aokVar;
        com.google.v.du.registerDefaultInstance(aok.class, aokVar);
    }

    private aok() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountRestored() {
        this.bitField0_ &= -33;
        this.accountRestored_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCredentialsFound() {
        this.bitField0_ &= -65;
        this.credentialsFound_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperiment() {
        this.bitField0_ &= -9;
        this.experiment_ = getDefaultInstance().getExperiment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentGroup() {
        this.bitField0_ &= -17;
        this.experimentGroup_ = getDefaultInstance().getExperimentGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewUserType() {
        this.bitField0_ &= -3;
        this.newUserType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingDurationSeconds() {
        this.bitField0_ &= -5;
        this.onboardingDurationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecoveryAttempt() {
        this.bitField0_ &= -129;
        this.recoveryAttempt_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    public static aok getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        auc aucVar2 = this.regulationFlags_;
        if (aucVar2 != null && aucVar2 != auc.getDefaultInstance()) {
            aub aubVarNewBuilder = auc.newBuilder(aucVar2);
            aubVarNewBuilder.mergeFrom((aub) aucVar);
            aucVar = aubVarNewBuilder.buildPartial();
        }
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    public static aoi newBuilder() {
        return (aoi) DEFAULT_INSTANCE.createBuilder();
    }

    public static aok parseDelimitedFrom(InputStream inputStream) {
        return (aok) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aok parseFrom(com.google.v.v vVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aok> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountRestored(boolean z) {
        this.bitField0_ |= 32;
        this.accountRestored_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(aoh aohVar) {
        this.context_ = aohVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCredentialsFound(boolean z) {
        this.bitField0_ |= 64;
        this.credentialsFound_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperiment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.experiment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.experiment_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentGroup(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.experimentGroup_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentGroupBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.experimentGroup_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewUserType(aoj aojVar) {
        this.newUserType_ = aojVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewUserTypeValue(int i2) {
        this.bitField0_ |= 2;
        this.newUserType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnboardingDurationSeconds(long j2) {
        this.bitField0_ |= 4;
        this.onboardingDurationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecoveryAttempt(boolean z) {
        this.bitField0_ |= 128;
        this.recoveryAttempt_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဌ\u0001\u0004ဂ\u0002\u0005ለ\u0003\u0006ለ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"bitField0_", "regulationFlags_", "context_", "newUserType_", "onboardingDurationSeconds_", "experiment_", "experimentGroup_", "accountRestored_", "credentialsFound_", "recoveryAttempt_"});
        }
        if (iOrdinal == 3) {
            return new aok();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aoi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aok> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aok.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAccountRestored() {
        return this.accountRestored_;
    }

    public aoh getContext() {
        aoh aohVarA = aoh.a(this.context_);
        return aohVarA == null ? aoh.UNRECOGNIZED : aohVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public boolean getCredentialsFound() {
        return this.credentialsFound_;
    }

    public String getExperiment() {
        return this.experiment_;
    }

    public com.google.v.v getExperimentBytes() {
        return com.google.v.v.s(this.experiment_);
    }

    public String getExperimentGroup() {
        return this.experimentGroup_;
    }

    public com.google.v.v getExperimentGroupBytes() {
        return com.google.v.v.s(this.experimentGroup_);
    }

    public aoj getNewUserType() {
        int i2 = this.newUserType_;
        aoj aojVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aoj.EXISTING_USER : aoj.REGISTERED_EMAIL : aoj.REGISTERED_GOOGLE : aoj.GUEST : aoj.NEW_USER_TYPE_UNSPECIFIED;
        return aojVar == null ? aoj.UNRECOGNIZED : aojVar;
    }

    public int getNewUserTypeValue() {
        return this.newUserType_;
    }

    public long getOnboardingDurationSeconds() {
        return this.onboardingDurationSeconds_;
    }

    public boolean getRecoveryAttempt() {
        return this.recoveryAttempt_;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public boolean hasAccountRestored() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCredentialsFound() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasExperiment() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasExperimentGroup() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNewUserType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOnboardingDurationSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRecoveryAttempt() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aoi newBuilder(aok aokVar) {
        return (aoi) DEFAULT_INSTANCE.createBuilder(aokVar);
    }

    public static aok parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aok) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aok parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aok parseFrom(com.google.v.z zVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aok parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aok parseFrom(InputStream inputStream) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aok parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aok parseFrom(ByteBuffer byteBuffer) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aok parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aok parseFrom(byte[] bArr) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aok parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aok) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
