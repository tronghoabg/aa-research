package com.waze.jni.protos.rtalerts;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.jni.protos.rtalerts.RtAlertItemKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItemKtKt {
    /* renamed from: -initializertAlertItem, reason: not valid java name */
    public static final RtAlertItem m28239initializertAlertItem(l<? super RtAlertItemKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RtAlertItemKt.Dsl.Companion companion = RtAlertItemKt.Dsl.Companion;
        RtAlertItem.Builder builderNewBuilder = RtAlertItem.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RtAlertItemKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RtAlertItem copy(RtAlertItem rtAlertItem, l<? super RtAlertItemKt.Dsl, ab> lVar) {
        x.f(rtAlertItem, "<this>");
        x.f(lVar, "block");
        RtAlertItemKt.Dsl.Companion companion = RtAlertItemKt.Dsl.Companion;
        RtAlertItem.Builder builder = rtAlertItem.toBuilder();
        x.e(builder, "toBuilder(...)");
        RtAlertItemKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
