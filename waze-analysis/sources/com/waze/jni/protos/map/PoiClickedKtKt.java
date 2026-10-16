package com.waze.jni.protos.map;

import com.waze.jni.protos.map.PoiClicked;
import com.waze.jni.protos.map.PoiClickedKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PoiClickedKtKt {
    /* renamed from: -initializepoiClicked, reason: not valid java name */
    public static final PoiClicked m26948initializepoiClicked(l<? super PoiClickedKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PoiClickedKt.Dsl.Companion companion = PoiClickedKt.Dsl.Companion;
        PoiClicked.Builder builderNewBuilder = PoiClicked.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PoiClickedKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PoiClicked copy(PoiClicked poiClicked, l<? super PoiClickedKt.Dsl, ab> lVar) {
        x.f(poiClicked, "<this>");
        x.f(lVar, "block");
        PoiClickedKt.Dsl.Companion companion = PoiClickedKt.Dsl.Companion;
        PoiClicked.Builder builder = poiClicked.toBuilder();
        x.e(builder, "toBuilder(...)");
        PoiClickedKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
