package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jy extends com.google.v.du<jy, jx> implements com.google.v.fj {
    private static final jy DEFAULT_INSTANCE;
    public static final int FIELD_WITH_RIGHTS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<jy> PARSER;
    private com.google.v.eo<jv> fieldWithRights_ = emptyProtobufList();

    static {
        jy jyVar = new jy();
        DEFAULT_INSTANCE = jyVar;
        com.google.v.du.registerDefaultInstance(jy.class, jyVar);
    }

    private jy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldWithRights(Iterable<? extends jv> iterable) {
        ensureFieldWithRightsIsMutable();
        com.google.v.c.addAll(iterable, this.fieldWithRights_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldWithRights(int i2, jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureFieldWithRightsIsMutable();
        this.fieldWithRights_.add(i2, jvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldWithRights() {
        this.fieldWithRights_ = emptyProtobufList();
    }

    private void ensureFieldWithRightsIsMutable() {
        com.google.v.eo<jv> eoVar = this.fieldWithRights_;
        if (eoVar.c()) {
            return;
        }
        this.fieldWithRights_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static jy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static jx newBuilder() {
        return (jx) DEFAULT_INSTANCE.createBuilder();
    }

    public static jy parseDelimitedFrom(InputStream inputStream) {
        return (jy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jy parseFrom(com.google.v.v vVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldWithRights(int i2) {
        ensureFieldWithRightsIsMutable();
        this.fieldWithRights_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldWithRights(int i2, jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureFieldWithRightsIsMutable();
        this.fieldWithRights_.set(i2, jvVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldWithRights_", jv.class});
        }
        if (iOrdinal == 3) {
            return new jy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new jx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<jy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (jy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public jv getFieldWithRights(int i2) {
        return this.fieldWithRights_.get(i2);
    }

    public int getFieldWithRightsCount() {
        return this.fieldWithRights_.size();
    }

    public List<jv> getFieldWithRightsList() {
        return this.fieldWithRights_;
    }

    public jw getFieldWithRightsOrBuilder(int i2) {
        return this.fieldWithRights_.get(i2);
    }

    public List<? extends jw> getFieldWithRightsOrBuilderList() {
        return this.fieldWithRights_;
    }

    public static jx newBuilder(jy jyVar) {
        return (jx) DEFAULT_INSTANCE.createBuilder(jyVar);
    }

    public static jy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jy parseFrom(com.google.v.z zVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldWithRights(jv jvVar) {
        Objects.requireNonNull(jvVar);
        ensureFieldWithRightsIsMutable();
        this.fieldWithRights_.add(jvVar);
    }

    public static jy parseFrom(InputStream inputStream) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jy parseFrom(ByteBuffer byteBuffer) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jy parseFrom(byte[] bArr) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
