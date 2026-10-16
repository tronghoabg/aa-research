package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class boo extends com.google.v.du<boo, bon> implements com.google.v.fj {
    public static final int AGE_SCREEN_FLOW_FIELD_NUMBER = 2;
    public static final int AGE_VALUE_YEARS_FIELD_NUMBER = 1;
    public static final int BIRTHDATE_TIMESTAMP_SECONDS_FIELD_NUMBER = 5;
    public static final int CONTEXT_FIELD_NUMBER = 4;
    private static final boo DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<boo> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 3;
    private int ageScreenFlow_;
    private long ageValueYears_;
    private long birthdateTimestampSeconds_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;

    static {
        boo booVar = new boo();
        DEFAULT_INSTANCE = booVar;
        com.google.v.du.registerDefaultInstance(boo.class, booVar);
    }

    private boo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenFlow() {
        this.ageScreenFlow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeValueYears() {
        this.bitField0_ &= -2;
        this.ageValueYears_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthdateTimestampSeconds() {
        this.bitField0_ &= -5;
        this.birthdateTimestampSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -3;
    }

    public static boo getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static bon newBuilder() {
        return (bon) DEFAULT_INSTANCE.createBuilder();
    }

    public static boo parseDelimitedFrom(InputStream inputStream) {
        return (boo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boo parseFrom(com.google.v.v vVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<boo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenFlow(bv bvVar) {
        this.ageScreenFlow_ = bvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenFlowValue(int i2) {
        this.ageScreenFlow_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeValueYears(long j2) {
        this.bitField0_ |= 1;
        this.ageValueYears_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthdateTimestampSeconds(long j2) {
        this.bitField0_ |= 4;
        this.birthdateTimestampSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(bu buVar) {
        this.context_ = buVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulationFlags(auc aucVar) {
        Objects.requireNonNull(aucVar);
        this.regulationFlags_ = aucVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002\f\u0003ဉ\u0001\u0004\f\u0005တ\u0002", new Object[]{"bitField0_", "ageValueYears_", "ageScreenFlow_", "regulationFlags_", "context_", "birthdateTimestampSeconds_"});
        }
        if (iOrdinal == 3) {
            return new boo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bon(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<boo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (boo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bv getAgeScreenFlow() {
        bv bvVarA = bv.a(this.ageScreenFlow_);
        return bvVarA == null ? bv.UNRECOGNIZED : bvVarA;
    }

    public int getAgeScreenFlowValue() {
        return this.ageScreenFlow_;
    }

    public long getAgeValueYears() {
        return this.ageValueYears_;
    }

    public long getBirthdateTimestampSeconds() {
        return this.birthdateTimestampSeconds_;
    }

    public bu getContext() {
        bu buVarA = bu.a(this.context_);
        return buVarA == null ? bu.UNRECOGNIZED : buVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public auc getRegulationFlags() {
        auc aucVar = this.regulationFlags_;
        return aucVar == null ? auc.getDefaultInstance() : aucVar;
    }

    public boolean hasAgeValueYears() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBirthdateTimestampSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bon newBuilder(boo booVar) {
        return (bon) DEFAULT_INSTANCE.createBuilder(booVar);
    }

    public static boo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static boo parseFrom(com.google.v.z zVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static boo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static boo parseFrom(InputStream inputStream) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static boo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static boo parseFrom(ByteBuffer byteBuffer) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static boo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static boo parseFrom(byte[] bArr) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static boo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (boo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
