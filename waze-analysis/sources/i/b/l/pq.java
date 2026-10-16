package i.b.l;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class pq extends com.google.v.du<pq, pn> implements com.google.v.fj {
    public static final int ARRIVETIME_FIELD_NUMBER = 38;
    public static final int AUTOSELECTROUTE_FIELD_NUMBER = 23;
    public static final int CARPOOLPARAMS_FIELD_NUMBER = 31;
    public static final int DEBUG_QUERY_PARAMS_FIELD_NUMBER = 40;
    private static final pq DEFAULT_INSTANCE;
    public static final int DESTINATION_FIELD_NUMBER = 8;
    public static final int ETAONLYOBSOLETE_FIELD_NUMBER = 20;
    public static final int EVDATA_FIELD_NUMBER = 41;
    public static final int FREQUENTROUTEIDOBSOLETE_FIELD_NUMBER = 16;
    public static final int FROMLOC_FIELD_NUMBER = 7;
    public static final int GPSINFO_FIELD_NUMBER = 21;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LICENSEPLATESUFFIX_FIELD_NUMBER = 17;
    public static final int MAXGEOMETRIES_FIELD_NUMBER = 24;
    public static final int MAXPOINTS_FIELD_NUMBER = 6;
    public static final int MAXROUTESWITHEVENTS_FIELD_NUMBER = 29;
    public static final int MAXROUTES_FIELD_NUMBER = 4;
    public static final int MAXSEGMENTS_FIELD_NUMBER = 5;
    public static final int NAVIGATIONTYPEOBSOLETE_FIELD_NUMBER = 15;
    public static final int NAVIGATIONTYPE_FIELD_NUMBER = 26;
    public static final int OPTIONS_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<pq> PARSER = null;
    public static final int PERMIT_FIELD_NUMBER = 28;
    public static final int RANGECOSTPARAMS_FIELD_NUMBER = 19;
    public static final int REROUTE_FIELD_NUMBER = 13;
    public static final int RETRY_FIELD_NUMBER = 14;
    public static final int RETURNADDITIONALROUTESEGMENTDETAILS_FIELD_NUMBER = 43;
    public static final int RETURNCLOSUREIMPACTINFO_FIELD_NUMBER = 45;
    public static final int RETURNEVENTGEOMETRY_FIELD_NUMBER = 35;
    public static final int RETURNQUESTIONS_FIELD_NUMBER = 37;
    public static final int RETURNROUTEINSIGHTS_FIELD_NUMBER = 36;
    public static final int ROUTEGEOMETRYPARAMS_FIELD_NUMBER = 44;
    public static final int ROUTETYPEOBSOLETE_FIELD_NUMBER = 2;
    public static final int ROUTETYPE_FIELD_NUMBER = 25;
    public static final int ROUTING_LOCATION_INFO_FIELD_NUMBER = 47;
    public static final int ROUTING_OPTIONS_FIELD_NUMBER = 42;
    public static final int SELECTABLE_FIELD_NUMBER = 30;
    public static final int SHOW_HISTOGRAM_FIELD_NUMBER = 39;
    public static final int STARTTIME_FIELD_NUMBER = 27;
    public static final int TIMEOFDAYOBSOLETE_FIELD_NUMBER = 12;
    public static final int TIMEOUT_FIELD_NUMBER = 32;
    public static final int TRIPID_FIELD_NUMBER = 3;
    public static final int USENAIVEDETOURID_FIELD_NUMBER = 34;
    public static final int USE_CASE_FIELD_NUMBER = 33;
    public static final int VEHICLETYPE_FIELD_NUMBER = 18;
    public static final int WAYPOINT_FIELD_NUMBER = 22;
    public static final int WITHGEOMERTIESOBSOLETE_FIELD_NUMBER = 9;
    public static final int WITHINSTRUCTIONS_FIELD_NUMBER = 10;
    private boolean autoSelectRoute_;
    private int bitField0_;
    private int bitField1_;
    private nu carpoolParams_;
    private boolean etaOnlyObsolete_;
    private on evData_;
    private or fromLoc_;
    private op gpsInfo_;
    private Object histogramRequestOneOf_;
    private int id_;
    private int maxGeometries_;
    private int maxPoints_;
    private int maxRoutesWithEvents_;
    private int maxRoutes_;
    private int maxSegments_;
    private int navigationTypeObsolete_;
    private int navigationType_;
    private i.b.ae options_;
    private boolean reroute_;
    private boolean retry_;
    private boolean returnAdditionalRouteSegmentDetails_;
    private boolean returnClosureImpactInfo_;
    private boolean returnEventGeometry_;
    private boolean returnQuestions_;
    private boolean returnRouteInsights_;
    private pl routeGeometryParams_;
    private int routeTypeObsolete_;
    private int routeType_;
    private i.c.a.a.l routingLocationInfo_;
    private boolean selectable_;
    private int timeOfDayObsolete_;
    private Object timeOneof_;
    private long timeout_;
    private long useNaiveDetourId_;
    private boolean withGeomertiesObsolete_;
    private boolean withInstructions_;
    private int timeOneofCase_ = 0;
    private int histogramRequestOneOfCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private String tripId_ = "";
    private com.google.v.eo<oi> destination_ = emptyProtobufList();
    private String vehicleType_ = "";
    private com.google.v.eo<i.c.a.a.o> routingOptions_ = emptyProtobufList();
    private String licensePlateSuffix_ = "";
    private com.google.v.eo<oi> waypoint_ = emptyProtobufList();
    private com.google.v.eo<String> permit_ = emptyProtobufList();
    private String useCase_ = "";
    private com.google.v.eo<i.b.aj> debugQueryParams_ = emptyProtobufList();
    private String frequentRouteIdObsolete_ = "";

    static {
        pq pqVar = new pq();
        DEFAULT_INSTANCE = pqVar;
        com.google.v.du.registerDefaultInstance(pq.class, pqVar);
    }

    private pq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDebugQueryParams(Iterable<? extends i.b.aj> iterable) {
        ensureDebugQueryParamsIsMutable();
        com.google.v.c.addAll(iterable, this.debugQueryParams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDestination(Iterable<? extends oi> iterable) {
        ensureDestinationIsMutable();
        com.google.v.c.addAll(iterable, this.destination_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPermit(Iterable<String> iterable) {
        ensurePermitIsMutable();
        com.google.v.c.addAll(iterable, this.permit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoutingOptions(Iterable<? extends i.c.a.a.o> iterable) {
        ensureRoutingOptionsIsMutable();
        com.google.v.c.addAll(iterable, this.routingOptions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoint(Iterable<? extends oi> iterable) {
        ensureWaypointIsMutable();
        com.google.v.c.addAll(iterable, this.waypoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDebugQueryParams(int i2, i.b.aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureDebugQueryParamsIsMutable();
        this.debugQueryParams_.add(i2, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestination(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureDestinationIsMutable();
        this.destination_.add(i2, oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermit(String str) {
        Objects.requireNonNull(str);
        ensurePermitIsMutable();
        this.permit_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPermitBytes(com.google.v.v vVar) {
        ensurePermitIsMutable();
        this.permit_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(i2, oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArriveTime() {
        if (this.timeOneofCase_ == 38) {
            this.timeOneofCase_ = 0;
            this.timeOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSelectRoute() {
        this.bitField0_ &= -16385;
        this.autoSelectRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarpoolParams() {
        this.carpoolParams_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDebugQueryParams() {
        this.debugQueryParams_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestination() {
        this.destination_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaOnlyObsolete() {
        this.bitField0_ &= -67108865;
        this.etaOnlyObsolete_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvData() {
        this.evData_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrequentRouteIdObsolete() {
        this.bitField0_ &= -268435457;
        this.frequentRouteIdObsolete_ = getDefaultInstance().getFrequentRouteIdObsolete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromLoc() {
        this.fromLoc_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpsInfo() {
        this.gpsInfo_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistogramRequestOneOf() {
        this.histogramRequestOneOfCase_ = 0;
        this.histogramRequestOneOf_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLicensePlateSuffix() {
        this.bitField0_ &= -2049;
        this.licensePlateSuffix_ = getDefaultInstance().getLicensePlateSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxGeometries() {
        this.bitField0_ &= -33;
        this.maxGeometries_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxPoints() {
        this.bitField0_ &= -65;
        this.maxPoints_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxRoutes() {
        this.bitField0_ &= -9;
        this.maxRoutes_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxRoutesWithEvents() {
        this.bitField0_ &= -536870913;
        this.maxRoutesWithEvents_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxSegments() {
        this.bitField0_ &= -17;
        this.maxSegments_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationType() {
        this.bitField0_ &= -65537;
        this.navigationType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationTypeObsolete() {
        this.bitField0_ &= -134217729;
        this.navigationTypeObsolete_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermit() {
        this.permit_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRangeCostParams() {
        if (this.histogramRequestOneOfCase_ == 19) {
            this.histogramRequestOneOfCase_ = 0;
            this.histogramRequestOneOf_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReroute() {
        this.bitField0_ &= -513;
        this.reroute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetry() {
        this.bitField0_ &= -1025;
        this.retry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnAdditionalRouteSegmentDetails() {
        this.bitField0_ &= -33554433;
        this.returnAdditionalRouteSegmentDetails_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnClosureImpactInfo() {
        this.bitField1_ &= -17;
        this.returnClosureImpactInfo_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnEventGeometry() {
        this.bitField0_ &= -2097153;
        this.returnEventGeometry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnQuestions() {
        this.bitField0_ &= -8388609;
        this.returnQuestions_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReturnRouteInsights() {
        this.bitField0_ &= -4194305;
        this.returnRouteInsights_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteGeometryParams() {
        this.routeGeometryParams_ = null;
        this.bitField1_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteType() {
        this.bitField0_ &= -32769;
        this.routeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteTypeObsolete() {
        this.bitField1_ &= -5;
        this.routeTypeObsolete_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingLocationInfo() {
        this.routingLocationInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingOptions() {
        this.routingOptions_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectable() {
        this.bitField0_ &= -1073741825;
        this.selectable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowHistogram() {
        if (this.histogramRequestOneOfCase_ == 39) {
            this.histogramRequestOneOfCase_ = 0;
            this.histogramRequestOneOf_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        if (this.timeOneofCase_ == 27) {
            this.timeOneofCase_ = 0;
            this.timeOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOfDayObsolete() {
        this.bitField1_ &= -2;
        this.timeOfDayObsolete_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOneof() {
        this.timeOneofCase_ = 0;
        this.timeOneof_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeout() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.timeout_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTripId() {
        this.bitField0_ &= -3;
        this.tripId_ = getDefaultInstance().getTripId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.bitField0_ &= -262145;
        this.useCase_ = getDefaultInstance().getUseCase();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseNaiveDetourId() {
        this.bitField0_ &= -524289;
        this.useNaiveDetourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVehicleType() {
        this.bitField0_ &= -129;
        this.vehicleType_ = getDefaultInstance().getVehicleType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWithGeomertiesObsolete() {
        this.bitField1_ &= -3;
        this.withGeomertiesObsolete_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWithInstructions() {
        this.bitField0_ &= -1048577;
        this.withInstructions_ = false;
    }

    private void ensureDebugQueryParamsIsMutable() {
        com.google.v.eo<i.b.aj> eoVar = this.debugQueryParams_;
        if (eoVar.c()) {
            return;
        }
        this.debugQueryParams_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureDestinationIsMutable() {
        com.google.v.eo<oi> eoVar = this.destination_;
        if (eoVar.c()) {
            return;
        }
        this.destination_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePermitIsMutable() {
        com.google.v.eo<String> eoVar = this.permit_;
        if (eoVar.c()) {
            return;
        }
        this.permit_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRoutingOptionsIsMutable() {
        com.google.v.eo<i.c.a.a.o> eoVar = this.routingOptions_;
        if (eoVar.c()) {
            return;
        }
        this.routingOptions_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureWaypointIsMutable() {
        com.google.v.eo<oi> eoVar = this.waypoint_;
        if (eoVar.c()) {
            return;
        }
        this.waypoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static pq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCarpoolParams(nu nuVar) {
        Objects.requireNonNull(nuVar);
        nu nuVar2 = this.carpoolParams_;
        if (nuVar2 != null && nuVar2 != nu.getDefaultInstance()) {
            nt ntVarNewBuilder = nu.newBuilder(nuVar2);
            ntVarNewBuilder.mergeFrom((nt) nuVar);
            nuVar = ntVarNewBuilder.buildPartial();
        }
        this.carpoolParams_ = nuVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvData(on onVar) {
        Objects.requireNonNull(onVar);
        on onVar2 = this.evData_;
        if (onVar2 != null && onVar2 != on.getDefaultInstance()) {
            om omVarNewBuilder = on.newBuilder(onVar2);
            omVarNewBuilder.mergeFrom((om) onVar);
            onVar = omVarNewBuilder.buildPartial();
        }
        this.evData_ = onVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFromLoc(or orVar) {
        Objects.requireNonNull(orVar);
        or orVar2 = this.fromLoc_;
        if (orVar2 != null && orVar2 != or.getDefaultInstance()) {
            oq oqVarNewBuilder = or.newBuilder(orVar2);
            oqVarNewBuilder.mergeFrom((oq) orVar);
            orVar = oqVarNewBuilder.buildPartial();
        }
        this.fromLoc_ = orVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGpsInfo(op opVar) {
        Objects.requireNonNull(opVar);
        op opVar2 = this.gpsInfo_;
        if (opVar2 != null && opVar2 != op.getDefaultInstance()) {
            oo ooVarNewBuilder = op.newBuilder(opVar2);
            ooVarNewBuilder.mergeFrom((oo) opVar);
            opVar = ooVarNewBuilder.buildPartial();
        }
        this.gpsInfo_ = opVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(i.b.ae aeVar) {
        Objects.requireNonNull(aeVar);
        i.b.ae aeVar2 = this.options_;
        if (aeVar2 != null && aeVar2 != i.b.ae.getDefaultInstance()) {
            i.b.ad adVarNewBuilder = i.b.ae.newBuilder(aeVar2);
            adVarNewBuilder.mergeFrom((i.b.ad) aeVar);
            aeVar = adVarNewBuilder.buildPartial();
        }
        this.options_ = aeVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRangeCostParams(ow owVar) {
        Objects.requireNonNull(owVar);
        if (this.histogramRequestOneOfCase_ == 19 && this.histogramRequestOneOf_ != ow.getDefaultInstance()) {
            ov ovVarNewBuilder = ow.newBuilder((ow) this.histogramRequestOneOf_);
            ovVarNewBuilder.mergeFrom((ov) owVar);
            owVar = ovVarNewBuilder.buildPartial();
        }
        this.histogramRequestOneOf_ = owVar;
        this.histogramRequestOneOfCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteGeometryParams(pl plVar) {
        Objects.requireNonNull(plVar);
        pl plVar2 = this.routeGeometryParams_;
        if (plVar2 != null && plVar2 != pl.getDefaultInstance()) {
            pk pkVarNewBuilder = pl.newBuilder(plVar2);
            pkVarNewBuilder.mergeFrom((pk) plVar);
            plVar = pkVarNewBuilder.buildPartial();
        }
        this.routeGeometryParams_ = plVar;
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoutingLocationInfo(i.c.a.a.l lVar) {
        Objects.requireNonNull(lVar);
        i.c.a.a.l lVar2 = this.routingLocationInfo_;
        if (lVar2 != null && lVar2 != i.c.a.a.l.getDefaultInstance()) {
            i.c.a.a.e eVarNewBuilder = i.c.a.a.l.newBuilder(lVar2);
            eVarNewBuilder.mergeFrom((i.c.a.a.e) lVar);
            lVar = eVarNewBuilder.buildPartial();
        }
        this.routingLocationInfo_ = lVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeShowHistogram(ot otVar) {
        Objects.requireNonNull(otVar);
        if (this.histogramRequestOneOfCase_ == 39 && this.histogramRequestOneOf_ != ot.getDefaultInstance()) {
            os osVarNewBuilder = ot.newBuilder((ot) this.histogramRequestOneOf_);
            osVarNewBuilder.mergeFrom((os) otVar);
            otVar = osVarNewBuilder.buildPartial();
        }
        this.histogramRequestOneOf_ = otVar;
        this.histogramRequestOneOfCase_ = 39;
    }

    public static pn newBuilder() {
        return (pn) DEFAULT_INSTANCE.createBuilder();
    }

    public static pq parseDelimitedFrom(InputStream inputStream) {
        return (pq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pq parseFrom(com.google.v.v vVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<pq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDebugQueryParams(int i2) {
        ensureDebugQueryParamsIsMutable();
        this.debugQueryParams_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDestination(int i2) {
        ensureDestinationIsMutable();
        this.destination_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoutingOptions(int i2) {
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoint(int i2) {
        ensureWaypointIsMutable();
        this.waypoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArriveTime(long j2) {
        this.timeOneofCase_ = 38;
        this.timeOneof_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSelectRoute(boolean z) {
        this.bitField0_ |= 16384;
        this.autoSelectRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarpoolParams(nu nuVar) {
        Objects.requireNonNull(nuVar);
        this.carpoolParams_ = nuVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDebugQueryParams(int i2, i.b.aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureDebugQueryParamsIsMutable();
        this.debugQueryParams_.set(i2, ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestination(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureDestinationIsMutable();
        this.destination_.set(i2, oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaOnlyObsolete(boolean z) {
        this.bitField0_ |= 67108864;
        this.etaOnlyObsolete_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvData(on onVar) {
        Objects.requireNonNull(onVar);
        this.evData_ = onVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequentRouteIdObsolete(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.frequentRouteIdObsolete_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequentRouteIdObsoleteBytes(com.google.v.v vVar) {
        this.frequentRouteIdObsolete_ = vVar.u();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromLoc(or orVar) {
        Objects.requireNonNull(orVar);
        this.fromLoc_ = orVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpsInfo(op opVar) {
        Objects.requireNonNull(opVar);
        this.gpsInfo_ = opVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i2) {
        this.bitField0_ |= 1;
        this.id_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffix(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2048;
        this.licensePlateSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLicensePlateSuffixBytes(com.google.v.v vVar) {
        this.licensePlateSuffix_ = vVar.u();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxGeometries(int i2) {
        this.bitField0_ |= 32;
        this.maxGeometries_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxPoints(int i2) {
        this.bitField0_ |= 64;
        this.maxPoints_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxRoutes(int i2) {
        this.bitField0_ |= 8;
        this.maxRoutes_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxRoutesWithEvents(int i2) {
        this.bitField0_ |= 536870912;
        this.maxRoutesWithEvents_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxSegments(int i2) {
        this.bitField0_ |= 16;
        this.maxSegments_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationType(ou ouVar) {
        this.navigationType_ = ouVar.getNumber();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationTypeObsolete(int i2) {
        this.bitField0_ |= 134217728;
        this.navigationTypeObsolete_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(i.b.ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.options_ = aeVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermit(int i2, String str) {
        Objects.requireNonNull(str);
        ensurePermitIsMutable();
        this.permit_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRangeCostParams(ow owVar) {
        Objects.requireNonNull(owVar);
        this.histogramRequestOneOf_ = owVar;
        this.histogramRequestOneOfCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReroute(boolean z) {
        this.bitField0_ |= 512;
        this.reroute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetry(boolean z) {
        this.bitField0_ |= 1024;
        this.retry_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnAdditionalRouteSegmentDetails(boolean z) {
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.returnAdditionalRouteSegmentDetails_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnClosureImpactInfo(boolean z) {
        this.bitField1_ |= 16;
        this.returnClosureImpactInfo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnEventGeometry(boolean z) {
        this.bitField0_ |= 2097152;
        this.returnEventGeometry_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnQuestions(boolean z) {
        this.bitField0_ |= 8388608;
        this.returnQuestions_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReturnRouteInsights(boolean z) {
        this.bitField0_ |= 4194304;
        this.returnRouteInsights_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteGeometryParams(pl plVar) {
        Objects.requireNonNull(plVar);
        this.routeGeometryParams_ = plVar;
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteType(pm pmVar) {
        this.routeType_ = pmVar.getNumber();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteTypeObsolete(int i2) {
        this.bitField1_ |= 4;
        this.routeTypeObsolete_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingLocationInfo(i.c.a.a.l lVar) {
        Objects.requireNonNull(lVar);
        this.routingLocationInfo_ = lVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingOptions(int i2, i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectable(boolean z) {
        this.bitField0_ |= 1073741824;
        this.selectable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowHistogram(ot otVar) {
        Objects.requireNonNull(otVar);
        this.histogramRequestOneOf_ = otVar;
        this.histogramRequestOneOfCase_ = 39;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(long j2) {
        this.timeOneofCase_ = 27;
        this.timeOneof_ = Long.valueOf(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOfDayObsolete(int i2) {
        this.bitField1_ |= 1;
        this.timeOfDayObsolete_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeout(long j2) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.timeout_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.tripId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTripIdBytes(com.google.v.v vVar) {
        this.tripId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCase(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 262144;
        this.useCase_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCaseBytes(com.google.v.v vVar) {
        this.useCase_ = vVar.u();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseNaiveDetourId(long j2) {
        this.bitField0_ |= 524288;
        this.useNaiveDetourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleType(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.vehicleType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVehicleTypeBytes(com.google.v.v vVar) {
        this.vehicleType_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(int i2, oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.set(i2, oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWithGeomertiesObsolete(boolean z) {
        this.bitField1_ |= 2;
        this.withGeomertiesObsolete_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWithInstructions(boolean z) {
        this.bitField0_ |= 1048576;
        this.withInstructions_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001.\u0002\u0002\u0001/.\u0000\u0005\u0002\u0001င\u0000\u0002င\"\u0003ဈ\u0001\u0004င\u0003\u0005င\u0004\u0006င\u0006\u0007ဉ\u0002\bЛ\tဇ!\nဇ\u0014\u000bဉ\b\fင \rဇ\t\u000eဇ\n\u000fင\u001b\u0010ဈ\u001c\u0011ဈ\u000b\u0012ဈ\u0007\u0013<\u0001\u0014ဇ\u001a\u0015ဉ\f\u0016Л\u0017ဇ\u000e\u0018င\u0005\u0019᠌\u000f\u001a᠌\u0010\u001b5\u0000\u001c\u001a\u001dင\u001d\u001eဇ\u001e\u001fဉ\u0011 ဂ\u001f!ဈ\u0012\"ဂ\u0013#ဇ\u0015$ဇ\u0016%ဇ\u0017&5\u0000'<\u0001(\u001b)ဉ\u0018*\u001b+ဇ\u0019,ဉ#-ဇ$/ဉ\r", new Object[]{"timeOneof_", "timeOneofCase_", "histogramRequestOneOf_", "histogramRequestOneOfCase_", "bitField0_", "bitField1_", "id_", "routeTypeObsolete_", "tripId_", "maxRoutes_", "maxSegments_", "maxPoints_", "fromLoc_", "destination_", oi.class, "withGeomertiesObsolete_", "withInstructions_", "options_", "timeOfDayObsolete_", "reroute_", "retry_", "navigationTypeObsolete_", "frequentRouteIdObsolete_", "licensePlateSuffix_", "vehicleType_", ow.class, "etaOnlyObsolete_", "gpsInfo_", "waypoint_", oi.class, "autoSelectRoute_", "maxGeometries_", "routeType_", pa.f48956e, "navigationType_", pa.f48953b, "permit_", "maxRoutesWithEvents_", "selectable_", "carpoolParams_", "timeout_", "useCase_", "useNaiveDetourId_", "returnEventGeometry_", "returnRouteInsights_", "returnQuestions_", ot.class, "debugQueryParams_", i.b.aj.class, "evData_", "routingOptions_", i.c.a.a.o.class, "returnAdditionalRouteSegmentDetails_", "routeGeometryParams_", "returnClosureImpactInfo_", "routingLocationInfo_"});
            case 3:
                return new pq();
            case 4:
                return new pn(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<pq> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (pq.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public long getArriveTime() {
        if (this.timeOneofCase_ == 38) {
            return ((Long) this.timeOneof_).longValue();
        }
        return 0L;
    }

    public boolean getAutoSelectRoute() {
        return this.autoSelectRoute_;
    }

    public nu getCarpoolParams() {
        nu nuVar = this.carpoolParams_;
        return nuVar == null ? nu.getDefaultInstance() : nuVar;
    }

    public i.b.aj getDebugQueryParams(int i2) {
        return this.debugQueryParams_.get(i2);
    }

    public int getDebugQueryParamsCount() {
        return this.debugQueryParams_.size();
    }

    public List<i.b.aj> getDebugQueryParamsList() {
        return this.debugQueryParams_;
    }

    public i.b.ak getDebugQueryParamsOrBuilder(int i2) {
        return this.debugQueryParams_.get(i2);
    }

    public List<? extends i.b.ak> getDebugQueryParamsOrBuilderList() {
        return this.debugQueryParams_;
    }

    public oi getDestination(int i2) {
        return this.destination_.get(i2);
    }

    public int getDestinationCount() {
        return this.destination_.size();
    }

    public List<oi> getDestinationList() {
        return this.destination_;
    }

    public oj getDestinationOrBuilder(int i2) {
        return this.destination_.get(i2);
    }

    public List<? extends oj> getDestinationOrBuilderList() {
        return this.destination_;
    }

    @Deprecated
    public boolean getEtaOnlyObsolete() {
        return this.etaOnlyObsolete_;
    }

    public on getEvData() {
        on onVar = this.evData_;
        return onVar == null ? on.getDefaultInstance() : onVar;
    }

    @Deprecated
    public String getFrequentRouteIdObsolete() {
        return this.frequentRouteIdObsolete_;
    }

    @Deprecated
    public com.google.v.v getFrequentRouteIdObsoleteBytes() {
        return com.google.v.v.s(this.frequentRouteIdObsolete_);
    }

    public or getFromLoc() {
        or orVar = this.fromLoc_;
        return orVar == null ? or.getDefaultInstance() : orVar;
    }

    public op getGpsInfo() {
        op opVar = this.gpsInfo_;
        return opVar == null ? op.getDefaultInstance() : opVar;
    }

    public po getHistogramRequestOneOfCase() {
        int i2 = this.histogramRequestOneOfCase_;
        if (i2 == 0) {
            return po.f49001c;
        }
        if (i2 == 19) {
            return po.f48999a;
        }
        if (i2 != 39) {
            return null;
        }
        return po.f49000b;
    }

    public int getId() {
        return this.id_;
    }

    public String getLicensePlateSuffix() {
        return this.licensePlateSuffix_;
    }

    public com.google.v.v getLicensePlateSuffixBytes() {
        return com.google.v.v.s(this.licensePlateSuffix_);
    }

    public int getMaxGeometries() {
        return this.maxGeometries_;
    }

    public int getMaxPoints() {
        return this.maxPoints_;
    }

    public int getMaxRoutes() {
        return this.maxRoutes_;
    }

    @Deprecated
    public int getMaxRoutesWithEvents() {
        return this.maxRoutesWithEvents_;
    }

    public int getMaxSegments() {
        return this.maxSegments_;
    }

    public ou getNavigationType() {
        ou ouVarA = ou.a(this.navigationType_);
        return ouVarA == null ? ou.NO_NAV_TYPE : ouVarA;
    }

    @Deprecated
    public int getNavigationTypeObsolete() {
        return this.navigationTypeObsolete_;
    }

    @Deprecated
    public i.b.ae getOptions() {
        i.b.ae aeVar = this.options_;
        return aeVar == null ? i.b.ae.getDefaultInstance() : aeVar;
    }

    public String getPermit(int i2) {
        return this.permit_.get(i2);
    }

    public com.google.v.v getPermitBytes(int i2) {
        return com.google.v.v.s(this.permit_.get(i2));
    }

    public int getPermitCount() {
        return this.permit_.size();
    }

    public List<String> getPermitList() {
        return this.permit_;
    }

    public ow getRangeCostParams() {
        return this.histogramRequestOneOfCase_ == 19 ? (ow) this.histogramRequestOneOf_ : ow.getDefaultInstance();
    }

    public boolean getReroute() {
        return this.reroute_;
    }

    public boolean getRetry() {
        return this.retry_;
    }

    public boolean getReturnAdditionalRouteSegmentDetails() {
        return this.returnAdditionalRouteSegmentDetails_;
    }

    public boolean getReturnClosureImpactInfo() {
        return this.returnClosureImpactInfo_;
    }

    public boolean getReturnEventGeometry() {
        return this.returnEventGeometry_;
    }

    public boolean getReturnQuestions() {
        return this.returnQuestions_;
    }

    public boolean getReturnRouteInsights() {
        return this.returnRouteInsights_;
    }

    public pl getRouteGeometryParams() {
        pl plVar = this.routeGeometryParams_;
        return plVar == null ? pl.getDefaultInstance() : plVar;
    }

    public pm getRouteType() {
        pm pmVarA = pm.a(this.routeType_);
        return pmVarA == null ? pm.NO_ROUTE_TYPE : pmVarA;
    }

    @Deprecated
    public int getRouteTypeObsolete() {
        return this.routeTypeObsolete_;
    }

    public i.c.a.a.l getRoutingLocationInfo() {
        i.c.a.a.l lVar = this.routingLocationInfo_;
        return lVar == null ? i.c.a.a.l.getDefaultInstance() : lVar;
    }

    public i.c.a.a.o getRoutingOptions(int i2) {
        return this.routingOptions_.get(i2);
    }

    public int getRoutingOptionsCount() {
        return this.routingOptions_.size();
    }

    public List<i.c.a.a.o> getRoutingOptionsList() {
        return this.routingOptions_;
    }

    public i.c.a.a.p getRoutingOptionsOrBuilder(int i2) {
        return this.routingOptions_.get(i2);
    }

    public List<? extends i.c.a.a.p> getRoutingOptionsOrBuilderList() {
        return this.routingOptions_;
    }

    @Deprecated
    public boolean getSelectable() {
        return this.selectable_;
    }

    public ot getShowHistogram() {
        return this.histogramRequestOneOfCase_ == 39 ? (ot) this.histogramRequestOneOf_ : ot.getDefaultInstance();
    }

    public long getStartTime() {
        if (this.timeOneofCase_ == 27) {
            return ((Long) this.timeOneof_).longValue();
        }
        return 0L;
    }

    @Deprecated
    public int getTimeOfDayObsolete() {
        return this.timeOfDayObsolete_;
    }

    public pp getTimeOneofCase() {
        int i2 = this.timeOneofCase_;
        if (i2 == 0) {
            return pp.f49005c;
        }
        if (i2 == 27) {
            return pp.f49003a;
        }
        if (i2 != 38) {
            return null;
        }
        return pp.f49004b;
    }

    @Deprecated
    public long getTimeout() {
        return this.timeout_;
    }

    public String getTripId() {
        return this.tripId_;
    }

    public com.google.v.v getTripIdBytes() {
        return com.google.v.v.s(this.tripId_);
    }

    public String getUseCase() {
        return this.useCase_;
    }

    public com.google.v.v getUseCaseBytes() {
        return com.google.v.v.s(this.useCase_);
    }

    public long getUseNaiveDetourId() {
        return this.useNaiveDetourId_;
    }

    public String getVehicleType() {
        return this.vehicleType_;
    }

    public com.google.v.v getVehicleTypeBytes() {
        return com.google.v.v.s(this.vehicleType_);
    }

    public oi getWaypoint(int i2) {
        return this.waypoint_.get(i2);
    }

    public int getWaypointCount() {
        return this.waypoint_.size();
    }

    public List<oi> getWaypointList() {
        return this.waypoint_;
    }

    public oj getWaypointOrBuilder(int i2) {
        return this.waypoint_.get(i2);
    }

    public List<? extends oj> getWaypointOrBuilderList() {
        return this.waypoint_;
    }

    @Deprecated
    public boolean getWithGeomertiesObsolete() {
        return this.withGeomertiesObsolete_;
    }

    public boolean getWithInstructions() {
        return this.withInstructions_;
    }

    public boolean hasArriveTime() {
        return this.timeOneofCase_ == 38;
    }

    public boolean hasAutoSelectRoute() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasCarpoolParams() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Deprecated
    public boolean hasEtaOnlyObsolete() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasEvData() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Deprecated
    public boolean hasFrequentRouteIdObsolete() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasFromLoc() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGpsInfo() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLicensePlateSuffix() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasMaxGeometries() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMaxPoints() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMaxRoutes() {
        return (this.bitField0_ & 8) != 0;
    }

    @Deprecated
    public boolean hasMaxRoutesWithEvents() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasMaxSegments() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNavigationType() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Deprecated
    public boolean hasNavigationTypeObsolete() {
        return (this.bitField0_ & 134217728) != 0;
    }

    @Deprecated
    public boolean hasOptions() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasRangeCostParams() {
        return this.histogramRequestOneOfCase_ == 19;
    }

    public boolean hasReroute() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasRetry() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasReturnAdditionalRouteSegmentDetails() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasReturnClosureImpactInfo() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasReturnEventGeometry() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasReturnQuestions() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasReturnRouteInsights() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasRouteGeometryParams() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasRouteType() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Deprecated
    public boolean hasRouteTypeObsolete() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasRoutingLocationInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Deprecated
    public boolean hasSelectable() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasShowHistogram() {
        return this.histogramRequestOneOfCase_ == 39;
    }

    public boolean hasStartTime() {
        return this.timeOneofCase_ == 27;
    }

    @Deprecated
    public boolean hasTimeOfDayObsolete() {
        return (this.bitField1_ & 1) != 0;
    }

    @Deprecated
    public boolean hasTimeout() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasTripId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUseCase() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasUseNaiveDetourId() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasVehicleType() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasWithGeomertiesObsolete() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasWithInstructions() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public static pn newBuilder(pq pqVar) {
        return (pn) DEFAULT_INSTANCE.createBuilder(pqVar);
    }

    public static pq parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pq) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pq parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static pq parseFrom(com.google.v.z zVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static pq parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDebugQueryParams(i.b.aj ajVar) {
        Objects.requireNonNull(ajVar);
        ensureDebugQueryParamsIsMutable();
        this.debugQueryParams_.add(ajVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDestination(oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureDestinationIsMutable();
        this.destination_.add(oiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutingOptions(i.c.a.a.o oVar) {
        Objects.requireNonNull(oVar);
        ensureRoutingOptionsIsMutable();
        this.routingOptions_.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(oi oiVar) {
        Objects.requireNonNull(oiVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(oiVar);
    }

    public static pq parseFrom(InputStream inputStream) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static pq parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static pq parseFrom(ByteBuffer byteBuffer) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static pq parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static pq parseFrom(byte[] bArr) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static pq parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (pq) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
