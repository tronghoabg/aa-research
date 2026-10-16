package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ea extends com.google.v.du<ea, dy> implements com.google.v.fj {
    private static final ea DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ea> PARSER = null;
    public static final int ROUTE_TYPE_LABEL_FIELD_NUMBER = 1;
    public static final int TRAFFIC_STATUS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String routeTypeLabel_ = "";
    private int trafficStatus_;

    static {
        ea eaVar = new ea();
        DEFAULT_INSTANCE = eaVar;
        com.google.v.du.registerDefaultInstance(ea.class, eaVar);
    }

    private ea() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypeLabel() {
        this.bitField0_ &= -2;
        this.routeTypeLabel_ = getDefaultInstance().getRouteTypeLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficStatus() {
        this.bitField0_ &= -3;
        this.trafficStatus_ = 0;
    }

    public static ea getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dy newBuilder() {
        return (dy) DEFAULT_INSTANCE.createBuilder();
    }

    public static ea parseDelimitedFrom(InputStream inputStream) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(com.google.v.v vVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ea> parser() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficStatus(dz dzVar) {
        this.trafficStatus_ = dzVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "routeTypeLabel_", "trafficStatus_", ci.f16638d});
        }
        if (iOrdinal == 3) {
            return new ea();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dy(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ea> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ea.class) {
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

    public dz getTrafficStatus() {
        dz dzVarA = dz.a(this.trafficStatus_);
        return dzVarA == null ? dz.TRAFFIC_STATUS_UNSPECIFIED : dzVarA;
    }

    public boolean hasRouteTypeLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrafficStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public static dy newBuilder(ea eaVar) {
        return (dy) DEFAULT_INSTANCE.createBuilder(eaVar);
    }

    public static ea parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ea parseFrom(com.google.v.z zVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ea parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ea parseFrom(InputStream inputStream) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ea parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ea parseFrom(ByteBuffer byteBuffer) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ea parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ea parseFrom(byte[] bArr) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ea parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ea) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
