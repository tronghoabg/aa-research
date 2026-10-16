package com.waze.jni.protos;

import com.waze.jni.protos.Reporter;
import com.waze.jni.protos.ReporterKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ReporterKtKt {
    /* renamed from: -initializereporter, reason: not valid java name */
    public static final Reporter m25555initializereporter(l<? super ReporterKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ReporterKt.Dsl.Companion companion = ReporterKt.Dsl.Companion;
        Reporter.Builder builderNewBuilder = Reporter.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ReporterKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Reporter copy(Reporter reporter, l<? super ReporterKt.Dsl, ab> lVar) {
        x.f(reporter, "<this>");
        x.f(lVar, "block");
        ReporterKt.Dsl.Companion companion = ReporterKt.Dsl.Companion;
        Reporter.Builder builder = reporter.toBuilder();
        x.e(builder, "toBuilder(...)");
        ReporterKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
