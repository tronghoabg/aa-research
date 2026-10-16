package com.waze.jni.protos.settings;

import com.waze.jni.protos.settings.NotificationCategoryListProto;
import com.waze.jni.protos.settings.NotificationCategoryListProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NotificationCategoryListProtoKtKt {
    /* renamed from: -initializenotificationCategoryListProto, reason: not valid java name */
    public static final NotificationCategoryListProto m28294initializenotificationCategoryListProto(l<? super NotificationCategoryListProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NotificationCategoryListProtoKt.Dsl.Companion companion = NotificationCategoryListProtoKt.Dsl.Companion;
        NotificationCategoryListProto.Builder builderNewBuilder = NotificationCategoryListProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NotificationCategoryListProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NotificationCategoryListProto copy(NotificationCategoryListProto notificationCategoryListProto, l<? super NotificationCategoryListProtoKt.Dsl, ab> lVar) {
        x.f(notificationCategoryListProto, "<this>");
        x.f(lVar, "block");
        NotificationCategoryListProtoKt.Dsl.Companion companion = NotificationCategoryListProtoKt.Dsl.Companion;
        NotificationCategoryListProto.Builder builder = notificationCategoryListProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        NotificationCategoryListProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
