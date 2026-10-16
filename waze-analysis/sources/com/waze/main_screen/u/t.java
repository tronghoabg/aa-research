package com.waze.main_screen.u;

import com.waze.navigate.ei;
import com.waze.navigate.location_preview.ba;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class t implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f27736a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27737b;

    t(w wVar, int i2) {
        this.f27737b = i2;
        this.f27736a = wVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f27737b == 0) {
            w wVar = this.f27736a;
            if (!com.waze.a.af.i(wVar.f27753j)) {
                wVar.b(com.waze.ui.u.l.f43461a);
            }
            return h.ab.f48028a;
        }
        if (((ei) obj) == ei.f31311b) {
            w wVar2 = this.f27736a;
            if (!wVar2.s) {
                wVar2.f27751h.d(ba.i((ba) wVar2.n.c().d()), com.waze.shared_infra.h.b.h(wVar2.m), true, ac.f27667f, null, wVar2.f27752i.e());
            }
            wVar2.close();
        }
        return h.ab.f48028a;
    }
}
