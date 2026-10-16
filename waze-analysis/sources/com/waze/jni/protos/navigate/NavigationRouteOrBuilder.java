package com.waze.jni.protos.navigate;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.RouteSegment;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface NavigationRouteOrBuilder extends fj {
    long getAltId();

    RouteAttribute getAttributes(int i2);

    int getAttributesCount();

    List<RouteAttribute> getAttributesList();

    int getCarbonEmissionsGrams();

    long getDestId();

    EventOnRoute getEvents(int i2);

    int getEventsCount();

    List<EventOnRoute> getEventsList();

    PolylineGeometry getGeometry();

    RoutingPopup getPopup();

    String getRequiredPermits(int i2);

    v getRequiredPermitsBytes(int i2);

    int getRequiredPermitsCount();

    List<String> getRequiredPermitsList();

    String getRouteUUID();

    v getRouteUUIDBytes();

    RouteSegment getSegments(int i2);

    int getSegmentsCount();

    List<RouteSegment> getSegmentsList();

    long getTotalLengthMeters();

    long getTotalTimeSeconds();

    String getVia();

    v getViaBytes();

    RouteWaypoint getWaypoints(int i2);

    int getWaypointsCount();

    List<RouteWaypoint> getWaypointsList();

    boolean hasGeometry();

    boolean hasPopup();
}
