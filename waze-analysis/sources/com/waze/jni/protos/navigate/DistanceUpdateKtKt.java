package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DistanceUpdate;
import com.waze.jni.protos.navigate.DistanceUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DistanceUpdateKtKt {
    /* renamed from: -initializedistanceUpdate, reason: not valid java name */
    public static final DistanceUpdate m27177initializedistanceUpdate(l<? super DistanceUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DistanceUpdateKt.Dsl.Companion companion = DistanceUpdateKt.Dsl.Companion;
        DistanceUpdate.Builder builderNewBuilder = DistanceUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DistanceUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DistanceUpdate copy(DistanceUpdate distanceUpdate, l<? super DistanceUpdateKt.Dsl, ab> lVar) {
        x.f(distanceUpdate, "<this>");
        x.f(lVar, "block");
        DistanceUpdateKt.Dsl.Companion companion = DistanceUpdateKt.Dsl.Companion;
        DistanceUpdate.Builder builder = distanceUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        DistanceUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
