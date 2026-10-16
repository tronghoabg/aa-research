package com.waze.jni.protos.navigate;

import com.google.v.b.a;
import com.google.v.b.c;
import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.navigate.NavigationRoute;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRouteKt {
    public static final NavigationRouteKt INSTANCE = new NavigationRouteKt();

    private NavigationRouteKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NavigationRoute.Builder _builder;

        /* compiled from: WazeSource */
        public final class AttributesProxy extends c {
            private AttributesProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class EventsProxy extends c {
            private EventsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class RequiredPermitsProxy extends c {
            private RequiredPermitsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class SegmentsProxy extends c {
            private SegmentsProxy() {
            }
        }

        /* compiled from: WazeSource */
        public final class WaypointsProxy extends c {
            private WaypointsProxy() {
            }
        }

        private Dsl(NavigationRoute.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ NavigationRoute _build() {
            NavigationRoute navigationRouteBuild = this._builder.build();
            x.e(navigationRouteBuild, "build(...)");
            return navigationRouteBuild;
        }

        public final /* synthetic */ void addAllAttributes(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllAttributes(iterable);
        }

        public final /* synthetic */ void addAllEvents(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllEvents(iterable);
        }

        public final /* synthetic */ void addAllRequiredPermits(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllRequiredPermits(iterable);
        }

        public final /* synthetic */ void addAllSegments(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllSegments(iterable);
        }

        public final /* synthetic */ void addAllWaypoints(a aVar, Iterable iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            this._builder.addAllWaypoints(iterable);
        }

        public final /* synthetic */ void addAttributes(a aVar, RouteAttribute routeAttribute) {
            x.f(aVar, "<this>");
            x.f(routeAttribute, "value");
            this._builder.addAttributes(routeAttribute);
        }

        public final /* synthetic */ void addEvents(a aVar, EventOnRoute eventOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventOnRoute, "value");
            this._builder.addEvents(eventOnRoute);
        }

        public final /* synthetic */ void addRequiredPermits(a aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.addRequiredPermits(str);
        }

        public final /* synthetic */ void addSegments(a aVar, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            this._builder.addSegments(routeSegment);
        }

        public final /* synthetic */ void addWaypoints(a aVar, RouteWaypoint routeWaypoint) {
            x.f(aVar, "<this>");
            x.f(routeWaypoint, "value");
            this._builder.addWaypoints(routeWaypoint);
        }

        public final void clearAltId() {
            this._builder.clearAltId();
        }

        public final /* synthetic */ void clearAttributes(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearAttributes();
        }

        public final void clearCarbonEmissionsGrams() {
            this._builder.clearCarbonEmissionsGrams();
        }

        public final void clearDestId() {
            this._builder.clearDestId();
        }

        public final /* synthetic */ void clearEvents(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearEvents();
        }

        public final void clearGeometry() {
            this._builder.clearGeometry();
        }

        public final void clearPopup() {
            this._builder.clearPopup();
        }

        public final void clearRouteUUID() {
            this._builder.clearRouteUUID();
        }

        public final /* synthetic */ void clearSegments(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearSegments();
        }

        public final void clearTotalLengthMeters() {
            this._builder.clearTotalLengthMeters();
        }

        public final void clearTotalTimeSeconds() {
            this._builder.clearTotalTimeSeconds();
        }

        public final void clearVia() {
            this._builder.clearVia();
        }

        public final /* synthetic */ void clearWaypoints(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearWaypoints();
        }

        public final long getAltId() {
            return this._builder.getAltId();
        }

        public final /* synthetic */ a getAttributes() {
            List<RouteAttribute> attributesList = this._builder.getAttributesList();
            x.e(attributesList, "getAttributesList(...)");
            return new a(attributesList);
        }

        public final int getCarbonEmissionsGrams() {
            return this._builder.getCarbonEmissionsGrams();
        }

        public final long getDestId() {
            return this._builder.getDestId();
        }

        public final /* synthetic */ a getEvents() {
            List<EventOnRoute> eventsList = this._builder.getEventsList();
            x.e(eventsList, "getEventsList(...)");
            return new a(eventsList);
        }

        public final PolylineGeometry getGeometry() {
            PolylineGeometry geometry = this._builder.getGeometry();
            x.e(geometry, "getGeometry(...)");
            return geometry;
        }

        public final PolylineGeometry getGeometryOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NavigationRouteKtKt.getGeometryOrNull(dsl._builder);
        }

        public final RoutingPopup getPopup() {
            RoutingPopup popup = this._builder.getPopup();
            x.e(popup, "getPopup(...)");
            return popup;
        }

        public final RoutingPopup getPopupOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return NavigationRouteKtKt.getPopupOrNull(dsl._builder);
        }

        public final a<String, RequiredPermitsProxy> getRequiredPermits() {
            List<String> requiredPermitsList = this._builder.getRequiredPermitsList();
            x.e(requiredPermitsList, "getRequiredPermitsList(...)");
            return new a<>(requiredPermitsList);
        }

        public final String getRouteUUID() {
            String routeUUID = this._builder.getRouteUUID();
            x.e(routeUUID, "getRouteUUID(...)");
            return routeUUID;
        }

        public final /* synthetic */ a getSegments() {
            List<RouteSegment> segmentsList = this._builder.getSegmentsList();
            x.e(segmentsList, "getSegmentsList(...)");
            return new a(segmentsList);
        }

        public final long getTotalLengthMeters() {
            return this._builder.getTotalLengthMeters();
        }

        public final long getTotalTimeSeconds() {
            return this._builder.getTotalTimeSeconds();
        }

        public final String getVia() {
            String via = this._builder.getVia();
            x.e(via, "getVia(...)");
            return via;
        }

        public final /* synthetic */ a getWaypoints() {
            List<RouteWaypoint> waypointsList = this._builder.getWaypointsList();
            x.e(waypointsList, "getWaypointsList(...)");
            return new a(waypointsList);
        }

        public final boolean hasGeometry() {
            return this._builder.hasGeometry();
        }

        public final boolean hasPopup() {
            return this._builder.hasPopup();
        }

        public final /* synthetic */ void plusAssignAllAttributes(a<RouteAttribute, AttributesProxy> aVar, Iterable<RouteAttribute> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllAttributes(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllEvents(a<EventOnRoute, EventsProxy> aVar, Iterable<EventOnRoute> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllEvents(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllRequiredPermits(a<String, RequiredPermitsProxy> aVar, Iterable<String> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllRequiredPermits(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllSegments(a<RouteSegment, SegmentsProxy> aVar, Iterable<RouteSegment> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllSegments(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAllWaypoints(a<RouteWaypoint, WaypointsProxy> aVar, Iterable<RouteWaypoint> iterable) {
            x.f(aVar, "<this>");
            x.f(iterable, "values");
            addAllWaypoints(aVar, iterable);
        }

        public final /* synthetic */ void plusAssignAttributes(a<RouteAttribute, AttributesProxy> aVar, RouteAttribute routeAttribute) {
            x.f(aVar, "<this>");
            x.f(routeAttribute, "value");
            addAttributes(aVar, routeAttribute);
        }

        public final /* synthetic */ void plusAssignEvents(a<EventOnRoute, EventsProxy> aVar, EventOnRoute eventOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventOnRoute, "value");
            addEvents(aVar, eventOnRoute);
        }

        public final /* synthetic */ void plusAssignRequiredPermits(a<String, RequiredPermitsProxy> aVar, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            addRequiredPermits(aVar, str);
        }

        public final /* synthetic */ void plusAssignSegments(a<RouteSegment, SegmentsProxy> aVar, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            addSegments(aVar, routeSegment);
        }

        public final /* synthetic */ void plusAssignWaypoints(a<RouteWaypoint, WaypointsProxy> aVar, RouteWaypoint routeWaypoint) {
            x.f(aVar, "<this>");
            x.f(routeWaypoint, "value");
            addWaypoints(aVar, routeWaypoint);
        }

        public final void setAltId(long j2) {
            this._builder.setAltId(j2);
        }

        public final /* synthetic */ void setAttributes(a aVar, int i2, RouteAttribute routeAttribute) {
            x.f(aVar, "<this>");
            x.f(routeAttribute, "value");
            this._builder.setAttributes(i2, routeAttribute);
        }

        public final void setCarbonEmissionsGrams(int i2) {
            this._builder.setCarbonEmissionsGrams(i2);
        }

        public final void setDestId(long j2) {
            this._builder.setDestId(j2);
        }

        public final /* synthetic */ void setEvents(a aVar, int i2, EventOnRoute eventOnRoute) {
            x.f(aVar, "<this>");
            x.f(eventOnRoute, "value");
            this._builder.setEvents(i2, eventOnRoute);
        }

        public final void setGeometry(PolylineGeometry polylineGeometry) {
            x.f(polylineGeometry, "value");
            this._builder.setGeometry(polylineGeometry);
        }

        public final void setPopup(RoutingPopup routingPopup) {
            x.f(routingPopup, "value");
            this._builder.setPopup(routingPopup);
        }

        public final /* synthetic */ void setRequiredPermits(a aVar, int i2, String str) {
            x.f(aVar, "<this>");
            x.f(str, "value");
            this._builder.setRequiredPermits(i2, str);
        }

        public final void setRouteUUID(String str) {
            x.f(str, "value");
            this._builder.setRouteUUID(str);
        }

        public final /* synthetic */ void setSegments(a aVar, int i2, RouteSegment routeSegment) {
            x.f(aVar, "<this>");
            x.f(routeSegment, "value");
            this._builder.setSegments(i2, routeSegment);
        }

        public final void setTotalLengthMeters(long j2) {
            this._builder.setTotalLengthMeters(j2);
        }

        public final void setTotalTimeSeconds(long j2) {
            this._builder.setTotalTimeSeconds(j2);
        }

        public final void setVia(String str) {
            x.f(str, "value");
            this._builder.setVia(str);
        }

        public final /* synthetic */ void setWaypoints(a aVar, int i2, RouteWaypoint routeWaypoint) {
            x.f(aVar, "<this>");
            x.f(routeWaypoint, "value");
            this._builder.setWaypoints(i2, routeWaypoint);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(NavigationRoute.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(NavigationRoute.Builder builder, o oVar) {
            this(builder);
        }

        public final /* synthetic */ void setRequiredPermits(a aVar) {
            x.f(aVar, "<this>");
            this._builder.clearRequiredPermits();
        }
    }
}
