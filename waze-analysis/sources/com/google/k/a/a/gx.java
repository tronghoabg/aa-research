package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gx extends com.google.v.du<gx, gw> implements gy {
    public static final int ALTITUDE_FIELD_NUMBER = 4;
    private static final gx DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int LAT_FIELD_NUMBER = 2;
    public static final int LNG_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<gx> PARSER = null;
    public static final int PITCH_FIELD_NUMBER = 6;
    public static final int ROLL_FIELD_NUMBER = 7;
    public static final int YAW_FIELD_NUMBER = 5;
    private double altitude_;
    private int bitField0_;
    private int index_;
    private double lat_;
    private double lng_;
    private double pitch_;
    private double roll_;
    private double yaw_;

    static {
        gx gxVar = new gx();
        DEFAULT_INSTANCE = gxVar;
        com.google.v.du.registerDefaultInstance(gx.class, gxVar);
    }

    private gx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitude() {
        this.bitField0_ &= -9;
        this.altitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLat() {
        this.bitField0_ &= -3;
        this.lat_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLng() {
        this.bitField0_ &= -5;
        this.lng_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPitch() {
        this.bitField0_ &= -33;
        this.pitch_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoll() {
        this.bitField0_ &= -65;
        this.roll_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearYaw() {
        this.bitField0_ &= -17;
        this.yaw_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static gx getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static gw newBuilder() {
        return (gw) DEFAULT_INSTANCE.createBuilder();
    }

    public static gx parseDelimitedFrom(InputStream inputStream) {
        return (gx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gx parseFrom(com.google.v.v vVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitude(double d2) {
        this.bitField0_ |= 8;
        this.altitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 1;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLat(double d2) {
        this.bitField0_ |= 2;
        this.lat_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLng(double d2) {
        this.bitField0_ |= 4;
        this.lng_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPitch(double d2) {
        this.bitField0_ |= 32;
        this.pitch_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoll(double d2) {
        this.bitField0_ |= 64;
        this.roll_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYaw(double d2) {
        this.bitField0_ |= 16;
        this.yaw_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006", new Object[]{"bitField0_", "index_", "lat_", "lng_", "altitude_", "yaw_", "pitch_", "roll_"});
        }
        if (iOrdinal == 3) {
            return new gx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<gx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (gx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAltitude() {
        return this.altitude_;
    }

    public int getIndex() {
        return this.index_;
    }

    public double getLat() {
        return this.lat_;
    }

    public double getLng() {
        return this.lng_;
    }

    public double getPitch() {
        return this.pitch_;
    }

    public double getRoll() {
        return this.roll_;
    }

    public double getYaw() {
        return this.yaw_;
    }

    public boolean hasAltitude() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLat() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLng() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPitch() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRoll() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasYaw() {
        return (this.bitField0_ & 16) != 0;
    }

    public static gw newBuilder(gx gxVar) {
        return (gw) DEFAULT_INSTANCE.createBuilder(gxVar);
    }

    public static gx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gx parseFrom(com.google.v.z zVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gx parseFrom(InputStream inputStream) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gx parseFrom(ByteBuffer byteBuffer) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gx parseFrom(byte[] bArr) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
