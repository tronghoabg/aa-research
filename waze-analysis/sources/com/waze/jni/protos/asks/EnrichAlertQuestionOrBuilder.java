package com.waze.jni.protos.asks;

import com.google.v.fj;
import com.waze.jni.protos.alerters.AlerterType;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public interface EnrichAlertQuestionOrBuilder extends fj {
    EnrichAlertQuestion.Answer getAnswers(int i2);

    int getAnswersCount();

    List<EnrichAlertQuestion.Answer> getAnswersList();

    int getStatsAlertId();

    AlerterType getStatsAlerterType();

    int getStatsAlerterTypeValue();

    EnrichAlertQuestion.QuestionTitleType getTitleType();

    int getTitleTypeValue();
}
