package com.waze.jni.protos.rtalerts;

import com.waze.jni.protos.rtalerts.RtAlertItemList;
import com.waze.jni.protos.rtalerts.RtAlertItemListKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertItemListKtKt {
    /* renamed from: -initializertAlertItemList, reason: not valid java name */
    public static final RtAlertItemList m28247initializertAlertItemList(l<? super RtAlertItemListKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RtAlertItemListKt.Dsl.Companion companion = RtAlertItemListKt.Dsl.Companion;
        RtAlertItemList.Builder builderNewBuilder = RtAlertItemList.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RtAlertItemListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RtAlertItemList copy(RtAlertItemList rtAlertItemList, l<? super RtAlertItemListKt.Dsl, ab> lVar) {
        x.f(rtAlertItemList, "<this>");
        x.f(lVar, "block");
        RtAlertItemListKt.Dsl.Companion companion = RtAlertItemListKt.Dsl.Companion;
        RtAlertItemList.Builder builder = rtAlertItemList.toBuilder();
        x.e(builder, "toBuilder(...)");
        RtAlertItemListKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
