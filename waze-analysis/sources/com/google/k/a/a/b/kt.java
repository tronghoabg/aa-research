package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kt extends com.google.v.du<kt, ks> implements ku {
    private static final kt DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 23880165;
    public static final int METADATA_FIELD_NUMBER = 500;
    public static final int PAGERANK_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<kt> PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    public static final com.google.v.ds<com.google.w.n.a.b, kt> messageSetExtension;
    private int bitField0_;
    private ce metadata_;
    private int pagerank_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private String language_ = "";

    static {
        kt ktVar = new kt();
        DEFAULT_INSTANCE = ktVar;
        com.google.v.du.registerDefaultInstance(kt.class, ktVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, kt.class);
    }

    private kt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -3;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPagerank() {
        this.bitField0_ &= -5;
        this.pagerank_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static kt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 8;
    }

    public static ks newBuilder() {
        return (ks) DEFAULT_INSTANCE.createBuilder();
    }

    public static kt parseDelimitedFrom(InputStream inputStream) {
        return (kt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kt parseFrom(com.google.v.v vVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPagerank(int i2) {
        this.bitField0_ |= 4;
        this.pagerank_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        this.url_ = vVar.u();
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001Ǵ\u0004\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0005င\u0002Ǵဉ\u0003", new Object[]{"bitField0_", "url_", "language_", "pagerank_", "metadata_"});
            case 3:
                return new kt();
            case 4:
                return new ks(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kt> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kt.class) {
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

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    @Deprecated
    public int getPagerank() {
        return this.pagerank_;
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasPagerank() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ks newBuilder(kt ktVar) {
        return (ks) DEFAULT_INSTANCE.createBuilder(ktVar);
    }

    public static kt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kt parseFrom(com.google.v.z zVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kt parseFrom(InputStream inputStream) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kt parseFrom(ByteBuffer byteBuffer) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kt parseFrom(byte[] bArr) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
