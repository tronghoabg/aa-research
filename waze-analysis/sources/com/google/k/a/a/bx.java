package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bx extends com.google.v.du<bx, bw> implements by {
    public static final int ANGLE_DEGREES_FIELD_NUMBER = 1;
    private static final bx DEFAULT_INSTANCE;
    public static final int DISTANCE_MULTIPLIER_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<bx> PARSER;
    private double angleDegrees_;
    private int bitField0_;
    private double distanceMultiplier_;

    static {
        bx bxVar = new bx();
        DEFAULT_INSTANCE = bxVar;
        com.google.v.du.registerDefaultInstance(bx.class, bxVar);
    }

    private bx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAngleDegrees() {
        this.bitField0_ &= -2;
        this.angleDegrees_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceMultiplier() {
        this.bitField0_ &= -3;
        this.distanceMultiplier_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static bx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bw newBuilder() {
        return (bw) DEFAULT_INSTANCE.createBuilder();
    }

    public static bx parseDelimitedFrom(InputStream inputStream) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(com.google.v.v vVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleDegrees(double d2) {
        this.bitField0_ |= 1;
        this.angleDegrees_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceMultiplier(double d2) {
        this.bitField0_ |= 2;
        this.distanceMultiplier_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "angleDegrees_", "distanceMultiplier_"});
        }
        if (iOrdinal == 3) {
            return new bx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAngleDegrees() {
        return this.angleDegrees_;
    }

    public double getDistanceMultiplier() {
        return this.distanceMultiplier_;
    }

    public boolean hasAngleDegrees() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDistanceMultiplier() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bw newBuilder(bx bxVar) {
        return (bw) DEFAULT_INSTANCE.createBuilder(bxVar);
    }

    public static bx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bx parseFrom(com.google.v.z zVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bx parseFrom(InputStream inputStream) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bx parseFrom(ByteBuffer byteBuffer) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bx parseFrom(byte[] bArr) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
