package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ael extends com.google.v.du<ael, aek> implements com.google.v.fj {
    public static final int AVAILABLE_CLICK_OPTIONS_FIELD_NUMBER = 3;
    private static final ael DEFAULT_INSTANCE;
    public static final int INSIGHT_COMPONENT_INFO_FIELD_NUMBER = 2;
    public static final int INSIGHT_COMPONENT_STATE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ael> PARSER = null;
    public static final int SILENT_FIELD_NUMBER = 5;
    public static final int SOUND_ENABLED_FIELD_NUMBER = 4;
    private static final com.google.v.el<adk> availableClickOptions_converter_ = new ve(9);
    private int availableClickOptionsMemoizedSerializedSize;
    private com.google.v.ek availableClickOptions_ = emptyIntList();
    private int bitField0_;
    private aej insightComponentInfo_;
    private int insightComponentState_;
    private boolean silent_;
    private boolean soundEnabled_;

    static {
        ael aelVar = new ael();
        DEFAULT_INSTANCE = aelVar;
        com.google.v.du.registerDefaultInstance(ael.class, aelVar);
    }

    private ael() {
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
    public void clearAvailableClickOptions() {
        this.availableClickOptions_ = emptyIntList();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSilent() {
        this.bitField0_ &= -5;
        this.silent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundEnabled() {
        this.bitField0_ &= -3;
        this.soundEnabled_ = false;
    }

    private void ensureAvailableClickOptionsIsMutable() {
        com.google.v.ek ekVar = this.availableClickOptions_;
        if (ekVar.c()) {
            return;
        }
        this.availableClickOptions_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static ael getDefaultInstance() {
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

    public static aek newBuilder() {
        return (aek) DEFAULT_INSTANCE.createBuilder();
    }

    public static ael parseDelimitedFrom(InputStream inputStream) {
        return (ael) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ael parseFrom(com.google.v.v vVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ael> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setSilent(boolean z) {
        this.bitField0_ |= 4;
        this.silent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundEnabled(boolean z) {
        this.bitField0_ |= 2;
        this.soundEnabled_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002ဉ\u0000\u0003,\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"bitField0_", "insightComponentState_", "insightComponentInfo_", "availableClickOptions_", "soundEnabled_", "silent_"});
        }
        if (iOrdinal == 3) {
            return new ael();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aek(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ael> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ael.class) {
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

    public boolean getSilent() {
        return this.silent_;
    }

    public boolean getSoundEnabled() {
        return this.soundEnabled_;
    }

    public boolean hasInsightComponentInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSilent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSoundEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aek newBuilder(ael aelVar) {
        return (aek) DEFAULT_INSTANCE.createBuilder(aelVar);
    }

    public static ael parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ael) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ael parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ael parseFrom(com.google.v.z zVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ael parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ael parseFrom(InputStream inputStream) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ael parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ael parseFrom(ByteBuffer byteBuffer) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ael parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ael parseFrom(byte[] bArr) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ael parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ael) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
