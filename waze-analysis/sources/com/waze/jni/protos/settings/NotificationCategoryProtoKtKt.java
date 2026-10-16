package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.NotificationCategoryProto;
import com.waze.jni.protos.settings.NotificationCategoryProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationCategoryProtoKtKt {
    /* renamed from: -initializenotificationCategoryProto, reason: not valid java name */
    public static final NotificationCategoryProto m28307initializenotificationCategoryProto(l<? super NotificationCategoryProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationCategoryProtoKt.Dsl.Companion companion = NotificationCategoryProtoKt.Dsl.Companion;
        NotificationCategoryProto.Builder builderNewBuilder = NotificationCategoryProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationCategoryProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NotificationCategoryProto copy(NotificationCategoryProto notificationCategoryProto, l<? super NotificationCategoryProtoKt.Dsl, ab> lVar) {
        x.f(notificationCategoryProto, "<this>");
        x.f(lVar, "block");
        NotificationCategoryProtoKt.Dsl.Companion companion = NotificationCategoryProtoKt.Dsl.Companion;
        NotificationCategoryProto.Builder builder = notificationCategoryProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        NotificationCategoryProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
