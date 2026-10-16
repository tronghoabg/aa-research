package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jn extends com.google.v.du<jn, jl> implements com.google.v.fj {
    private static final jn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jn> PARSER = null;
    public static final int REQUIRED_EMISSIONS_STICKER_FIELD_NUMBER = 2;
    public static final int RESTRICTION_FIELD_NUMBER = 1;
    private static final com.google.v.el<jm> requiredEmissionsSticker_converter_ = new fn(11);
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.gk> restriction_ = emptyProtobufList();
    private com.google.v.ek requiredEmissionsSticker_ = emptyIntList();

    static {
        jn jnVar = new jn();
        DEFAULT_INSTANCE = jnVar;
        com.google.v.du.registerDefaultInstance(jn.class, jnVar);
    }

    private jn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequiredEmissionsSticker(Iterable<? extends jm> iterable) {
        ensureRequiredEmissionsStickerIsMutable();
        Iterator<? extends jm> it = iterable.iterator();
        while (it.hasNext()) {
            this.requiredEmissionsSticker_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestriction(Iterable<? extends com.google.k.a.a.b.gk> iterable) {
        ensureRestrictionIsMutable();
        com.google.v.c.addAll(iterable, this.restriction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredEmissionsSticker(jm jmVar) {
        Objects.requireNonNull(jmVar);
        ensureRequiredEmissionsStickerIsMutable();
        this.requiredEmissionsSticker_.i(jmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(int i2, com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiredEmissionsSticker() {
        this.requiredEmissionsSticker_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = emptyProtobufList();
    }

    private void ensureRequiredEmissionsStickerIsMutable() {
        com.google.v.ek ekVar = this.requiredEmissionsSticker_;
        if (ekVar.c()) {
            return;
        }
        this.requiredEmissionsSticker_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureRestrictionIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.gk> eoVar = this.restriction_;
        if (eoVar.c()) {
            return;
        }
        this.restriction_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jl newBuilder() {
        return (jl) DEFAULT_INSTANCE.createBuilder();
    }

    public static jn parseDelimitedFrom(InputStream inputStream) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(com.google.v.v vVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRestriction(int i2) {
        ensureRestrictionIsMutable();
        this.restriction_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiredEmissionsSticker(int i2, jm jmVar) {
        Objects.requireNonNull(jmVar);
        ensureRequiredEmissionsStickerIsMutable();
        this.requiredEmissionsSticker_.e(i2, jmVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(int i2, com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.set(i2, gkVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002ࠞ", new Object[]{"restriction_", com.google.k.a.a.b.gk.class, "requiredEmissionsSticker_", ha.n});
            case 3:
                return new jn();
            case 4:
                return new jl(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jn> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jn.class) {
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

    public jm getRequiredEmissionsSticker(int i2) {
        jm jmVarA = jm.a(this.requiredEmissionsSticker_.d(i2));
        return jmVarA == null ? jm.EMISSIONS_STICKER_UNKNOWN : jmVarA;
    }

    public int getRequiredEmissionsStickerCount() {
        return this.requiredEmissionsSticker_.size();
    }

    public List<jm> getRequiredEmissionsStickerList() {
        return new com.google.v.em(this.requiredEmissionsSticker_, requiredEmissionsSticker_converter_);
    }

    public com.google.k.a.a.b.gk getRestriction(int i2) {
        return this.restriction_.get(i2);
    }

    public int getRestrictionCount() {
        return this.restriction_.size();
    }

    public List<com.google.k.a.a.b.gk> getRestrictionList() {
        return this.restriction_;
    }

    public com.google.k.a.a.b.gl getRestrictionOrBuilder(int i2) {
        return this.restriction_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.gl> getRestrictionOrBuilderList() {
        return this.restriction_;
    }

    public static jl newBuilder(jn jnVar) {
        return (jl) DEFAULT_INSTANCE.createBuilder(jnVar);
    }

    public static jn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jn parseFrom(com.google.v.z zVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(com.google.k.a.a.b.gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(gkVar);
    }

    public static jn parseFrom(InputStream inputStream) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jn parseFrom(ByteBuffer byteBuffer) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jn parseFrom(byte[] bArr) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
