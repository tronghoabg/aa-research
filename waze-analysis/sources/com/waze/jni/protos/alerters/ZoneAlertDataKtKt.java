package com.waze.jni.protos.alerters;

import com.waze.jni.protos.alerters.ZoneAlertData;
import com.waze.jni.protos.alerters.ZoneAlertDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ZoneAlertDataKtKt {
    /* renamed from: -initializezoneAlertData, reason: not valid java name */
    public static final ZoneAlertData m25908initializezoneAlertData(l<? super ZoneAlertDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ZoneAlertDataKt.Dsl.Companion companion = ZoneAlertDataKt.Dsl.Companion;
        ZoneAlertData.Builder builderNewBuilder = ZoneAlertData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ZoneAlertDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ZoneAlertData copy(ZoneAlertData zoneAlertData, l<? super ZoneAlertDataKt.Dsl, ab> lVar) {
        x.f(zoneAlertData, "<this>");
        x.f(lVar, "block");
        ZoneAlertDataKt.Dsl.Companion companion = ZoneAlertDataKt.Dsl.Companion;
        ZoneAlertData.Builder builder = zoneAlertData.toBuilder();
        x.e(builder, "toBuilder(...)");
        ZoneAlertDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
