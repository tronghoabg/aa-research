package com.waze.jni.protos.map;

import com.waze.jni.protos.map.EventsOnRoute;
import com.waze.jni.protos.map.EventsOnRouteKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EventsOnRouteKtKt {
    /* renamed from: -initializeeventsOnRoute, reason: not valid java name */
    public static final EventsOnRoute m26438initializeeventsOnRoute(l<? super EventsOnRouteKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EventsOnRouteKt.Dsl.Companion companion = EventsOnRouteKt.Dsl.Companion;
        EventsOnRoute.Builder builderNewBuilder = EventsOnRoute.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EventsOnRouteKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EventsOnRoute.EventOnRouteAnimationParams copy(EventsOnRoute.EventOnRouteAnimationParams eventOnRouteAnimationParams, l<? super EventsOnRouteKt.EventOnRouteAnimationParamsKt.Dsl, ab> lVar) {
        x.f(eventOnRouteAnimationParams, "<this>");
        x.f(lVar, "block");
        EventsOnRouteKt.EventOnRouteAnimationParamsKt.Dsl.Companion companion = EventsOnRouteKt.EventOnRouteAnimationParamsKt.Dsl.Companion;
        EventsOnRoute.EventOnRouteAnimationParams.Builder builder = eventOnRouteAnimationParams.toBuilder();
        x.e(builder, "toBuilder(...)");
        EventsOnRouteKt.EventOnRouteAnimationParamsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EventsOnRoute.EventOnRouteAnimationParams getEventOnRouteAnimationParamsOrNull(EventsOnRouteOrBuilder eventsOnRouteOrBuilder) {
        x.f(eventsOnRouteOrBuilder, "<this>");
        if (eventsOnRouteOrBuilder.hasEventOnRouteAnimationParams()) {
            return eventsOnRouteOrBuilder.getEventOnRouteAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getEventOnRouteAnimationParamsOrNull$annotations(EventsOnRouteOrBuilder eventsOnRouteOrBuilder) {
    }

    public static final EventsOnRoute copy(EventsOnRoute eventsOnRoute, l<? super EventsOnRouteKt.Dsl, ab> lVar) {
        x.f(eventsOnRoute, "<this>");
        x.f(lVar, "block");
        EventsOnRouteKt.Dsl.Companion companion = EventsOnRouteKt.Dsl.Companion;
        EventsOnRoute.Builder builder = eventsOnRoute.toBuilder();
        x.e(builder, "toBuilder(...)");
        EventsOnRouteKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
