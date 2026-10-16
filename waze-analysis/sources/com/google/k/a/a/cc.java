package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cc extends com.google.v.du<cc, cb> implements com.google.v.fj {
    private static final cc DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<cc> PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private double radius_;

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        com.google.v.du.registerDefaultInstance(cc.class, ccVar);
    }

    private cc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadius() {
        this.bitField0_ &= -2;
        this.radius_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static cc getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cb newBuilder() {
        return (cb) DEFAULT_INSTANCE.createBuilder();
    }

    public static cc parseDelimitedFrom(InputStream inputStream) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(com.google.v.v vVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cc> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadius(double d2) {
        this.bitField0_ |= 1;
        this.radius_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"bitField0_", "radius_"});
        }
        if (iOrdinal == 3) {
            return new cc();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cc> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cc.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getRadius() {
        return this.radius_;
    }

    public boolean hasRadius() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cb newBuilder(cc ccVar) {
        return (cb) DEFAULT_INSTANCE.createBuilder(ccVar);
    }

    public static cc parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cc parseFrom(com.google.v.z zVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cc parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cc parseFrom(InputStream inputStream) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cc parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cc parseFrom(ByteBuffer byteBuffer) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cc parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cc parseFrom(byte[] bArr) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cc parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cc) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
