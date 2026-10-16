package com.waze;

import android.content.Intent;
import com.waze.jni.protos.RtAlertsThumbsUpDataProto;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class fw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23968a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23970c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23971d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f23972e;

    public /* synthetic */ fw(com.waze.map.g.g gVar, com.google.android.datatransport.runtime.x xVar, int i2, Runnable runnable, int i3) {
        this.f23972e = i3;
        this.f23970c = gVar;
        this.f23969b = xVar;
        this.f23968a = i2;
        this.f23971d = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f23972e;
        if (i2 == 0) {
            int i3 = this.f23968a;
            Object obj = this.f23971d;
            gb.ShowRouteCalculationErrorJNI$lambda$0((gb) this.f23969b, (String) this.f23970c, (String) obj, i3);
            return;
        }
        if (i2 == 1) {
            ?? r0 = this.f23971d;
            com.waze.map.g.g.f((com.waze.map.g.g) this.f23970c, (com.google.android.datatransport.runtime.x) this.f23969b, this.f23968a, r0);
            return;
        }
        if (i2 != 2) {
            ?? r02 = this.f23971d;
            Object obj2 = this.f23969b;
            com.waze.reports.di.y((com.waze.reports.di) this.f23970c, this.f23968a, (Intent) obj2, r02);
            return;
        }
        int i4 = this.f23968a;
        Object obj3 = this.f23971d;
        iu.openBeepPopupJNI$lambda$0((iu) this.f23969b, (RtAlertsThumbsUpDataProto) this.f23970c, (String) obj3, i4);
    }

    public /* synthetic */ fw(com.waze.reports.di diVar, int i2, Intent intent, com.waze.shared_infra.s.d dVar, int i3) {
        this.f23972e = i3;
        this.f23970c = diVar;
        this.f23968a = i2;
        this.f23969b = intent;
        this.f23971d = dVar;
    }

    public /* synthetic */ fw(Object obj, Object obj2, String str, int i2, int i3) {
        this.f23972e = i3;
        this.f23969b = obj;
        this.f23970c = obj2;
        this.f23971d = str;
        this.f23968a = i2;
    }
}
