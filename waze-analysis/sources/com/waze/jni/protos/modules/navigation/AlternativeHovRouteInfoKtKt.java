package com.waze.jni.protos.modules.navigation;

import com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfo;
import com.waze.jni.protos.modules.navigation.AlternativeHovRouteInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlternativeHovRouteInfoKtKt {
    /* renamed from: -initializealternativeHovRouteInfo, reason: not valid java name */
    public static final AlternativeHovRouteInfo m27052initializealternativeHovRouteInfo(l<? super AlternativeHovRouteInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlternativeHovRouteInfoKt.Dsl.Companion companion = AlternativeHovRouteInfoKt.Dsl.Companion;
        AlternativeHovRouteInfo.Builder builderNewBuilder = AlternativeHovRouteInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlternativeHovRouteInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlternativeHovRouteInfo.HovInfo copy(AlternativeHovRouteInfo.HovInfo hovInfo, l<? super AlternativeHovRouteInfoKt.HovInfoKt.Dsl, ab> lVar) {
        x.f(hovInfo, "<this>");
        x.f(lVar, "block");
        AlternativeHovRouteInfoKt.HovInfoKt.Dsl.Companion companion = AlternativeHovRouteInfoKt.HovInfoKt.Dsl.Companion;
        AlternativeHovRouteInfo.HovInfo.Builder builder = hovInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlternativeHovRouteInfoKt.HovInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlternativeHovRouteInfo.HovInfo getHovInfoOrNull(AlternativeHovRouteInfoOrBuilder alternativeHovRouteInfoOrBuilder) {
        x.f(alternativeHovRouteInfoOrBuilder, "<this>");
        if (alternativeHovRouteInfoOrBuilder.hasHovInfo()) {
            return alternativeHovRouteInfoOrBuilder.getHovInfo();
        }
        return null;
    }

    public static /* synthetic */ void getHovInfoOrNull$annotations(AlternativeHovRouteInfoOrBuilder alternativeHovRouteInfoOrBuilder) {
    }

    public static final AlternativeHovRouteInfo copy(AlternativeHovRouteInfo alternativeHovRouteInfo, l<? super AlternativeHovRouteInfoKt.Dsl, ab> lVar) {
        x.f(alternativeHovRouteInfo, "<this>");
        x.f(lVar, "block");
        AlternativeHovRouteInfoKt.Dsl.Companion companion = AlternativeHovRouteInfoKt.Dsl.Companion;
        AlternativeHovRouteInfo.Builder builder = alternativeHovRouteInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlternativeHovRouteInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
