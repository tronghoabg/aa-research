package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.FeedbackQuestion;
import com.waze.jni.protos.asks.FeedbackQuestionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FeedbackQuestionKtKt {
    /* renamed from: -initializefeedbackQuestion, reason: not valid java name */
    public static final FeedbackQuestion m25986initializefeedbackQuestion(l<? super FeedbackQuestionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FeedbackQuestionKt.Dsl.Companion companion = FeedbackQuestionKt.Dsl.Companion;
        FeedbackQuestion.Builder builderNewBuilder = FeedbackQuestion.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FeedbackQuestionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FeedbackQuestion.TriggeredByAlertId copy(FeedbackQuestion.TriggeredByAlertId triggeredByAlertId, l<? super FeedbackQuestionKt.TriggeredByAlertIdKt.Dsl, ab> lVar) {
        x.f(triggeredByAlertId, "<this>");
        x.f(lVar, "block");
        FeedbackQuestionKt.TriggeredByAlertIdKt.Dsl.Companion companion = FeedbackQuestionKt.TriggeredByAlertIdKt.Dsl.Companion;
        FeedbackQuestion.TriggeredByAlertId.Builder builder = triggeredByAlertId.toBuilder();
        x.e(builder, "toBuilder(...)");
        FeedbackQuestionKt.TriggeredByAlertIdKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FeedbackQuestion.TriggeredByAlertId getTriggeredByAlertIdOrNull(FeedbackQuestionOrBuilder feedbackQuestionOrBuilder) {
        x.f(feedbackQuestionOrBuilder, "<this>");
        if (feedbackQuestionOrBuilder.hasTriggeredByAlertId()) {
            return feedbackQuestionOrBuilder.getTriggeredByAlertId();
        }
        return null;
    }

    public static /* synthetic */ void getTriggeredByAlertIdOrNull$annotations(FeedbackQuestionOrBuilder feedbackQuestionOrBuilder) {
    }

    public static final TriggeredBySegmentId getTriggeredBySegmentIdOrNull(FeedbackQuestionOrBuilder feedbackQuestionOrBuilder) {
        x.f(feedbackQuestionOrBuilder, "<this>");
        if (feedbackQuestionOrBuilder.hasTriggeredBySegmentId()) {
            return feedbackQuestionOrBuilder.getTriggeredBySegmentId();
        }
        return null;
    }

    public static /* synthetic */ void getTriggeredBySegmentIdOrNull$annotations(FeedbackQuestionOrBuilder feedbackQuestionOrBuilder) {
    }

    public static final FeedbackQuestion copy(FeedbackQuestion feedbackQuestion, l<? super FeedbackQuestionKt.Dsl, ab> lVar) {
        x.f(feedbackQuestion, "<this>");
        x.f(lVar, "block");
        FeedbackQuestionKt.Dsl.Companion companion = FeedbackQuestionKt.Dsl.Companion;
        FeedbackQuestion.Builder builder = feedbackQuestion.toBuilder();
        x.e(builder, "toBuilder(...)");
        FeedbackQuestionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
