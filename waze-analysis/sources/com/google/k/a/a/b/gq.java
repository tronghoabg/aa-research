package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gq extends com.google.v.du<gq, go> implements gr {
    private static final gq DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 6;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 7;
    public static final int MAJOR_POSITION_FIELD_NUMBER = 1;
    public static final int MINOR_POSITION_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<gq> PARSER = null;
    public static final int ROUTE_DIRECTION_FIELD_NUMBER = 8;
    public static final int SEMANTIC_TYPE_FIELD_NUMBER = 9;
    public static final int TEXT_FIELD_NUMBER = 4;
    private int bitField0_;
    private bw featureId_;
    private int featureType_;
    private int majorPosition_;
    private byte memoizedIsInitialized = 2;
    private int minorPosition_;
    private int routeDirection_;
    private int semanticType_;
    private eh text_;

    static {
        gq gqVar = new gq();
        DEFAULT_INSTANCE = gqVar;
        com.google.v.du.registerDefaultInstance(gq.class, gqVar);
    }

    private gq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureId() {
        this.featureId_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureType() {
        this.bitField0_ &= -33;
        this.featureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMajorPosition() {
        this.bitField0_ &= -2;
        this.majorPosition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinorPosition() {
        this.bitField0_ &= -3;
        this.minorPosition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDirection() {
        this.bitField0_ &= -65;
        this.routeDirection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSemanticType() {
        this.bitField0_ &= -5;
        this.semanticType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
        this.bitField0_ &= -9;
    }

    public static gq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureId_ = bwVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(eh ehVar) {
        Objects.requireNonNull(ehVar);
        eh ehVar2 = this.text_;
        if (ehVar2 != null && ehVar2 != eh.getDefaultInstance()) {
            ef efVarNewBuilder = eh.newBuilder(ehVar2);
            efVarNewBuilder.mergeFrom((ef) ehVar);
            ehVar = efVarNewBuilder.buildPartial();
        }
        this.text_ = ehVar;
        this.bitField0_ |= 8;
    }

    public static go newBuilder() {
        return (go) DEFAULT_INSTANCE.createBuilder();
    }

    public static gq parseDelimitedFrom(InputStream inputStream) {
        return (gq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gq parseFrom(com.google.v.v vVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<gq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureId_ = bwVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureType(int i2) {
        this.bitField0_ |= 32;
        this.featureType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMajorPosition(int i2) {
        this.bitField0_ |= 1;
        this.majorPosition_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinorPosition(int i2) {
        this.bitField0_ |= 2;
        this.minorPosition_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDirection(com.google.k.a.a.kt ktVar) {
        this.routeDirection_ = ktVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSemanticType(gp gpVar) {
        this.semanticType_ = gpVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.text_ = ehVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0002\u0001င\u0000\u0002င\u0001\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007င\u0005\b᠌\u0006\t᠌\u0002", new Object[]{"bitField0_", "majorPosition_", "minorPosition_", "text_", "featureId_", "featureType_", "routeDirection_", com.google.k.a.a.kt.b(), "semanticType_", dq.o});
            case 3:
                return new gq();
            case 4:
                return new go(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<gq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (gq.class) {
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

    public bw getFeatureId() {
        bw bwVar = this.featureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public int getFeatureType() {
        return this.featureType_;
    }

    public int getMajorPosition() {
        return this.majorPosition_;
    }

    public int getMinorPosition() {
        return this.minorPosition_;
    }

    public com.google.k.a.a.kt getRouteDirection() {
        com.google.k.a.a.kt ktVarA = com.google.k.a.a.kt.a(this.routeDirection_);
        return ktVarA == null ? com.google.k.a.a.kt.DIRECTION_NONE : ktVarA;
    }

    public gp getSemanticType() {
        gp gpVarA = gp.a(this.semanticType_);
        return gpVarA == null ? gp.ROAD_SIGN_SEMANTIC_TYPE_UNSPECIFIED : gpVarA;
    }

    public eh getText() {
        eh ehVar = this.text_;
        return ehVar == null ? eh.getDefaultInstance() : ehVar;
    }

    public boolean hasFeatureId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFeatureType() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMajorPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMinorPosition() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteDirection() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSemanticType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 8) != 0;
    }

    public static go newBuilder(gq gqVar) {
        return (go) DEFAULT_INSTANCE.createBuilder(gqVar);
    }

    public static gq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static gq parseFrom(com.google.v.z zVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static gq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static gq parseFrom(InputStream inputStream) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static gq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static gq parseFrom(ByteBuffer byteBuffer) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static gq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static gq parseFrom(byte[] bArr) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static gq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (gq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
