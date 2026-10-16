package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bt extends com.google.v.du<bt, bs> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 4;
    public static final int AGE_SCREEN_FLOW_FIELD_NUMBER = 1;
    public static final int BIRTHDATE_TIMESTAMP_SECONDS_FIELD_NUMBER = 6;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final bt DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bt> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 2;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 5;
    private int action_;
    private int ageScreenFlow_;
    private long birthdateTimestampSeconds_;
    private int bitField0_;
    private int context_;
    private auc regulationFlags_;
    private int screenType_;

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        com.google.v.du.registerDefaultInstance(bt.class, btVar);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAgeScreenFlow() {
        this.ageScreenFlow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBirthdateTimestampSeconds() {
        this.bitField0_ &= -3;
        this.birthdateTimestampSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulationFlags() {
        this.regulationFlags_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenType() {
        this.screenType_ = 0;
    }

    public static bt getDefaultInstance() {
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

    public static bs newBuilder() {
        return (bs) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(bq bqVar) {
        this.action_ = bqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenFlow(br brVar) {
        this.ageScreenFlow_ = brVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenFlowValue(int i2) {
        this.ageScreenFlow_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBirthdateTimestampSeconds(long j2) {
        this.bitField0_ |= 2;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenType(bz bzVar) {
        this.screenType_ = bzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenTypeValue(int i2) {
        this.screenType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\f\u0004\f\u0005\f\u0006တ\u0001", new Object[]{"bitField0_", "ageScreenFlow_", "regulationFlags_", "context_", "action_", "screenType_", "birthdateTimestampSeconds_"});
        }
        if (iOrdinal == 3) {
            return new bt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bs(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bt> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bt.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bq getAction() {
        int i2 = this.action_;
        bq bqVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : bq.LEARN_MORE_LINK : bq.OK : bq.DATE_PICKER : bq.CLOSE : bq.BACK : bq.ACTION_UNSPECIFIED;
        return bqVar == null ? bq.UNRECOGNIZED : bqVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public br getAgeScreenFlow() {
        int i2 = this.ageScreenFlow_;
        br brVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : br.U18 : br.AADC : br.AGE_SCREEN_REGULATION_UNSPECIFIED;
        return brVar == null ? br.UNRECOGNIZED : brVar;
    }

    public int getAgeScreenFlowValue() {
        return this.ageScreenFlow_;
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

    public bz getScreenType() {
        bz bzVarA = bz.a(this.screenType_);
        return bzVarA == null ? bz.UNRECOGNIZED : bzVarA;
    }

    public int getScreenTypeValue() {
        return this.screenType_;
    }

    public boolean hasBirthdateTimestampSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bs newBuilder(bt btVar) {
        return (bs) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
