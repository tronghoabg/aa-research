package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.RoutingHeadingData;
import com.waze.jni.protos.navigate.RoutingHeadingDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RoutingHeadingDataKtKt {
    /* renamed from: -initializeroutingHeadingData, reason: not valid java name */
    public static final RoutingHeadingData m27586initializeroutingHeadingData(l<? super RoutingHeadingDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RoutingHeadingDataKt.Dsl.Companion companion = RoutingHeadingDataKt.Dsl.Companion;
        RoutingHeadingData.Builder builderNewBuilder = RoutingHeadingData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RoutingHeadingDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RoutingHeadingData copy(RoutingHeadingData routingHeadingData, l<? super RoutingHeadingDataKt.Dsl, ab> lVar) {
        x.f(routingHeadingData, "<this>");
        x.f(lVar, "block");
        RoutingHeadingDataKt.Dsl.Companion companion = RoutingHeadingDataKt.Dsl.Companion;
        RoutingHeadingData.Builder builder = routingHeadingData.toBuilder();
        x.e(builder, "toBuilder(...)");
        RoutingHeadingDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
