package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends dq<aq, ap> implements fj {
    public static final int DEBUG_REDACT_FIELD_NUMBER = 3;
    private static final aq DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 4;
    private static volatile fo<aq> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean debugRedact_;
    private boolean deprecated_;
    private bt featureSupport_;
    private bj features_;
    private byte memoizedIsInitialized = 2;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        aq aqVar = new aq();
        DEFAULT_INSTANCE = aqVar;
        du.registerDefaultInstance(aq.class, aqVar);
    }

    private aq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugRedact() {
        this.bitField0_ &= -5;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    public static aq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureSupport(bt btVar) {
        Objects.requireNonNull(btVar);
        bt btVar2 = this.featureSupport_;
        if (btVar2 != null && btVar2 != bt.getDefaultInstance()) {
            bs bsVarNewBuilder = bt.newBuilder(btVar2);
            bsVarNewBuilder.mergeFrom((bs) btVar);
            btVar = bsVarNewBuilder.buildPartial();
        }
        this.featureSupport_ = btVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        bj bjVar2 = this.features_;
        if (bjVar2 != null && bjVar2 != bj.getDefaultInstance()) {
            az azVarNewBuilder = bj.newBuilder(bjVar2);
            azVarNewBuilder.mergeFrom((az) bjVar);
            bjVar = azVarNewBuilder.buildPartial();
        }
        this.features_ = bjVar;
        this.bitField0_ |= 2;
    }

    public static ap newBuilder() {
        return (ap) DEFAULT_INSTANCE.createBuilder();
    }

    public static aq parseDelimitedFrom(InputStream inputStream) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(v vVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<aq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z) {
        this.bitField0_ |= 4;
        this.debugRedact_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 1;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(bt btVar) {
        Objects.requireNonNull(btVar);
        this.featureSupport_ = btVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"bitField0_", "deprecated_", "features_", "debugRedact_", "featureSupport_", "uninterpretedOption_", cx.class});
            case 3:
                return new aq();
            case 4:
                return new ap(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<aq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (aq.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public bt getFeatureSupport() {
        bt btVar = this.featureSupport_;
        return btVar == null ? bt.getDefaultInstance() : btVar;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public cx getUninterpretedOption(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<cx> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public cy getUninterpretedOptionOrBuilder(int i2) {
        return this.uninterpretedOption_.get(i2);
    }

    public List<? extends cy> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean hasDebugRedact() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ap newBuilder(aq aqVar) {
        return (ap) DEFAULT_INSTANCE.createBuilder(aqVar);
    }

    public static aq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (aq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(v vVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aq parseFrom(z zVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aq parseFrom(z zVar, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static aq parseFrom(InputStream inputStream) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aq parseFrom(InputStream inputStream, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aq parseFrom(ByteBuffer byteBuffer) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aq parseFrom(byte[] bArr) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aq parseFrom(byte[] bArr, de deVar) {
        return (aq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
