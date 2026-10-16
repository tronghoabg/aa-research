package com.waze.jni.protos;

import com.waze.jni.protos.ConfigManagerJni;
import com.waze.jni.protos.ConfigManagerJniKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ConfigManagerJniKtKt {
    /* renamed from: -initializeconfigManagerJni, reason: not valid java name */
    public static final ConfigManagerJni m25009initializeconfigManagerJni(l<? super ConfigManagerJniKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ConfigManagerJniKt.Dsl.Companion companion = ConfigManagerJniKt.Dsl.Companion;
        ConfigManagerJni.Builder builderNewBuilder = ConfigManagerJni.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ConfigManagerJniKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ConfigManagerJni copy(ConfigManagerJni configManagerJni, l<? super ConfigManagerJniKt.Dsl, ab> lVar) {
        x.f(configManagerJni, "<this>");
        x.f(lVar, "block");
        ConfigManagerJniKt.Dsl.Companion companion = ConfigManagerJniKt.Dsl.Companion;
        ConfigManagerJni.Builder builder = configManagerJni.toBuilder();
        x.e(builder, "toBuilder(...)");
        ConfigManagerJniKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
