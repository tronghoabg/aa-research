package com.waze.bg.e.a;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dr extends com.google.v.du<dr, dp> implements com.google.v.fj {
    public static final int CURRENT_LOCATION_FIELD_NUMBER = 3;
    private static final dr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<dr> PARSER = null;
    public static final int ROUTE_UUID_FIELD_NUMBER = 1;
    public static final int WAYPOINTS_FIELD_NUMBER = 2;
    private int bitField0_;
    private ei currentLocation_;
    private com.google.v.ff<Integer, cx> waypoints_ = com.google.v.ff.a();
    private String routeUuid_ = "";

    static {
        dr drVar = new dr();
        DEFAULT_INSTANCE = drVar;
        com.google.v.du.registerDefaultInstance(dr.class, drVar);
    }

    private dr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentLocation() {
        this.currentLocation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUuid() {
        this.bitField0_ &= -2;
        this.routeUuid_ = getDefaultInstance().getRouteUuid();
    }

    public static dr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, cx> getMutableWaypointsMap() {
        return internalGetMutableWaypoints();
    }

    private com.google.v.ff<Integer, cx> internalGetMutableWaypoints() {
        if (!this.waypoints_.e()) {
            this.waypoints_ = this.waypoints_.b();
        }
        return this.waypoints_;
    }

    private com.google.v.ff<Integer, cx> internalGetWaypoints() {
        return this.waypoints_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        ei eiVar2 = this.currentLocation_;
        if (eiVar2 != null && eiVar2 != ei.getDefaultInstance()) {
            eh ehVarNewBuilder = ei.newBuilder(eiVar2);
            ehVarNewBuilder.mergeFrom((eh) eiVar);
            eiVar = ehVarNewBuilder.buildPartial();
        }
        this.currentLocation_ = eiVar;
        this.bitField0_ |= 2;
    }

    public static dp newBuilder() {
        return (dp) DEFAULT_INSTANCE.createBuilder();
    }

    public static dr parseDelimitedFrom(InputStream inputStream) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(com.google.v.v vVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentLocation(ei eiVar) {
        Objects.requireNonNull(eiVar);
        this.currentLocation_ = eiVar;
        this.bitField0_ |= 2;
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

    public boolean containsWaypoints(int i2) {
        return internalGetWaypoints().containsKey(Integer.valueOf(i2));
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u00022\u0003ဉ\u0001", new Object[]{"bitField0_", "routeUuid_", "waypoints_", dq.f16671a, "currentLocation_"});
        }
        if (iOrdinal == 3) {
            return new dr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new dp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ei getCurrentLocation() {
        ei eiVar = this.currentLocation_;
        return eiVar == null ? ei.getDefaultInstance() : eiVar;
    }

    public String getRouteUuid() {
        return this.routeUuid_;
    }

    public com.google.v.v getRouteUuidBytes() {
        return com.google.v.v.s(this.routeUuid_);
    }

    public int getWaypointsCount() {
        return internalGetWaypoints().size();
    }

    public Map<Integer, cx> getWaypointsMap() {
        return DesugarCollections.unmodifiableMap(internalGetWaypoints());
    }

    public cx getWaypointsOrDefault(int i2, cx cxVar) {
        cx cxVar2 = internalGetWaypoints().get(Integer.valueOf(i2));
        return cxVar2 != null ? cxVar2 : cxVar;
    }

    public cx getWaypointsOrThrow(int i2) {
        cx cxVar = internalGetWaypoints().get(Integer.valueOf(i2));
        if (cxVar != null) {
            return cxVar;
        }
        throw new IllegalArgumentException();
    }

    public boolean hasCurrentLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public static dp newBuilder(dr drVar) {
        return (dp) DEFAULT_INSTANCE.createBuilder(drVar);
    }

    public static dr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dr parseFrom(com.google.v.z zVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dr parseFrom(InputStream inputStream) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dr parseFrom(ByteBuffer byteBuffer) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dr parseFrom(byte[] bArr) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
