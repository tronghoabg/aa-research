package com.waze.jni.protos.map;

import com.waze.jni.protos.NativeBitmap;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.MarkerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MarkerKtKt {
    /* renamed from: -initializemarker, reason: not valid java name */
    public static final Marker m26943initializemarker(l<? super MarkerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MarkerKt.Dsl.Companion companion = MarkerKt.Dsl.Companion;
        Marker.Builder builderNewBuilder = Marker.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MarkerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Marker.HitBoxInset copy(Marker.HitBoxInset hitBoxInset, l<? super MarkerKt.HitBoxInsetKt.Dsl, ab> lVar) {
        x.f(hitBoxInset, "<this>");
        x.f(lVar, "block");
        MarkerKt.HitBoxInsetKt.Dsl.Companion companion = MarkerKt.HitBoxInsetKt.Dsl.Companion;
        Marker.HitBoxInset.Builder builder = hitBoxInset.toBuilder();
        x.e(builder, "toBuilder(...)");
        MarkerKt.HitBoxInsetKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ScreenPoint getAnchorOffsetOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasAnchorOffset()) {
            return markerOrBuilder.getAnchorOffset();
        }
        return null;
    }

    public static /* synthetic */ void getAnchorOffsetOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final AnimationParams getAnimationParamsOrNull(Marker.MarkerHideAnimationParamsOrBuilder markerHideAnimationParamsOrBuilder) {
        x.f(markerHideAnimationParamsOrBuilder, "<this>");
        if (markerHideAnimationParamsOrBuilder.hasAnimationParams()) {
            return markerHideAnimationParamsOrBuilder.getAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getAnimationParamsOrNull$annotations(Marker.MarkerHideAnimationParamsOrBuilder markerHideAnimationParamsOrBuilder) {
    }

    public static final Marker.HitBoxInset getHitBoxInsetOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasHitBoxInset()) {
            return markerOrBuilder.getHitBoxInset();
        }
        return null;
    }

    public static /* synthetic */ void getHitBoxInsetOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final NativeBitmap getImageOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasImage()) {
            return markerOrBuilder.getImage();
        }
        return null;
    }

    public static /* synthetic */ void getImageOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final Marker.MarkerHideAnimationParams getMarkerHideAnimationParamsOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasMarkerHideAnimationParams()) {
            return markerOrBuilder.getMarkerHideAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getMarkerHideAnimationParamsOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final Marker.MarkerShowAnimationParams getMarkerShowAnimationParamsOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasMarkerShowAnimationParams()) {
            return markerOrBuilder.getMarkerShowAnimationParams();
        }
        return null;
    }

    public static /* synthetic */ void getMarkerShowAnimationParamsOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasPosition()) {
            return markerOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static final ZoomLevelDisplayRange getZoomLevelDisplayRangeOrNull(MarkerOrBuilder markerOrBuilder) {
        x.f(markerOrBuilder, "<this>");
        if (markerOrBuilder.hasZoomLevelDisplayRange()) {
            return markerOrBuilder.getZoomLevelDisplayRange();
        }
        return null;
    }

    public static /* synthetic */ void getZoomLevelDisplayRangeOrNull$annotations(MarkerOrBuilder markerOrBuilder) {
    }

    public static /* synthetic */ void getAnimationParamsOrNull$annotations(Marker.MarkerShowAnimationParamsOrBuilder markerShowAnimationParamsOrBuilder) {
    }

    public static final AnimationParams getAnimationParamsOrNull(Marker.MarkerShowAnimationParamsOrBuilder markerShowAnimationParamsOrBuilder) {
        x.f(markerShowAnimationParamsOrBuilder, "<this>");
        if (markerShowAnimationParamsOrBuilder.hasAnimationParams()) {
            return markerShowAnimationParamsOrBuilder.getAnimationParams();
        }
        return null;
    }

    public static final Marker.MarkerHideAnimationParams copy(Marker.MarkerHideAnimationParams markerHideAnimationParams, l<? super MarkerKt.MarkerHideAnimationParamsKt.Dsl, ab> lVar) {
        x.f(markerHideAnimationParams, "<this>");
        x.f(lVar, "block");
        MarkerKt.MarkerHideAnimationParamsKt.Dsl.Companion companion = MarkerKt.MarkerHideAnimationParamsKt.Dsl.Companion;
        Marker.MarkerHideAnimationParams.Builder builder = markerHideAnimationParams.toBuilder();
        x.e(builder, "toBuilder(...)");
        MarkerKt.MarkerHideAnimationParamsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Marker.MarkerShowAnimationParams copy(Marker.MarkerShowAnimationParams markerShowAnimationParams, l<? super MarkerKt.MarkerShowAnimationParamsKt.Dsl, ab> lVar) {
        x.f(markerShowAnimationParams, "<this>");
        x.f(lVar, "block");
        MarkerKt.MarkerShowAnimationParamsKt.Dsl.Companion companion = MarkerKt.MarkerShowAnimationParamsKt.Dsl.Companion;
        Marker.MarkerShowAnimationParams.Builder builder = markerShowAnimationParams.toBuilder();
        x.e(builder, "toBuilder(...)");
        MarkerKt.MarkerShowAnimationParamsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Marker copy(Marker marker, l<? super MarkerKt.Dsl, ab> lVar) {
        x.f(marker, "<this>");
        x.f(lVar, "block");
        MarkerKt.Dsl.Companion companion = MarkerKt.Dsl.Companion;
        Marker.Builder builder = marker.toBuilder();
        x.e(builder, "toBuilder(...)");
        MarkerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
