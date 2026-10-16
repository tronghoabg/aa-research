package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class im extends com.google.v.du<im, il> implements in {
    private static final im DEFAULT_INSTANCE;
    public static final int GCID_FIELD_NUMBER = 3;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<im> PARSER;
    private int bitField0_;
    private String name_ = "";
    private String language_ = "";
    private String gcid_ = "";

    static {
        im imVar = new im();
        DEFAULT_INSTANCE = imVar;
        com.google.v.du.registerDefaultInstance(im.class, imVar);
    }

    private im() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGcid() {
        this.bitField0_ &= -5;
        this.gcid_ = getDefaultInstance().getGcid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -3;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static im getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static il newBuilder() {
        return (il) DEFAULT_INSTANCE.createBuilder();
    }

    public static im parseDelimitedFrom(InputStream inputStream) {
        return (im) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static im parseFrom(com.google.v.v vVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<im> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.gcid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGcidBytes(com.google.v.v vVar) {
        this.gcid_ = vVar.u();
        this.bitField0_ |= 4;
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
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "name_", "language_", "gcid_"});
        }
        if (iOrdinal == 3) {
            return new im();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new il(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<im> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (im.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getGcid() {
        return this.gcid_;
    }

    public com.google.v.v getGcidBytes() {
        return com.google.v.v.s(this.gcid_);
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public boolean hasGcid() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static il newBuilder(im imVar) {
        return (il) DEFAULT_INSTANCE.createBuilder(imVar);
    }

    public static im parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (im) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static im parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static im parseFrom(com.google.v.z zVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static im parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static im parseFrom(InputStream inputStream) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static im parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static im parseFrom(ByteBuffer byteBuffer) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static im parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static im parseFrom(byte[] bArr) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static im parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
