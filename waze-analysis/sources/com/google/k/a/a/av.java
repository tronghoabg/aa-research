package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class av extends com.google.v.du<av, au> implements com.google.v.fj {
    private static final av DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<av> PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;
    public static final int Z_FIELD_NUMBER = 3;
    private int bitField0_;
    private double x_;
    private double y_;
    private double z_;

    static {
        av avVar = new av();
        DEFAULT_INSTANCE = avVar;
        com.google.v.du.registerDefaultInstance(av.class, avVar);
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearX() {
        this.bitField0_ &= -2;
        this.x_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearY() {
        this.bitField0_ &= -3;
        this.y_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearZ() {
        this.bitField0_ &= -5;
        this.z_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static av getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static au newBuilder() {
        return (au) DEFAULT_INSTANCE.createBuilder();
    }

    public static av parseDelimitedFrom(InputStream inputStream) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(com.google.v.v vVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<av> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX(double d2) {
        this.bitField0_ |= 1;
        this.x_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setY(double d2) {
        this.bitField0_ |= 2;
        this.y_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setZ(double d2) {
        this.bitField0_ |= 4;
        this.z_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"bitField0_", "x_", "y_", "z_"});
        }
        if (iOrdinal == 3) {
            return new av();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new au(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<av> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (av.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getX() {
        return this.x_;
    }

    public double getY() {
        return this.y_;
    }

    public double getZ() {
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

    public static au newBuilder(av avVar) {
        return (au) DEFAULT_INSTANCE.createBuilder(avVar);
    }

    public static av parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static av parseFrom(com.google.v.z zVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static av parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static av parseFrom(InputStream inputStream) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static av parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static av parseFrom(ByteBuffer byteBuffer) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static av parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static av parseFrom(byte[] bArr) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static av parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (av) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
