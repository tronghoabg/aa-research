package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelRequest;
import com.waze.jni.protos.EtaLabelRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelRequestKtKt {
    /* renamed from: -initializeetaLabelRequest, reason: not valid java name */
    public static final EtaLabelRequest m25119initializeetaLabelRequest(l<? super EtaLabelRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EtaLabelRequestKt.Dsl.Companion companion = EtaLabelRequestKt.Dsl.Companion;
        EtaLabelRequest.Builder builderNewBuilder = EtaLabelRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EtaLabelRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EtaLabelRequest copy(EtaLabelRequest etaLabelRequest, l<? super EtaLabelRequestKt.Dsl, ab> lVar) {
        x.f(etaLabelRequest, "<this>");
        x.f(lVar, "block");
        EtaLabelRequestKt.Dsl.Companion companion = EtaLabelRequestKt.Dsl.Companion;
        EtaLabelRequest.Builder builder = etaLabelRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        EtaLabelRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EtaLabelData getLabelDataOrNull(EtaLabelRequestOrBuilder etaLabelRequestOrBuilder) {
        x.f(etaLabelRequestOrBuilder, "<this>");
        if (etaLabelRequestOrBuilder.hasLabelData()) {
            return etaLabelRequestOrBuilder.getLabelData();
        }
        return null;
    }

    public static /* synthetic */ void getLabelDataOrNull$annotations(EtaLabelRequestOrBuilder etaLabelRequestOrBuilder) {
    }
}
