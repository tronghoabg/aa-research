package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.MultiAskAnswer;
import com.waze.jni.protos.asks.MultiAskAnswerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MultiAskAnswerKtKt {
    /* renamed from: -initializemultiAskAnswer, reason: not valid java name */
    public static final MultiAskAnswer m25993initializemultiAskAnswer(l<? super MultiAskAnswerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MultiAskAnswerKt.Dsl.Companion companion = MultiAskAnswerKt.Dsl.Companion;
        MultiAskAnswer.Builder builderNewBuilder = MultiAskAnswer.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MultiAskAnswerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MultiAskAnswer copy(MultiAskAnswer multiAskAnswer, l<? super MultiAskAnswerKt.Dsl, ab> lVar) {
        x.f(multiAskAnswer, "<this>");
        x.f(lVar, "block");
        MultiAskAnswerKt.Dsl.Companion companion = MultiAskAnswerKt.Dsl.Companion;
        MultiAskAnswer.Builder builder = multiAskAnswer.toBuilder();
        x.e(builder, "toBuilder(...)");
        MultiAskAnswerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
