package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dy extends com.google.v.du<dy, dx> implements fj {
    private static final dy DEFAULT_INSTANCE;
    private static volatile fo<dy> PARSER = null;
    public static final int SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private cu segmentationConfiguration_;

    static {
        dy dyVar = new dy();
        DEFAULT_INSTANCE = dyVar;
        com.google.v.du.registerDefaultInstance(dy.class, dyVar);
    }

    private dy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentationConfiguration() {
        this.segmentationConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static dy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentationConfiguration(cu cuVar) {
        Objects.requireNonNull(cuVar);
        cu cuVar2 = this.segmentationConfiguration_;
        if (cuVar2 != null && cuVar2 != cu.getDefaultInstance()) {
            ct ctVarNewBuilder = cu.newBuilder(cuVar2);
            ctVarNewBuilder.mergeFrom((ct) cuVar);
            cuVar = ctVarNewBuilder.buildPartial();
        }
        this.segmentationConfiguration_ = cuVar;
        this.bitField0_ |= 1;
    }

    public static dx newBuilder() {
        return (dx) DEFAULT_INSTANCE.createBuilder();
    }

    public static dy parseDelimitedFrom(InputStream inputStream) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(com.google.v.v vVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentationConfiguration(cu cuVar) {
        Objects.requireNonNull(cuVar);
        this.segmentationConfiguration_ = cuVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "segmentationConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new dy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public cu getSegmentationConfiguration() {
        cu cuVar = this.segmentationConfiguration_;
        return cuVar == null ? cu.getDefaultInstance() : cuVar;
    }

    public boolean hasSegmentationConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dx newBuilder(dy dyVar) {
        return (dx) DEFAULT_INSTANCE.createBuilder(dyVar);
    }

    public static dy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dy parseFrom(com.google.v.z zVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dy parseFrom(InputStream inputStream) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dy parseFrom(ByteBuffer byteBuffer) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dy parseFrom(byte[] bArr) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
