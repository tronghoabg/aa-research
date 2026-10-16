package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelData;
import com.waze.jni.protos.EtaLabelDataKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelDataKtKt {
    /* renamed from: -initializeetaLabelData, reason: not valid java name */
    public static final EtaLabelData m25103initializeetaLabelData(l<? super EtaLabelDataKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EtaLabelDataKt.Dsl.Companion companion = EtaLabelDataKt.Dsl.Companion;
        EtaLabelData.Builder builderNewBuilder = EtaLabelData.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EtaLabelDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EtaLabelData copy(EtaLabelData etaLabelData, l<? super EtaLabelDataKt.Dsl, ab> lVar) {
        x.f(etaLabelData, "<this>");
        x.f(lVar, "block");
        EtaLabelDataKt.Dsl.Companion companion = EtaLabelDataKt.Dsl.Companion;
        EtaLabelData.Builder builder = etaLabelData.toBuilder();
        x.e(builder, "toBuilder(...)");
        EtaLabelDataKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
