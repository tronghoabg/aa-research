package com.waze.jni.protos;

import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.InsightPriorityKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class InsightPriorityKtKt {
    /* renamed from: -initializeinsightPriority, reason: not valid java name */
    public static final InsightPriority m25195initializeinsightPriority(l<? super InsightPriorityKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        InsightPriorityKt.Dsl.Companion companion = InsightPriorityKt.Dsl.Companion;
        InsightPriority.Builder builderNewBuilder = InsightPriority.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        InsightPriorityKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InsightPriority copy(InsightPriority insightPriority, l<? super InsightPriorityKt.Dsl, ab> lVar) {
        x.f(insightPriority, "<this>");
        x.f(lVar, "block");
        InsightPriorityKt.Dsl.Companion companion = InsightPriorityKt.Dsl.Companion;
        InsightPriority.Builder builder = insightPriority.toBuilder();
        x.e(builder, "toBuilder(...)");
        InsightPriorityKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
