package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gm extends com.google.v.du<gm, gl> implements gn {
    public static final int ASSOCIATED_PARKING_FEATURE_FIELD_NUMBER = 1;
    private static final gm DEFAULT_INSTANCE;
    public static final int IS_ONSITE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<gm> PARSER;
    private com.google.k.a.a.b.bw associatedParkingFeature_;
    private int bitField0_;
    private boolean isOnsite_;
    private byte memoizedIsInitialized = 2;

    static {
        gm gmVar = new gm();
        DEFAULT_INSTANCE = gmVar;
        com.google.v.du.registerDefaultInstance(gm.class, gmVar);
    }

    private gm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssociatedParkingFeature() {
        this.associatedParkingFeature_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOnsite() {
        this.bitField0_ &= -3;
        this.isOnsite_ = false;
    }

    public static gm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAssociatedParkingFeature(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        com.google.k.a.a.b.bw bwVar2 = this.associatedParkingFeature_;
        if (bwVar2 != null && bwVar2 != com.google.k.a.a.b.bw.getDefaultInstance()) {
            com.google.k.a.a.b.bv bvVarNewBuilder = com.google.k.a.a.b.bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((com.google.k.a.a.b.bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.associatedParkingFeature_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static gl newBuilder() {
        return (gl) DEFAULT_INSTANCE.createBuilder();
    }

    public static gm parseDelimitedFrom(InputStream inputStream) {
        return (gm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gm parseFrom(com.google.v.v vVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssociatedParkingFeature(com.google.k.a.a.b.bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.associatedParkingFeature_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnsite(boolean z) {
        this.bitField0_ |= 2;
        this.isOnsite_ = z;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "associatedParkingFeature_", "isOnsite_"});
            case 3:
                return new gm();
            case 4:
                return new gl(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gm> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gm.class) {
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

    public com.google.k.a.a.b.bw getAssociatedParkingFeature() {
        com.google.k.a.a.b.bw bwVar = this.associatedParkingFeature_;
        return bwVar == null ? com.google.k.a.a.b.bw.getDefaultInstance() : bwVar;
    }

    public boolean getIsOnsite() {
        return this.isOnsite_;
    }

    public boolean hasAssociatedParkingFeature() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsOnsite() {
        return (this.bitField0_ & 2) != 0;
    }

    public static gl newBuilder(gm gmVar) {
        return (gl) DEFAULT_INSTANCE.createBuilder(gmVar);
    }

    public static gm parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gm) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gm parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gm parseFrom(com.google.v.z zVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gm parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gm parseFrom(InputStream inputStream) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gm parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gm parseFrom(ByteBuffer byteBuffer) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gm parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gm parseFrom(byte[] bArr) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gm parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gm) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
