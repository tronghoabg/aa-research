package com.waze.car_lib.j;

import androidx.car.app.navigation.NavigationManager;
import com.waze.navigate.ei;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f20243a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f20244b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ NavigationManager f20245c;

    n(r rVar, bn bnVar, NavigationManager navigationManager) {
        this.f20243a = rVar;
        this.f20244b = bnVar;
        this.f20245c = navigationManager;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objA;
        Object objA2;
        ei eiVar = ei.f31310a;
        int iOrdinal = ((ei) obj).ordinal();
        if (iOrdinal == 0) {
            this.f20243a.f20260e.a("Reporting navigation ended");
            this.f20244b.e(null);
            try {
                this.f20245c.navigationEnded();
                objA = h.ab.f48028a;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            r rVar = this.f20243a;
            Throwable thC = h.m.c(objA);
            if (thC != null) {
                com.waze.settings.tree.c.f.e(rVar.f20260e, "Failed notifying navigationEnded", thC);
            }
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            this.f20243a.f20260e.a("Reporting navigation started");
            try {
                this.f20245c.navigationStarted();
                objA2 = h.ab.f48028a;
            } catch (Throwable th2) {
                objA2 = e.b.c.a(th2);
            }
            r rVar2 = this.f20243a;
            Throwable thC2 = h.m.c(objA2);
            if (thC2 != null) {
                com.waze.settings.tree.c.f.e(rVar2.f20260e, "Failed notifying navigationStarted", thC2);
            }
            this.f20244b.e(new Long(System.currentTimeMillis()));
        }
        return h.ab.f48028a;
    }
}
