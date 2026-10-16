package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class im extends com.google.v.du<im, il> implements in {
    private static final im DEFAULT_INSTANCE;
    public static final int OTHER_SEGMENT_FEATURE_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<im> PARSER = null;
    public static final int POLYGON_FIELD_NUMBER = 1;
    public static final int SWEEP_CURVE_FIELD_NUMBER = 3;
    public static final int SWEEP_TOKEN_FIELD_NUMBER = 16;
    private int bitField0_;
    private bw otherSegmentFeatureId_;
    private ex polygon_;
    private com.google.k.a.a.cf sweepCurve_;
    private byte memoizedIsInitialized = 2;
    private String sweepToken_ = "";

    static {
        im imVar = new im();
        DEFAULT_INSTANCE = imVar;
        com.google.v.du.registerDefaultInstance(im.class, imVar);
    }

    private im() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherSegmentFeatureId() {
        this.otherSegmentFeatureId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSweepCurve() {
        this.sweepCurve_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSweepToken() {
        this.bitField0_ &= -9;
        this.sweepToken_ = getDefaultInstance().getSweepToken();
    }

    public static im getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOtherSegmentFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.otherSegmentFeatureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.otherSegmentFeatureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygon(ex exVar) {
        Objects.requireNonNull(exVar);
        ex exVar2 = this.polygon_;
        if (exVar2 != null && exVar2 != ex.getDefaultInstance()) {
            ew ewVarNewBuilder = ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.polygon_ = exVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSweepCurve(com.google.k.a.a.cf cfVar) {
        Objects.requireNonNull(cfVar);
        com.google.k.a.a.cf cfVar2 = this.sweepCurve_;
        if (cfVar2 != null && cfVar2 != com.google.k.a.a.cf.getDefaultInstance()) {
            com.google.k.a.a.ca caVarNewBuilder = com.google.k.a.a.cf.newBuilder(cfVar2);
            caVarNewBuilder.mergeFrom((com.google.k.a.a.ca) cfVar);
            cfVar = caVarNewBuilder.buildPartial();
        }
        this.sweepCurve_ = cfVar;
        this.bitField0_ |= 4;
    }

    public static il newBuilder() {
        return (il) DEFAULT_INSTANCE.createBuilder();
    }

    public static im parseDelimitedFrom(InputStream inputStream) {
        return (im) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static im parseFrom(com.google.v.v vVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<im> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherSegmentFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.otherSegmentFeatureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(ex exVar) {
        Objects.requireNonNull(exVar);
        this.polygon_ = exVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSweepCurve(com.google.k.a.a.cf cfVar) {
        Objects.requireNonNull(cfVar);
        this.sweepCurve_ = cfVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSweepToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.sweepToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSweepTokenBytes(com.google.v.v vVar) {
        this.sweepToken_ = vVar.u();
        this.bitField0_ |= 8;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0010ဈ\u0003", new Object[]{"bitField0_", "polygon_", "otherSegmentFeatureId_", "sweepCurve_", "sweepToken_"});
            case 3:
                return new im();
            case 4:
                return new il(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<im> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (im.class) {
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

    public bw getOtherSegmentFeatureId() {
        bw bwVar = this.otherSegmentFeatureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public ex getPolygon() {
        ex exVar = this.polygon_;
        return exVar == null ? ex.getDefaultInstance() : exVar;
    }

    public com.google.k.a.a.cf getSweepCurve() {
        com.google.k.a.a.cf cfVar = this.sweepCurve_;
        return cfVar == null ? com.google.k.a.a.cf.getDefaultInstance() : cfVar;
    }

    public String getSweepToken() {
        return this.sweepToken_;
    }

    public com.google.v.v getSweepTokenBytes() {
        return com.google.v.v.s(this.sweepToken_);
    }

    public boolean hasOtherSegmentFeatureId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPolygon() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSweepCurve() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSweepToken() {
        return (this.bitField0_ & 8) != 0;
    }

    public static il newBuilder(im imVar) {
        return (il) DEFAULT_INSTANCE.createBuilder(imVar);
    }

    public static im parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (im) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static im parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static im parseFrom(com.google.v.z zVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static im parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static im parseFrom(InputStream inputStream) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static im parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static im parseFrom(ByteBuffer byteBuffer) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static im parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static im parseFrom(byte[] bArr) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static im parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (im) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
