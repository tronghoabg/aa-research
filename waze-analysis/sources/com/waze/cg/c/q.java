package com.waze.cg.c;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.an.a.u;
import h.ab;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.d.b f22341a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f22342b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.cg.d.a f22343c;

    /* renamed from: d, reason: collision with root package name */
    private final k f22344d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22345e;

    public q(com.waze.an.d.b bVar, com.waze.shared_infra.o.a aVar, com.waze.cg.d.a aVar2, k kVar) {
        x.f(bVar, "notificationInsightsService");
        x.f(aVar, "stringProvider");
        x.f(aVar2, "statSender");
        x.f(kVar, "wazeToGoalSoundPlayer");
        this.f22341a = bVar;
        this.f22342b = aVar;
        this.f22343c = aVar2;
        this.f22344d = kVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeToGoalPresenter");
        x.e(eVarD, "create(...)");
        this.f22345e = eVarD;
    }

    static final ab a(q qVar, p pVar, h.g.a.l lVar, String str) {
        qVar.f22345e.a("Live score notification Timeout. Id: ".concat(String.valueOf(pVar.e())));
        lVar.invoke(i.f22325a);
        qVar.f22343c.d(str);
        return ab.f48028a;
    }

    static final ab b(h.g.a.l lVar, q qVar, String str) {
        lVar.invoke(e.f22321a);
        qVar.f22343c.b(str);
        return ab.f48028a;
    }

    static final ab c(h.g.a.l lVar, q qVar, String str) {
        lVar.invoke(d.f22320a);
        qVar.f22343c.a(str);
        return ab.f48028a;
    }

    static final ab d(q qVar, p pVar, boolean z, h.g.a.l lVar, com.waze.an.a.k kVar, long j2) {
        qVar.f22345e.a("Live score notification onShown. Id: ".concat(String.valueOf(pVar.e())));
        if (z) {
            qVar.f22344d.a();
        }
        lVar.invoke(h.f22324a);
        com.waze.cg.d.a aVar = qVar.f22343c;
        String strD = kVar.d();
        String strC = kVar.c();
        if (strC == null) {
            strC = "";
        }
        aVar.e(strD, strC, !kVar.e().isEmpty(), Long.valueOf(h.o.a.p(j2)), qVar.f22344d.b());
        return ab.f48028a;
    }

    static final ab e(q qVar, p pVar, h.g.a.l lVar, com.waze.an.a.k kVar) {
        qVar.f22345e.a("Live score notification onEnded. Id: ".concat(String.valueOf(pVar.e())));
        lVar.invoke(f.f22322a);
        qVar.f22343c.c(kVar.d());
        return ab.f48028a;
    }

    static final ab f(q qVar, p pVar, h.g.a.l lVar) {
        qVar.f22345e.g("Live score notification onIgnored. Id: ".concat(String.valueOf(pVar.e())));
        lVar.invoke(g.f22323a);
        return ab.f48028a;
    }

    public final void g(u uVar, final p pVar, boolean z, final long j2, final boolean z2, final h.g.a.l lVar) {
        h.k kVar;
        com.waze.an.a.j jVar;
        List listH;
        String str;
        x.f(uVar, "notificationId");
        x.f(pVar, "state");
        x.f(lVar, "onEvent");
        n nVarA = pVar.a();
        if (nVarA instanceof l) {
            com.waze.cg.a.f fVarA = ((l) nVarA).a();
            com.waze.cg.a.f fVar = com.waze.cg.a.f.f22262a;
            int iOrdinal = fVarA.ordinal();
            if (iOrdinal == 0) {
                kVar = new h.k(Integer.valueOf(R.drawable.icon_waze_to_goal_kickoff), this.f22342b.c(R.string.WAZE_TO_GOAL_EVENT_TITLE_KICK_OFF, new Object[0]));
            } else {
                if (iOrdinal != 1) {
                    throw new h.i();
                }
                kVar = new h.k(Integer.valueOf(R.drawable.icon_waze_to_goal_final_whistle), this.f22342b.c(R.string.WAZE_TO_GOAL_EVENT_TITLE_FULL_TIME, new Object[0]));
            }
        } else {
            if (!(nVarA instanceof m)) {
                throw new h.i();
            }
            kVar = new h.k(Integer.valueOf(R.drawable.icon_waze_to_goal_goal), this.f22342b.c(R.string.WAZE_TO_GOAL_EVENT_TITLE_SCORE, new Object[0]));
        }
        int iIntValue = ((Number) kVar.a()).intValue();
        String str2 = ((String) kVar.b()) + " " + System.lineSeparator() + " " + (pVar.c().a() + " " + pVar.c().b() + " " + pVar.g() + "-" + pVar.d() + " " + pVar.b().b() + " " + pVar.b().a());
        com.waze.an.a.j jVar2 = new com.waze.an.a.j(j2, new b(this, pVar, lVar, str2, 0), null);
        if (z) {
            this.f22345e.a("adding FTE actions");
            com.waze.shared_infra.o.a aVar = this.f22342b;
            jVar = jVar2;
            listH = h.a.i.i(new com.waze.an.a.i(aVar.c(R.string.WAZE_TO_GOAL_HIDE_UPDATES, new Object[0]), new c(lVar, this, str2, 0), com.waze.an.a.c.f14570b, null, null), new com.waze.an.a.i(aVar.c(R.string.WAZE_TO_GOAL_KEEP_SEEING, new Object[0]), new c(lVar, this, str2, 2), new com.waze.an.a.c(true, false), jVar, null));
        } else {
            jVar = jVar2;
            listH = h.a.i.h();
        }
        List list = listH;
        n nVarA2 = pVar.a();
        m mVar = nVarA2 instanceof m ? (m) nVarA2 : null;
        if (mVar != null) {
            str = pVar.f() + " - " + mVar.a();
        } else {
            str = null;
        }
        final com.waze.an.a.k kVar2 = new com.waze.an.a.k(str2, str, Integer.valueOf(iIntValue), true != list.isEmpty() ? null : jVar, list);
        this.f22341a.b(uVar, kVar2, new h.g.a.a() { // from class: com.waze.cg.c.a
            @Override // h.g.a.a
            public final Object invoke() {
                return q.d(this.f22305a, pVar, z2, lVar, kVar2, j2);
            }
        }, new b(this, pVar, lVar, kVar2, 1), new c(this, pVar, lVar, 1));
    }

    public final void h(u uVar) {
        x.f(uVar, TtmlNode.ATTR_ID);
        this.f22341a.a(uVar);
    }
}
