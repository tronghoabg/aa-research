package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class adv extends com.google.v.du<adv, adt> implements com.google.v.fj {
    public static final int AVAILABLE_CLICK_OPTIONS_FIELD_NUMBER = 5;
    public static final int CHANGE_REASON_FIELD_NUMBER = 4;
    private static final adv DEFAULT_INSTANCE;
    public static final int FROM_INSIGHT_STATE_FIELD_NUMBER = 1;
    public static final int INSIGHT_COMPONENT_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<adv> PARSER = null;
    public static final int TO_INSIGHT_STATE_FIELD_NUMBER = 2;
    private int availableClickOptionsMemoizedSerializedSize;
    private int bitField0_;
    private int changeReasonMemoizedSerializedSize;
    private int fromInsightState_;
    private aej insightComponentInfo_;
    private int toInsightState_;
    private static final com.google.v.el<adu> changeReason_converter_ = new ve(7);
    private static final com.google.v.el<adk> availableClickOptions_converter_ = new ve(8);
    private com.google.v.ek changeReason_ = emptyIntList();
    private com.google.v.ek availableClickOptions_ = emptyIntList();

    static {
        adv advVar = new adv();
        DEFAULT_INSTANCE = advVar;
        com.google.v.du.registerDefaultInstance(adv.class, advVar);
    }

    private adv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableClickOptions(Iterable<? extends adk> iterable) {
        ensureAvailableClickOptionsIsMutable();
        Iterator<? extends adk> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableClickOptions_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAvailableClickOptionsValue(Iterable<Integer> iterable) {
        ensureAvailableClickOptionsIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.availableClickOptions_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChangeReason(Iterable<? extends adu> iterable) {
        ensureChangeReasonIsMutable();
        Iterator<? extends adu> it = iterable.iterator();
        while (it.hasNext()) {
            this.changeReason_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChangeReasonValue(Iterable<Integer> iterable) {
        ensureChangeReasonIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.changeReason_.i(it.next().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableClickOptions(adk adkVar) {
        Objects.requireNonNull(adkVar);
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.i(adkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAvailableClickOptionsValue(int i2) {
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangeReason(adu aduVar) {
        Objects.requireNonNull(aduVar);
        ensureChangeReasonIsMutable();
        this.changeReason_.i(aduVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChangeReasonValue(int i2) {
        ensureChangeReasonIsMutable();
        this.changeReason_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvailableClickOptions() {
        this.availableClickOptions_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeReason() {
        this.changeReason_ = emptyIntList();
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
    public void clearToInsightState() {
        this.toInsightState_ = 0;
    }

    private void ensureAvailableClickOptionsIsMutable() {
        com.google.v.ek ekVar = this.availableClickOptions_;
        if (ekVar.c()) {
            return;
        }
        this.availableClickOptions_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureChangeReasonIsMutable() {
        com.google.v.ek ekVar = this.changeReason_;
        if (ekVar.c()) {
            return;
        }
        this.changeReason_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static adv getDefaultInstance() {
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

    public static adt newBuilder() {
        return (adt) DEFAULT_INSTANCE.createBuilder();
    }

    public static adv parseDelimitedFrom(InputStream inputStream) {
        return (adv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adv parseFrom(com.google.v.v vVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<adv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableClickOptions(int i2, adk adkVar) {
        Objects.requireNonNull(adkVar);
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.e(i2, adkVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableClickOptionsValue(int i2, int i3) {
        ensureAvailableClickOptionsIsMutable();
        this.availableClickOptions_.e(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReason(int i2, adu aduVar) {
        Objects.requireNonNull(aduVar);
        ensureChangeReasonIsMutable();
        this.changeReason_.e(i2, aduVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeReasonValue(int i2, int i3) {
        ensureChangeReasonIsMutable();
        this.changeReason_.e(i2, i3);
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\f\u0002\f\u0003ဉ\u0000\u0004,\u0005,", new Object[]{"bitField0_", "fromInsightState_", "toInsightState_", "insightComponentInfo_", "changeReason_", "availableClickOptions_"});
        }
        if (iOrdinal == 3) {
            return new adv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new adt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<adv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (adv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public adk getAvailableClickOptions(int i2) {
        adk adkVarA = adk.a(this.availableClickOptions_.d(i2));
        return adkVarA == null ? adk.UNRECOGNIZED : adkVarA;
    }

    public int getAvailableClickOptionsCount() {
        return this.availableClickOptions_.size();
    }

    public List<adk> getAvailableClickOptionsList() {
        return new com.google.v.em(this.availableClickOptions_, availableClickOptions_converter_);
    }

    public int getAvailableClickOptionsValue(int i2) {
        return this.availableClickOptions_.d(i2);
    }

    public List<Integer> getAvailableClickOptionsValueList() {
        return this.availableClickOptions_;
    }

    public adu getChangeReason(int i2) {
        adu aduVarA = adu.a(this.changeReason_.d(i2));
        return aduVarA == null ? adu.UNRECOGNIZED : aduVarA;
    }

    public int getChangeReasonCount() {
        return this.changeReason_.size();
    }

    public List<adu> getChangeReasonList() {
        return new com.google.v.em(this.changeReason_, changeReason_converter_);
    }

    public int getChangeReasonValue(int i2) {
        return this.changeReason_.d(i2);
    }

    public List<Integer> getChangeReasonValueList() {
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

    public static adt newBuilder(adv advVar) {
        return (adt) DEFAULT_INSTANCE.createBuilder(advVar);
    }

    public static adv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static adv parseFrom(com.google.v.z zVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static adv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static adv parseFrom(InputStream inputStream) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static adv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static adv parseFrom(ByteBuffer byteBuffer) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static adv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static adv parseFrom(byte[] bArr) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static adv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (adv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
