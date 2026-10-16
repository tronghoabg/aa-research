package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn extends com.google.v.du<cn, cm> implements com.google.v.fj {
    private static final cn DEFAULT_INSTANCE;
    public static final int FAVORITE_NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<cn> PARSER;
    private int bitField0_;
    private String favoriteName_ = "";

    static {
        cn cnVar = new cn();
        DEFAULT_INSTANCE = cnVar;
        com.google.v.du.registerDefaultInstance(cn.class, cnVar);
    }

    private cn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFavoriteName() {
        this.bitField0_ &= -2;
        this.favoriteName_ = getDefaultInstance().getFavoriteName();
    }

    public static cn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cm newBuilder() {
        return (cm) DEFAULT_INSTANCE.createBuilder();
    }

    public static cn parseDelimitedFrom(InputStream inputStream) {
        return (cn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cn parseFrom(com.google.v.v vVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.favoriteName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFavoriteNameBytes(com.google.v.v vVar) {
        this.favoriteName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "favoriteName_"});
        }
        if (iOrdinal == 3) {
            return new cn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getFavoriteName() {
        return this.favoriteName_;
    }

    public com.google.v.v getFavoriteNameBytes() {
        return com.google.v.v.s(this.favoriteName_);
    }

    public boolean hasFavoriteName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cm newBuilder(cn cnVar) {
        return (cm) DEFAULT_INSTANCE.createBuilder(cnVar);
    }

    public static cn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cn parseFrom(com.google.v.z zVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cn parseFrom(InputStream inputStream) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cn parseFrom(ByteBuffer byteBuffer) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cn parseFrom(byte[] bArr) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
