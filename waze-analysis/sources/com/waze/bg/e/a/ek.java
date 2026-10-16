package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ek extends com.google.v.du<ek, ej> implements com.google.v.fj {
    private static final ek DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ek> PARSER = null;
    public static final int ROUTE_TYPE_LABEL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String routeTypeLabel_ = "";

    static {
        ek ekVar = new ek();
        DEFAULT_INSTANCE = ekVar;
        com.google.v.du.registerDefaultInstance(ek.class, ekVar);
    }

    private ek() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypeLabel() {
        this.bitField0_ &= -2;
        this.routeTypeLabel_ = getDefaultInstance().getRouteTypeLabel();
    }

    public static ek getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ej newBuilder() {
        return (ej) DEFAULT_INSTANCE.createBuilder();
    }

    public static ek parseDelimitedFrom(InputStream inputStream) {
        return (ek) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ek parseFrom(com.google.v.v vVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ek> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypeLabel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.routeTypeLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypeLabelBytes(com.google.v.v vVar) {
        this.routeTypeLabel_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "routeTypeLabel_"});
        }
        if (iOrdinal == 3) {
            return new ek();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ej(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ek> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ek.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRouteTypeLabel() {
        return this.routeTypeLabel_;
    }

    public com.google.v.v getRouteTypeLabelBytes() {
        return com.google.v.v.s(this.routeTypeLabel_);
    }

    public boolean hasRouteTypeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ej newBuilder(ek ekVar) {
        return (ej) DEFAULT_INSTANCE.createBuilder(ekVar);
    }

    public static ek parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ek) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ek parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ek parseFrom(com.google.v.z zVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ek parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ek parseFrom(InputStream inputStream) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ek parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ek parseFrom(ByteBuffer byteBuffer) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ek parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ek parseFrom(byte[] bArr) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ek parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ek) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
