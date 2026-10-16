package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class jp extends com.google.v.du<jp, jo> implements jq {
    public static final int ALTITUDE_METERS_FIELD_NUMBER = 2;
    private static final jp DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<jp> PARSER = null;
    public static final int POINT_FIELD_NUMBER = 1;
    private float altitudeMeters_;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private es point_;

    static {
        jp jpVar = new jp();
        DEFAULT_INSTANCE = jpVar;
        com.google.v.du.registerDefaultInstance(jp.class, jpVar);
    }

    private jp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitudeMeters() {
        this.bitField0_ &= -3;
        this.altitudeMeters_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoint() {
        this.point_ = null;
        this.bitField0_ &= -2;
    }

    public static jp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoint(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.point_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.point_ = esVar;
        this.bitField0_ |= 1;
    }

    public static jo newBuilder() {
        return (jo) DEFAULT_INSTANCE.createBuilder();
    }

    public static jp parseDelimitedFrom(InputStream inputStream) {
        return (jp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jp parseFrom(com.google.v.v vVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<jp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitudeMeters(float f2) {
        this.bitField0_ |= 2;
        this.altitudeMeters_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(es esVar) {
        Objects.requireNonNull(esVar);
        this.point_ = esVar;
        this.bitField0_ |= 1;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔁ\u0001", new Object[]{"bitField0_", "point_", "altitudeMeters_"});
            case 3:
                return new jp();
            case 4:
                return new jo(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<jp> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (jp.class) {
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

    public float getAltitudeMeters() {
        return this.altitudeMeters_;
    }

    public es getPoint() {
        es esVar = this.point_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public boolean hasAltitudeMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public static jo newBuilder(jp jpVar) {
        return (jo) DEFAULT_INSTANCE.createBuilder(jpVar);
    }

    public static jp parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jp) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jp parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static jp parseFrom(com.google.v.z zVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static jp parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static jp parseFrom(InputStream inputStream) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static jp parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static jp parseFrom(ByteBuffer byteBuffer) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static jp parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static jp parseFrom(byte[] bArr) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static jp parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (jp) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
