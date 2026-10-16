package com.waze.c.e;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.R;
import com.waze.jni.protos.alerters.AlerterSubType;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.FeedbackQuestion;
import com.waze.jni.protos.asks.MultiAskAnswer;
import com.waze.jni.protos.asks.MultiAskQuestion;
import com.waze.jni.protos.asks.SegmentInsightType;
import com.waze.jni.protos.asks.WazeAsksQuestion;
import com.waze.jni.protos.asks.WazeAsksTrigger;
import com.waze.modules.c.cu;
import com.waze.strings.DisplayStrings;
import l.a.de;
import l.a.dv;
import l.a.dw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class cl {
    public /* synthetic */ cl(byte[] bArr) {
    }

    static h.ab A(bi biVar, al alVar, int i2, Composer composer) {
        Y(biVar, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static void C(k kVar, long j2, Composer composer, int i2) {
        int i3;
        com.waze.z.a.g.aa aaVar;
        h.g.b.x.f(kVar, "alternateRoutesFTETooltipStateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1996312017);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(kVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(j2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1996312017, i3, -1, "com.waze.alternate_routes.presentation.AlternativeRoutesFTETooltip (AlternateRoutesFTETooltip.kt:21)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(kVar.b(), null, composerStartRestartGroup, 0, 1);
            h hVarAb = ab(stateCollectAsState);
            com.waze.z.a.g.aa aaVarH = com.waze.z.a.g.z.h(false, null, null, hVarAb != null ? hVarAb.a() : null, composerStartRestartGroup, DisplayStrings.DS_NONE, 24);
            if (ab(stateCollectAsState) != null) {
                composerStartRestartGroup.startReplaceGroup(281487743);
                Alignment bottomEnd = Alignment.Companion.getBottomEnd();
                com.waze.z.a.g.b bVar = com.waze.z.a.g.b.f46069a;
                int i5 = bu.f18632a;
                com.waze.z.a.g.z.e(bottomEnd, j2, null, aaVarH, bVar, bu.a(), composerStartRestartGroup, (i3 & 112) | 196614, 4);
                aaVar = aaVarH;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                aaVar = aaVarH;
                composerStartRestartGroup.startReplaceGroup(281845235);
                composerStartRestartGroup.endReplaceGroup();
            }
            h hVarAb2 = ab(stateCollectAsState);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(aaVar);
            y yVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y(aaVar, stateCollectAsState, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(yVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(hVarAb2, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) yVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.parking.l(kVar, j2, i2, 1));
        }
    }

    public static l.a.ck D(com.waze.modules.c.h hVar) {
        h.g.b.x.f(hVar, "<this>");
        l.a.cj cjVarNewBuilder = l.a.ck.newBuilder();
        h.g.b.x.f(cjVarNewBuilder, "builder");
        Long lJ = hVar.j();
        if (lJ != null) {
            cjVarNewBuilder.a(lJ.longValue());
        }
        if (hVar.b() != null) {
            cjVarNewBuilder.d(ac(r1).getNumber());
        }
        if (hVar.a() != null) {
            cjVarNewBuilder.c(r3.a());
        }
        l.a.ck ckVarBuild = cjVarNewBuilder.build();
        h.g.b.x.e(ckVarBuild, "build(...)");
        return ckVarBuild;
    }

    public static /* synthetic */ dv F(com.waze.c.d.ai aiVar) {
        com.waze.modules.c.j jVar = com.waze.modules.c.j.f30171a;
        com.waze.c.d.ai aiVar2 = com.waze.c.d.ai.f18290a;
        com.waze.c.d.aj ajVar = com.waze.c.d.aj.f18302a;
        com.waze.c.d.ak akVar = com.waze.c.d.ak.f18310a;
        com.waze.c.d.al alVar = com.waze.c.d.al.f18313a;
        switch (aiVar.ordinal()) {
            case 0:
                return dv.ROUTE_SELECTED;
            case 1:
                return dv.ROUTE_LABEL_SELECTED;
            case 2:
                return dv.SWIPE;
            case 3:
                return dv.CHECK;
            case 4:
                return dv.GO;
            case 5:
                return dv.RESUME;
            case 6:
                return dv.BACK;
            case 7:
                return dv.PAN;
            case 8:
                return dv.ZOOM;
            case 9:
                return dv.RECENTER;
            case 10:
                return dv.DRIVING_INSTRUCTIONS_BAR_OPENED;
            case 11:
                return dv.DRIVING_INSTRUCTIONS_BAR_COLLAPSED;
            case 12:
                return dv.HOV_TOGGLE;
            case 13:
                return dv.SCROLL;
            case 14:
                return dv.TOGGLE_SCREEN_MODE;
            default:
                throw new h.i();
        }
    }

    public static /* synthetic */ dw G(com.waze.c.d.aj ajVar) {
        com.waze.modules.c.j jVar = com.waze.modules.c.j.f30171a;
        com.waze.c.d.ai aiVar = com.waze.c.d.ai.f18290a;
        com.waze.c.d.aj ajVar2 = com.waze.c.d.aj.f18302a;
        com.waze.c.d.ak akVar = com.waze.c.d.ak.f18310a;
        com.waze.c.d.al alVar = com.waze.c.d.al.f18313a;
        switch (ajVar.ordinal()) {
            case 0:
                return dw.MAP;
            case 1:
                return dw.CARD;
            case 2:
                return dw.INCAR_CHECKLIST;
            case 3:
                return dw.HARDWARE_BACK;
            case 4:
                return dw.DRIVING_INSTRUCTIONS_BAR;
            case 5:
                return dw.RECENTER_ICON;
            case 6:
                return dw.SCREEN_MODE_TOGGLE;
            default:
                throw new h.i();
        }
    }

    private static void H(Composer composer, int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1135469748);
        int i3 = 0;
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1135469748, i2, -1, "com.waze.alternate_routes.presentation.BlockingProgressDialog (SlideInAlternateRoutesLoader.kt:113)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strB = com.waze.ui.r.a.c.c.b(R.string.RECALCULATING_ROUTE___, composerStartRestartGroup, 0);
            h.ab abVar = h.ab.f48028a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strB);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            int i4 = 6;
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.c.d.a(context, strB, i4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(abVar, (h.g.a.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new cj(i2, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.waze.ui.b.az I(long j2) {
        long jE = com.waze.settings.h.c.e(j2);
        long jL = h.o.a.l(jE);
        long jN = h.o.a.n(h.o.a.q(jE, h.o.c.j(jL, h.o.d.f48275f)));
        return jL == 0 ? new com.waze.ui.b.ay(jN) : jN == 0 ? new com.waze.ui.b.aw(jL) : new com.waze.ui.b.ax(jL, jN);
    }

    private static com.waze.asks.aw J(WazeAsksQuestion wazeAsksQuestion) {
        WazeAsksQuestion.WazeAsksQuestionSource source = wazeAsksQuestion.getSource();
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
        com.waze.asks.e eVar = com.waze.asks.e.f15585a;
        com.waze.asks.aw awVar = com.waze.asks.aw.f15546a;
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        com.waze.asks.h hVar = com.waze.asks.h.f15593a;
        com.waze.asks.k kVar = com.waze.asks.k.f15610a;
        com.waze.asks.l lVar = com.waze.asks.l.f15613a;
        SegmentInsightType segmentInsightType = SegmentInsightType.SEGMENT_TRAFFIC;
        com.waze.asks.m mVar = com.waze.asks.m.f15617a;
        int iOrdinal = source.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return com.waze.asks.aw.f15547b;
            }
            if (iOrdinal == 2) {
                return com.waze.asks.aw.f15548c;
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
        }
        return com.waze.asks.aw.f15546a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EnrichAlertQuestion.Answer K(com.waze.asks.d dVar) {
        AlerterSubType.HazardSubType hazardSubType;
        AlerterSubType.BlockedLaneSubType blockedLaneSubType;
        EnrichAlertQuestion.Answer.Builder builderNewBuilder = EnrichAlertQuestion.Answer.newBuilder();
        h.g.b.x.e(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setAnswerKey(dVar.c());
        if (dVar instanceof com.waze.asks.a) {
            com.waze.reports_v2.b.at atVarB = ((com.waze.asks.a) dVar).b();
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
            AlerterSubType.BlockedLaneSubType blockedLaneSubType2 = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
            AlerterSubType.HazardSubType hazardSubType2 = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_UNSPECIFIED;
            com.waze.asks.e eVar = com.waze.asks.e.f15585a;
            com.waze.asks.aw awVar = com.waze.asks.aw.f15546a;
            com.waze.asks.g gVar = com.waze.asks.g.f15590a;
            com.waze.asks.h hVar = com.waze.asks.h.f15593a;
            com.waze.asks.k kVar = com.waze.asks.k.f15610a;
            com.waze.asks.l lVar = com.waze.asks.l.f15613a;
            SegmentInsightType segmentInsightType = SegmentInsightType.SEGMENT_TRAFFIC;
            com.waze.asks.m mVar = com.waze.asks.m.f15617a;
            switch (atVarB.ordinal()) {
                case 21:
                    blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_DEFAULT;
                    break;
                case 22:
                    blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_LEFT;
                    break;
                case 23:
                    blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_CENTER;
                    break;
                case 24:
                    blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_RIGHT;
                    break;
                default:
                    blockedLaneSubType = null;
                    break;
            }
            if (blockedLaneSubType != null) {
                EnrichAlertQuestion.Answer.BlockedLaneVariant.Builder builderNewBuilder2 = EnrichAlertQuestion.Answer.BlockedLaneVariant.newBuilder();
                h.g.b.x.e(builderNewBuilder2, "newBuilder(...)");
                builderNewBuilder2.setSubType(blockedLaneSubType);
                builderNewBuilder.setBlockedLane(builderNewBuilder2);
                return builderNewBuilder.build();
            }
            return null;
        }
        if (dVar instanceof com.waze.asks.b) {
            com.waze.reports_v2.b.at atVarB2 = ((com.waze.asks.b) dVar).b();
            Parcelable.Creator<com.waze.reports_v2.b.at> creator2 = com.waze.reports_v2.b.at.CREATOR;
            WazeAsksTrigger.TriggerType triggerType2 = WazeAsksTrigger.TriggerType.DEFAULT_HAZARD;
            WazeAsksQuestion.QuestionCase questionCase2 = WazeAsksQuestion.QuestionCase.ENRICH_ALERT_QUESTION;
            FeedbackQuestion.TriggeredByCase triggeredByCase2 = FeedbackQuestion.TriggeredByCase.TRIGGERED_BY_ALERT_ID;
            MultiAskQuestion.QuestionType questionType2 = MultiAskQuestion.QuestionType.QUESTION_TYPE_UNSPECIFIED;
            MultiAskAnswer.AnswerType answerType2 = MultiAskAnswer.AnswerType.ANSWER_TYPE_UNSPECIFIED;
            EnrichAlertQuestion.QuestionTitleType questionTitleType2 = EnrichAlertQuestion.QuestionTitleType.WHAT_DO_YOU_SEE;
            EnrichAlertQuestion.Answer.VariantCase variantCase2 = EnrichAlertQuestion.Answer.VariantCase.HAZARD;
            FeedbackAnswer.FeedbackAnswerType feedbackAnswerType2 = FeedbackAnswer.FeedbackAnswerType.NOT_HELPFUL;
            FeedbackQuestion.FeedbackQuestionType feedbackQuestionType2 = FeedbackQuestion.FeedbackQuestionType.RAILROAD_CROSSING;
            WazeAsksQuestion.WazeAsksQuestionSource wazeAsksQuestionSource2 = WazeAsksQuestion.WazeAsksQuestionSource.UNKNOWN;
            AlerterSubType.BlockedLaneSubType blockedLaneSubType3 = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
            AlerterSubType.HazardSubType hazardSubType3 = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_UNSPECIFIED;
            com.waze.asks.e eVar2 = com.waze.asks.e.f15585a;
            com.waze.asks.aw awVar2 = com.waze.asks.aw.f15546a;
            com.waze.asks.g gVar2 = com.waze.asks.g.f15590a;
            com.waze.asks.h hVar2 = com.waze.asks.h.f15593a;
            com.waze.asks.k kVar2 = com.waze.asks.k.f15610a;
            com.waze.asks.l lVar2 = com.waze.asks.l.f15613a;
            SegmentInsightType segmentInsightType2 = SegmentInsightType.SEGMENT_TRAFFIC;
            com.waze.asks.m mVar2 = com.waze.asks.m.f15617a;
            int iOrdinal = atVarB2.ordinal();
            if (iOrdinal != 29) {
                switch (iOrdinal) {
                    case 9:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_DEFAULT;
                        break;
                    case 10:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_ROAD_BROKEN_TRAFFIC_LIGHT;
                        break;
                    case 11:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_ROAD_POT_HOLE;
                        break;
                    case 12:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_ROAD_OBJECT;
                        break;
                    case 13:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_ROAD_CAR_STOPPED;
                        break;
                    case 14:
                        hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_ROAD_CONSTRUCTION;
                        break;
                    default:
                        hazardSubType = null;
                        break;
                }
            } else {
                hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_ON_SHOULDER_CAR_STOPPED;
            }
            if (hazardSubType != null) {
                EnrichAlertQuestion.Answer.HazardVariant.Builder builderNewBuilder3 = EnrichAlertQuestion.Answer.HazardVariant.newBuilder();
                h.g.b.x.e(builderNewBuilder3, "newBuilder(...)");
                builderNewBuilder3.setSubType(hazardSubType);
                builderNewBuilder.setHazard(builderNewBuilder3);
            }
            return null;
        }
        if (!(dVar instanceof com.waze.asks.c)) {
            throw new h.i();
        }
        builderNewBuilder.setValidation(EnrichAlertQuestion.Answer.NotThereVariant.getDefaultInstance());
        return builderNewBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static FeedbackAnswer L(com.waze.asks.f fVar) {
        FeedbackAnswer.FeedbackAnswerType feedbackAnswerType;
        FeedbackAnswer.Builder builderNewBuilder = FeedbackAnswer.newBuilder();
        h.g.b.x.e(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setPointsAward(fVar.a());
        com.waze.asks.g gVarB = fVar.b();
        Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
        WazeAsksTrigger.TriggerType triggerType = WazeAsksTrigger.TriggerType.DEFAULT_HAZARD;
        WazeAsksQuestion.QuestionCase questionCase = WazeAsksQuestion.QuestionCase.ENRICH_ALERT_QUESTION;
        FeedbackQuestion.TriggeredByCase triggeredByCase = FeedbackQuestion.TriggeredByCase.TRIGGERED_BY_ALERT_ID;
        MultiAskQuestion.QuestionType questionType = MultiAskQuestion.QuestionType.QUESTION_TYPE_UNSPECIFIED;
        MultiAskAnswer.AnswerType answerType = MultiAskAnswer.AnswerType.ANSWER_TYPE_UNSPECIFIED;
        EnrichAlertQuestion.QuestionTitleType questionTitleType = EnrichAlertQuestion.QuestionTitleType.WHAT_DO_YOU_SEE;
        EnrichAlertQuestion.Answer.VariantCase variantCase = EnrichAlertQuestion.Answer.VariantCase.HAZARD;
        FeedbackAnswer.FeedbackAnswerType feedbackAnswerType2 = FeedbackAnswer.FeedbackAnswerType.NOT_HELPFUL;
        FeedbackQuestion.FeedbackQuestionType feedbackQuestionType = FeedbackQuestion.FeedbackQuestionType.RAILROAD_CROSSING;
        WazeAsksQuestion.WazeAsksQuestionSource wazeAsksQuestionSource = WazeAsksQuestion.WazeAsksQuestionSource.UNKNOWN;
        AlerterSubType.BlockedLaneSubType blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
        AlerterSubType.HazardSubType hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_UNSPECIFIED;
        com.waze.asks.e eVar = com.waze.asks.e.f15585a;
        com.waze.asks.aw awVar = com.waze.asks.aw.f15546a;
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        com.waze.asks.h hVar = com.waze.asks.h.f15593a;
        com.waze.asks.k kVar = com.waze.asks.k.f15610a;
        com.waze.asks.l lVar = com.waze.asks.l.f15613a;
        SegmentInsightType segmentInsightType = SegmentInsightType.SEGMENT_TRAFFIC;
        com.waze.asks.m mVar = com.waze.asks.m.f15617a;
        int iOrdinal = gVarB.ordinal();
        if (iOrdinal == 0) {
            feedbackAnswerType = FeedbackAnswer.FeedbackAnswerType.HELPFUL;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            feedbackAnswerType = FeedbackAnswer.FeedbackAnswerType.NOT_HELPFUL;
        }
        builderNewBuilder.setType(feedbackAnswerType);
        FeedbackAnswer feedbackAnswerBuild = builderNewBuilder.build();
        h.g.b.x.e(feedbackAnswerBuild, "build(...)");
        return feedbackAnswerBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MultiAskAnswer M(com.waze.asks.j jVar) {
        MultiAskAnswer.AnswerType answerType;
        MultiAskAnswer.Builder builderNewBuilder = MultiAskAnswer.newBuilder();
        h.g.b.x.e(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setPointsAward(jVar.a());
        com.waze.asks.k kVarB = jVar.b();
        Parcelable.Creator<com.waze.reports_v2.b.at> creator = com.waze.reports_v2.b.at.CREATOR;
        WazeAsksTrigger.TriggerType triggerType = WazeAsksTrigger.TriggerType.DEFAULT_HAZARD;
        WazeAsksQuestion.QuestionCase questionCase = WazeAsksQuestion.QuestionCase.ENRICH_ALERT_QUESTION;
        FeedbackQuestion.TriggeredByCase triggeredByCase = FeedbackQuestion.TriggeredByCase.TRIGGERED_BY_ALERT_ID;
        MultiAskQuestion.QuestionType questionType = MultiAskQuestion.QuestionType.QUESTION_TYPE_UNSPECIFIED;
        MultiAskAnswer.AnswerType answerType2 = MultiAskAnswer.AnswerType.ANSWER_TYPE_UNSPECIFIED;
        EnrichAlertQuestion.QuestionTitleType questionTitleType = EnrichAlertQuestion.QuestionTitleType.WHAT_DO_YOU_SEE;
        EnrichAlertQuestion.Answer.VariantCase variantCase = EnrichAlertQuestion.Answer.VariantCase.HAZARD;
        FeedbackAnswer.FeedbackAnswerType feedbackAnswerType = FeedbackAnswer.FeedbackAnswerType.NOT_HELPFUL;
        FeedbackQuestion.FeedbackQuestionType feedbackQuestionType = FeedbackQuestion.FeedbackQuestionType.RAILROAD_CROSSING;
        WazeAsksQuestion.WazeAsksQuestionSource wazeAsksQuestionSource = WazeAsksQuestion.WazeAsksQuestionSource.UNKNOWN;
        AlerterSubType.BlockedLaneSubType blockedLaneSubType = AlerterSubType.BlockedLaneSubType.BLOCKED_LANE_SUB_TYPE_UNSPECIFIED;
        AlerterSubType.HazardSubType hazardSubType = AlerterSubType.HazardSubType.HAZARD_SUB_TYPE_UNSPECIFIED;
        com.waze.asks.e eVar = com.waze.asks.e.f15585a;
        com.waze.asks.aw awVar = com.waze.asks.aw.f15546a;
        com.waze.asks.g gVar = com.waze.asks.g.f15590a;
        com.waze.asks.h hVar = com.waze.asks.h.f15593a;
        com.waze.asks.k kVar = com.waze.asks.k.f15610a;
        com.waze.asks.l lVar = com.waze.asks.l.f15613a;
        SegmentInsightType segmentInsightType = SegmentInsightType.SEGMENT_TRAFFIC;
        com.waze.asks.m mVar = com.waze.asks.m.f15617a;
        int iOrdinal = kVarB.ordinal();
        if (iOrdinal == 0) {
            answerType = MultiAskAnswer.AnswerType.YES;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            answerType = MultiAskAnswer.AnswerType.NO;
        }
        builderNewBuilder.setType(answerType);
        MultiAskAnswer multiAskAnswerBuild = builderNewBuilder.build();
        h.g.b.x.e(multiAskAnswerBuild, "build(...)");
        return multiAskAnswerBuild;
    }

    private static bi N(State state) {
        return (bi) state.getValue();
    }

    private static bi O(State state) {
        return (bi) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void P(com.waze.c.e.al r22, com.waze.c.e.bi r23, h.g.a.a r24, h.g.a.a r25, h.g.a.a r26, androidx.compose.runtime.Composer r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.cl.P(com.waze.c.e.al, com.waze.c.e.bi, h.g.a.a, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    private static void Q(bi biVar, al alVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-103537884);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103537884, i3, -1, "com.waze.alternate_routes.presentation.AlternateRoutesBackHandler (AlternateRoutesScreenV2.kt:674)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i3 >> 6) & 14);
            boolean zChanged = ((i3 & 112) == 32) | ((i3 & 14) == 4) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.a.z zVar = new com.waze.a.z((Object) biVar, (Object) alVar, (Object) stateRememberUpdatedState, 3, (char[]) null);
                composerStartRestartGroup.updateRememberedValue(zVar);
                objRememberedValue = zVar;
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(biVar, alVar, aVar, i2, 0));
        }
    }

    private static void R(al alVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier.Companion companionJ;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1308942135);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1308942135, i3, -1, "com.waze.alternate_routes.presentation.AlternativeRoutesMapScrim (AlternateRoutesScreenV2.kt:614)");
            }
            com.waze.ui.b.o oVarA = alVar.d().a();
            com.waze.ui.b.o oVar = com.waze.ui.b.o.f42080b;
            composer2 = composerStartRestartGroup;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(oVarA == oVar ? 0.72f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, "mapScrimAlpha", null, composer2, DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_DELETE_RECENT_DESTINATION_MESSAGE, 20);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            if (alVar.d().a() == oVar) {
                composer2.startReplaceGroup(687638856);
                Modifier.Companion companion = Modifier.Companion;
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new android.support.v4.a.a.c(16);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                companionJ = com.waze.z.a.be.J(companion, false, null, (h.g.a.a) objRememberedValue, composer2, 196662, 14);
                composer2 = composer2;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(687710249);
                composer2.endReplaceGroup();
                companionJ = Modifier.Companion;
            }
            BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(modifierFillMaxSize$default.then(companionJ), Color.m8227copywmQWz5c$default(com.waze.bz.a.d(composer2, 0).c(), ((Number) stateAnimateFloatAsState.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(alVar, i2, i5));
        }
    }

    private static void S(Modifier modifier, bi biVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1614802405);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(biVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614802405, i3, -1, "com.waze.alternate_routes.presentation.AnimatedAlternateRoutesLoader (AlternateRoutesScreenV2.kt:562)");
            }
            a(biVar.c(), modifier, composerStartRestartGroup, (i3 << 3) & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(modifier, biVar, i2, 3, null));
        }
    }

    private static void T(bi biVar, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1791105763);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1791105763, i3, -1, "com.waze.alternate_routes.presentation.SetCardsLandscapeLayoutPositionLaunchedEffect (AlternateRoutesScreenV2.kt:758)");
            }
            Integer numValueOf = Integer.valueOf(biVar.b().c().a());
            f fVarA = biVar.b().a();
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            y yVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y(biVar, alVar, (h.c.e) null, 3);
                composerStartRestartGroup.updateRememberedValue(yVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(numValueOf, fVarA, (h.g.a.p) yVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(biVar, alVar, i2, i5));
        }
    }

    private static void U(bi biVar, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(733400133);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(733400133, i3, -1, "com.waze.alternate_routes.presentation.SetCardsPortraitLayoutPositionLaunchedEffect (AlternateRoutesScreenV2.kt:731)");
            }
            com.waze.ui.b.o oVarA = alVar.d().a();
            f fVarA = biVar.b().a();
            boolean z = true;
            com.waze.c.a.a aVarA = biVar.a();
            boolean z2 = (i3 & 112) == 32;
            if ((i3 & 14) != 4) {
                z = false;
            }
            y yVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y(alVar, biVar, (h.c.e) null, 4);
                composerStartRestartGroup.updateRememberedValue(yVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(oVarA, fVarA, aVarA, (h.g.a.p) yVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(biVar, alVar, i2, i5));
        }
    }

    private static void V(bi biVar, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(617500851);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(617500851, i3, -1, "com.waze.alternate_routes.presentation.SetUserPreferredMapListSwitchModeLaunchedEffect (AlternateRoutesScreenV2.kt:370)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            f fVarA = biVar.b().a();
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(afVar);
            boolean z = (i3 & 112) == 32;
            ai aiVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || aiVarRememberedValue == Composer.Companion.getEmpty()) {
                aiVarRememberedValue = new ai(biVar, afVar, alVar, null);
                composerStartRestartGroup.updateRememberedValue(aiVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(fVarA, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) aiVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(biVar, alVar, i2, 6));
        }
    }

    private static void W(bi biVar, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(230113229);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230113229, i3, -1, "com.waze.alternate_routes.presentation.ToggleMapListSwitchEnabledLaunchedEffect (AlternateRoutesScreenV2.kt:709)");
            }
            Boolean boolValueOf = Boolean.valueOf(alVar.c().j());
            r rVarC = biVar.c();
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            ak akVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || akVarRememberedValue == Composer.Companion.getEmpty()) {
                akVarRememberedValue = new ak(biVar, alVar, null, 1, null);
                composerStartRestartGroup.updateRememberedValue(akVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(boolValueOf, rVarC, (h.g.a.p) akVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(biVar, alVar, i2, i5));
        }
    }

    private static void X(al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-811549029);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-811549029, i3, -1, "com.waze.alternate_routes.presentation.ToggleMapListSwitchLaunchedEffect (AlternateRoutesScreenV2.kt:688)");
            }
            com.waze.ui.b.e eVarC = alVar.c().c();
            int i6 = i3 & 14;
            aj ajVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || ajVarRememberedValue == Composer.Companion.getEmpty()) {
                ajVarRememberedValue = new aj(alVar, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(ajVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(eVarC, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) ajVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(alVar, i2, i5));
        }
    }

    private static void Y(bi biVar, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(602850779);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(biVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602850779, i3, -1, "com.waze.alternate_routes.presentation.ToggleUserScrollEnabledLaunchedEffect (AlternateRoutesScreenV2.kt:776)");
            }
            r rVarC = biVar.c();
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            ak akVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z) || akVarRememberedValue == Composer.Companion.getEmpty()) {
                akVarRememberedValue = new ak(biVar, alVar, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(akVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(rVarC, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) akVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(biVar, alVar, i2, i5));
        }
    }

    private static void Z(Modifier modifier, Density density, al alVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818696248);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(density) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(alVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1818696248, i3, -1, "com.waze.alternate_routes.presentation.AlternativeRoutesMapListSegmentedSwitch (AlternateRoutesScreenV2.kt:574)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            byte[] bArr = null;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new com.waze.a.aa(density, alVar, 5, bArr));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) ((State) objRememberedValue).getValue()).booleanValue(), PaddingKt.padding(modifier, PaddingKt.m2752PaddingValuesa9UjIt4$default(0.0f, ((Dp) alVar.a().getValue()).m11178unboximpl() + 16.0f, 0.0f, 16.0f, 5, null)), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, 0, EasingKt.getLinearEasing(), 2, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1941548384, true, new com.waze.ads.c.a(alVar, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(modifier, density, alVar, i2, 3, null));
        }
    }

    public static void a(r rVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        String strB;
        h.g.b.x.f(rVar, "alternateRoutesLoadingState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1221337563);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(rVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221337563, i3, -1, "com.waze.alternate_routes.presentation.AnimatedAlternateRoutesLoading (SlideInAlternateRoutesLoader.kt:47)");
            }
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 200, EasingFunctionsKt.getEaseInOutQuint()), 0.0f, 2, null);
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 200, EasingFunctionsKt.getEaseInOutQuint()), 0.0f, 2, null);
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i5 = i3 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487573670, i5, -1, "com.waze.alternate_routes.presentation.resolveToastString (SlideInAlternateRoutesLoader.kt:93)");
            }
            q qVarA = rVar.a();
            if ((qVarA instanceof o) && ((o) qVarA).a()) {
                composerStartRestartGroup.startReplaceGroup(406871589);
                strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_ONLY_ONE_ROUTE_FOUND, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (qVarA instanceof n) {
                composerStartRestartGroup.startReplaceGroup(-271731099);
                m mVarA = ((n) qVarA).a();
                m mVar = m.f18679a;
                int iOrdinal = mVarA.ordinal();
                if (iOrdinal == 0) {
                    composerStartRestartGroup.startReplaceGroup(406880005);
                    strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_ONLY_ONE_ROUTE_FOUND, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (iOrdinal != 1) {
                        composerStartRestartGroup.startReplaceGroup(406876477);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new h.i();
                    }
                    composerStartRestartGroup.startReplaceGroup(406884713);
                    strB = com.waze.ui.r.a.c.c.b(R.string.ALT_ROUTES_V2_ERROR_CALCULATING_ROUTES, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-271386473);
                composerStartRestartGroup.endReplaceGroup();
                strB = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            boolean zChanged = composerStartRestartGroup.changed(strB) | composerStartRestartGroup.changedInstance(context);
            ak akVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || akVarRememberedValue == Composer.Companion.getEmpty()) {
                akVarRememberedValue = new ak(strB, context, (h.c.e) null, 2);
                composerStartRestartGroup.updateRememberedValue(akVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(strB, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) akVarRememberedValue, composerStartRestartGroup, 0);
            if (h.g.b.x.n(rVar.a(), l.f18678a)) {
                composerStartRestartGroup.startReplaceGroup(-2094635035);
                H(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-2094602361);
                composerStartRestartGroup.endReplaceGroup();
            }
            boolean zB = rVar.b();
            int i6 = bx.f18637a;
            modifier2 = modifier;
            AnimatedVisibilityKt.AnimatedVisibility(zB, modifier2, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, (h.g.a.q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, h.ab>) bx.a(), composerStartRestartGroup, (i3 & 112) | 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(rVar, modifier2, i2, 7));
        }
    }

    private static void aa(Modifier modifier, com.waze.c.e.a.c cVar, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-902697156);
        int i5 = 1;
        if (i4 == 0) {
            modifier2 = modifier;
            i3 = i2 | (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4);
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(cVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-902697156, i3, -1, "com.waze.alternate_routes.presentation.AlternativeRoutesRecenterMapButton (AlternateRoutesScreenV2.kt:644)");
            }
            int iMo2127toPx0680j_4 = (int) ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo2127toPx0680j_4(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(modifier2, 0.0f, 0.0f, 16.0f, 0.0f, 11, null);
            boolean z = !cVar.e();
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 0, EasingFunctionsKt.getEaseInOutQuint(), 2, null);
            boolean zChanged = composerStartRestartGroup.changed(iMo2127toPx0680j_4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new u(iMo2127toPx0680j_4, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EnterTransition enterTransitionSlideInHorizontally = EnterExitTransitionKt.slideInHorizontally(tweenSpecTween$default, (h.g.a.l) objRememberedValue);
            TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(DisplayStrings.DS_ROUTE_SETTINGS_AVOID_FERRIES_OPTION_TITLE, 0, EasingFunctionsKt.getEaseInOutQuint(), 2, null);
            boolean zChanged2 = composerStartRestartGroup.changed(iMo2127toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new u(iMo2127toPx0680j_4, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, modifierM2759paddingqDBjuR0$default, enterTransitionSlideInHorizontally, EnterExitTransitionKt.slideOutHorizontally(tweenSpecTween$default2, (h.g.a.l) objRememberedValue2), (String) null, ComposableLambdaKt.rememberComposableLambda(-1218304156, true, new com.waze.ads.c.a(cVar, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(modifier, cVar, i2, 5, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h ab(State state) {
        return (h) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static de ac(com.waze.modules.c.j jVar) {
        com.waze.c.d.ai aiVar = com.waze.c.d.ai.f18290a;
        com.waze.c.d.aj ajVar = com.waze.c.d.aj.f18302a;
        com.waze.c.d.ak akVar = com.waze.c.d.ak.f18310a;
        com.waze.c.d.al alVar = com.waze.c.d.al.f18313a;
        switch (jVar.ordinal()) {
            case 0:
                return de.MAP_CHAT;
            case 1:
                return de.POLICE;
            case 2:
                return de.CRASH;
            case 3:
                return de.JAM;
            case 4:
                return de.TRAFFIC_INFO;
            case 5:
                return de.HAZARD;
            case 6:
                return de.MISC;
            case 7:
                return de.ALERTER_TYPE_UNSPECIFIED;
            case 8:
                return de.ALERTER_TYPE_UNSPECIFIED;
            case 9:
                return de.ALERTER_TYPE_UNSPECIFIED;
            case 10:
                return de.CAMERA;
            case 11:
                return de.ALERTER_TYPE_UNSPECIFIED;
            case 12:
                return de.ROAD_CLOSED;
            case 13:
                return de.ALERTER_TYPE_UNSPECIFIED;
            case 14:
                return de.SYSTEM_ROAD_CLOSED;
            case 15:
                return de.SOS;
            case 16:
                return de.PERSONAL_SAFETY;
            default:
                throw new h.i();
        }
    }

    static h.ab b(int i2, Composer composer) {
        H(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ com.waze.ui.b.bb d(com.waze.c.d.m mVar) {
        if (mVar.c().r().isEmpty()) {
            return null;
        }
        if ((mVar instanceof com.waze.c.d.l) && mVar.c().d() != null) {
            return null;
        }
        cu cuVar = (cu) h.a.i.P(mVar.c().r());
        return new com.waze.ui.b.bb(I(cuVar.a()), I(h.o.a.q(mVar.c().b(), cuVar.a())));
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.waze.asks.av e(com.waze.jni.protos.asks.WazeAsksQuestion r20) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.cl.e(com.waze.jni.protos.asks.WazeAsksQuestion):com.waze.asks.av");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.waze.jni.protos.asks.WazeAsksQuestion i(com.waze.asks.av r8) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.c.e.cl.i(com.waze.asks.av):com.waze.jni.protos.asks.WazeAsksQuestion");
    }

    public static al j(bk bkVar, Composer composer) {
        h.g.b.x.f(bkVar, "alternateRoutesViewModelV2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(100448765, 0, -1, "com.waze.alternate_routes.presentation.rememberAlternateRoutesScreenV2State (AlternateRoutesScreenV2State.kt:54)");
        }
        com.waze.ui.b.a aVarA = com.waze.ui.b.b.a(com.waze.ui.b.e.f42052a, composer);
        int i2 = 2;
        com.waze.ui.b.o oVar = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2 ? com.waze.ui.b.o.f42080b : com.waze.ui.b.o.f42079a;
        boolean zChanged = composer.changed(bkVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new com.airbnb.lottie.b.v(bkVar, 20);
            composer.updateRememberedValue(objRememberedValue);
        }
        Object obj = (h.g.a.a) objRememberedValue;
        int i3 = com.waze.ui.b.n.f42077a;
        h.g.b.x.f(oVar, "initialValue");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1779021423, DisplayStrings.DS_DIRT_ROADS, -1, "com.waze.ui.alternate_routes.rememberMapListSegmentedSwitchState (MapListSegmentedSwitch.kt:203)");
        }
        Object[] objArr = new Object[0];
        Object objRememberedValue2 = composer.rememberedValue();
        int i4 = 5;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new com.waze.ui.a.v(i4);
            composer.updateRememberedValue(objRememberedValue2);
        }
        h.g.a.p pVar = (h.g.a.p) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new com.waze.trip_overview.cj(17);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Saver saverListSaver = ListSaverKt.listSaver(pVar, (h.g.a.l) objRememberedValue3);
        boolean zChanged2 = composer.changed(oVar.ordinal()) | composer.changed(obj);
        Object objRememberedValue4 = composer.rememberedValue();
        byte[] bArr = null;
        int i5 = 1;
        if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new com.waze.ui.t(oVar, obj, i5, bArr);
            composer.updateRememberedValue(objRememberedValue4);
        }
        com.waze.ui.b.p pVar2 = (com.waze.ui.b.p) RememberSaveableKt.m7615rememberSaveable(objArr, saverListSaver, (h.g.a.a) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        com.waze.ui.b.o oVarA = pVar2.a();
        boolean zChanged3 = composer.changed(pVar2) | composer.changed(bkVar);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
            objRememberedValue5 = (h.g.a.p) new y(pVar2, bkVar, (h.c.e) null, 5);
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.LaunchedEffect(oVarA, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue5, composer, 0);
        boolean zChanged4 = composer.changed(pVar2) | composer.changed(bkVar) | composer.changed(aVarA);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChanged4 || objRememberedValue6 == Composer.Companion.getEmpty()) {
            Object alVar = new al(pVar2, aVarA, bkVar.h(), new com.waze.ads.b(bkVar, i5), new com.waze.ads.b(bkVar, i2), new com.airbnb.lottie.b.q(bkVar, 18), new com.airbnb.lottie.b.q(bkVar, 19));
            composer.updateRememberedValue(alVar);
            objRememberedValue6 = alVar;
        }
        al alVar2 = (al) objRememberedValue6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return alVar2;
    }

    public static /* synthetic */ h.ab k(al alVar, h.g.a.a aVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(844446429, i2, -1, "com.waze.alternate_routes.presentation.PortraitAlternateRoutesScreenV2.<anonymous>.<anonymous> (AlternateRoutesScreenV2.kt:325)");
            }
            bi biVarO = O(state);
            boolean zChanged = composer.changed(alVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.airbnb.lottie.b.v(alVar, 18);
                composer.updateRememberedValue(objRememberedValue);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue;
            boolean zChanged2 = composer.changed(alVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.airbnb.lottie.b.v(alVar, 19);
                composer.updateRememberedValue(objRememberedValue2);
            }
            P(alVar, biVarO, aVar2, (h.g.a.a) objRememberedValue2, aVar, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab l(al alVar, h.g.a.a aVar, State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-397175671, i2, -1, "com.waze.alternate_routes.presentation.LandscapeAlternateRoutesScreenV2.<anonymous>.<anonymous>.<anonymous> (AlternateRoutesScreenV2.kt:186)");
            }
            bi biVarN = N(state);
            boolean zChanged = composer.changed(alVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.airbnb.lottie.b.v(alVar, 17);
                composer.updateRememberedValue(objRememberedValue);
            }
            P(alVar, biVarN, null, (h.g.a.a) objRememberedValue, aVar, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static void m(al alVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(alVar, "alternateRoutesScreenV2State");
        h.g.b.x.f(lVar, "onNavigationStopped");
        h.g.b.x.f(aVar, "onBackClicked");
        h.g.b.x.f(aVar2, "onNavigateCtaClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(281551665);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(281551665, i3, -1, "com.waze.alternate_routes.presentation.AlternateRoutesScreenV2 (AlternateRoutesScreenV2.kt:109)");
            }
            int i5 = i3 >> 3;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, i5 & 14);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            int i6 = i3 & 14;
            boolean zChangedInstance = (i6 == 4) | composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            ag agVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || agVarRememberedValue == Composer.Companion.getEmpty()) {
                agVarRememberedValue = new ag(alVar, lifecycleOwner, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(agVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(alVar, lifecycleOwner, (h.g.a.p) agVarRememberedValue, composerStartRestartGroup, i6);
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 2) {
                composerStartRestartGroup.startReplaceGroup(-364739612);
                n(alVar, aVar2, aVar, composerStartRestartGroup, (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i3 >> 6) & 112) | i6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-364562075);
                o(alVar, aVar, aVar2, composerStartRestartGroup, (i5 & 112) | i6 | (i5 & DisplayStrings.DS_TAP_TO_VERIFY));
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.ui.aa.c cVarD = ((bi) SnapshotStateKt.collectAsState(alVar.e(), null, composerStartRestartGroup, 0, 1).getValue()).b().d();
            if (cVarD == null) {
                composerStartRestartGroup.startReplaceGroup(-364251549);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-364251548);
                com.waze.ui.n.e.g(cVarD.d(), cVarD.c(), cVarD.b(), cVarD.a(), cVarD.f(), cVarD.g(), cVarD.e(), cVarD.h(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b((Object) alVar, (Object) lVar, aVar, aVar2, i2, 1));
        }
    }

    public static void n(al alVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        byte[] bArr;
        h.g.b.x.f(alVar, "alternateRoutesScreenV2State");
        h.g.b.x.f(aVar, "onNavigateCtaClicked");
        h.g.b.x.f(aVar2, "onBackClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-849232861);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-849232861, i3, -1, "com.waze.alternate_routes.presentation.LandscapeAlternateRoutesScreenV2 (AlternateRoutesScreenV2.kt:155)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            State stateCollectAsState = SnapshotStateKt.collectAsState(alVar.e(), null, composerStartRestartGroup, 0, 1);
            int i6 = (i3 << 3) & 112;
            T(N(stateCollectAsState), alVar, composerStartRestartGroup, i6);
            Y(N(stateCollectAsState), alVar, composerStartRestartGroup, i6);
            Q(N(stateCollectAsState), alVar, aVar2, composerStartRestartGroup, i6 | (i3 & DisplayStrings.DS_TAP_TO_VERIFY));
            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, layoutDirection), 0.0f, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, layoutDirection), 0.0f, 10, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifierWeight$default = RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.waze.ui.b.a aVarC = alVar.c();
            int i7 = i3 & 14;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(527813839, i7, -1, "com.waze.alternate_routes.presentation.alternativeRoutesLandscapeLayoutAnchors (AlternateRoutesScreenV2.kt:546)");
            }
            float fMo2704calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2704calculateBottomPaddingD9Ej5fM();
            com.waze.ui.b.f fVarC = com.waze.ui.b.d.c(((Dp) alVar.a().getValue()).m11178unboximpl() + 16.0f + 16.0f, (((Dp) alVar.b().getValue()).m11178unboximpl() * 1.1f) + fMo2704calculateBottomPaddingD9Ej5fM, ((Dp) alVar.b().getValue()).m11178unboximpl() + fMo2704calculateBottomPaddingD9Ej5fM, composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            byte[] bArr2 = null;
            com.waze.ui.b.d.d(null, aVarC, fVarC, ComposableLambdaKt.rememberComposableLambda(-397175671, true, new x(alVar, aVar, stateCollectAsState, i5), composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, paddingValuesAsPaddingValues.mo2707calculateTopPaddingD9Ej5fM(), 16.0f, 0.0f, 8, null);
            com.waze.main_screen.l.b.j jVarD = N(stateCollectAsState).d();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2062856941, 0, -1, "com.waze.alternate_routes.presentation.rememberNavigationInstructionsZIndex (AlternateRoutesScreenV2.kt:789)");
            }
            boolean zChanged = composerStartRestartGroup.changed(jVarD);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = Float.valueOf(jVarD == null ? -1.0f : 1.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fFloatValue = ((Number) objRememberedValue).floatValue();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifierM2759paddingqDBjuR0$default2, fFloatValue);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierZIndex);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.p.b.a.b.t tVarF = N(stateCollectAsState).f();
            Modifier.Companion companion = Modifier.Companion;
            boolean z = i7 == 4;
            boolean zChanged2 = composerStartRestartGroup.changed(density) | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.c.d.a(alVar, density, 3, bArr2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            com.waze.main_screen.p.b.a.a.c.c(tVarF, SizeKt.fillMaxWidth$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (h.g.a.l) objRememberedValue2), 0.0f, 1, null), com.waze.main_screen.p.b.a.b.k.f27119b, composerStartRestartGroup, 384);
            com.waze.main_screen.l.b.j jVarD2 = N(stateCollectAsState).d();
            if (jVarD2 == null) {
                composerStartRestartGroup.startReplaceGroup(-299618155);
                composerStartRestartGroup.endReplaceGroup();
                bArr = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(-299618154);
                bArr = null;
                com.waze.main_screen.l.b.c.c(jVarD2, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, null, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Modifier modifierWeight$default2 = RowScope.CC.weight$default(rowScopeInstance, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, bArr), 1.0f, false, 2, null);
            boolean zChangedInstance = z | composerStartRestartGroup.changedInstance(view);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.c.d.a(alVar, view, 4, bArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierWeight$default2, (h.g.a.l) objRememberedValue3);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB4 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            h.g.a.a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB4), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            aa(PaddingKt.m2759paddingqDBjuR0$default(boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getBottomEnd()), 0.0f, 0.0f, 0.0f, 16.0f, 7, null), N(stateCollectAsState).b().b(), composerStartRestartGroup, 0);
            S(PaddingKt.m2755padding3ABfNKs(boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 8.0f), N(stateCollectAsState), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(alVar, aVar, aVar2, i2, 1, null));
        }
    }

    public static void o(al alVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4;
        State state;
        int i5;
        Modifier modifier;
        int i6;
        int i7;
        Modifier.Companion companionJ;
        byte[] bArr;
        h.g.b.x.f(alVar, "alternateRoutesScreenV2State");
        h.g.b.x.f(aVar, "onBackClicked");
        h.g.b.x.f(aVar2, "onNavigateCtaClicked");
        int i8 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(683814047);
        if (i8 == 0) {
            i3 = (true != composerStartRestartGroup.changed(alVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(683814047, i3, -1, "com.waze.alternate_routes.presentation.PortraitAlternateRoutesScreenV2 (AlternateRoutesScreenV2.kt:247)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            State stateCollectAsState = SnapshotStateKt.collectAsState(alVar.e(), null, composerStartRestartGroup, 0, 1);
            int i9 = i3 << 3;
            int i10 = i9 & 112;
            Y(O(stateCollectAsState), alVar, composerStartRestartGroup, i10);
            U(O(stateCollectAsState), alVar, composerStartRestartGroup, i10);
            V(O(stateCollectAsState), alVar, composerStartRestartGroup, i10);
            W(O(stateCollectAsState), alVar, composerStartRestartGroup, i10);
            int i11 = i3 & 14;
            X(alVar, composerStartRestartGroup, i11);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6), density).mo2707calculateTopPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            if (alVar.d().a() == com.waze.ui.b.o.f42080b) {
                composerStartRestartGroup.startReplaceGroup(475410112);
                Modifier.Companion companion = Modifier.Companion;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new android.support.v4.a.a.c(17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                state = stateCollectAsState;
                modifier = modifierFillMaxSize$default;
                i6 = i9;
                i5 = i11;
                i4 = i3;
                i7 = -1;
                companionJ = com.waze.z.a.be.J(companion, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 196662, 14);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                i4 = i3;
                state = stateCollectAsState;
                i5 = i11;
                modifier = modifierFillMaxSize$default;
                i6 = i9;
                i7 = -1;
                composerStartRestartGroup.startReplaceGroup(475481505);
                composerStartRestartGroup.endReplaceGroup();
                companionJ = Modifier.Companion;
            }
            Modifier modifierThen = modifier.then(companionJ);
            boolean zChanged = composerStartRestartGroup.changed(density);
            boolean z = i5 == 4;
            boolean z2 = zChanged | z;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.c.d.a(density, alVar, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierThen, (h.g.a.l) objRememberedValue2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Q(O(state), alVar, aVar, composerStartRestartGroup, i6 & 1008);
            aa(PaddingKt.m2759paddingqDBjuR0$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomEnd()), 0.0f, 0.0f, 0.0f, ((Dp) alVar.b().getValue()).m11178unboximpl() + 16.0f + 16.0f, 7, null), O(state).b().b(), composerStartRestartGroup, 0);
            R(alVar, composerStartRestartGroup, i5);
            Z(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getTopCenter()), density, alVar, composerStartRestartGroup, (i4 << 6) & DisplayStrings.DS_TAP_TO_VERIFY);
            com.waze.ui.b.a aVarC = alVar.c();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947753185, i5, i7, "com.waze.alternate_routes.presentation.alternativeRoutesPortraitLayoutAnchors (AlternateRoutesScreenV2.kt:530)");
            }
            float fMo2704calculateBottomPaddingD9Ej5fM = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSafeContent(WindowInsets.Companion, composerStartRestartGroup, 6), composerStartRestartGroup, 0).mo2704calculateBottomPaddingD9Ej5fM();
            com.waze.ui.b.f fVarC = com.waze.ui.b.d.c(((Dp) alVar.a().getValue()).m11178unboximpl() + 82.0f, (((Dp) alVar.b().getValue()).m11178unboximpl() * 1.2f) + fMo2704calculateBottomPaddingD9Ej5fM, ((Dp) alVar.b().getValue()).m11178unboximpl() + fMo2704calculateBottomPaddingD9Ej5fM, composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            State state2 = state;
            com.waze.ui.b.d.d(null, aVarC, fVarC, ComposableLambdaKt.rememberComposableLambda(844446429, true, new x(alVar, aVar2, state2, 0), composerStartRestartGroup, 54), composerStartRestartGroup, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS);
            S(PaddingKt.m2759paddingqDBjuR0$default(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomCenter()), 0.0f, 0.0f, 0.0f, ((Dp) alVar.b().getValue()).m11178unboximpl() + 8.0f, 7, null), O(state2), composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.waze.main_screen.p.b.a.b.t tVarF = O(state2).f();
            Modifier.Companion companion3 = Modifier.Companion;
            boolean zChanged2 = composerStartRestartGroup.changed(density) | z;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                bArr = null;
                objRememberedValue3 = new com.waze.c.d.a(alVar, density, 5, bArr);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                bArr = null;
            }
            com.waze.main_screen.p.b.a.a.c.c(tVarF, SizeKt.fillMaxWidth$default(OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (h.g.a.l) objRememberedValue3), 0.0f, 1, bArr), com.waze.main_screen.p.b.a.b.k.f27119b, composerStartRestartGroup, 384);
            com.waze.main_screen.l.b.j jVarD = O(state2).d();
            if (jVarD == null) {
                composerStartRestartGroup.startReplaceGroup(-364499361);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-364499360);
                com.waze.main_screen.l.b.c.c(jVarD, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, bArr), null, null, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            com.waze.main_screen.aa.c.b(Color.m8218boximpl(com.waze.bz.a.d(composerStartRestartGroup, 0).c()), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(alVar, aVar, aVar2, i2, 2, null));
        }
    }

    static h.ab p(al alVar, bi biVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, int i3, Composer composer) {
        P(alVar, biVar, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return h.ab.f48028a;
    }

    static h.ab q(bi biVar, al alVar, h.g.a.a aVar, int i2, Composer composer) {
        Q(biVar, alVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab r(Modifier modifier, Density density, al alVar, int i2, Composer composer) {
        Z(modifier, density, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab s(al alVar, int i2, Composer composer) {
        R(alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab t(Modifier modifier, com.waze.c.e.a.c cVar, int i2, Composer composer) {
        aa(modifier, cVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab u(Modifier modifier, bi biVar, int i2, Composer composer) {
        S(modifier, biVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab v(bi biVar, al alVar, int i2, Composer composer) {
        T(biVar, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab w(bi biVar, al alVar, int i2, Composer composer) {
        U(biVar, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab x(bi biVar, al alVar, int i2, Composer composer) {
        V(biVar, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab y(bi biVar, al alVar, int i2, Composer composer) {
        W(biVar, alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static h.ab z(al alVar, int i2, Composer composer) {
        X(alVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    private cl() {
        throw null;
    }
}
