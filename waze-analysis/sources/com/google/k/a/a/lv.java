package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lv extends com.google.v.du<lv, lu> implements lw {
    private static final lv DEFAULT_INSTANCE;
    public static final int FIELD_NUM_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<lv> PARSER = null;
    public static final int VERSION_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private int fieldNum_;
    private String versionToken_ = "";

    static {
        lv lvVar = new lv();
        DEFAULT_INSTANCE = lvVar;
        com.google.v.du.registerDefaultInstance(lv.class, lvVar);
    }

    private lv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldNum() {
        this.bitField0_ &= -2;
        this.fieldNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionToken() {
        this.bitField0_ &= -3;
        this.versionToken_ = getDefaultInstance().getVersionToken();
    }

    public static lv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lu newBuilder() {
        return (lu) DEFAULT_INSTANCE.createBuilder();
    }

    public static lv parseDelimitedFrom(InputStream inputStream) {
        return (lv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lv parseFrom(com.google.v.v vVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldNum(int i2) {
        this.bitField0_ |= 1;
        this.fieldNum_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.versionToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionTokenBytes(com.google.v.v vVar) {
        this.versionToken_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "fieldNum_", "versionToken_"});
        }
        if (iOrdinal == 3) {
            return new lv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getFieldNum() {
        return this.fieldNum_;
    }

    public String getVersionToken() {
        return this.versionToken_;
    }

    public com.google.v.v getVersionTokenBytes() {
        return com.google.v.v.s(this.versionToken_);
    }

    public boolean hasFieldNum() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVersionToken() {
        return (this.bitField0_ & 2) != 0;
    }

    public static lu newBuilder(lv lvVar) {
        return (lu) DEFAULT_INSTANCE.createBuilder(lvVar);
    }

    public static lv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lv parseFrom(com.google.v.z zVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static lv parseFrom(InputStream inputStream) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lv parseFrom(ByteBuffer byteBuffer) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lv parseFrom(byte[] bArr) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
