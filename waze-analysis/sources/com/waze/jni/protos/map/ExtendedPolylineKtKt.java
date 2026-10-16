package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ExtendedPolyline;
import com.waze.jni.protos.map.ExtendedPolylineKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ExtendedPolylineKtKt {
    /* renamed from: -initializeextendedPolyline, reason: not valid java name */
    public static final ExtendedPolyline m26469initializeextendedPolyline(l<? super ExtendedPolylineKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ExtendedPolylineKt.Dsl.Companion companion = ExtendedPolylineKt.Dsl.Companion;
        ExtendedPolyline.Builder builderNewBuilder = ExtendedPolyline.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ExtendedPolylineKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ExtendedPolyline copy(ExtendedPolyline extendedPolyline, l<? super ExtendedPolylineKt.Dsl, ab> lVar) {
        x.f(extendedPolyline, "<this>");
        x.f(lVar, "block");
        ExtendedPolylineKt.Dsl.Companion companion = ExtendedPolylineKt.Dsl.Companion;
        ExtendedPolyline.Builder builder = extendedPolyline.toBuilder();
        x.e(builder, "toBuilder(...)");
        ExtendedPolylineKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AnimationParams getAnimationParamsOrNull(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
        x.f(extendedPolylineOrBuilder, "<this>");
        if (extendedPolylineOrBuilder.hasAnimationParams()) {
            return extendedPolylineOrBuilder.getAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getAnimationParamsOrNull$annotations(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
    }

    public static final Polyline getPolylineOrNull(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
        x.f(extendedPolylineOrBuilder, "<this>");
        if (extendedPolylineOrBuilder.hasPolyline()) {
            return extendedPolylineOrBuilder.getPolyline();
        }
        return null;
    }

    public static /* synthetic */ void getPolylineOrNull$annotations(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
    }

    public static final ZoomLevelDisplayRange getZoomLevelDisplayRangeOrNull(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
        x.f(extendedPolylineOrBuilder, "<this>");
        if (extendedPolylineOrBuilder.hasZoomLevelDisplayRange()) {
            return extendedPolylineOrBuilder.getZoomLevelDisplayRange();
        }
        return null;
    }

    public static /* synthetic */ void getZoomLevelDisplayRangeOrNull$annotations(ExtendedPolylineOrBuilder extendedPolylineOrBuilder) {
    }
}
