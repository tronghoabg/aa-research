package com.google.e.a.h;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public final class bo extends du<bo, bn> implements bp {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final bo DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile fo<bo> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        bo boVar = new bo();
        DEFAULT_INSTANCE = boVar;
        du.registerDefaultInstance(bo.class, boVar);
    }

    private bo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCatalogueName() {
        this.catalogueName_ = getDefaultInstance().getCatalogueName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyManagerVersion() {
        this.keyManagerVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewKeyAllowed() {
        this.newKeyAllowed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimitiveName() {
        this.primitiveName_ = getDefaultInstance().getPrimitiveName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    public static bo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bn newBuilder() {
        return (bn) DEFAULT_INSTANCE.createBuilder();
    }

    public static bo parseDelimitedFrom(InputStream inputStream) {
        return (bo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bo parseFrom(com.google.v.v vVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueName(String str) {
        Objects.requireNonNull(str);
        this.catalogueName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCatalogueNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.catalogueName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyManagerVersion(int i2) {
        this.keyManagerVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewKeyAllowed(boolean z) {
        this.newKeyAllowed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveName(String str) {
        Objects.requireNonNull(str);
        this.primitiveName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimitiveNameBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.primitiveName_ = vVar.u();
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

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
        }
        if (iOrdinal == 3) {
            return new bo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCatalogueName() {
        return this.catalogueName_;
    }

    public com.google.v.v getCatalogueNameBytes() {
        return com.google.v.v.s(this.catalogueName_);
    }

    public int getKeyManagerVersion() {
        return this.keyManagerVersion_;
    }

    public boolean getNewKeyAllowed() {
        return this.newKeyAllowed_;
    }

    public String getPrimitiveName() {
        return this.primitiveName_;
    }

    public com.google.v.v getPrimitiveNameBytes() {
        return com.google.v.v.s(this.primitiveName_);
    }

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public com.google.v.v getTypeUrlBytes() {
        return com.google.v.v.s(this.typeUrl_);
    }

    public static bn newBuilder(bo boVar) {
        return (bn) DEFAULT_INSTANCE.createBuilder(boVar);
    }

    public static bo parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (bo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bo parseFrom(com.google.v.v vVar, de deVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bo parseFrom(com.google.v.z zVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bo parseFrom(com.google.v.z zVar, de deVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bo parseFrom(InputStream inputStream) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bo parseFrom(InputStream inputStream, de deVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bo parseFrom(ByteBuffer byteBuffer) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bo parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bo parseFrom(byte[] bArr) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bo parseFrom(byte[] bArr, de deVar) {
        return (bo) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
