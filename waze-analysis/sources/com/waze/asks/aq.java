package com.waze.asks;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class aq implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ar f15518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15519b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15520c;

    public /* synthetic */ aq(ar arVar, int i2, int i3) {
        this.f15520c = i3;
        this.f15518a = arVar;
        this.f15519b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f15520c;
        int i3 = this.f15519b;
        ar arVar = this.f15518a;
        if (i2 != 0) {
            ar.removeReportById$lambda$0(arVar, i3);
            return null;
        }
        ar.setTriggerByQuestionFailed$lambda$0(arVar, i3);
        return null;
    }
}
