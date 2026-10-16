package com.waze.bg.e.a;

import i.b.l.rr;
import i.b.l.rs;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ec extends com.google.v.du<ec, eb> implements com.google.v.fj {
    private static final ec DEFAULT_INSTANCE;
    public static final int DESTINATION_ENTRY_POINT_FIELD_NUMBER = 4;
    public static final int LOWER_SPEED_ITINERARY_FIELD_NUMBER = 3;
    public static final int NAVIGATION_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ec> PARSER = null;
    public static final int ROUTE_DESCRIPTION_FIELD_NUMBER = 5;
    public static final int VISUAL_ROUTE_FIELD_NUMBER = 1;
    private int bitField0_;
    private df destinationEntryPoint_;
    private rs lowerSpeedItinerary_;
    private hb navigationInfo_;
    private gu routeDescription_;
    private ih visualRoute_;

    static {
        ec ecVar = new ec();
        DEFAULT_INSTANCE = ecVar;
        com.google.v.du.registerDefaultInstance(ec.class, ecVar);
    }

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationEntryPoint() {
        this.destinationEntryPoint_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowerSpeedItinerary() {
        this.lowerSpeedItinerary_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationInfo() {
        this.navigationInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteDescription() {
        this.routeDescription_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualRoute() {
        this.visualRoute_ = null;
        this.bitField0_ &= -2;
    }

    public static ec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDestinationEntryPoint(df dfVar) {
        Objects.requireNonNull(dfVar);
        df dfVar2 = this.destinationEntryPoint_;
        if (dfVar2 != null && dfVar2 != df.getDefaultInstance()) {
            de deVarNewBuilder = df.newBuilder(dfVar2);
            deVarNewBuilder.mergeFrom((de) dfVar);
            dfVar = deVarNewBuilder.buildPartial();
        }
        this.destinationEntryPoint_ = dfVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLowerSpeedItinerary(rs rsVar) {
        Objects.requireNonNull(rsVar);
        rs rsVar2 = this.lowerSpeedItinerary_;
        if (rsVar2 != null && rsVar2 != rs.getDefaultInstance()) {
            rr rrVarNewBuilder = rs.newBuilder(rsVar2);
            rrVarNewBuilder.mergeFrom((rr) rsVar);
            rsVar = rrVarNewBuilder.buildPartial();
        }
        this.lowerSpeedItinerary_ = rsVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNavigationInfo(hb hbVar) {
        Objects.requireNonNull(hbVar);
        hb hbVar2 = this.navigationInfo_;
        if (hbVar2 != null && hbVar2 != hb.getDefaultInstance()) {
            ha haVarNewBuilder = hb.newBuilder(hbVar2);
            haVarNewBuilder.mergeFrom((ha) hbVar);
            hbVar = haVarNewBuilder.buildPartial();
        }
        this.navigationInfo_ = hbVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        gu guVar2 = this.routeDescription_;
        if (guVar2 != null && guVar2 != gu.getDefaultInstance()) {
            gt gtVarNewBuilder = gu.newBuilder(guVar2);
            gtVarNewBuilder.mergeFrom((gt) guVar);
            guVar = gtVarNewBuilder.buildPartial();
        }
        this.routeDescription_ = guVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisualRoute(ih ihVar) {
        Objects.requireNonNull(ihVar);
        ih ihVar2 = this.visualRoute_;
        if (ihVar2 != null && ihVar2 != ih.getDefaultInstance()) {
            ig igVarNewBuilder = ih.newBuilder(ihVar2);
            igVarNewBuilder.mergeFrom((ig) ihVar);
            ihVar = igVarNewBuilder.buildPartial();
        }
        this.visualRoute_ = ihVar;
        this.bitField0_ |= 1;
    }

    public static eb newBuilder() {
        return (eb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ec parseDelimitedFrom(InputStream inputStream) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(com.google.v.v vVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationEntryPoint(df dfVar) {
        Objects.requireNonNull(dfVar);
        this.destinationEntryPoint_ = dfVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowerSpeedItinerary(rs rsVar) {
        Objects.requireNonNull(rsVar);
        this.lowerSpeedItinerary_ = rsVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationInfo(hb hbVar) {
        Objects.requireNonNull(hbVar);
        this.navigationInfo_ = hbVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        this.routeDescription_ = guVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualRoute(ih ihVar) {
        Objects.requireNonNull(ihVar);
        this.visualRoute_ = ihVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "visualRoute_", "navigationInfo_", "lowerSpeedItinerary_", "destinationEntryPoint_", "routeDescription_"});
        }
        if (iOrdinal == 3) {
            return new ec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ec> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ec.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public df getDestinationEntryPoint() {
        df dfVar = this.destinationEntryPoint_;
        return dfVar == null ? df.getDefaultInstance() : dfVar;
    }

    public rs getLowerSpeedItinerary() {
        rs rsVar = this.lowerSpeedItinerary_;
        return rsVar == null ? rs.getDefaultInstance() : rsVar;
    }

    public hb getNavigationInfo() {
        hb hbVar = this.navigationInfo_;
        return hbVar == null ? hb.getDefaultInstance() : hbVar;
    }

    public gu getRouteDescription() {
        gu guVar = this.routeDescription_;
        return guVar == null ? gu.getDefaultInstance() : guVar;
    }

    public ih getVisualRoute() {
        ih ihVar = this.visualRoute_;
        return ihVar == null ? ih.getDefaultInstance() : ihVar;
    }

    public boolean hasDestinationEntryPoint() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLowerSpeedItinerary() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNavigationInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRouteDescription() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVisualRoute() {
        return (this.bitField0_ & 1) != 0;
    }

    public static eb newBuilder(ec ecVar) {
        return (eb) DEFAULT_INSTANCE.createBuilder(ecVar);
    }

    public static ec parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ec parseFrom(com.google.v.z zVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ec parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ec parseFrom(InputStream inputStream) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(ByteBuffer byteBuffer) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ec parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ec parseFrom(byte[] bArr) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ec parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
