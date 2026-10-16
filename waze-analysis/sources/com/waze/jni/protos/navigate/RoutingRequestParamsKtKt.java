package com.waze.jni.protos.navigate;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.navigate.RoutingRequestParams;
import com.waze.jni.protos.navigate.RoutingRequestParamsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingRequestParamsKtKt {
    /* renamed from: -initializeroutingRequestParams, reason: not valid java name */
    public static final RoutingRequestParams m27646initializeroutingRequestParams(l<? super RoutingRequestParamsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoutingRequestParamsKt.Dsl.Companion companion = RoutingRequestParamsKt.Dsl.Companion;
        RoutingRequestParams.Builder builderNewBuilder = RoutingRequestParams.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoutingRequestParamsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingRequestParams copy(RoutingRequestParams routingRequestParams, l<? super RoutingRequestParamsKt.Dsl, ab> lVar) {
        x.f(routingRequestParams, "<this>");
        x.f(lVar, "block");
        RoutingRequestParamsKt.Dsl.Companion companion = RoutingRequestParamsKt.Dsl.Companion;
        RoutingRequestParams.Builder builder = routingRequestParams.toBuilder();
        x.e(builder, "toBuilder(...)");
        RoutingRequestParamsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getDestinationOrNull(RoutingRequestParamsOrBuilder routingRequestParamsOrBuilder) {
        x.f(routingRequestParamsOrBuilder, "<this>");
        if (routingRequestParamsOrBuilder.hasDestination()) {
            return routingRequestParamsOrBuilder.getDestination();
        }
        return null;
    }

    public static /* synthetic */ void getDestinationOrNull$annotations(RoutingRequestParamsOrBuilder routingRequestParamsOrBuilder) {
    }

    public static final Position.IntPosition getOriginOrNull(RoutingRequestParamsOrBuilder routingRequestParamsOrBuilder) {
        x.f(routingRequestParamsOrBuilder, "<this>");
        if (routingRequestParamsOrBuilder.hasOrigin()) {
            return routingRequestParamsOrBuilder.getOrigin();
        }
        return null;
    }

    public static /* synthetic */ void getOriginOrNull$annotations(RoutingRequestParamsOrBuilder routingRequestParamsOrBuilder) {
    }
}
