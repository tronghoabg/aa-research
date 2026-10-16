package com.waze.sharedrive.e;

import com.waze.MoodManager;
import j$.time.Instant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cn {

    /* renamed from: a, reason: collision with root package name */
    private static final List f38502a = h.a.i.i("waze_", "stg_", "row_", "na_", "il_");

    /* renamed from: b, reason: collision with root package name */
    private final MoodManager f38503b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f38504c;

    public cn(MoodManager moodManager, com.waze.shared_infra.q.j jVar) {
        h.g.b.x.f(moodManager, "moodManager");
        h.g.b.x.f(jVar, "timeFormatter");
        this.f38503b = moodManager;
        this.f38504c = jVar;
    }

    private final com.waze.ui.ac.i f(com.waze.sharedrive.c.a.l lVar) {
        com.waze.sharedrive.c.a.e eVarB = lVar.b();
        if (eVarB == null) {
            return null;
        }
        if (eVarB instanceof com.waze.sharedrive.c.a.c) {
            String strA = ((com.waze.sharedrive.c.a.c) eVarB).a();
            if (true == h.n.o.G(strA)) {
                strA = null;
            }
            return strA != null ? new com.waze.ui.ac.g(strA) : null;
        }
        if (!(eVarB instanceof com.waze.sharedrive.c.a.d)) {
            throw new h.i();
        }
        int iA = ((com.waze.sharedrive.c.a.d) eVarB).a();
        MoodManager moodManager = this.f38503b;
        if (!moodManager.isValidMoodId(iA)) {
            return null;
        }
        String moodNameById = moodManager.getMoodNameById(iA);
        h.g.b.x.e(moodNameById, "getMoodNameById(...)");
        String moodResourceName = MoodManager.getMoodResourceName(moodNameById);
        h.g.b.x.c(moodResourceName);
        return new com.waze.ui.ac.h(moodResourceName);
    }

    private static final String g(com.waze.sharedrive.c.a.l lVar) {
        String strE = lVar.e();
        if (strE == null || h.n.o.G(strE)) {
            return null;
        }
        List list = f38502a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (h.n.o.o(strE, (String) it.next(), true)) {
                    return null;
                }
            }
        }
        return strE;
    }

    public final cm a(com.waze.sharedrive.c.a.l lVar, Instant instant) {
        h.g.b.x.f(lVar, "participant");
        h.g.b.x.f(instant, "eta");
        return new cm(g(lVar), f(lVar), true, new ci(e(instant.toEpochMilli())));
    }

    public final cm b(com.waze.sharedrive.c.a.l lVar) {
        cj ciVar;
        h.g.b.x.f(lVar, "participant");
        String strG = g(lVar);
        com.waze.ui.ac.i iVarF = f(lVar);
        boolean zF = lVar.f();
        com.waze.sharedrive.c.a.k kVar = (com.waze.sharedrive.c.a.k) lVar.c().b();
        if (kVar instanceof com.waze.sharedrive.c.a.h) {
            ciVar = new ci(e(((com.waze.sharedrive.c.a.h) kVar).a().toEpochMilli()));
        } else if (kVar instanceof com.waze.sharedrive.c.a.j) {
            ciVar = ck.f38497a;
        } else {
            if (!h.g.b.x.n(kVar, com.waze.sharedrive.c.a.i.f38067a)) {
                throw new h.i();
            }
            ciVar = cj.f38496a;
        }
        return new cm(strG, iVarF, zF, ciVar);
    }

    public final com.waze.sharedrive.g.am c(cl clVar) {
        h.g.b.x.f(clVar, "role");
        if (clVar instanceof ci) {
            return new com.waze.sharedrive.g.ak(((ci) clVar).a());
        }
        if (h.g.b.x.n(clVar, ck.f38497a)) {
            return com.waze.sharedrive.g.al.f38631a;
        }
        if (h.g.b.x.n(clVar, cj.f38496a)) {
            return com.waze.sharedrive.g.aj.f38629a;
        }
        throw new h.i();
    }

    public final com.waze.ui.z.aq d(com.waze.sharedrive.c.a.l lVar) {
        h.g.b.x.f(lVar, "participant");
        String strG = g(lVar);
        com.waze.ui.ac.i iVarF = f(lVar);
        com.waze.sharedrive.c.a.k kVar = (com.waze.sharedrive.c.a.k) lVar.c().b();
        if (kVar instanceof com.waze.sharedrive.c.a.h) {
            return new com.waze.ui.z.al(lVar.d(), strG, iVarF, lVar.f(), e(((com.waze.sharedrive.c.a.h) kVar).a().toEpochMilli()));
        }
        if (kVar instanceof com.waze.sharedrive.c.a.j) {
            return lVar.f() ? new com.waze.ui.z.an(lVar.d(), strG, iVarF, ((com.waze.sharedrive.c.a.j) kVar).a(), !(lVar.c() instanceof com.waze.sharedrive.c.a.p)) : new com.waze.ui.z.ao(lVar.d(), strG, iVarF, ((com.waze.sharedrive.c.a.j) kVar).a());
        }
        if (h.g.b.x.n(kVar, com.waze.sharedrive.c.a.i.f38067a)) {
            return new com.waze.ui.z.ak(lVar.d(), strG, iVarF, lVar.f());
        }
        throw new h.i();
    }

    public final String e(long j2) {
        return this.f38504c.b(j2);
    }
}
