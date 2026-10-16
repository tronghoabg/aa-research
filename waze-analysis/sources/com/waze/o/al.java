package com.waze.o;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class al extends du<al, ak> implements fj {
    private static final al DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 2;
    private static volatile fo<al> PARSER = null;
    public static final int ROUTE_DESCRIPTION_FIELD_NUMBER = 1;
    public static final int WAYPOINT_FIELD_NUMBER = 3;
    private int bitField0_;
    private ce destination_;
    private ao routeDescription_;
    private ce waypoint_;

    static {
        al alVar = new al();
        DEFAULT_INSTANCE = alVar;
        du.registerDefaultInstance(al.class, alVar);
    }

    private al() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDescription() {
        this.routeDescription_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -5;
    }

    public static al getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestination(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.destination_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.destination_ = ceVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteDescription(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.routeDescription_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.routeDescription_ = aoVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.waypoint_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.waypoint_ = ceVar;
        this.bitField0_ |= 4;
    }

    public static ak newBuilder() {
        return (ak) DEFAULT_INSTANCE.createBuilder();
    }

    public static al parseDelimitedFrom(InputStream inputStream) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(com.google.v.v vVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<al> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.destination_ = ceVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDescription(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.routeDescription_ = aoVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.waypoint_ = ceVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "routeDescription_", "destination_", "waypoint_"});
        }
        if (iOrdinal == 3) {
            return new al();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ak(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<al> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (al.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ce getDestination() {
        ce ceVar = this.destination_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public ao getRouteDescription() {
        ao aoVar = this.routeDescription_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public ce getWaypoint() {
        ce ceVar = this.waypoint_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public boolean hasDestination() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteDescription() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ak newBuilder(al alVar) {
        return (ak) DEFAULT_INSTANCE.createBuilder(alVar);
    }

    public static al parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (al) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(com.google.v.v vVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static al parseFrom(com.google.v.z zVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static al parseFrom(com.google.v.z zVar, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static al parseFrom(InputStream inputStream) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static al parseFrom(InputStream inputStream, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static al parseFrom(ByteBuffer byteBuffer) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static al parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static al parseFrom(byte[] bArr) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static al parseFrom(byte[] bArr, de deVar) {
        return (al) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
