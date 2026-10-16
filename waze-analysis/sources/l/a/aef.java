package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aef extends com.google.v.du<aef, aee> implements com.google.v.fj {
    public static final int ACTION_FIELD_NUMBER = 3;
    private static final aef DEFAULT_INSTANCE;
    public static final int INSIGHT_COMPONENT_INFO_FIELD_NUMBER = 2;
    public static final int INSIGHT_COMPONENT_STATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<aef> PARSER;
    private int action_;
    private int bitField0_;
    private aej insightComponentInfo_;
    private int insightComponentState_;

    static {
        aef aefVar = new aef();
        DEFAULT_INSTANCE = aefVar;
        com.google.v.du.registerDefaultInstance(aef.class, aefVar);
    }

    private aef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
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

    public static aef getDefaultInstance() {
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

    public static aee newBuilder() {
        return (aee) DEFAULT_INSTANCE.createBuilder();
    }

    public static aef parseDelimitedFrom(InputStream inputStream) {
        return (aef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aef parseFrom(com.google.v.v vVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aef> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(aed aedVar) {
        this.action_ = aedVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i2) {
        this.action_ = i2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003\f", new Object[]{"bitField0_", "insightComponentState_", "insightComponentInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new aef();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aee(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aef> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aef.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public aed getAction() {
        aed aedVar;
        switch (this.action_) {
            case 0:
                aedVar = aed.ACTION_UNSPECIFIED;
                break;
            case 1:
                aedVar = aed.THERE;
                break;
            case 2:
                aedVar = aed.NOT_THERE;
                break;
            case 3:
                aedVar = aed.ACCEPT_REROUTE;
                break;
            case 4:
                aedVar = aed.DECLINE_REROUTE;
                break;
            case 5:
                aedVar = aed.CLOSE;
                break;
            case 6:
                aedVar = aed.GENERAL_COMPONENT_TAP;
                break;
            case 7:
                aedVar = aed.EMPTY_MAP_CLICK;
                break;
            case 8:
                aedVar = aed.BACK_CLICK;
                break;
            default:
                aedVar = null;
                break;
        }
        return aedVar == null ? aed.UNRECOGNIZED : aedVar;
    }

    public int getActionValue() {
        return this.action_;
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

    public static aee newBuilder(aef aefVar) {
        return (aee) DEFAULT_INSTANCE.createBuilder(aefVar);
    }

    public static aef parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aef) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aef parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aef parseFrom(com.google.v.z zVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aef parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aef parseFrom(InputStream inputStream) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aef parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aef parseFrom(ByteBuffer byteBuffer) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aef parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aef parseFrom(byte[] bArr) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aef parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aef) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
