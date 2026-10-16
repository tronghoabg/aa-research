package com.waze.jni.protos.map;

import com.waze.jni.protos.map.ZoomLevelDisplayRange;
import com.waze.jni.protos.map.ZoomLevelDisplayRangeKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ZoomLevelDisplayRangeKtKt {
    /* renamed from: -initializezoomLevelDisplayRange, reason: not valid java name */
    public static final ZoomLevelDisplayRange m27028initializezoomLevelDisplayRange(l<? super ZoomLevelDisplayRangeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ZoomLevelDisplayRangeKt.Dsl.Companion companion = ZoomLevelDisplayRangeKt.Dsl.Companion;
        ZoomLevelDisplayRange.Builder builderNewBuilder = ZoomLevelDisplayRange.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ZoomLevelDisplayRangeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ZoomLevelDisplayRange copy(ZoomLevelDisplayRange zoomLevelDisplayRange, l<? super ZoomLevelDisplayRangeKt.Dsl, ab> lVar) {
        x.f(zoomLevelDisplayRange, "<this>");
        x.f(lVar, "block");
        ZoomLevelDisplayRangeKt.Dsl.Companion companion = ZoomLevelDisplayRangeKt.Dsl.Companion;
        ZoomLevelDisplayRange.Builder builder = zoomLevelDisplayRange.toBuilder();
        x.e(builder, "toBuilder(...)");
        ZoomLevelDisplayRangeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
