package com.waze.asks;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.MultiAskAnswer;
import com.waze.jni.protos.asks.WazeAsksQuestion;
import com.waze.jni.protos.asks.WazeAsksTrigger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class ar {
    public static final int $stable = 0;

    static final void launchWazeAsksJNI$lambda$0(ar arVar, WazeAsksQuestion wazeAsksQuestion) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        h.g.b.x.c(wazeAsksQuestion);
        ((WazeAsksNativeManager) arVar).launchWazeAsks(wazeAsksQuestion);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onQuestionShown$default(ar arVar, WazeAsksQuestion wazeAsksQuestion, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onQuestionShown");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        arVar.onQuestionShown(wazeAsksQuestion, lVar);
    }

    static final h.ab onQuestionShown$lambda$0(ar arVar, WazeAsksQuestion wazeAsksQuestion) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        byte[] byteArray = wazeAsksQuestion.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        ((WazeAsksNativeManager) arVar).onQuestionShownNTV(byteArray);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeReportById$default(ar arVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeReportById");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        arVar.removeReportById(i2, lVar);
    }

    static final h.ab removeReportById$lambda$0(ar arVar, int i2) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        ((WazeAsksNativeManager) arVar).removeReportByIdNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendEnrichAlertAnswer$default(ar arVar, WazeAsksQuestion wazeAsksQuestion, EnrichAlertQuestion.Answer answer, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendEnrichAlertAnswer");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        arVar.sendEnrichAlertAnswer(wazeAsksQuestion, answer, lVar);
    }

    static final h.ab sendEnrichAlertAnswer$lambda$0(ar arVar, WazeAsksQuestion wazeAsksQuestion, EnrichAlertQuestion.Answer answer) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        byte[] byteArray = wazeAsksQuestion.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = answer.toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        ((WazeAsksNativeManager) arVar).sendEnrichAlertAnswerNTV(byteArray, byteArray2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendFeedbackAnswer$default(ar arVar, WazeAsksQuestion wazeAsksQuestion, FeedbackAnswer feedbackAnswer, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendFeedbackAnswer");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        arVar.sendFeedbackAnswer(wazeAsksQuestion, feedbackAnswer, lVar);
    }

    static final h.ab sendFeedbackAnswer$lambda$0(ar arVar, WazeAsksQuestion wazeAsksQuestion, FeedbackAnswer feedbackAnswer) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        byte[] byteArray = wazeAsksQuestion.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = feedbackAnswer.toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        ((WazeAsksNativeManager) arVar).sendFeedbackAnswerNTV(byteArray, byteArray2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendMultiAskAnswer$default(ar arVar, WazeAsksQuestion wazeAsksQuestion, MultiAskAnswer multiAskAnswer, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMultiAskAnswer");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        arVar.sendMultiAskAnswer(wazeAsksQuestion, multiAskAnswer, lVar);
    }

    static final h.ab sendMultiAskAnswer$lambda$0(ar arVar, WazeAsksQuestion wazeAsksQuestion, MultiAskAnswer multiAskAnswer) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        byte[] byteArray = wazeAsksQuestion.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = multiAskAnswer.toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        ((WazeAsksNativeManager) arVar).sendMultiAskAnswerNTV(byteArray, byteArray2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTriggerByQuestionFailed$default(ar arVar, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTriggerByQuestionFailed");
        }
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        arVar.setTriggerByQuestionFailed(i2, lVar);
    }

    static final h.ab setTriggerByQuestionFailed$lambda$0(ar arVar, int i2) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        ((WazeAsksNativeManager) arVar).setTriggerByQuestionFailedNTV(i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTriggerByQuestionResult$default(ar arVar, com.waze.ap.a.a.ai aiVar, WazeAsksTrigger wazeAsksTrigger, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTriggerByQuestionResult");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        arVar.setTriggerByQuestionResult(aiVar, wazeAsksTrigger, lVar);
    }

    static final h.ab setTriggerByQuestionResult$lambda$0(ar arVar, com.waze.ap.a.a.ai aiVar, WazeAsksTrigger wazeAsksTrigger) {
        h.g.b.x.d(arVar, "null cannot be cast to non-null type com.waze.asks.WazeAsksNativeManager");
        byte[] byteArray = aiVar.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] byteArray2 = wazeAsksTrigger.toByteArray();
        h.g.b.x.e(byteArray2, "toByteArray(...)");
        ((WazeAsksNativeManager) arVar).setTriggerByQuestionResultNTV(byteArray, byteArray2);
        return null;
    }

    public abstract void launchWazeAsks(WazeAsksQuestion wazeAsksQuestion);

    protected final void launchWazeAsksJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "questionProto");
        try {
            final WazeAsksQuestion wazeAsksQuestion = (WazeAsksQuestion) WazeAsksQuestion.parser().c(bArr);
            NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.asks.am
                @Override // java.lang.Runnable
                public final void run() {
                    ar.launchWazeAsksJNI$lambda$0(this.f15508a, wazeAsksQuestion);
                }
            });
        } catch (eu unused) {
        }
    }

    protected final void loadQuestionByTriggerJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "triggerProto");
        try {
            WazeAsksTrigger wazeAsksTrigger = (WazeAsksTrigger) WazeAsksTrigger.parser().c(bArr);
            h.g.b.x.c(wazeAsksTrigger);
            ((WazeAsksNativeManager) this).loadQuestionByTrigger$third_party_waze_client_android_project_waze_src_main_waze(wazeAsksTrigger);
        } catch (eu unused) {
        }
    }

    public void onQuestionShown(final WazeAsksQuestion wazeAsksQuestion, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        NativeManager.runNativeTask(new hw() { // from class: com.waze.asks.ap
            @Override // com.waze.hw
            public final Object a() {
                ar.onQuestionShown$lambda$0(this.f15516a, wazeAsksQuestion);
                return null;
            }
        }, lVar != null ? new an(lVar, 5) : null);
    }

    public void removeReportById(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new aq(this, i2, 1), lVar != null ? new an(lVar, 4) : null);
    }

    public void sendEnrichAlertAnswer(WazeAsksQuestion wazeAsksQuestion, EnrichAlertQuestion.Answer answer, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(answer, "answer");
        NativeManager.runNativeTask(new ao(this, wazeAsksQuestion, answer, 3), lVar != null ? new an(lVar, 6) : null);
    }

    public void sendFeedbackAnswer(WazeAsksQuestion wazeAsksQuestion, FeedbackAnswer feedbackAnswer, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(feedbackAnswer, "answer");
        NativeManager.runNativeTask(new ao(this, wazeAsksQuestion, feedbackAnswer, 0), lVar != null ? new an(lVar, 2) : null);
    }

    public void sendMultiAskAnswer(WazeAsksQuestion wazeAsksQuestion, MultiAskAnswer multiAskAnswer, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(multiAskAnswer, "answer");
        NativeManager.runNativeTask(new ao(this, wazeAsksQuestion, multiAskAnswer, 1), lVar != null ? new an(lVar, 0) : null);
    }

    public void setTriggerByQuestionFailed(int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new aq(this, i2, 0), lVar != null ? new an(lVar, 1) : null);
    }

    public void setTriggerByQuestionResult(com.waze.ap.a.a.ai aiVar, WazeAsksTrigger wazeAsksTrigger, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(aiVar, "question");
        h.g.b.x.f(wazeAsksTrigger, "originalTrigger");
        NativeManager.runNativeTask(new ao(this, aiVar, wazeAsksTrigger, 2), lVar != null ? new an(lVar, 3) : null);
    }

    public final void removeReportById(int i2) {
        removeReportById$default(this, i2, null, 2, null);
    }

    public final void setTriggerByQuestionFailed(int i2) {
        setTriggerByQuestionFailed$default(this, i2, null, 2, null);
    }

    public final void onQuestionShown(WazeAsksQuestion wazeAsksQuestion) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        onQuestionShown$default(this, wazeAsksQuestion, null, 2, null);
    }

    public final void sendEnrichAlertAnswer(WazeAsksQuestion wazeAsksQuestion, EnrichAlertQuestion.Answer answer) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(answer, "answer");
        sendEnrichAlertAnswer$default(this, wazeAsksQuestion, answer, null, 4, null);
    }

    public final void sendFeedbackAnswer(WazeAsksQuestion wazeAsksQuestion, FeedbackAnswer feedbackAnswer) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(feedbackAnswer, "answer");
        sendFeedbackAnswer$default(this, wazeAsksQuestion, feedbackAnswer, null, 4, null);
    }

    public final void sendMultiAskAnswer(WazeAsksQuestion wazeAsksQuestion, MultiAskAnswer multiAskAnswer) {
        h.g.b.x.f(wazeAsksQuestion, "question");
        h.g.b.x.f(multiAskAnswer, "answer");
        sendMultiAskAnswer$default(this, wazeAsksQuestion, multiAskAnswer, null, 4, null);
    }

    public final void setTriggerByQuestionResult(com.waze.ap.a.a.ai aiVar, WazeAsksTrigger wazeAsksTrigger) {
        h.g.b.x.f(aiVar, "question");
        h.g.b.x.f(wazeAsksTrigger, "originalTrigger");
        setTriggerByQuestionResult$default(this, aiVar, wazeAsksTrigger, null, 4, null);
    }
}
