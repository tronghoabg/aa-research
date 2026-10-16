package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ady extends com.google.v.du<ady, adw> implements com.google.v.fj {
    public static final int CHANGE_REASON_FIELD_NUMBER = 4;
    private static final ady DEFAULT_INSTANCE;
    public static final int FROM_INSIGHT_STATE_FIELD_NUMBER = 1;
    public static final int INSIGHT_COMPONENT_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ady> PARSER = null;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 5;
    public static final int TO_INSIGHT_STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int changeReason_;
    private int fromInsightState_;
    private aej insightComponentInfo_;
    private boolean soundEnabled_;
    private int toInsightState_;

    static {
        ady adyVar = new ady();
        DEFAULT_INSTANCE = adyVar;
        com.google.v.du.registerDefaultInstance(ady.class, adyVar);
    }

    private ady() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeReason() {
        this.changeReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromInsightState() {
        this.fromInsightState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInsightComponentInfo() {
        this.insightComponentInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -3;
        this.soundEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToInsightState() {
        this.toInsightState_ = 0;
    }

    public static ady getDefaultInstance() {
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

    public static adw newBuilder() {
        return (adw) DEFAULT_INSTANCE.createBuilder();
    }

    public static ady parseDelimitedFrom(InputStream inputStream) {
        return (ady) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ady parseFrom(com.google.v.v vVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ady> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReason(adx adxVar) {
        this.changeReason_ = adxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReasonValue(int i2) {
        this.changeReason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromInsightState(aem aemVar) {
        this.fromInsightState_ = aemVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromInsightStateValue(int i2) {
        this.fromInsightState_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsightComponentInfo(aej aejVar) {
        Objects.requireNonNull(aejVar);
        this.insightComponentInfo_ = aejVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 2;
        this.soundEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToInsightState(aem aemVar) {
        this.toInsightState_ = aemVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToInsightStateValue(int i2) {
        this.toInsightState_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\f\u0003ဉ\u0000\u0004\f\u0005ဇ\u0001", new Object[]{"bitField0_", "fromInsightState_", "toInsightState_", "insightComponentInfo_", "changeReason_", "soundEnabled_"});
        }
        if (iOrdinal == 3) {
            return new ady();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new adw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ady> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ady.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adx getChangeReason() {
        adx adxVar;
        switch (this.changeReason_) {
            case 0:
                adxVar = adx.CHANGE_REASON_UNSPECIFIED;
                break;
            case 1:
                adxVar = adx.REAL_TIME_INSIGHT_VALIDATION;
                break;
            case 2:
                adxVar = adx.ARRIVED_TO_INSIGHT_POINT;
                break;
            case 3:
                adxVar = adx.ENTER_SEGMENT;
                break;
            case 4:
                adxVar = adx.EXIT_SEGMENT;
                break;
            case 5:
                adxVar = adx.INSIGHT_COMPONENT_TERMINATED;
                break;
            case 6:
                adxVar = adx.INSIGHT_COMPONENT_CLICKED_BY_THE_USER;
                break;
            case 7:
                adxVar = adx.ONE_TO_MULTIPLE_INSIGHT_COMPONENTS;
                break;
            case 8:
                adxVar = adx.MULTIPLE_TO_ONE_INSIGHT_COMPONENT;
                break;
            case 9:
                adxVar = adx.USER_DRAGGED_MAP;
                break;
            case 10:
                adxVar = adx.USER_CLICKED_EMPTY_MAP;
                break;
            case 11:
                adxVar = adx.HIDDEN_BY_OTHER_UI_COMPONENT;
                break;
            default:
                adxVar = null;
                break;
        }
        return adxVar == null ? adx.UNRECOGNIZED : adxVar;
    }

    public int getChangeReasonValue() {
        return this.changeReason_;
    }

    public aem getFromInsightState() {
        aem aemVarA = aem.a(this.fromInsightState_);
        return aemVarA == null ? aem.UNRECOGNIZED : aemVarA;
    }

    public int getFromInsightStateValue() {
        return this.fromInsightState_;
    }

    public aej getInsightComponentInfo() {
        aej aejVar = this.insightComponentInfo_;
        return aejVar == null ? aej.getDefaultInstance() : aejVar;
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public aem getToInsightState() {
        aem aemVarA = aem.a(this.toInsightState_);
        return aemVarA == null ? aem.UNRECOGNIZED : aemVarA;
    }

    public int getToInsightStateValue() {
        return this.toInsightState_;
    }

    public boolean hasInsightComponentInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    public static adw newBuilder(ady adyVar) {
        return (adw) DEFAULT_INSTANCE.createBuilder(adyVar);
    }

    public static ady parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ady) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ady parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ady parseFrom(com.google.v.z zVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ady parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ady parseFrom(InputStream inputStream) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ady parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ady parseFrom(ByteBuffer byteBuffer) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ady parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ady parseFrom(byte[] bArr) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ady parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ady) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
