package com.waze.jni.protos.alerters;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.alerters.AlerterInfo;
import com.waze.jni.protos.alerters.AlerterInfoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterInfoKtKt {
    /* renamed from: -initializealerterInfo, reason: not valid java name */
    public static final AlerterInfo m25865initializealerterInfo(l<? super AlerterInfoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlerterInfoKt.Dsl.Companion companion = AlerterInfoKt.Dsl.Companion;
        AlerterInfo.Builder builderNewBuilder = AlerterInfo.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlerterInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterInfo copy(AlerterInfo alerterInfo, l<? super AlerterInfoKt.Dsl, ab> lVar) {
        x.f(alerterInfo, "<this>");
        x.f(lVar, "block");
        AlerterInfoKt.Dsl.Companion companion = AlerterInfoKt.Dsl.Companion;
        AlerterInfo.Builder builder = alerterInfo.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlerterInfoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterId getAlertIdOrNull(AlerterInfoOrBuilder alerterInfoOrBuilder) {
        x.f(alerterInfoOrBuilder, "<this>");
        if (alerterInfoOrBuilder.hasAlertId()) {
            return alerterInfoOrBuilder.getAlertId();
        }
        return null;
    }

    public static /* synthetic */ void getAlertIdOrNull$annotations(AlerterInfoOrBuilder alerterInfoOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(AlerterInfoOrBuilder alerterInfoOrBuilder) {
        x.f(alerterInfoOrBuilder, "<this>");
        if (alerterInfoOrBuilder.hasPosition()) {
            return alerterInfoOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(AlerterInfoOrBuilder alerterInfoOrBuilder) {
    }

    public static final AlertValidationResult getValidationResultOrNull(AlerterInfoOrBuilder alerterInfoOrBuilder) {
        x.f(alerterInfoOrBuilder, "<this>");
        if (alerterInfoOrBuilder.hasValidationResult()) {
            return alerterInfoOrBuilder.getValidationResult();
        }
        return null;
    }

    public static /* synthetic */ void getValidationResultOrNull$annotations(AlerterInfoOrBuilder alerterInfoOrBuilder) {
    }
}
