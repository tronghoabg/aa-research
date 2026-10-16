package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.AlerterSubType;
import com.waze.jni.protos.alerters.AlerterSubTypeKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AlerterSubTypeKtKt {
    /* renamed from: -initializealerterSubType, reason: not valid java name */
    public static final AlerterSubType m25867initializealerterSubType(l<? super AlerterSubTypeKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AlerterSubTypeKt.Dsl.Companion companion = AlerterSubTypeKt.Dsl.Companion;
        AlerterSubType.Builder builderNewBuilder = AlerterSubType.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AlerterSubTypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AlerterSubType copy(AlerterSubType alerterSubType, l<? super AlerterSubTypeKt.Dsl, ab> lVar) {
        x.f(alerterSubType, "<this>");
        x.f(lVar, "block");
        AlerterSubTypeKt.Dsl.Companion companion = AlerterSubTypeKt.Dsl.Companion;
        AlerterSubType.Builder builder = alerterSubType.toBuilder();
        x.e(builder, "toBuilder(...)");
        AlerterSubTypeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
