package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ej extends com.google.v.du<ej, ei> implements ek {
    private static final ej DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ej> PARSER = null;
    public static final int POLYGON_TO_ADD_FIELD_NUMBER = 2;
    public static final int POLYGON_TO_SUBTRACT_FIELD_NUMBER = 3;
    public static final int REGION_CODE_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.k.a.a.b.ex polygonToAdd_;
    private com.google.k.a.a.b.ex polygonToSubtract_;
    private byte memoizedIsInitialized = 2;
    private String regionCode_ = "";

    static {
        ej ejVar = new ej();
        DEFAULT_INSTANCE = ejVar;
        com.google.v.du.registerDefaultInstance(ej.class, ejVar);
    }

    private ej() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonToAdd() {
        this.polygonToAdd_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonToSubtract() {
        this.polygonToSubtract_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionCode() {
        this.bitField0_ &= -2;
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    public static ej getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygonToAdd(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        com.google.k.a.a.b.ex exVar2 = this.polygonToAdd_;
        if (exVar2 != null && exVar2 != com.google.k.a.a.b.ex.getDefaultInstance()) {
            com.google.k.a.a.b.ew ewVarNewBuilder = com.google.k.a.a.b.ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((com.google.k.a.a.b.ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.polygonToAdd_ = exVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygonToSubtract(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        com.google.k.a.a.b.ex exVar2 = this.polygonToSubtract_;
        if (exVar2 != null && exVar2 != com.google.k.a.a.b.ex.getDefaultInstance()) {
            com.google.k.a.a.b.ew ewVarNewBuilder = com.google.k.a.a.b.ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((com.google.k.a.a.b.ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.polygonToSubtract_ = exVar;
        this.bitField0_ |= 4;
    }

    public static ei newBuilder() {
        return (ei) DEFAULT_INSTANCE.createBuilder();
    }

    public static ej parseDelimitedFrom(InputStream inputStream) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(com.google.v.v vVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ej> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonToAdd(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        this.polygonToAdd_ = exVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonToSubtract(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        this.polygonToSubtract_ = exVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCodeBytes(com.google.v.v vVar) {
        this.regionCode_ = vVar.u();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "regionCode_", "polygonToAdd_", "polygonToSubtract_"});
            case 3:
                return new ej();
            case 4:
                return new ei(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ej> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ej.class) {
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

    public com.google.k.a.a.b.ex getPolygonToAdd() {
        com.google.k.a.a.b.ex exVar = this.polygonToAdd_;
        return exVar == null ? com.google.k.a.a.b.ex.getDefaultInstance() : exVar;
    }

    public com.google.k.a.a.b.ex getPolygonToSubtract() {
        com.google.k.a.a.b.ex exVar = this.polygonToSubtract_;
        return exVar == null ? com.google.k.a.a.b.ex.getDefaultInstance() : exVar;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public com.google.v.v getRegionCodeBytes() {
        return com.google.v.v.s(this.regionCode_);
    }

    public boolean hasPolygonToAdd() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPolygonToSubtract() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRegionCode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ei newBuilder(ej ejVar) {
        return (ei) DEFAULT_INSTANCE.createBuilder(ejVar);
    }

    public static ej parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ej parseFrom(com.google.v.z zVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ej parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ej parseFrom(InputStream inputStream) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ej parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ej parseFrom(ByteBuffer byteBuffer) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ej parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ej parseFrom(byte[] bArr) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ej parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ej) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
