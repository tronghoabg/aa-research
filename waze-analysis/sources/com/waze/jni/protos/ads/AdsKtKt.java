package com.waze.jni.protos.ads;

import com.waze.jni.protos.ads.Ads;
import com.waze.jni.protos.ads.AdsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdsKtKt {
    /* renamed from: -initializeads, reason: not valid java name */
    public static final Ads m25775initializeads(l<? super AdsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AdsKt.Dsl.Companion companion = AdsKt.Dsl.Companion;
        Ads.Builder builderNewBuilder = Ads.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AdsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Ads.Dialog copy(Ads.Dialog dialog, l<? super AdsKt.DialogKt.Dsl, ab> lVar) {
        x.f(dialog, "<this>");
        x.f(lVar, "block");
        AdsKt.DialogKt.Dsl.Companion companion = AdsKt.DialogKt.Dsl.Companion;
        Ads.Dialog.Builder builder = dialog.toBuilder();
        x.e(builder, "toBuilder(...)");
        AdsKt.DialogKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Ads.Notification copy(Ads.Notification notification, l<? super AdsKt.NotificationKt.Dsl, ab> lVar) {
        x.f(notification, "<this>");
        x.f(lVar, "block");
        AdsKt.NotificationKt.Dsl.Companion companion = AdsKt.NotificationKt.Dsl.Companion;
        Ads.Notification.Builder builder = notification.toBuilder();
        x.e(builder, "toBuilder(...)");
        AdsKt.NotificationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Ads copy(Ads ads, l<? super AdsKt.Dsl, ab> lVar) {
        x.f(ads, "<this>");
        x.f(lVar, "block");
        AdsKt.Dsl.Companion companion = AdsKt.Dsl.Companion;
        Ads.Builder builder = ads.toBuilder();
        x.e(builder, "toBuilder(...)");
        AdsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
