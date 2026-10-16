package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aec extends com.google.v.du<aec, aea> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int CLICK_LOCATION_FIELD_NUMBER = 4;
    private static final aec DEFAULT_INSTANCE;
    public static final int INSIGHT_COMPONENT_INFO_FIELD_NUMBER = 2;
    public static final int INSIGHT_COMPONENT_STATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aec> PARSER;
    private int action_;
    private int bitField0_;
    private int clickLocation_;
    private aej insightComponentInfo_;
    private int insightComponentState_;

    static {
        aec aecVar = new aec();
        DEFAULT_INSTANCE = aecVar;
        com.google.v.du.registerDefaultInstance(aec.class, aecVar);
    }

    private aec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickLocation() {
        this.clickLocation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentInfo() {
        this.insightComponentInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentState() {
        this.insightComponentState_ = 0;
    }

    public static aec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInsightComponentInfo(aej aejVar) {
        Objects.requireNonNull(aejVar);
        aej aejVar2 = this.insightComponentInfo_;
        if (aejVar2 != null && aejVar2 != aej.getDefaultInstance()) {
            aeg aegVarNewBuilder = aej.newBuilder(aejVar2);
            aegVarNewBuilder.mergeFrom((aeg) aejVar);
            aejVar = aegVarNewBuilder.buildPartial();
        }
        this.insightComponentInfo_ = aejVar;
        this.bitField0_ |= 1;
    }

    public static aea newBuilder() {
        return (aea) DEFAULT_INSTANCE.createBuilder();
    }

    public static aec parseDelimitedFrom(InputStream inputStream) {
        return (aec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aec parseFrom(com.google.v.v vVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(adz adzVar) {
        this.action_ = adzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickLocation(aeb aebVar) {
        this.clickLocation_ = aebVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickLocationValue(int i2) {
        this.clickLocation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentInfo(aej aejVar) {
        Objects.requireNonNull(aejVar);
        this.insightComponentInfo_ = aejVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentState(aem aemVar) {
        this.insightComponentState_ = aemVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentStateValue(int i2) {
        this.insightComponentState_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\f\u0004\f", new Object[]{"bitField0_", "insightComponentState_", "insightComponentInfo_", "action_", "clickLocation_"});
        }
        if (iOrdinal == 3) {
            return new aec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aea(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aec> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aec.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adz getAction() {
        adz adzVar;
        switch (this.action_) {
            case 0:
                adzVar = adz.ACTION_UNSPECIFIED;
                break;
            case 1:
                adzVar = adz.THERE;
                break;
            case 2:
                adzVar = adz.NOT_THERE;
                break;
            case 3:
                adzVar = adz.ACCEPT_REROUTE;
                break;
            case 4:
                adzVar = adz.DECLINE_REROUTE;
                break;
            case 5:
                adzVar = adz.COLLAPSE;
                break;
            case 6:
                adzVar = adz.GENERAL_TAP;
                break;
            default:
                adzVar = null;
                break;
        }
        return adzVar == null ? adz.UNRECOGNIZED : adzVar;
    }

    public int getActionValue() {
        return this.action_;
    }

    public aeb getClickLocation() {
        int i2 = this.clickLocation_;
        aeb aebVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : aeb.AFTER_INSIGHT_LOCATION : aeb.BEFORE_INSIGHT_LOCATION : aeb.CLICK_LOCATION_UNSPECIFIED;
        return aebVar == null ? aeb.UNRECOGNIZED : aebVar;
    }

    public int getClickLocationValue() {
        return this.clickLocation_;
    }

    public aej getInsightComponentInfo() {
        aej aejVar = this.insightComponentInfo_;
        return aejVar == null ? aej.getDefaultInstance() : aejVar;
    }

    public aem getInsightComponentState() {
        aem aemVarA = aem.a(this.insightComponentState_);
        return aemVarA == null ? aem.UNRECOGNIZED : aemVarA;
    }

    public int getInsightComponentStateValue() {
        return this.insightComponentState_;
    }

    public boolean hasInsightComponentInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aea newBuilder(aec aecVar) {
        return (aea) DEFAULT_INSTANCE.createBuilder(aecVar);
    }

    public static aec parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aec parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aec parseFrom(com.google.v.z zVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aec parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aec parseFrom(InputStream inputStream) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aec parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aec parseFrom(ByteBuffer byteBuffer) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aec parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aec parseFrom(byte[] bArr) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aec parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
