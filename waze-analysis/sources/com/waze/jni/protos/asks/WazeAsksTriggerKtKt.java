package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.WazeAsksTrigger;
import com.waze.jni.protos.asks.WazeAsksTriggerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeAsksTriggerKtKt {
    /* renamed from: -initializewazeAsksTrigger, reason: not valid java name */
    public static final WazeAsksTrigger m26047initializewazeAsksTrigger(l<? super WazeAsksTriggerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WazeAsksTriggerKt.Dsl.Companion companion = WazeAsksTriggerKt.Dsl.Companion;
        WazeAsksTrigger.Builder builderNewBuilder = WazeAsksTrigger.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WazeAsksTriggerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WazeAsksTrigger copy(WazeAsksTrigger wazeAsksTrigger, l<? super WazeAsksTriggerKt.Dsl, ab> lVar) {
        x.f(wazeAsksTrigger, "<this>");
        x.f(lVar, "block");
        WazeAsksTriggerKt.Dsl.Companion companion = WazeAsksTriggerKt.Dsl.Companion;
        WazeAsksTrigger.Builder builder = wazeAsksTrigger.toBuilder();
        x.e(builder, "toBuilder(...)");
        WazeAsksTriggerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
