package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelResponse;
import com.waze.jni.protos.EtaLabelResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelResponseKtKt {
    /* renamed from: -initializeetaLabelResponse, reason: not valid java name */
    public static final EtaLabelResponse m25129initializeetaLabelResponse(l<? super EtaLabelResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EtaLabelResponseKt.Dsl.Companion companion = EtaLabelResponseKt.Dsl.Companion;
        EtaLabelResponse.Builder builderNewBuilder = EtaLabelResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EtaLabelResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EtaLabelResponse copy(EtaLabelResponse etaLabelResponse, l<? super EtaLabelResponseKt.Dsl, ab> lVar) {
        x.f(etaLabelResponse, "<this>");
        x.f(lVar, "block");
        EtaLabelResponseKt.Dsl.Companion companion = EtaLabelResponseKt.Dsl.Companion;
        EtaLabelResponse.Builder builder = etaLabelResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        EtaLabelResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
