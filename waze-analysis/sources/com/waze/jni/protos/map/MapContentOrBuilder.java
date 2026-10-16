package com.waze.jni.protos.map;

import com.google.v.fj;
import com.waze.jni.protos.map.MapContent;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MapContentOrBuilder extends fj {
    MapContent.AdditionalContent getAdditionalContent();

    MapContent.ColorScheme getColorScheme();

    int getColorSchemeValue();

    EventsOnRoute getEventsOnRoute(int i2);

    int getEventsOnRouteCount();

    List<EventsOnRoute> getEventsOnRouteList();

    ExtendedRouteData getExtendedRoutes(int i2);

    int getExtendedRoutesCount();

    List<ExtendedRouteData> getExtendedRoutesList();

    Marker getMarkers(int i2);

    int getMarkersCount();

    List<Marker> getMarkersList();

    MapContent.NavigationContent getNavigationContent();

    ExtendedPolygon getPolygons(int i2);

    int getPolygonsCount();

    List<ExtendedPolygon> getPolygonsList();

    ExtendedPolyline getPolylines(int i2);

    int getPolylinesCount();

    List<ExtendedPolyline> getPolylinesList();

    boolean hasAdditionalContent();

    boolean hasNavigationContent();
}
