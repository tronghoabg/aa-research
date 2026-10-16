package com.waze.bg.e.a;

import i.b.l.ry;
import i.b.l.rz;
import i.b.l.st;
import i.b.l.su;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ih extends com.google.v.du<ih, ig> implements com.google.v.fj {
    public static final int ALERTS_FIELD_NUMBER = 9;
    public static final int CARBON_EMISSIONS_GRAMS_FIELD_NUMBER = 13;
    private static final ih DEFAULT_INSTANCE;
    public static final int EXPANDED_ROUTE_DESCRIPTION_FIELD_NUMBER = 19;
    public static final int EXPLAINABILITY_HINT_FIELD_NUMBER = 17;
    public static final int GEOMETRY_FIELD_NUMBER = 6;
    public static final int HOV_INFO_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ih> PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 5;
    public static final int ROUTE_ATTRIBUTES_FIELD_NUMBER = 4;
    public static final int ROUTE_CATEGORIES_FIELD_NUMBER = 3;
    public static final int ROUTE_LABEL_FIELD_NUMBER = 16;
    public static final int ROUTE_REVISION_FIELD_NUMBER = 15;
    public static final int TOLL_PRICE_FIELD_NUMBER = 8;
    public static final int TOTAL_METERS_FIELD_NUMBER = 12;
    public static final int TOTAL_SECONDS_FIELD_NUMBER = 11;
    public static final int TRAFFIC_JAMS_FIELD_NUMBER = 10;
    public static final int UUID_FIELD_NUMBER = 1;
    public static final int WAYPOINT_FIELD_NUMBER = 18;
    private int bitField0_;
    private long carbonEmissionsGrams_;
    private com.waze.bg.e.c expandedRouteDescription_;
    private dx explainabilityHint_;
    private rz geometry_;
    private eg hovInfo_;
    private hd restriction_;
    private go routeAttributes_;
    private gs routeCategories_;
    private gz routeLabel_;
    private long routeRevision_;
    private su tollPrice_;
    private long totalMeters_;
    private long totalSeconds_;
    private in waypoint_;
    private String uuid_ = "";
    private String name_ = "";
    private com.google.v.eo<ie> alerts_ = emptyProtobufList();
    private com.google.v.eo<ik> trafficJams_ = emptyProtobufList();

    static {
        ih ihVar = new ih();
        DEFAULT_INSTANCE = ihVar;
        com.google.v.du.registerDefaultInstance(ih.class, ihVar);
    }

    private ih() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.add(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlerts(Iterable<? extends ie> iterable) {
        ensureAlertsIsMutable();
        com.google.v.c.addAll(iterable, this.alerts_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrafficJams(Iterable<? extends ik> iterable) {
        ensureTrafficJamsIsMutable();
        com.google.v.c.addAll(iterable, this.trafficJams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(i2, ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerts() {
        this.alerts_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarbonEmissionsGrams() {
        this.bitField0_ &= -2049;
        this.carbonEmissionsGrams_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpandedRouteDescription() {
        this.expandedRouteDescription_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityHint() {
        this.explainabilityHint_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometry_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovInfo() {
        this.hovInfo_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -5;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAttributes() {
        this.routeAttributes_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteCategories() {
        this.routeCategories_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteLabel() {
        this.routeLabel_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteRevision() {
        this.bitField0_ &= -3;
        this.routeRevision_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.tollPrice_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalMeters() {
        this.bitField0_ &= -1025;
        this.totalMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSeconds() {
        this.bitField0_ &= -513;
        this.totalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficJams() {
        this.trafficJams_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUuid() {
        this.bitField0_ &= -2;
        this.uuid_ = getDefaultInstance().getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = null;
        this.bitField0_ &= -16385;
    }

    private void ensureAlertsIsMutable() {
        com.google.v.eo<ie> eoVar = this.alerts_;
        if (eoVar.c()) {
            return;
        }
        this.alerts_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTrafficJamsIsMutable() {
        com.google.v.eo<ik> eoVar = this.trafficJams_;
        if (eoVar.c()) {
            return;
        }
        this.trafficJams_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ih getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityHint(dx dxVar) {
        Objects.requireNonNull(dxVar);
        dx dxVar2 = this.explainabilityHint_;
        if (dxVar2 != null && dxVar2 != dx.getDefaultInstance()) {
            dv dvVarNewBuilder = dx.newBuilder(dxVar2);
            dvVarNewBuilder.mergeFrom((dv) dxVar);
            dxVar = dvVarNewBuilder.buildPartial();
        }
        this.explainabilityHint_ = dxVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry(rz rzVar) {
        Objects.requireNonNull(rzVar);
        rz rzVar2 = this.geometry_;
        if (rzVar2 != null && rzVar2 != rz.getDefaultInstance()) {
            ry ryVarNewBuilder = rz.newBuilder(rzVar2);
            ryVarNewBuilder.mergeFrom((ry) rzVar);
            rzVar = ryVarNewBuilder.buildPartial();
        }
        this.geometry_ = rzVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovInfo(eg egVar) {
        Objects.requireNonNull(egVar);
        eg egVar2 = this.hovInfo_;
        if (egVar2 != null && egVar2 != eg.getDefaultInstance()) {
            ef efVarNewBuilder = eg.newBuilder(egVar2);
            efVarNewBuilder.mergeFrom((ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.hovInfo_ = egVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestriction(hd hdVar) {
        Objects.requireNonNull(hdVar);
        hd hdVar2 = this.restriction_;
        if (hdVar2 != null && hdVar2 != hd.getDefaultInstance()) {
            hc hcVarNewBuilder = hd.newBuilder(hdVar2);
            hcVarNewBuilder.mergeFrom((hc) hdVar);
            hdVar = hcVarNewBuilder.buildPartial();
        }
        this.restriction_ = hdVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteAttributes(go goVar) {
        Objects.requireNonNull(goVar);
        go goVar2 = this.routeAttributes_;
        if (goVar2 != null && goVar2 != go.getDefaultInstance()) {
            gn gnVarNewBuilder = go.newBuilder(goVar2);
            gnVarNewBuilder.mergeFrom((gn) goVar);
            goVar = gnVarNewBuilder.buildPartial();
        }
        this.routeAttributes_ = goVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteCategories(gs gsVar) {
        Objects.requireNonNull(gsVar);
        gs gsVar2 = this.routeCategories_;
        if (gsVar2 != null && gsVar2 != gs.getDefaultInstance()) {
            gr grVarNewBuilder = gs.newBuilder(gsVar2);
            grVarNewBuilder.mergeFrom((gr) gsVar);
            gsVar = grVarNewBuilder.buildPartial();
        }
        this.routeCategories_ = gsVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteLabel(gz gzVar) {
        Objects.requireNonNull(gzVar);
        gz gzVar2 = this.routeLabel_;
        if (gzVar2 != null && gzVar2 != gz.getDefaultInstance()) {
            gy gyVarNewBuilder = gz.newBuilder(gzVar2);
            gyVarNewBuilder.mergeFrom((gy) gzVar);
            gzVar = gyVarNewBuilder.buildPartial();
        }
        this.routeLabel_ = gzVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollPrice(su suVar) {
        Objects.requireNonNull(suVar);
        su suVar2 = this.tollPrice_;
        if (suVar2 != null && suVar2 != su.getDefaultInstance()) {
            st stVarNewBuilder = su.newBuilder(suVar2);
            stVarNewBuilder.mergeFrom((st) suVar);
            suVar = stVarNewBuilder.buildPartial();
        }
        this.tollPrice_ = suVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaypoint(in inVar) {
        Objects.requireNonNull(inVar);
        in inVar2 = this.waypoint_;
        if (inVar2 != null && inVar2 != in.getDefaultInstance()) {
            im imVarNewBuilder = in.newBuilder(inVar2);
            imVarNewBuilder.mergeFrom((im) inVar);
            inVar = imVarNewBuilder.buildPartial();
        }
        this.waypoint_ = inVar;
        this.bitField0_ |= 16384;
    }

    public static ig newBuilder() {
        return (ig) DEFAULT_INSTANCE.createBuilder();
    }

    public static ih parseDelimitedFrom(InputStream inputStream) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(com.google.v.v vVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ih> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlerts(int i2) {
        ensureAlertsIsMutable();
        this.alerts_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrafficJams(int i2) {
        ensureTrafficJamsIsMutable();
        this.trafficJams_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerts(int i2, ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.set(i2, ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarbonEmissionsGrams(long j2) {
        this.bitField0_ |= 2048;
        this.carbonEmissionsGrams_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandedRouteDescription(com.waze.bg.e.c cVar) {
        Objects.requireNonNull(cVar);
        this.expandedRouteDescription_ = cVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityHint(dx dxVar) {
        Objects.requireNonNull(dxVar);
        this.explainabilityHint_ = dxVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry(rz rzVar) {
        Objects.requireNonNull(rzVar);
        this.geometry_ = rzVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovInfo(eg egVar) {
        Objects.requireNonNull(egVar);
        this.hovInfo_ = egVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(com.google.v.v vVar) {
        this.name_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(hd hdVar) {
        Objects.requireNonNull(hdVar);
        this.restriction_ = hdVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAttributes(go goVar) {
        Objects.requireNonNull(goVar);
        this.routeAttributes_ = goVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteCategories(gs gsVar) {
        Objects.requireNonNull(gsVar);
        this.routeCategories_ = gsVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteLabel(gz gzVar) {
        Objects.requireNonNull(gzVar);
        this.routeLabel_ = gzVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteRevision(long j2) {
        this.bitField0_ |= 2;
        this.routeRevision_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(su suVar) {
        Objects.requireNonNull(suVar);
        this.tollPrice_ = suVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalMeters(long j2) {
        this.bitField0_ |= 1024;
        this.totalMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSeconds(long j2) {
        this.bitField0_ |= 512;
        this.totalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficJams(int i2, ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.set(i2, ikVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.uuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUuidBytes(com.google.v.v vVar) {
        this.uuid_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(in inVar) {
        Objects.requireNonNull(inVar);
        this.waypoint_ = inVar;
        this.bitField0_ |= 16384;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\t\u001b\n\u001b\u000bဂ\t\fဂ\n\rဂ\u000b\u000fဂ\u0001\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f", new Object[]{"bitField0_", "uuid_", "name_", "routeCategories_", "routeAttributes_", "restriction_", "geometry_", "hovInfo_", "tollPrice_", "alerts_", ie.class, "trafficJams_", ik.class, "totalSeconds_", "totalMeters_", "carbonEmissionsGrams_", "routeRevision_", "routeLabel_", "explainabilityHint_", "waypoint_", "expandedRouteDescription_"});
        }
        if (iOrdinal == 3) {
            return new ih();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ig(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ih> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ih.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ie getAlerts(int i2) {
        return this.alerts_.get(i2);
    }

    public int getAlertsCount() {
        return this.alerts_.size();
    }

    public List<ie> getAlertsList() {
        return this.alerts_;
    }

    public Cif getAlertsOrBuilder(int i2) {
        return this.alerts_.get(i2);
    }

    public List<? extends Cif> getAlertsOrBuilderList() {
        return this.alerts_;
    }

    public long getCarbonEmissionsGrams() {
        return this.carbonEmissionsGrams_;
    }

    public com.waze.bg.e.c getExpandedRouteDescription() {
        com.waze.bg.e.c cVar = this.expandedRouteDescription_;
        return cVar == null ? com.waze.bg.e.c.getDefaultInstance() : cVar;
    }

    public dx getExplainabilityHint() {
        dx dxVar = this.explainabilityHint_;
        return dxVar == null ? dx.getDefaultInstance() : dxVar;
    }

    public rz getGeometry() {
        rz rzVar = this.geometry_;
        return rzVar == null ? rz.getDefaultInstance() : rzVar;
    }

    public eg getHovInfo() {
        eg egVar = this.hovInfo_;
        return egVar == null ? eg.getDefaultInstance() : egVar;
    }

    public String getName() {
        return this.name_;
    }

    public com.google.v.v getNameBytes() {
        return com.google.v.v.s(this.name_);
    }

    public hd getRestriction() {
        hd hdVar = this.restriction_;
        return hdVar == null ? hd.getDefaultInstance() : hdVar;
    }

    public go getRouteAttributes() {
        go goVar = this.routeAttributes_;
        return goVar == null ? go.getDefaultInstance() : goVar;
    }

    public gs getRouteCategories() {
        gs gsVar = this.routeCategories_;
        return gsVar == null ? gs.getDefaultInstance() : gsVar;
    }

    public gz getRouteLabel() {
        gz gzVar = this.routeLabel_;
        return gzVar == null ? gz.getDefaultInstance() : gzVar;
    }

    public long getRouteRevision() {
        return this.routeRevision_;
    }

    public su getTollPrice() {
        su suVar = this.tollPrice_;
        return suVar == null ? su.getDefaultInstance() : suVar;
    }

    public long getTotalMeters() {
        return this.totalMeters_;
    }

    public long getTotalSeconds() {
        return this.totalSeconds_;
    }

    public ik getTrafficJams(int i2) {
        return this.trafficJams_.get(i2);
    }

    public int getTrafficJamsCount() {
        return this.trafficJams_.size();
    }

    public List<ik> getTrafficJamsList() {
        return this.trafficJams_;
    }

    public il getTrafficJamsOrBuilder(int i2) {
        return this.trafficJams_.get(i2);
    }

    public List<? extends il> getTrafficJamsOrBuilderList() {
        return this.trafficJams_;
    }

    public String getUuid() {
        return this.uuid_;
    }

    public com.google.v.v getUuidBytes() {
        return com.google.v.v.s(this.uuid_);
    }

    public in getWaypoint() {
        in inVar = this.waypoint_;
        return inVar == null ? in.getDefaultInstance() : inVar;
    }

    public boolean hasCarbonEmissionsGrams() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasExpandedRouteDescription() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasExplainabilityHint() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasGeometry() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHovInfo() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRestriction() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRouteAttributes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRouteCategories() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRouteLabel() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasRouteRevision() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTotalMeters() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTotalSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUuid() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWaypoint() {
        return (this.bitField0_ & 16384) != 0;
    }

    public static ig newBuilder(ih ihVar) {
        return (ig) DEFAULT_INSTANCE.createBuilder(ihVar);
    }

    public static ih parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ih parseFrom(com.google.v.z zVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ih parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerts(ie ieVar) {
        Objects.requireNonNull(ieVar);
        ensureAlertsIsMutable();
        this.alerts_.add(ieVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficJams(ik ikVar) {
        Objects.requireNonNull(ikVar);
        ensureTrafficJamsIsMutable();
        this.trafficJams_.add(ikVar);
    }

    public static ih parseFrom(InputStream inputStream) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ih parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ih parseFrom(ByteBuffer byteBuffer) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ih parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ih parseFrom(byte[] bArr) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ih parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ih) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
