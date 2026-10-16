package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends com.google.v.du<bp, bo> implements com.google.v.fj {
    private static final bp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bp> PARSER = null;
    public static final int POINT_CURVATURE_FIELD_NUMBER = 1;
    private com.google.v.eo<bt> pointCurvature_ = emptyProtobufList();

    static {
        bp bpVar = new bp();
        DEFAULT_INSTANCE = bpVar;
        com.google.v.du.registerDefaultInstance(bp.class, bpVar);
    }

    private bp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPointCurvature(Iterable<? extends bt> iterable) {
        ensurePointCurvatureIsMutable();
        com.google.v.c.addAll(iterable, this.pointCurvature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPointCurvature(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensurePointCurvatureIsMutable();
        this.pointCurvature_.add(i2, btVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointCurvature() {
        this.pointCurvature_ = emptyProtobufList();
    }

    private void ensurePointCurvatureIsMutable() {
        com.google.v.eo<bt> eoVar = this.pointCurvature_;
        if (eoVar.c()) {
            return;
        }
        this.pointCurvature_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bo newBuilder() {
        return (bo) DEFAULT_INSTANCE.createBuilder();
    }

    public static bp parseDelimitedFrom(InputStream inputStream) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(com.google.v.v vVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePointCurvature(int i2) {
        ensurePointCurvatureIsMutable();
        this.pointCurvature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointCurvature(int i2, bt btVar) {
        Objects.requireNonNull(btVar);
        ensurePointCurvatureIsMutable();
        this.pointCurvature_.set(i2, btVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"pointCurvature_", bt.class});
        }
        if (iOrdinal == 3) {
            return new bp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bo(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bp> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bp.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bt getPointCurvature(int i2) {
        return this.pointCurvature_.get(i2);
    }

    public int getPointCurvatureCount() {
        return this.pointCurvature_.size();
    }

    public List<bt> getPointCurvatureList() {
        return this.pointCurvature_;
    }

    public bu getPointCurvatureOrBuilder(int i2) {
        return this.pointCurvature_.get(i2);
    }

    public List<? extends bu> getPointCurvatureOrBuilderList() {
        return this.pointCurvature_;
    }

    public static bo newBuilder(bp bpVar) {
        return (bo) DEFAULT_INSTANCE.createBuilder(bpVar);
    }

    public static bp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bp parseFrom(com.google.v.z zVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPointCurvature(bt btVar) {
        Objects.requireNonNull(btVar);
        ensurePointCurvatureIsMutable();
        this.pointCurvature_.add(btVar);
    }

    public static bp parseFrom(InputStream inputStream) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bp parseFrom(ByteBuffer byteBuffer) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bp parseFrom(byte[] bArr) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
