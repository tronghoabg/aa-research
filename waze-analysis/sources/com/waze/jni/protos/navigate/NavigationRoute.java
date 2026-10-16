package com.waze.jni.protos.navigate;

import com.google.v.c;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.RouteSegmentOrBuilder;
import com.waze.jni.protos.navigate.EventOnRoute;
import com.waze.jni.protos.navigate.PolylineGeometry;
import com.waze.jni.protos.navigate.RouteAttribute;
import com.waze.jni.protos.navigate.RouteWaypoint;
import com.waze.jni.protos.navigate.RoutingPopup;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRoute extends du<NavigationRoute, Builder> implements NavigationRouteOrBuilder {
    public static final int ALTID_FIELD_NUMBER = 4;
    public static final int ATTRIBUTES_FIELD_NUMBER = 11;
    public static final int CARBONEMISSIONSGRAMS_FIELD_NUMBER = 7;
    private static final NavigationRoute DEFAULT_INSTANCE;
    public static final int DESTID_FIELD_NUMBER = 1;
    public static final int EVENTS_FIELD_NUMBER = 10;
    public static final int GEOMETRY_FIELD_NUMBER = 8;
    private static volatile fo<NavigationRoute> PARSER = null;
    public static final int POPUP_FIELD_NUMBER = 13;
    public static final int REQUIREDPERMITS_FIELD_NUMBER = 12;
    public static final int ROUTEUUID_FIELD_NUMBER = 6;
    public static final int SEGMENTS_FIELD_NUMBER = 14;
    public static final int TOTALLENGTHMETERS_FIELD_NUMBER = 2;
    public static final int TOTALTIMESECONDS_FIELD_NUMBER = 3;
    public static final int VIA_FIELD_NUMBER = 5;
    public static final int WAYPOINTS_FIELD_NUMBER = 9;
    private long altId_;
    private int bitField0_;
    private int carbonEmissionsGrams_;
    private long destId_;
    private PolylineGeometry geometry_;
    private RoutingPopup popup_;
    private long totalLengthMeters_;
    private long totalTimeSeconds_;
    private String via_ = "";
    private String routeUUID_ = "";
    private eo<RouteWaypoint> waypoints_ = emptyProtobufList();
    private eo<EventOnRoute> events_ = emptyProtobufList();
    private eo<RouteAttribute> attributes_ = emptyProtobufList();
    private eo<String> requiredPermits_ = emptyProtobufList();
    private eo<RouteSegment> segments_ = emptyProtobufList();

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.NavigationRoute$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        NavigationRoute navigationRoute = new NavigationRoute();
        DEFAULT_INSTANCE = navigationRoute;
        du.registerDefaultInstance(NavigationRoute.class, navigationRoute);
    }

    private NavigationRoute() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends RouteAttribute> iterable) {
        ensureAttributesIsMutable();
        c.addAll(iterable, this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEvents(Iterable<? extends EventOnRoute> iterable) {
        ensureEventsIsMutable();
        c.addAll(iterable, this.events_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequiredPermits(Iterable<String> iterable) {
        ensureRequiredPermitsIsMutable();
        c.addAll(iterable, this.requiredPermits_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSegments(Iterable<? extends RouteSegment> iterable) {
        ensureSegmentsIsMutable();
        c.addAll(iterable, this.segments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoints(Iterable<? extends RouteWaypoint> iterable) {
        ensureWaypointsIsMutable();
        c.addAll(iterable, this.waypoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i2, RouteAttribute routeAttribute) {
        Objects.requireNonNull(routeAttribute);
        ensureAttributesIsMutable();
        this.attributes_.add(i2, routeAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(int i2, EventOnRoute eventOnRoute) {
        Objects.requireNonNull(eventOnRoute);
        ensureEventsIsMutable();
        this.events_.add(i2, eventOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermits(String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequiredPermitsBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.add(vVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(int i2, RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.add(i2, routeSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(int i2, RouteWaypoint routeWaypoint) {
        Objects.requireNonNull(routeWaypoint);
        ensureWaypointsIsMutable();
        this.waypoints_.add(i2, routeWaypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltId() {
        this.altId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCarbonEmissionsGrams() {
        this.carbonEmissionsGrams_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDestId() {
        this.destId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvents() {
        this.events_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeometry() {
        this.geometry_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopup() {
        this.popup_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequiredPermits() {
        this.requiredPermits_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteUUID() {
        this.routeUUID_ = getDefaultInstance().getRouteUUID();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegments() {
        this.segments_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLengthMeters() {
        this.totalLengthMeters_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTimeSeconds() {
        this.totalTimeSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVia() {
        this.via_ = getDefaultInstance().getVia();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoints() {
        this.waypoints_ = emptyProtobufList();
    }

    private void ensureAttributesIsMutable() {
        eo<RouteAttribute> eoVar = this.attributes_;
        if (eoVar.c()) {
            return;
        }
        this.attributes_ = du.mutableCopy(eoVar);
    }

    private void ensureEventsIsMutable() {
        eo<EventOnRoute> eoVar = this.events_;
        if (eoVar.c()) {
            return;
        }
        this.events_ = du.mutableCopy(eoVar);
    }

    private void ensureRequiredPermitsIsMutable() {
        eo<String> eoVar = this.requiredPermits_;
        if (eoVar.c()) {
            return;
        }
        this.requiredPermits_ = du.mutableCopy(eoVar);
    }

    private void ensureSegmentsIsMutable() {
        eo<RouteSegment> eoVar = this.segments_;
        if (eoVar.c()) {
            return;
        }
        this.segments_ = du.mutableCopy(eoVar);
    }

    private void ensureWaypointsIsMutable() {
        eo<RouteWaypoint> eoVar = this.waypoints_;
        if (eoVar.c()) {
            return;
        }
        this.waypoints_ = du.mutableCopy(eoVar);
    }

    public static NavigationRoute getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGeometry(PolylineGeometry polylineGeometry) {
        Objects.requireNonNull(polylineGeometry);
        PolylineGeometry polylineGeometry2 = this.geometry_;
        if (polylineGeometry2 != null && polylineGeometry2 != PolylineGeometry.getDefaultInstance()) {
            PolylineGeometry.Builder builderNewBuilder = PolylineGeometry.newBuilder(polylineGeometry2);
            builderNewBuilder.mergeFrom((PolylineGeometry.Builder) polylineGeometry);
            polylineGeometry = builderNewBuilder.buildPartial();
        }
        this.geometry_ = polylineGeometry;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePopup(RoutingPopup routingPopup) {
        Objects.requireNonNull(routingPopup);
        RoutingPopup routingPopup2 = this.popup_;
        if (routingPopup2 != null && routingPopup2 != RoutingPopup.getDefaultInstance()) {
            RoutingPopup.Builder builderNewBuilder = RoutingPopup.newBuilder(routingPopup2);
            builderNewBuilder.mergeFrom((RoutingPopup.Builder) routingPopup);
            routingPopup = builderNewBuilder.buildPartial();
        }
        this.popup_ = routingPopup;
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static NavigationRoute parseDelimitedFrom(InputStream inputStream) {
        return (NavigationRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoute parseFrom(v vVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<NavigationRoute> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i2) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEvents(int i2) {
        ensureEventsIsMutable();
        this.events_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSegments(int i2) {
        ensureSegmentsIsMutable();
        this.segments_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoints(int i2) {
        ensureWaypointsIsMutable();
        this.waypoints_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltId(long j2) {
        this.altId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i2, RouteAttribute routeAttribute) {
        Objects.requireNonNull(routeAttribute);
        ensureAttributesIsMutable();
        this.attributes_.set(i2, routeAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarbonEmissionsGrams(int i2) {
        this.carbonEmissionsGrams_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestId(long j2) {
        this.destId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvents(int i2, EventOnRoute eventOnRoute) {
        Objects.requireNonNull(eventOnRoute);
        ensureEventsIsMutable();
        this.events_.set(i2, eventOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeometry(PolylineGeometry polylineGeometry) {
        Objects.requireNonNull(polylineGeometry);
        this.geometry_ = polylineGeometry;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopup(RoutingPopup routingPopup) {
        Objects.requireNonNull(routingPopup);
        this.popup_ = routingPopup;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequiredPermits(int i2, String str) {
        Objects.requireNonNull(str);
        ensureRequiredPermitsIsMutable();
        this.requiredPermits_.set(i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUUID(String str) {
        Objects.requireNonNull(str);
        this.routeUUID_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteUUIDBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routeUUID_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegments(int i2, RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.set(i2, routeSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLengthMeters(long j2) {
        this.totalLengthMeters_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTimeSeconds(long j2) {
        this.totalTimeSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVia(String str) {
        Objects.requireNonNull(str);
        this.via_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViaBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.via_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoints(int i2, RouteWaypoint routeWaypoint) {
        Objects.requireNonNull(routeWaypoint);
        ensureWaypointsIsMutable();
        this.waypoints_.set(i2, routeWaypoint);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0004\bဉ\u0000\t\u001b\n\u001b\u000b\u001b\fȚ\rဉ\u0001\u000e\u001b", new Object[]{"bitField0_", "destId_", "totalLengthMeters_", "totalTimeSeconds_", "altId_", "via_", "routeUUID_", "carbonEmissionsGrams_", "geometry_", "waypoints_", RouteWaypoint.class, "events_", EventOnRoute.class, "attributes_", RouteAttribute.class, "requiredPermits_", "popup_", "segments_", RouteSegment.class});
        }
        if (iOrdinal == 3) {
            return new NavigationRoute();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<NavigationRoute> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (NavigationRoute.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public long getAltId() {
        return this.altId_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public RouteAttribute getAttributes(int i2) {
        return this.attributes_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getAttributesCount() {
        return this.attributes_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public List<RouteAttribute> getAttributesList() {
        return this.attributes_;
    }

    public RouteAttributeOrBuilder getAttributesOrBuilder(int i2) {
        return this.attributes_.get(i2);
    }

    public List<? extends RouteAttributeOrBuilder> getAttributesOrBuilderList() {
        return this.attributes_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getCarbonEmissionsGrams() {
        return this.carbonEmissionsGrams_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public long getDestId() {
        return this.destId_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public EventOnRoute getEvents(int i2) {
        return this.events_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getEventsCount() {
        return this.events_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public List<EventOnRoute> getEventsList() {
        return this.events_;
    }

    public EventOnRouteOrBuilder getEventsOrBuilder(int i2) {
        return this.events_.get(i2);
    }

    public List<? extends EventOnRouteOrBuilder> getEventsOrBuilderList() {
        return this.events_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public PolylineGeometry getGeometry() {
        PolylineGeometry polylineGeometry = this.geometry_;
        return polylineGeometry == null ? PolylineGeometry.getDefaultInstance() : polylineGeometry;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public RoutingPopup getPopup() {
        RoutingPopup routingPopup = this.popup_;
        return routingPopup == null ? RoutingPopup.getDefaultInstance() : routingPopup;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public String getRequiredPermits(int i2) {
        return this.requiredPermits_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public v getRequiredPermitsBytes(int i2) {
        return v.s(this.requiredPermits_.get(i2));
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getRequiredPermitsCount() {
        return this.requiredPermits_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public List<String> getRequiredPermitsList() {
        return this.requiredPermits_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public String getRouteUUID() {
        return this.routeUUID_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public v getRouteUUIDBytes() {
        return v.s(this.routeUUID_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public RouteSegment getSegments(int i2) {
        return this.segments_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getSegmentsCount() {
        return this.segments_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public List<RouteSegment> getSegmentsList() {
        return this.segments_;
    }

    public RouteSegmentOrBuilder getSegmentsOrBuilder(int i2) {
        return this.segments_.get(i2);
    }

    public List<? extends RouteSegmentOrBuilder> getSegmentsOrBuilderList() {
        return this.segments_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public long getTotalLengthMeters() {
        return this.totalLengthMeters_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public long getTotalTimeSeconds() {
        return this.totalTimeSeconds_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public String getVia() {
        return this.via_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public v getViaBytes() {
        return v.s(this.via_);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public RouteWaypoint getWaypoints(int i2) {
        return this.waypoints_.get(i2);
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public int getWaypointsCount() {
        return this.waypoints_.size();
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public List<RouteWaypoint> getWaypointsList() {
        return this.waypoints_;
    }

    public RouteWaypointOrBuilder getWaypointsOrBuilder(int i2) {
        return this.waypoints_.get(i2);
    }

    public List<? extends RouteWaypointOrBuilder> getWaypointsOrBuilderList() {
        return this.waypoints_;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public boolean hasGeometry() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
    public boolean hasPopup() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(NavigationRoute navigationRoute) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(navigationRoute);
    }

    public static NavigationRoute parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (NavigationRoute) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoute parseFrom(v vVar, de deVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static NavigationRoute parseFrom(z zVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static NavigationRoute parseFrom(z zVar, de deVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(RouteAttribute routeAttribute) {
        Objects.requireNonNull(routeAttribute);
        ensureAttributesIsMutable();
        this.attributes_.add(routeAttribute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEvents(EventOnRoute eventOnRoute) {
        Objects.requireNonNull(eventOnRoute);
        ensureEventsIsMutable();
        this.events_.add(eventOnRoute);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSegments(RouteSegment routeSegment) {
        Objects.requireNonNull(routeSegment);
        ensureSegmentsIsMutable();
        this.segments_.add(routeSegment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(RouteWaypoint routeWaypoint) {
        Objects.requireNonNull(routeWaypoint);
        ensureWaypointsIsMutable();
        this.waypoints_.add(routeWaypoint);
    }

    public static NavigationRoute parseFrom(InputStream inputStream) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NavigationRoute parseFrom(InputStream inputStream, de deVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static NavigationRoute parseFrom(ByteBuffer byteBuffer) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NavigationRoute parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<NavigationRoute, Builder> implements NavigationRouteOrBuilder {
        private Builder() {
            super(NavigationRoute.DEFAULT_INSTANCE);
        }

        public Builder addAllAttributes(Iterable<? extends RouteAttribute> iterable) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAllAttributes(iterable);
            return this;
        }

        public Builder addAllEvents(Iterable<? extends EventOnRoute> iterable) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAllEvents(iterable);
            return this;
        }

        public Builder addAllRequiredPermits(Iterable<String> iterable) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAllRequiredPermits(iterable);
            return this;
        }

        public Builder addAllSegments(Iterable<? extends RouteSegment> iterable) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAllSegments(iterable);
            return this;
        }

        public Builder addAllWaypoints(Iterable<? extends RouteWaypoint> iterable) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAllWaypoints(iterable);
            return this;
        }

        public Builder addAttributes(int i2, RouteAttribute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAttributes(i2, builder.build());
            return this;
        }

        public Builder addEvents(int i2, EventOnRoute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addEvents(i2, builder.build());
            return this;
        }

        public Builder addRequiredPermits(String str) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addRequiredPermits(str);
            return this;
        }

        public Builder addRequiredPermitsBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addRequiredPermitsBytes(vVar);
            return this;
        }

        public Builder addSegments(int i2, RouteSegment.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addSegments(i2, builder.build());
            return this;
        }

        public Builder addWaypoints(int i2, RouteWaypoint.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addWaypoints(i2, builder.build());
            return this;
        }

        public Builder clearAltId() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearAltId();
            return this;
        }

        public Builder clearAttributes() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearAttributes();
            return this;
        }

        public Builder clearCarbonEmissionsGrams() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearCarbonEmissionsGrams();
            return this;
        }

        public Builder clearDestId() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearDestId();
            return this;
        }

        public Builder clearEvents() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearEvents();
            return this;
        }

        public Builder clearGeometry() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearGeometry();
            return this;
        }

        public Builder clearPopup() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearPopup();
            return this;
        }

        public Builder clearRequiredPermits() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearRequiredPermits();
            return this;
        }

        public Builder clearRouteUUID() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearRouteUUID();
            return this;
        }

        public Builder clearSegments() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearSegments();
            return this;
        }

        public Builder clearTotalLengthMeters() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearTotalLengthMeters();
            return this;
        }

        public Builder clearTotalTimeSeconds() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearTotalTimeSeconds();
            return this;
        }

        public Builder clearVia() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearVia();
            return this;
        }

        public Builder clearWaypoints() {
            copyOnWrite();
            ((NavigationRoute) this.instance).clearWaypoints();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public long getAltId() {
            return ((NavigationRoute) this.instance).getAltId();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public RouteAttribute getAttributes(int i2) {
            return ((NavigationRoute) this.instance).getAttributes(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getAttributesCount() {
            return ((NavigationRoute) this.instance).getAttributesCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public List<RouteAttribute> getAttributesList() {
            return DesugarCollections.unmodifiableList(((NavigationRoute) this.instance).getAttributesList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getCarbonEmissionsGrams() {
            return ((NavigationRoute) this.instance).getCarbonEmissionsGrams();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public long getDestId() {
            return ((NavigationRoute) this.instance).getDestId();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public EventOnRoute getEvents(int i2) {
            return ((NavigationRoute) this.instance).getEvents(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getEventsCount() {
            return ((NavigationRoute) this.instance).getEventsCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public List<EventOnRoute> getEventsList() {
            return DesugarCollections.unmodifiableList(((NavigationRoute) this.instance).getEventsList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public PolylineGeometry getGeometry() {
            return ((NavigationRoute) this.instance).getGeometry();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public RoutingPopup getPopup() {
            return ((NavigationRoute) this.instance).getPopup();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public String getRequiredPermits(int i2) {
            return ((NavigationRoute) this.instance).getRequiredPermits(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public v getRequiredPermitsBytes(int i2) {
            return ((NavigationRoute) this.instance).getRequiredPermitsBytes(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getRequiredPermitsCount() {
            return ((NavigationRoute) this.instance).getRequiredPermitsCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public List<String> getRequiredPermitsList() {
            return DesugarCollections.unmodifiableList(((NavigationRoute) this.instance).getRequiredPermitsList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public String getRouteUUID() {
            return ((NavigationRoute) this.instance).getRouteUUID();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public v getRouteUUIDBytes() {
            return ((NavigationRoute) this.instance).getRouteUUIDBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public RouteSegment getSegments(int i2) {
            return ((NavigationRoute) this.instance).getSegments(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getSegmentsCount() {
            return ((NavigationRoute) this.instance).getSegmentsCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public List<RouteSegment> getSegmentsList() {
            return DesugarCollections.unmodifiableList(((NavigationRoute) this.instance).getSegmentsList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public long getTotalLengthMeters() {
            return ((NavigationRoute) this.instance).getTotalLengthMeters();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public long getTotalTimeSeconds() {
            return ((NavigationRoute) this.instance).getTotalTimeSeconds();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public String getVia() {
            return ((NavigationRoute) this.instance).getVia();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public v getViaBytes() {
            return ((NavigationRoute) this.instance).getViaBytes();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public RouteWaypoint getWaypoints(int i2) {
            return ((NavigationRoute) this.instance).getWaypoints(i2);
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public int getWaypointsCount() {
            return ((NavigationRoute) this.instance).getWaypointsCount();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public List<RouteWaypoint> getWaypointsList() {
            return DesugarCollections.unmodifiableList(((NavigationRoute) this.instance).getWaypointsList());
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public boolean hasGeometry() {
            return ((NavigationRoute) this.instance).hasGeometry();
        }

        @Override // com.waze.jni.protos.navigate.NavigationRouteOrBuilder
        public boolean hasPopup() {
            return ((NavigationRoute) this.instance).hasPopup();
        }

        public Builder mergeGeometry(PolylineGeometry polylineGeometry) {
            copyOnWrite();
            ((NavigationRoute) this.instance).mergeGeometry(polylineGeometry);
            return this;
        }

        public Builder mergePopup(RoutingPopup routingPopup) {
            copyOnWrite();
            ((NavigationRoute) this.instance).mergePopup(routingPopup);
            return this;
        }

        public Builder removeAttributes(int i2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).removeAttributes(i2);
            return this;
        }

        public Builder removeEvents(int i2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).removeEvents(i2);
            return this;
        }

        public Builder removeSegments(int i2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).removeSegments(i2);
            return this;
        }

        public Builder removeWaypoints(int i2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).removeWaypoints(i2);
            return this;
        }

        public Builder setAltId(long j2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setAltId(j2);
            return this;
        }

        public Builder setAttributes(int i2, RouteAttribute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setAttributes(i2, builder.build());
            return this;
        }

        public Builder setCarbonEmissionsGrams(int i2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setCarbonEmissionsGrams(i2);
            return this;
        }

        public Builder setDestId(long j2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setDestId(j2);
            return this;
        }

        public Builder setEvents(int i2, EventOnRoute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setEvents(i2, builder.build());
            return this;
        }

        public Builder setGeometry(PolylineGeometry.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setGeometry(builder.build());
            return this;
        }

        public Builder setPopup(RoutingPopup.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setPopup(builder.build());
            return this;
        }

        public Builder setRequiredPermits(int i2, String str) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setRequiredPermits(i2, str);
            return this;
        }

        public Builder setRouteUUID(String str) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setRouteUUID(str);
            return this;
        }

        public Builder setRouteUUIDBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setRouteUUIDBytes(vVar);
            return this;
        }

        public Builder setSegments(int i2, RouteSegment.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setSegments(i2, builder.build());
            return this;
        }

        public Builder setTotalLengthMeters(long j2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setTotalLengthMeters(j2);
            return this;
        }

        public Builder setTotalTimeSeconds(long j2) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setTotalTimeSeconds(j2);
            return this;
        }

        public Builder setVia(String str) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setVia(str);
            return this;
        }

        public Builder setViaBytes(v vVar) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setViaBytes(vVar);
            return this;
        }

        public Builder setWaypoints(int i2, RouteWaypoint.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setWaypoints(i2, builder.build());
            return this;
        }

        public Builder addAttributes(int i2, RouteAttribute routeAttribute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAttributes(i2, routeAttribute);
            return this;
        }

        public Builder addEvents(int i2, EventOnRoute eventOnRoute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addEvents(i2, eventOnRoute);
            return this;
        }

        public Builder addSegments(int i2, RouteSegment routeSegment) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addSegments(i2, routeSegment);
            return this;
        }

        public Builder addWaypoints(int i2, RouteWaypoint routeWaypoint) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addWaypoints(i2, routeWaypoint);
            return this;
        }

        public Builder setAttributes(int i2, RouteAttribute routeAttribute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setAttributes(i2, routeAttribute);
            return this;
        }

        public Builder setEvents(int i2, EventOnRoute eventOnRoute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setEvents(i2, eventOnRoute);
            return this;
        }

        public Builder setGeometry(PolylineGeometry polylineGeometry) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setGeometry(polylineGeometry);
            return this;
        }

        public Builder setPopup(RoutingPopup routingPopup) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setPopup(routingPopup);
            return this;
        }

        public Builder setSegments(int i2, RouteSegment routeSegment) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setSegments(i2, routeSegment);
            return this;
        }

        public Builder setWaypoints(int i2, RouteWaypoint routeWaypoint) {
            copyOnWrite();
            ((NavigationRoute) this.instance).setWaypoints(i2, routeWaypoint);
            return this;
        }

        public Builder addAttributes(RouteAttribute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAttributes(builder.build());
            return this;
        }

        public Builder addEvents(EventOnRoute.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addEvents(builder.build());
            return this;
        }

        public Builder addSegments(RouteSegment.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addSegments(builder.build());
            return this;
        }

        public Builder addWaypoints(RouteWaypoint.Builder builder) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addWaypoints(builder.build());
            return this;
        }

        public Builder addAttributes(RouteAttribute routeAttribute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addAttributes(routeAttribute);
            return this;
        }

        public Builder addEvents(EventOnRoute eventOnRoute) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addEvents(eventOnRoute);
            return this;
        }

        public Builder addSegments(RouteSegment routeSegment) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addSegments(routeSegment);
            return this;
        }

        public Builder addWaypoints(RouteWaypoint routeWaypoint) {
            copyOnWrite();
            ((NavigationRoute) this.instance).addWaypoints(routeWaypoint);
            return this;
        }
    }

    public static NavigationRoute parseFrom(byte[] bArr) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NavigationRoute parseFrom(byte[] bArr, de deVar) {
        return (NavigationRoute) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
