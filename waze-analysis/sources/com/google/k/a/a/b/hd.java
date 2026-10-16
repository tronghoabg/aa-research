package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hd extends com.google.v.du<hd, hb> implements he {
    private static final hd DEFAULT_INSTANCE;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 2;
    public static final int LANDMARK_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<hd> PARSER = null;
    public static final int TRAVEL_MODE_FIELD_NUMBER = 3;
    private static final com.google.v.el<hc> travelMode_converter_ = new ee(4);
    private int bitField0_;
    private int featureType_;
    private bw landmark_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.ek travelMode_ = emptyIntList();

    static {
        hd hdVar = new hd();
        DEFAULT_INSTANCE = hdVar;
        com.google.v.du.registerDefaultInstance(hd.class, hdVar);
    }

    private hd() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTravelMode(Iterable<? extends hc> iterable) {
        ensureTravelModeIsMutable();
        Iterator<? extends hc> it = iterable.iterator();
        while (it.hasNext()) {
            this.travelMode_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTravelMode(hc hcVar) {
        Objects.requireNonNull(hcVar);
        ensureTravelModeIsMutable();
        this.travelMode_.i(hcVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureType() {
        this.bitField0_ &= -3;
        this.featureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandmark() {
        this.landmark_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelMode() {
        this.travelMode_ = emptyIntList();
    }

    private void ensureTravelModeIsMutable() {
        com.google.v.ek ekVar = this.travelMode_;
        if (ekVar.c()) {
            return;
        }
        this.travelMode_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static hd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLandmark(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.landmark_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.landmark_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static hb newBuilder() {
        return (hb) DEFAULT_INSTANCE.createBuilder();
    }

    public static hd parseDelimitedFrom(InputStream inputStream) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(com.google.v.v vVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hd> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureType(int i2) {
        this.bitField0_ |= 2;
        this.featureType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandmark(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.landmark_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelMode(int i2, hc hcVar) {
        Objects.requireNonNull(hcVar);
        ensureTravelModeIsMutable();
        this.travelMode_.e(i2, hcVar.getNumber());
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ࠞ", new Object[]{"bitField0_", "landmark_", "featureType_", "travelMode_", dq.r});
            case 3:
                return new hd();
            case 4:
                return new hb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<hd> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (hd.class) {
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

    public int getFeatureType() {
        return this.featureType_;
    }

    public bw getLandmark() {
        bw bwVar = this.landmark_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public hc getTravelMode(int i2) {
        hc hcVarA = hc.a(this.travelMode_.d(i2));
        return hcVarA == null ? hc.UNKNOWN : hcVarA;
    }

    public int getTravelModeCount() {
        return this.travelMode_.size();
    }

    public List<hc> getTravelModeList() {
        return new com.google.v.em(this.travelMode_, travelMode_converter_);
    }

    public boolean hasFeatureType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLandmark() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hb newBuilder(hd hdVar) {
        return (hb) DEFAULT_INSTANCE.createBuilder(hdVar);
    }

    public static hd parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hd parseFrom(com.google.v.z zVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hd parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hd parseFrom(InputStream inputStream) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hd parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hd parseFrom(ByteBuffer byteBuffer) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hd parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hd parseFrom(byte[] bArr) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hd parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hd) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
