package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gc extends com.google.v.du<gc, fw> implements com.google.v.fj {
    private static final gc DEFAULT_INSTANCE;
    public static final int GEOMETRY_SEGMENT_LOOP_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<gc> PARSER;
    private int bitField0_;
    private gb geometrySegmentLoop_;
    private byte memoizedIsInitialized = 2;

    static {
        gc gcVar = new gc();
        DEFAULT_INSTANCE = gcVar;
        com.google.v.du.registerDefaultInstance(gc.class, gcVar);
    }

    private gc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometrySegmentLoop() {
        this.geometrySegmentLoop_ = null;
        this.bitField0_ &= -2;
    }

    public static gc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometrySegmentLoop(gb gbVar) {
        Objects.requireNonNull(gbVar);
        gb gbVar2 = this.geometrySegmentLoop_;
        if (gbVar2 != null && gbVar2 != gb.getDefaultInstance()) {
            fx fxVarNewBuilder = gb.newBuilder(gbVar2);
            fxVarNewBuilder.mergeFrom((fx) gbVar);
            gbVar = fxVarNewBuilder.buildPartial();
        }
        this.geometrySegmentLoop_ = gbVar;
        this.bitField0_ |= 1;
    }

    public static fw newBuilder() {
        return (fw) DEFAULT_INSTANCE.createBuilder();
    }

    public static gc parseDelimitedFrom(InputStream inputStream) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(com.google.v.v vVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometrySegmentLoop(gb gbVar) {
        Objects.requireNonNull(gbVar);
        this.geometrySegmentLoop_ = gbVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"bitField0_", "geometrySegmentLoop_"});
            case 3:
                return new gc();
            case 4:
                return new fw(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gc> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gc.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public gb getGeometrySegmentLoop() {
        gb gbVar = this.geometrySegmentLoop_;
        return gbVar == null ? gb.getDefaultInstance() : gbVar;
    }

    public boolean hasGeometrySegmentLoop() {
        return (this.bitField0_ & 1) != 0;
    }

    public static fw newBuilder(gc gcVar) {
        return (fw) DEFAULT_INSTANCE.createBuilder(gcVar);
    }

    public static gc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gc parseFrom(com.google.v.z zVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gc parseFrom(InputStream inputStream) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gc parseFrom(ByteBuffer byteBuffer) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gc parseFrom(byte[] bArr) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
