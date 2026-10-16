package com.waze.jni.protos;

import com.waze.jni.protos.NotificationMessage;
import com.waze.jni.protos.NotificationMessageKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationMessageKtKt {
    /* renamed from: -initializenotificationMessage, reason: not valid java name */
    public static final NotificationMessage m25400initializenotificationMessage(l<? super NotificationMessageKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationMessageKt.Dsl.Companion companion = NotificationMessageKt.Dsl.Companion;
        NotificationMessage.Builder builderNewBuilder = NotificationMessage.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationMessageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NotificationMessage copy(NotificationMessage notificationMessage, l<? super NotificationMessageKt.Dsl, ab> lVar) {
        x.f(notificationMessage, "<this>");
        x.f(lVar, "block");
        NotificationMessageKt.Dsl.Companion companion = NotificationMessageKt.Dsl.Companion;
        NotificationMessage.Builder builder = notificationMessage.toBuilder();
        x.e(builder, "toBuilder(...)");
        NotificationMessageKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
