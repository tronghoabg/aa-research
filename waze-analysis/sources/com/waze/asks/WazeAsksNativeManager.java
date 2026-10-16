package com.waze.asks;

import android.os.Parcelable;
import com.waze.c.e.cl;
import com.waze.jni.protos.alerters.AlerterSubType;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.FeedbackQuestion;
import com.waze.jni.protos.asks.MultiAskAnswer;
import com.waze.jni.protos.asks.MultiAskQuestion;
import com.waze.jni.protos.asks.SegmentInsightType;
import com.waze.jni.protos.asks.WazeAsksQuestion;
import com.waze.jni.protos.asks.WazeAsksTrigger;
import java.util.Objects;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class WazeAsksNativeManager extends ar {
    private final bm<av> _questionFlow;
    private final com.waze.shared_infra.i.e logger;
    private final bq<av> questionFlow;
    public static final al Companion = new al();
    public static final int $stable = 8;

    public WazeAsksNativeManager() {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeAsksNativeManager");
        h.g.b.x.e(eVarD, "create(...)");
        this.logger = eVarD;
        bm<av> bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this._questionFlow = bmVarC;
        this.questionFlow = kotlinx.coroutines.b.ai.S(bmVarC);
    }

    public static final WazeAsksNativeManager getInstance() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = Companion;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(WazeAsksNativeManager.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(WazeAsksNativeManager.class);
        }
        return (WazeAsksNativeManager) bVarC.a(mVar, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final h.ab loadQuestionByTrigger$lambda$1(com.waze.asks.WazeAsksNativeManager r2, com.waze.jni.protos.asks.WazeAsksTrigger r3, com.waze.ap.b.l r4) {
        /*
            if (r4 == 0) goto L27
            r0 = 1
            boolean r1 = r4.hasQuestion()
            if (r0 == r1) goto La
            r4 = 0
        La:
            if (r4 == 0) goto L27
            com.waze.ap.a.a.ai r4 = r4.getQuestion()
            if (r4 == 0) goto L27
            byte[] r4 = r4.toByteArray()
            java.lang.String r0 = "toByteArray(...)"
            h.g.b.x.e(r4, r0)
            byte[] r3 = r3.toByteArray()
            h.g.b.x.e(r3, r0)
            r2.setTriggerByQuestionResultNTV(r4, r3)
            goto L37
        L27:
            com.waze.shared_infra.i.e r4 = r2.logger
            java.lang.String r0 = "failed to load waze asks question"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.g(r0)
            int r3 = r3.getStatsAlertId()
            r2.setTriggerByQuestionFailedNTV(r3)
        L37:
            h.ab r2 = h.ab.f48028a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.asks.WazeAsksNativeManager.loadQuestionByTrigger$lambda$1(com.waze.asks.WazeAsksNativeManager, com.waze.jni.protos.asks.WazeAsksTrigger, com.waze.ap.b.l):h.ab");
    }

    public bq<av> getQuestionFlow() {
        return this.questionFlow;
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.asks.ar
    public void launchWazeAsks(WazeAsksQuestion wazeAsksQuestion) {
        h.g.b.x.f(wazeAsksQuestion, "questionProto");
        av avVarE = cl.e(wazeAsksQuestion);
        if (avVarE == null) {
            this.logger.b("Aborting WazeAsks launch, invalid question received");
            return;
        }
        com.waze.shared_infra.i.e eVar = this.logger;
        Objects.toString(avVarE);
        eVar.e("Launching WazeAsks: ".concat(avVarE.toString()));
        this._questionFlow.c(avVarE);
    }

    public final void loadQuestionByTrigger$third_party_waze_client_android_project_waze_src_main_waze(WazeAsksTrigger wazeAsksTrigger) {
        i iVar;
        h.g.b.x.f(wazeAsksTrigger, "triggerProto");
        w wVar = (w) com.waze.web.r.n(w.class);
        if (wVar == null) {
            this.logger.g("failed to load waze asks API service");
            return;
        }
        WazeAsksTrigger.TriggerType type = wazeAsksTrigger.getType();
        h.g.b.x.e(type, "getType(...)");
        Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
        WazeAsksTrigger.TriggerType triggerType = WazeAsksTrigger.TriggerType.DEFAULT_HAZARD;
        WazeAsksQuestion.QuestionCase questionCase = WazeAsksQuestion.QuestionCase.ENRICH_ALERT_QUESTION;
        FeedbackQuestion.TriggeredByCase triggeredByCase = FeedbackQuestion.TriggeredByCase.TRIGGERED_BY_ALERT_ID;
        MultiAskQuestion.QuestionType questionType = MultiAskQuestion.QuestionType.QUESTION_TYPE_UNSPECIFIED;
        MultiAskAnswer.AnswerType answerType = MultiAskAnswer.AnswerType.ANSWER_TYPE_UNSPECIFIED;
        EnrichAlertQuestion.QuestionTitleType questionTitleType = EnrichAlertQuestion.QuestionTitleType.WHAT_DO_YOU_SEE;
        EnrichAlertQuestion.Answer.VariantCase variantCase = EnrichAlertQuestion.Answer.VariantCase.HAZARD;
        FeedbackAnswer.FeedbackAnswerType feedbackAnswerType = FeedbackAnswer.FeedbackAnswerType.NOT_HELPFUL;
        FeedbackQuestion.FeedbackQuestionType feedbackQuestionType = FeedbackQuestion.FeedbackQuestionType.RAILROAD_CROSSING;
        WazeAsksQuestion.WazeAsksQuestionSource wazeAsksQuestionSource = WazeAsksQuestion.WazeAsksQuestionSource.UNKNOWN;
        AlerterSubType.BlockedLaneSubType blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
        AlerterSubType.HazardSubType hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_UNSPECIFIED;
        e eVar = e.f15585a;
        aw awVar = aw.f15546a;
        g gVar = g.f15590a;
        h hVar = h.f15593a;
        k kVar = k.f15610a;
        l lVar = l.f15613a;
        SegmentInsightType segmentInsightType = SegmentInsightType.SEGMENT_TRAFFIC;
        m mVar = m.f15617a;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            iVar = i.f15605a;
        } else if (iOrdinal == 1) {
            iVar = i.f15606b;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            iVar = null;
        }
        if (iVar != null) {
            String insightId = wazeAsksTrigger.getInsightId();
            h.g.b.x.e(insightId, "getInsightId(...)");
            wVar.a(iVar, insightId, new ak(this, wazeAsksTrigger, 0));
        } else {
            com.waze.shared_infra.i.e eVar2 = this.logger;
            WazeAsksTrigger.TriggerType type2 = wazeAsksTrigger.getType();
            Objects.toString(type2);
            eVar2.g("requested trigger type is unknown: ".concat(String.valueOf(type2)));
        }
    }

    public void onQuestionShown(av avVar) {
        h.g.b.x.f(avVar, "question");
        WazeAsksQuestion wazeAsksQuestionI = cl.i(avVar);
        if (wazeAsksQuestionI == null) {
            this.logger.b("Invalid waze asks question shown to user, cannot process");
        } else {
            ar.onQuestionShown$default(this, wazeAsksQuestionI, null, 2, null);
        }
    }

    public final native void onQuestionShownNTV(byte[] bArr);

    public final native void removeReportByIdNTV(int i2);

    public void sendEnrichAlertAnswer(as asVar, d dVar) {
        h.g.b.x.f(asVar, "question");
        h.g.b.x.f(dVar, "answer");
        WazeAsksQuestion wazeAsksQuestionI = cl.i(asVar);
        EnrichAlertQuestion.Answer answerK = cl.K(dVar);
        if (wazeAsksQuestionI == null || answerK == null) {
            return;
        }
        ar.sendEnrichAlertAnswer$default(this, wazeAsksQuestionI, answerK, null, 4, null);
    }

    public final native void sendEnrichAlertAnswerNTV(byte[] bArr, byte[] bArr2);

    public void sendFeedbackAnswer(at atVar, f fVar) {
        h.g.b.x.f(atVar, "question");
        h.g.b.x.f(fVar, "answer");
        WazeAsksQuestion wazeAsksQuestionI = cl.i(atVar);
        FeedbackAnswer feedbackAnswerL = cl.L(fVar);
        if (wazeAsksQuestionI != null) {
            ar.sendFeedbackAnswer$default(this, wazeAsksQuestionI, feedbackAnswerL, null, 4, null);
        }
    }

    public final native void sendFeedbackAnswerNTV(byte[] bArr, byte[] bArr2);

    public void sendMultiAskAnswer(au auVar, j jVar) {
        h.g.b.x.f(auVar, "question");
        h.g.b.x.f(jVar, "answer");
        WazeAsksQuestion wazeAsksQuestionI = cl.i(auVar);
        MultiAskAnswer multiAskAnswerM = cl.M(jVar);
        if (wazeAsksQuestionI != null) {
            ar.sendMultiAskAnswer$default(this, wazeAsksQuestionI, multiAskAnswerM, null, 4, null);
        }
    }

    public final native void sendMultiAskAnswerNTV(byte[] bArr, byte[] bArr2);

    public final native void setTriggerByQuestionFailedNTV(int i2);

    public final native void setTriggerByQuestionResultNTV(byte[] bArr, byte[] bArr2);
}
