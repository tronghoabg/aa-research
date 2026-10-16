package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlerterId;
import com.waze.jni.protos.alerters.AlerterIdKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterIdKtKt {
    /* renamed from: -initializealerterId, reason: not valid java name */
    public static final AlerterId m25794initializealerterId(l<? super AlerterIdKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlerterIdKt.Dsl.Companion companion = AlerterIdKt.Dsl.Companion;
        AlerterId.Builder builderNewBuilder = AlerterId.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlerterIdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterId copy(AlerterId alerterId, l<? super AlerterIdKt.Dsl, ab> lVar) {
        x.f(alerterId, "<this>");
        x.f(lVar, "block");
        AlerterIdKt.Dsl.Companion companion = AlerterIdKt.Dsl.Companion;
        AlerterId.Builder builder = alerterId.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlerterIdKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
