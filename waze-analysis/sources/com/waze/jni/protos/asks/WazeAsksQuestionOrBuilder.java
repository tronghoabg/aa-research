package com.waze.jni.protos.asks;

import com.google.v.fj;
import com.google.v.v;
import com.waze.jni.protos.asks.WazeAsksQuestion;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface WazeAsksQuestionOrBuilder extends fj {
    EnrichAlertQuestion getEnrichAlertQuestion();

    String getEntityId();

    v getEntityIdBytes();

    FeedbackQuestion getFeedbackQuestion();

    boolean getIsMock();

    MultiAskQuestion getMultiAskQuestion();

    WazeAsksQuestion.QuestionCase getQuestionCase();

    String getQuestionKey();

    v getQuestionKeyBytes();

    WazeAsksQuestion.WazeAsksQuestionSource getSource();

    int getSourceValue();

    boolean hasEnrichAlertQuestion();

    boolean hasFeedbackQuestion();

    boolean hasMultiAskQuestion();
}
