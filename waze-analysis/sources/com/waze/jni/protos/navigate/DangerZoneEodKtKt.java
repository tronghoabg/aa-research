package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.DangerZoneEod;
import com.waze.jni.protos.navigate.DangerZoneEodKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DangerZoneEodKtKt {
    /* renamed from: -initializedangerZoneEod, reason: not valid java name */
    public static final DangerZoneEod m27162initializedangerZoneEod(l<? super DangerZoneEodKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DangerZoneEodKt.Dsl.Companion companion = DangerZoneEodKt.Dsl.Companion;
        DangerZoneEod.Builder builderNewBuilder = DangerZoneEod.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DangerZoneEodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DangerZoneEod copy(DangerZoneEod dangerZoneEod, l<? super DangerZoneEodKt.Dsl, ab> lVar) {
        x.f(dangerZoneEod, "<this>");
        x.f(lVar, "block");
        DangerZoneEodKt.Dsl.Companion companion = DangerZoneEodKt.Dsl.Companion;
        DangerZoneEod.Builder builder = dangerZoneEod.toBuilder();
        x.e(builder, "toBuilder(...)");
        DangerZoneEodKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
