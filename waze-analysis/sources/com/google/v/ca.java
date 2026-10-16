package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ca extends dq<ca, bn> implements fj {
    public static final int CC_OPEN_ENUM_FIELD_NUMBER = 14;
    public static final int CTYPE_FIELD_NUMBER = 1;
    public static final int DEBUG_REDACT_FIELD_NUMBER = 16;
    private static final ca DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int DEPRECATED_RAW_MESSAGE_FIELD_NUMBER = 12;
    public static final int EDITION_DEFAULTS_FIELD_NUMBER = 20;
    public static final int ENFORCE_UTF8_FIELD_NUMBER = 13;
    public static final int FEATURES_FIELD_NUMBER = 21;
    public static final int FEATURE_SUPPORT_FIELD_NUMBER = 22;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile fo<ca> PARSER = null;
    public static final int RETENTION_FIELD_NUMBER = 17;
    public static final int TARGETS_FIELD_NUMBER = 19;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int UNVERIFIED_LAZY_FIELD_NUMBER = 15;
    public static final int UPGRADED_OPTION_FIELD_NUMBER = 11;
    public static final int WEAK_FIELD_NUMBER = 10;
    private static final el<bw> targets_converter_ = new bm();
    private int bitField0_;
    private boolean ccOpenEnum_;
    private int ctype_;
    private boolean debugRedact_;
    private boolean deprecatedRawMessage_;
    private boolean deprecated_;
    private bt featureSupport_;
    private bj features_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private int retention_;
    private boolean unverifiedLazy_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private eo<by> upgradedOption_ = emptyProtobufList();
    private boolean enforceUtf8_ = true;
    private ek targets_ = emptyIntList();
    private eo<bq> editionDefaults_ = emptyProtobufList();
    private eo<cx> uninterpretedOption_ = emptyProtobufList();

    static {
        ca caVar = new ca();
        DEFAULT_INSTANCE = caVar;
        du.registerDefaultInstance(ca.class, caVar);
    }

    private ca() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEditionDefaults(Iterable<? extends bq> iterable) {
        ensureEditionDefaultsIsMutable();
        c.addAll(iterable, this.editionDefaults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTargets(Iterable<? extends bw> iterable) {
        ensureTargetsIsMutable();
        Iterator<? extends bw> it = iterable.iterator();
        while (it.hasNext()) {
            this.targets_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends cx> iterable) {
        ensureUninterpretedOptionIsMutable();
        c.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUpgradedOption(Iterable<? extends by> iterable) {
        ensureUpgradedOptionIsMutable();
        c.addAll(iterable, this.upgradedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(int i2, bq bqVar) {
        Objects.requireNonNull(bqVar);
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(i2, bqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTargets(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureTargetsIsMutable();
        this.targets_.i(bwVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpgradedOption(int i2, by byVar) {
        Objects.requireNonNull(byVar);
        ensureUpgradedOptionIsMutable();
        this.upgradedOption_.add(i2, byVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcOpenEnum() {
        this.bitField0_ &= -513;
        this.ccOpenEnum_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtype() {
        this.bitField0_ &= -2;
        this.ctype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugRedact() {
        this.bitField0_ &= -1025;
        this.debugRedact_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -33;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecatedRawMessage() {
        this.bitField0_ &= -129;
        this.deprecatedRawMessage_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditionDefaults() {
        this.editionDefaults_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnforceUtf8() {
        this.bitField0_ &= -257;
        this.enforceUtf8_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureSupport() {
        this.featureSupport_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJstype() {
        this.bitField0_ &= -5;
        this.jstype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLazy() {
        this.bitField0_ &= -9;
        this.lazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.bitField0_ &= -3;
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetention() {
        this.bitField0_ &= -2049;
        this.retention_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargets() {
        this.targets_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnverifiedLazy() {
        this.bitField0_ &= -17;
        this.unverifiedLazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpgradedOption() {
        this.upgradedOption_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeak() {
        this.bitField0_ &= -65;
        this.weak_ = false;
    }

    private void ensureEditionDefaultsIsMutable() {
        eo<bq> eoVar = this.editionDefaults_;
        if (eoVar.c()) {
            return;
        }
        this.editionDefaults_ = du.mutableCopy(eoVar);
    }

    private void ensureTargetsIsMutable() {
        ek ekVar = this.targets_;
        if (ekVar.c()) {
            return;
        }
        this.targets_ = du.mutableCopy(ekVar);
    }

    private void ensureUninterpretedOptionIsMutable() {
        eo<cx> eoVar = this.uninterpretedOption_;
        if (eoVar.c()) {
            return;
        }
        this.uninterpretedOption_ = du.mutableCopy(eoVar);
    }

    private void ensureUpgradedOptionIsMutable() {
        eo<by> eoVar = this.upgradedOption_;
        if (eoVar.c()) {
            return;
        }
        this.upgradedOption_ = du.mutableCopy(eoVar);
    }

    public static ca getDefaultInstance() {
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
        this.bitField0_ |= 8192;
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
        this.bitField0_ |= 4096;
    }

    public static bn newBuilder() {
        return (bn) DEFAULT_INSTANCE.createBuilder();
    }

    public static ca parseDelimitedFrom(InputStream inputStream) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(v vVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ca> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEditionDefaults(int i2) {
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i2) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUpgradedOption(int i2) {
        ensureUpgradedOptionIsMutable();
        this.upgradedOption_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcOpenEnum(boolean z) {
        this.bitField0_ |= 512;
        this.ccOpenEnum_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtype(bo boVar) {
        this.ctype_ = boVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugRedact(boolean z) {
        this.bitField0_ |= 1024;
        this.debugRedact_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z) {
        this.bitField0_ |= 32;
        this.deprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecatedRawMessage(boolean z) {
        this.bitField0_ |= 128;
        this.deprecatedRawMessage_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditionDefaults(int i2, bq bqVar) {
        Objects.requireNonNull(bqVar);
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.set(i2, bqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnforceUtf8(boolean z) {
        this.bitField0_ |= 256;
        this.enforceUtf8_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureSupport(bt btVar) {
        Objects.requireNonNull(btVar);
        this.featureSupport_ = btVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(bj bjVar) {
        Objects.requireNonNull(bjVar);
        this.features_ = bjVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJstype(bu buVar) {
        this.jstype_ = buVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLazy(boolean z) {
        this.bitField0_ |= 8;
        this.lazy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z) {
        this.bitField0_ |= 2;
        this.packed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetention(bv bvVar) {
        this.retention_ = bvVar.getNumber();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargets(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureTargetsIsMutable();
        this.targets_.e(i2, bwVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i2, cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i2, cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnverifiedLazy(boolean z) {
        this.bitField0_ |= 16;
        this.unverifiedLazy_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpgradedOption(int i2, by byVar) {
        Objects.requireNonNull(byVar);
        ensureUpgradedOptionIsMutable();
        this.upgradedOption_.set(i2, byVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeak(boolean z) {
        this.bitField0_ |= 64;
        this.weak_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001ϧ\u0012\u0000\u0004\u0002\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004\u0010ဇ\n\u0011᠌\u000b\u0013ࠞ\u0014\u001b\u0015ᐉ\f\u0016ဉ\rϧЛ", new Object[]{"bitField0_", "ctype_", ai.n, "packed_", "deprecated_", "lazy_", "jstype_", ai.o, "weak_", "upgradedOption_", by.class, "deprecatedRawMessage_", "enforceUtf8_", "ccOpenEnum_", "unverifiedLazy_", "debugRedact_", "retention_", ai.p, "targets_", ai.q, "editionDefaults_", bq.class, "features_", "featureSupport_", "uninterpretedOption_", cx.class});
            case 3:
                return new ca();
            case 4:
                return new bn(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<ca> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ca.class) {
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

    public boolean getCcOpenEnum() {
        return this.ccOpenEnum_;
    }

    public bo getCtype() {
        bo boVarA = bo.a(this.ctype_);
        return boVarA == null ? bo.STRING : boVarA;
    }

    public boolean getDebugRedact() {
        return this.debugRedact_;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public boolean getDeprecatedRawMessage() {
        return this.deprecatedRawMessage_;
    }

    public bq getEditionDefaults(int i2) {
        return this.editionDefaults_.get(i2);
    }

    public int getEditionDefaultsCount() {
        return this.editionDefaults_.size();
    }

    public List<bq> getEditionDefaultsList() {
        return this.editionDefaults_;
    }

    public br getEditionDefaultsOrBuilder(int i2) {
        return this.editionDefaults_.get(i2);
    }

    public List<? extends br> getEditionDefaultsOrBuilderList() {
        return this.editionDefaults_;
    }

    public boolean getEnforceUtf8() {
        return this.enforceUtf8_;
    }

    public bt getFeatureSupport() {
        bt btVar = this.featureSupport_;
        return btVar == null ? bt.getDefaultInstance() : btVar;
    }

    public bj getFeatures() {
        bj bjVar = this.features_;
        return bjVar == null ? bj.getDefaultInstance() : bjVar;
    }

    public bu getJstype() {
        bu buVarA = bu.a(this.jstype_);
        return buVarA == null ? bu.JS_NORMAL : buVarA;
    }

    public boolean getLazy() {
        return this.lazy_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    public bv getRetention() {
        bv bvVarA = bv.a(this.retention_);
        return bvVarA == null ? bv.RETENTION_UNKNOWN : bvVarA;
    }

    public bw getTargets(int i2) {
        bw bwVarA = bw.a(this.targets_.d(i2));
        return bwVarA == null ? bw.TARGET_TYPE_UNKNOWN : bwVarA;
    }

    public int getTargetsCount() {
        return this.targets_.size();
    }

    public List<bw> getTargetsList() {
        return new em(this.targets_, targets_converter_);
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

    public boolean getUnverifiedLazy() {
        return this.unverifiedLazy_;
    }

    public by getUpgradedOption(int i2) {
        return this.upgradedOption_.get(i2);
    }

    public int getUpgradedOptionCount() {
        return this.upgradedOption_.size();
    }

    public List<by> getUpgradedOptionList() {
        return this.upgradedOption_;
    }

    public bz getUpgradedOptionOrBuilder(int i2) {
        return this.upgradedOption_.get(i2);
    }

    public List<? extends bz> getUpgradedOptionOrBuilderList() {
        return this.upgradedOption_;
    }

    @Deprecated
    public boolean getWeak() {
        return this.weak_;
    }

    public boolean hasCcOpenEnum() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDebugRedact() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDeprecatedRawMessage() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasEnforceUtf8() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasFeatureSupport() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasFeatures() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRetention() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasUnverifiedLazy() {
        return (this.bitField0_ & 16) != 0;
    }

    @Deprecated
    public boolean hasWeak() {
        return (this.bitField0_ & 64) != 0;
    }

    public static bn newBuilder(ca caVar) {
        return (bn) DEFAULT_INSTANCE.createBuilder(caVar);
    }

    public static ca parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ca) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(v vVar, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ca parseFrom(z zVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ca parseFrom(z zVar, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEditionDefaults(bq bqVar) {
        Objects.requireNonNull(bqVar);
        ensureEditionDefaultsIsMutable();
        this.editionDefaults_.add(bqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(cx cxVar) {
        Objects.requireNonNull(cxVar);
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(cxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUpgradedOption(by byVar) {
        Objects.requireNonNull(byVar);
        ensureUpgradedOptionIsMutable();
        this.upgradedOption_.add(byVar);
    }

    public static ca parseFrom(InputStream inputStream) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ca parseFrom(InputStream inputStream, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ca parseFrom(ByteBuffer byteBuffer) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ca parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ca parseFrom(byte[] bArr) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ca parseFrom(byte[] bArr, de deVar) {
        return (ca) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
