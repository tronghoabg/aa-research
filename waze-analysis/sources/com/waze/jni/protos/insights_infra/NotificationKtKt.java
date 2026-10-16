package com.waze.jni.protos.insights_infra;

import com.waze.jni.protos.insights_infra.Notification;
import com.waze.jni.protos.insights_infra.NotificationKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationKtKt {
    /* renamed from: -initializenotification, reason: not valid java name */
    public static final Notification m26221initializenotification(l<? super NotificationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationKt.Dsl.Companion companion = NotificationKt.Dsl.Companion;
        Notification.Builder builderNewBuilder = Notification.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Notification copy(Notification notification, l<? super NotificationKt.Dsl, ab> lVar) {
        x.f(notification, "<this>");
        x.f(lVar, "block");
        NotificationKt.Dsl.Companion companion = NotificationKt.Dsl.Companion;
        Notification.Builder builder = notification.toBuilder();
        x.e(builder, "toBuilder(...)");
        NotificationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NotificationId getIdOrNull(NotificationOrBuilder notificationOrBuilder) {
        x.f(notificationOrBuilder, "<this>");
        if (notificationOrBuilder.hasId()) {
            return notificationOrBuilder.getId();
        }
        return null;
    }

    public static /* synthetic */ void getIdOrNull$annotations(NotificationOrBuilder notificationOrBuilder) {
    }
}
