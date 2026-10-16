package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapContent;
import com.waze.jni.protos.map.MapContentKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapContentKtKt {
    /* renamed from: -initializemapContent, reason: not valid java name */
    public static final MapContent m26712initializemapContent(l<? super MapContentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapContentKt.Dsl.Companion companion = MapContentKt.Dsl.Companion;
        MapContent.Builder builderNewBuilder = MapContent.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.AdditionalContent.MapPois copy(MapContent.AdditionalContent.MapPois mapPois, l<? super MapContentKt.AdditionalContentKt.MapPoisKt.Dsl, ab> lVar) {
        x.f(mapPois, "<this>");
        x.f(lVar, "block");
        MapContentKt.AdditionalContentKt.MapPoisKt.Dsl.Companion companion = MapContentKt.AdditionalContentKt.MapPoisKt.Dsl.Companion;
        MapContent.AdditionalContent.MapPois.Builder builder = mapPois.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.AdditionalContentKt.MapPoisKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.AdditionalContent getAdditionalContentOrNull(MapContentOrBuilder mapContentOrBuilder) {
        x.f(mapContentOrBuilder, "<this>");
        if (mapContentOrBuilder.hasAdditionalContent()) {
            return mapContentOrBuilder.getAdditionalContent();
        }
        return null;
    }

    public static /* synthetic */ void getAdditionalContentOrNull$annotations(MapContentOrBuilder mapContentOrBuilder) {
    }

    public static final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment getArrowOnSegmentOrNull(MapContent.NavigationContent.ShowActiveRouteOrBuilder showActiveRouteOrBuilder) {
        x.f(showActiveRouteOrBuilder, "<this>");
        if (showActiveRouteOrBuilder.hasArrowOnSegment()) {
            return showActiveRouteOrBuilder.getArrowOnSegment();
        }
        return null;
    }

    public static /* synthetic */ void getArrowOnSegmentOrNull$annotations(MapContent.NavigationContent.ShowActiveRouteOrBuilder showActiveRouteOrBuilder) {
    }

    public static final MapContent.AdditionalContent.MapPois getMapPoisOrNull(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
        x.f(additionalContentOrBuilder, "<this>");
        if (additionalContentOrBuilder.hasMapPois()) {
            return additionalContentOrBuilder.getMapPois();
        }
        return null;
    }

    public static /* synthetic */ void getMapPoisOrNull$annotations(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
    }

    public static final MapContent.NavigationContent getNavigationContentOrNull(MapContentOrBuilder mapContentOrBuilder) {
        x.f(mapContentOrBuilder, "<this>");
        if (mapContentOrBuilder.hasNavigationContent()) {
            return mapContentOrBuilder.getNavigationContent();
        }
        return null;
    }

    public static /* synthetic */ void getNavigationContentOrNull$annotations(MapContentOrBuilder mapContentOrBuilder) {
    }

    public static final MapContent.NavigationContent.ShowActiveRoute getShowActiveRouteOrNull(MapContent.NavigationContentOrBuilder navigationContentOrBuilder) {
        x.f(navigationContentOrBuilder, "<this>");
        if (navigationContentOrBuilder.hasShowActiveRoute()) {
            return navigationContentOrBuilder.getShowActiveRoute();
        }
        return null;
    }

    public static /* synthetic */ void getShowActiveRouteOrNull$annotations(MapContent.NavigationContentOrBuilder navigationContentOrBuilder) {
    }

    public static final MapContent.AdditionalContent.RealtimeAlerts getShowRealtimeAlertsOrNull(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
        x.f(additionalContentOrBuilder, "<this>");
        if (additionalContentOrBuilder.hasShowRealtimeAlerts()) {
            return additionalContentOrBuilder.getShowRealtimeAlerts();
        }
        return null;
    }

    public static /* synthetic */ void getShowRealtimeAlertsOrNull$annotations(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
    }

    public static final MapContent.AdditionalContent.TileAlerts getTileAlertsOrNull(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
        x.f(additionalContentOrBuilder, "<this>");
        if (additionalContentOrBuilder.hasTileAlerts()) {
            return additionalContentOrBuilder.getTileAlerts();
        }
        return null;
    }

    public static /* synthetic */ void getTileAlertsOrNull$annotations(MapContent.AdditionalContentOrBuilder additionalContentOrBuilder) {
    }

    public static final MapContent.AdditionalContent.RealtimeAlerts copy(MapContent.AdditionalContent.RealtimeAlerts realtimeAlerts, l<? super MapContentKt.AdditionalContentKt.RealtimeAlertsKt.Dsl, ab> lVar) {
        x.f(realtimeAlerts, "<this>");
        x.f(lVar, "block");
        MapContentKt.AdditionalContentKt.RealtimeAlertsKt.Dsl.Companion companion = MapContentKt.AdditionalContentKt.RealtimeAlertsKt.Dsl.Companion;
        MapContent.AdditionalContent.RealtimeAlerts.Builder builder = realtimeAlerts.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.AdditionalContentKt.RealtimeAlertsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.AdditionalContent.TileAlerts copy(MapContent.AdditionalContent.TileAlerts tileAlerts, l<? super MapContentKt.AdditionalContentKt.TileAlertsKt.Dsl, ab> lVar) {
        x.f(tileAlerts, "<this>");
        x.f(lVar, "block");
        MapContentKt.AdditionalContentKt.TileAlertsKt.Dsl.Companion companion = MapContentKt.AdditionalContentKt.TileAlertsKt.Dsl.Companion;
        MapContent.AdditionalContent.TileAlerts.Builder builder = tileAlerts.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.AdditionalContentKt.TileAlertsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.AdditionalContent copy(MapContent.AdditionalContent additionalContent, l<? super MapContentKt.AdditionalContentKt.Dsl, ab> lVar) {
        x.f(additionalContent, "<this>");
        x.f(lVar, "block");
        MapContentKt.AdditionalContentKt.Dsl.Companion companion = MapContentKt.AdditionalContentKt.Dsl.Companion;
        MapContent.AdditionalContent.Builder builder = additionalContent.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.AdditionalContentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment copy(MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment routingArrowOnSegment, l<? super MapContentKt.NavigationContentKt.ShowActiveRouteKt.RoutingArrowOnSegmentKt.Dsl, ab> lVar) {
        x.f(routingArrowOnSegment, "<this>");
        x.f(lVar, "block");
        MapContentKt.NavigationContentKt.ShowActiveRouteKt.RoutingArrowOnSegmentKt.Dsl.Companion companion = MapContentKt.NavigationContentKt.ShowActiveRouteKt.RoutingArrowOnSegmentKt.Dsl.Companion;
        MapContent.NavigationContent.ShowActiveRoute.RoutingArrowOnSegment.Builder builder = routingArrowOnSegment.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.NavigationContentKt.ShowActiveRouteKt.RoutingArrowOnSegmentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.NavigationContent.ShowActiveRoute copy(MapContent.NavigationContent.ShowActiveRoute showActiveRoute, l<? super MapContentKt.NavigationContentKt.ShowActiveRouteKt.Dsl, ab> lVar) {
        x.f(showActiveRoute, "<this>");
        x.f(lVar, "block");
        MapContentKt.NavigationContentKt.ShowActiveRouteKt.Dsl.Companion companion = MapContentKt.NavigationContentKt.ShowActiveRouteKt.Dsl.Companion;
        MapContent.NavigationContent.ShowActiveRoute.Builder builder = showActiveRoute.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.NavigationContentKt.ShowActiveRouteKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent.NavigationContent copy(MapContent.NavigationContent navigationContent, l<? super MapContentKt.NavigationContentKt.Dsl, ab> lVar) {
        x.f(navigationContent, "<this>");
        x.f(lVar, "block");
        MapContentKt.NavigationContentKt.Dsl.Companion companion = MapContentKt.NavigationContentKt.Dsl.Companion;
        MapContent.NavigationContent.Builder builder = navigationContent.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.NavigationContentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapContent copy(MapContent mapContent, l<? super MapContentKt.Dsl, ab> lVar) {
        x.f(mapContent, "<this>");
        x.f(lVar, "block");
        MapContentKt.Dsl.Companion companion = MapContentKt.Dsl.Companion;
        MapContent.Builder builder = mapContent.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapContentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
