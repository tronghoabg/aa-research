package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class eq extends com.google.v.du<eq, ep> implements com.google.v.fj {
    private static final eq DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<eq> PARSER = null;
    public static final int REST_OF_WORLD_POLYGON_FIELD_NUMBER = 2;
    public static final int SELF_POLYGON_FIELD_NUMBER = 1;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private com.google.k.a.a.b.ex restOfWorldPolygon_;
    private com.google.k.a.a.b.ex selfPolygon_;

    static {
        eq eqVar = new eq();
        DEFAULT_INSTANCE = eqVar;
        com.google.v.du.registerDefaultInstance(eq.class, eqVar);
    }

    private eq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestOfWorldPolygon() {
        this.restOfWorldPolygon_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelfPolygon() {
        this.selfPolygon_ = null;
        this.bitField0_ &= -2;
    }

    public static eq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestOfWorldPolygon(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        com.google.k.a.a.b.ex exVar2 = this.restOfWorldPolygon_;
        if (exVar2 != null && exVar2 != com.google.k.a.a.b.ex.getDefaultInstance()) {
            com.google.k.a.a.b.ew ewVarNewBuilder = com.google.k.a.a.b.ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((com.google.k.a.a.b.ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.restOfWorldPolygon_ = exVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSelfPolygon(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        com.google.k.a.a.b.ex exVar2 = this.selfPolygon_;
        if (exVar2 != null && exVar2 != com.google.k.a.a.b.ex.getDefaultInstance()) {
            com.google.k.a.a.b.ew ewVarNewBuilder = com.google.k.a.a.b.ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((com.google.k.a.a.b.ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.selfPolygon_ = exVar;
        this.bitField0_ |= 1;
    }

    public static ep newBuilder() {
        return (ep) DEFAULT_INSTANCE.createBuilder();
    }

    public static eq parseDelimitedFrom(InputStream inputStream) {
        return (eq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eq parseFrom(com.google.v.v vVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<eq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestOfWorldPolygon(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        this.restOfWorldPolygon_ = exVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelfPolygon(com.google.k.a.a.b.ex exVar) {
        Objects.requireNonNull(exVar);
        this.selfPolygon_ = exVar;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "selfPolygon_", "restOfWorldPolygon_"});
            case 3:
                return new eq();
            case 4:
                return new ep(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<eq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (eq.class) {
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

    public com.google.k.a.a.b.ex getRestOfWorldPolygon() {
        com.google.k.a.a.b.ex exVar = this.restOfWorldPolygon_;
        return exVar == null ? com.google.k.a.a.b.ex.getDefaultInstance() : exVar;
    }

    public com.google.k.a.a.b.ex getSelfPolygon() {
        com.google.k.a.a.b.ex exVar = this.selfPolygon_;
        return exVar == null ? com.google.k.a.a.b.ex.getDefaultInstance() : exVar;
    }

    public boolean hasRestOfWorldPolygon() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSelfPolygon() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ep newBuilder(eq eqVar) {
        return (ep) DEFAULT_INSTANCE.createBuilder(eqVar);
    }

    public static eq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static eq parseFrom(com.google.v.z zVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static eq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static eq parseFrom(InputStream inputStream) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static eq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static eq parseFrom(ByteBuffer byteBuffer) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static eq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static eq parseFrom(byte[] bArr) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static eq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (eq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
