package com.waze.map.d;

import android.content.Context;
import android.graphics.Point;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.map.AnimationParams;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.map.ap;
import com.waze.map.aq;
import com.waze.map.ar;
import com.waze.map.as;
import com.waze.map.au;
import com.waze.map.av;
import com.waze.map.aw;
import com.waze.map.ba;
import com.waze.map.bb;
import com.waze.map.bc;
import com.waze.map.cs;
import com.waze.map.gq;
import h.g.b.x;
import h.i;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements ar {

    /* renamed from: a, reason: collision with root package name */
    private final aq f28735a;

    /* renamed from: b, reason: collision with root package name */
    private final ap f28736b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f28737c;

    public f(aq aqVar, ap apVar, ab abVar) {
        x.f(aqVar, "config");
        x.f(apVar, "bitmapResolver");
        x.f(abVar, "mainThreadDispatcher");
        this.f28735a = aqVar;
        this.f28736b = apVar;
        this.f28737c = abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Marker c(Context context, cs csVar) {
        Marker.Priority priority;
        Marker.Alignment alignment;
        Marker.MarkerShowAnimationParams.ShowAnimationType showAnimationType;
        Marker.Builder builderNewBuilder = Marker.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        String strB = csVar.b();
        if (strB == null) {
            strB = "%%-non-clickable-marker-%%";
        }
        builderNewBuilder.setId(strB);
        bc bcVarA = csVar.a();
        aw awVarE = bcVarA.e();
        aw awVar = aw.f27971a;
        as asVar = as.f27959a;
        bb bbVar = bb.f28380a;
        au auVar = au.f27965a;
        int iOrdinal = awVarE.ordinal();
        if (iOrdinal == 0) {
            priority = Marker.Priority.ALERTS;
        } else if (iOrdinal == 1) {
            priority = Marker.Priority.POIS;
        } else if (iOrdinal == 2) {
            priority = Marker.Priority.UNSELECTED_ROUTING_LABEL;
        } else if (iOrdinal == 3) {
            priority = Marker.Priority.SELECTED_ROUTING_LABEL;
        } else if (iOrdinal == 4) {
            priority = Marker.Priority.CLOSURE_PINS;
        } else {
            if (iOrdinal != 5) {
                throw new i();
            }
            priority = Marker.Priority.USER_LOCATION;
        }
        builderNewBuilder.setPriority(priority);
        int iOrdinal2 = bcVarA.c().ordinal();
        if (iOrdinal2 == 0) {
            alignment = Marker.Alignment.TOP_LEFT;
        } else if (iOrdinal2 == 1) {
            alignment = Marker.Alignment.BOTTOM_LEFT;
        } else if (iOrdinal2 == 2) {
            alignment = Marker.Alignment.BOTTOM_RIGHT;
        } else if (iOrdinal2 == 3) {
            alignment = Marker.Alignment.TOP_RIGHT;
        } else {
            if (iOrdinal2 != 4) {
                throw new i();
            }
            alignment = Marker.Alignment.CENTER;
        }
        builderNewBuilder.setAlignment(alignment);
        builderNewBuilder.setPosition(ConversionExtensionsKt.toIntPosition(bcVarA.h()));
        builderNewBuilder.setZoomLevelDisplayRange(gq.a(bcVarA.g()));
        builderNewBuilder.setScale(bcVarA.a());
        av avVarD = bcVarA.d();
        if (avVarD != null) {
            Marker.HitBoxInset.Builder builderNewBuilder2 = Marker.HitBoxInset.newBuilder();
            builderNewBuilder2.setTop(avVarD.d());
            builderNewBuilder2.setBottom(avVarD.a());
            builderNewBuilder2.setLeft(avVarD.b());
            builderNewBuilder2.setRight(avVarD.c());
            Marker.HitBoxInset hitBoxInsetBuild = builderNewBuilder2.build();
            x.e(hitBoxInsetBuild, "build(...)");
            builderNewBuilder.setHitBoxInset(hitBoxInsetBuild);
        }
        Point pointB = bcVarA.b();
        if (pointB != null) {
            ScreenPoint.Builder builderNewBuilder3 = ScreenPoint.newBuilder();
            builderNewBuilder3.setX(pointB.x);
            builderNewBuilder3.setY(pointB.y);
            ScreenPoint screenPointBuild = builderNewBuilder3.build();
            x.e(screenPointBuild, "build(...)");
            builderNewBuilder.setAnchorOffset(screenPointBuild);
        }
        ba baVarF = bcVarA.f();
        if (baVarF != null) {
            int iOrdinal3 = baVarF.b().ordinal();
            if (iOrdinal3 == 0) {
                showAnimationType = Marker.MarkerShowAnimationParams.ShowAnimationType.POP_IN;
            } else {
                if (iOrdinal3 != 1) {
                    throw new i();
                }
                showAnimationType = Marker.MarkerShowAnimationParams.ShowAnimationType.FADE_IN;
            }
            Marker.MarkerShowAnimationParams.Builder builderNewBuilder4 = Marker.MarkerShowAnimationParams.newBuilder();
            builderNewBuilder4.setAnimationType(showAnimationType);
            AnimationParams.Builder builderNewBuilder5 = AnimationParams.newBuilder();
            builderNewBuilder5.setAnimationStartTimeMs(baVarF.a());
            builderNewBuilder5.setAnimationDurationMs(300L);
            builderNewBuilder5.setCurveType(AnimationParams.CurveType.LINEAR);
            builderNewBuilder4.setAnimationParams(builderNewBuilder5);
            Marker.MarkerShowAnimationParams markerShowAnimationParamsBuild = builderNewBuilder4.build();
            x.e(markerShowAnimationParamsBuild, "build(...)");
            builderNewBuilder.setMarkerShowAnimationParams(markerShowAnimationParamsBuild);
        }
        builderNewBuilder.setImage(this.f28736b.a(context, csVar.a().j()));
        Marker markerBuild = builderNewBuilder.build();
        x.e(markerBuild, "build(...)");
        return markerBuild;
    }

    @Override // com.waze.map.ar
    public final Object a(Context context, cs csVar, h.c.e eVar) {
        return this.f28735a.b() ? aj.v(this.f28737c, new e(this, context, csVar, null), eVar) : c(context, csVar);
    }
}
