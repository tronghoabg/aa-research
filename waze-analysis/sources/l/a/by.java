package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class by extends com.google.v.du<by, bx> implements com.google.v.fj {
    public static final int AGE_SCREEN_FLOW_FIELD_NUMBER = 1;
    public static final int BIRTHDATE_TIMESTAMP_SECONDS_FIELD_NUMBER = 5;
    public static final int CLICKABLE_CTA_FIELD_NUMBER = 6;
    public static final int CONTEXT_FIELD_NUMBER = 3;
    private static final by DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<by> PARSER = null;
    public static final int REGULATION_FLAGS_FIELD_NUMBER = 2;
    public static final int SCREEN_TYPE_FIELD_NUMBER = 4;
    private int ageScreenFlow_;
    private long birthdateTimestampSeconds_;
    private int bitField0_;
    private boolean clickableCta_;
    private int context_;
    private auc regulationFlags_;
    private int screenType_;

    static {
        by byVar = new by();
        DEFAULT_INSTANCE = byVar;
        com.google.v.du.registerDefaultInstance(by.class, byVar);
    }

    private by() {
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
    public void clearClickableCta() {
        this.bitField0_ &= -5;
        this.clickableCta_ = false;
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

    public static by getDefaultInstance() {
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

    public static bx newBuilder() {
        return (bx) DEFAULT_INSTANCE.createBuilder();
    }

    public static by parseDelimitedFrom(InputStream inputStream) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(com.google.v.v vVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<by> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAgeScreenFlow(bw bwVar) {
        this.ageScreenFlow_ = bwVar.getNumber();
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
    public void setClickableCta(boolean z) {
        this.bitField0_ |= 4;
        this.clickableCta_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\f\u0004\f\u0005တ\u0001\u0006ဇ\u0002", new Object[]{"bitField0_", "ageScreenFlow_", "regulationFlags_", "context_", "screenType_", "birthdateTimestampSeconds_", "clickableCta_"});
        }
        if (iOrdinal == 3) {
            return new by();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<by> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (by.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getAgeScreenFlow() {
        int i2 = this.ageScreenFlow_;
        bw bwVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : bw.U18 : bw.AADC : bw.AGE_SCREEN_REGULATION_UNSPECIFIED;
        return bwVar == null ? bw.UNRECOGNIZED : bwVar;
    }

    public int getAgeScreenFlowValue() {
        return this.ageScreenFlow_;
    }

    public long getBirthdateTimestampSeconds() {
        return this.birthdateTimestampSeconds_;
    }

    public boolean getClickableCta() {
        return this.clickableCta_;
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

    public boolean hasClickableCta() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRegulationFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bx newBuilder(by byVar) {
        return (bx) DEFAULT_INSTANCE.createBuilder(byVar);
    }

    public static by parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (by) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static by parseFrom(com.google.v.z zVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static by parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static by parseFrom(InputStream inputStream) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static by parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static by parseFrom(ByteBuffer byteBuffer) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static by parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static by parseFrom(byte[] bArr) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static by parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (by) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
