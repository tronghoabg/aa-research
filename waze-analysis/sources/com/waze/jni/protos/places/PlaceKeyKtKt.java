package com.waze.jni.protos.places;

import com.waze.jni.protos.places.PlaceKey;
import com.waze.jni.protos.places.PlaceKeyKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlaceKeyKtKt {
    /* renamed from: -initializeplaceKey, reason: not valid java name */
    public static final PlaceKey m28024initializeplaceKey(l<? super PlaceKeyKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PlaceKeyKt.Dsl.Companion companion = PlaceKeyKt.Dsl.Companion;
        PlaceKey.Builder builderNewBuilder = PlaceKey.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PlaceKeyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PlaceKey copy(PlaceKey placeKey, l<? super PlaceKeyKt.Dsl, ab> lVar) {
        x.f(placeKey, "<this>");
        x.f(lVar, "block");
        PlaceKeyKt.Dsl.Companion companion = PlaceKeyKt.Dsl.Companion;
        PlaceKey.Builder builder = placeKey.toBuilder();
        x.e(builder, "toBuilder(...)");
        PlaceKeyKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
