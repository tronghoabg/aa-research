package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lx extends com.google.v.du<lx, lt> implements ly {
    private static final lx DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<lx> PARSER;
    private com.google.v.eo<lv> fieldPath_ = emptyProtobufList();

    static {
        lx lxVar = new lx();
        DEFAULT_INSTANCE = lxVar;
        com.google.v.du.registerDefaultInstance(lx.class, lxVar);
    }

    private lx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldPath(Iterable<? extends lv> iterable) {
        ensureFieldPathIsMutable();
        com.google.v.c.addAll(iterable, this.fieldPath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPath(int i2, lv lvVar) {
        Objects.requireNonNull(lvVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.add(i2, lvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPath() {
        this.fieldPath_ = emptyProtobufList();
    }

    private void ensureFieldPathIsMutable() {
        com.google.v.eo<lv> eoVar = this.fieldPath_;
        if (eoVar.c()) {
            return;
        }
        this.fieldPath_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static lx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lt newBuilder() {
        return (lt) DEFAULT_INSTANCE.createBuilder();
    }

    public static lx parseDelimitedFrom(InputStream inputStream) {
        return (lx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lx parseFrom(com.google.v.v vVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<lx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldPath(int i2) {
        ensureFieldPathIsMutable();
        this.fieldPath_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPath(int i2, lv lvVar) {
        Objects.requireNonNull(lvVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.set(i2, lvVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"fieldPath_", lv.class});
        }
        if (iOrdinal == 3) {
            return new lx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new lt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<lx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (lx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lv getFieldPath(int i2) {
        return this.fieldPath_.get(i2);
    }

    public int getFieldPathCount() {
        return this.fieldPath_.size();
    }

    public List<lv> getFieldPathList() {
        return this.fieldPath_;
    }

    public lw getFieldPathOrBuilder(int i2) {
        return this.fieldPath_.get(i2);
    }

    public List<? extends lw> getFieldPathOrBuilderList() {
        return this.fieldPath_;
    }

    public static lt newBuilder(lx lxVar) {
        return (lt) DEFAULT_INSTANCE.createBuilder(lxVar);
    }

    public static lx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static lx parseFrom(com.google.v.z zVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static lx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPath(lv lvVar) {
        Objects.requireNonNull(lvVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.add(lvVar);
    }

    public static lx parseFrom(InputStream inputStream) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static lx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static lx parseFrom(ByteBuffer byteBuffer) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static lx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static lx parseFrom(byte[] bArr) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static lx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (lx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
