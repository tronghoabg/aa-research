package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cc extends com.google.v.du<cc, cb> implements com.google.v.fj {
    private static final cc DEFAULT_INSTANCE;
    public static final int FEATURE_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 1244700;
    private static volatile com.google.v.fo<cc> PARSER = null;
    public static final int SECONDARY_KEY_FIELD_NUMBER = 2;
    public static final com.google.v.ds<com.google.w.n.a.b, cc> messageSetExtension;
    private int bitField0_;
    private com.google.v.eo<bt> feature_;
    private com.google.v.v key_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.v secondaryKey_;

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        com.google.v.du.registerDefaultInstance(cc.class, ccVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, cc.class);
    }

    private cc() {
        com.google.v.v vVar = com.google.v.v.f13054a;
        this.key_ = vVar;
        this.secondaryKey_ = vVar;
        this.feature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeature(Iterable<? extends bt> iterable) {
        ensureFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.feature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeature(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFeatureIsMutable();
        this.feature_.add(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.bitField0_ &= -2;
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryKey() {
        this.bitField0_ &= -3;
        this.secondaryKey_ = getDefaultInstance().getSecondaryKey();
    }

    private void ensureFeatureIsMutable() {
        com.google.v.eo<bt> eoVar = this.feature_;
        if (eoVar.c()) {
            return;
        }
        this.feature_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cb newBuilder() {
        return (cb) DEFAULT_INSTANCE.createBuilder();
    }

    public static cc parseDelimitedFrom(InputStream inputStream) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(com.google.v.v vVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFeature(int i2) {
        ensureFeatureIsMutable();
        this.feature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFeatureIsMutable();
        this.feature_.set(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 1;
        this.key_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryKey(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.secondaryKey_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002ည\u0001\u0003Л", new Object[]{"bitField0_", "key_", "secondaryKey_", "feature_", bt.class});
            case 3:
                return new cc();
            case 4:
                return new cb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<cc> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cc.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public bt getFeature(int i2) {
        return this.feature_.get(i2);
    }

    public int getFeatureCount() {
        return this.feature_.size();
    }

    public List<bt> getFeatureList() {
        return this.feature_;
    }

    public bu getFeatureOrBuilder(int i2) {
        return this.feature_.get(i2);
    }

    public List<? extends bu> getFeatureOrBuilderList() {
        return this.feature_;
    }

    public com.google.v.v getKey() {
        return this.key_;
    }

    public com.google.v.v getSecondaryKey() {
        return this.secondaryKey_;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSecondaryKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public static cb newBuilder(cc ccVar) {
        return (cb) DEFAULT_INSTANCE.createBuilder(ccVar);
    }

    public static cc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cc parseFrom(com.google.v.z zVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeature(bt btVar) {
        Objects.requireNonNull(btVar);
        ensureFeatureIsMutable();
        this.feature_.add(btVar);
    }

    public static cc parseFrom(InputStream inputStream) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(ByteBuffer byteBuffer) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cc parseFrom(byte[] bArr) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
