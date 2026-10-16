package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.TrafficZoneUpdate;
import com.waze.jni.protos.navigate.TrafficZoneUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TrafficZoneUpdateKtKt {
    /* renamed from: -initializetrafficZoneUpdate, reason: not valid java name */
    public static final TrafficZoneUpdate m27799initializetrafficZoneUpdate(l<? super TrafficZoneUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        TrafficZoneUpdateKt.Dsl.Companion companion = TrafficZoneUpdateKt.Dsl.Companion;
        TrafficZoneUpdate.Builder builderNewBuilder = TrafficZoneUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        TrafficZoneUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TrafficZoneUpdate copy(TrafficZoneUpdate trafficZoneUpdate, l<? super TrafficZoneUpdateKt.Dsl, ab> lVar) {
        x.f(trafficZoneUpdate, "<this>");
        x.f(lVar, "block");
        TrafficZoneUpdateKt.Dsl.Companion companion = TrafficZoneUpdateKt.Dsl.Companion;
        TrafficZoneUpdate.Builder builder = trafficZoneUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        TrafficZoneUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
