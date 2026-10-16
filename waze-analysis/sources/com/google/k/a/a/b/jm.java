package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jm extends com.google.v.du<jm, jl> implements jn {
    private static final jm DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jm> PARSER = null;
    public static final int PREFIX_FIELD_NUMBER = 2;
    public static final int SUFFIX_FIELD_NUMBER = 3;
    private int bitField0_;
    private String language_ = "";
    private String prefix_ = "";
    private String suffix_ = "";

    static {
        jm jmVar = new jm();
        DEFAULT_INSTANCE = jmVar;
        com.google.v.du.registerDefaultInstance(jm.class, jmVar);
    }

    private jm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -2;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrefix() {
        this.bitField0_ &= -3;
        this.prefix_ = getDefaultInstance().getPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSuffix() {
        this.bitField0_ &= -5;
        this.suffix_ = getDefaultInstance().getSuffix();
    }

    public static jm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jl newBuilder() {
        return (jl) DEFAULT_INSTANCE.createBuilder();
    }

    public static jm parseDelimitedFrom(InputStream inputStream) {
        return (jm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jm parseFrom(com.google.v.v vVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.prefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrefixBytes(com.google.v.v vVar) {
        this.prefix_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.suffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuffixBytes(com.google.v.v vVar) {
        this.suffix_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "language_", "prefix_", "suffix_"});
        }
        if (iOrdinal == 3) {
            return new jm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jl(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jm> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jm.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public String getPrefix() {
        return this.prefix_;
    }

    public com.google.v.v getPrefixBytes() {
        return com.google.v.v.s(this.prefix_);
    }

    public String getSuffix() {
        return this.suffix_;
    }

    public com.google.v.v getSuffixBytes() {
        return com.google.v.v.s(this.suffix_);
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrefix() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuffix() {
        return (this.bitField0_ & 4) != 0;
    }

    public static jl newBuilder(jm jmVar) {
        return (jl) DEFAULT_INSTANCE.createBuilder(jmVar);
    }

    public static jm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jm parseFrom(com.google.v.z zVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jm parseFrom(InputStream inputStream) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jm parseFrom(ByteBuffer byteBuffer) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jm parseFrom(byte[] bArr) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
