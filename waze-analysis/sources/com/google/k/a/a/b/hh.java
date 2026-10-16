package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hh extends com.google.v.du<hh, hf> implements hi {
    public static final int BARRIER_TYPE_FIELD_NUMBER = 2;
    private static final hh DEFAULT_INSTANCE;
    public static final int END_FRACTION_FIELD_NUMBER = 4;
    public static final int IS_REGULARLY_MOVED_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<hh> PARSER = null;
    public static final int ROAD_BARRIER_ID_FIELD_NUMBER = 1;
    public static final int START_FRACTION_FIELD_NUMBER = 3;
    private int barrierType_;
    private int bitField0_;
    private double endFraction_ = 1.0d;
    private boolean isRegularlyMoved_;
    private long roadBarrierId_;
    private double startFraction_;

    static {
        hh hhVar = new hh();
        DEFAULT_INSTANCE = hhVar;
        com.google.v.du.registerDefaultInstance(hh.class, hhVar);
    }

    private hh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBarrierType() {
        this.bitField0_ &= -3;
        this.barrierType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndFraction() {
        this.bitField0_ &= -17;
        this.endFraction_ = 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRegularlyMoved() {
        this.bitField0_ &= -5;
        this.isRegularlyMoved_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadBarrierId() {
        this.bitField0_ &= -2;
        this.roadBarrierId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartFraction() {
        this.bitField0_ &= -9;
        this.startFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static hh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hf newBuilder() {
        return (hf) DEFAULT_INSTANCE.createBuilder();
    }

    public static hh parseDelimitedFrom(InputStream inputStream) {
        return (hh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hh parseFrom(com.google.v.v vVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarrierType(hg hgVar) {
        this.barrierType_ = hgVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndFraction(double d2) {
        this.bitField0_ |= 16;
        this.endFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRegularlyMoved(boolean z) {
        this.bitField0_ |= 4;
        this.isRegularlyMoved_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadBarrierId(long j2) {
        this.bitField0_ |= 1;
        this.roadBarrierId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartFraction(double d2) {
        this.bitField0_ |= 8;
        this.startFraction_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002᠌\u0001\u0003က\u0003\u0004က\u0004\u0005ဇ\u0002", new Object[]{"bitField0_", "roadBarrierId_", "barrierType_", dq.s, "startFraction_", "endFraction_", "isRegularlyMoved_"});
        }
        if (iOrdinal == 3) {
            return new hh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hf(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public hg getBarrierType() {
        hg hgVarA = hg.a(this.barrierType_);
        return hgVarA == null ? hg.ROAD_BARRIER_UNSPECIFIED : hgVarA;
    }

    public double getEndFraction() {
        return this.endFraction_;
    }

    public boolean getIsRegularlyMoved() {
        return this.isRegularlyMoved_;
    }

    public long getRoadBarrierId() {
        return this.roadBarrierId_;
    }

    public double getStartFraction() {
        return this.startFraction_;
    }

    public boolean hasBarrierType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEndFraction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsRegularlyMoved() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRoadBarrierId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartFraction() {
        return (this.bitField0_ & 8) != 0;
    }

    public static hf newBuilder(hh hhVar) {
        return (hf) DEFAULT_INSTANCE.createBuilder(hhVar);
    }

    public static hh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hh parseFrom(com.google.v.z zVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hh parseFrom(InputStream inputStream) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hh parseFrom(ByteBuffer byteBuffer) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hh parseFrom(byte[] bArr) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
