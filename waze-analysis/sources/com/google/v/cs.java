package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cs extends dq<cs, cr> implements fj {
    private static final cs DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int FAILURE_DETECTION_DELAY_FIELD_NUMBER = 16;
    public static final int FEATURES_FIELD_NUMBER = 34;
    public static final int MULTICAST_STUB_FIELD_NUMBER = 20;
    private static volatile fo<cs> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private bj features_;
    private boolean multicastStub_;
    private byte memoizedIsInitialized = 2;
    private double failureDetectionDelay_ = -1.0d;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        cs csVar = new cs();
        DEFAULT_INSTANCE = csVar;
        du.registerDefaultInstance(cs.class, csVar);
    }

    private cs() {
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
    public void clearDeprecated() {
        this.bitField0_ &= -9;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailureDetectionDelay() {
        this.bitField0_ &= -3;
        this.failureDetectionDelay_ = -1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMulticastStub() {
        this.bitField0_ &= -2;
        this.multicastStub_ = false;
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

    public static cs getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 4;
    }

    public static cr newBuilder() {
        return (cr) DEFAULT_INSTANCE.createBuilder();
    }

    public static cs parseDelimitedFrom(InputStream inputStream) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(v vVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 8;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailureDetectionDelay(double d2) {
        this.bitField0_ |= 2;
        this.failureDetectionDelay_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMulticastStub(boolean z) {
        this.bitField0_ |= 1;
        this.multicastStub_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0010ϧ\u0005\u0000\u0001\u0002\u0010က\u0001\u0014ဇ\u0000!ဇ\u0003\"ᐉ\u0002ϧЛ", new Object[]{"bitField0_", "failureDetectionDelay_", "multicastStub_", "deprecated_", "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new cs();
            case 4:
                return new cr(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cs> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cs.class) {
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

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public double getFailureDetectionDelay() {
        return this.failureDetectionDelay_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public boolean getMulticastStub() {
        return this.multicastStub_;
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

    public boolean hasDeprecated() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFailureDetectionDelay() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMulticastStub() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cr newBuilder(cs csVar) {
        return (cr) DEFAULT_INSTANCE.createBuilder(csVar);
    }

    public static cs parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(v vVar, de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cs parseFrom(z zVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cs parseFrom(z zVar, de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static cs parseFrom(InputStream inputStream) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cs parseFrom(InputStream inputStream, de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cs parseFrom(ByteBuffer byteBuffer) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cs parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cs parseFrom(byte[] bArr) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cs parseFrom(byte[] bArr, de deVar) {
        return (cs) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
