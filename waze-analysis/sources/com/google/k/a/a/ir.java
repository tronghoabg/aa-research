package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ir extends com.google.v.du<ir, iq> implements com.google.v.fj {
    private static final ir DEFAULT_INSTANCE;
    public static final int ORIGINAL_HEIGHT_PX_FIELD_NUMBER = 2;
    public static final int ORIGINAL_WIDTH_PX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ir> PARSER;
    private int bitField0_;
    private int originalHeightPx_;
    private int originalWidthPx_;

    static {
        ir irVar = new ir();
        DEFAULT_INSTANCE = irVar;
        com.google.v.du.registerDefaultInstance(ir.class, irVar);
    }

    private ir() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalHeightPx() {
        this.bitField0_ &= -3;
        this.originalHeightPx_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalWidthPx() {
        this.bitField0_ &= -2;
        this.originalWidthPx_ = 0;
    }

    public static ir getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static iq newBuilder() {
        return (iq) DEFAULT_INSTANCE.createBuilder();
    }

    public static ir parseDelimitedFrom(InputStream inputStream) {
        return (ir) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ir parseFrom(com.google.v.v vVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ir> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalHeightPx(int i2) {
        this.bitField0_ |= 2;
        this.originalHeightPx_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalWidthPx(int i2) {
        this.bitField0_ |= 1;
        this.originalWidthPx_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "originalWidthPx_", "originalHeightPx_"});
        }
        if (iOrdinal == 3) {
            return new ir();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new iq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ir> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ir.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getOriginalHeightPx() {
        return this.originalHeightPx_;
    }

    public int getOriginalWidthPx() {
        return this.originalWidthPx_;
    }

    public boolean hasOriginalHeightPx() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOriginalWidthPx() {
        return (this.bitField0_ & 1) != 0;
    }

    public static iq newBuilder(ir irVar) {
        return (iq) DEFAULT_INSTANCE.createBuilder(irVar);
    }

    public static ir parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ir) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ir parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ir parseFrom(com.google.v.z zVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ir parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ir parseFrom(InputStream inputStream) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ir parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ir parseFrom(ByteBuffer byteBuffer) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ir parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ir parseFrom(byte[] bArr) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ir parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ir) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
