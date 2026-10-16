package com.waze.jni.protos.map;

import com.waze.jni.protos.map.RouteOption;
import com.waze.jni.protos.map.RouteOptionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteOptionKtKt {
    /* renamed from: -initializerouteOption, reason: not valid java name */
    public static final RouteOption m26995initializerouteOption(l<? super RouteOptionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteOptionKt.Dsl.Companion companion = RouteOptionKt.Dsl.Companion;
        RouteOption.Builder builderNewBuilder = RouteOption.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteOption copy(RouteOption routeOption, l<? super RouteOptionKt.Dsl, ab> lVar) {
        x.f(routeOption, "<this>");
        x.f(lVar, "block");
        RouteOptionKt.Dsl.Companion companion = RouteOptionKt.Dsl.Companion;
        RouteOption.Builder builder = routeOption.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteOptionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
