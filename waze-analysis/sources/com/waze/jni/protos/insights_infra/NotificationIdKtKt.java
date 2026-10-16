package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.insights_infra.NotificationId;
import com.waze.jni.protos.insights_infra.NotificationIdKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationIdKtKt {
    /* renamed from: -initializenotificationId, reason: not valid java name */
    public static final NotificationId m26220initializenotificationId(l<? super NotificationIdKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationIdKt.Dsl.Companion companion = NotificationIdKt.Dsl.Companion;
        NotificationId.Builder builderNewBuilder = NotificationId.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationIdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NotificationId copy(NotificationId notificationId, l<? super NotificationIdKt.Dsl, ab> lVar) {
        x.f(notificationId, "<this>");
        x.f(lVar, "block");
        NotificationIdKt.Dsl.Companion companion = NotificationIdKt.Dsl.Companion;
        NotificationId.Builder builder = notificationId.toBuilder();
        x.e(builder, "toBuilder(...)");
        NotificationIdKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
