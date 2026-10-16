package com.waze.jni.protos;

import com.waze.jni.protos.RouteSegment;
import com.waze.jni.protos.RouteSegmentKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteSegmentKtKt {
    /* renamed from: -initializerouteSegment, reason: not valid java name */
    public static final RouteSegment m25562initializerouteSegment(l<? super RouteSegmentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteSegmentKt.Dsl.Companion companion = RouteSegmentKt.Dsl.Companion;
        RouteSegment.Builder builderNewBuilder = RouteSegment.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteSegmentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteSegment copy(RouteSegment routeSegment, l<? super RouteSegmentKt.Dsl, ab> lVar) {
        x.f(routeSegment, "<this>");
        x.f(lVar, "block");
        RouteSegmentKt.Dsl.Companion companion = RouteSegmentKt.Dsl.Companion;
        RouteSegment.Builder builder = routeSegment.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteSegmentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NavigationInstruction getInstructionOrNull(RouteSegmentOrBuilder routeSegmentOrBuilder) {
        x.f(routeSegmentOrBuilder, "<this>");
        if (routeSegmentOrBuilder.hasInstruction()) {
            return routeSegmentOrBuilder.getInstruction();
        }
        return null;
    }

    public static /* synthetic */ void getInstructionOrNull$annotations(RouteSegmentOrBuilder routeSegmentOrBuilder) {
    }
}
