package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import com.google.k.a.a.lf;
import com.google.k.a.a.lg;
import com.google.k.a.a.mi;
import com.google.k.a.a.mj;
import com.google.k.a.a.mk;
import com.google.k.a.a.ml;
import com.google.k.a.a.mn;
import com.google.k.a.a.mt;
import com.google.k.a.a.mv;
import com.google.k.a.a.mw;
import com.google.k.a.a.ni;
import com.google.k.a.a.nj;
import com.google.k.a.a.oi;
import com.google.k.a.a.oj;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bt extends com.google.v.du<bt, br> implements bu {
    public static final int ACCESS_POINT_FIELD_NUMBER = 17;
    public static final int ADDRESS_FIELD_NUMBER = 5;
    public static final int ANCHORED_GEOMETRY_FIELD_NUMBER = 104;
    public static final int ASSOCIATED_EV_CHARGING_STATION_FIELD_NUMBER = 115;
    public static final int ATTACHMENT_FIELD_NUMBER = 73;
    public static final int ATTRIBUTE_FIELD_NUMBER = 66;
    public static final int BEST_LOCALE_FIELD_NUMBER = 76;
    public static final int BORDER_FIELD_NUMBER = 44;
    public static final int BOUND_FIELD_NUMBER = 2;
    public static final int BUILDING_FIELD_NUMBER = 43;
    public static final int BUSINESS_CHAIN_FIELD_NUMBER = 91;
    public static final int CENTER_FIELD_NUMBER = 10;
    public static final int CHILD_FIELD_NUMBER = 9;
    public static final int COVERING_FIELD_NUMBER = 26;
    public static final int DATA_SOURCE_FIELD_NUMBER = 33;
    private static final bt DEFAULT_INSTANCE;
    public static final int DETAILED_3D_MODEL_FIELD_NUMBER = 116;
    public static final int DISPLAY_DATA_FIELD_NUMBER = 92;
    public static final int DISPUTED_AREA_FIELD_NUMBER = 113;
    public static final int DOODLE_FIELD_NUMBER = 46;
    public static final int ELEVATION_FIELD_NUMBER = 61;
    public static final int ELEVATION_MODEL_FIELD_NUMBER = 56;
    public static final int ENTRANCE_FIELD_NUMBER = 49;
    public static final int ESTABLISHMENT_FIELD_NUMBER = 51;
    public static final int EV_CHARGER_FIELD_NUMBER = 122;
    public static final int EV_STATION_FIELD_NUMBER = 120;
    public static final int EXEMPT_REGULATED_AREA_FIELD_NUMBER = 100;
    public static final int EXISTENCE_CONFIRMATIONS_FIELD_NUMBER = 126;
    public static final int EXPERIMENTAL_DATA_FIELD_NUMBER = 118;
    public static final int FEATURE_ORIGINATORS_FIELD_NUMBER = 123;
    public static final int FUTURE_GEOMETRY_FIELD_NUMBER = 93;
    public static final int FUTURE_GEOMETRY_FOR_FIELD_NUMBER = 94;
    public static final int GEOMETRY_3D_FIELD_NUMBER = 110;
    public static final int GEOMETRY_PRECISION_METERS_FIELD_NUMBER = 20;
    public static final int GEOPOLITICAL_FIELD_NUMBER = 114;
    public static final int GEOPOLITICAL_GEOMETRY_FIELD_NUMBER = 109;
    public static final int HTML_TEXT_FIELD_NUMBER = 28;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int INFERRED_GEOMETRY_FIELD_NUMBER = 101;
    public static final int INTERIOR_COVERING_FIELD_NUMBER = 27;
    public static final int INTERNAL_FIELD_NUMBER = 71;
    public static final int INTERSECTION_FIELD_NUMBER = 32;
    public static final int INTERSECTION_GROUP_FIELD_NUMBER = 60;
    public static final int KG_PROPERTY_FIELD_NUMBER = 79;
    public static final int KNOWLEDGE_GRAPH_REFERENCE_FIELD_NUMBER = 75;
    public static final int LAND_USE_FIELD_NUMBER = 124;
    public static final int LANE_MARKER_FIELD_NUMBER = 97;
    public static final int LEVEL_FIELD_NUMBER = 68;
    public static final int LOCALE_FIELD_NUMBER = 53;
    public static final int LOGICAL_BORDER_FIELD_NUMBER = 106;
    public static final int MEDIAN_FIELD_NUMBER = 121;
    public static final int MESSAGE_SET_EXTENSION_FIELD_NUMBER = 1205891;
    public static final int METADATA_FIELD_NUMBER = 300;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int OPERATIONS_FIELD_NUMBER = 103;
    public static final int ORIGINAL_ID_FIELD_NUMBER = 19;
    public static final int PARENT_FIELD_NUMBER = 14;
    public static final int PARKING_FIELD_NUMBER = 82;
    private static volatile com.google.v.fo<bt> PARSER = null;
    public static final int POINT_FIELD_NUMBER = 6;
    public static final int POLITICAL_FIELD_NUMBER = 34;
    public static final int POLYGON_FIELD_NUMBER = 8;
    public static final int POLYGON_FOR_DISPLAY_FIELD_NUMBER = 83;
    public static final int POLYLINE_FIELD_NUMBER = 7;
    public static final int POSE_FIELD_NUMBER = 90;
    public static final int PREFERRED_VIEWPORT_FIELD_NUMBER = 59;
    public static final int PROPERTY_VALUE_STATUS_FIELD_NUMBER = 84;
    public static final int RANK_DETAILS_FIELD_NUMBER = 24;
    public static final int RANK_FIELD_NUMBER = 3;
    public static final int RAW_GCONCEPT_INSTANCE_CONTAINER_FIELD_NUMBER = 70;
    public static final int REGULATED_AREA_FIELD_NUMBER = 99;
    public static final int RELATED_BORDER_FIELD_NUMBER = 95;
    public static final int RELATED_ENTRANCE_FIELD_NUMBER = 86;
    public static final int RELATED_FEATURE_FIELD_NUMBER = 13;
    public static final int RELATED_TERMINAL_POINT_FIELD_NUMBER = 88;
    public static final int RELATED_TIMEZONE_FIELD_NUMBER = 85;
    public static final int RESTRICTION_GROUP_FIELD_NUMBER = 80;
    public static final int ROAD_DISRUPTION_FIELD_NUMBER = 119;
    public static final int ROAD_MONITOR_FIELD_NUMBER = 96;
    public static final int ROUTE_FIELD_NUMBER = 30;
    public static final int SCHOOL_DISTRICT_FIELD_NUMBER = 48;
    public static final int SEGMENT_FIELD_NUMBER = 31;
    public static final int SEGMENT_PATH_FIELD_NUMBER = 45;
    public static final int SIGNPOST_FIELD_NUMBER = 125;
    public static final int SIGN_FIELD_NUMBER = 52;
    public static final int SKI_BOUNDARY_FIELD_NUMBER = 62;
    public static final int SKI_LIFT_FIELD_NUMBER = 63;
    public static final int SKI_TRAIL_FIELD_NUMBER = 64;
    public static final int SOCIAL_REFERENCE_FIELD_NUMBER = 74;
    public static final int SOURCE_INFO_FIELD_NUMBER = 12;
    public static final int STATUS_FIELD_NUMBER = 67;
    public static final int STOREFRONT_GEOMETRY_FIELD_NUMBER = 107;
    public static final int STOREFRONT_GEOMETRY_MODEL_FIELD_NUMBER = 112;
    public static final int SYNTHETIC_GEOMETRY_FIELD_NUMBER = 16;
    public static final int TEMPORARY_DATA_FIELD_NUMBER = 25;
    public static final int THREE_DIM_MODEL_FIELD_NUMBER = 55;
    public static final int TOLL_CLUSTER_FIELD_NUMBER = 102;
    public static final int TOLL_PATH_FIELD_NUMBER = 117;
    public static final int TRACK_FIELD_NUMBER = 89;
    public static final int TRANSIT_LINE_FIELD_NUMBER = 42;
    public static final int TRANSIT_LINE_VARIANT_FIELD_NUMBER = 87;
    public static final int TRANSIT_STATION_FIELD_NUMBER = 105;
    public static final int TYPE_FIELD_NUMBER = 15;
    public static final int VERTICAL_ORDERING_FIELD_NUMBER = 98;
    public static final int VISUALIZATION_AREA_FIELD_NUMBER = 111;
    public static final int WATER_REMOVED_POLYGON_FIELD_NUMBER = 108;
    public static final int WEBSITE_FIELD_NUMBER = 69;
    public static final com.google.v.ds<com.google.w.n.a.b, bt> messageSetExtension;
    private com.google.k.a.a.b anchoredGeometry_;
    private ad bestLocale_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private ag border_;
    private fy bound_;
    private am building_;
    private com.google.k.e.b businessChain_;
    private es center_;
    private ao covering_;
    private aq dataSource_;
    private com.google.k.a.a.eg detailed3DModel_;
    private com.google.k.a.a.cr displayData_;
    private com.google.k.a.a.ct disputedArea_;
    private ax doodle_;
    private bb elevationModel_;
    private az elevation_;
    private bh entrance_;
    private bm establishment_;
    private com.google.w.g.i evCharger_;
    private com.google.w.g.p evStation_;
    private bw futureGeometryFor_;
    private bw futureGeometry_;
    private com.google.k.a.a.eg geometry3D_;
    private double geometryPrecisionMeters_;
    private com.google.k.a.a.eq geopoliticalGeometry_;
    private com.google.k.a.a.eo geopolitical_;
    private bw id_;
    private com.google.k.a.a.es inferredGeometry_;
    private ao interiorCovering_;
    private com.google.k.a.a.a.a.b internal_;
    private cv intersectionGroup_;
    private cs intersection_;
    private cx knowledgeGraphReference_;
    private com.google.w.g.s landUse_;
    private com.google.k.a.a.fg laneMarker_;
    private dy level_;
    private ea locale_;
    private com.google.k.a.a.fv logicalBorder_;
    private com.google.k.a.a.gc median_;
    private com.google.k.a.a.dy metadata_;
    private com.google.k.a.a.gg operations_;
    private bw originalId_;
    private com.google.k.a.a.gp parking_;
    private ev political_;
    private ex polygonForDisplay_;
    private com.google.k.a.a.gx pose_;
    private fy preferredViewport_;
    private fl rankDetails_;
    private float rank_;
    private com.google.k.d.a.a.e rawGconceptInstanceContainer_;
    private com.google.k.a.a.jn regulatedArea_;
    private com.google.k.a.a.js restrictionGroup_;
    private com.google.k.a.a.kq roadDisruption_;
    private com.google.k.a.a.ks roadMonitor_;
    private gt route_;
    private gw schoolDistrict_;
    private ip segmentPath_;
    private ik segment_;
    private gn sign_;
    private lg signpost_;
    private is skiBoundary_;
    private iv skiLift_;
    private iz skiTrail_;
    private jb socialReference_;
    private bq status_;
    private com.google.k.a.a.eg storefrontGeometryModel_;
    private boolean syntheticGeometry_;
    private com.google.w.n.a.b temporaryData_;
    private js threeDimModel_;
    private ml tollCluster_;
    private mt tollPath_;
    private nj transitLineVariant_;
    private km transitLine_;
    private kr transitStation_;
    private int type_;
    private oj verticalOrdering_;
    private com.google.k.a.a.eg visualizationArea_;
    private ex waterRemovedPolygon_;
    private byte memoizedIsInitialized = 2;
    private com.google.v.eo<eh> name_ = emptyProtobufList();
    private com.google.v.eo<h> address_ = emptyProtobufList();
    private com.google.v.eo<es> point_ = emptyProtobufList();
    private com.google.v.eo<fa> polyline_ = emptyProtobufList();
    private com.google.v.eo<ex> polygon_ = emptyProtobufList();
    private com.google.v.eo<mv> track_ = emptyProtobufList();
    private com.google.v.eo<bw> child_ = emptyProtobufList();
    private com.google.v.eo<bw> parent_ = emptyProtobufList();
    private com.google.v.eo<jd> sourceInfo_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.db> relatedEntrance_ = emptyProtobufList();
    private com.google.v.eo<gb> relatedFeature_ = emptyProtobufList();
    private com.google.v.eo<bw> relatedTerminalPoint_ = emptyProtobufList();
    private com.google.v.eo<mi> relatedTimezone_ = emptyProtobufList();
    private com.google.v.eo<e> accessPoint_ = emptyProtobufList();
    private com.google.v.eo<cl> htmlText_ = emptyProtobufList();
    private com.google.v.eo<x> attribute_ = emptyProtobufList();
    private com.google.v.eo<com.google.i.p> kgProperty_ = emptyProtobufList();
    private com.google.v.eo<kt> website_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.b.a.a.b> attachment_ = emptyProtobufList();
    private com.google.v.eo<fh> propertyValueStatus_ = emptyProtobufList();
    private com.google.v.eo<bw> relatedBorder_ = emptyProtobufList();
    private com.google.v.eo<bw> exemptRegulatedArea_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.b> storefrontGeometry_ = emptyProtobufList();
    private com.google.v.eo<bw> associatedEvChargingStation_ = emptyProtobufList();
    private com.google.v.eo<com.google.v.i> experimentalData_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.ci> featureOriginators_ = emptyProtobufList();
    private com.google.v.eo<com.google.k.a.a.dh> existenceConfirmations_ = emptyProtobufList();

    static {
        bt btVar = new bt();
        DEFAULT_INSTANCE = btVar;
        com.google.v.du.registerDefaultInstance(bt.class, btVar);
        messageSetExtension = com.google.v.du.newSingularGeneratedExtension(com.google.w.n.a.b.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), null, MESSAGE_SET_EXTENSION_FIELD_NUMBER, com.google.v.gm.MESSAGE, bt.class);
    }

    private bt() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAccessPoint(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureAccessPointIsMutable();
        this.accessPoint_.add(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddress(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAddressIsMutable();
        this.address_.add(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAccessPoint(Iterable<? extends e> iterable) {
        ensureAccessPointIsMutable();
        com.google.v.c.addAll(iterable, this.accessPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddress(Iterable<? extends h> iterable) {
        ensureAddressIsMutable();
        com.google.v.c.addAll(iterable, this.address_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssociatedEvChargingStation(Iterable<? extends bw> iterable) {
        ensureAssociatedEvChargingStationIsMutable();
        com.google.v.c.addAll(iterable, this.associatedEvChargingStation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttachment(Iterable<? extends com.google.k.b.a.a.b> iterable) {
        ensureAttachmentIsMutable();
        com.google.v.c.addAll(iterable, this.attachment_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttribute(Iterable<? extends x> iterable) {
        ensureAttributeIsMutable();
        com.google.v.c.addAll(iterable, this.attribute_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllChild(Iterable<? extends bw> iterable) {
        ensureChildIsMutable();
        com.google.v.c.addAll(iterable, this.child_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExemptRegulatedArea(Iterable<? extends bw> iterable) {
        ensureExemptRegulatedAreaIsMutable();
        com.google.v.c.addAll(iterable, this.exemptRegulatedArea_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExistenceConfirmations(Iterable<? extends com.google.k.a.a.dh> iterable) {
        ensureExistenceConfirmationsIsMutable();
        com.google.v.c.addAll(iterable, this.existenceConfirmations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExperimentalData(Iterable<? extends com.google.v.i> iterable) {
        ensureExperimentalDataIsMutable();
        com.google.v.c.addAll(iterable, this.experimentalData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatureOriginators(Iterable<? extends com.google.k.a.a.ci> iterable) {
        ensureFeatureOriginatorsIsMutable();
        com.google.v.c.addAll(iterable, this.featureOriginators_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHtmlText(Iterable<? extends cl> iterable) {
        ensureHtmlTextIsMutable();
        com.google.v.c.addAll(iterable, this.htmlText_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllKgProperty(Iterable<? extends com.google.i.p> iterable) {
        ensureKgPropertyIsMutable();
        com.google.v.c.addAll(iterable, this.kgProperty_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends eh> iterable) {
        ensureNameIsMutable();
        com.google.v.c.addAll(iterable, this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllParent(Iterable<? extends bw> iterable) {
        ensureParentIsMutable();
        com.google.v.c.addAll(iterable, this.parent_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPoint(Iterable<? extends es> iterable) {
        ensurePointIsMutable();
        com.google.v.c.addAll(iterable, this.point_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolygon(Iterable<? extends ex> iterable) {
        ensurePolygonIsMutable();
        com.google.v.c.addAll(iterable, this.polygon_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPolyline(Iterable<? extends fa> iterable) {
        ensurePolylineIsMutable();
        com.google.v.c.addAll(iterable, this.polyline_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPropertyValueStatus(Iterable<? extends fh> iterable) {
        ensurePropertyValueStatusIsMutable();
        com.google.v.c.addAll(iterable, this.propertyValueStatus_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedBorder(Iterable<? extends bw> iterable) {
        ensureRelatedBorderIsMutable();
        com.google.v.c.addAll(iterable, this.relatedBorder_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedEntrance(Iterable<? extends com.google.k.a.a.db> iterable) {
        ensureRelatedEntranceIsMutable();
        com.google.v.c.addAll(iterable, this.relatedEntrance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedFeature(Iterable<? extends gb> iterable) {
        ensureRelatedFeatureIsMutable();
        com.google.v.c.addAll(iterable, this.relatedFeature_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedTerminalPoint(Iterable<? extends bw> iterable) {
        ensureRelatedTerminalPointIsMutable();
        com.google.v.c.addAll(iterable, this.relatedTerminalPoint_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRelatedTimezone(Iterable<? extends mi> iterable) {
        ensureRelatedTimezoneIsMutable();
        com.google.v.c.addAll(iterable, this.relatedTimezone_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSourceInfo(Iterable<? extends jd> iterable) {
        ensureSourceInfoIsMutable();
        com.google.v.c.addAll(iterable, this.sourceInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStorefrontGeometry(Iterable<? extends com.google.k.a.a.b> iterable) {
        ensureStorefrontGeometryIsMutable();
        com.google.v.c.addAll(iterable, this.storefrontGeometry_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrack(Iterable<? extends mv> iterable) {
        ensureTrackIsMutable();
        com.google.v.c.addAll(iterable, this.track_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWebsite(Iterable<? extends kt> iterable) {
        ensureWebsiteIsMutable();
        com.google.v.c.addAll(iterable, this.website_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssociatedEvChargingStation(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAssociatedEvChargingStationIsMutable();
        this.associatedEvChargingStation_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttachment(int i2, com.google.k.b.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureAttachmentIsMutable();
        this.attachment_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttribute(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureAttributeIsMutable();
        this.attribute_.add(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChild(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildIsMutable();
        this.child_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemptRegulatedArea(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExemptRegulatedAreaIsMutable();
        this.exemptRegulatedArea_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExistenceConfirmations(int i2, com.google.k.a.a.dh dhVar) {
        Objects.requireNonNull(dhVar);
        ensureExistenceConfirmationsIsMutable();
        this.existenceConfirmations_.add(i2, dhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExperimentalData(int i2, com.google.v.i iVar) {
        Objects.requireNonNull(iVar);
        ensureExperimentalDataIsMutable();
        this.experimentalData_.add(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatureOriginators(int i2, com.google.k.a.a.ci ciVar) {
        Objects.requireNonNull(ciVar);
        ensureFeatureOriginatorsIsMutable();
        this.featureOriginators_.add(i2, ciVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHtmlText(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureHtmlTextIsMutable();
        this.htmlText_.add(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKgProperty(int i2, com.google.i.p pVar) {
        Objects.requireNonNull(pVar);
        ensureKgPropertyIsMutable();
        this.kgProperty_.add(i2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureNameIsMutable();
        this.name_.add(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParent(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParentIsMutable();
        this.parent_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoint(int i2, es esVar) {
        Objects.requireNonNull(esVar);
        ensurePointIsMutable();
        this.point_.add(i2, esVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygon(int i2, ex exVar) {
        Objects.requireNonNull(exVar);
        ensurePolygonIsMutable();
        this.polygon_.add(i2, exVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolyline(int i2, fa faVar) {
        Objects.requireNonNull(faVar);
        ensurePolylineIsMutable();
        this.polyline_.add(i2, faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPropertyValueStatus(int i2, fh fhVar) {
        Objects.requireNonNull(fhVar);
        ensurePropertyValueStatusIsMutable();
        this.propertyValueStatus_.add(i2, fhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedBorder(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedBorderIsMutable();
        this.relatedBorder_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedEntrance(int i2, com.google.k.a.a.db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureRelatedEntranceIsMutable();
        this.relatedEntrance_.add(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedFeature(int i2, gb gbVar) {
        Objects.requireNonNull(gbVar);
        ensureRelatedFeatureIsMutable();
        this.relatedFeature_.add(i2, gbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedTerminalPoint(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedTerminalPointIsMutable();
        this.relatedTerminalPoint_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedTimezone(int i2, mi miVar) {
        Objects.requireNonNull(miVar);
        ensureRelatedTimezoneIsMutable();
        this.relatedTimezone_.add(i2, miVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceInfo(int i2, jd jdVar) {
        Objects.requireNonNull(jdVar);
        ensureSourceInfoIsMutable();
        this.sourceInfo_.add(i2, jdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStorefrontGeometry(int i2, com.google.k.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureStorefrontGeometryIsMutable();
        this.storefrontGeometry_.add(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrack(int i2, mv mvVar) {
        Objects.requireNonNull(mvVar);
        ensureTrackIsMutable();
        this.track_.add(i2, mvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWebsite(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureWebsiteIsMutable();
        this.website_.add(i2, ktVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccessPoint() {
        this.accessPoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnchoredGeometry() {
        this.anchoredGeometry_ = null;
        this.bitField1_ &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssociatedEvChargingStation() {
        this.associatedEvChargingStation_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttachment() {
        this.attachment_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttribute() {
        this.attribute_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBestLocale() {
        this.bestLocale_ = null;
        this.bitField0_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBorder() {
        this.border_ = null;
        this.bitField1_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBound() {
        this.bound_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuilding() {
        this.building_ = null;
        this.bitField1_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessChain() {
        this.businessChain_ = null;
        this.bitField1_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCenter() {
        this.center_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChild() {
        this.child_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCovering() {
        this.covering_ = null;
        this.bitField0_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataSource() {
        this.dataSource_ = null;
        this.bitField0_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetailed3DModel() {
        this.detailed3DModel_ = null;
        this.bitField2_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayData() {
        this.displayData_ = null;
        this.bitField1_ &= -8388609;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisputedArea() {
        this.disputedArea_ = null;
        this.bitField2_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoodle() {
        this.doodle_ = null;
        this.bitField1_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElevation() {
        this.elevation_ = null;
        this.bitField1_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElevationModel() {
        this.elevationModel_ = null;
        this.bitField1_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntrance() {
        this.entrance_ = null;
        this.bitField1_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEstablishment() {
        this.establishment_ = null;
        this.bitField1_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvCharger() {
        this.evCharger_ = null;
        this.bitField2_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvStation() {
        this.evStation_ = null;
        this.bitField2_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExemptRegulatedArea() {
        this.exemptRegulatedArea_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExistenceConfirmations() {
        this.existenceConfirmations_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalData() {
        this.experimentalData_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureOriginators() {
        this.featureOriginators_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureGeometry() {
        this.futureGeometry_ = null;
        this.bitField1_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFutureGeometryFor() {
        this.futureGeometryFor_ = null;
        this.bitField1_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry3D() {
        this.geometry3D_ = null;
        this.bitField2_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometryPrecisionMeters() {
        this.bitField0_ &= -4097;
        this.geometryPrecisionMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeopolitical() {
        this.geopolitical_ = null;
        this.bitField2_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeopoliticalGeometry() {
        this.geopoliticalGeometry_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHtmlText() {
        this.htmlText_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInferredGeometry() {
        this.inferredGeometry_ = null;
        this.bitField1_ &= -536870913;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInteriorCovering() {
        this.interiorCovering_ = null;
        this.bitField0_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInternal() {
        this.internal_ = null;
        this.bitField0_ &= -16385;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersection() {
        this.intersection_ = null;
        this.bitField0_ &= -67108865;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntersectionGroup() {
        this.intersectionGroup_ = null;
        this.bitField1_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKgProperty() {
        this.kgProperty_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKnowledgeGraphReference() {
        this.knowledgeGraphReference_ = null;
        this.bitField0_ &= -4194305;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandUse() {
        this.landUse_ = null;
        this.bitField2_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneMarker() {
        this.laneMarker_ = null;
        this.bitField1_ &= -134217729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = null;
        this.bitField1_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.locale_ = null;
        this.bitField1_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogicalBorder() {
        this.logicalBorder_ = null;
        this.bitField1_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedian() {
        this.median_ = null;
        this.bitField2_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField1_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperations() {
        this.operations_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalId() {
        this.originalId_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParking() {
        this.parking_ = null;
        this.bitField1_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoint() {
        this.point_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolitical() {
        this.political_ = null;
        this.bitField0_ &= -536870913;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygon() {
        this.polygon_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolygonForDisplay() {
        this.polygonForDisplay_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPolyline() {
        this.polyline_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPose() {
        this.pose_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferredViewport() {
        this.preferredViewport_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPropertyValueStatus() {
        this.propertyValueStatus_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRank() {
        this.bitField0_ &= -9;
        this.rank_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRankDetails() {
        this.rankDetails_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRawGconceptInstanceContainer() {
        this.rawGconceptInstanceContainer_ = null;
        this.bitField0_ &= -1048577;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegulatedArea() {
        this.regulatedArea_ = null;
        this.bitField1_ &= -268435457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedBorder() {
        this.relatedBorder_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedEntrance() {
        this.relatedEntrance_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedFeature() {
        this.relatedFeature_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedTerminalPoint() {
        this.relatedTerminalPoint_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelatedTimezone() {
        this.relatedTimezone_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestrictionGroup() {
        this.restrictionGroup_ = null;
        this.bitField0_ &= -134217729;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadDisruption() {
        this.roadDisruption_ = null;
        this.bitField2_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadMonitor() {
        this.roadMonitor_ = null;
        this.bitField1_ &= -67108865;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoute() {
        this.route_ = null;
        this.bitField0_ &= -16777217;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchoolDistrict() {
        this.schoolDistrict_ = null;
        this.bitField1_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegment() {
        this.segment_ = null;
        this.bitField0_ &= -33554433;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentPath() {
        this.segmentPath_ = null;
        this.bitField1_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSign() {
        this.sign_ = null;
        this.bitField1_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignpost() {
        this.signpost_ = null;
        this.bitField2_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkiBoundary() {
        this.skiBoundary_ = null;
        this.bitField1_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkiLift() {
        this.skiLift_ = null;
        this.bitField1_ &= -65537;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkiTrail() {
        this.skiTrail_ = null;
        this.bitField1_ &= -131073;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSocialReference() {
        this.socialReference_ = null;
        this.bitField0_ &= -2097153;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -262145;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStorefrontGeometry() {
        this.storefrontGeometry_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStorefrontGeometryModel() {
        this.storefrontGeometryModel_ = null;
        this.bitField2_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntheticGeometry() {
        this.bitField0_ &= -1025;
        this.syntheticGeometry_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemporaryData() {
        this.temporaryData_ = null;
        this.bitField0_ &= -32769;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreeDimModel() {
        this.threeDimModel_ = null;
        this.bitField1_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollCluster() {
        this.tollCluster_ = null;
        this.bitField1_ &= -1073741825;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPath() {
        this.tollPath_ = null;
        this.bitField2_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrack() {
        this.track_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitLine() {
        this.transitLine_ = null;
        this.bitField0_ &= -1073741825;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitLineVariant() {
        this.transitLineVariant_ = null;
        this.bitField0_ &= Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransitStation() {
        this.transitStation_ = null;
        this.bitField1_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -513;
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerticalOrdering() {
        this.verticalOrdering_ = null;
        this.bitField1_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisualizationArea() {
        this.visualizationArea_ = null;
        this.bitField2_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaterRemovedPolygon() {
        this.waterRemovedPolygon_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebsite() {
        this.website_ = emptyProtobufList();
    }

    private void ensureAccessPointIsMutable() {
        com.google.v.eo<e> eoVar = this.accessPoint_;
        if (eoVar.c()) {
            return;
        }
        this.accessPoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAddressIsMutable() {
        com.google.v.eo<h> eoVar = this.address_;
        if (eoVar.c()) {
            return;
        }
        this.address_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAssociatedEvChargingStationIsMutable() {
        com.google.v.eo<bw> eoVar = this.associatedEvChargingStation_;
        if (eoVar.c()) {
            return;
        }
        this.associatedEvChargingStation_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAttachmentIsMutable() {
        com.google.v.eo<com.google.k.b.a.a.b> eoVar = this.attachment_;
        if (eoVar.c()) {
            return;
        }
        this.attachment_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureAttributeIsMutable() {
        com.google.v.eo<x> eoVar = this.attribute_;
        if (eoVar.c()) {
            return;
        }
        this.attribute_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureChildIsMutable() {
        com.google.v.eo<bw> eoVar = this.child_;
        if (eoVar.c()) {
            return;
        }
        this.child_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureExemptRegulatedAreaIsMutable() {
        com.google.v.eo<bw> eoVar = this.exemptRegulatedArea_;
        if (eoVar.c()) {
            return;
        }
        this.exemptRegulatedArea_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureExistenceConfirmationsIsMutable() {
        com.google.v.eo<com.google.k.a.a.dh> eoVar = this.existenceConfirmations_;
        if (eoVar.c()) {
            return;
        }
        this.existenceConfirmations_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureExperimentalDataIsMutable() {
        com.google.v.eo<com.google.v.i> eoVar = this.experimentalData_;
        if (eoVar.c()) {
            return;
        }
        this.experimentalData_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureFeatureOriginatorsIsMutable() {
        com.google.v.eo<com.google.k.a.a.ci> eoVar = this.featureOriginators_;
        if (eoVar.c()) {
            return;
        }
        this.featureOriginators_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureHtmlTextIsMutable() {
        com.google.v.eo<cl> eoVar = this.htmlText_;
        if (eoVar.c()) {
            return;
        }
        this.htmlText_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureKgPropertyIsMutable() {
        com.google.v.eo<com.google.i.p> eoVar = this.kgProperty_;
        if (eoVar.c()) {
            return;
        }
        this.kgProperty_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureNameIsMutable() {
        com.google.v.eo<eh> eoVar = this.name_;
        if (eoVar.c()) {
            return;
        }
        this.name_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureParentIsMutable() {
        com.google.v.eo<bw> eoVar = this.parent_;
        if (eoVar.c()) {
            return;
        }
        this.parent_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePointIsMutable() {
        com.google.v.eo<es> eoVar = this.point_;
        if (eoVar.c()) {
            return;
        }
        this.point_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePolygonIsMutable() {
        com.google.v.eo<ex> eoVar = this.polygon_;
        if (eoVar.c()) {
            return;
        }
        this.polygon_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePolylineIsMutable() {
        com.google.v.eo<fa> eoVar = this.polyline_;
        if (eoVar.c()) {
            return;
        }
        this.polyline_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensurePropertyValueStatusIsMutable() {
        com.google.v.eo<fh> eoVar = this.propertyValueStatus_;
        if (eoVar.c()) {
            return;
        }
        this.propertyValueStatus_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRelatedBorderIsMutable() {
        com.google.v.eo<bw> eoVar = this.relatedBorder_;
        if (eoVar.c()) {
            return;
        }
        this.relatedBorder_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRelatedEntranceIsMutable() {
        com.google.v.eo<com.google.k.a.a.db> eoVar = this.relatedEntrance_;
        if (eoVar.c()) {
            return;
        }
        this.relatedEntrance_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRelatedFeatureIsMutable() {
        com.google.v.eo<gb> eoVar = this.relatedFeature_;
        if (eoVar.c()) {
            return;
        }
        this.relatedFeature_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRelatedTerminalPointIsMutable() {
        com.google.v.eo<bw> eoVar = this.relatedTerminalPoint_;
        if (eoVar.c()) {
            return;
        }
        this.relatedTerminalPoint_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRelatedTimezoneIsMutable() {
        com.google.v.eo<mi> eoVar = this.relatedTimezone_;
        if (eoVar.c()) {
            return;
        }
        this.relatedTimezone_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureSourceInfoIsMutable() {
        com.google.v.eo<jd> eoVar = this.sourceInfo_;
        if (eoVar.c()) {
            return;
        }
        this.sourceInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureStorefrontGeometryIsMutable() {
        com.google.v.eo<com.google.k.a.a.b> eoVar = this.storefrontGeometry_;
        if (eoVar.c()) {
            return;
        }
        this.storefrontGeometry_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTrackIsMutable() {
        com.google.v.eo<mv> eoVar = this.track_;
        if (eoVar.c()) {
            return;
        }
        this.track_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureWebsiteIsMutable() {
        com.google.v.eo<kt> eoVar = this.website_;
        if (eoVar.c()) {
            return;
        }
        this.website_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAnchoredGeometry(com.google.k.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.k.a.a.b bVar2 = this.anchoredGeometry_;
        if (bVar2 != null && bVar2 != com.google.k.a.a.b.getDefaultInstance()) {
            com.google.k.a.a.a aVarNewBuilder = com.google.k.a.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.k.a.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.anchoredGeometry_ = bVar;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBestLocale(ad adVar) {
        Objects.requireNonNull(adVar);
        ad adVar2 = this.bestLocale_;
        if (adVar2 != null && adVar2 != ad.getDefaultInstance()) {
            ac acVarNewBuilder = ad.newBuilder(adVar2);
            acVarNewBuilder.mergeFrom((ac) adVar);
            adVar = acVarNewBuilder.buildPartial();
        }
        this.bestLocale_ = adVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBorder(ag agVar) {
        Objects.requireNonNull(agVar);
        ag agVar2 = this.border_;
        if (agVar2 != null && agVar2 != ag.getDefaultInstance()) {
            af afVarNewBuilder = ag.newBuilder(agVar2);
            afVarNewBuilder.mergeFrom((af) agVar);
            agVar = afVarNewBuilder.buildPartial();
        }
        this.border_ = agVar;
        this.bitField1_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBound(fy fyVar) {
        Objects.requireNonNull(fyVar);
        fy fyVar2 = this.bound_;
        if (fyVar2 != null && fyVar2 != fy.getDefaultInstance()) {
            fx fxVarNewBuilder = fy.newBuilder(fyVar2);
            fxVarNewBuilder.mergeFrom((fx) fyVar);
            fyVar = fxVarNewBuilder.buildPartial();
        }
        this.bound_ = fyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBuilding(am amVar) {
        Objects.requireNonNull(amVar);
        am amVar2 = this.building_;
        if (amVar2 != null && amVar2 != am.getDefaultInstance()) {
            ak akVarNewBuilder = am.newBuilder(amVar2);
            akVarNewBuilder.mergeFrom((ak) amVar);
            amVar = akVarNewBuilder.buildPartial();
        }
        this.building_ = amVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBusinessChain(com.google.k.e.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.k.e.b bVar2 = this.businessChain_;
        if (bVar2 != null && bVar2 != com.google.k.e.b.getDefaultInstance()) {
            com.google.k.e.a aVarNewBuilder = com.google.k.e.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.k.e.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.businessChain_ = bVar;
        this.bitField1_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCenter(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.center_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.center_ = esVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCovering(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.covering_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.covering_ = aoVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDataSource(aq aqVar) {
        Objects.requireNonNull(aqVar);
        aq aqVar2 = this.dataSource_;
        if (aqVar2 != null && aqVar2 != aq.getDefaultInstance()) {
            ap apVarNewBuilder = aq.newBuilder(aqVar2);
            apVarNewBuilder.mergeFrom((ap) aqVar);
            aqVar = apVarNewBuilder.buildPartial();
        }
        this.dataSource_ = aqVar;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDetailed3DModel(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        com.google.k.a.a.eg egVar2 = this.detailed3DModel_;
        if (egVar2 != null && egVar2 != com.google.k.a.a.eg.getDefaultInstance()) {
            com.google.k.a.a.ef efVarNewBuilder = com.google.k.a.a.eg.newBuilder(egVar2);
            efVarNewBuilder.mergeFrom((com.google.k.a.a.ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.detailed3DModel_ = egVar;
        this.bitField2_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayData(com.google.k.a.a.cr crVar) {
        Objects.requireNonNull(crVar);
        com.google.k.a.a.cr crVar2 = this.displayData_;
        if (crVar2 != null && crVar2 != com.google.k.a.a.cr.getDefaultInstance()) {
            com.google.k.a.a.cq cqVarNewBuilder = com.google.k.a.a.cr.newBuilder(crVar2);
            cqVarNewBuilder.mergeFrom((com.google.k.a.a.cq) crVar);
            crVar = cqVarNewBuilder.buildPartial();
        }
        this.displayData_ = crVar;
        this.bitField1_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisputedArea(com.google.k.a.a.ct ctVar) {
        Objects.requireNonNull(ctVar);
        com.google.k.a.a.ct ctVar2 = this.disputedArea_;
        if (ctVar2 != null && ctVar2 != com.google.k.a.a.ct.getDefaultInstance()) {
            com.google.k.a.a.cs csVarNewBuilder = com.google.k.a.a.ct.newBuilder(ctVar2);
            csVarNewBuilder.mergeFrom((com.google.k.a.a.cs) ctVar);
            ctVar = csVarNewBuilder.buildPartial();
        }
        this.disputedArea_ = ctVar;
        this.bitField2_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDoodle(ax axVar) {
        Objects.requireNonNull(axVar);
        ax axVar2 = this.doodle_;
        if (axVar2 != null && axVar2 != ax.getDefaultInstance()) {
            av avVarNewBuilder = ax.newBuilder(axVar2);
            avVarNewBuilder.mergeFrom((av) axVar);
            axVar = avVarNewBuilder.buildPartial();
        }
        this.doodle_ = axVar;
        this.bitField1_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElevation(az azVar) {
        Objects.requireNonNull(azVar);
        az azVar2 = this.elevation_;
        if (azVar2 != null && azVar2 != az.getDefaultInstance()) {
            ay ayVarNewBuilder = az.newBuilder(azVar2);
            ayVarNewBuilder.mergeFrom((ay) azVar);
            azVar = ayVarNewBuilder.buildPartial();
        }
        this.elevation_ = azVar;
        this.bitField1_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeElevationModel(bb bbVar) {
        Objects.requireNonNull(bbVar);
        bb bbVar2 = this.elevationModel_;
        if (bbVar2 != null && bbVar2 != bb.getDefaultInstance()) {
            ba baVarNewBuilder = bb.newBuilder(bbVar2);
            baVarNewBuilder.mergeFrom((ba) bbVar);
            bbVar = baVarNewBuilder.buildPartial();
        }
        this.elevationModel_ = bbVar;
        this.bitField1_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEntrance(bh bhVar) {
        Objects.requireNonNull(bhVar);
        bh bhVar2 = this.entrance_;
        if (bhVar2 != null && bhVar2 != bh.getDefaultInstance()) {
            bc bcVarNewBuilder = bh.newBuilder(bhVar2);
            bcVarNewBuilder.mergeFrom((bc) bhVar);
            bhVar = bcVarNewBuilder.buildPartial();
        }
        this.entrance_ = bhVar;
        this.bitField1_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEstablishment(bm bmVar) {
        Objects.requireNonNull(bmVar);
        bm bmVar2 = this.establishment_;
        if (bmVar2 != null && bmVar2 != bm.getDefaultInstance()) {
            bk bkVarNewBuilder = bm.newBuilder(bmVar2);
            bkVarNewBuilder.mergeFrom((bk) bmVar);
            bmVar = bkVarNewBuilder.buildPartial();
        }
        this.establishment_ = bmVar;
        this.bitField1_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvCharger(com.google.w.g.i iVar) {
        Objects.requireNonNull(iVar);
        com.google.w.g.i iVar2 = this.evCharger_;
        if (iVar2 != null && iVar2 != com.google.w.g.i.getDefaultInstance()) {
            com.google.w.g.a aVarNewBuilder = com.google.w.g.i.newBuilder(iVar2);
            aVarNewBuilder.mergeFrom((com.google.w.g.a) iVar);
            iVar = aVarNewBuilder.buildPartial();
        }
        this.evCharger_ = iVar;
        this.bitField2_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEvStation(com.google.w.g.p pVar) {
        Objects.requireNonNull(pVar);
        com.google.w.g.p pVar2 = this.evStation_;
        if (pVar2 != null && pVar2 != com.google.w.g.p.getDefaultInstance()) {
            com.google.w.g.j jVarNewBuilder = com.google.w.g.p.newBuilder(pVar2);
            jVarNewBuilder.mergeFrom((com.google.w.g.j) pVar);
            pVar = jVarNewBuilder.buildPartial();
        }
        this.evStation_ = pVar;
        this.bitField2_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFutureGeometry(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.futureGeometry_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.futureGeometry_ = bwVar;
        this.bitField1_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFutureGeometryFor(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.futureGeometryFor_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.futureGeometryFor_ = bwVar;
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry3D(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        com.google.k.a.a.eg egVar2 = this.geometry3D_;
        if (egVar2 != null && egVar2 != com.google.k.a.a.eg.getDefaultInstance()) {
            com.google.k.a.a.ef efVarNewBuilder = com.google.k.a.a.eg.newBuilder(egVar2);
            efVarNewBuilder.mergeFrom((com.google.k.a.a.ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.geometry3D_ = egVar;
        this.bitField2_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeopolitical(com.google.k.a.a.eo eoVar) {
        Objects.requireNonNull(eoVar);
        com.google.k.a.a.eo eoVar2 = this.geopolitical_;
        if (eoVar2 != null && eoVar2 != com.google.k.a.a.eo.getDefaultInstance()) {
            com.google.k.a.a.eh ehVarNewBuilder = com.google.k.a.a.eo.newBuilder(eoVar2);
            ehVarNewBuilder.mergeFrom((com.google.k.a.a.eh) eoVar);
            eoVar = ehVarNewBuilder.buildPartial();
        }
        this.geopolitical_ = eoVar;
        this.bitField2_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeopoliticalGeometry(com.google.k.a.a.eq eqVar) {
        Objects.requireNonNull(eqVar);
        com.google.k.a.a.eq eqVar2 = this.geopoliticalGeometry_;
        if (eqVar2 != null && eqVar2 != com.google.k.a.a.eq.getDefaultInstance()) {
            com.google.k.a.a.ep epVarNewBuilder = com.google.k.a.a.eq.newBuilder(eqVar2);
            epVarNewBuilder.mergeFrom((com.google.k.a.a.ep) eqVar);
            eqVar = epVarNewBuilder.buildPartial();
        }
        this.geopoliticalGeometry_ = eqVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.id_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.id_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInferredGeometry(com.google.k.a.a.es esVar) {
        Objects.requireNonNull(esVar);
        com.google.k.a.a.es esVar2 = this.inferredGeometry_;
        if (esVar2 != null && esVar2 != com.google.k.a.a.es.getDefaultInstance()) {
            com.google.k.a.a.er erVarNewBuilder = com.google.k.a.a.es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((com.google.k.a.a.er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.inferredGeometry_ = esVar;
        this.bitField1_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInteriorCovering(ao aoVar) {
        Objects.requireNonNull(aoVar);
        ao aoVar2 = this.interiorCovering_;
        if (aoVar2 != null && aoVar2 != ao.getDefaultInstance()) {
            an anVarNewBuilder = ao.newBuilder(aoVar2);
            anVarNewBuilder.mergeFrom((an) aoVar);
            aoVar = anVarNewBuilder.buildPartial();
        }
        this.interiorCovering_ = aoVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInternal(com.google.k.a.a.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.k.a.a.a.a.b bVar2 = this.internal_;
        if (bVar2 != null && bVar2 != com.google.k.a.a.a.a.b.getDefaultInstance()) {
            com.google.k.a.a.a.a.a aVarNewBuilder = com.google.k.a.a.a.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.k.a.a.a.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.internal_ = bVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntersection(cs csVar) {
        Objects.requireNonNull(csVar);
        cs csVar2 = this.intersection_;
        if (csVar2 != null && csVar2 != cs.getDefaultInstance()) {
            cr crVarNewBuilder = cs.newBuilder(csVar2);
            crVarNewBuilder.mergeFrom((cr) csVar);
            csVar = crVarNewBuilder.buildPartial();
        }
        this.intersection_ = csVar;
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIntersectionGroup(cv cvVar) {
        Objects.requireNonNull(cvVar);
        cv cvVar2 = this.intersectionGroup_;
        if (cvVar2 != null && cvVar2 != cv.getDefaultInstance()) {
            ct ctVarNewBuilder = cv.newBuilder(cvVar2);
            ctVarNewBuilder.mergeFrom((ct) cvVar);
            cvVar = ctVarNewBuilder.buildPartial();
        }
        this.intersectionGroup_ = cvVar;
        this.bitField1_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKnowledgeGraphReference(cx cxVar) {
        Objects.requireNonNull(cxVar);
        cx cxVar2 = this.knowledgeGraphReference_;
        if (cxVar2 != null && cxVar2 != cx.getDefaultInstance()) {
            cw cwVarNewBuilder = cx.newBuilder(cxVar2);
            cwVarNewBuilder.mergeFrom((cw) cxVar);
            cxVar = cwVarNewBuilder.buildPartial();
        }
        this.knowledgeGraphReference_ = cxVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLandUse(com.google.w.g.s sVar) {
        Objects.requireNonNull(sVar);
        com.google.w.g.s sVar2 = this.landUse_;
        if (sVar2 != null && sVar2 != com.google.w.g.s.getDefaultInstance()) {
            com.google.w.g.q qVarNewBuilder = com.google.w.g.s.newBuilder(sVar2);
            qVarNewBuilder.mergeFrom((com.google.w.g.q) sVar);
            sVar = qVarNewBuilder.buildPartial();
        }
        this.landUse_ = sVar;
        this.bitField2_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLaneMarker(com.google.k.a.a.fg fgVar) {
        Objects.requireNonNull(fgVar);
        com.google.k.a.a.fg fgVar2 = this.laneMarker_;
        if (fgVar2 != null && fgVar2 != com.google.k.a.a.fg.getDefaultInstance()) {
            com.google.k.a.a.ff ffVarNewBuilder = com.google.k.a.a.fg.newBuilder(fgVar2);
            ffVarNewBuilder.mergeFrom((com.google.k.a.a.ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.laneMarker_ = fgVar;
        this.bitField1_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLevel(dy dyVar) {
        Objects.requireNonNull(dyVar);
        dy dyVar2 = this.level_;
        if (dyVar2 != null && dyVar2 != dy.getDefaultInstance()) {
            dx dxVarNewBuilder = dy.newBuilder(dyVar2);
            dxVarNewBuilder.mergeFrom((dx) dyVar);
            dyVar = dxVarNewBuilder.buildPartial();
        }
        this.level_ = dyVar;
        this.bitField1_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocale(ea eaVar) {
        Objects.requireNonNull(eaVar);
        ea eaVar2 = this.locale_;
        if (eaVar2 != null && eaVar2 != ea.getDefaultInstance()) {
            dz dzVarNewBuilder = ea.newBuilder(eaVar2);
            dzVarNewBuilder.mergeFrom((dz) eaVar);
            eaVar = dzVarNewBuilder.buildPartial();
        }
        this.locale_ = eaVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogicalBorder(com.google.k.a.a.fv fvVar) {
        Objects.requireNonNull(fvVar);
        com.google.k.a.a.fv fvVar2 = this.logicalBorder_;
        if (fvVar2 != null && fvVar2 != com.google.k.a.a.fv.getDefaultInstance()) {
            com.google.k.a.a.ft ftVarNewBuilder = com.google.k.a.a.fv.newBuilder(fvVar2);
            ftVarNewBuilder.mergeFrom((com.google.k.a.a.ft) fvVar);
            fvVar = ftVarNewBuilder.buildPartial();
        }
        this.logicalBorder_ = fvVar;
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMedian(com.google.k.a.a.gc gcVar) {
        Objects.requireNonNull(gcVar);
        com.google.k.a.a.gc gcVar2 = this.median_;
        if (gcVar2 != null && gcVar2 != com.google.k.a.a.gc.getDefaultInstance()) {
            com.google.k.a.a.fw fwVarNewBuilder = com.google.k.a.a.gc.newBuilder(gcVar2);
            fwVarNewBuilder.mergeFrom((com.google.k.a.a.fw) gcVar);
            gcVar = fwVarNewBuilder.buildPartial();
        }
        this.median_ = gcVar;
        this.bitField2_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(com.google.k.a.a.dy dyVar) {
        Objects.requireNonNull(dyVar);
        com.google.k.a.a.dy dyVar2 = this.metadata_;
        if (dyVar2 != null && dyVar2 != com.google.k.a.a.dy.getDefaultInstance()) {
            com.google.k.a.a.dw dwVarNewBuilder = com.google.k.a.a.dy.newBuilder(dyVar2);
            dwVarNewBuilder.mergeFrom((com.google.k.a.a.dw) dyVar);
            dyVar = dwVarNewBuilder.buildPartial();
        }
        this.metadata_ = dyVar;
        this.bitField1_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOperations(com.google.k.a.a.gg ggVar) {
        Objects.requireNonNull(ggVar);
        com.google.k.a.a.gg ggVar2 = this.operations_;
        if (ggVar2 != null && ggVar2 != com.google.k.a.a.gg.getDefaultInstance()) {
            com.google.k.a.a.gf gfVarNewBuilder = com.google.k.a.a.gg.newBuilder(ggVar2);
            gfVarNewBuilder.mergeFrom((com.google.k.a.a.gf) ggVar);
            ggVar = gfVarNewBuilder.buildPartial();
        }
        this.operations_ = ggVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOriginalId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.originalId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.originalId_ = bwVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParking(com.google.k.a.a.gp gpVar) {
        Objects.requireNonNull(gpVar);
        com.google.k.a.a.gp gpVar2 = this.parking_;
        if (gpVar2 != null && gpVar2 != com.google.k.a.a.gp.getDefaultInstance()) {
            com.google.k.a.a.go goVarNewBuilder = com.google.k.a.a.gp.newBuilder(gpVar2);
            goVarNewBuilder.mergeFrom((com.google.k.a.a.go) gpVar);
            gpVar = goVarNewBuilder.buildPartial();
        }
        this.parking_ = gpVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolitical(ev evVar) {
        Objects.requireNonNull(evVar);
        ev evVar2 = this.political_;
        if (evVar2 != null && evVar2 != ev.getDefaultInstance()) {
            eu euVarNewBuilder = ev.newBuilder(evVar2);
            euVarNewBuilder.mergeFrom((eu) evVar);
            evVar = euVarNewBuilder.buildPartial();
        }
        this.political_ = evVar;
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePolygonForDisplay(ex exVar) {
        Objects.requireNonNull(exVar);
        ex exVar2 = this.polygonForDisplay_;
        if (exVar2 != null && exVar2 != ex.getDefaultInstance()) {
            ew ewVarNewBuilder = ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.polygonForDisplay_ = exVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePose(com.google.k.a.a.gx gxVar) {
        Objects.requireNonNull(gxVar);
        com.google.k.a.a.gx gxVar2 = this.pose_;
        if (gxVar2 != null && gxVar2 != com.google.k.a.a.gx.getDefaultInstance()) {
            com.google.k.a.a.gw gwVarNewBuilder = com.google.k.a.a.gx.newBuilder(gxVar2);
            gwVarNewBuilder.mergeFrom((com.google.k.a.a.gw) gxVar);
            gxVar = gwVarNewBuilder.buildPartial();
        }
        this.pose_ = gxVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePreferredViewport(fy fyVar) {
        Objects.requireNonNull(fyVar);
        fy fyVar2 = this.preferredViewport_;
        if (fyVar2 != null && fyVar2 != fy.getDefaultInstance()) {
            fx fxVarNewBuilder = fy.newBuilder(fyVar2);
            fxVarNewBuilder.mergeFrom((fx) fyVar);
            fyVar = fxVarNewBuilder.buildPartial();
        }
        this.preferredViewport_ = fyVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRankDetails(fl flVar) {
        Objects.requireNonNull(flVar);
        fl flVar2 = this.rankDetails_;
        if (flVar2 != null && flVar2 != fl.getDefaultInstance()) {
            fj fjVarNewBuilder = fl.newBuilder(flVar2);
            fjVarNewBuilder.mergeFrom((fj) flVar);
            flVar = fjVarNewBuilder.buildPartial();
        }
        this.rankDetails_ = flVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRawGconceptInstanceContainer(com.google.k.d.a.a.e eVar) {
        Objects.requireNonNull(eVar);
        com.google.k.d.a.a.e eVar2 = this.rawGconceptInstanceContainer_;
        if (eVar2 != null && eVar2 != com.google.k.d.a.a.e.getDefaultInstance()) {
            com.google.k.d.a.a.d dVarNewBuilder = com.google.k.d.a.a.e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((com.google.k.d.a.a.d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.rawGconceptInstanceContainer_ = eVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRegulatedArea(com.google.k.a.a.jn jnVar) {
        Objects.requireNonNull(jnVar);
        com.google.k.a.a.jn jnVar2 = this.regulatedArea_;
        if (jnVar2 != null && jnVar2 != com.google.k.a.a.jn.getDefaultInstance()) {
            com.google.k.a.a.jl jlVarNewBuilder = com.google.k.a.a.jn.newBuilder(jnVar2);
            jlVarNewBuilder.mergeFrom((com.google.k.a.a.jl) jnVar);
            jnVar = jlVarNewBuilder.buildPartial();
        }
        this.regulatedArea_ = jnVar;
        this.bitField1_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRestrictionGroup(com.google.k.a.a.js jsVar) {
        Objects.requireNonNull(jsVar);
        com.google.k.a.a.js jsVar2 = this.restrictionGroup_;
        if (jsVar2 != null && jsVar2 != com.google.k.a.a.js.getDefaultInstance()) {
            com.google.k.a.a.jo joVarNewBuilder = com.google.k.a.a.js.newBuilder(jsVar2);
            joVarNewBuilder.mergeFrom((com.google.k.a.a.jo) jsVar);
            jsVar = joVarNewBuilder.buildPartial();
        }
        this.restrictionGroup_ = jsVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadDisruption(com.google.k.a.a.kq kqVar) {
        Objects.requireNonNull(kqVar);
        com.google.k.a.a.kq kqVar2 = this.roadDisruption_;
        if (kqVar2 != null && kqVar2 != com.google.k.a.a.kq.getDefaultInstance()) {
            com.google.k.a.a.kc kcVarNewBuilder = com.google.k.a.a.kq.newBuilder(kqVar2);
            kcVarNewBuilder.mergeFrom((com.google.k.a.a.kc) kqVar);
            kqVar = kcVarNewBuilder.buildPartial();
        }
        this.roadDisruption_ = kqVar;
        this.bitField2_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoadMonitor(com.google.k.a.a.ks ksVar) {
        Objects.requireNonNull(ksVar);
        com.google.k.a.a.ks ksVar2 = this.roadMonitor_;
        if (ksVar2 != null && ksVar2 != com.google.k.a.a.ks.getDefaultInstance()) {
            com.google.k.a.a.kr krVarNewBuilder = com.google.k.a.a.ks.newBuilder(ksVar2);
            krVarNewBuilder.mergeFrom((com.google.k.a.a.kr) ksVar);
            ksVar = krVarNewBuilder.buildPartial();
        }
        this.roadMonitor_ = ksVar;
        this.bitField1_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRoute(gt gtVar) {
        Objects.requireNonNull(gtVar);
        gt gtVar2 = this.route_;
        if (gtVar2 != null && gtVar2 != gt.getDefaultInstance()) {
            gs gsVarNewBuilder = gt.newBuilder(gtVar2);
            gsVarNewBuilder.mergeFrom((gs) gtVar);
            gtVar = gsVarNewBuilder.buildPartial();
        }
        this.route_ = gtVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSchoolDistrict(gw gwVar) {
        Objects.requireNonNull(gwVar);
        gw gwVar2 = this.schoolDistrict_;
        if (gwVar2 != null && gwVar2 != gw.getDefaultInstance()) {
            gu guVarNewBuilder = gw.newBuilder(gwVar2);
            guVarNewBuilder.mergeFrom((gu) gwVar);
            gwVar = guVarNewBuilder.buildPartial();
        }
        this.schoolDistrict_ = gwVar;
        this.bitField1_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegment(ik ikVar) {
        Objects.requireNonNull(ikVar);
        ik ikVar2 = this.segment_;
        if (ikVar2 != null && ikVar2 != ik.getDefaultInstance()) {
            hv hvVarNewBuilder = ik.newBuilder(ikVar2);
            hvVarNewBuilder.mergeFrom((hv) ikVar);
            ikVar = hvVarNewBuilder.buildPartial();
        }
        this.segment_ = ikVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentPath(ip ipVar) {
        Objects.requireNonNull(ipVar);
        ip ipVar2 = this.segmentPath_;
        if (ipVar2 != null && ipVar2 != ip.getDefaultInstance()) {
            io ioVarNewBuilder = ip.newBuilder(ipVar2);
            ioVarNewBuilder.mergeFrom((io) ipVar);
            ipVar = ioVarNewBuilder.buildPartial();
        }
        this.segmentPath_ = ipVar;
        this.bitField1_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSign(gn gnVar) {
        Objects.requireNonNull(gnVar);
        gn gnVar2 = this.sign_;
        if (gnVar2 != null && gnVar2 != gn.getDefaultInstance()) {
            gm gmVarNewBuilder = gn.newBuilder(gnVar2);
            gmVarNewBuilder.mergeFrom((gm) gnVar);
            gnVar = gmVarNewBuilder.buildPartial();
        }
        this.sign_ = gnVar;
        this.bitField1_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSignpost(lg lgVar) {
        Objects.requireNonNull(lgVar);
        lg lgVar2 = this.signpost_;
        if (lgVar2 != null && lgVar2 != lg.getDefaultInstance()) {
            lf lfVarNewBuilder = lg.newBuilder(lgVar2);
            lfVarNewBuilder.mergeFrom((lf) lgVar);
            lgVar = lfVarNewBuilder.buildPartial();
        }
        this.signpost_ = lgVar;
        this.bitField2_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkiBoundary(is isVar) {
        Objects.requireNonNull(isVar);
        is isVar2 = this.skiBoundary_;
        if (isVar2 != null && isVar2 != is.getDefaultInstance()) {
            iq iqVarNewBuilder = is.newBuilder(isVar2);
            iqVarNewBuilder.mergeFrom((iq) isVar);
            isVar = iqVarNewBuilder.buildPartial();
        }
        this.skiBoundary_ = isVar;
        this.bitField1_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkiLift(iv ivVar) {
        Objects.requireNonNull(ivVar);
        iv ivVar2 = this.skiLift_;
        if (ivVar2 != null && ivVar2 != iv.getDefaultInstance()) {
            it itVarNewBuilder = iv.newBuilder(ivVar2);
            itVarNewBuilder.mergeFrom((it) ivVar);
            ivVar = itVarNewBuilder.buildPartial();
        }
        this.skiLift_ = ivVar;
        this.bitField1_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSkiTrail(iz izVar) {
        Objects.requireNonNull(izVar);
        iz izVar2 = this.skiTrail_;
        if (izVar2 != null && izVar2 != iz.getDefaultInstance()) {
            iw iwVarNewBuilder = iz.newBuilder(izVar2);
            iwVarNewBuilder.mergeFrom((iw) izVar);
            izVar = iwVarNewBuilder.buildPartial();
        }
        this.skiTrail_ = izVar;
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSocialReference(jb jbVar) {
        Objects.requireNonNull(jbVar);
        jb jbVar2 = this.socialReference_;
        if (jbVar2 != null && jbVar2 != jb.getDefaultInstance()) {
            ja jaVarNewBuilder = jb.newBuilder(jbVar2);
            jaVarNewBuilder.mergeFrom((ja) jbVar);
            jbVar = jaVarNewBuilder.buildPartial();
        }
        this.socialReference_ = jbVar;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(bq bqVar) {
        Objects.requireNonNull(bqVar);
        bq bqVar2 = this.status_;
        if (bqVar2 != null && bqVar2 != bq.getDefaultInstance()) {
            bn bnVarNewBuilder = bq.newBuilder(bqVar2);
            bnVarNewBuilder.mergeFrom((bn) bqVar);
            bqVar = bnVarNewBuilder.buildPartial();
        }
        this.status_ = bqVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStorefrontGeometryModel(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        com.google.k.a.a.eg egVar2 = this.storefrontGeometryModel_;
        if (egVar2 != null && egVar2 != com.google.k.a.a.eg.getDefaultInstance()) {
            com.google.k.a.a.ef efVarNewBuilder = com.google.k.a.a.eg.newBuilder(egVar2);
            efVarNewBuilder.mergeFrom((com.google.k.a.a.ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.storefrontGeometryModel_ = egVar;
        this.bitField2_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        com.google.w.n.a.b bVar2 = this.temporaryData_;
        if (bVar2 != null && bVar2 != com.google.w.n.a.b.getDefaultInstance()) {
            com.google.w.n.a.a aVarNewBuilder = com.google.w.n.a.b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((com.google.w.n.a.a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.temporaryData_ = bVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeThreeDimModel(js jsVar) {
        Objects.requireNonNull(jsVar);
        js jsVar2 = this.threeDimModel_;
        if (jsVar2 != null && jsVar2 != js.getDefaultInstance()) {
            jr jrVarNewBuilder = js.newBuilder(jsVar2);
            jrVarNewBuilder.mergeFrom((jr) jsVar);
            jsVar = jrVarNewBuilder.buildPartial();
        }
        this.threeDimModel_ = jsVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollCluster(ml mlVar) {
        Objects.requireNonNull(mlVar);
        ml mlVar2 = this.tollCluster_;
        if (mlVar2 != null && mlVar2 != ml.getDefaultInstance()) {
            mk mkVarNewBuilder = ml.newBuilder(mlVar2);
            mkVarNewBuilder.mergeFrom((mk) mlVar);
            mlVar = mkVarNewBuilder.buildPartial();
        }
        this.tollCluster_ = mlVar;
        this.bitField1_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTollPath(mt mtVar) {
        Objects.requireNonNull(mtVar);
        mt mtVar2 = this.tollPath_;
        if (mtVar2 != null && mtVar2 != mt.getDefaultInstance()) {
            mn mnVarNewBuilder = mt.newBuilder(mtVar2);
            mnVarNewBuilder.mergeFrom((mn) mtVar);
            mtVar = mnVarNewBuilder.buildPartial();
        }
        this.tollPath_ = mtVar;
        this.bitField2_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransitLine(km kmVar) {
        Objects.requireNonNull(kmVar);
        km kmVar2 = this.transitLine_;
        if (kmVar2 != null && kmVar2 != km.getDefaultInstance()) {
            kk kkVarNewBuilder = km.newBuilder(kmVar2);
            kkVarNewBuilder.mergeFrom((kk) kmVar);
            kmVar = kkVarNewBuilder.buildPartial();
        }
        this.transitLine_ = kmVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransitLineVariant(nj njVar) {
        Objects.requireNonNull(njVar);
        nj njVar2 = this.transitLineVariant_;
        if (njVar2 != null && njVar2 != nj.getDefaultInstance()) {
            ni niVarNewBuilder = nj.newBuilder(njVar2);
            niVarNewBuilder.mergeFrom((ni) njVar);
            njVar = niVarNewBuilder.buildPartial();
        }
        this.transitLineVariant_ = njVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransitStation(kr krVar) {
        Objects.requireNonNull(krVar);
        kr krVar2 = this.transitStation_;
        if (krVar2 != null && krVar2 != kr.getDefaultInstance()) {
            kn knVarNewBuilder = kr.newBuilder(krVar2);
            knVarNewBuilder.mergeFrom((kn) krVar);
            krVar = knVarNewBuilder.buildPartial();
        }
        this.transitStation_ = krVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVerticalOrdering(oj ojVar) {
        Objects.requireNonNull(ojVar);
        oj ojVar2 = this.verticalOrdering_;
        if (ojVar2 != null && ojVar2 != oj.getDefaultInstance()) {
            oi oiVarNewBuilder = oj.newBuilder(ojVar2);
            oiVarNewBuilder.mergeFrom((oi) ojVar);
            ojVar = oiVarNewBuilder.buildPartial();
        }
        this.verticalOrdering_ = ojVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVisualizationArea(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        com.google.k.a.a.eg egVar2 = this.visualizationArea_;
        if (egVar2 != null && egVar2 != com.google.k.a.a.eg.getDefaultInstance()) {
            com.google.k.a.a.ef efVarNewBuilder = com.google.k.a.a.eg.newBuilder(egVar2);
            efVarNewBuilder.mergeFrom((com.google.k.a.a.ef) egVar);
            egVar = efVarNewBuilder.buildPartial();
        }
        this.visualizationArea_ = egVar;
        this.bitField2_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWaterRemovedPolygon(ex exVar) {
        Objects.requireNonNull(exVar);
        ex exVar2 = this.waterRemovedPolygon_;
        if (exVar2 != null && exVar2 != ex.getDefaultInstance()) {
            ew ewVarNewBuilder = ex.newBuilder(exVar2);
            ewVarNewBuilder.mergeFrom((ew) exVar);
            exVar = ewVarNewBuilder.buildPartial();
        }
        this.waterRemovedPolygon_ = exVar;
        this.bitField0_ |= 64;
    }

    public static br newBuilder() {
        return (br) DEFAULT_INSTANCE.createBuilder();
    }

    public static bt parseDelimitedFrom(InputStream inputStream) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(com.google.v.v vVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAccessPoint(int i2) {
        ensureAccessPointIsMutable();
        this.accessPoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAddress(int i2) {
        ensureAddressIsMutable();
        this.address_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAssociatedEvChargingStation(int i2) {
        ensureAssociatedEvChargingStationIsMutable();
        this.associatedEvChargingStation_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttachment(int i2) {
        ensureAttachmentIsMutable();
        this.attachment_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttribute(int i2) {
        ensureAttributeIsMutable();
        this.attribute_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeChild(int i2) {
        ensureChildIsMutable();
        this.child_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExemptRegulatedArea(int i2) {
        ensureExemptRegulatedAreaIsMutable();
        this.exemptRegulatedArea_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExistenceConfirmations(int i2) {
        ensureExistenceConfirmationsIsMutable();
        this.existenceConfirmations_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExperimentalData(int i2) {
        ensureExperimentalDataIsMutable();
        this.experimentalData_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFeatureOriginators(int i2) {
        ensureFeatureOriginatorsIsMutable();
        this.featureOriginators_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeHtmlText(int i2) {
        ensureHtmlTextIsMutable();
        this.htmlText_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeKgProperty(int i2) {
        ensureKgPropertyIsMutable();
        this.kgProperty_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i2) {
        ensureNameIsMutable();
        this.name_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeParent(int i2) {
        ensureParentIsMutable();
        this.parent_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePoint(int i2) {
        ensurePointIsMutable();
        this.point_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolygon(int i2) {
        ensurePolygonIsMutable();
        this.polygon_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePolyline(int i2) {
        ensurePolylineIsMutable();
        this.polyline_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePropertyValueStatus(int i2) {
        ensurePropertyValueStatusIsMutable();
        this.propertyValueStatus_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedBorder(int i2) {
        ensureRelatedBorderIsMutable();
        this.relatedBorder_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedEntrance(int i2) {
        ensureRelatedEntranceIsMutable();
        this.relatedEntrance_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedFeature(int i2) {
        ensureRelatedFeatureIsMutable();
        this.relatedFeature_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedTerminalPoint(int i2) {
        ensureRelatedTerminalPointIsMutable();
        this.relatedTerminalPoint_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRelatedTimezone(int i2) {
        ensureRelatedTimezoneIsMutable();
        this.relatedTimezone_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSourceInfo(int i2) {
        ensureSourceInfoIsMutable();
        this.sourceInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStorefrontGeometry(int i2) {
        ensureStorefrontGeometryIsMutable();
        this.storefrontGeometry_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrack(int i2) {
        ensureTrackIsMutable();
        this.track_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWebsite(int i2) {
        ensureWebsiteIsMutable();
        this.website_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessPoint(int i2, e eVar) {
        Objects.requireNonNull(eVar);
        ensureAccessPointIsMutable();
        this.accessPoint_.set(i2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(int i2, h hVar) {
        Objects.requireNonNull(hVar);
        ensureAddressIsMutable();
        this.address_.set(i2, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnchoredGeometry(com.google.k.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.anchoredGeometry_ = bVar;
        this.bitField1_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssociatedEvChargingStation(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAssociatedEvChargingStationIsMutable();
        this.associatedEvChargingStation_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttachment(int i2, com.google.k.b.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureAttachmentIsMutable();
        this.attachment_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttribute(int i2, x xVar) {
        Objects.requireNonNull(xVar);
        ensureAttributeIsMutable();
        this.attribute_.set(i2, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBestLocale(ad adVar) {
        Objects.requireNonNull(adVar);
        this.bestLocale_ = adVar;
        this.bitField0_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBorder(ag agVar) {
        Objects.requireNonNull(agVar);
        this.border_ = agVar;
        this.bitField1_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBound(fy fyVar) {
        Objects.requireNonNull(fyVar);
        this.bound_ = fyVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuilding(am amVar) {
        Objects.requireNonNull(amVar);
        this.building_ = amVar;
        this.bitField1_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessChain(com.google.k.e.b bVar) {
        Objects.requireNonNull(bVar);
        this.businessChain_ = bVar;
        this.bitField1_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCenter(es esVar) {
        Objects.requireNonNull(esVar);
        this.center_ = esVar;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChild(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildIsMutable();
        this.child_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCovering(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.covering_ = aoVar;
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataSource(aq aqVar) {
        Objects.requireNonNull(aqVar);
        this.dataSource_ = aqVar;
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetailed3DModel(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        this.detailed3DModel_ = egVar;
        this.bitField2_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayData(com.google.k.a.a.cr crVar) {
        Objects.requireNonNull(crVar);
        this.displayData_ = crVar;
        this.bitField1_ |= 8388608;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisputedArea(com.google.k.a.a.ct ctVar) {
        Objects.requireNonNull(ctVar);
        this.disputedArea_ = ctVar;
        this.bitField2_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoodle(ax axVar) {
        Objects.requireNonNull(axVar);
        this.doodle_ = axVar;
        this.bitField1_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElevation(az azVar) {
        Objects.requireNonNull(azVar);
        this.elevation_ = azVar;
        this.bitField1_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElevationModel(bb bbVar) {
        Objects.requireNonNull(bbVar);
        this.elevationModel_ = bbVar;
        this.bitField1_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntrance(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.entrance_ = bhVar;
        this.bitField1_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEstablishment(bm bmVar) {
        Objects.requireNonNull(bmVar);
        this.establishment_ = bmVar;
        this.bitField1_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvCharger(com.google.w.g.i iVar) {
        Objects.requireNonNull(iVar);
        this.evCharger_ = iVar;
        this.bitField2_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvStation(com.google.w.g.p pVar) {
        Objects.requireNonNull(pVar);
        this.evStation_ = pVar;
        this.bitField2_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExemptRegulatedArea(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExemptRegulatedAreaIsMutable();
        this.exemptRegulatedArea_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExistenceConfirmations(int i2, com.google.k.a.a.dh dhVar) {
        Objects.requireNonNull(dhVar);
        ensureExistenceConfirmationsIsMutable();
        this.existenceConfirmations_.set(i2, dhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalData(int i2, com.google.v.i iVar) {
        Objects.requireNonNull(iVar);
        ensureExperimentalDataIsMutable();
        this.experimentalData_.set(i2, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureOriginators(int i2, com.google.k.a.a.ci ciVar) {
        Objects.requireNonNull(ciVar);
        ensureFeatureOriginatorsIsMutable();
        this.featureOriginators_.set(i2, ciVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureGeometry(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.futureGeometry_ = bwVar;
        this.bitField1_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFutureGeometryFor(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.futureGeometryFor_ = bwVar;
        this.bitField1_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry3D(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        this.geometry3D_ = egVar;
        this.bitField2_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometryPrecisionMeters(double d2) {
        this.bitField0_ |= 4096;
        this.geometryPrecisionMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeopolitical(com.google.k.a.a.eo eoVar) {
        Objects.requireNonNull(eoVar);
        this.geopolitical_ = eoVar;
        this.bitField2_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeopoliticalGeometry(com.google.k.a.a.eq eqVar) {
        Objects.requireNonNull(eqVar);
        this.geopoliticalGeometry_ = eqVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHtmlText(int i2, cl clVar) {
        Objects.requireNonNull(clVar);
        ensureHtmlTextIsMutable();
        this.htmlText_.set(i2, clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.id_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInferredGeometry(com.google.k.a.a.es esVar) {
        Objects.requireNonNull(esVar);
        this.inferredGeometry_ = esVar;
        this.bitField1_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInteriorCovering(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.interiorCovering_ = aoVar;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInternal(com.google.k.a.a.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.internal_ = bVar;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersection(cs csVar) {
        Objects.requireNonNull(csVar);
        this.intersection_ = csVar;
        this.bitField0_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntersectionGroup(cv cvVar) {
        Objects.requireNonNull(cvVar);
        this.intersectionGroup_ = cvVar;
        this.bitField1_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKgProperty(int i2, com.google.i.p pVar) {
        Objects.requireNonNull(pVar);
        ensureKgPropertyIsMutable();
        this.kgProperty_.set(i2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKnowledgeGraphReference(cx cxVar) {
        Objects.requireNonNull(cxVar);
        this.knowledgeGraphReference_ = cxVar;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandUse(com.google.w.g.s sVar) {
        Objects.requireNonNull(sVar);
        this.landUse_ = sVar;
        this.bitField2_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneMarker(com.google.k.a.a.fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.laneMarker_ = fgVar;
        this.bitField1_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(dy dyVar) {
        Objects.requireNonNull(dyVar);
        this.level_ = dyVar;
        this.bitField1_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(ea eaVar) {
        Objects.requireNonNull(eaVar);
        this.locale_ = eaVar;
        this.bitField1_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogicalBorder(com.google.k.a.a.fv fvVar) {
        Objects.requireNonNull(fvVar);
        this.logicalBorder_ = fvVar;
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedian(com.google.k.a.a.gc gcVar) {
        Objects.requireNonNull(gcVar);
        this.median_ = gcVar;
        this.bitField2_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(com.google.k.a.a.dy dyVar) {
        Objects.requireNonNull(dyVar);
        this.metadata_ = dyVar;
        this.bitField1_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i2, eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureNameIsMutable();
        this.name_.set(i2, ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperations(com.google.k.a.a.gg ggVar) {
        Objects.requireNonNull(ggVar);
        this.operations_ = ggVar;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.originalId_ = bwVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParentIsMutable();
        this.parent_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParking(com.google.k.a.a.gp gpVar) {
        Objects.requireNonNull(gpVar);
        this.parking_ = gpVar;
        this.bitField1_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(int i2, es esVar) {
        Objects.requireNonNull(esVar);
        ensurePointIsMutable();
        this.point_.set(i2, esVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolitical(ev evVar) {
        Objects.requireNonNull(evVar);
        this.political_ = evVar;
        this.bitField0_ |= 536870912;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygon(int i2, ex exVar) {
        Objects.requireNonNull(exVar);
        ensurePolygonIsMutable();
        this.polygon_.set(i2, exVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolygonForDisplay(ex exVar) {
        Objects.requireNonNull(exVar);
        this.polygonForDisplay_ = exVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPolyline(int i2, fa faVar) {
        Objects.requireNonNull(faVar);
        ensurePolylineIsMutable();
        this.polyline_.set(i2, faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPose(com.google.k.a.a.gx gxVar) {
        Objects.requireNonNull(gxVar);
        this.pose_ = gxVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferredViewport(fy fyVar) {
        Objects.requireNonNull(fyVar);
        this.preferredViewport_ = fyVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPropertyValueStatus(int i2, fh fhVar) {
        Objects.requireNonNull(fhVar);
        ensurePropertyValueStatusIsMutable();
        this.propertyValueStatus_.set(i2, fhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRank(float f2) {
        this.bitField0_ |= 8;
        this.rank_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRankDetails(fl flVar) {
        Objects.requireNonNull(flVar);
        this.rankDetails_ = flVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRawGconceptInstanceContainer(com.google.k.d.a.a.e eVar) {
        Objects.requireNonNull(eVar);
        this.rawGconceptInstanceContainer_ = eVar;
        this.bitField0_ |= 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegulatedArea(com.google.k.a.a.jn jnVar) {
        Objects.requireNonNull(jnVar);
        this.regulatedArea_ = jnVar;
        this.bitField1_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedBorder(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedBorderIsMutable();
        this.relatedBorder_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedEntrance(int i2, com.google.k.a.a.db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureRelatedEntranceIsMutable();
        this.relatedEntrance_.set(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedFeature(int i2, gb gbVar) {
        Objects.requireNonNull(gbVar);
        ensureRelatedFeatureIsMutable();
        this.relatedFeature_.set(i2, gbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedTerminalPoint(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedTerminalPointIsMutable();
        this.relatedTerminalPoint_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelatedTimezone(int i2, mi miVar) {
        Objects.requireNonNull(miVar);
        ensureRelatedTimezoneIsMutable();
        this.relatedTimezone_.set(i2, miVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestrictionGroup(com.google.k.a.a.js jsVar) {
        Objects.requireNonNull(jsVar);
        this.restrictionGroup_ = jsVar;
        this.bitField0_ |= 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadDisruption(com.google.k.a.a.kq kqVar) {
        Objects.requireNonNull(kqVar);
        this.roadDisruption_ = kqVar;
        this.bitField2_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadMonitor(com.google.k.a.a.ks ksVar) {
        Objects.requireNonNull(ksVar);
        this.roadMonitor_ = ksVar;
        this.bitField1_ |= 67108864;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoute(gt gtVar) {
        Objects.requireNonNull(gtVar);
        this.route_ = gtVar;
        this.bitField0_ |= 16777216;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchoolDistrict(gw gwVar) {
        Objects.requireNonNull(gwVar);
        this.schoolDistrict_ = gwVar;
        this.bitField1_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegment(ik ikVar) {
        Objects.requireNonNull(ikVar);
        this.segment_ = ikVar;
        this.bitField0_ |= GroupFlagsKt.HasAuxSlotFlag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentPath(ip ipVar) {
        Objects.requireNonNull(ipVar);
        this.segmentPath_ = ipVar;
        this.bitField1_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSign(gn gnVar) {
        Objects.requireNonNull(gnVar);
        this.sign_ = gnVar;
        this.bitField1_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignpost(lg lgVar) {
        Objects.requireNonNull(lgVar);
        this.signpost_ = lgVar;
        this.bitField2_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkiBoundary(is isVar) {
        Objects.requireNonNull(isVar);
        this.skiBoundary_ = isVar;
        this.bitField1_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkiLift(iv ivVar) {
        Objects.requireNonNull(ivVar);
        this.skiLift_ = ivVar;
        this.bitField1_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkiTrail(iz izVar) {
        Objects.requireNonNull(izVar);
        this.skiTrail_ = izVar;
        this.bitField1_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSocialReference(jb jbVar) {
        Objects.requireNonNull(jbVar);
        this.socialReference_ = jbVar;
        this.bitField0_ |= 2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(int i2, jd jdVar) {
        Objects.requireNonNull(jdVar);
        ensureSourceInfoIsMutable();
        this.sourceInfo_.set(i2, jdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(bq bqVar) {
        Objects.requireNonNull(bqVar);
        this.status_ = bqVar;
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStorefrontGeometry(int i2, com.google.k.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureStorefrontGeometryIsMutable();
        this.storefrontGeometry_.set(i2, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStorefrontGeometryModel(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        this.storefrontGeometryModel_ = egVar;
        this.bitField2_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntheticGeometry(boolean z) {
        this.bitField0_ |= 1024;
        this.syntheticGeometry_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemporaryData(com.google.w.n.a.b bVar) {
        Objects.requireNonNull(bVar);
        this.temporaryData_ = bVar;
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreeDimModel(js jsVar) {
        Objects.requireNonNull(jsVar);
        this.threeDimModel_ = jsVar;
        this.bitField1_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollCluster(ml mlVar) {
        Objects.requireNonNull(mlVar);
        this.tollCluster_ = mlVar;
        this.bitField1_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPath(mt mtVar) {
        Objects.requireNonNull(mtVar);
        this.tollPath_ = mtVar;
        this.bitField2_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrack(int i2, mv mvVar) {
        Objects.requireNonNull(mvVar);
        ensureTrackIsMutable();
        this.track_.set(i2, mvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransitLine(km kmVar) {
        Objects.requireNonNull(kmVar);
        this.transitLine_ = kmVar;
        this.bitField0_ |= 1073741824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransitLineVariant(nj njVar) {
        Objects.requireNonNull(njVar);
        this.transitLineVariant_ = njVar;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransitStation(kr krVar) {
        Objects.requireNonNull(krVar);
        this.transitStation_ = krVar;
        this.bitField1_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bs bsVar) {
        this.type_ = bsVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalOrdering(oj ojVar) {
        Objects.requireNonNull(ojVar);
        this.verticalOrdering_ = ojVar;
        this.bitField1_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisualizationArea(com.google.k.a.a.eg egVar) {
        Objects.requireNonNull(egVar);
        this.visualizationArea_ = egVar;
        this.bitField2_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaterRemovedPolygon(ex exVar) {
        Objects.requireNonNull(exVar);
        this.waterRemovedPolygon_ = exVar;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebsite(int i2, kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureWebsiteIsMutable();
        this.website_.set(i2, ktVar);
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001h\u0000\u0003\u0001Ĭh\u0000\u001bA\u0001ᔉ\u0000\u0002ᐉ\u0001\u0003ခ\u0003\u0004Л\u0005Л\u0006Л\u0007Л\bЛ\tЛ\nᐉ\b\fЛ\rЛ\u000eЛ\u000f᠌\t\u0010ဇ\n\u0011Л\u0013ᐉ\u000b\u0014က\f\u0018ဉ\r\u0019ᐉ\u000f\u001aဉ\u0010\u001bဉ\u0011\u001c\u001b\u001eဉ\u0018\u001fᐉ\u0019 ᐉ\u001a!ᐉ\u001c\"ᐉ\u001d*ᐉ\u001e+ᐉ!,ᐉ\"-ᐉ$.ဉ%0ဉ&1ဉ'3ᐉ(4ᐉ)5ᐉ*7ᐉ+8ᐉ,;ᐉ\u0002<ᐉ-=ဉ.>ဉ/?ဉ0@ဉ1BЛCဉ\u0012Dᐉ2EЛFဉ\u0014Gဉ\u000eIЛJဉ\u0015Kဉ\u0016Lᐉ\u0017OЛPᐉ\u001bRᐉ4Sᐉ\u0005T\u001bU\u001bVЛWᐉ\u001fXЛY\u001bZဉ\u0004[ဉ6\\ᐉ7]ᐉ8^ᐉ9_Л`ᐉ:aဉ;bဉ3cᐉ<dЛeᐉ=fᐉ>gဉ\u0013hဉ?iᐉ jᐉ#k\u001blᐉ\u0006mᐉ\u0007nဉ@oဉBpဉCqᐉDrᐉEsЛtဉAuᐉGv\u001bwᐉFxᐉIyᐉJzᐉH{\u001b|ဉK}ᐉL~\u001bĬᐉ5", new Object[]{"bitField0_", "bitField1_", "bitField2_", "id_", "bound_", "rank_", "name_", eh.class, "address_", h.class, "point_", es.class, "polyline_", fa.class, "polygon_", ex.class, "child_", bw.class, "center_", "sourceInfo_", jd.class, "relatedFeature_", gb.class, "parent_", bw.class, "type_", c.o, "syntheticGeometry_", "accessPoint_", e.class, "originalId_", "geometryPrecisionMeters_", "rankDetails_", "temporaryData_", "covering_", "interiorCovering_", "htmlText_", cl.class, "route_", "segment_", "intersection_", "dataSource_", "political_", "transitLine_", "building_", "border_", "segmentPath_", "doodle_", "schoolDistrict_", "entrance_", "establishment_", "sign_", "locale_", "threeDimModel_", "elevationModel_", "preferredViewport_", "intersectionGroup_", "elevation_", "skiBoundary_", "skiLift_", "skiTrail_", "attribute_", x.class, "status_", "level_", "website_", kt.class, "rawGconceptInstanceContainer_", "internal_", "attachment_", com.google.k.b.a.a.b.class, "socialReference_", "knowledgeGraphReference_", "bestLocale_", "kgProperty_", com.google.i.p.class, "restrictionGroup_", "parking_", "polygonForDisplay_", "propertyValueStatus_", fh.class, "relatedTimezone_", mi.class, "relatedEntrance_", com.google.k.a.a.db.class, "transitLineVariant_", "relatedTerminalPoint_", bw.class, "track_", mv.class, "pose_", "businessChain_", "displayData_", "futureGeometry_", "futureGeometryFor_", "relatedBorder_", bw.class, "roadMonitor_", "laneMarker_", "verticalOrdering_", "regulatedArea_", "exemptRegulatedArea_", bw.class, "inferredGeometry_", "tollCluster_", "operations_", "anchoredGeometry_", "transitStation_", "logicalBorder_", "storefrontGeometry_", com.google.k.a.a.b.class, "waterRemovedPolygon_", "geopoliticalGeometry_", "geometry3D_", "visualizationArea_", "storefrontGeometryModel_", "disputedArea_", "geopolitical_", "associatedEvChargingStation_", bw.class, "detailed3DModel_", "tollPath_", "experimentalData_", com.google.v.i.class, "roadDisruption_", "evStation_", "median_", "evCharger_", "featureOriginators_", com.google.k.a.a.ci.class, "landUse_", "signpost_", "existenceConfirmations_", com.google.k.a.a.dh.class, "metadata_"});
            case 3:
                return new bt();
            case 4:
                return new br(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<bt> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (bt.class) {
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

    public e getAccessPoint(int i2) {
        return this.accessPoint_.get(i2);
    }

    public int getAccessPointCount() {
        return this.accessPoint_.size();
    }

    public List<e> getAccessPointList() {
        return this.accessPoint_;
    }

    public f getAccessPointOrBuilder(int i2) {
        return this.accessPoint_.get(i2);
    }

    public List<? extends f> getAccessPointOrBuilderList() {
        return this.accessPoint_;
    }

    public h getAddress(int i2) {
        return this.address_.get(i2);
    }

    public int getAddressCount() {
        return this.address_.size();
    }

    public List<h> getAddressList() {
        return this.address_;
    }

    public i getAddressOrBuilder(int i2) {
        return this.address_.get(i2);
    }

    public List<? extends i> getAddressOrBuilderList() {
        return this.address_;
    }

    public com.google.k.a.a.b getAnchoredGeometry() {
        com.google.k.a.a.b bVar = this.anchoredGeometry_;
        return bVar == null ? com.google.k.a.a.b.getDefaultInstance() : bVar;
    }

    public bw getAssociatedEvChargingStation(int i2) {
        return this.associatedEvChargingStation_.get(i2);
    }

    public int getAssociatedEvChargingStationCount() {
        return this.associatedEvChargingStation_.size();
    }

    public List<bw> getAssociatedEvChargingStationList() {
        return this.associatedEvChargingStation_;
    }

    public bx getAssociatedEvChargingStationOrBuilder(int i2) {
        return this.associatedEvChargingStation_.get(i2);
    }

    public List<? extends bx> getAssociatedEvChargingStationOrBuilderList() {
        return this.associatedEvChargingStation_;
    }

    public com.google.k.b.a.a.b getAttachment(int i2) {
        return this.attachment_.get(i2);
    }

    public int getAttachmentCount() {
        return this.attachment_.size();
    }

    public List<com.google.k.b.a.a.b> getAttachmentList() {
        return this.attachment_;
    }

    public com.google.k.b.a.a.c getAttachmentOrBuilder(int i2) {
        return this.attachment_.get(i2);
    }

    public List<? extends com.google.k.b.a.a.c> getAttachmentOrBuilderList() {
        return this.attachment_;
    }

    @Deprecated
    public x getAttribute(int i2) {
        return this.attribute_.get(i2);
    }

    @Deprecated
    public int getAttributeCount() {
        return this.attribute_.size();
    }

    @Deprecated
    public List<x> getAttributeList() {
        return this.attribute_;
    }

    @Deprecated
    public y getAttributeOrBuilder(int i2) {
        return this.attribute_.get(i2);
    }

    @Deprecated
    public List<? extends y> getAttributeOrBuilderList() {
        return this.attribute_;
    }

    public ad getBestLocale() {
        ad adVar = this.bestLocale_;
        return adVar == null ? ad.getDefaultInstance() : adVar;
    }

    public ag getBorder() {
        ag agVar = this.border_;
        return agVar == null ? ag.getDefaultInstance() : agVar;
    }

    public fy getBound() {
        fy fyVar = this.bound_;
        return fyVar == null ? fy.getDefaultInstance() : fyVar;
    }

    public am getBuilding() {
        am amVar = this.building_;
        return amVar == null ? am.getDefaultInstance() : amVar;
    }

    public com.google.k.e.b getBusinessChain() {
        com.google.k.e.b bVar = this.businessChain_;
        return bVar == null ? com.google.k.e.b.getDefaultInstance() : bVar;
    }

    public es getCenter() {
        es esVar = this.center_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public bw getChild(int i2) {
        return this.child_.get(i2);
    }

    public int getChildCount() {
        return this.child_.size();
    }

    public List<bw> getChildList() {
        return this.child_;
    }

    public bx getChildOrBuilder(int i2) {
        return this.child_.get(i2);
    }

    public List<? extends bx> getChildOrBuilderList() {
        return this.child_;
    }

    public ao getCovering() {
        ao aoVar = this.covering_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public aq getDataSource() {
        aq aqVar = this.dataSource_;
        return aqVar == null ? aq.getDefaultInstance() : aqVar;
    }

    public com.google.k.a.a.eg getDetailed3DModel() {
        com.google.k.a.a.eg egVar = this.detailed3DModel_;
        return egVar == null ? com.google.k.a.a.eg.getDefaultInstance() : egVar;
    }

    public com.google.k.a.a.cr getDisplayData() {
        com.google.k.a.a.cr crVar = this.displayData_;
        return crVar == null ? com.google.k.a.a.cr.getDefaultInstance() : crVar;
    }

    public com.google.k.a.a.ct getDisputedArea() {
        com.google.k.a.a.ct ctVar = this.disputedArea_;
        return ctVar == null ? com.google.k.a.a.ct.getDefaultInstance() : ctVar;
    }

    @Deprecated
    public ax getDoodle() {
        ax axVar = this.doodle_;
        return axVar == null ? ax.getDefaultInstance() : axVar;
    }

    public az getElevation() {
        az azVar = this.elevation_;
        return azVar == null ? az.getDefaultInstance() : azVar;
    }

    public bb getElevationModel() {
        bb bbVar = this.elevationModel_;
        return bbVar == null ? bb.getDefaultInstance() : bbVar;
    }

    public bh getEntrance() {
        bh bhVar = this.entrance_;
        return bhVar == null ? bh.getDefaultInstance() : bhVar;
    }

    public bm getEstablishment() {
        bm bmVar = this.establishment_;
        return bmVar == null ? bm.getDefaultInstance() : bmVar;
    }

    public com.google.w.g.i getEvCharger() {
        com.google.w.g.i iVar = this.evCharger_;
        return iVar == null ? com.google.w.g.i.getDefaultInstance() : iVar;
    }

    public com.google.w.g.p getEvStation() {
        com.google.w.g.p pVar = this.evStation_;
        return pVar == null ? com.google.w.g.p.getDefaultInstance() : pVar;
    }

    public bw getExemptRegulatedArea(int i2) {
        return this.exemptRegulatedArea_.get(i2);
    }

    public int getExemptRegulatedAreaCount() {
        return this.exemptRegulatedArea_.size();
    }

    public List<bw> getExemptRegulatedAreaList() {
        return this.exemptRegulatedArea_;
    }

    public bx getExemptRegulatedAreaOrBuilder(int i2) {
        return this.exemptRegulatedArea_.get(i2);
    }

    public List<? extends bx> getExemptRegulatedAreaOrBuilderList() {
        return this.exemptRegulatedArea_;
    }

    public com.google.k.a.a.dh getExistenceConfirmations(int i2) {
        return this.existenceConfirmations_.get(i2);
    }

    public int getExistenceConfirmationsCount() {
        return this.existenceConfirmations_.size();
    }

    public List<com.google.k.a.a.dh> getExistenceConfirmationsList() {
        return this.existenceConfirmations_;
    }

    public com.google.k.a.a.di getExistenceConfirmationsOrBuilder(int i2) {
        return this.existenceConfirmations_.get(i2);
    }

    public List<? extends com.google.k.a.a.di> getExistenceConfirmationsOrBuilderList() {
        return this.existenceConfirmations_;
    }

    public com.google.v.i getExperimentalData(int i2) {
        return this.experimentalData_.get(i2);
    }

    public int getExperimentalDataCount() {
        return this.experimentalData_.size();
    }

    public List<com.google.v.i> getExperimentalDataList() {
        return this.experimentalData_;
    }

    public com.google.v.j getExperimentalDataOrBuilder(int i2) {
        return this.experimentalData_.get(i2);
    }

    public List<? extends com.google.v.j> getExperimentalDataOrBuilderList() {
        return this.experimentalData_;
    }

    public com.google.k.a.a.ci getFeatureOriginators(int i2) {
        return this.featureOriginators_.get(i2);
    }

    public int getFeatureOriginatorsCount() {
        return this.featureOriginators_.size();
    }

    public List<com.google.k.a.a.ci> getFeatureOriginatorsList() {
        return this.featureOriginators_;
    }

    public com.google.k.a.a.cj getFeatureOriginatorsOrBuilder(int i2) {
        return this.featureOriginators_.get(i2);
    }

    public List<? extends com.google.k.a.a.cj> getFeatureOriginatorsOrBuilderList() {
        return this.featureOriginators_;
    }

    public bw getFutureGeometry() {
        bw bwVar = this.futureGeometry_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getFutureGeometryFor() {
        bw bwVar = this.futureGeometryFor_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.eg getGeometry3D() {
        com.google.k.a.a.eg egVar = this.geometry3D_;
        return egVar == null ? com.google.k.a.a.eg.getDefaultInstance() : egVar;
    }

    public double getGeometryPrecisionMeters() {
        return this.geometryPrecisionMeters_;
    }

    public com.google.k.a.a.eo getGeopolitical() {
        com.google.k.a.a.eo eoVar = this.geopolitical_;
        return eoVar == null ? com.google.k.a.a.eo.getDefaultInstance() : eoVar;
    }

    public com.google.k.a.a.eq getGeopoliticalGeometry() {
        com.google.k.a.a.eq eqVar = this.geopoliticalGeometry_;
        return eqVar == null ? com.google.k.a.a.eq.getDefaultInstance() : eqVar;
    }

    @Deprecated
    public cl getHtmlText(int i2) {
        return this.htmlText_.get(i2);
    }

    @Deprecated
    public int getHtmlTextCount() {
        return this.htmlText_.size();
    }

    @Deprecated
    public List<cl> getHtmlTextList() {
        return this.htmlText_;
    }

    @Deprecated
    public cm getHtmlTextOrBuilder(int i2) {
        return this.htmlText_.get(i2);
    }

    @Deprecated
    public List<? extends cm> getHtmlTextOrBuilderList() {
        return this.htmlText_;
    }

    public bw getId() {
        bw bwVar = this.id_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public com.google.k.a.a.es getInferredGeometry() {
        com.google.k.a.a.es esVar = this.inferredGeometry_;
        return esVar == null ? com.google.k.a.a.es.getDefaultInstance() : esVar;
    }

    public ao getInteriorCovering() {
        ao aoVar = this.interiorCovering_;
        return aoVar == null ? ao.getDefaultInstance() : aoVar;
    }

    public com.google.k.a.a.a.a.b getInternal() {
        com.google.k.a.a.a.a.b bVar = this.internal_;
        return bVar == null ? com.google.k.a.a.a.a.b.getDefaultInstance() : bVar;
    }

    public cs getIntersection() {
        cs csVar = this.intersection_;
        return csVar == null ? cs.getDefaultInstance() : csVar;
    }

    public cv getIntersectionGroup() {
        cv cvVar = this.intersectionGroup_;
        return cvVar == null ? cv.getDefaultInstance() : cvVar;
    }

    public com.google.i.p getKgProperty(int i2) {
        return this.kgProperty_.get(i2);
    }

    public int getKgPropertyCount() {
        return this.kgProperty_.size();
    }

    public List<com.google.i.p> getKgPropertyList() {
        return this.kgProperty_;
    }

    public com.google.i.q getKgPropertyOrBuilder(int i2) {
        return this.kgProperty_.get(i2);
    }

    public List<? extends com.google.i.q> getKgPropertyOrBuilderList() {
        return this.kgProperty_;
    }

    public cx getKnowledgeGraphReference() {
        cx cxVar = this.knowledgeGraphReference_;
        return cxVar == null ? cx.getDefaultInstance() : cxVar;
    }

    public com.google.w.g.s getLandUse() {
        com.google.w.g.s sVar = this.landUse_;
        return sVar == null ? com.google.w.g.s.getDefaultInstance() : sVar;
    }

    public com.google.k.a.a.fg getLaneMarker() {
        com.google.k.a.a.fg fgVar = this.laneMarker_;
        return fgVar == null ? com.google.k.a.a.fg.getDefaultInstance() : fgVar;
    }

    public dy getLevel() {
        dy dyVar = this.level_;
        return dyVar == null ? dy.getDefaultInstance() : dyVar;
    }

    public ea getLocale() {
        ea eaVar = this.locale_;
        return eaVar == null ? ea.getDefaultInstance() : eaVar;
    }

    public com.google.k.a.a.fv getLogicalBorder() {
        com.google.k.a.a.fv fvVar = this.logicalBorder_;
        return fvVar == null ? com.google.k.a.a.fv.getDefaultInstance() : fvVar;
    }

    public com.google.k.a.a.gc getMedian() {
        com.google.k.a.a.gc gcVar = this.median_;
        return gcVar == null ? com.google.k.a.a.gc.getDefaultInstance() : gcVar;
    }

    public com.google.k.a.a.dy getMetadata() {
        com.google.k.a.a.dy dyVar = this.metadata_;
        return dyVar == null ? com.google.k.a.a.dy.getDefaultInstance() : dyVar;
    }

    public eh getName(int i2) {
        return this.name_.get(i2);
    }

    public int getNameCount() {
        return this.name_.size();
    }

    public List<eh> getNameList() {
        return this.name_;
    }

    public ei getNameOrBuilder(int i2) {
        return this.name_.get(i2);
    }

    public List<? extends ei> getNameOrBuilderList() {
        return this.name_;
    }

    public com.google.k.a.a.gg getOperations() {
        com.google.k.a.a.gg ggVar = this.operations_;
        return ggVar == null ? com.google.k.a.a.gg.getDefaultInstance() : ggVar;
    }

    public bw getOriginalId() {
        bw bwVar = this.originalId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public bw getParent(int i2) {
        return this.parent_.get(i2);
    }

    public int getParentCount() {
        return this.parent_.size();
    }

    public List<bw> getParentList() {
        return this.parent_;
    }

    public bx getParentOrBuilder(int i2) {
        return this.parent_.get(i2);
    }

    public List<? extends bx> getParentOrBuilderList() {
        return this.parent_;
    }

    public com.google.k.a.a.gp getParking() {
        com.google.k.a.a.gp gpVar = this.parking_;
        return gpVar == null ? com.google.k.a.a.gp.getDefaultInstance() : gpVar;
    }

    public es getPoint(int i2) {
        return this.point_.get(i2);
    }

    public int getPointCount() {
        return this.point_.size();
    }

    public List<es> getPointList() {
        return this.point_;
    }

    public et getPointOrBuilder(int i2) {
        return this.point_.get(i2);
    }

    public List<? extends et> getPointOrBuilderList() {
        return this.point_;
    }

    public ev getPolitical() {
        ev evVar = this.political_;
        return evVar == null ? ev.getDefaultInstance() : evVar;
    }

    public ex getPolygon(int i2) {
        return this.polygon_.get(i2);
    }

    public int getPolygonCount() {
        return this.polygon_.size();
    }

    public ex getPolygonForDisplay() {
        ex exVar = this.polygonForDisplay_;
        return exVar == null ? ex.getDefaultInstance() : exVar;
    }

    public List<ex> getPolygonList() {
        return this.polygon_;
    }

    public ey getPolygonOrBuilder(int i2) {
        return this.polygon_.get(i2);
    }

    public List<? extends ey> getPolygonOrBuilderList() {
        return this.polygon_;
    }

    public fa getPolyline(int i2) {
        return this.polyline_.get(i2);
    }

    public int getPolylineCount() {
        return this.polyline_.size();
    }

    public List<fa> getPolylineList() {
        return this.polyline_;
    }

    public fb getPolylineOrBuilder(int i2) {
        return this.polyline_.get(i2);
    }

    public List<? extends fb> getPolylineOrBuilderList() {
        return this.polyline_;
    }

    public com.google.k.a.a.gx getPose() {
        com.google.k.a.a.gx gxVar = this.pose_;
        return gxVar == null ? com.google.k.a.a.gx.getDefaultInstance() : gxVar;
    }

    public fy getPreferredViewport() {
        fy fyVar = this.preferredViewport_;
        return fyVar == null ? fy.getDefaultInstance() : fyVar;
    }

    public fh getPropertyValueStatus(int i2) {
        return this.propertyValueStatus_.get(i2);
    }

    public int getPropertyValueStatusCount() {
        return this.propertyValueStatus_.size();
    }

    public List<fh> getPropertyValueStatusList() {
        return this.propertyValueStatus_;
    }

    public fi getPropertyValueStatusOrBuilder(int i2) {
        return this.propertyValueStatus_.get(i2);
    }

    public List<? extends fi> getPropertyValueStatusOrBuilderList() {
        return this.propertyValueStatus_;
    }

    public float getRank() {
        return this.rank_;
    }

    public fl getRankDetails() {
        fl flVar = this.rankDetails_;
        return flVar == null ? fl.getDefaultInstance() : flVar;
    }

    public com.google.k.d.a.a.e getRawGconceptInstanceContainer() {
        com.google.k.d.a.a.e eVar = this.rawGconceptInstanceContainer_;
        return eVar == null ? com.google.k.d.a.a.e.getDefaultInstance() : eVar;
    }

    public com.google.k.a.a.jn getRegulatedArea() {
        com.google.k.a.a.jn jnVar = this.regulatedArea_;
        return jnVar == null ? com.google.k.a.a.jn.getDefaultInstance() : jnVar;
    }

    public bw getRelatedBorder(int i2) {
        return this.relatedBorder_.get(i2);
    }

    public int getRelatedBorderCount() {
        return this.relatedBorder_.size();
    }

    public List<bw> getRelatedBorderList() {
        return this.relatedBorder_;
    }

    public bx getRelatedBorderOrBuilder(int i2) {
        return this.relatedBorder_.get(i2);
    }

    public List<? extends bx> getRelatedBorderOrBuilderList() {
        return this.relatedBorder_;
    }

    public com.google.k.a.a.db getRelatedEntrance(int i2) {
        return this.relatedEntrance_.get(i2);
    }

    public int getRelatedEntranceCount() {
        return this.relatedEntrance_.size();
    }

    public List<com.google.k.a.a.db> getRelatedEntranceList() {
        return this.relatedEntrance_;
    }

    public com.google.k.a.a.dc getRelatedEntranceOrBuilder(int i2) {
        return this.relatedEntrance_.get(i2);
    }

    public List<? extends com.google.k.a.a.dc> getRelatedEntranceOrBuilderList() {
        return this.relatedEntrance_;
    }

    public gb getRelatedFeature(int i2) {
        return this.relatedFeature_.get(i2);
    }

    public int getRelatedFeatureCount() {
        return this.relatedFeature_.size();
    }

    public List<gb> getRelatedFeatureList() {
        return this.relatedFeature_;
    }

    public gc getRelatedFeatureOrBuilder(int i2) {
        return this.relatedFeature_.get(i2);
    }

    public List<? extends gc> getRelatedFeatureOrBuilderList() {
        return this.relatedFeature_;
    }

    public bw getRelatedTerminalPoint(int i2) {
        return this.relatedTerminalPoint_.get(i2);
    }

    public int getRelatedTerminalPointCount() {
        return this.relatedTerminalPoint_.size();
    }

    public List<bw> getRelatedTerminalPointList() {
        return this.relatedTerminalPoint_;
    }

    public bx getRelatedTerminalPointOrBuilder(int i2) {
        return this.relatedTerminalPoint_.get(i2);
    }

    public List<? extends bx> getRelatedTerminalPointOrBuilderList() {
        return this.relatedTerminalPoint_;
    }

    public mi getRelatedTimezone(int i2) {
        return this.relatedTimezone_.get(i2);
    }

    public int getRelatedTimezoneCount() {
        return this.relatedTimezone_.size();
    }

    public List<mi> getRelatedTimezoneList() {
        return this.relatedTimezone_;
    }

    public mj getRelatedTimezoneOrBuilder(int i2) {
        return this.relatedTimezone_.get(i2);
    }

    public List<? extends mj> getRelatedTimezoneOrBuilderList() {
        return this.relatedTimezone_;
    }

    public com.google.k.a.a.js getRestrictionGroup() {
        com.google.k.a.a.js jsVar = this.restrictionGroup_;
        return jsVar == null ? com.google.k.a.a.js.getDefaultInstance() : jsVar;
    }

    public com.google.k.a.a.kq getRoadDisruption() {
        com.google.k.a.a.kq kqVar = this.roadDisruption_;
        return kqVar == null ? com.google.k.a.a.kq.getDefaultInstance() : kqVar;
    }

    public com.google.k.a.a.ks getRoadMonitor() {
        com.google.k.a.a.ks ksVar = this.roadMonitor_;
        return ksVar == null ? com.google.k.a.a.ks.getDefaultInstance() : ksVar;
    }

    public gt getRoute() {
        gt gtVar = this.route_;
        return gtVar == null ? gt.getDefaultInstance() : gtVar;
    }

    public gw getSchoolDistrict() {
        gw gwVar = this.schoolDistrict_;
        return gwVar == null ? gw.getDefaultInstance() : gwVar;
    }

    public ik getSegment() {
        ik ikVar = this.segment_;
        return ikVar == null ? ik.getDefaultInstance() : ikVar;
    }

    public ip getSegmentPath() {
        ip ipVar = this.segmentPath_;
        return ipVar == null ? ip.getDefaultInstance() : ipVar;
    }

    public gn getSign() {
        gn gnVar = this.sign_;
        return gnVar == null ? gn.getDefaultInstance() : gnVar;
    }

    public lg getSignpost() {
        lg lgVar = this.signpost_;
        return lgVar == null ? lg.getDefaultInstance() : lgVar;
    }

    public is getSkiBoundary() {
        is isVar = this.skiBoundary_;
        return isVar == null ? is.getDefaultInstance() : isVar;
    }

    public iv getSkiLift() {
        iv ivVar = this.skiLift_;
        return ivVar == null ? iv.getDefaultInstance() : ivVar;
    }

    public iz getSkiTrail() {
        iz izVar = this.skiTrail_;
        return izVar == null ? iz.getDefaultInstance() : izVar;
    }

    public jb getSocialReference() {
        jb jbVar = this.socialReference_;
        return jbVar == null ? jb.getDefaultInstance() : jbVar;
    }

    public jd getSourceInfo(int i2) {
        return this.sourceInfo_.get(i2);
    }

    public int getSourceInfoCount() {
        return this.sourceInfo_.size();
    }

    public List<jd> getSourceInfoList() {
        return this.sourceInfo_;
    }

    public je getSourceInfoOrBuilder(int i2) {
        return this.sourceInfo_.get(i2);
    }

    public List<? extends je> getSourceInfoOrBuilderList() {
        return this.sourceInfo_;
    }

    public bq getStatus() {
        bq bqVar = this.status_;
        return bqVar == null ? bq.getDefaultInstance() : bqVar;
    }

    public com.google.k.a.a.b getStorefrontGeometry(int i2) {
        return this.storefrontGeometry_.get(i2);
    }

    public int getStorefrontGeometryCount() {
        return this.storefrontGeometry_.size();
    }

    public List<com.google.k.a.a.b> getStorefrontGeometryList() {
        return this.storefrontGeometry_;
    }

    public com.google.k.a.a.eg getStorefrontGeometryModel() {
        com.google.k.a.a.eg egVar = this.storefrontGeometryModel_;
        return egVar == null ? com.google.k.a.a.eg.getDefaultInstance() : egVar;
    }

    public com.google.k.a.a.c getStorefrontGeometryOrBuilder(int i2) {
        return this.storefrontGeometry_.get(i2);
    }

    public List<? extends com.google.k.a.a.c> getStorefrontGeometryOrBuilderList() {
        return this.storefrontGeometry_;
    }

    public boolean getSyntheticGeometry() {
        return this.syntheticGeometry_;
    }

    public com.google.w.n.a.b getTemporaryData() {
        com.google.w.n.a.b bVar = this.temporaryData_;
        return bVar == null ? com.google.w.n.a.b.getDefaultInstance() : bVar;
    }

    public js getThreeDimModel() {
        js jsVar = this.threeDimModel_;
        return jsVar == null ? js.getDefaultInstance() : jsVar;
    }

    public ml getTollCluster() {
        ml mlVar = this.tollCluster_;
        return mlVar == null ? ml.getDefaultInstance() : mlVar;
    }

    public mt getTollPath() {
        mt mtVar = this.tollPath_;
        return mtVar == null ? mt.getDefaultInstance() : mtVar;
    }

    public mv getTrack(int i2) {
        return this.track_.get(i2);
    }

    public int getTrackCount() {
        return this.track_.size();
    }

    public List<mv> getTrackList() {
        return this.track_;
    }

    public mw getTrackOrBuilder(int i2) {
        return this.track_.get(i2);
    }

    public List<? extends mw> getTrackOrBuilderList() {
        return this.track_;
    }

    public km getTransitLine() {
        km kmVar = this.transitLine_;
        return kmVar == null ? km.getDefaultInstance() : kmVar;
    }

    public nj getTransitLineVariant() {
        nj njVar = this.transitLineVariant_;
        return njVar == null ? nj.getDefaultInstance() : njVar;
    }

    public kr getTransitStation() {
        kr krVar = this.transitStation_;
        return krVar == null ? kr.getDefaultInstance() : krVar;
    }

    public bs getType() {
        bs bsVarA = bs.a(this.type_);
        return bsVarA == null ? bs.TYPE_ANY : bsVarA;
    }

    public oj getVerticalOrdering() {
        oj ojVar = this.verticalOrdering_;
        return ojVar == null ? oj.getDefaultInstance() : ojVar;
    }

    public com.google.k.a.a.eg getVisualizationArea() {
        com.google.k.a.a.eg egVar = this.visualizationArea_;
        return egVar == null ? com.google.k.a.a.eg.getDefaultInstance() : egVar;
    }

    public ex getWaterRemovedPolygon() {
        ex exVar = this.waterRemovedPolygon_;
        return exVar == null ? ex.getDefaultInstance() : exVar;
    }

    public kt getWebsite(int i2) {
        return this.website_.get(i2);
    }

    public int getWebsiteCount() {
        return this.website_.size();
    }

    public List<kt> getWebsiteList() {
        return this.website_;
    }

    public ku getWebsiteOrBuilder(int i2) {
        return this.website_.get(i2);
    }

    public List<? extends ku> getWebsiteOrBuilderList() {
        return this.website_;
    }

    public boolean hasAnchoredGeometry() {
        return (this.bitField1_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasBestLocale() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasBorder() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasBound() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBuilding() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasBusinessChain() {
        return (this.bitField1_ & 4194304) != 0;
    }

    public boolean hasCenter() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasCovering() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasDataSource() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasDetailed3DModel() {
        return (this.bitField2_ & 2) != 0;
    }

    public boolean hasDisplayData() {
        return (this.bitField1_ & 8388608) != 0;
    }

    public boolean hasDisputedArea() {
        return (this.bitField2_ & 16) != 0;
    }

    @Deprecated
    public boolean hasDoodle() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasElevation() {
        return (this.bitField1_ & 16384) != 0;
    }

    public boolean hasElevationModel() {
        return (this.bitField1_ & 4096) != 0;
    }

    public boolean hasEntrance() {
        return (this.bitField1_ & 128) != 0;
    }

    public boolean hasEstablishment() {
        return (this.bitField1_ & 256) != 0;
    }

    public boolean hasEvCharger() {
        return (this.bitField2_ & 256) != 0;
    }

    public boolean hasEvStation() {
        return (this.bitField2_ & 512) != 0;
    }

    public boolean hasFutureGeometry() {
        return (this.bitField1_ & 16777216) != 0;
    }

    public boolean hasFutureGeometryFor() {
        return (this.bitField1_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasGeometry3D() {
        return (this.bitField2_ & 1) != 0;
    }

    public boolean hasGeometryPrecisionMeters() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasGeopolitical() {
        return (this.bitField2_ & 32) != 0;
    }

    public boolean hasGeopoliticalGeometry() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInferredGeometry() {
        return (this.bitField1_ & 536870912) != 0;
    }

    public boolean hasInteriorCovering() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasInternal() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasIntersection() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasIntersectionGroup() {
        return (this.bitField1_ & 8192) != 0;
    }

    public boolean hasKnowledgeGraphReference() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasLandUse() {
        return (this.bitField2_ & 2048) != 0;
    }

    public boolean hasLaneMarker() {
        return (this.bitField1_ & 134217728) != 0;
    }

    public boolean hasLevel() {
        return (this.bitField1_ & 262144) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField1_ & 1024) != 0;
    }

    public boolean hasLogicalBorder() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasMedian() {
        return (this.bitField2_ & 1024) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField1_ & 2097152) != 0;
    }

    public boolean hasOperations() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasOriginalId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasParking() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public boolean hasPolitical() {
        return (this.bitField0_ & 536870912) != 0;
    }

    public boolean hasPolygonForDisplay() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPose() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPreferredViewport() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRank() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRankDetails() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasRawGconceptInstanceContainer() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasRegulatedArea() {
        return (this.bitField1_ & 268435456) != 0;
    }

    public boolean hasRestrictionGroup() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasRoadDisruption() {
        return (this.bitField2_ & 64) != 0;
    }

    public boolean hasRoadMonitor() {
        return (this.bitField1_ & 67108864) != 0;
    }

    public boolean hasRoute() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasSchoolDistrict() {
        return (this.bitField1_ & 64) != 0;
    }

    public boolean hasSegment() {
        return (this.bitField0_ & GroupFlagsKt.HasAuxSlotFlag) != 0;
    }

    public boolean hasSegmentPath() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasSign() {
        return (this.bitField1_ & 512) != 0;
    }

    public boolean hasSignpost() {
        return (this.bitField2_ & 4096) != 0;
    }

    public boolean hasSkiBoundary() {
        return (this.bitField1_ & 32768) != 0;
    }

    public boolean hasSkiLift() {
        return (this.bitField1_ & 65536) != 0;
    }

    public boolean hasSkiTrail() {
        return (this.bitField1_ & 131072) != 0;
    }

    public boolean hasSocialReference() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasStorefrontGeometryModel() {
        return (this.bitField2_ & 8) != 0;
    }

    public boolean hasSyntheticGeometry() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTemporaryData() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasThreeDimModel() {
        return (this.bitField1_ & 2048) != 0;
    }

    public boolean hasTollCluster() {
        return (this.bitField1_ & 1073741824) != 0;
    }

    public boolean hasTollPath() {
        return (this.bitField2_ & 128) != 0;
    }

    public boolean hasTransitLine() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasTransitLineVariant() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasTransitStation() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasVerticalOrdering() {
        return (this.bitField1_ & 524288) != 0;
    }

    public boolean hasVisualizationArea() {
        return (this.bitField2_ & 4) != 0;
    }

    public boolean hasWaterRemovedPolygon() {
        return (this.bitField0_ & 64) != 0;
    }

    public static br newBuilder(bt btVar) {
        return (br) DEFAULT_INSTANCE.createBuilder(btVar);
    }

    public static bt parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bt parseFrom(com.google.v.z zVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bt parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAccessPoint(e eVar) {
        Objects.requireNonNull(eVar);
        ensureAccessPointIsMutable();
        this.accessPoint_.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddress(h hVar) {
        Objects.requireNonNull(hVar);
        ensureAddressIsMutable();
        this.address_.add(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssociatedEvChargingStation(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureAssociatedEvChargingStationIsMutable();
        this.associatedEvChargingStation_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttachment(com.google.k.b.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureAttachmentIsMutable();
        this.attachment_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttribute(x xVar) {
        Objects.requireNonNull(xVar);
        ensureAttributeIsMutable();
        this.attribute_.add(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addChild(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureChildIsMutable();
        this.child_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExemptRegulatedArea(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureExemptRegulatedAreaIsMutable();
        this.exemptRegulatedArea_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExistenceConfirmations(com.google.k.a.a.dh dhVar) {
        Objects.requireNonNull(dhVar);
        ensureExistenceConfirmationsIsMutable();
        this.existenceConfirmations_.add(dhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExperimentalData(com.google.v.i iVar) {
        Objects.requireNonNull(iVar);
        ensureExperimentalDataIsMutable();
        this.experimentalData_.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatureOriginators(com.google.k.a.a.ci ciVar) {
        Objects.requireNonNull(ciVar);
        ensureFeatureOriginatorsIsMutable();
        this.featureOriginators_.add(ciVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHtmlText(cl clVar) {
        Objects.requireNonNull(clVar);
        ensureHtmlTextIsMutable();
        this.htmlText_.add(clVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addKgProperty(com.google.i.p pVar) {
        Objects.requireNonNull(pVar);
        ensureKgPropertyIsMutable();
        this.kgProperty_.add(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(eh ehVar) {
        Objects.requireNonNull(ehVar);
        ensureNameIsMutable();
        this.name_.add(ehVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addParent(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureParentIsMutable();
        this.parent_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPoint(es esVar) {
        Objects.requireNonNull(esVar);
        ensurePointIsMutable();
        this.point_.add(esVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolygon(ex exVar) {
        Objects.requireNonNull(exVar);
        ensurePolygonIsMutable();
        this.polygon_.add(exVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPolyline(fa faVar) {
        Objects.requireNonNull(faVar);
        ensurePolylineIsMutable();
        this.polyline_.add(faVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPropertyValueStatus(fh fhVar) {
        Objects.requireNonNull(fhVar);
        ensurePropertyValueStatusIsMutable();
        this.propertyValueStatus_.add(fhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedBorder(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedBorderIsMutable();
        this.relatedBorder_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedEntrance(com.google.k.a.a.db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureRelatedEntranceIsMutable();
        this.relatedEntrance_.add(dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedFeature(gb gbVar) {
        Objects.requireNonNull(gbVar);
        ensureRelatedFeatureIsMutable();
        this.relatedFeature_.add(gbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedTerminalPoint(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureRelatedTerminalPointIsMutable();
        this.relatedTerminalPoint_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRelatedTimezone(mi miVar) {
        Objects.requireNonNull(miVar);
        ensureRelatedTimezoneIsMutable();
        this.relatedTimezone_.add(miVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSourceInfo(jd jdVar) {
        Objects.requireNonNull(jdVar);
        ensureSourceInfoIsMutable();
        this.sourceInfo_.add(jdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStorefrontGeometry(com.google.k.a.a.b bVar) {
        Objects.requireNonNull(bVar);
        ensureStorefrontGeometryIsMutable();
        this.storefrontGeometry_.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrack(mv mvVar) {
        Objects.requireNonNull(mvVar);
        ensureTrackIsMutable();
        this.track_.add(mvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWebsite(kt ktVar) {
        Objects.requireNonNull(ktVar);
        ensureWebsiteIsMutable();
        this.website_.add(ktVar);
    }

    public static bt parseFrom(InputStream inputStream) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bt parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bt parseFrom(ByteBuffer byteBuffer) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bt parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bt parseFrom(byte[] bArr) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bt parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bt) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
