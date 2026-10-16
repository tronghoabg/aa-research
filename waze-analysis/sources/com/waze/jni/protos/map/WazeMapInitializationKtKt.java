package com.waze.jni.protos.map;

import com.waze.jni.protos.map.WazeMapInitialization;
import com.waze.jni.protos.map.WazeMapInitializationKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeMapInitializationKtKt {
    /* renamed from: -initializewazeMapInitialization, reason: not valid java name */
    public static final WazeMapInitialization m27022initializewazeMapInitialization(l<? super WazeMapInitializationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WazeMapInitializationKt.Dsl.Companion companion = WazeMapInitializationKt.Dsl.Companion;
        WazeMapInitialization.Builder builderNewBuilder = WazeMapInitialization.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WazeMapInitializationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WazeMapInitialization copy(WazeMapInitialization wazeMapInitialization, l<? super WazeMapInitializationKt.Dsl, ab> lVar) {
        x.f(wazeMapInitialization, "<this>");
        x.f(lVar, "block");
        WazeMapInitializationKt.Dsl.Companion companion = WazeMapInitializationKt.Dsl.Companion;
        WazeMapInitialization.Builder builder = wazeMapInitialization.toBuilder();
        x.e(builder, "toBuilder(...)");
        WazeMapInitializationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
