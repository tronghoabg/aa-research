package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedRouteData;
import com.waze.jni.protos.map.ExtendedRouteDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import i.b.l.sl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedRouteDataKtKt {
    /* renamed from: -initializeextendedRouteData, reason: not valid java name */
    public static final ExtendedRouteData m26488initializeextendedRouteData(l<? super ExtendedRouteDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ExtendedRouteDataKt.Dsl.Companion companion = ExtendedRouteDataKt.Dsl.Companion;
        ExtendedRouteData.Builder builderNewBuilder = ExtendedRouteData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ExtendedRouteDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ExtendedRouteData.RouteStyle copy(ExtendedRouteData.RouteStyle routeStyle, l<? super ExtendedRouteDataKt.RouteStyleKt.Dsl, ab> lVar) {
        x.f(routeStyle, "<this>");
        x.f(lVar, "block");
        ExtendedRouteDataKt.RouteStyleKt.Dsl.Companion companion = ExtendedRouteDataKt.RouteStyleKt.Dsl.Companion;
        ExtendedRouteData.RouteStyle.Builder builder = routeStyle.toBuilder();
        x.e(builder, "toBuilder(...)");
        ExtendedRouteDataKt.RouteStyleKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AnimationParams getAnimationParamsOrNull(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
        x.f(extendedRouteDataOrBuilder, "<this>");
        if (extendedRouteDataOrBuilder.hasAnimationParams()) {
            return extendedRouteDataOrBuilder.getAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getAnimationParamsOrNull$annotations(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
    }

    public static final RouteOption getOptionsOrNull(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
        x.f(extendedRouteDataOrBuilder, "<this>");
        if (extendedRouteDataOrBuilder.hasOptions()) {
            return extendedRouteDataOrBuilder.getOptions();
        }
        return null;
    }

    public static /* synthetic */ void getOptionsOrNull$annotations(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
    }

    public static final sl getRouteProtoOrNull(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
        x.f(extendedRouteDataOrBuilder, "<this>");
        if (extendedRouteDataOrBuilder.hasRouteProto()) {
            return extendedRouteDataOrBuilder.getRouteProto();
        }
        return null;
    }

    public static /* synthetic */ void getRouteProtoOrNull$annotations(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
    }

    public static final ExtendedRouteData.RouteStyle getStyleOrNull(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
        x.f(extendedRouteDataOrBuilder, "<this>");
        if (extendedRouteDataOrBuilder.hasStyle()) {
            return extendedRouteDataOrBuilder.getStyle();
        }
        return null;
    }

    public static /* synthetic */ void getStyleOrNull$annotations(ExtendedRouteDataOrBuilder extendedRouteDataOrBuilder) {
    }

    public static final ExtendedRouteData copy(ExtendedRouteData extendedRouteData, l<? super ExtendedRouteDataKt.Dsl, ab> lVar) {
        x.f(extendedRouteData, "<this>");
        x.f(lVar, "block");
        ExtendedRouteDataKt.Dsl.Companion companion = ExtendedRouteDataKt.Dsl.Companion;
        ExtendedRouteData.Builder builder = extendedRouteData.toBuilder();
        x.e(builder, "toBuilder(...)");
        ExtendedRouteDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
