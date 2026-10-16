package com.waze.jni.protos;

import com.waze.jni.protos.CandidateProduct;
import com.waze.jni.protos.CandidateProductKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CandidateProductKtKt {
    /* renamed from: -initializecandidateProduct, reason: not valid java name */
    public static final CandidateProduct m24950initializecandidateProduct(l<? super CandidateProductKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CandidateProductKt.Dsl.Companion companion = CandidateProductKt.Dsl.Companion;
        CandidateProduct.Builder builderNewBuilder = CandidateProduct.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CandidateProductKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CandidateProduct copy(CandidateProduct candidateProduct, l<? super CandidateProductKt.Dsl, ab> lVar) {
        x.f(candidateProduct, "<this>");
        x.f(lVar, "block");
        CandidateProductKt.Dsl.Companion companion = CandidateProductKt.Dsl.Companion;
        CandidateProduct.Builder builder = candidateProduct.toBuilder();
        x.e(builder, "toBuilder(...)");
        CandidateProductKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
