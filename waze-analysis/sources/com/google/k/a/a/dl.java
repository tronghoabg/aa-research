package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dl extends com.google.v.du<dl, dk> implements dm {
    private static final dl DEFAULT_INSTANCE;
    public static final int FIELD_PATH_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dl> PARSER = null;
    public static final int PROVENANCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.v.eo<lx> fieldPath_ = emptyProtobufList();
    private dp provenance_;

    static {
        dl dlVar = new dl();
        DEFAULT_INSTANCE = dlVar;
        com.google.v.du.registerDefaultInstance(dl.class, dlVar);
    }

    private dl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldPath(Iterable<? extends lx> iterable) {
        ensureFieldPathIsMutable();
        com.google.v.c.addAll(iterable, this.fieldPath_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPath(int i2, lx lxVar) {
        Objects.requireNonNull(lxVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.add(i2, lxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPath() {
        this.fieldPath_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvenance() {
        this.provenance_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureFieldPathIsMutable() {
        com.google.v.eo<lx> eoVar = this.fieldPath_;
        if (eoVar.c()) {
            return;
        }
        this.fieldPath_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static dl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeProvenance(dp dpVar) {
        Objects.requireNonNull(dpVar);
        dp dpVar2 = this.provenance_;
        if (dpVar2 != null && dpVar2 != dp.getDefaultInstance()) {
            Cdo cdoNewBuilder = dp.newBuilder(dpVar2);
            cdoNewBuilder.mergeFrom((Cdo) dpVar);
            dpVar = cdoNewBuilder.buildPartial();
        }
        this.provenance_ = dpVar;
        this.bitField0_ |= 1;
    }

    public static dk newBuilder() {
        return (dk) DEFAULT_INSTANCE.createBuilder();
    }

    public static dl parseDelimitedFrom(InputStream inputStream) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(com.google.v.v vVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFieldPath(int i2) {
        ensureFieldPathIsMutable();
        this.fieldPath_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPath(int i2, lx lxVar) {
        Objects.requireNonNull(lxVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.set(i2, lxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvenance(dp dpVar) {
        Objects.requireNonNull(dpVar);
        this.provenance_ = dpVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "fieldPath_", lx.class, "provenance_"});
        }
        if (iOrdinal == 3) {
            return new dl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dl> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dl.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public lx getFieldPath(int i2) {
        return this.fieldPath_.get(i2);
    }

    public int getFieldPathCount() {
        return this.fieldPath_.size();
    }

    public List<lx> getFieldPathList() {
        return this.fieldPath_;
    }

    public ly getFieldPathOrBuilder(int i2) {
        return this.fieldPath_.get(i2);
    }

    public List<? extends ly> getFieldPathOrBuilderList() {
        return this.fieldPath_;
    }

    public dp getProvenance() {
        dp dpVar = this.provenance_;
        return dpVar == null ? dp.getDefaultInstance() : dpVar;
    }

    public boolean hasProvenance() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dk newBuilder(dl dlVar) {
        return (dk) DEFAULT_INSTANCE.createBuilder(dlVar);
    }

    public static dl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dl parseFrom(com.google.v.z zVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPath(lx lxVar) {
        Objects.requireNonNull(lxVar);
        ensureFieldPathIsMutable();
        this.fieldPath_.add(lxVar);
    }

    public static dl parseFrom(InputStream inputStream) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dl parseFrom(ByteBuffer byteBuffer) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dl parseFrom(byte[] bArr) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
