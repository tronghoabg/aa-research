package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gq extends com.google.v.du<gq, gp> implements com.google.v.fj {
    private static final gq DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 3;
    public static final int LEGACY_ROUTE_ID_FIELD_NUMBER = 1;
    public static final int ORIGIN_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<gq> PARSER = null;
    public static final int ROUTING_OPTIONS_FIELD_NUMBER = 5;
    public static final int VEHICLE_DATA_FIELD_NUMBER = 6;
    public static final int WAYPOINT_FIELD_NUMBER = 4;
    private int bitField0_;
    private cx destination_;
    private int legacyRouteId_;
    private gj origin_;
    private hf routingOptions_;
    private ck vehicleData_;
    private hh waypoint_;

    static {
        gq gqVar = new gq();
        DEFAULT_INSTANCE = gqVar;
        com.google.v.du.registerDefaultInstance(gq.class, gqVar);
    }

    private gq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegacyRouteId() {
        this.bitField0_ &= -2;
        this.legacyRouteId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrigin() {
        this.origin_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingOptions() {
        this.routingOptions_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleData() {
        this.vehicleData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -9;
    }

    public static gq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(cx cxVar) {
        Objects.requireNonNull(cxVar);
        cx cxVar2 = this.destination_;
        if (cxVar2 != null && cxVar2 != cx.getDefaultInstance()) {
            cl clVarNewBuilder = cx.newBuilder(cxVar2);
            clVarNewBuilder.mergeFrom((cl) cxVar);
            cxVar = clVarNewBuilder.buildPartial();
        }
        this.destination_ = cxVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOrigin(gj gjVar) {
        Objects.requireNonNull(gjVar);
        gj gjVar2 = this.origin_;
        if (gjVar2 != null && gjVar2 != gj.getDefaultInstance()) {
            gi giVarNewBuilder = gj.newBuilder(gjVar2);
            giVarNewBuilder.mergeFrom((gi) gjVar);
            gjVar = giVarNewBuilder.buildPartial();
        }
        this.origin_ = gjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingOptions(hf hfVar) {
        Objects.requireNonNull(hfVar);
        hf hfVar2 = this.routingOptions_;
        if (hfVar2 != null && hfVar2 != hf.getDefaultInstance()) {
            he heVarNewBuilder = hf.newBuilder(hfVar2);
            heVarNewBuilder.mergeFrom((he) hfVar);
            hfVar = heVarNewBuilder.buildPartial();
        }
        this.routingOptions_ = hfVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVehicleData(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ck ckVar2 = this.vehicleData_;
        if (ckVar2 != null && ckVar2 != ck.getDefaultInstance()) {
            ch chVarNewBuilder = ck.newBuilder(ckVar2);
            chVarNewBuilder.mergeFrom((ch) ckVar);
            ckVar = chVarNewBuilder.buildPartial();
        }
        this.vehicleData_ = ckVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(hh hhVar) {
        Objects.requireNonNull(hhVar);
        hh hhVar2 = this.waypoint_;
        if (hhVar2 != null && hhVar2 != hh.getDefaultInstance()) {
            hg hgVarNewBuilder = hh.newBuilder(hhVar2);
            hgVarNewBuilder.mergeFrom((hg) hhVar);
            hhVar = hgVarNewBuilder.buildPartial();
        }
        this.waypoint_ = hhVar;
        this.bitField0_ |= 8;
    }

    public static gp newBuilder() {
        return (gp) DEFAULT_INSTANCE.createBuilder();
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
    public void setDestination(cx cxVar) {
        Objects.requireNonNull(cxVar);
        this.destination_ = cxVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegacyRouteId(int i2) {
        this.bitField0_ |= 1;
        this.legacyRouteId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrigin(gj gjVar) {
        Objects.requireNonNull(gjVar);
        this.origin_ = gjVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingOptions(hf hfVar) {
        Objects.requireNonNull(hfVar);
        this.routingOptions_ = hfVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleData(ck ckVar) {
        Objects.requireNonNull(ckVar);
        this.vehicleData_ = ckVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(hh hhVar) {
        Objects.requireNonNull(hhVar);
        this.waypoint_ = hhVar;
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"bitField0_", "legacyRouteId_", "origin_", "destination_", "waypoint_", "routingOptions_", "vehicleData_"});
        }
        if (iOrdinal == 3) {
            return new gq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new gp(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
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
    }

    public cx getDestination() {
        cx cxVar = this.destination_;
        return cxVar == null ? cx.getDefaultInstance() : cxVar;
    }

    public int getLegacyRouteId() {
        return this.legacyRouteId_;
    }

    public gj getOrigin() {
        gj gjVar = this.origin_;
        return gjVar == null ? gj.getDefaultInstance() : gjVar;
    }

    public hf getRoutingOptions() {
        hf hfVar = this.routingOptions_;
        return hfVar == null ? hf.getDefaultInstance() : hfVar;
    }

    public ck getVehicleData() {
        ck ckVar = this.vehicleData_;
        return ckVar == null ? ck.getDefaultInstance() : ckVar;
    }

    public hh getWaypoint() {
        hh hhVar = this.waypoint_;
        return hhVar == null ? hh.getDefaultInstance() : hhVar;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLegacyRouteId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOrigin() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingOptions() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVehicleData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 8) != 0;
    }

    public static gp newBuilder(gq gqVar) {
        return (gp) DEFAULT_INSTANCE.createBuilder(gqVar);
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
