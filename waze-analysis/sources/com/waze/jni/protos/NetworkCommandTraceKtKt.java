package com.waze.jni.protos;

import com.waze.jni.protos.NetworkCommandTrace;
import com.waze.jni.protos.NetworkCommandTraceKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NetworkCommandTraceKtKt {
    /* renamed from: -initializenetworkCommandTrace, reason: not valid java name */
    public static final NetworkCommandTrace m25392initializenetworkCommandTrace(l<? super NetworkCommandTraceKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NetworkCommandTraceKt.Dsl.Companion companion = NetworkCommandTraceKt.Dsl.Companion;
        NetworkCommandTrace.Builder builderNewBuilder = NetworkCommandTrace.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NetworkCommandTraceKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NetworkCommandTrace copy(NetworkCommandTrace networkCommandTrace, l<? super NetworkCommandTraceKt.Dsl, ab> lVar) {
        x.f(networkCommandTrace, "<this>");
        x.f(lVar, "block");
        NetworkCommandTraceKt.Dsl.Companion companion = NetworkCommandTraceKt.Dsl.Companion;
        NetworkCommandTrace.Builder builder = networkCommandTrace.toBuilder();
        x.e(builder, "toBuilder(...)");
        NetworkCommandTraceKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
