package com.google.k.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.google.v.du<bf, be> implements com.google.v.fj {
    private static final bf DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bf> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private int bitField0_;
    private float x_;
    private float y_;
    private float z_;

    static {
        bf bfVar = new bf();
        DEFAULT_INSTANCE = bfVar;
        com.google.v.du.registerDefaultInstance(bf.class, bfVar);
    }

    private bf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.bitField0_ &= -2;
        this.x_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.bitField0_ &= -3;
        this.y_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.bitField0_ &= -5;
        this.z_ = 0.0f;
    }

    public static bf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bf parseDelimitedFrom(InputStream inputStream) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(com.google.v.v vVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(float f2) {
        this.bitField0_ |= 1;
        this.x_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(float f2) {
        this.bitField0_ |= 2;
        this.y_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(float f2) {
        this.bitField0_ |= 4;
        this.z_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"bitField0_", "x_", "y_", "z_"});
        }
        if (iOrdinal == 3) {
            return new bf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public float getX() {
        return this.x_;
    }

    public float getY() {
        return this.y_;
    }

    public float getZ() {
        return this.z_;
    }

    public boolean hasX() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasY() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasZ() {
        return (this.bitField0_ & 4) != 0;
    }

    public static be newBuilder(bf bfVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bfVar);
    }

    public static bf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bf parseFrom(com.google.v.z zVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bf parseFrom(InputStream inputStream) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(ByteBuffer byteBuffer) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bf parseFrom(byte[] bArr) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
