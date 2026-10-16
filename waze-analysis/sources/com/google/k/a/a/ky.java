package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ky extends com.google.v.du<ky, kx> implements com.google.v.fj {
    private static final ky DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ky> PARSER = null;
    public static final int SERVED_FEATURE_FIELD_NUMBER = 1;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<com.google.k.a.a.b.bw> servedFeature_ = emptyProtobufList();

    static {
        ky kyVar = new ky();
        DEFAULT_INSTANCE = kyVar;
        com.google.v.du.registerDefaultInstance(ky.class, kyVar);
    }

    private ky() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServedFeature(Iterable<? extends com.google.k.a.a.b.bw> iterable) {
        ensureServedFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.servedFeature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServedFeature(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServedFeatureIsMutable();
        this.servedFeature_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServedFeature() {
        this.servedFeature_ = emptyProtobufList();
    }

    private void ensureServedFeatureIsMutable() {
        com.google.v.eo<com.google.k.a.a.b.bw> eoVar = this.servedFeature_;
        if (eoVar.c()) {
            return;
        }
        this.servedFeature_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ky getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kx newBuilder() {
        return (kx) DEFAULT_INSTANCE.createBuilder();
    }

    public static ky parseDelimitedFrom(InputStream inputStream) {
        return (ky) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ky parseFrom(com.google.v.v vVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ky> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeServedFeature(int i2) {
        ensureServedFeatureIsMutable();
        this.servedFeature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServedFeature(int i2, com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServedFeatureIsMutable();
        this.servedFeature_.set(i2, bwVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"servedFeature_", com.google.k.a.a.b.bw.class});
            case 3:
                return new ky();
            case 4:
                return new kx(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ky> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ky.class) {
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

    public com.google.k.a.a.b.bw getServedFeature(int i2) {
        return this.servedFeature_.get(i2);
    }

    public int getServedFeatureCount() {
        return this.servedFeature_.size();
    }

    public List<com.google.k.a.a.b.bw> getServedFeatureList() {
        return this.servedFeature_;
    }

    public com.google.k.a.a.b.bx getServedFeatureOrBuilder(int i2) {
        return this.servedFeature_.get(i2);
    }

    public List<? extends com.google.k.a.a.b.bx> getServedFeatureOrBuilderList() {
        return this.servedFeature_;
    }

    public static kx newBuilder(ky kyVar) {
        return (kx) DEFAULT_INSTANCE.createBuilder(kyVar);
    }

    public static ky parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ky) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ky parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ky parseFrom(com.google.v.z zVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ky parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServedFeature(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureServedFeatureIsMutable();
        this.servedFeature_.add(bwVar);
    }

    public static ky parseFrom(InputStream inputStream) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ky parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ky parseFrom(ByteBuffer byteBuffer) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ky parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ky parseFrom(byte[] bArr) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ky parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ky) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
