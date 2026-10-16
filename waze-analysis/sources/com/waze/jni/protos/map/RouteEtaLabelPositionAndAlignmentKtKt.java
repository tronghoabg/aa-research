package com.waze.jni.protos.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignmentKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RouteEtaLabelPositionAndAlignmentKtKt {
    /* renamed from: -initializerouteEtaLabelPositionAndAlignment, reason: not valid java name */
    public static final RouteEtaLabelPositionAndAlignment m26988initializerouteEtaLabelPositionAndAlignment(l<? super RouteEtaLabelPositionAndAlignmentKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RouteEtaLabelPositionAndAlignmentKt.Dsl.Companion companion = RouteEtaLabelPositionAndAlignmentKt.Dsl.Companion;
        RouteEtaLabelPositionAndAlignment.Builder builderNewBuilder = RouteEtaLabelPositionAndAlignment.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RouteEtaLabelPositionAndAlignmentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RouteEtaLabelPositionAndAlignment copy(RouteEtaLabelPositionAndAlignment routeEtaLabelPositionAndAlignment, l<? super RouteEtaLabelPositionAndAlignmentKt.Dsl, ab> lVar) {
        x.f(routeEtaLabelPositionAndAlignment, "<this>");
        x.f(lVar, "block");
        RouteEtaLabelPositionAndAlignmentKt.Dsl.Companion companion = RouteEtaLabelPositionAndAlignmentKt.Dsl.Companion;
        RouteEtaLabelPositionAndAlignment.Builder builder = routeEtaLabelPositionAndAlignment.toBuilder();
        x.e(builder, "toBuilder(...)");
        RouteEtaLabelPositionAndAlignmentKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(RouteEtaLabelPositionAndAlignmentOrBuilder routeEtaLabelPositionAndAlignmentOrBuilder) {
        x.f(routeEtaLabelPositionAndAlignmentOrBuilder, "<this>");
        if (routeEtaLabelPositionAndAlignmentOrBuilder.hasPosition()) {
            return routeEtaLabelPositionAndAlignmentOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(RouteEtaLabelPositionAndAlignmentOrBuilder routeEtaLabelPositionAndAlignmentOrBuilder) {
    }
}
