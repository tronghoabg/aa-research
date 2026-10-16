package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.FeedbackAnswerKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FeedbackAnswerKtKt {
    /* renamed from: -initializefeedbackAnswer, reason: not valid java name */
    public static final FeedbackAnswer m25960initializefeedbackAnswer(l<? super FeedbackAnswerKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FeedbackAnswerKt.Dsl.Companion companion = FeedbackAnswerKt.Dsl.Companion;
        FeedbackAnswer.Builder builderNewBuilder = FeedbackAnswer.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FeedbackAnswerKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FeedbackAnswer copy(FeedbackAnswer feedbackAnswer, l<? super FeedbackAnswerKt.Dsl, ab> lVar) {
        x.f(feedbackAnswer, "<this>");
        x.f(lVar, "block");
        FeedbackAnswerKt.Dsl.Companion companion = FeedbackAnswerKt.Dsl.Companion;
        FeedbackAnswer.Builder builder = feedbackAnswer.toBuilder();
        x.e(builder, "toBuilder(...)");
        FeedbackAnswerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
