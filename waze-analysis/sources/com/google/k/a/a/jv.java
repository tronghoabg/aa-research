package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jv extends com.google.v.du<jv, ju> implements jw {
    public static final int ATTRIBUTE_ID_FIELD_NUMBER = 2;
    private static final jv DEFAULT_INSTANCE;
    public static final int FEATURE_PROPERTY_ID_FIELD_NUMBER = 4;
    public static final int FIELD_TYPE_FIELD_NUMBER = 1;
    public static final int MIN_RIGHTS_LEVEL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<jv> PARSER;
    private String attributeId_ = "";
    private int bitField0_;
    private com.google.k.c.a.a.c featurePropertyId_;
    private int fieldType_;
    private int minRightsLevel_;

    static {
        jv jvVar = new jv();
        DEFAULT_INSTANCE = jvVar;
        com.google.v.du.registerDefaultInstance(jv.class, jvVar);
    }

    private jv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributeId() {
        this.bitField0_ &= -9;
        this.attributeId_ = getDefaultInstance().getAttributeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeaturePropertyId() {
        this.featurePropertyId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldType() {
        this.bitField0_ &= -5;
        this.fieldType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinRightsLevel() {
        this.bitField0_ &= -3;
        this.minRightsLevel_ = 0;
    }

    public static jv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeaturePropertyId(com.google.k.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        com.google.k.c.a.a.c cVar2 = this.featurePropertyId_;
        if (cVar2 != null && cVar2 != com.google.k.c.a.a.c.getDefaultInstance()) {
            com.google.k.c.a.a.a aVarNewBuilder = com.google.k.c.a.a.c.newBuilder(cVar2);
            aVarNewBuilder.mergeFrom((com.google.k.c.a.a.a) cVar);
            cVar = aVarNewBuilder.buildPartial();
        }
        this.featurePropertyId_ = cVar;
        this.bitField0_ |= 1;
    }

    public static ju newBuilder() {
        return (ju) DEFAULT_INSTANCE.createBuilder();
    }

    public static jv parseDelimitedFrom(InputStream inputStream) {
        return (jv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jv parseFrom(com.google.v.v vVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributeId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.attributeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributeIdBytes(com.google.v.v vVar) {
        this.attributeId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeaturePropertyId(com.google.k.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        this.featurePropertyId_ = cVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldType(int i2) {
        this.bitField0_ |= 4;
        this.fieldType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinRightsLevel(jt jtVar) {
        this.minRightsLevel_ = jtVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0002\u0002ဈ\u0003\u0003᠌\u0001\u0004ဉ\u0000", new Object[]{"bitField0_", "fieldType_", "attributeId_", "minRightsLevel_", ha.o, "featurePropertyId_"});
        }
        if (iOrdinal == 3) {
            return new jv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ju(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jv> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jv.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Deprecated
    public String getAttributeId() {
        return this.attributeId_;
    }

    @Deprecated
    public com.google.v.v getAttributeIdBytes() {
        return com.google.v.v.s(this.attributeId_);
    }

    public com.google.k.c.a.a.c getFeaturePropertyId() {
        com.google.k.c.a.a.c cVar = this.featurePropertyId_;
        return cVar == null ? com.google.k.c.a.a.c.getDefaultInstance() : cVar;
    }

    public int getFieldType() {
        return this.fieldType_;
    }

    public jt getMinRightsLevel() {
        jt jtVarA = jt.a(this.minRightsLevel_);
        return jtVarA == null ? jt.UNKNOWN_RIGHTS : jtVarA;
    }

    @Deprecated
    public boolean hasAttributeId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFeaturePropertyId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFieldType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMinRightsLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ju newBuilder(jv jvVar) {
        return (ju) DEFAULT_INSTANCE.createBuilder(jvVar);
    }

    public static jv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jv parseFrom(com.google.v.z zVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jv parseFrom(InputStream inputStream) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jv parseFrom(ByteBuffer byteBuffer) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jv parseFrom(byte[] bArr) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
