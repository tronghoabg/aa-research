package com.waze.jni.protos.asks;

import com.google.v.fj;
import com.waze.jni.protos.asks.MultiAskQuestion;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface MultiAskQuestionOrBuilder extends fj {
    MultiAskAnswer getAnswers(int i2);

    int getAnswersCount();

    List<MultiAskAnswer> getAnswersList();

    int getStatsAlertId();

    MultiAskQuestion.QuestionType getType();

    int getTypeValue();
}
