package com.waze.search.h;

import androidx.compose.material3.internal.CalendarModelKt;
import com.waze.R;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f35888a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.z.a.ad f35889b = com.waze.z.a.be.r(new com.waze.ui.ac.j(R.string.START_STATE_SWIPE_OPTIONS_BUTTON_TITLE), com.waze.z.a.ab.f45610a, new com.waze.ui.ac.f(com.waze.design_components.b.d.N.c(com.waze.design_components.b.e.f23312a)));

    public static final com.waze.search.e.r a(com.waze.av.b.n nVar, com.waze.search.e.j jVar) {
        h.g.b.x.f(nVar, "<this>");
        h.g.b.x.f(jVar, "transformationInfo");
        if ((nVar instanceof com.waze.av.b.m) || (nVar instanceof com.waze.av.b.j) || (nVar instanceof com.waze.av.b.k)) {
            return (com.waze.ac.e.x(nVar) || com.waze.ac.e.A(nVar)) ? com.waze.search.e.r.f35648b : com.waze.search.e.r.f35647a;
        }
        if (!(nVar instanceof com.waze.av.b.l)) {
            throw new h.i();
        }
        com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
        return (lVar.d().length() <= 0 || lVar.c() != com.waze.av.b.z.f16014b) ? com.waze.search.e.r.f35647a : com.waze.search.e.r.f35649c;
    }

    public static final com.waze.ui.ac.i b(com.waze.av.b.n nVar) {
        h.g.b.x.f(nVar, "<this>");
        if (com.waze.ac.e.x(nVar)) {
            return new com.waze.ui.ac.f(com.waze.design_components.b.d.f23304e.c(com.waze.design_components.b.e.f23314c));
        }
        if (com.waze.ac.e.A(nVar)) {
            return new com.waze.ui.ac.f(com.waze.design_components.b.d.f23309j.c(com.waze.design_components.b.e.f23314c));
        }
        if (nVar instanceof com.waze.av.b.k) {
            return new com.waze.ui.ac.f(com.waze.design_components.b.d.M.b());
        }
        boolean z = nVar instanceof com.waze.av.b.l;
        if (z) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            if (lVar.c() == com.waze.av.b.z.f16014b && lVar.d().length() > 0) {
                return new com.waze.ui.ac.h(lVar.d(), Integer.valueOf(com.waze.design_components.b.d.O.b()));
            }
        }
        boolean z2 = nVar instanceof com.waze.av.b.j;
        return (z2 && ((com.waze.av.b.j) nVar).f() == com.waze.av.b.d.f15945d) ? new com.waze.ui.ac.f(com.waze.design_components.b.d.I.b()) : (z2 && ((com.waze.av.b.j) nVar).f() == com.waze.av.b.d.f15944c) ? new com.waze.ui.ac.f(com.waze.design_components.b.d.ab.b()) : z ? new com.waze.ui.ac.f(com.waze.design_components.b.d.H.b()) : new com.waze.ui.ac.f(com.waze.design_components.b.d.I.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.waze.ui.ac.n c(com.waze.av.b.n r5) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.h.cd.c(com.waze.av.b.n):com.waze.ui.ac.n");
    }

    public static final com.waze.ui.ac.n d(com.waze.av.b.n nVar, com.waze.shared_infra.q.j jVar) {
        String strA;
        String strE;
        String strE2;
        com.waze.ui.ac.m mVar;
        h.g.b.x.f(nVar, "<this>");
        if (com.waze.ac.e.x(nVar)) {
            return new com.waze.ui.ac.j(R.string.DESTINATION_CELL_HOME_TITLE);
        }
        if (com.waze.ac.e.A(nVar)) {
            return new com.waze.ui.ac.j(R.string.DESTINATION_CELL_WORK_TITLE);
        }
        if (nVar instanceof com.waze.av.b.k) {
            com.waze.av.b.k kVar = (com.waze.av.b.k) nVar;
            if (kVar.h().length() > 0) {
                return new com.waze.ui.ac.m(kVar.h());
            }
        }
        boolean z = true;
        if (nVar instanceof com.waze.av.b.j) {
            com.waze.av.b.j jVar2 = (com.waze.av.b.j) nVar;
            if (jVar2.i().length() > 0) {
                if (jVar != null) {
                    String strI = jVar2.i();
                    String strA2 = jVar.a(System.currentTimeMillis());
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    String strA3 = jVar.a(jCurrentTimeMillis + CalendarModelKt.MillisecondsIn24Hours);
                    long jC = jVar2.c() * 1000;
                    String strA4 = jVar.a(jC);
                    if (h.g.b.x.n(strA4, strA2)) {
                        strA4 = com.waze.shared_infra.o.b.a().c(R.string.TODAY_CAP, new Object[0]);
                    } else if (h.g.b.x.n(strA4, strA3)) {
                        strA4 = com.waze.shared_infra.o.b.a().c(R.string.TOMORROW, new Object[0]);
                    }
                    String str = String.format("%s %s", Arrays.copyOf(new Object[]{strA4, jVar.b(jC)}, 2));
                    h.g.b.x.e(str, "format(...)");
                    mVar = new com.waze.ui.ac.m(strI + " - " + str);
                } else {
                    mVar = new com.waze.ui.ac.m(jVar2.i());
                }
                return mVar;
            }
        }
        if (nVar instanceof com.waze.av.b.l) {
            com.waze.av.b.l lVar = (com.waze.av.b.l) nVar;
            String strC = lVar.e().c().c();
            if (strC != null && strC.length() != 0 && lVar.f().length() > 0) {
                return new com.waze.ui.ac.m(lVar.f());
            }
            if (lVar.f().length() == 0 && (strE2 = lVar.e().c().e()) != null && strE2.length() != 0) {
                String strE3 = lVar.e().c().e();
                h.g.b.x.c(strE3);
                return new com.waze.ui.ac.m(strE3);
            }
        } else {
            z = false;
        }
        if (z) {
            com.waze.av.b.l lVar2 = (com.waze.av.b.l) nVar;
            String strC2 = lVar2.e().c().c();
            if ((strC2 == null || strC2.length() == 0) && (((strE = lVar2.e().c().e()) == null || strE.length() == 0) && lVar2.f().length() > 0)) {
                return new com.waze.ui.ac.m(lVar2.f());
            }
        }
        if (nVar instanceof com.waze.av.b.m) {
            com.waze.av.b.m mVar2 = (com.waze.av.b.m) nVar;
            String strE4 = mVar2.e().c().e();
            if (strE4 != null && strE4.length() != 0) {
                String strE5 = mVar2.e().c().e();
                return new com.waze.ui.ac.m(strE5 != null ? strE5 : "");
            }
        }
        if (z) {
            com.waze.av.b.l lVar3 = (com.waze.av.b.l) nVar;
            String strE6 = lVar3.e().c().e();
            if (strE6 != null && strE6.length() != 0) {
                String strE7 = lVar3.e().c().e();
                return new com.waze.ui.ac.m(strE7 != null ? strE7 : "");
            }
        }
        com.waze.av.a.a aVarB = nVar.e().b();
        if (aVarB.a() != null && (aVarB.f() != null || aVarB.c() != null)) {
            strA = com.waze.nightmode.e.i(aVarB.c(), aVarB.f());
        } else if (aVarB.a() != null) {
            strA = aVarB.a();
        } else {
            if (aVarB.f() == null) {
                aVarB.c();
            }
            strA = null;
        }
        return strA != null ? new com.waze.ui.ac.m(strA) : new com.waze.ui.ac.j(R.string.UNKNOWN);
    }

    public static final String e(com.waze.av.a.a aVar) {
        h.g.b.x.f(aVar, "<this>");
        return com.waze.nightmode.e.g(aVar.a(), aVar.e(), aVar.g());
    }

    public static final String f(com.waze.av.a.a aVar) {
        h.g.b.x.f(aVar, "<this>");
        String strH = com.waze.nightmode.e.h(aVar.c(), aVar.f(), aVar.a(), aVar.e(), aVar.g());
        String str = strH;
        return (str == null || h.n.o.G(str)) ? aVar.d() : strH;
    }

    public static final String g(com.waze.av.a.a aVar) {
        h.g.b.x.f(aVar, "<this>");
        return com.waze.nightmode.e.i(aVar.c(), aVar.f());
    }

    public static final /* synthetic */ com.waze.z.a.ak h() {
        return new com.waze.z.a.ak(h.a.i.d(f35889b));
    }
}
