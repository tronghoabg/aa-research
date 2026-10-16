package com.waze.jni.protos.reports;

import com.waze.jni.protos.reports.SosProvider;
import com.waze.jni.protos.reports.SosProviderKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class SosProviderKtKt {
    /* renamed from: -initializesosProvider, reason: not valid java name */
    public static final SosProvider m28136initializesosProvider(l<? super SosProviderKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        SosProviderKt.Dsl.Companion companion = SosProviderKt.Dsl.Companion;
        SosProvider.Builder builderNewBuilder = SosProvider.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        SosProviderKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SosProvider copy(SosProvider sosProvider, l<? super SosProviderKt.Dsl, ab> lVar) {
        x.f(sosProvider, "<this>");
        x.f(lVar, "block");
        SosProviderKt.Dsl.Companion companion = SosProviderKt.Dsl.Companion;
        SosProvider.Builder builder = sosProvider.toBuilder();
        x.e(builder, "toBuilder(...)");
        SosProviderKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
