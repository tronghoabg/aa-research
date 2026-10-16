package com.waze.asks;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.waze.R;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.bb f15573a;

    /* renamed from: b, reason: collision with root package name */
    private final x f15574b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f15575c;

    /* renamed from: d, reason: collision with root package name */
    private br f15576d;

    /* renamed from: e, reason: collision with root package name */
    private as f15577e;

    /* renamed from: f, reason: collision with root package name */
    private final bm f15578f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f15579g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f15580h;

    /* renamed from: i, reason: collision with root package name */
    private final bm f15581i;

    /* renamed from: j, reason: collision with root package name */
    private final bq f15582j;

    public bj(com.waze.reports_v2.presentation.bb bbVar, x xVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(bbVar, "categoriesTransformer");
        h.g.b.x.f(xVar, "config");
        h.g.b.x.f(eVar, "logger");
        this.f15573a = bbVar;
        this.f15574b = xVar;
        this.f15575c = eVar;
        this.f15578f = bu.e(0, 1, kotlinx.coroutines.a.a.f51272b, 1);
        bn bnVarB = ck.b(null);
        this.f15579g = bnVarB;
        this.f15580h = kotlinx.coroutines.b.ai.U(bnVarB);
        bm bmVarE = bu.e(1, 0, null, 6);
        this.f15581i = bmVarE;
        this.f15582j = kotlinx.coroutines.b.ai.S(bmVarE);
    }

    static final h.ab k(bj bjVar) {
        bjVar.f15576d = null;
        return h.ab.f48028a;
    }

    private final void l(d dVar) {
        as asVar = this.f15577e;
        if (dVar == null || asVar == null) {
            o(ay.f15552a);
        } else {
            o(new bb(asVar, dVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        as asVar = this.f15577e;
        if (asVar != null) {
            o(new az(asVar));
        } else {
            o(ay.f15552a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(bd bdVar) {
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(this), null, null, new be(this, bdVar, null), 3);
    }

    private final void o(bd bdVar) {
        n(bdVar);
        br brVar = this.f15576d;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f15577e = null;
    }

    public final bq e() {
        return this.f15582j;
    }

    public final ch f() {
        return this.f15580h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(com.waze.ui.d.k kVar) {
        c cVar;
        h.g.b.x.f(kVar, NotificationCompat.CATEGORY_EVENT);
        if (kVar instanceof com.waze.ui.d.g) {
            n(new bc(((com.waze.ui.d.g) kVar).a()));
            return;
        }
        if (h.g.b.x.n(kVar, com.waze.ui.d.j.f42147a)) {
            as asVar = this.f15577e;
            if (asVar != null) {
                o(new ba(asVar));
                return;
            } else {
                o(ay.f15552a);
                return;
            }
        }
        if (h.g.b.x.n(kVar, com.waze.ui.d.i.f42146a)) {
            m();
            return;
        }
        if (!(kVar instanceof com.waze.ui.d.h)) {
            throw new h.i();
        }
        if (!this.f15574b.c()) {
            com.waze.ui.d.b bVarA = ((com.waze.ui.d.h) kVar).a();
            com.waze.ui.d.e eVarB = bVarA.b();
            if (eVarB instanceof com.waze.ui.d.d) {
                com.waze.reports_v2.b.at atVarD = this.f15573a.d(((com.waze.ui.d.d) eVarB).a().c());
                cVar = atVarD != null ? new b(bVarA.c(), atVarD, bVarA.a()) : null;
            } else {
                if (!(eVarB instanceof com.waze.ui.d.c)) {
                    throw new h.i();
                }
                cVar = new c(bVarA.c(), bVarA.a());
            }
            l(cVar);
            return;
        }
        as asVar2 = this.f15577e;
        if (asVar2 != null) {
            Iterator it = asVar2.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (h.g.b.x.n(((d) next).c(), ((com.waze.ui.d.h) kVar).a().c())) {
                    dVar = next;
                    break;
                }
            }
            dVar = dVar;
        }
        l(dVar);
    }

    public final void j(as asVar) {
        com.waze.ui.ac.j jVar;
        int i2;
        com.waze.ui.d.b bVar;
        h.g.b.x.f(asVar, "question");
        br brVar = this.f15576d;
        if (brVar != null && brVar.bZ()) {
            return;
        }
        List listH = asVar.h();
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            com.waze.ui.d.b bVar2 = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    o(ay.f15552a);
                    return;
                }
                this.f15577e = asVar;
                bn bnVar = this.f15579g;
                e eVarC = asVar.c();
                e eVar = e.f15585a;
                int iOrdinal = eVarC.ordinal();
                if (iOrdinal == 0) {
                    jVar = new com.waze.ui.ac.j(R.string.WAZE_ASKS_ENRICH_ALERT_TITLE_WHAT_DO_YOU_SEE);
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    jVar = new com.waze.ui.ac.j(R.string.WAZE_ASKS_ENRICH_ALERT_TITLE_ARE_LANES_BLOCKED);
                }
                com.waze.ui.d.f fVar = new com.waze.ui.d.f(jVar, arrayList2);
                Instant instantNow = Instant.now();
                h.g.b.x.e(instantNow, "now(...)");
                bnVar.e(new com.waze.ui.d.t(fVar, instantNow, this.f15574b.a()));
                bj bjVar = this;
                kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bjVar), null, null, new bg(this, (h.c.e) null, 0), 3);
                br brVarZ = kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(bjVar), new bh(CoroutineExceptionHandler.f51269c, this), null, new bi(this, null), 2);
                this.f15576d = brVarZ;
                if (brVarZ != null) {
                    brVarZ.bY(new ax(this, i3));
                    return;
                }
                return;
            }
            d dVar = (d) it.next();
            if (dVar instanceof b) {
                b bVar3 = (b) dVar;
                com.waze.ui.w.b.au auVarE = this.f15573a.e(bVar3.b());
                if (auVarE != null) {
                    i2 = i4 + 1;
                    bVar = new com.waze.ui.d.b(i4, bVar3.c(), new com.waze.ui.d.d(auVarE), bVar3.a());
                    i4 = i2;
                    bVar2 = bVar;
                }
            } else if (dVar instanceof a) {
                a aVar = (a) dVar;
                com.waze.ui.w.b.au auVarE2 = this.f15573a.e(aVar.b());
                if (auVarE2 != null) {
                    i2 = i4 + 1;
                    bVar = new com.waze.ui.d.b(i4, aVar.c(), new com.waze.ui.d.d(auVarE2), aVar.a());
                    i4 = i2;
                    bVar2 = bVar;
                }
            } else {
                if (!(dVar instanceof c)) {
                    throw new h.i();
                }
                c cVar = (c) dVar;
                com.waze.ui.d.b bVar4 = new com.waze.ui.d.b(i4, cVar.c(), new com.waze.ui.d.c(R.string.WAZE_ASKS_NOT_THERE), cVar.a());
                i4++;
                bVar2 = bVar4;
            }
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
        }
    }
}
