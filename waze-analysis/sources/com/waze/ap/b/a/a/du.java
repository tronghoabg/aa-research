package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class du extends com.google.v.du<du, dt> implements fj {
    private static final du DEFAULT_INSTANCE;
    private static volatile fo<du> PARSER = null;
    public static final int SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private cu segmentationConfiguration_;

    static {
        du duVar = new du();
        DEFAULT_INSTANCE = duVar;
        com.google.v.du.registerDefaultInstance(du.class, duVar);
    }

    private du() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentationConfiguration() {
        this.segmentationConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static du getDefaultInstance() {
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

    public static dt newBuilder() {
        return (dt) DEFAULT_INSTANCE.createBuilder();
    }

    public static du parseDelimitedFrom(InputStream inputStream) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(com.google.v.v vVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<du> parser() {
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
            return new du();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dt(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<du> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (du.class) {
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

    public static dt newBuilder(du duVar) {
        return (dt) DEFAULT_INSTANCE.createBuilder(duVar);
    }

    public static du parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static du parseFrom(com.google.v.z zVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static du parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static du parseFrom(InputStream inputStream) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static du parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static du parseFrom(ByteBuffer byteBuffer) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static du parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static du parseFrom(byte[] bArr) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static du parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (du) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
