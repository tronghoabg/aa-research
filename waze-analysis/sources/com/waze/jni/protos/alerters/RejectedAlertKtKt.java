package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.RejectedAlert;
import com.waze.jni.protos.alerters.RejectedAlertKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RejectedAlertKtKt {
    /* renamed from: -initializerejectedAlert, reason: not valid java name */
    public static final RejectedAlert m25901initializerejectedAlert(l<? super RejectedAlertKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RejectedAlertKt.Dsl.Companion companion = RejectedAlertKt.Dsl.Companion;
        RejectedAlert.Builder builderNewBuilder = RejectedAlert.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RejectedAlertKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RejectedAlert copy(RejectedAlert rejectedAlert, l<? super RejectedAlertKt.Dsl, ab> lVar) {
        x.f(rejectedAlert, "<this>");
        x.f(lVar, "block");
        RejectedAlertKt.Dsl.Companion companion = RejectedAlertKt.Dsl.Companion;
        RejectedAlert.Builder builder = rejectedAlert.toBuilder();
        x.e(builder, "toBuilder(...)");
        RejectedAlertKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterId getAlertIdOrNull(RejectedAlertOrBuilder rejectedAlertOrBuilder) {
        x.f(rejectedAlertOrBuilder, "<this>");
        if (rejectedAlertOrBuilder.hasAlertId()) {
            return rejectedAlertOrBuilder.getAlertId();
        }
        return null;
    }

    public static /* synthetic */ void getAlertIdOrNull$annotations(RejectedAlertOrBuilder rejectedAlertOrBuilder) {
    }
}
