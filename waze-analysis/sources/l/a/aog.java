package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aog extends com.google.v.du<aog, aoe> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 2;
    private static final aog DEFAULT_INSTANCE;
    public static final int ONBOARDING_DURATION_SECONDS_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<aog> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int context_;
    private long onboardingDurationSeconds_;
    private auc regulationFlags_;
    private int type_;

    static {
        aog aogVar = new aog();
        DEFAULT_INSTANCE = aogVar;
        com.google.v.du.registerDefaultInstance(aog.class, aogVar);
    }

    private aog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnboardingDurationSeconds() {
        this.bitField0_ &= -3;
        this.onboardingDurationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static aog getDefaultInstance() {
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

    public static aoe newBuilder() {
        return (aoe) DEFAULT_INSTANCE.createBuilder();
    }

    public static aog parseDelimitedFrom(InputStream inputStream) {
        return (aog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aog parseFrom(com.google.v.v vVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aog> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOnboardingDurationSeconds(long j2) {
        this.bitField0_ |= 2;
        this.onboardingDurationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aof aofVar) {
        this.type_ = aofVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\f\u0004ဂ\u0001", new Object[]{"bitField0_", "regulationFlags_", "context_", "type_", "onboardingDurationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new aog();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aoe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aog> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aog.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aoh getContext() {
        aoh aohVarA = aoh.a(this.context_);
        return aohVarA == null ? aoh.UNRECOGNIZED : aohVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public long getOnboardingDurationSeconds() {
        return this.onboardingDurationSeconds_;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public aof getType() {
        int i2 = this.type_;
        aof aofVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : aof.EXISTING_USER : aof.NEW_ACCOUNT : aof.GUEST : aof.ONBOARDING_COMPLETED_CONTEXT_UNSPECIFIED;
        return aofVar == null ? aof.UNRECOGNIZED : aofVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasOnboardingDurationSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aoe newBuilder(aog aogVar) {
        return (aoe) DEFAULT_INSTANCE.createBuilder(aogVar);
    }

    public static aog parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aog) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aog parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aog parseFrom(com.google.v.z zVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aog parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aog parseFrom(InputStream inputStream) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aog parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aog parseFrom(ByteBuffer byteBuffer) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aog parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aog parseFrom(byte[] bArr) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aog parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aog) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
