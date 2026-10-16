package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlertValidationResult;
import com.waze.jni.protos.alerters.AlertValidationResultKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlertValidationResultKtKt {
    /* renamed from: -initializealertValidationResult, reason: not valid java name */
    public static final AlertValidationResult m25783initializealertValidationResult(l<? super AlertValidationResultKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlertValidationResultKt.Dsl.Companion companion = AlertValidationResultKt.Dsl.Companion;
        AlertValidationResult.Builder builderNewBuilder = AlertValidationResult.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlertValidationResultKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlertValidationResult copy(AlertValidationResult alertValidationResult, l<? super AlertValidationResultKt.Dsl, ab> lVar) {
        x.f(alertValidationResult, "<this>");
        x.f(lVar, "block");
        AlertValidationResultKt.Dsl.Companion companion = AlertValidationResultKt.Dsl.Companion;
        AlertValidationResult.Builder builder = alertValidationResult.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlertValidationResultKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
