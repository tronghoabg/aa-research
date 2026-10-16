package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bj extends du<bj, bh> implements fj {
    private static final bj DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile fo<bj> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.v.v value_ = com.google.v.v.f13054a;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyMaterialType() {
        this.keyMaterialType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bh newBuilder() {
        return (bh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(com.google.v.v vVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyMaterialType(bi biVar) {
        this.keyMaterialType_ = biVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyMaterialTypeValue(int i2) {
        this.keyMaterialType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        Objects.requireNonNull(str);
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.typeUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.value_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
        }
        if (iOrdinal == 3) {
            return new bj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bi getKeyMaterialType() {
        int i2 = this.keyMaterialType_;
        bi biVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bi.REMOTE : bi.ASYMMETRIC_PUBLIC : bi.ASYMMETRIC_PRIVATE : bi.SYMMETRIC : bi.UNKNOWN_KEYMATERIAL;
        return biVar == null ? bi.UNRECOGNIZED : biVar;
    }

    public int getKeyMaterialTypeValue() {
        return this.keyMaterialType_;
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public com.google.v.v getTypeUrlBytes() {
        return com.google.v.v.s(this.typeUrl_);
    }

    public com.google.v.v getValue() {
        return this.value_;
    }

    public static bh newBuilder(bj bjVar) {
        return (bh) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(com.google.v.v vVar, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(com.google.v.z zVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(com.google.v.z zVar, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, de deVar) {
        return (bj) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
