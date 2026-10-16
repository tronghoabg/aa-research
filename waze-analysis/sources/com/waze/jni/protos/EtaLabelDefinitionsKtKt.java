package com.waze.jni.protos;

import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.EtaLabelDefinitionsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EtaLabelDefinitionsKtKt {
    /* renamed from: -initializeetaLabelDefinitions, reason: not valid java name */
    public static final EtaLabelDefinitions m25105initializeetaLabelDefinitions(l<? super EtaLabelDefinitionsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EtaLabelDefinitionsKt.Dsl.Companion companion = EtaLabelDefinitionsKt.Dsl.Companion;
        EtaLabelDefinitions.Builder builderNewBuilder = EtaLabelDefinitions.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EtaLabelDefinitionsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EtaLabelDefinitions copy(EtaLabelDefinitions etaLabelDefinitions, l<? super EtaLabelDefinitionsKt.Dsl, ab> lVar) {
        x.f(etaLabelDefinitions, "<this>");
        x.f(lVar, "block");
        EtaLabelDefinitionsKt.Dsl.Companion companion = EtaLabelDefinitionsKt.Dsl.Companion;
        EtaLabelDefinitions.Builder builder = etaLabelDefinitions.toBuilder();
        x.e(builder, "toBuilder(...)");
        EtaLabelDefinitionsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
