package com.waze.jni.protos;

import com.waze.jni.protos.WazeApplicationInfo;
import com.waze.jni.protos.WazeApplicationInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeApplicationInfoKtKt {
    /* renamed from: -initializewazeApplicationInfo, reason: not valid java name */
    public static final WazeApplicationInfo m25769initializewazeApplicationInfo(l<? super WazeApplicationInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WazeApplicationInfoKt.Dsl.Companion companion = WazeApplicationInfoKt.Dsl.Companion;
        WazeApplicationInfo.Builder builderNewBuilder = WazeApplicationInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WazeApplicationInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WazeApplicationInfo copy(WazeApplicationInfo wazeApplicationInfo, l<? super WazeApplicationInfoKt.Dsl, ab> lVar) {
        x.f(wazeApplicationInfo, "<this>");
        x.f(lVar, "block");
        WazeApplicationInfoKt.Dsl.Companion companion = WazeApplicationInfoKt.Dsl.Companion;
        WazeApplicationInfo.Builder builder = wazeApplicationInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        WazeApplicationInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
