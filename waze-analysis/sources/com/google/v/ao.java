package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ao extends dq<ao, an> implements fj {
    public static final int ALLOW_ALIAS_FIELD_NUMBER = 2;
    private static final ao DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_LEGACY_JSON_FIELD_CONFLICTS_FIELD_NUMBER = 6;
    public static final int FEATURES_FIELD_NUMBER = 7;
    private static volatile fo<ao> PARSER = null;
    public static final int PROTO1_NAME_FIELD_NUMBER = 1;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private boolean allowAlias_;
    private int bitField0_;
    private boolean deprecatedLegacyJsonFieldConflicts_;
    private boolean deprecated_;
    private bj features_;
    private byte memoizedIsInitialized = 2;
    private String proto1Name_ = "";
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        ao aoVar = new ao();
        DEFAULT_INSTANCE = aoVar;
        du.registerDefaultInstance(ao.class, aoVar);
    }

    private ao() {
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
    public void clearAllowAlias() {
        this.bitField0_ &= -3;
        this.allowAlias_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -5;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedLegacyJsonFieldConflicts() {
        this.bitField0_ &= -9;
        this.deprecatedLegacyJsonFieldConflicts_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProto1Name() {
        this.bitField0_ &= -2;
        this.proto1Name_ = getDefaultInstance().getProto1Name();
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

    public static ao getDefaultInstance() {
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
        this.bitField0_ |= 16;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ao parseDelimitedFrom(InputStream inputStream) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(v vVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ao> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowAlias(boolean z) {
        this.bitField0_ |= 2;
        this.allowAlias_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 4;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedLegacyJsonFieldConflicts(boolean z) {
        this.bitField0_ |= 8;
        this.deprecatedLegacyJsonFieldConflicts_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto1Name(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.proto1Name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto1NameBytes(v vVar) {
        this.proto1Name_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0006ဇ\u0003\u0007ᐉ\u0004ϧЛ", new Object[]{"bitField0_", "proto1Name_", "allowAlias_", "deprecated_", "deprecatedLegacyJsonFieldConflicts_", "features_", "uninterpretedOption_", cx.class});
            case 3:
                return new ao();
            case 4:
                return new an(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ao> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ao.class) {
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

    public boolean getAllowAlias() {
        return this.allowAlias_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Deprecated
    public boolean getDeprecatedLegacyJsonFieldConflicts() {
        return this.deprecatedLegacyJsonFieldConflicts_;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public String getProto1Name() {
        return this.proto1Name_;
    }

    public v getProto1NameBytes() {
        return v.s(this.proto1Name_);
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

    public boolean hasAllowAlias() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasDeprecatedLegacyJsonFieldConflicts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasProto1Name() {
        return (this.bitField0_ & 1) != 0;
    }

    public static an newBuilder(ao aoVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(aoVar);
    }

    public static ao parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ao) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(v vVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ao parseFrom(z zVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ao parseFrom(z zVar, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    public static ao parseFrom(InputStream inputStream) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ao parseFrom(InputStream inputStream, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ao parseFrom(ByteBuffer byteBuffer) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ao parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ao parseFrom(byte[] bArr) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ao parseFrom(byte[] bArr, de deVar) {
        return (ao) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
