package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dv extends com.google.v.du<dv, du> implements dw {
    private static final dv DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<dv> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private String language_ = "";

    static {
        dv dvVar = new dv();
        DEFAULT_INSTANCE = dvVar;
        com.google.v.du.registerDefaultInstance(dv.class, dvVar);
    }

    private dv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -3;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -2;
        this.text_ = getDefaultInstance().getText();
    }

    public static dv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static du newBuilder() {
        return (du) DEFAULT_INSTANCE.createBuilder();
    }

    public static dv parseDelimitedFrom(InputStream inputStream) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(com.google.v.v vVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dv> parser() {
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
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        this.text_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "text_", "language_"});
        }
        if (iOrdinal == 3) {
            return new dv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new du(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dv.class) {
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

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static du newBuilder(dv dvVar) {
        return (du) DEFAULT_INSTANCE.createBuilder(dvVar);
    }

    public static dv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dv parseFrom(com.google.v.z zVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dv parseFrom(InputStream inputStream) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dv parseFrom(ByteBuffer byteBuffer) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dv parseFrom(byte[] bArr) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
