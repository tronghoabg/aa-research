package com.waze.jni.protos.copilot.data;

import com.waze.jni.protos.copilot.data.AnalyticsSource;
import com.waze.jni.protos.copilot.data.AnalyticsSourceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AnalyticsSourceKtKt {
    /* renamed from: -initializeanalyticsSource, reason: not valid java name */
    public static final AnalyticsSource m26087initializeanalyticsSource(l<? super AnalyticsSourceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AnalyticsSourceKt.Dsl.Companion companion = AnalyticsSourceKt.Dsl.Companion;
        AnalyticsSource.Builder builderNewBuilder = AnalyticsSource.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AnalyticsSourceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AnalyticsSource copy(AnalyticsSource analyticsSource, l<? super AnalyticsSourceKt.Dsl, ab> lVar) {
        x.f(analyticsSource, "<this>");
        x.f(lVar, "block");
        AnalyticsSourceKt.Dsl.Companion companion = AnalyticsSourceKt.Dsl.Companion;
        AnalyticsSource.Builder builder = analyticsSource.toBuilder();
        x.e(builder, "toBuilder(...)");
        AnalyticsSourceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
