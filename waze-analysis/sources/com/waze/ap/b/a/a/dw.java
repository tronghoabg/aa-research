package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dw extends com.google.v.du<dw, dv> implements fj {
    private static final dw DEFAULT_INSTANCE;
    private static volatile fo<dw> PARSER = null;
    public static final int SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 1;
    private int bitField0_;
    private cu segmentationConfiguration_;

    static {
        dw dwVar = new dw();
        DEFAULT_INSTANCE = dwVar;
        com.google.v.du.registerDefaultInstance(dw.class, dwVar);
    }

    private dw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentationConfiguration() {
        this.segmentationConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    public static dw getDefaultInstance() {
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

    public static dv newBuilder() {
        return (dv) DEFAULT_INSTANCE.createBuilder();
    }

    public static dw parseDelimitedFrom(InputStream inputStream) {
        return (dw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dw parseFrom(com.google.v.v vVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<dw> parser() {
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
            return new dw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<dw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dw.class) {
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

    public static dv newBuilder(dw dwVar) {
        return (dv) DEFAULT_INSTANCE.createBuilder(dwVar);
    }

    public static dw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dw parseFrom(com.google.v.z zVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dw parseFrom(InputStream inputStream) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dw parseFrom(ByteBuffer byteBuffer) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dw parseFrom(byte[] bArr) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
