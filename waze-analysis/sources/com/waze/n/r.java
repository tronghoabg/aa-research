package com.waze.n;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends du<r, q> implements fj {
    private static final r DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile fo<r> PARSER;
    private int bitField0_;
    private double latitude_;
    private double longitude_;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.bitField0_ &= -2;
        this.latitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.bitField0_ &= -3;
        this.longitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d2) {
        this.bitField0_ |= 1;
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d2) {
        this.bitField0_ |= 2;
        this.longitude_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "latitude_", "longitude_"});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public boolean hasLatitude() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLongitude() {
        return (this.bitField0_ & 2) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
