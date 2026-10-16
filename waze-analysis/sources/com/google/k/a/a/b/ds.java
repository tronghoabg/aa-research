package com.google.k.a.a.b;

import com.google.k.a.a.nd;
import com.google.k.a.a.ne;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ds extends com.google.v.du<ds, df> implements dt {
    public static final int BOUNDING_MARKER_FIELD_NUMBER = 14;
    public static final int CONJOINED_CATEGORY_FIELD_NUMBER = 15;
    private static final ds DEFAULT_INSTANCE;
    public static final int DISTANCE_TO_NEXT_LANE_FIELD_NUMBER = 6;
    public static final int FLOW_FIELD_NUMBER = 12;
    public static final int LANE_CONNECTION_FIELD_NUMBER = 8;
    public static final int LANE_DIVIDER_CROSSING_FIELD_NUMBER = 4;
    public static final int LANE_FOLLOWS_SEGMENT_BEGIN_FRACTION_FIELD_NUMBER = 9;
    public static final int LANE_FOLLOWS_SEGMENT_END_FRACTION_FIELD_NUMBER = 10;
    public static final int LANE_ID_FIELD_NUMBER = 17;
    public static final int LANE_NUMBER_FIELD_NUMBER = 1;
    public static final int LANE_TOKEN_FIELD_NUMBER = 16;
    public static final int METADATA_FIELD_NUMBER = 500;
    public static final int OUTER_LANE_DIVIDER_CROSSING_FIELD_NUMBER = 23;
    private static volatile com.google.v.fo<ds> PARSER = null;
    public static final int RESTRICTION_FIELD_NUMBER = 7;
    public static final int SHARED_FIELD_NUMBER = 2;
    public static final int SOMETIMES_DRIVABLE_SHOULDER_FIELD_NUMBER = 22;
    public static final int STOP_LINE_FIELD_NUMBER = 13;
    public static final int SURFACE_FIELD_NUMBER = 11;
    public static final int TOLL_PAYMENTS_FIELD_NUMBER = 18;
    public static final int TRAFFIC_FLOW_ADJUSTMENTS_FIELD_NUMBER = 20;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int WIDTH_FIELD_NUMBER = 5;
    private int bitField0_;
    private int conjoinedCategory_;
    private float distanceToNextLane_;
    private de flow_;
    private float laneFollowsSegmentBeginFraction_;
    private float laneFollowsSegmentEndFraction_;
    private long laneId_;
    private int laneNumber_;
    private ce metadata_;
    private boolean shared_;
    private boolean sometimesDrivableShoulder_;
    private int surface_;
    private float width_;
    private byte memoizedIsInitialized = 2;
    private int type_ = 1;
    private int laneDividerCrossing_ = 1;
    private int outerLaneDividerCrossing_ = 1;
    private com.google.v.eo<gk> restriction_ = emptyProtobufList();
    private com.google.v.eo<di> laneConnection_ = emptyProtobufList();
    private com.google.v.eo<bw> stopLine_ = emptyProtobufList();
    private com.google.v.eo<db> boundingMarker_ = emptyProtobufList();
    private com.google.v.eo<Cdo> tollPayments_ = emptyProtobufList();
    private com.google.v.eo<nd> trafficFlowAdjustments_ = emptyProtobufList();
    private String laneToken_ = "";

    static {
        ds dsVar = new ds();
        DEFAULT_INSTANCE = dsVar;
        com.google.v.du.registerDefaultInstance(ds.class, dsVar);
    }

    private ds() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBoundingMarker(Iterable<? extends db> iterable) {
        ensureBoundingMarkerIsMutable();
        com.google.v.c.addAll(iterable, this.boundingMarker_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLaneConnection(Iterable<? extends di> iterable) {
        ensureLaneConnectionIsMutable();
        com.google.v.c.addAll(iterable, this.laneConnection_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRestriction(Iterable<? extends gk> iterable) {
        ensureRestrictionIsMutable();
        com.google.v.c.addAll(iterable, this.restriction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStopLine(Iterable<? extends bw> iterable) {
        ensureStopLineIsMutable();
        com.google.v.c.addAll(iterable, this.stopLine_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTollPayments(Iterable<? extends Cdo> iterable) {
        ensureTollPaymentsIsMutable();
        com.google.v.c.addAll(iterable, this.tollPayments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTrafficFlowAdjustments(Iterable<? extends nd> iterable) {
        ensureTrafficFlowAdjustmentsIsMutable();
        com.google.v.c.addAll(iterable, this.trafficFlowAdjustments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoundingMarker(int i2, db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.add(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLaneConnection(int i2, di diVar) {
        Objects.requireNonNull(diVar);
        ensureLaneConnectionIsMutable();
        this.laneConnection_.add(i2, diVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(int i2, gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStopLine(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStopLineIsMutable();
        this.stopLine_.add(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTollPayments(int i2, Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureTollPaymentsIsMutable();
        this.tollPayments_.add(i2, cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficFlowAdjustments(int i2, nd ndVar) {
        Objects.requireNonNull(ndVar);
        ensureTrafficFlowAdjustmentsIsMutable();
        this.trafficFlowAdjustments_.add(i2, ndVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarker() {
        this.boundingMarker_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConjoinedCategory() {
        this.bitField0_ &= -16385;
        this.conjoinedCategory_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceToNextLane() {
        this.bitField0_ &= -257;
        this.distanceToNextLane_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlow() {
        this.flow_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneConnection() {
        this.laneConnection_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneDividerCrossing() {
        this.bitField0_ &= -33;
        this.laneDividerCrossing_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneFollowsSegmentBeginFraction() {
        this.bitField0_ &= -513;
        this.laneFollowsSegmentBeginFraction_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneFollowsSegmentEndFraction() {
        this.bitField0_ &= -1025;
        this.laneFollowsSegmentEndFraction_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneId() {
        this.bitField0_ &= -3;
        this.laneId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneNumber() {
        this.bitField0_ &= -2;
        this.laneNumber_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaneToken() {
        this.bitField0_ &= -32769;
        this.laneToken_ = getDefaultInstance().getLaneToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOuterLaneDividerCrossing() {
        this.bitField0_ &= -65;
        this.outerLaneDividerCrossing_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestriction() {
        this.restriction_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShared() {
        this.bitField0_ &= -5;
        this.shared_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSometimesDrivableShoulder() {
        this.bitField0_ &= -17;
        this.sometimesDrivableShoulder_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStopLine() {
        this.stopLine_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurface() {
        this.bitField0_ &= -2049;
        this.surface_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPayments() {
        this.tollPayments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficFlowAdjustments() {
        this.trafficFlowAdjustments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.bitField0_ &= -129;
        this.width_ = 0.0f;
    }

    private void ensureBoundingMarkerIsMutable() {
        com.google.v.eo<db> eoVar = this.boundingMarker_;
        if (eoVar.c()) {
            return;
        }
        this.boundingMarker_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureLaneConnectionIsMutable() {
        com.google.v.eo<di> eoVar = this.laneConnection_;
        if (eoVar.c()) {
            return;
        }
        this.laneConnection_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureRestrictionIsMutable() {
        com.google.v.eo<gk> eoVar = this.restriction_;
        if (eoVar.c()) {
            return;
        }
        this.restriction_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureStopLineIsMutable() {
        com.google.v.eo<bw> eoVar = this.stopLine_;
        if (eoVar.c()) {
            return;
        }
        this.stopLine_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTollPaymentsIsMutable() {
        com.google.v.eo<Cdo> eoVar = this.tollPayments_;
        if (eoVar.c()) {
            return;
        }
        this.tollPayments_ = com.google.v.du.mutableCopy(eoVar);
    }

    private void ensureTrafficFlowAdjustmentsIsMutable() {
        com.google.v.eo<nd> eoVar = this.trafficFlowAdjustments_;
        if (eoVar.c()) {
            return;
        }
        this.trafficFlowAdjustments_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static ds getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFlow(de deVar) {
        Objects.requireNonNull(deVar);
        de deVar2 = this.flow_;
        if (deVar2 != null && deVar2 != de.getDefaultInstance()) {
            dd ddVarNewBuilder = de.newBuilder(deVar2);
            ddVarNewBuilder.mergeFrom((dd) deVar);
            deVar = ddVarNewBuilder.buildPartial();
        }
        this.flow_ = deVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 4096;
    }

    public static df newBuilder() {
        return (df) DEFAULT_INSTANCE.createBuilder();
    }

    public static ds parseDelimitedFrom(InputStream inputStream) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(com.google.v.v vVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ds> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBoundingMarker(int i2) {
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLaneConnection(int i2) {
        ensureLaneConnectionIsMutable();
        this.laneConnection_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRestriction(int i2) {
        ensureRestrictionIsMutable();
        this.restriction_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStopLine(int i2) {
        ensureStopLineIsMutable();
        this.stopLine_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTollPayments(int i2) {
        ensureTollPaymentsIsMutable();
        this.tollPayments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTrafficFlowAdjustments(int i2) {
        ensureTrafficFlowAdjustmentsIsMutable();
        this.trafficFlowAdjustments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarker(int i2, db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.set(i2, dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConjoinedCategory(dg dgVar) {
        this.conjoinedCategory_ = dgVar.getNumber();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceToNextLane(float f2) {
        this.bitField0_ |= 256;
        this.distanceToNextLane_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlow(de deVar) {
        Objects.requireNonNull(deVar);
        this.flow_ = deVar;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneConnection(int i2, di diVar) {
        Objects.requireNonNull(diVar);
        ensureLaneConnectionIsMutable();
        this.laneConnection_.set(i2, diVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneDividerCrossing(dk dkVar) {
        this.laneDividerCrossing_ = dkVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneFollowsSegmentBeginFraction(float f2) {
        this.bitField0_ |= 512;
        this.laneFollowsSegmentBeginFraction_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneFollowsSegmentEndFraction(float f2) {
        this.bitField0_ |= 1024;
        this.laneFollowsSegmentEndFraction_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneId(long j2) {
        this.bitField0_ |= 2;
        this.laneId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneNumber(int i2) {
        this.bitField0_ |= 1;
        this.laneNumber_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32768;
        this.laneToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaneTokenBytes(com.google.v.v vVar) {
        this.laneToken_ = vVar.u();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOuterLaneDividerCrossing(dk dkVar) {
        this.outerLaneDividerCrossing_ = dkVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestriction(int i2, gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.set(i2, gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShared(boolean z) {
        this.bitField0_ |= 4;
        this.shared_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSometimesDrivableShoulder(boolean z) {
        this.bitField0_ |= 16;
        this.sometimesDrivableShoulder_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStopLine(int i2, bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStopLineIsMutable();
        this.stopLine_.set(i2, bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSurface(dl dlVar) {
        this.surface_ = dlVar.getNumber();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPayments(int i2, Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureTollPaymentsIsMutable();
        this.tollPayments_.set(i2, cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficFlowAdjustments(int i2, nd ndVar) {
        Objects.requireNonNull(ndVar);
        ensureTrafficFlowAdjustmentsIsMutable();
        this.trafficFlowAdjustments_.set(i2, ndVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(dr drVar) {
        this.type_ = drVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(float f2) {
        this.bitField0_ |= 128;
        this.width_ = f2;
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
                com.google.v.ei eiVar = c.t;
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001Ǵ\u0016\u0000\u0006\u0005\u0001ᔄ\u0000\u0002ဇ\u0002\u0003᠌\u0003\u0004᠌\u0005\u0005ခ\u0007\u0006ခ\b\u0007Л\bЛ\tခ\t\nခ\n\u000b᠌\u000b\fဉ\r\rЛ\u000eЛ\u000f᠌\u000e\u0010ဈ\u000f\u0011ဃ\u0001\u0012\u001b\u0014\u001b\u0016ဇ\u0004\u0017᠌\u0006Ǵဉ\f", new Object[]{"bitField0_", "laneNumber_", "shared_", "type_", dq.f11269a, "laneDividerCrossing_", eiVar, "width_", "distanceToNextLane_", "restriction_", gk.class, "laneConnection_", di.class, "laneFollowsSegmentBeginFraction_", "laneFollowsSegmentEndFraction_", "surface_", c.u, "flow_", "stopLine_", bw.class, "boundingMarker_", db.class, "conjoinedCategory_", c.s, "laneToken_", "laneId_", "tollPayments_", Cdo.class, "trafficFlowAdjustments_", nd.class, "sometimesDrivableShoulder_", "outerLaneDividerCrossing_", eiVar, "metadata_"});
            case 3:
                return new ds();
            case 4:
                return new df(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ds> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ds.class) {
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

    public db getBoundingMarker(int i2) {
        return this.boundingMarker_.get(i2);
    }

    public int getBoundingMarkerCount() {
        return this.boundingMarker_.size();
    }

    public List<db> getBoundingMarkerList() {
        return this.boundingMarker_;
    }

    public dc getBoundingMarkerOrBuilder(int i2) {
        return this.boundingMarker_.get(i2);
    }

    public List<? extends dc> getBoundingMarkerOrBuilderList() {
        return this.boundingMarker_;
    }

    public dg getConjoinedCategory() {
        dg dgVarA = dg.a(this.conjoinedCategory_);
        return dgVarA == null ? dg.CONJOINED_NONE : dgVarA;
    }

    public float getDistanceToNextLane() {
        return this.distanceToNextLane_;
    }

    public de getFlow() {
        de deVar = this.flow_;
        return deVar == null ? de.getDefaultInstance() : deVar;
    }

    public di getLaneConnection(int i2) {
        return this.laneConnection_.get(i2);
    }

    public int getLaneConnectionCount() {
        return this.laneConnection_.size();
    }

    public List<di> getLaneConnectionList() {
        return this.laneConnection_;
    }

    public dj getLaneConnectionOrBuilder(int i2) {
        return this.laneConnection_.get(i2);
    }

    public List<? extends dj> getLaneConnectionOrBuilderList() {
        return this.laneConnection_;
    }

    public dk getLaneDividerCrossing() {
        dk dkVarA = dk.a(this.laneDividerCrossing_);
        return dkVarA == null ? dk.CROSSING_ALLOWED : dkVarA;
    }

    public float getLaneFollowsSegmentBeginFraction() {
        return this.laneFollowsSegmentBeginFraction_;
    }

    public float getLaneFollowsSegmentEndFraction() {
        return this.laneFollowsSegmentEndFraction_;
    }

    public long getLaneId() {
        return this.laneId_;
    }

    public int getLaneNumber() {
        return this.laneNumber_;
    }

    public String getLaneToken() {
        return this.laneToken_;
    }

    public com.google.v.v getLaneTokenBytes() {
        return com.google.v.v.s(this.laneToken_);
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public dk getOuterLaneDividerCrossing() {
        dk dkVarA = dk.a(this.outerLaneDividerCrossing_);
        return dkVarA == null ? dk.CROSSING_ALLOWED : dkVarA;
    }

    public gk getRestriction(int i2) {
        return this.restriction_.get(i2);
    }

    public int getRestrictionCount() {
        return this.restriction_.size();
    }

    public List<gk> getRestrictionList() {
        return this.restriction_;
    }

    public gl getRestrictionOrBuilder(int i2) {
        return this.restriction_.get(i2);
    }

    public List<? extends gl> getRestrictionOrBuilderList() {
        return this.restriction_;
    }

    public boolean getShared() {
        return this.shared_;
    }

    public boolean getSometimesDrivableShoulder() {
        return this.sometimesDrivableShoulder_;
    }

    public bw getStopLine(int i2) {
        return this.stopLine_.get(i2);
    }

    public int getStopLineCount() {
        return this.stopLine_.size();
    }

    public List<bw> getStopLineList() {
        return this.stopLine_;
    }

    public bx getStopLineOrBuilder(int i2) {
        return this.stopLine_.get(i2);
    }

    public List<? extends bx> getStopLineOrBuilderList() {
        return this.stopLine_;
    }

    public dl getSurface() {
        dl dlVarA = dl.a(this.surface_);
        return dlVarA == null ? dl.SURFACE_UNKNOWN : dlVarA;
    }

    public Cdo getTollPayments(int i2) {
        return this.tollPayments_.get(i2);
    }

    public int getTollPaymentsCount() {
        return this.tollPayments_.size();
    }

    public List<Cdo> getTollPaymentsList() {
        return this.tollPayments_;
    }

    public dp getTollPaymentsOrBuilder(int i2) {
        return this.tollPayments_.get(i2);
    }

    public List<? extends dp> getTollPaymentsOrBuilderList() {
        return this.tollPayments_;
    }

    public nd getTrafficFlowAdjustments(int i2) {
        return this.trafficFlowAdjustments_.get(i2);
    }

    public int getTrafficFlowAdjustmentsCount() {
        return this.trafficFlowAdjustments_.size();
    }

    public List<nd> getTrafficFlowAdjustmentsList() {
        return this.trafficFlowAdjustments_;
    }

    public ne getTrafficFlowAdjustmentsOrBuilder(int i2) {
        return this.trafficFlowAdjustments_.get(i2);
    }

    public List<? extends ne> getTrafficFlowAdjustmentsOrBuilderList() {
        return this.trafficFlowAdjustments_;
    }

    public dr getType() {
        dr drVarA = dr.a(this.type_);
        return drVarA == null ? dr.TYPE_UNKNOWN : drVarA;
    }

    public float getWidth() {
        return this.width_;
    }

    public boolean hasConjoinedCategory() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasDistanceToNextLane() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasFlow() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasLaneDividerCrossing() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLaneFollowsSegmentBeginFraction() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLaneFollowsSegmentEndFraction() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasLaneId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLaneNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLaneToken() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasOuterLaneDividerCrossing() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasShared() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSometimesDrivableShoulder() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSurface() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWidth() {
        return (this.bitField0_ & 128) != 0;
    }

    public static df newBuilder(ds dsVar) {
        return (df) DEFAULT_INSTANCE.createBuilder(dsVar);
    }

    public static ds parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ds parseFrom(com.google.v.z zVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ds parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBoundingMarker(db dbVar) {
        Objects.requireNonNull(dbVar);
        ensureBoundingMarkerIsMutable();
        this.boundingMarker_.add(dbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLaneConnection(di diVar) {
        Objects.requireNonNull(diVar);
        ensureLaneConnectionIsMutable();
        this.laneConnection_.add(diVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRestriction(gk gkVar) {
        Objects.requireNonNull(gkVar);
        ensureRestrictionIsMutable();
        this.restriction_.add(gkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStopLine(bw bwVar) {
        Objects.requireNonNull(bwVar);
        ensureStopLineIsMutable();
        this.stopLine_.add(bwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTollPayments(Cdo cdo) {
        Objects.requireNonNull(cdo);
        ensureTollPaymentsIsMutable();
        this.tollPayments_.add(cdo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTrafficFlowAdjustments(nd ndVar) {
        Objects.requireNonNull(ndVar);
        ensureTrafficFlowAdjustmentsIsMutable();
        this.trafficFlowAdjustments_.add(ndVar);
    }

    public static ds parseFrom(InputStream inputStream) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ds parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ds parseFrom(ByteBuffer byteBuffer) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ds parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ds parseFrom(byte[] bArr) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ds parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ds) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
