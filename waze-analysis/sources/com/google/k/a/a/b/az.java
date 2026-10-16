package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class az extends com.google.v.du<az, ay> implements com.google.v.fj {
    public static final int AVERAGE_ELEVATION_METERS_FIELD_NUMBER = 1;
    private static final az DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<az> PARSER = null;
    public static final int PEAK_FIELD_NUMBER = 3;
    private double averageElevationMeters_;
    private int bitField0_;
    private en peak_;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageElevationMeters() {
        this.bitField0_ &= -2;
        this.averageElevationMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeak() {
        this.peak_ = null;
        this.bitField0_ &= -3;
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePeak(en enVar) {
        Objects.requireNonNull(enVar);
        en enVar2 = this.peak_;
        if (enVar2 != null && enVar2 != en.getDefaultInstance()) {
            em emVarNewBuilder = en.newBuilder(enVar2);
            emVarNewBuilder.mergeFrom((em) enVar);
            enVar = emVarNewBuilder.buildPartial();
        }
        this.peak_ = enVar;
        this.bitField0_ |= 2;
    }

    public static ay newBuilder() {
        return (ay) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageElevationMeters(double d2) {
        this.bitField0_ |= 1;
        this.averageElevationMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeak(en enVar) {
        Objects.requireNonNull(enVar);
        this.peak_ = enVar;
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001က\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "averageElevationMeters_", "peak_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAverageElevationMeters() {
        return this.averageElevationMeters_;
    }

    public en getPeak() {
        en enVar = this.peak_;
        return enVar == null ? en.getDefaultInstance() : enVar;
    }

    public boolean hasAverageElevationMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPeak() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ay newBuilder(az azVar) {
        return (ay) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
