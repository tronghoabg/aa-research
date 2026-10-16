package com.waze.rtalerts;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class t implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f35153a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f35154b;

    public /* synthetic */ t(Object obj, int i2) {
        this.f35154b = i2;
        this.f35153a = obj;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f35154b;
        if (i2 == 0) {
            return x.getRtAlertsOnRoute$lambda$0((x) this.f35153a);
        }
        if (i2 != 1) {
            Object obj = this.f35153a;
            return i2 != 2 ? x.getReportLocation$lambda$0((x) obj) : x.setAndRetrieveReportLocation$lambda$0((x) obj);
        }
        d.initNativeLayer$lambda$0((d) this.f35153a);
        return null;
    }
}
