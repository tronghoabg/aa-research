package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.google.v.du<b, a> implements com.google.v.fj {
    private static final b DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<b> PARSER = null;
    public static final int ROUTE_CALCULATION_PARAMS_FIELD_NUMBER = 1;
    public static final int ROUTE_UUID_FIELD_NUMBER = 2;
    private int bitField0_;
    private gq routeCalculationParams_;
    private String routeUuid_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        com.google.v.du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteCalculationParams() {
        this.routeCalculationParams_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.bitField0_ &= -3;
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteCalculationParams(gq gqVar) {
        Objects.requireNonNull(gqVar);
        gq gqVar2 = this.routeCalculationParams_;
        if (gqVar2 != null && gqVar2 != gq.getDefaultInstance()) {
            gp gpVarNewBuilder = gq.newBuilder(gqVar2);
            gpVarNewBuilder.mergeFrom((gp) gqVar);
            gqVar = gpVarNewBuilder.buildPartial();
        }
        this.routeCalculationParams_ = gqVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteCalculationParams(gq gqVar) {
        Objects.requireNonNull(gqVar);
        this.routeCalculationParams_ = gqVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.routeUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuidBytes(com.google.v.v vVar) {
        this.routeUuid_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "routeCalculationParams_", "routeUuid_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public gq getRouteCalculationParams() {
        gq gqVar = this.routeCalculationParams_;
        return gqVar == null ? gq.getDefaultInstance() : gqVar;
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public boolean hasRouteCalculationParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRouteUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (b) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
