package com.waze.asks;

import com.google.v.du;
import com.waze.hw;
import com.waze.jni.protos.asks.EnrichAlertQuestion;
import com.waze.jni.protos.asks.FeedbackAnswer;
import com.waze.jni.protos.asks.MultiAskAnswer;
import com.waze.jni.protos.asks.WazeAsksQuestion;
import com.waze.jni.protos.asks.WazeAsksTrigger;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ao implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ar f15512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du f15513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du f15514c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f15515d;

    public /* synthetic */ ao(ar arVar, com.waze.ap.a.a.ai aiVar, WazeAsksTrigger wazeAsksTrigger, int i2) {
        this.f15515d = i2;
        this.f15512a = arVar;
        this.f15514c = aiVar;
        this.f15513b = wazeAsksTrigger;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f15515d;
        if (i2 == 0) {
            du duVar = this.f15514c;
            ar.sendFeedbackAnswer$lambda$0(this.f15512a, (WazeAsksQuestion) this.f15513b, (FeedbackAnswer) duVar);
            return null;
        }
        if (i2 == 1) {
            du duVar2 = this.f15514c;
            ar.sendMultiAskAnswer$lambda$0(this.f15512a, (WazeAsksQuestion) this.f15513b, (MultiAskAnswer) duVar2);
            return null;
        }
        if (i2 != 2) {
            du duVar3 = this.f15514c;
            ar.sendEnrichAlertAnswer$lambda$0(this.f15512a, (WazeAsksQuestion) this.f15513b, (EnrichAlertQuestion.Answer) duVar3);
            return null;
        }
        du duVar4 = this.f15513b;
        ar.setTriggerByQuestionResult$lambda$0(this.f15512a, (com.waze.ap.a.a.ai) this.f15514c, (WazeAsksTrigger) duVar4);
        return null;
    }

    public /* synthetic */ ao(ar arVar, WazeAsksQuestion wazeAsksQuestion, du duVar, int i2) {
        this.f15515d = i2;
        this.f15512a = arVar;
        this.f15513b = wazeAsksQuestion;
        this.f15514c = duVar;
    }
}
