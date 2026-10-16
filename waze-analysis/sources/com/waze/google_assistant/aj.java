package com.waze.google_assistant;

import android.content.DialogInterface;
import com.waze.jni.protos.navigate.DriveTo;
import l.a.alx;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class aj implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24096b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f24097c;

    public /* synthetic */ aj(com.waze.av.b.u uVar, com.waze.av.b.n nVar, int i2) {
        this.f24097c = i2;
        this.f24096b = uVar;
        this.f24095a = nVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [h.g.a.a, java.lang.Object] */
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i2 = this.f24097c;
        if (i2 == 0) {
            an.i(am.f24107d, (al) this.f24095a, (com.waze.settings.tree.a.a) this.f24096b);
            return;
        }
        if (i2 == 1) {
            com.waze.ab.s.b((com.waze.ab.s) this.f24095a, this.f24096b, dialogInterface);
            return;
        }
        Object obj = this.f24095a;
        if (i2 == 2) {
            com.waze.av.b.n nVar = (com.waze.av.b.n) obj;
            ((com.waze.av.b.u) this.f24096b).f16007c.addDangerZoneStat(com.waze.ac.e.p(nVar).getLongitudeInt(), com.waze.ac.e.p(nVar).getLatitudeInt(), alx.CLOSE, DriveTo.DangerZoneStatType.FAVORITE_IN_DANGER_ZONE);
        } else {
            ((com.waze.uid.activities.b) obj).g(com.waze.uid.stats.h.f44745a);
            this.f24096b.invoke();
        }
    }

    public /* synthetic */ aj(Object obj, Object obj2, int i2) {
        this.f24097c = i2;
        this.f24095a = obj;
        this.f24096b = obj2;
    }
}
