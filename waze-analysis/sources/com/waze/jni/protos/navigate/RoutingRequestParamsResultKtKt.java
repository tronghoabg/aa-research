package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingRequestParamsResult;
import com.waze.jni.protos.navigate.RoutingRequestParamsResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingRequestParamsResultKtKt {
    /* renamed from: -initializeroutingRequestParamsResult, reason: not valid java name */
    public static final RoutingRequestParamsResult m27666initializeroutingRequestParamsResult(l<? super RoutingRequestParamsResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoutingRequestParamsResultKt.Dsl.Companion companion = RoutingRequestParamsResultKt.Dsl.Companion;
        RoutingRequestParamsResult.Builder builderNewBuilder = RoutingRequestParamsResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoutingRequestParamsResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingRequestParamsResult copy(RoutingRequestParamsResult routingRequestParamsResult, l<? super RoutingRequestParamsResultKt.Dsl, ab> lVar) {
        x.f(routingRequestParamsResult, "<this>");
        x.f(lVar, "block");
        RoutingRequestParamsResultKt.Dsl.Companion companion = RoutingRequestParamsResultKt.Dsl.Companion;
        RoutingRequestParamsResult.Builder builder = routingRequestParamsResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        RoutingRequestParamsResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
