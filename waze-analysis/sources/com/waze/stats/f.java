package com.waze.stats;

import com.google.v.du;
import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ du f40594b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40595c;

    public /* synthetic */ f(Object obj, du duVar, int i2) {
        this.f40595c = i2;
        this.f40593a = obj;
        this.f40594b = duVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f40595c;
        if (i2 == 0) {
            g.reportMetricJNI$lambda$0((g) this.f40593a, (l.b.c) this.f40594b);
        } else {
            if (i2 == 1) {
                a.reportAdEventJNI$lambda$0((a) this.f40593a, (l.a.s) this.f40594b);
                return;
            }
            du duVar = this.f40594b;
            if (i2 != 2) {
                au.reportStatsJNI$lambda$0((au) this.f40593a, (brf) duVar);
            } else {
                au.reportUnauthenticatedStatsJNI$lambda$0((au) this.f40593a, (bri) duVar);
            }
        }
    }
}
