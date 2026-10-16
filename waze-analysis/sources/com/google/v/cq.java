package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cq extends dq<cq, cp> implements fj {
    private static final cq DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile fo<cq> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private bj features_;
    private byte memoizedIsInitialized = 2;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        du.registerDefaultInstance(cq.class, cqVar);
    }

    private cq() {
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
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -2;
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

    public static cq getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static cp newBuilder() {
        return (cp) DEFAULT_INSTANCE.createBuilder();
    }

    public static cq parseDelimitedFrom(InputStream inputStream) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(v vVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0001\u0002\u0001ᐉ\u0000ϧЛ", new Object[]{"bitField0_", "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new cq();
            case 4:
                return new cp(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cq.class) {
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

    public boolean hasFeatures() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cp newBuilder(cq cqVar) {
        return (cp) DEFAULT_INSTANCE.createBuilder(cqVar);
    }

    public static cq parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(v vVar, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cq parseFrom(z zVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cq parseFrom(z zVar, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static cq parseFrom(InputStream inputStream) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cq parseFrom(InputStream inputStream, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cq parseFrom(ByteBuffer byteBuffer) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cq parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cq parseFrom(byte[] bArr) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cq parseFrom(byte[] bArr, de deVar) {
        return (cq) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
