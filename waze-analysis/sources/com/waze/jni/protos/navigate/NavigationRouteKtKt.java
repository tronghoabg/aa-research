package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.NavigationRoute;
import com.waze.jni.protos.navigate.NavigationRouteKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NavigationRouteKtKt {
    /* renamed from: -initializenavigationRoute, reason: not valid java name */
    public static final NavigationRoute m27388initializenavigationRoute(l<? super NavigationRouteKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NavigationRouteKt.Dsl.Companion companion = NavigationRouteKt.Dsl.Companion;
        NavigationRoute.Builder builderNewBuilder = NavigationRoute.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NavigationRouteKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationRoute copy(NavigationRoute navigationRoute, l<? super NavigationRouteKt.Dsl, ab> lVar) {
        x.f(navigationRoute, "<this>");
        x.f(lVar, "block");
        NavigationRouteKt.Dsl.Companion companion = NavigationRouteKt.Dsl.Companion;
        NavigationRoute.Builder builder = navigationRoute.toBuilder();
        x.e(builder, "toBuilder(...)");
        NavigationRouteKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PolylineGeometry getGeometryOrNull(NavigationRouteOrBuilder navigationRouteOrBuilder) {
        x.f(navigationRouteOrBuilder, "<this>");
        if (navigationRouteOrBuilder.hasGeometry()) {
            return navigationRouteOrBuilder.getGeometry();
        }
        return null;
    }

    public static /* synthetic */ void getGeometryOrNull$annotations(NavigationRouteOrBuilder navigationRouteOrBuilder) {
    }

    public static final RoutingPopup getPopupOrNull(NavigationRouteOrBuilder navigationRouteOrBuilder) {
        x.f(navigationRouteOrBuilder, "<this>");
        if (navigationRouteOrBuilder.hasPopup()) {
            return navigationRouteOrBuilder.getPopup();
        }
        return null;
    }

    public static /* synthetic */ void getPopupOrNull$annotations(NavigationRouteOrBuilder navigationRouteOrBuilder) {
    }
}
