package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kw extends com.google.v.du<kw, kv> implements kx {
    private static final kw DEFAULT_INSTANCE;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 14251185;
    private static volatile com.google.v.fo<kw> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final com.google.v.ds<com.google.w.n.a.b, kw> messageSetExtension;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<kt> url_ = emptyProtobufList();

    static {
        kw kwVar = new kw();
        DEFAULT_INSTANCE = kwVar;
        com.google.v.du.registerDefaultInstance(kw.class, kwVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, kw.class);
    }

    private kw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUrl(Iterable<? extends kt> iterable) {
        ensureUrlIsMutable();
        com.google.v.c.addAll(iterable, this.url_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureUrlIsMutable();
        this.url_.add(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.url_ = emptyProtobufList();
    }

    private void ensureUrlIsMutable() {
        com.google.v.eo<kt> eoVar = this.url_;
        if (eoVar.c()) {
            return;
        }
        this.url_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static kw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static kv newBuilder() {
        return (kv) DEFAULT_INSTANCE.createBuilder();
    }

    public static kw parseDelimitedFrom(InputStream inputStream) {
        return (kw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kw parseFrom(com.google.v.v vVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUrl(int i2) {
        ensureUrlIsMutable();
        this.url_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureUrlIsMutable();
        this.url_.set(i2, ktVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"url_", kt.class});
            case 3:
                return new kw();
            case 4:
                return new kv(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kw> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kw.class) {
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

    public kt getUrl(int i2) {
        return this.url_.get(i2);
    }

    public int getUrlCount() {
        return this.url_.size();
    }

    public List<kt> getUrlList() {
        return this.url_;
    }

    public ku getUrlOrBuilder(int i2) {
        return this.url_.get(i2);
    }

    public List<? extends ku> getUrlOrBuilderList() {
        return this.url_;
    }

    public static kv newBuilder(kw kwVar) {
        return (kv) DEFAULT_INSTANCE.createBuilder(kwVar);
    }

    public static kw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kw parseFrom(com.google.v.z zVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUrl(kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureUrlIsMutable();
        this.url_.add(ktVar);
    }

    public static kw parseFrom(InputStream inputStream) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kw parseFrom(ByteBuffer byteBuffer) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kw parseFrom(byte[] bArr) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
