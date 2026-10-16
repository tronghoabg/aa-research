package com.waze.navigate.location_preview;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.la;
import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.navigate.et;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bn extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final s f31667a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.j f31668b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f31669c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31670d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31671e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f31672f;

    /* renamed from: g, reason: collision with root package name */
    private final ch f31673g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f31674h;

    public bn(az azVar, ak akVar, s sVar, com.waze.shared_infra.o.a aVar, com.waze.sharedui.j jVar, la laVar, com.waze.ev.n nVar, cj cjVar, com.waze.shared_infra.q.j jVar2, com.waze.shared_infra.q.e eVar, eo eoVar, p pVar) {
        h.g.b.x.f(azVar, "params");
        h.g.b.x.f(akVar, "fetcher");
        h.g.b.x.f(sVar, "eventHandler");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(jVar, "dayOfWeekFormat");
        h.g.b.x.f(laVar, "servicesRepository");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(cjVar, "etaStateInterface");
        h.g.b.x.f(jVar2, "dateFormat");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(eoVar, "navigationStatus");
        h.g.b.x.f(pVar, "locationPreviewConfig");
        this.f31667a = sVar;
        this.f31668b = jVar;
        bn bnVar = this;
        ch chVarA = akVar.a(azVar, ViewModelKt.getViewModelScope(bnVar));
        this.f31669c = chVarA;
        kotlinx.coroutines.b.bn bnVarB = ck.b(et.j((ay) chVarA.d(), laVar, aVar, jVar, nVar, eVar, jVar2, et.v(cjVar), eoVar.T(), pVar, azVar.f()));
        this.f31670d = bnVarB;
        kotlinx.coroutines.b.bn bnVarB2 = ck.b(et.E((ay) chVarA.d()));
        this.f31671e = bnVarB2;
        this.f31672f = bnVarB;
        this.f31673g = bnVarB2;
        this.f31674h = kotlinx.coroutines.b.bu.e(0, 1, kotlinx.coroutines.a.a.f51272b, 1);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(chVarA, new bl(this, laVar, aVar, nVar, eVar, jVar2, cjVar, eoVar, pVar, azVar, null)), ViewModelKt.getViewModelScope(bnVar));
    }

    public final Object b(com.waze.ui.m.cb cbVar, h.c.e eVar) {
        Object objA = this.f31667a.a(cbVar, this.f31670d, (ay) this.f31669c.d(), this.f31674h, eVar);
        return objA == h.c.a.a.f48038a ? objA : h.ab.f48028a;
    }

    public final kotlinx.coroutines.b.bm c() {
        return this.f31674h;
    }

    public final ch e() {
        return this.f31673g;
    }

    public final ch f() {
        return this.f31672f;
    }

    public final void g(boolean z) {
        if (z && ((ay) this.f31669c.d()).L()) {
            kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new bm(this, (h.c.e) null, 0), 3);
        }
    }
}
