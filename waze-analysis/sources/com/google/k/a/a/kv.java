package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kv extends com.google.v.du<kv, ku> implements kw {
    private static final kv DEFAULT_INSTANCE;
    public static final int END_FRACTION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<kv> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 1;
    public static final int START_FRACTION_FIELD_NUMBER = 2;
    private int bitField0_;
    private com.google.k.a.a.b.bw segmentId_;
    private double startFraction_;
    private byte memoizedIsInitialized = 2;
    private double endFraction_ = 1.0d;

    static {
        kv kvVar = new kv();
        DEFAULT_INSTANCE = kvVar;
        com.google.v.du.registerDefaultInstance(kv.class, kvVar);
    }

    private kv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndFraction() {
        this.bitField0_ &= -5;
        this.endFraction_ = 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.segmentId_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartFraction() {
        this.bitField0_ &= -3;
        this.startFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static kv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.segmentId_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.segmentId_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static ku newBuilder() {
        return (ku) DEFAULT_INSTANCE.createBuilder();
    }

    public static kv parseDelimitedFrom(InputStream inputStream) {
        return (kv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kv parseFrom(com.google.v.v vVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<kv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndFraction(double d2) {
        this.bitField0_ |= 4;
        this.endFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.segmentId_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartFraction(double d2) {
        this.bitField0_ |= 2;
        this.startFraction_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"bitField0_", "segmentId_", "startFraction_", "endFraction_"});
            case 3:
                return new kv();
            case 4:
                return new ku(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<kv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (kv.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public double getEndFraction() {
        return this.endFraction_;
    }

    public com.google.k.a.a.b.bw getSegmentId() {
        com.google.k.a.a.b.bw bwVar = this.segmentId_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public double getStartFraction() {
        return this.startFraction_;
    }

    public boolean hasEndFraction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartFraction() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ku newBuilder(kv kvVar) {
        return (ku) DEFAULT_INSTANCE.createBuilder(kvVar);
    }

    public static kv parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kv parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static kv parseFrom(com.google.v.z zVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static kv parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static kv parseFrom(InputStream inputStream) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static kv parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static kv parseFrom(ByteBuffer byteBuffer) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static kv parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static kv parseFrom(byte[] bArr) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static kv parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (kv) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
