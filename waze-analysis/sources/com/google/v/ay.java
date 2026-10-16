package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends dq<ay, ar> implements fj {
    public static final int DECLARATION_FIELD_NUMBER = 2;
    private static final ay DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int METADATA_FIELD_NUMBER = 1;
    private static volatile fo<ay> PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int VERIFICATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private bj features_;
    private aw metadata_;
    private byte memoizedIsInitialized = 2;
    private eo<cx> uninterpretedOption_ = emptyProtobufList();
    private eo<at> declaration_ = emptyProtobufList();
    private int verification_ = 1;

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeclaration(Iterable<? extends at> iterable) {
        ensureDeclarationIsMutable();
        c.addAll(iterable, this.declaration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(int i2, at atVar) {
        Objects.requireNonNull(atVar);
        ensureDeclarationIsMutable();
        this.declaration_.add(i2, atVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeclaration() {
        this.declaration_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerification() {
        this.bitField0_ &= -5;
        this.verification_ = 1;
    }

    private void ensureDeclarationIsMutable() {
        eo<at> eoVar = this.declaration_;
        if (eoVar.c()) {
            return;
        }
        this.declaration_ = du.mutableCopy(eoVar);
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    public static ay getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(aw awVar) {
        Objects.requireNonNull(awVar);
        aw awVar2 = this.metadata_;
        if (awVar2 != null && awVar2 != aw.getDefaultInstance()) {
            av avVarNewBuilder = aw.newBuilder(awVar2);
            avVarNewBuilder.mergeFrom((av) awVar);
            awVar = avVarNewBuilder.buildPartial();
        }
        this.metadata_ = awVar;
        this.bitField0_ |= 1;
    }

    public static ar newBuilder() {
        return (ar) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(v vVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeclaration(int i2) {
        ensureDeclarationIsMutable();
        this.declaration_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeclaration(int i2, at atVar) {
        Objects.requireNonNull(atVar);
        ensureDeclarationIsMutable();
        this.declaration_.set(i2, atVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(aw awVar) {
        Objects.requireNonNull(awVar);
        this.metadata_ = awVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerification(ax axVar) {
        this.verification_ = axVar.getNumber();
        this.bitField0_ |= 4;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0002\u0002\u0001ဉ\u0000\u0002\u001b\u0003᠌\u00022ᐉ\u0001ϧЛ", new Object[]{"bitField0_", "metadata_", "declaration_", at.class, "verification_", ai.f12654d, "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new ay();
            case 4:
                return new ar(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ay> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ay.class) {
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

    public at getDeclaration(int i2) {
        return this.declaration_.get(i2);
    }

    public int getDeclarationCount() {
        return this.declaration_.size();
    }

    public List<at> getDeclarationList() {
        return this.declaration_;
    }

    public au getDeclarationOrBuilder(int i2) {
        return this.declaration_.get(i2);
    }

    public List<? extends au> getDeclarationOrBuilderList() {
        return this.declaration_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public aw getMetadata() {
        aw awVar = this.metadata_;
        return awVar == null ? aw.getDefaultInstance() : awVar;
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

    public ax getVerification() {
        ax axVarA = ax.a(this.verification_);
        return axVarA == null ? ax.UNVERIFIED : axVarA;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVerification() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ar newBuilder(ay ayVar) {
        return (ar) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(v vVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(z zVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(z zVar, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeclaration(at atVar) {
        Objects.requireNonNull(atVar);
        ensureDeclarationIsMutable();
        this.declaration_.add(atVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
