package com.waze.network.d;

import com.waze.strings.DisplayStrings;
import e.a.am;
import e.a.cm;
import e.a.cq;
import e.a.ee;
import e.a.eh;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
class i extends am {

    /* renamed from: a, reason: collision with root package name */
    private g f32202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(cq cqVar, e.a.h hVar, e.a.i iVar) {
        super(iVar.a(cqVar, hVar));
        x.f(cqVar, "method");
        x.f(iVar, "next");
        this.f32202a = new g(cqVar, hVar, iVar, new cm(), null, false, 0, null);
    }

    @Override // e.a.dj, e.a.k
    public final void a(String str, Throwable th) {
        this.f32202a = g.g(this.f32202a, null, true, 0, null, DisplayStrings.DS_GAS_PRICE_UPDATE_EDIT_PRICES);
        super.a(str, th);
    }

    @Override // e.a.dj, e.a.k
    public final void c(int i2) {
        this.f32202a = g.g(this.f32202a, null, false, i2, null, DisplayStrings.DS_PILE_UP);
        super.c(i2);
    }

    @Override // e.a.an, e.a.k
    public final void d(Object obj) {
        this.f32202a = g.g(this.f32202a, null, false, 0, obj, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_START_LISTENING_SEARCH);
        super.d(obj);
    }

    @Override // e.a.an, e.a.k
    public void e(com.waze.uid.f fVar, cm cmVar) {
        x.f(fVar, "responseListener");
        x.f(cmVar, "headers");
        this.f32202a.c().h(cmVar);
        this.f32202a = g.g(this.f32202a, fVar, false, 0, null, DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_REPORT_LABEL);
        super.e(fVar, cmVar);
    }

    public final Object h() {
        if (!this.f32202a.f()) {
            return e.a.h.s.c(this.f32202a.b(), this.f32202a.d(), this.f32202a.a(), this.f32202a.e());
        }
        eh ehVar = new eh(ee.f47402b);
        x.e(ehVar, "asRuntimeException(...)");
        throw ehVar;
    }
}
