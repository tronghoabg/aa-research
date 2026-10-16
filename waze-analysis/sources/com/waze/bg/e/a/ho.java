package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ho extends com.google.v.du<ho, hn> implements com.google.v.fj {
    private static final ho DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ho> PARSER = null;
    public static final int ROUTE_UUID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String routeUuid_ = "";

    static {
        ho hoVar = new ho();
        DEFAULT_INSTANCE = hoVar;
        com.google.v.du.registerDefaultInstance(ho.class, hoVar);
    }

    private ho() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.bitField0_ &= -2;
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    public static ho getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hn newBuilder() {
        return (hn) DEFAULT_INSTANCE.createBuilder();
    }

    public static ho parseDelimitedFrom(InputStream inputStream) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(com.google.v.v vVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ho> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.routeUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUuidBytes(com.google.v.v vVar) {
        this.routeUuid_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "routeUuid_"});
        }
        if (iOrdinal == 3) {
            return new ho();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ho> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ho.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public boolean hasRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hn newBuilder(ho hoVar) {
        return (hn) DEFAULT_INSTANCE.createBuilder(hoVar);
    }

    public static ho parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ho parseFrom(com.google.v.z zVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ho parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ho parseFrom(InputStream inputStream) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ho parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ho parseFrom(ByteBuffer byteBuffer) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ho parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ho parseFrom(byte[] bArr) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ho parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ho) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
