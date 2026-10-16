package com.waze.jni.protos.reports;

import com.waze.jni.protos.reports.SosProviders;
import com.waze.jni.protos.reports.SosProvidersKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProvidersKtKt {
    /* renamed from: -initializesosProviders, reason: not valid java name */
    public static final SosProviders m28144initializesosProviders(l<? super SosProvidersKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SosProvidersKt.Dsl.Companion companion = SosProvidersKt.Dsl.Companion;
        SosProviders.Builder builderNewBuilder = SosProviders.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SosProvidersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SosProviders copy(SosProviders sosProviders, l<? super SosProvidersKt.Dsl, ab> lVar) {
        x.f(sosProviders, "<this>");
        x.f(lVar, "block");
        SosProvidersKt.Dsl.Companion companion = SosProvidersKt.Dsl.Companion;
        SosProviders.Builder builder = sosProviders.toBuilder();
        x.e(builder, "toBuilder(...)");
        SosProvidersKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
