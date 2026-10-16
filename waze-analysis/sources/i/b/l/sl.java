package i.b.l;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class sl extends com.google.v.du<sl, sk> implements sq {
    public static final int ALTDESCRIPTION_FIELD_NUMBER = 4;
    public static final int ALTERNATIVESHAVEHOV_FIELD_NUMBER = 25;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 49;
    public static final int ALTGROUPCOMMENT_FIELD_NUMBER = 28;
    public static final int ALTID_FIELD_NUMBER = 3;
    public static final int AREAS_FIELD_NUMBER = 31;
    public static final int ATTRIBUTES_FIELD_NUMBER = 8;
    public static final int CARBONEMISSIONSGRAMS_FIELD_NUMBER = 51;
    public static final int COSTFORTIME_FIELD_NUMBER = 14;
    public static final int CURRENCY_FIELD_NUMBER = 27;
    public static final int CURRENTENTRYPOINT_FIELD_NUMBER = 38;
    private static final sl DEFAULT_INSTANCE;
    public static final int DESTINATIONID_FIELD_NUMBER = 1;
    public static final int ENTRYPOINTOBSOLETE_FIELD_NUMBER = 34;
    public static final int ETA_HISTOGRAM_FIELD_NUMBER = 48;
    public static final int EVENTOFFROUTE_FIELD_NUMBER = 42;
    public static final int EVENTONROUTE_FIELD_NUMBER = 18;
    public static final int EXPLAINABILITY_HINT_FIELD_NUMBER = 57;
    public static final int HOVROUTEINFO_FIELD_NUMBER = 23;
    public static final int ISINVALIDFORPRIVATEVEHICLE_FIELD_NUMBER = 39;
    public static final int LABEL_FIELD_NUMBER = 41;
    public static final int LOWERSPEEDITINERARY_FIELD_NUMBER = 52;
    public static final int MTEINFO_FIELD_NUMBER = 55;
    public static final int NEEDEDPERMIT_FIELD_NUMBER = 24;
    public static final int NUMEVENTSONROUTEOBSOLETE_FIELD_NUMBER = 10;
    public static final int NUMSEGMENTS_FIELD_NUMBER = 7;
    public static final int ORIGINOBSOLETE_FIELD_NUMBER = 9;
    public static final int OTHERUSERIDOBSOLETE_FIELD_NUMBER = 13;
    private static volatile com.google.v.fo<sl> PARSER = null;
    public static final int QUESTION_FIELD_NUMBER = 33;
    public static final int REQUIRED_PERMITS_FIELD_NUMBER = 50;
    public static final int ROUTEGEOMETRY_FIELD_NUMBER = 56;
    public static final int ROUTEINSIGHT_FIELD_NUMBER = 40;
    public static final int ROUTEPOINT_FIELD_NUMBER = 19;
    public static final int ROUTESEGMENT_FIELD_NUMBER = 20;
    public static final int ROUTE_ATTR_FIELD_NUMBER = 45;
    public static final int ROUTE_TYPE_FIELD_NUMBER = 44;
    public static final int ROUTINGSTATUSOBSOLETE_FIELD_NUMBER = 22;
    public static final int STATUSOBSOLETE_FIELD_NUMBER = 2;
    public static final int TIME2PARKSECONDSOBSOLETE_FIELD_NUMBER = 15;
    public static final int TOLLPRICEINFO_FIELD_NUMBER = 37;
    public static final int TOLLPRICE_FIELD_NUMBER = 26;
    public static final int TOTALHISTORICSECONDS_FIELD_NUMBER = 43;
    public static final int TOTALLENGTH_FIELD_NUMBER = 5;
    public static final int TOTALSECONDS_FIELD_NUMBER = 6;
    public static final int TRAFFICCOMMENTWITHARGUMENTS_FIELD_NUMBER = 53;
    public static final int TRAFFICCOMMENT_FIELD_NUMBER = 12;
    public static final int VOICETRAFFICCOMMENTWITHARGUMENTS_FIELD_NUMBER = 54;
    public static final int VOICETRAFFICCOMMENT_FIELD_NUMBER = 17;
    public static final int WAYPOINT_FIELD_NUMBER = 21;
    private long altId_;
    private boolean alternativesHaveHov_;
    private sn attributes_;
    private int bitField0_;
    private int bitField1_;
    private long carbonEmissionsGrams_;
    private long costForTime_;
    private i.b.v.bi currentEntryPoint_;
    private long destinationId_;
    private rj explainabilityHint_;
    private rq hovRouteInfo_;
    private boolean isInvalidForPrivateVehicle_;
    private sg label_;
    private rs lowerSpeedItinerary_;
    private sp mteInfo_;
    private long numEventsOnRouteObsolete_;
    private long numSegments_;
    private long originObsolete_;
    private long otherUserIdObsolete_;
    private rz routeGeometry_;
    private int routingStatusObsolete_;
    private long statusObsolete_;
    private long time2ParkSecondsObsolete_;
    private su tollPriceInfo_;
    private double tollPrice_;
    private long totalHistoricSeconds_;
    private long totalLength_;
    private long totalSeconds_;
    private i.b.ao trafficCommentWithArguments_;
    private i.b.ao voiceTrafficCommentWithArguments_;
    private static final com.google.v.el<i.c.a.a.d> routeType_converter_ = new ff(14);
    private static final com.google.v.el<i.c.a.a.c> routeAttr_converter_ = new ff(15);
    private byte memoizedIsInitialized = 2;
    private String alternativeRouteUuid_ = "";
    private String altDescription_ = "";
    private String trafficComment_ = "";
    private String voiceTrafficComment_ = "";
    private com.google.v.eo<rf> eventOnRoute_ = emptyProtobufList();
    private com.google.v.eo<i.b.s> routePoint_ = emptyProtobufList();
    private com.google.v.eo<si> routeSegment_ = emptyProtobufList();
    private com.google.v.eo<sw> waypoint_ = emptyProtobufList();
    private com.google.v.eo<String> neededPermit_ = emptyProtobufList();
    private String currency_ = "";
    private com.google.v.eo<String> altGroupComment_ = emptyProtobufList();
    private com.google.v.eo<String> areas_ = emptyProtobufList();
    private com.google.v.eo<String> requiredPermits_ = emptyProtobufList();
    private com.google.v.eo<i.b.k.o> question_ = emptyProtobufList();
    private com.google.v.eo<sd> routeInsight_ = emptyProtobufList();
    private com.google.v.ek routeType_ = emptyIntList();
    private com.google.v.ek routeAttr_ = emptyIntList();
    private com.google.v.eo<rn> etaHistogram_ = emptyProtobufList();
    private String entryPointObsolete_ = "";
    private com.google.v.eo<rf> eventOffRoute_ = emptyProtobufList();

    static {
        sl slVar = new sl();
        DEFAULT_INSTANCE = slVar;
        com.google.v.du.registerDefaultInstance(sl.class, slVar);
    }

    private sl() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAltGroupComment(Iterable<String> iterable) {
        ensureAltGroupCommentIsMutable();
        com.google.v.c.addAll(iterable, this.altGroupComment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAreas(Iterable<String> iterable) {
        ensureAreasIsMutable();
        com.google.v.c.addAll(iterable, this.areas_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEtaHistogram(Iterable<? extends rn> iterable) {
        ensureEtaHistogramIsMutable();
        com.google.v.c.addAll(iterable, this.etaHistogram_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEventOffRoute(Iterable<? extends rf> iterable) {
        ensureEventOffRouteIsMutable();
        com.google.v.c.addAll(iterable, this.eventOffRoute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEventOnRoute(Iterable<? extends rf> iterable) {
        ensureEventOnRouteIsMutable();
        com.google.v.c.addAll(iterable, this.eventOnRoute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNeededPermit(Iterable<String> iterable) {
        ensureNeededPermitIsMutable();
        com.google.v.c.addAll(iterable, this.neededPermit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQuestion(Iterable<? extends i.b.k.o> iterable) {
        ensureQuestionIsMutable();
        com.google.v.c.addAll(iterable, this.question_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequiredPermits(Iterable<String> iterable) {
        ensureRequiredPermitsIsMutable();
        com.google.v.c.addAll(iterable, this.requiredPermits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteAttr(Iterable<? extends i.c.a.a.c> iterable) {
        ensureRouteAttrIsMutable();
        Iterator<? extends i.c.a.a.c> it = iterable.iterator();
        while (it.hasNext()) {
            this.routeAttr_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteInsight(Iterable<? extends sd> iterable) {
        ensureRouteInsightIsMutable();
        com.google.v.c.addAll(iterable, this.routeInsight_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoutePoint(Iterable<? extends i.b.s> iterable) {
        ensureRoutePointIsMutable();
        com.google.v.c.addAll(iterable, this.routePoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteSegment(Iterable<? extends si> iterable) {
        ensureRouteSegmentIsMutable();
        com.google.v.c.addAll(iterable, this.routeSegment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRouteType(Iterable<? extends i.c.a.a.d> iterable) {
        ensureRouteTypeIsMutable();
        Iterator<? extends i.c.a.a.d> it = iterable.iterator();
        while (it.hasNext()) {
            this.routeType_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoint(Iterable<? extends sw> iterable) {
        ensureWaypointIsMutable();
        com.google.v.c.addAll(iterable, this.waypoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAltGroupComment(String str) {
        Objects.requireNonNull(str);
        ensureAltGroupCommentIsMutable();
        this.altGroupComment_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAltGroupCommentBytes(com.google.v.v vVar) {
        ensureAltGroupCommentIsMutable();
        this.altGroupComment_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAreas(String str) {
        Objects.requireNonNull(str);
        ensureAreasIsMutable();
        this.areas_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAreasBytes(com.google.v.v vVar) {
        ensureAreasIsMutable();
        this.areas_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEtaHistogram(int i2, rn rnVar) {
        Objects.requireNonNull(rnVar);
        ensureEtaHistogramIsMutable();
        this.etaHistogram_.add(i2, rnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventOffRoute(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOffRouteIsMutable();
        this.eventOffRoute_.add(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventOnRoute(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOnRouteIsMutable();
        this.eventOnRoute_.add(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNeededPermit(String str) {
        Objects.requireNonNull(str);
        ensureNeededPermitIsMutable();
        this.neededPermit_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNeededPermitBytes(com.google.v.v vVar) {
        ensureNeededPermitIsMutable();
        this.neededPermit_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuestion(int i2, i.b.k.o oVar) {
        Objects.requireNonNull(oVar);
        ensureQuestionIsMutable();
        this.question_.add(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermits(String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermitsBytes(com.google.v.v vVar) {
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteAttr(i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureRouteAttrIsMutable();
        this.routeAttr_.i(cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteInsight(int i2, sd sdVar) {
        Objects.requireNonNull(sdVar);
        ensureRouteInsightIsMutable();
        this.routeInsight_.add(i2, sdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutePoint(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.add(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteSegment(int i2, si siVar) {
        Objects.requireNonNull(siVar);
        ensureRouteSegmentIsMutable();
        this.routeSegment_.add(i2, siVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteType(i.c.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        ensureRouteTypeIsMutable();
        this.routeType_.i(dVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(int i2, sw swVar) {
        Objects.requireNonNull(swVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(i2, swVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltDescription() {
        this.bitField0_ &= -9;
        this.altDescription_ = getDefaultInstance().getAltDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltGroupComment() {
        this.altGroupComment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltId() {
        this.bitField0_ &= -3;
        this.altId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -5;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativesHaveHov() {
        this.bitField0_ &= -8193;
        this.alternativesHaveHov_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAreas() {
        this.areas_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarbonEmissionsGrams() {
        this.bitField0_ &= -65;
        this.carbonEmissionsGrams_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCostForTime() {
        this.bitField0_ &= -2049;
        this.costForTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrency() {
        this.bitField0_ &= -32769;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentEntryPoint() {
        this.currentEntryPoint_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestinationId() {
        this.bitField0_ &= -2;
        this.destinationId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryPointObsolete() {
        this.bitField0_ &= -33554433;
        this.entryPointObsolete_ = getDefaultInstance().getEntryPointObsolete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEtaHistogram() {
        this.etaHistogram_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventOffRoute() {
        this.eventOffRoute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventOnRoute() {
        this.eventOnRoute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExplainabilityHint() {
        this.explainabilityHint_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHovRouteInfo() {
        this.hovRouteInfo_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInvalidForPrivateVehicle() {
        this.bitField0_ &= -262145;
        this.isInvalidForPrivateVehicle_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLowerSpeedItinerary() {
        this.lowerSpeedItinerary_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMteInfo() {
        this.mteInfo_ = null;
        this.bitField1_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNeededPermit() {
        this.neededPermit_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumEventsOnRouteObsolete() {
        this.bitField0_ &= -134217729;
        this.numEventsOnRouteObsolete_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumSegments() {
        this.bitField0_ &= -129;
        this.numSegments_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginObsolete() {
        this.bitField0_ &= -67108865;
        this.originObsolete_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOtherUserIdObsolete() {
        this.bitField0_ &= -536870913;
        this.otherUserIdObsolete_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestion() {
        this.question_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiredPermits() {
        this.requiredPermits_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteAttr() {
        this.routeAttr_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteGeometry() {
        this.routeGeometry_ = null;
        this.bitField1_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInsight() {
        this.routeInsight_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutePoint() {
        this.routePoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteSegment() {
        this.routeSegment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteType() {
        this.routeType_ = emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingStatusObsolete() {
        this.bitField0_ &= -8388609;
        this.routingStatusObsolete_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusObsolete() {
        this.bitField0_ &= -16777217;
        this.statusObsolete_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime2ParkSecondsObsolete() {
        this.bitField0_ &= -268435457;
        this.time2ParkSecondsObsolete_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -16385;
        this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPriceInfo() {
        this.tollPriceInfo_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalHistoricSeconds() {
        this.bitField0_ &= -1048577;
        this.totalHistoricSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLength() {
        this.bitField0_ &= -17;
        this.totalLength_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSeconds() {
        this.bitField0_ &= -33;
        this.totalSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficComment() {
        this.bitField0_ &= -513;
        this.trafficComment_ = getDefaultInstance().getTrafficComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficCommentWithArguments() {
        this.trafficCommentWithArguments_ = null;
        this.bitField0_ &= -1073741825;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceTrafficComment() {
        this.bitField0_ &= -1025;
        this.voiceTrafficComment_ = getDefaultInstance().getVoiceTrafficComment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceTrafficCommentWithArguments() {
        this.voiceTrafficCommentWithArguments_ = null;
        this.bitField0_ &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoint() {
        this.waypoint_ = emptyProtobufList();
    }

    private void ensureAltGroupCommentIsMutable() {
        com.google.v.eo<String> eoVar = this.altGroupComment_;
        if (eoVar.c()) {
            return;
        }
        this.altGroupComment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAreasIsMutable() {
        com.google.v.eo<String> eoVar = this.areas_;
        if (eoVar.c()) {
            return;
        }
        this.areas_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEtaHistogramIsMutable() {
        com.google.v.eo<rn> eoVar = this.etaHistogram_;
        if (eoVar.c()) {
            return;
        }
        this.etaHistogram_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEventOffRouteIsMutable() {
        com.google.v.eo<rf> eoVar = this.eventOffRoute_;
        if (eoVar.c()) {
            return;
        }
        this.eventOffRoute_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureEventOnRouteIsMutable() {
        com.google.v.eo<rf> eoVar = this.eventOnRoute_;
        if (eoVar.c()) {
            return;
        }
        this.eventOnRoute_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNeededPermitIsMutable() {
        com.google.v.eo<String> eoVar = this.neededPermit_;
        if (eoVar.c()) {
            return;
        }
        this.neededPermit_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureQuestionIsMutable() {
        com.google.v.eo<i.b.k.o> eoVar = this.question_;
        if (eoVar.c()) {
            return;
        }
        this.question_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRequiredPermitsIsMutable() {
        com.google.v.eo<String> eoVar = this.requiredPermits_;
        if (eoVar.c()) {
            return;
        }
        this.requiredPermits_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRouteAttrIsMutable() {
        com.google.v.ek ekVar = this.routeAttr_;
        if (ekVar.c()) {
            return;
        }
        this.routeAttr_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureRouteInsightIsMutable() {
        com.google.v.eo<sd> eoVar = this.routeInsight_;
        if (eoVar.c()) {
            return;
        }
        this.routeInsight_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRoutePointIsMutable() {
        com.google.v.eo<i.b.s> eoVar = this.routePoint_;
        if (eoVar.c()) {
            return;
        }
        this.routePoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRouteSegmentIsMutable() {
        com.google.v.eo<si> eoVar = this.routeSegment_;
        if (eoVar.c()) {
            return;
        }
        this.routeSegment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRouteTypeIsMutable() {
        com.google.v.ek ekVar = this.routeType_;
        if (ekVar.c()) {
            return;
        }
        this.routeType_ = com.google.v.du.mutableCopy(ekVar);
    }

    private void ensureWaypointIsMutable() {
        com.google.v.eo<sw> eoVar = this.waypoint_;
        if (eoVar.c()) {
            return;
        }
        this.waypoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static sl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAttributes(sn snVar) {
        Objects.requireNonNull(snVar);
        sn snVar2 = this.attributes_;
        if (snVar2 != null && snVar2 != sn.getDefaultInstance()) {
            sm smVarNewBuilder = sn.newBuilder(snVar2);
            smVarNewBuilder.mergeFrom((sm) snVar);
            snVar = smVarNewBuilder.buildPartial();
        }
        this.attributes_ = snVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCurrentEntryPoint(i.b.v.bi biVar) {
        Objects.requireNonNull(biVar);
        i.b.v.bi biVar2 = this.currentEntryPoint_;
        if (biVar2 != null && biVar2 != i.b.v.bi.getDefaultInstance()) {
            i.b.v.bg bgVarNewBuilder = i.b.v.bi.newBuilder(biVar2);
            bgVarNewBuilder.mergeFrom((i.b.v.bg) biVar);
            biVar = bgVarNewBuilder.buildPartial();
        }
        this.currentEntryPoint_ = biVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExplainabilityHint(rj rjVar) {
        Objects.requireNonNull(rjVar);
        rj rjVar2 = this.explainabilityHint_;
        if (rjVar2 != null && rjVar2 != rj.getDefaultInstance()) {
            rh rhVarNewBuilder = rj.newBuilder(rjVar2);
            rhVarNewBuilder.mergeFrom((rh) rjVar);
            rjVar = rhVarNewBuilder.buildPartial();
        }
        this.explainabilityHint_ = rjVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHovRouteInfo(rq rqVar) {
        Objects.requireNonNull(rqVar);
        rq rqVar2 = this.hovRouteInfo_;
        if (rqVar2 != null && rqVar2 != rq.getDefaultInstance()) {
            rp rpVarNewBuilder = rq.newBuilder(rqVar2);
            rpVarNewBuilder.mergeFrom((rp) rqVar);
            rqVar = rpVarNewBuilder.buildPartial();
        }
        this.hovRouteInfo_ = rqVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLabel(sg sgVar) {
        Objects.requireNonNull(sgVar);
        sg sgVar2 = this.label_;
        if (sgVar2 != null && sgVar2 != sg.getDefaultInstance()) {
            sf sfVarNewBuilder = sg.newBuilder(sgVar2);
            sfVarNewBuilder.mergeFrom((sf) sgVar);
            sgVar = sfVarNewBuilder.buildPartial();
        }
        this.label_ = sgVar;
        this.bitField0_ |= 524288;
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
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMteInfo(sp spVar) {
        Objects.requireNonNull(spVar);
        sp spVar2 = this.mteInfo_;
        if (spVar2 != null && spVar2 != sp.getDefaultInstance()) {
            so soVarNewBuilder = sp.newBuilder(spVar2);
            soVarNewBuilder.mergeFrom((so) spVar);
            spVar = soVarNewBuilder.buildPartial();
        }
        this.mteInfo_ = spVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRouteGeometry(rz rzVar) {
        Objects.requireNonNull(rzVar);
        rz rzVar2 = this.routeGeometry_;
        if (rzVar2 != null && rzVar2 != rz.getDefaultInstance()) {
            ry ryVarNewBuilder = rz.newBuilder(rzVar2);
            ryVarNewBuilder.mergeFrom((ry) rzVar);
            rzVar = ryVarNewBuilder.buildPartial();
        }
        this.routeGeometry_ = rzVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollPriceInfo(su suVar) {
        Objects.requireNonNull(suVar);
        su suVar2 = this.tollPriceInfo_;
        if (suVar2 != null && suVar2 != su.getDefaultInstance()) {
            st stVarNewBuilder = su.newBuilder(suVar2);
            stVarNewBuilder.mergeFrom((st) suVar);
            suVar = stVarNewBuilder.buildPartial();
        }
        this.tollPriceInfo_ = suVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.trafficCommentWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.trafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        i.b.ao aoVar2 = this.voiceTrafficCommentWithArguments_;
        if (aoVar2 != null && aoVar2 != i.b.ao.getDefaultInstance()) {
            i.b.an anVarNewBuilder = i.b.ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((i.b.an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.voiceTrafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    public static sk newBuilder() {
        return (sk) DEFAULT_INSTANCE.createBuilder();
    }

    public static sl parseDelimitedFrom(InputStream inputStream) {
        return (sl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sl parseFrom(com.google.v.v vVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<sl> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEtaHistogram(int i2) {
        ensureEtaHistogramIsMutable();
        this.etaHistogram_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEventOffRoute(int i2) {
        ensureEventOffRouteIsMutable();
        this.eventOffRoute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEventOnRoute(int i2) {
        ensureEventOnRouteIsMutable();
        this.eventOnRoute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeQuestion(int i2) {
        ensureQuestionIsMutable();
        this.question_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteInsight(int i2) {
        ensureRouteInsightIsMutable();
        this.routeInsight_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoutePoint(int i2) {
        ensureRoutePointIsMutable();
        this.routePoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRouteSegment(int i2) {
        ensureRouteSegmentIsMutable();
        this.routeSegment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoint(int i2) {
        ensureWaypointIsMutable();
        this.waypoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltDescription(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.altDescription_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltDescriptionBytes(com.google.v.v vVar) {
        this.altDescription_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltGroupComment(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAltGroupCommentIsMutable();
        this.altGroupComment_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltId(long j2) {
        this.bitField0_ |= 2;
        this.altId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativesHaveHov(boolean z) {
        this.bitField0_ |= 8192;
        this.alternativesHaveHov_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAreas(int i2, String str) {
        Objects.requireNonNull(str);
        ensureAreasIsMutable();
        this.areas_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(sn snVar) {
        Objects.requireNonNull(snVar);
        this.attributes_ = snVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarbonEmissionsGrams(long j2) {
        this.bitField0_ |= 64;
        this.carbonEmissionsGrams_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCostForTime(long j2) {
        this.bitField0_ |= 2048;
        this.costForTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.currency_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyBytes(com.google.v.v vVar) {
        this.currency_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentEntryPoint(i.b.v.bi biVar) {
        Objects.requireNonNull(biVar);
        this.currentEntryPoint_ = biVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationId(long j2) {
        this.bitField0_ |= 1;
        this.destinationId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointObsolete(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
        this.entryPointObsolete_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointObsoleteBytes(com.google.v.v vVar) {
        this.entryPointObsolete_ = vVar.u();
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEtaHistogram(int i2, rn rnVar) {
        Objects.requireNonNull(rnVar);
        ensureEtaHistogramIsMutable();
        this.etaHistogram_.set(i2, rnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventOffRoute(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOffRouteIsMutable();
        this.eventOffRoute_.set(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventOnRoute(int i2, rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOnRouteIsMutable();
        this.eventOnRoute_.set(i2, rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExplainabilityHint(rj rjVar) {
        Objects.requireNonNull(rjVar);
        this.explainabilityHint_ = rjVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHovRouteInfo(rq rqVar) {
        Objects.requireNonNull(rqVar);
        this.hovRouteInfo_ = rqVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInvalidForPrivateVehicle(boolean z) {
        this.bitField0_ |= 262144;
        this.isInvalidForPrivateVehicle_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(sg sgVar) {
        Objects.requireNonNull(sgVar);
        this.label_ = sgVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLowerSpeedItinerary(rs rsVar) {
        Objects.requireNonNull(rsVar);
        this.lowerSpeedItinerary_ = rsVar;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMteInfo(sp spVar) {
        Objects.requireNonNull(spVar);
        this.mteInfo_ = spVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNeededPermit(int i2, String str) {
        Objects.requireNonNull(str);
        ensureNeededPermitIsMutable();
        this.neededPermit_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumEventsOnRouteObsolete(long j2) {
        this.bitField0_ |= 134217728;
        this.numEventsOnRouteObsolete_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumSegments(long j2) {
        this.bitField0_ |= 128;
        this.numSegments_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginObsolete(long j2) {
        this.bitField0_ |= 67108864;
        this.originObsolete_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtherUserIdObsolete(long j2) {
        this.bitField0_ |= 536870912;
        this.otherUserIdObsolete_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestion(int i2, i.b.k.o oVar) {
        Objects.requireNonNull(oVar);
        ensureQuestionIsMutable();
        this.question_.set(i2, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiredPermits(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteAttr(int i2, i.c.a.a.c cVar) {
        Objects.requireNonNull(cVar);
        ensureRouteAttrIsMutable();
        this.routeAttr_.e(i2, cVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteGeometry(rz rzVar) {
        Objects.requireNonNull(rzVar);
        this.routeGeometry_ = rzVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInsight(int i2, sd sdVar) {
        Objects.requireNonNull(sdVar);
        ensureRouteInsightIsMutable();
        this.routeInsight_.set(i2, sdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutePoint(int i2, i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.set(i2, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteSegment(int i2, si siVar) {
        Objects.requireNonNull(siVar);
        ensureRouteSegmentIsMutable();
        this.routeSegment_.set(i2, siVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteType(int i2, i.c.a.a.d dVar) {
        Objects.requireNonNull(dVar);
        ensureRouteTypeIsMutable();
        this.routeType_.e(i2, dVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingStatusObsolete(sr srVar) {
        this.routingStatusObsolete_ = srVar.getNumber();
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusObsolete(long j2) {
        this.bitField0_ |= 16777216;
        this.statusObsolete_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime2ParkSecondsObsolete(long j2) {
        this.bitField0_ |= 268435456;
        this.time2ParkSecondsObsolete_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(double d2) {
        this.bitField0_ |= 16384;
        this.tollPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceInfo(su suVar) {
        Objects.requireNonNull(suVar);
        this.tollPriceInfo_ = suVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalHistoricSeconds(long j2) {
        this.bitField0_ |= 1048576;
        this.totalHistoricSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLength(long j2) {
        this.bitField0_ |= 16;
        this.totalLength_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSeconds(long j2) {
        this.bitField0_ |= 32;
        this.totalSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.trafficComment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentBytes(com.google.v.v vVar) {
        this.trafficComment_ = vVar.u();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.trafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficComment(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1024;
        this.voiceTrafficComment_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficCommentBytes(com.google.v.v vVar) {
        this.voiceTrafficComment_ = vVar.u();
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceTrafficCommentWithArguments(i.b.ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.voiceTrafficCommentWithArguments_ = aoVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoint(int i2, sw swVar) {
        Objects.requireNonNull(swVar);
        ensureWaypointIsMutable();
        this.waypoint_.set(i2, swVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u00010\u0000\u0002\u000190\u0000\u000e\u0001\u0001ဂ\u0000\u0002ဂ\u0018\u0003ဂ\u0001\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0007\bဉ\b\tဂ\u001a\nဂ\u001b\fဈ\t\rဂ\u001d\u000eဂ\u000b\u000fဂ\u001c\u0011ဈ\n\u0012\u001b\u0013\u001b\u0014\u001b\u0015\u001b\u0016᠌\u0017\u0017ဉ\f\u0018\u001a\u0019ဇ\r\u001aက\u000e\u001bဈ\u000f\u001c\u001a\u001f\u001a!\u001b\"ဈ\u0019%ဉ\u0010&ᐉ\u0011'ဇ\u0012(\u001b)ဉ\u0013*\u001b+ဂ\u0014,ࠞ-ࠞ0\u001b1ဈ\u00022\u001a3ဂ\u00064ဉ\u00155ဉ\u001e6ဉ\u001f7ဉ 8ဉ!9ဉ\u0016", new Object[]{"bitField0_", "bitField1_", "destinationId_", "statusObsolete_", "altId_", "altDescription_", "totalLength_", "totalSeconds_", "numSegments_", "attributes_", "originObsolete_", "numEventsOnRouteObsolete_", "trafficComment_", "otherUserIdObsolete_", "costForTime_", "time2ParkSecondsObsolete_", "voiceTrafficComment_", "eventOnRoute_", rf.class, "routePoint_", i.b.s.class, "routeSegment_", si.class, "waypoint_", sw.class, "routingStatusObsolete_", pa.f48958g, "hovRouteInfo_", "neededPermit_", "alternativesHaveHov_", "tollPrice_", "currency_", "altGroupComment_", "areas_", "question_", i.b.k.o.class, "entryPointObsolete_", "tollPriceInfo_", "currentEntryPoint_", "isInvalidForPrivateVehicle_", "routeInsight_", sd.class, "label_", "eventOffRoute_", rf.class, "totalHistoricSeconds_", "routeType_", i.c.a.a.d.a(), "routeAttr_", i.c.a.a.c.a(), "etaHistogram_", rn.class, "alternativeRouteUuid_", "requiredPermits_", "carbonEmissionsGrams_", "lowerSpeedItinerary_", "trafficCommentWithArguments_", "voiceTrafficCommentWithArguments_", "mteInfo_", "routeGeometry_", "explainabilityHint_"});
            case 3:
                return new sl();
            case 4:
                return new sk(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<sl> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (sl.class) {
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

    public String getAltDescription() {
        return this.altDescription_;
    }

    public com.google.v.v getAltDescriptionBytes() {
        return com.google.v.v.s(this.altDescription_);
    }

    public String getAltGroupComment(int i2) {
        return this.altGroupComment_.get(i2);
    }

    public com.google.v.v getAltGroupCommentBytes(int i2) {
        return com.google.v.v.s(this.altGroupComment_.get(i2));
    }

    public int getAltGroupCommentCount() {
        return this.altGroupComment_.size();
    }

    public List<String> getAltGroupCommentList() {
        return this.altGroupComment_;
    }

    public long getAltId() {
        return this.altId_;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public boolean getAlternativesHaveHov() {
        return this.alternativesHaveHov_;
    }

    public String getAreas(int i2) {
        return this.areas_.get(i2);
    }

    public com.google.v.v getAreasBytes(int i2) {
        return com.google.v.v.s(this.areas_.get(i2));
    }

    public int getAreasCount() {
        return this.areas_.size();
    }

    public List<String> getAreasList() {
        return this.areas_;
    }

    public sn getAttributes() {
        sn snVar = this.attributes_;
        return snVar == null ? sn.getDefaultInstance() : snVar;
    }

    public long getCarbonEmissionsGrams() {
        return this.carbonEmissionsGrams_;
    }

    public long getCostForTime() {
        return this.costForTime_;
    }

    public String getCurrency() {
        return this.currency_;
    }

    public com.google.v.v getCurrencyBytes() {
        return com.google.v.v.s(this.currency_);
    }

    public i.b.v.bi getCurrentEntryPoint() {
        i.b.v.bi biVar = this.currentEntryPoint_;
        return biVar == null ? i.b.v.bi.getDefaultInstance() : biVar;
    }

    public long getDestinationId() {
        return this.destinationId_;
    }

    @Deprecated
    public String getEntryPointObsolete() {
        return this.entryPointObsolete_;
    }

    @Deprecated
    public com.google.v.v getEntryPointObsoleteBytes() {
        return com.google.v.v.s(this.entryPointObsolete_);
    }

    public rn getEtaHistogram(int i2) {
        return this.etaHistogram_.get(i2);
    }

    public int getEtaHistogramCount() {
        return this.etaHistogram_.size();
    }

    public List<rn> getEtaHistogramList() {
        return this.etaHistogram_;
    }

    public ro getEtaHistogramOrBuilder(int i2) {
        return this.etaHistogram_.get(i2);
    }

    public List<? extends ro> getEtaHistogramOrBuilderList() {
        return this.etaHistogram_;
    }

    public rf getEventOffRoute(int i2) {
        return this.eventOffRoute_.get(i2);
    }

    public int getEventOffRouteCount() {
        return this.eventOffRoute_.size();
    }

    public List<rf> getEventOffRouteList() {
        return this.eventOffRoute_;
    }

    public rg getEventOffRouteOrBuilder(int i2) {
        return this.eventOffRoute_.get(i2);
    }

    public List<? extends rg> getEventOffRouteOrBuilderList() {
        return this.eventOffRoute_;
    }

    public rf getEventOnRoute(int i2) {
        return this.eventOnRoute_.get(i2);
    }

    public int getEventOnRouteCount() {
        return this.eventOnRoute_.size();
    }

    public List<rf> getEventOnRouteList() {
        return this.eventOnRoute_;
    }

    public rg getEventOnRouteOrBuilder(int i2) {
        return this.eventOnRoute_.get(i2);
    }

    public List<? extends rg> getEventOnRouteOrBuilderList() {
        return this.eventOnRoute_;
    }

    public rj getExplainabilityHint() {
        rj rjVar = this.explainabilityHint_;
        return rjVar == null ? rj.getDefaultInstance() : rjVar;
    }

    public rq getHovRouteInfo() {
        rq rqVar = this.hovRouteInfo_;
        return rqVar == null ? rq.getDefaultInstance() : rqVar;
    }

    public boolean getIsInvalidForPrivateVehicle() {
        return this.isInvalidForPrivateVehicle_;
    }

    public sg getLabel() {
        sg sgVar = this.label_;
        return sgVar == null ? sg.getDefaultInstance() : sgVar;
    }

    public rs getLowerSpeedItinerary() {
        rs rsVar = this.lowerSpeedItinerary_;
        return rsVar == null ? rs.getDefaultInstance() : rsVar;
    }

    public sp getMteInfo() {
        sp spVar = this.mteInfo_;
        return spVar == null ? sp.getDefaultInstance() : spVar;
    }

    @Deprecated
    public String getNeededPermit(int i2) {
        return this.neededPermit_.get(i2);
    }

    @Deprecated
    public com.google.v.v getNeededPermitBytes(int i2) {
        return com.google.v.v.s(this.neededPermit_.get(i2));
    }

    @Deprecated
    public int getNeededPermitCount() {
        return this.neededPermit_.size();
    }

    @Deprecated
    public List<String> getNeededPermitList() {
        return this.neededPermit_;
    }

    @Deprecated
    public long getNumEventsOnRouteObsolete() {
        return this.numEventsOnRouteObsolete_;
    }

    public long getNumSegments() {
        return this.numSegments_;
    }

    @Deprecated
    public long getOriginObsolete() {
        return this.originObsolete_;
    }

    @Deprecated
    public long getOtherUserIdObsolete() {
        return this.otherUserIdObsolete_;
    }

    public i.b.k.o getQuestion(int i2) {
        return this.question_.get(i2);
    }

    public int getQuestionCount() {
        return this.question_.size();
    }

    public List<i.b.k.o> getQuestionList() {
        return this.question_;
    }

    public i.b.k.p getQuestionOrBuilder(int i2) {
        return this.question_.get(i2);
    }

    public List<? extends i.b.k.p> getQuestionOrBuilderList() {
        return this.question_;
    }

    public String getRequiredPermits(int i2) {
        return this.requiredPermits_.get(i2);
    }

    public com.google.v.v getRequiredPermitsBytes(int i2) {
        return com.google.v.v.s(this.requiredPermits_.get(i2));
    }

    public int getRequiredPermitsCount() {
        return this.requiredPermits_.size();
    }

    public List<String> getRequiredPermitsList() {
        return this.requiredPermits_;
    }

    public i.c.a.a.c getRouteAttr(int i2) {
        i.c.a.a.c cVarB = i.c.a.a.c.b(this.routeAttr_.d(i2));
        return cVarB == null ? i.c.a.a.c.UNKNOWN : cVarB;
    }

    public int getRouteAttrCount() {
        return this.routeAttr_.size();
    }

    public List<i.c.a.a.c> getRouteAttrList() {
        return new com.google.v.em(this.routeAttr_, routeAttr_converter_);
    }

    public rz getRouteGeometry() {
        rz rzVar = this.routeGeometry_;
        return rzVar == null ? rz.getDefaultInstance() : rzVar;
    }

    public sd getRouteInsight(int i2) {
        return this.routeInsight_.get(i2);
    }

    public int getRouteInsightCount() {
        return this.routeInsight_.size();
    }

    public List<sd> getRouteInsightList() {
        return this.routeInsight_;
    }

    public se getRouteInsightOrBuilder(int i2) {
        return this.routeInsight_.get(i2);
    }

    public List<? extends se> getRouteInsightOrBuilderList() {
        return this.routeInsight_;
    }

    public i.b.s getRoutePoint(int i2) {
        return this.routePoint_.get(i2);
    }

    public int getRoutePointCount() {
        return this.routePoint_.size();
    }

    public List<i.b.s> getRoutePointList() {
        return this.routePoint_;
    }

    public i.b.t getRoutePointOrBuilder(int i2) {
        return this.routePoint_.get(i2);
    }

    public List<? extends i.b.t> getRoutePointOrBuilderList() {
        return this.routePoint_;
    }

    public si getRouteSegment(int i2) {
        return this.routeSegment_.get(i2);
    }

    public int getRouteSegmentCount() {
        return this.routeSegment_.size();
    }

    public List<si> getRouteSegmentList() {
        return this.routeSegment_;
    }

    public sj getRouteSegmentOrBuilder(int i2) {
        return this.routeSegment_.get(i2);
    }

    public List<? extends sj> getRouteSegmentOrBuilderList() {
        return this.routeSegment_;
    }

    public i.c.a.a.d getRouteType(int i2) {
        i.c.a.a.d dVarB = i.c.a.a.d.b(this.routeType_.d(i2));
        return dVarB == null ? i.c.a.a.d.UNKNOWN : dVarB;
    }

    public int getRouteTypeCount() {
        return this.routeType_.size();
    }

    public List<i.c.a.a.d> getRouteTypeList() {
        return new com.google.v.em(this.routeType_, routeType_converter_);
    }

    @Deprecated
    public sr getRoutingStatusObsolete() {
        sr srVarA = sr.a(this.routingStatusObsolete_);
        return srVarA == null ? sr.NO_STATUS : srVarA;
    }

    @Deprecated
    public long getStatusObsolete() {
        return this.statusObsolete_;
    }

    @Deprecated
    public long getTime2ParkSecondsObsolete() {
        return this.time2ParkSecondsObsolete_;
    }

    public double getTollPrice() {
        return this.tollPrice_;
    }

    public su getTollPriceInfo() {
        su suVar = this.tollPriceInfo_;
        return suVar == null ? su.getDefaultInstance() : suVar;
    }

    public long getTotalHistoricSeconds() {
        return this.totalHistoricSeconds_;
    }

    public long getTotalLength() {
        return this.totalLength_;
    }

    public long getTotalSeconds() {
        return this.totalSeconds_;
    }

    public String getTrafficComment() {
        return this.trafficComment_;
    }

    public com.google.v.v getTrafficCommentBytes() {
        return com.google.v.v.s(this.trafficComment_);
    }

    public i.b.ao getTrafficCommentWithArguments() {
        i.b.ao aoVar = this.trafficCommentWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public String getVoiceTrafficComment() {
        return this.voiceTrafficComment_;
    }

    public com.google.v.v getVoiceTrafficCommentBytes() {
        return com.google.v.v.s(this.voiceTrafficComment_);
    }

    public i.b.ao getVoiceTrafficCommentWithArguments() {
        i.b.ao aoVar = this.voiceTrafficCommentWithArguments_;
        return aoVar == null ? i.b.ao.getDefaultInstance() : aoVar;
    }

    public sw getWaypoint(int i2) {
        return this.waypoint_.get(i2);
    }

    public int getWaypointCount() {
        return this.waypoint_.size();
    }

    public List<sw> getWaypointList() {
        return this.waypoint_;
    }

    public sx getWaypointOrBuilder(int i2) {
        return this.waypoint_.get(i2);
    }

    public List<? extends sx> getWaypointOrBuilderList() {
        return this.waypoint_;
    }

    public boolean hasAltDescription() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAltId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAlternativesHaveHov() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasAttributes() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasCarbonEmissionsGrams() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCostForTime() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasCurrentEntryPoint() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasDestinationId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasEntryPointObsolete() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasExplainabilityHint() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasHovRouteInfo() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasIsInvalidForPrivateVehicle() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasLowerSpeedItinerary() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasMteInfo() {
        return (this.bitField1_ & 1) != 0;
    }

    @Deprecated
    public boolean hasNumEventsOnRouteObsolete() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasNumSegments() {
        return (this.bitField0_ & 128) != 0;
    }

    @Deprecated
    public boolean hasOriginObsolete() {
        return (this.bitField0_ & 67108864) != 0;
    }

    @Deprecated
    public boolean hasOtherUserIdObsolete() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasRouteGeometry() {
        return (this.bitField1_ & 2) != 0;
    }

    @Deprecated
    public boolean hasRoutingStatusObsolete() {
        return (this.bitField0_ & 8388608) != 0;
    }

    @Deprecated
    public boolean hasStatusObsolete() {
        return (this.bitField0_ & 16777216) != 0;
    }

    @Deprecated
    public boolean hasTime2ParkSecondsObsolete() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasTollPriceInfo() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasTotalHistoricSeconds() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasTotalLength() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTotalSeconds() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTrafficComment() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasTrafficCommentWithArguments() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasVoiceTrafficComment() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasVoiceTrafficCommentWithArguments() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public static sk newBuilder(sl slVar) {
        return (sk) DEFAULT_INSTANCE.createBuilder(slVar);
    }

    public static sl parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sl) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sl parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static sl parseFrom(com.google.v.z zVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static sl parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEtaHistogram(rn rnVar) {
        Objects.requireNonNull(rnVar);
        ensureEtaHistogramIsMutable();
        this.etaHistogram_.add(rnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventOffRoute(rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOffRouteIsMutable();
        this.eventOffRoute_.add(rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEventOnRoute(rf rfVar) {
        Objects.requireNonNull(rfVar);
        ensureEventOnRouteIsMutable();
        this.eventOnRoute_.add(rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQuestion(i.b.k.o oVar) {
        Objects.requireNonNull(oVar);
        ensureQuestionIsMutable();
        this.question_.add(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteInsight(sd sdVar) {
        Objects.requireNonNull(sdVar);
        ensureRouteInsightIsMutable();
        this.routeInsight_.add(sdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoutePoint(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        ensureRoutePointIsMutable();
        this.routePoint_.add(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRouteSegment(si siVar) {
        Objects.requireNonNull(siVar);
        ensureRouteSegmentIsMutable();
        this.routeSegment_.add(siVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoint(sw swVar) {
        Objects.requireNonNull(swVar);
        ensureWaypointIsMutable();
        this.waypoint_.add(swVar);
    }

    public static sl parseFrom(InputStream inputStream) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static sl parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static sl parseFrom(ByteBuffer byteBuffer) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static sl parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static sl parseFrom(byte[] bArr) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static sl parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (sl) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
