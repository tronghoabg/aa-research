package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.MultiAskQuestion;
import com.waze.jni.protos.asks.MultiAskQuestionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MultiAskQuestionKtKt {
    /* renamed from: -initializemultiAskQuestion, reason: not valid java name */
    public static final MultiAskQuestion m26006initializemultiAskQuestion(l<? super MultiAskQuestionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MultiAskQuestionKt.Dsl.Companion companion = MultiAskQuestionKt.Dsl.Companion;
        MultiAskQuestion.Builder builderNewBuilder = MultiAskQuestion.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MultiAskQuestionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MultiAskQuestion copy(MultiAskQuestion multiAskQuestion, l<? super MultiAskQuestionKt.Dsl, ab> lVar) {
        x.f(multiAskQuestion, "<this>");
        x.f(lVar, "block");
        MultiAskQuestionKt.Dsl.Companion companion = MultiAskQuestionKt.Dsl.Companion;
        MultiAskQuestion.Builder builder = multiAskQuestion.toBuilder();
        x.e(builder, "toBuilder(...)");
        MultiAskQuestionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
