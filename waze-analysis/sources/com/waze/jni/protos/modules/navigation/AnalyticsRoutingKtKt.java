package com.waze.jni.protos.modules.navigation;

import com.waze.jni.protos.modules.navigation.AnalyticsRouting;
import com.waze.jni.protos.modules.navigation.AnalyticsRoutingKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnalyticsRoutingKtKt {
    /* renamed from: -initializeanalyticsRouting, reason: not valid java name */
    public static final AnalyticsRouting m27054initializeanalyticsRouting(l<? super AnalyticsRoutingKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AnalyticsRoutingKt.Dsl.Companion companion = AnalyticsRoutingKt.Dsl.Companion;
        AnalyticsRouting.Builder builderNewBuilder = AnalyticsRouting.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AnalyticsRoutingKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AnalyticsRouting copy(AnalyticsRouting analyticsRouting, l<? super AnalyticsRoutingKt.Dsl, ab> lVar) {
        x.f(analyticsRouting, "<this>");
        x.f(lVar, "block");
        AnalyticsRoutingKt.Dsl.Companion companion = AnalyticsRoutingKt.Dsl.Companion;
        AnalyticsRouting.Builder builder = analyticsRouting.toBuilder();
        x.e(builder, "toBuilder(...)");
        AnalyticsRoutingKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
