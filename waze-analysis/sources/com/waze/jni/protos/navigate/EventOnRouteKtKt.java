package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.EventOnRoute;
import com.waze.jni.protos.navigate.EventOnRouteKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventOnRouteKtKt {
    /* renamed from: -initializeeventOnRoute, reason: not valid java name */
    public static final EventOnRoute m27215initializeeventOnRoute(l<? super EventOnRouteKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EventOnRouteKt.Dsl.Companion companion = EventOnRouteKt.Dsl.Companion;
        EventOnRoute.Builder builderNewBuilder = EventOnRoute.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EventOnRouteKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EventOnRoute copy(EventOnRoute eventOnRoute, l<? super EventOnRouteKt.Dsl, ab> lVar) {
        x.f(eventOnRoute, "<this>");
        x.f(lVar, "block");
        EventOnRouteKt.Dsl.Companion companion = EventOnRouteKt.Dsl.Companion;
        EventOnRoute.Builder builder = eventOnRoute.toBuilder();
        x.e(builder, "toBuilder(...)");
        EventOnRouteKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PolylineGeometry getGeometryOrNull(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
        x.f(eventOnRouteOrBuilder, "<this>");
        if (eventOnRouteOrBuilder.hasGeometry()) {
            return eventOnRouteOrBuilder.getGeometry();
        }
        return null;
    }

    public static /* synthetic */ void getGeometryOrNull$annotations(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
    }

    public static final Position.IntPosition getLocationOrNull(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
        x.f(eventOnRouteOrBuilder, "<this>");
        if (eventOnRouteOrBuilder.hasLocation()) {
            return eventOnRouteOrBuilder.getLocation();
        }
        return null;
    }

    public static /* synthetic */ void getLocationOrNull$annotations(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
    }

    public static final Position.IntPosition getPosEndOrNull(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
        x.f(eventOnRouteOrBuilder, "<this>");
        if (eventOnRouteOrBuilder.hasPosEnd()) {
            return eventOnRouteOrBuilder.getPosEnd();
        }
        return null;
    }

    public static /* synthetic */ void getPosEndOrNull$annotations(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
    }

    public static final Position.IntPosition getPosStartOrNull(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
        x.f(eventOnRouteOrBuilder, "<this>");
        if (eventOnRouteOrBuilder.hasPosStart()) {
            return eventOnRouteOrBuilder.getPosStart();
        }
        return null;
    }

    public static /* synthetic */ void getPosStartOrNull$annotations(EventOnRouteOrBuilder eventOnRouteOrBuilder) {
    }
}
