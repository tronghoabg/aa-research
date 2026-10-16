package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az extends com.google.v.du<az, ay> implements com.google.v.fj {
    public static final int ALERTS_UPDATE_FIELD_NUMBER = 5;
    public static final int CROSS_TIMES_UPDATE_FIELD_NUMBER = 2;
    private static final az DEFAULT_INSTANCE;
    public static final int DETOURS_UPDATE_FIELD_NUMBER = 3;
    public static final int EXPANDED_ROUTE_DESCRIPTION_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<az> PARSER = null;
    public static final int ROUTE_REVISION_FIELD_NUMBER = 1;
    public static final int TRAFFIC_JAMS_UPDATE_FIELD_NUMBER = 6;
    public static final int UPDATE_DESCRIPTION_FIELD_NUMBER = 4;
    private av alertsUpdate_;
    private int bitField0_;
    private ax crossTimesUpdate_;
    private bl detoursUpdate_;
    private com.waze.bg.e.c expandedRouteDescription_;
    private long routeRevision_;
    private cd trafficJamsUpdate_;
    private gu updateDescription_;

    static {
        az azVar = new az();
        DEFAULT_INSTANCE = azVar;
        com.google.v.du.registerDefaultInstance(az.class, azVar);
    }

    private az() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertsUpdate() {
        this.alertsUpdate_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossTimesUpdate() {
        this.crossTimesUpdate_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetoursUpdate() {
        this.detoursUpdate_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpandedRouteDescription() {
        this.expandedRouteDescription_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteRevision() {
        this.bitField0_ &= -2;
        this.routeRevision_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficJamsUpdate() {
        this.trafficJamsUpdate_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateDescription() {
        this.updateDescription_ = null;
        this.bitField0_ &= -9;
    }

    public static az getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertsUpdate(av avVar) {
        Objects.requireNonNull(avVar);
        av avVar2 = this.alertsUpdate_;
        if (avVar2 != null && avVar2 != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder(avVar2);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.alertsUpdate_ = avVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrossTimesUpdate(ax axVar) {
        Objects.requireNonNull(axVar);
        ax axVar2 = this.crossTimesUpdate_;
        if (axVar2 != null && axVar2 != ax.getDefaultInstance()) {
            aw awVarNewBuilder = ax.newBuilder(axVar2);
            awVarNewBuilder.mergeFrom((aw) axVar);
            axVar = awVarNewBuilder.buildPartial();
        }
        this.crossTimesUpdate_ = axVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetoursUpdate(bl blVar) {
        Objects.requireNonNull(blVar);
        bl blVar2 = this.detoursUpdate_;
        if (blVar2 != null && blVar2 != bl.getDefaultInstance()) {
            bk bkVarNewBuilder = bl.newBuilder(blVar2);
            bkVarNewBuilder.mergeFrom((bk) blVar);
            blVar = bkVarNewBuilder.buildPartial();
        }
        this.detoursUpdate_ = blVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpandedRouteDescription(com.waze.bg.e.c cVar) {
        Objects.requireNonNull(cVar);
        com.waze.bg.e.c cVar2 = this.expandedRouteDescription_;
        if (cVar2 != null && cVar2 != com.waze.bg.e.c.getDefaultInstance()) {
            com.waze.bg.e.b bVarNewBuilder = com.waze.bg.e.c.newBuilder(cVar2);
            bVarNewBuilder.mergeFrom((com.waze.bg.e.b) cVar);
            cVar = bVarNewBuilder.buildPartial();
        }
        this.expandedRouteDescription_ = cVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficJamsUpdate(cd cdVar) {
        Objects.requireNonNull(cdVar);
        cd cdVar2 = this.trafficJamsUpdate_;
        if (cdVar2 != null && cdVar2 != cd.getDefaultInstance()) {
            cc ccVarNewBuilder = cd.newBuilder(cdVar2);
            ccVarNewBuilder.mergeFrom((cc) cdVar);
            cdVar = ccVarNewBuilder.buildPartial();
        }
        this.trafficJamsUpdate_ = cdVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        gu guVar2 = this.updateDescription_;
        if (guVar2 != null && guVar2 != gu.getDefaultInstance()) {
            gt gtVarNewBuilder = gu.newBuilder(guVar2);
            gtVarNewBuilder.mergeFrom((gt) guVar);
            guVar = gtVarNewBuilder.buildPartial();
        }
        this.updateDescription_ = guVar;
        this.bitField0_ |= 8;
    }

    public static ay newBuilder() {
        return (ay) DEFAULT_INSTANCE.createBuilder();
    }

    public static az parseDelimitedFrom(InputStream inputStream) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(com.google.v.v vVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<az> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertsUpdate(av avVar) {
        Objects.requireNonNull(avVar);
        this.alertsUpdate_ = avVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossTimesUpdate(ax axVar) {
        Objects.requireNonNull(axVar);
        this.crossTimesUpdate_ = axVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetoursUpdate(bl blVar) {
        Objects.requireNonNull(blVar);
        this.detoursUpdate_ = blVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandedRouteDescription(com.waze.bg.e.c cVar) {
        Objects.requireNonNull(cVar);
        this.expandedRouteDescription_ = cVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteRevision(long j2) {
        this.bitField0_ |= 1;
        this.routeRevision_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficJamsUpdate(cd cdVar) {
        Objects.requireNonNull(cdVar);
        this.trafficJamsUpdate_ = cdVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateDescription(gu guVar) {
        Objects.requireNonNull(guVar);
        this.updateDescription_ = guVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "routeRevision_", "crossTimesUpdate_", "detoursUpdate_", "updateDescription_", "alertsUpdate_", "trafficJamsUpdate_", "expandedRouteDescription_"});
        }
        if (iOrdinal == 3) {
            return new az();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ay(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<az> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (az.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public av getAlertsUpdate() {
        av avVar = this.alertsUpdate_;
        return avVar == null ? av.getDefaultInstance() : avVar;
    }

    public ax getCrossTimesUpdate() {
        ax axVar = this.crossTimesUpdate_;
        return axVar == null ? ax.getDefaultInstance() : axVar;
    }

    public bl getDetoursUpdate() {
        bl blVar = this.detoursUpdate_;
        return blVar == null ? bl.getDefaultInstance() : blVar;
    }

    public com.waze.bg.e.c getExpandedRouteDescription() {
        com.waze.bg.e.c cVar = this.expandedRouteDescription_;
        return cVar == null ? com.waze.bg.e.c.getDefaultInstance() : cVar;
    }

    public long getRouteRevision() {
        return this.routeRevision_;
    }

    public cd getTrafficJamsUpdate() {
        cd cdVar = this.trafficJamsUpdate_;
        return cdVar == null ? cd.getDefaultInstance() : cdVar;
    }

    public gu getUpdateDescription() {
        gu guVar = this.updateDescription_;
        return guVar == null ? gu.getDefaultInstance() : guVar;
    }

    public boolean hasAlertsUpdate() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCrossTimesUpdate() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDetoursUpdate() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasExpandedRouteDescription() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasRouteRevision() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrafficJamsUpdate() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUpdateDescription() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ay newBuilder(az azVar) {
        return (ay) DEFAULT_INSTANCE.createBuilder(azVar);
    }

    public static az parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static az parseFrom(com.google.v.z zVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static az parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static az parseFrom(InputStream inputStream) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static az parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static az parseFrom(ByteBuffer byteBuffer) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static az parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static az parseFrom(byte[] bArr) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static az parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (az) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
