package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fz extends com.google.v.du<fz, fy> implements ga {
    public static final int BEGIN_FRACTION_FIELD_NUMBER = 3;
    private static final fz DEFAULT_INSTANCE;
    public static final int END_FRACTION_FIELD_NUMBER = 4;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fz> PARSER = null;
    public static final int SEGMENT_FIELD_NUMBER = 2;
    private double beginFraction_;
    private int bitField0_;
    private int index_;
    private com.google.k.a.a.b.bw segment_;
    private byte memoizedIsInitialized = 2;
    private double endFraction_ = 1.0d;

    static {
        fz fzVar = new fz();
        DEFAULT_INSTANCE = fzVar;
        com.google.v.du.registerDefaultInstance(fz.class, fzVar);
    }

    private fz() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginFraction() {
        this.bitField0_ &= -5;
        this.beginFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndFraction() {
        this.bitField0_ &= -9;
        this.endFraction_ = 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = null;
        this.bitField0_ &= -3;
    }

    public static fz getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.segment_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.segment_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static fy newBuilder() {
        return (fy) DEFAULT_INSTANCE.createBuilder();
    }

    public static fz parseDelimitedFrom(InputStream inputStream) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(com.google.v.v vVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fz> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginFraction(double d2) {
        this.bitField0_ |= 4;
        this.beginFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndFraction(double d2) {
        this.bitField0_ |= 8;
        this.endFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i2) {
        this.bitField0_ |= 1;
        this.index_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.segment_ = bwVar;
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003က\u0002\u0004က\u0003", new Object[]{"bitField0_", "index_", "segment_", "beginFraction_", "endFraction_"});
            case 3:
                return new fz();
            case 4:
                return new fy(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<fz> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (fz.class) {
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

    public double getBeginFraction() {
        return this.beginFraction_;
    }

    public double getEndFraction() {
        return this.endFraction_;
    }

    public int getIndex() {
        return this.index_;
    }

    public com.google.k.a.a.b.bw getSegment() {
        com.google.k.a.a.b.bw bwVar = this.segment_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public boolean hasBeginFraction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEndFraction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSegment() {
        return (this.bitField0_ & 2) != 0;
    }

    public static fy newBuilder(fz fzVar) {
        return (fy) DEFAULT_INSTANCE.createBuilder(fzVar);
    }

    public static fz parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fz parseFrom(com.google.v.z zVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fz parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fz parseFrom(InputStream inputStream) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fz parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fz parseFrom(ByteBuffer byteBuffer) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fz parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fz parseFrom(byte[] bArr) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fz parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fz) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
