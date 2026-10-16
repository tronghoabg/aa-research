package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.EnrichAlertQuestionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class EnrichAlertQuestionKtKt {
    /* renamed from: -initializeenrichAlertQuestion, reason: not valid java name */
    public static final EnrichAlertQuestion m25953initializeenrichAlertQuestion(l<? super EnrichAlertQuestionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        EnrichAlertQuestionKt.Dsl.Companion companion = EnrichAlertQuestionKt.Dsl.Companion;
        EnrichAlertQuestion.Builder builderNewBuilder = EnrichAlertQuestion.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        EnrichAlertQuestionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion.Answer.BlockedLaneVariant copy(EnrichAlertQuestion.Answer.BlockedLaneVariant blockedLaneVariant, l<? super EnrichAlertQuestionKt.AnswerKt.BlockedLaneVariantKt.Dsl, ab> lVar) {
        x.f(blockedLaneVariant, "<this>");
        x.f(lVar, "block");
        EnrichAlertQuestionKt.AnswerKt.BlockedLaneVariantKt.Dsl.Companion companion = EnrichAlertQuestionKt.AnswerKt.BlockedLaneVariantKt.Dsl.Companion;
        EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builder = blockedLaneVariant.toBuilder();
        x.e(builder, "toBuilder(...)");
        EnrichAlertQuestionKt.AnswerKt.BlockedLaneVariantKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion.Answer.BlockedLaneVariant getBlockedLaneOrNull(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
        x.f(answerOrBuilder, "<this>");
        if (answerOrBuilder.hasBlockedLane()) {
            return answerOrBuilder.getBlockedLane();
        }
        return null;
    }

    public static /* synthetic */ void getBlockedLaneOrNull$annotations(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
    }

    public static final EnrichAlertQuestion.Answer.HazardVariant getHazardOrNull(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
        x.f(answerOrBuilder, "<this>");
        if (answerOrBuilder.hasHazard()) {
            return answerOrBuilder.getHazard();
        }
        return null;
    }

    public static /* synthetic */ void getHazardOrNull$annotations(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
    }

    public static final EnrichAlertQuestion.Answer.NotThereVariant getValidationOrNull(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
        x.f(answerOrBuilder, "<this>");
        if (answerOrBuilder.hasValidation()) {
            return answerOrBuilder.getValidation();
        }
        return null;
    }

    public static /* synthetic */ void getValidationOrNull$annotations(EnrichAlertQuestion.AnswerOrBuilder answerOrBuilder) {
    }

    public static final EnrichAlertQuestion.Answer.HazardVariant copy(EnrichAlertQuestion.Answer.HazardVariant hazardVariant, l<? super EnrichAlertQuestionKt.AnswerKt.HazardVariantKt.Dsl, ab> lVar) {
        x.f(hazardVariant, "<this>");
        x.f(lVar, "block");
        EnrichAlertQuestionKt.AnswerKt.HazardVariantKt.Dsl.Companion companion = EnrichAlertQuestionKt.AnswerKt.HazardVariantKt.Dsl.Companion;
        EnrichAlertQuestion.Answer.HazardVariant.Builder builder = hazardVariant.toBuilder();
        x.e(builder, "toBuilder(...)");
        EnrichAlertQuestionKt.AnswerKt.HazardVariantKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion.Answer.NotThereVariant copy(EnrichAlertQuestion.Answer.NotThereVariant notThereVariant, l<? super EnrichAlertQuestionKt.AnswerKt.NotThereVariantKt.Dsl, ab> lVar) {
        x.f(notThereVariant, "<this>");
        x.f(lVar, "block");
        EnrichAlertQuestionKt.AnswerKt.NotThereVariantKt.Dsl.Companion companion = EnrichAlertQuestionKt.AnswerKt.NotThereVariantKt.Dsl.Companion;
        EnrichAlertQuestion.Answer.NotThereVariant.Builder builder = notThereVariant.toBuilder();
        x.e(builder, "toBuilder(...)");
        EnrichAlertQuestionKt.AnswerKt.NotThereVariantKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion.Answer copy(EnrichAlertQuestion.Answer answer, l<? super EnrichAlertQuestionKt.AnswerKt.Dsl, ab> lVar) {
        x.f(answer, "<this>");
        x.f(lVar, "block");
        EnrichAlertQuestionKt.AnswerKt.Dsl.Companion companion = EnrichAlertQuestionKt.AnswerKt.Dsl.Companion;
        EnrichAlertQuestion.Answer.Builder builder = answer.toBuilder();
        x.e(builder, "toBuilder(...)");
        EnrichAlertQuestionKt.AnswerKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion copy(EnrichAlertQuestion enrichAlertQuestion, l<? super EnrichAlertQuestionKt.Dsl, ab> lVar) {
        x.f(enrichAlertQuestion, "<this>");
        x.f(lVar, "block");
        EnrichAlertQuestionKt.Dsl.Companion companion = EnrichAlertQuestionKt.Dsl.Companion;
        EnrichAlertQuestion.Builder builder = enrichAlertQuestion.toBuilder();
        x.e(builder, "toBuilder(...)");
        EnrichAlertQuestionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
