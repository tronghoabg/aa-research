package com.waze.jni.protos;

import com.waze.jni.protos.RtAlertsThumbsUpDataProto;
import com.waze.jni.protos.RtAlertsThumbsUpDataProtoKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class RtAlertsThumbsUpDataProtoKtKt {
    /* renamed from: -initializertAlertsThumbsUpDataProto, reason: not valid java name */
    public static final RtAlertsThumbsUpDataProto m25580initializertAlertsThumbsUpDataProto(l<? super RtAlertsThumbsUpDataProtoKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        RtAlertsThumbsUpDataProtoKt.Dsl.Companion companion = RtAlertsThumbsUpDataProtoKt.Dsl.Companion;
        RtAlertsThumbsUpDataProto.Builder builderNewBuilder = RtAlertsThumbsUpDataProto.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        RtAlertsThumbsUpDataProtoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final RtAlertsThumbsUpDataProto copy(RtAlertsThumbsUpDataProto rtAlertsThumbsUpDataProto, l<? super RtAlertsThumbsUpDataProtoKt.Dsl, ab> lVar) {
        x.f(rtAlertsThumbsUpDataProto, "<this>");
        x.f(lVar, "block");
        RtAlertsThumbsUpDataProtoKt.Dsl.Companion companion = RtAlertsThumbsUpDataProtoKt.Dsl.Companion;
        RtAlertsThumbsUpDataProto.Builder builder = rtAlertsThumbsUpDataProto.toBuilder();
        x.e(builder, "toBuilder(...)");
        RtAlertsThumbsUpDataProtoKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
