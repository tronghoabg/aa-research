package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class iz extends com.google.v.du<iz, iy> implements ja {
    private static final iz DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int LANGUAGE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<iz> PARSER;
    private int bitField0_;
    private String name_ = "";
    private String description_ = "";
    private String language_ = "";
    private String id_ = "";

    static {
        iz izVar = new iz();
        DEFAULT_INSTANCE = izVar;
        com.google.v.du.registerDefaultInstance(iz.class, izVar);
    }

    private iz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.bitField0_ &= -3;
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -9;
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -5;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    public static iz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iy newBuilder() {
        return (iy) DEFAULT_INSTANCE.createBuilder();
    }

    public static iz parseDelimitedFrom(InputStream inputStream) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(com.google.v.v vVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<iz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(com.google.v.v vVar) {
        this.description_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(com.google.v.v vVar) {
        this.id_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 4;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "name_", "description_", "language_", "id_"});
        }
        if (iOrdinal == 3) {
            return new iz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<iz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (iz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getDescription() {
        return this.description_;
    }

    public com.google.v.v getDescriptionBytes() {
        return com.google.v.v.s(this.description_);
    }

    public String getId() {
        return this.id_;
    }

    public com.google.v.v getIdBytes() {
        return com.google.v.v.s(this.id_);
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

    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iy newBuilder(iz izVar) {
        return (iy) DEFAULT_INSTANCE.createBuilder(izVar);
    }

    public static iz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static iz parseFrom(com.google.v.z zVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static iz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static iz parseFrom(InputStream inputStream) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static iz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static iz parseFrom(ByteBuffer byteBuffer) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static iz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static iz parseFrom(byte[] bArr) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static iz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (iz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
