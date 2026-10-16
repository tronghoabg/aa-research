package com.waze.jni.protos.asks;

import com.waze.jni.protos.asks.WazeAsksQuestion;
import com.waze.jni.protos.asks.WazeAsksQuestionKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeAsksQuestionKtKt {
    /* renamed from: -initializewazeAsksQuestion, reason: not valid java name */
    public static final WazeAsksQuestion m26037initializewazeAsksQuestion(l<? super WazeAsksQuestionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        WazeAsksQuestionKt.Dsl.Companion companion = WazeAsksQuestionKt.Dsl.Companion;
        WazeAsksQuestion.Builder builderNewBuilder = WazeAsksQuestion.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        WazeAsksQuestionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WazeAsksQuestion copy(WazeAsksQuestion wazeAsksQuestion, l<? super WazeAsksQuestionKt.Dsl, ab> lVar) {
        x.f(wazeAsksQuestion, "<this>");
        x.f(lVar, "block");
        WazeAsksQuestionKt.Dsl.Companion companion = WazeAsksQuestionKt.Dsl.Companion;
        WazeAsksQuestion.Builder builder = wazeAsksQuestion.toBuilder();
        x.e(builder, "toBuilder(...)");
        WazeAsksQuestionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnrichAlertQuestion getEnrichAlertQuestionOrNull(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
        x.f(wazeAsksQuestionOrBuilder, "<this>");
        if (wazeAsksQuestionOrBuilder.hasEnrichAlertQuestion()) {
            return wazeAsksQuestionOrBuilder.getEnrichAlertQuestion();
        }
        return null;
    }

    public static /* synthetic */ void getEnrichAlertQuestionOrNull$annotations(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
    }

    public static final FeedbackQuestion getFeedbackQuestionOrNull(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
        x.f(wazeAsksQuestionOrBuilder, "<this>");
        if (wazeAsksQuestionOrBuilder.hasFeedbackQuestion()) {
            return wazeAsksQuestionOrBuilder.getFeedbackQuestion();
        }
        return null;
    }

    public static /* synthetic */ void getFeedbackQuestionOrNull$annotations(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
    }

    public static final MultiAskQuestion getMultiAskQuestionOrNull(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
        x.f(wazeAsksQuestionOrBuilder, "<this>");
        if (wazeAsksQuestionOrBuilder.hasMultiAskQuestion()) {
            return wazeAsksQuestionOrBuilder.getMultiAskQuestion();
        }
        return null;
    }

    public static /* synthetic */ void getMultiAskQuestionOrNull$annotations(WazeAsksQuestionOrBuilder wazeAsksQuestionOrBuilder) {
    }
}
