package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bz extends com.google.v.du<bz, bv> implements com.google.v.fj {
    public static final int CONTROL_POINT_FIELD_NUMBER = 1;
    private static final bz DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bz> PARSER;
    private com.google.v.eo<bx> controlPoint_ = emptyProtobufList();

    static {
        bz bzVar = new bz();
        DEFAULT_INSTANCE = bzVar;
        com.google.v.du.registerDefaultInstance(bz.class, bzVar);
    }

    private bz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllControlPoint(Iterable<? extends bx> iterable) {
        ensureControlPointIsMutable();
        com.google.v.c.addAll(iterable, this.controlPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addControlPoint(int i2, bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureControlPointIsMutable();
        this.controlPoint_.add(i2, bxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControlPoint() {
        this.controlPoint_ = emptyProtobufList();
    }

    private void ensureControlPointIsMutable() {
        com.google.v.eo<bx> eoVar = this.controlPoint_;
        if (eoVar.c()) {
            return;
        }
        this.controlPoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bz parseDelimitedFrom(InputStream inputStream) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(com.google.v.v vVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeControlPoint(int i2) {
        ensureControlPointIsMutable();
        this.controlPoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControlPoint(int i2, bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureControlPointIsMutable();
        this.controlPoint_.set(i2, bxVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"controlPoint_", bx.class});
        }
        if (iOrdinal == 3) {
            return new bz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bz> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bz.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bx getControlPoint(int i2) {
        return this.controlPoint_.get(i2);
    }

    public int getControlPointCount() {
        return this.controlPoint_.size();
    }

    public List<bx> getControlPointList() {
        return this.controlPoint_;
    }

    public by getControlPointOrBuilder(int i2) {
        return this.controlPoint_.get(i2);
    }

    public List<? extends by> getControlPointOrBuilderList() {
        return this.controlPoint_;
    }

    public static bv newBuilder(bz bzVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bzVar);
    }

    public static bz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bz parseFrom(com.google.v.z zVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addControlPoint(bx bxVar) {
        Objects.requireNonNull(bxVar);
        ensureControlPointIsMutable();
        this.controlPoint_.add(bxVar);
    }

    public static bz parseFrom(InputStream inputStream) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bz parseFrom(ByteBuffer byteBuffer) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bz parseFrom(byte[] bArr) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
