package com.waze.jni.protos.asks;

import com.google.v.fj;
import com.waze.jni.protos.asks.FeedbackQuestion;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface FeedbackQuestionOrBuilder extends fj {
    FeedbackAnswer getAnswers(int i2);

    int getAnswersCount();

    List<FeedbackAnswer> getAnswersList();

    FeedbackQuestion.TriggeredByAlertId getTriggeredByAlertId();

    FeedbackQuestion.TriggeredByCase getTriggeredByCase();

    TriggeredBySegmentId getTriggeredBySegmentId();

    FeedbackQuestion.FeedbackQuestionType getType();

    int getTypeValue();

    boolean hasTriggeredByAlertId();

    boolean hasTriggeredBySegmentId();
}
