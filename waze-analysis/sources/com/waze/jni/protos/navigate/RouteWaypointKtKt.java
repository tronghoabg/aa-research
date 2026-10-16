package com.waze.jni.protos.navigate;

import com.google.v.ec;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.RouteWaypoint;
import com.waze.jni.protos.navigate.RouteWaypointKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteWaypointKtKt {
    /* renamed from: -initializerouteWaypoint, reason: not valid java name */
    public static final RouteWaypoint m27582initializerouteWaypoint(l<? super RouteWaypointKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteWaypointKt.Dsl.Companion companion = RouteWaypointKt.Dsl.Companion;
        RouteWaypoint.Builder builderNewBuilder = RouteWaypoint.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteWaypointKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteWaypoint copy(RouteWaypoint routeWaypoint, l<? super RouteWaypointKt.Dsl, ab> lVar) {
        x.f(routeWaypoint, "<this>");
        x.f(lVar, "block");
        RouteWaypointKt.Dsl.Companion companion = RouteWaypointKt.Dsl.Companion;
        RouteWaypoint.Builder builder = routeWaypoint.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteWaypointKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getCoordinateOrNull(RouteWaypointOrBuilder routeWaypointOrBuilder) {
        x.f(routeWaypointOrBuilder, "<this>");
        if (routeWaypointOrBuilder.hasCoordinate()) {
            return routeWaypointOrBuilder.getCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getCoordinateOrNull$annotations(RouteWaypointOrBuilder routeWaypointOrBuilder) {
    }

    public static final ec getDistanceToWaypointMetersOrNull(RouteWaypointOrBuilder routeWaypointOrBuilder) {
        x.f(routeWaypointOrBuilder, "<this>");
        if (routeWaypointOrBuilder.hasDistanceToWaypointMeters()) {
            return routeWaypointOrBuilder.getDistanceToWaypointMeters();
        }
        return null;
    }

    public static /* synthetic */ void getDistanceToWaypointMetersOrNull$annotations(RouteWaypointOrBuilder routeWaypointOrBuilder) {
    }

    public static final ec getSecondsToWaypointOrNull(RouteWaypointOrBuilder routeWaypointOrBuilder) {
        x.f(routeWaypointOrBuilder, "<this>");
        if (routeWaypointOrBuilder.hasSecondsToWaypoint()) {
            return routeWaypointOrBuilder.getSecondsToWaypoint();
        }
        return null;
    }

    public static /* synthetic */ void getSecondsToWaypointOrNull$annotations(RouteWaypointOrBuilder routeWaypointOrBuilder) {
    }
}
