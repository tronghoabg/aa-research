package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fxg {
    private static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/action/ui/CarButtonColorsKt");

    public static final fxe a(fxe fxeVar, hjw hjwVar, hjw hjwVar2, boolean z, bux buxVar) {
        cjv cjvVar;
        cjv cjvVar2;
        bvv bvvVar;
        fxeVar.getClass();
        buxVar.v(110422786);
        if (hjwVar == null && hjwVar2 == null) {
            bvvVar = (bvv) buxVar;
        } else {
            long j = ((cjv) fxeVar.h.invoke(buxVar, 0)).a;
            long j2 = ((cjv) fxeVar.i.invoke(buxVar, 0)).a;
            if (hjwVar2 == null) {
                buxVar.v(-339070368);
                ((bvv) buxVar).Y(false);
                cjvVar = null;
            } else {
                buxVar.v(-1257863743);
                long jA = hjwVar2.a(z, buxVar, 0);
                ((bvv) buxVar).Y(false);
                cjvVar = new cjv(jA);
            }
            if (cjvVar != null) {
                j = cjvVar.a;
            }
            if (hjwVar2 != null) {
                buxVar.v(-338888118);
                buxVar.v(1803813699);
                hiu hiuVarC = gux.c(buxVar);
                long jU = a.j(j, hiuVarC.C()) ? hiuVarC.o() : a.j(j, hiuVarC.G()) ? hiuVarC.s() : a.j(j, hiuVarC.R()) ? hiuVarC.w() : (a.j(j, hiuVarC.I()) || a.j(j, hiuVarC.P()) || a.j(j, hiuVarC.O())) ? hiuVarC.u() : a.j(j, hiuVarC.Q()) ? hiuVarC.v() : (a.j(j, hiuVarC.J()) || a.j(j, hiuVarC.M()) || a.j(j, hiuVarC.N()) || a.j(j, hiuVarC.K()) || a.j(j, hiuVarC.L())) ? hiuVarC.u() : a.j(j, hiuVarC.D()) ? hiuVarC.p() : a.j(j, hiuVarC.H()) ? hiuVarC.t() : a.j(j, hiuVarC.S()) ? hiuVarC.x() : a.j(j, hiuVarC.i()) ? hiuVarC.g() : a.j(j, hiuVarC.E()) ? hiuVarC.q() : a.j(j, hiuVarC.F()) ? hiuVarC.r() : a.j(j, hiuVarC.e()) ? hiuVarC.m() : a.j(j, hiuVarC.f()) ? hiuVarC.n() : a.j(j, hiuVarC.b()) ? hiuVarC.j() : a.j(j, hiuVarC.c()) ? hiuVarC.k() : a.j(j, hiuVarC.V()) ? hiuVarC.y() : a.j(j, hiuVarC.W()) ? hiuVarC.z() : a.j(j, hiuVarC.o()) ? hiuVarC.C() : a.j(j, hiuVarC.s()) ? hiuVarC.G() : a.j(j, hiuVarC.w()) ? hiuVarC.R() : a.j(j, hiuVarC.u()) ? hiuVarC.I() : a.j(j, hiuVarC.v()) ? hiuVarC.Q() : a.j(j, hiuVarC.p()) ? hiuVarC.D() : a.j(j, hiuVarC.t()) ? hiuVarC.H() : a.j(j, hiuVarC.x()) ? hiuVarC.S() : a.j(j, hiuVarC.g()) ? hiuVarC.i() : a.j(j, hiuVarC.q()) ? hiuVarC.E() : a.j(j, hiuVarC.r()) ? hiuVarC.F() : a.j(j, hiuVarC.m()) ? hiuVarC.e() : a.j(j, hiuVarC.n()) ? hiuVarC.f() : a.j(j, hiuVarC.j()) ? hiuVarC.b() : a.j(j, hiuVarC.k()) ? hiuVarC.c() : a.j(j, hiuVarC.y()) ? hiuVarC.V() : a.j(j, hiuVarC.z()) ? hiuVarC.W() : cjn.n();
                if (jU == 16) {
                    jU = ((cjv) buxVar.f(bnm.a)).a;
                }
                j2 = jU;
                bvv bvvVar2 = (bvv) buxVar;
                bvvVar2.Y(false);
                bvvVar2.Y(false);
            } else {
                buxVar.v(-338829373);
                ((bvv) buxVar).Y(false);
            }
            if (hjwVar == null) {
                buxVar.v(-338708071);
                ((bvv) buxVar).Y(false);
                cjvVar2 = null;
            } else {
                buxVar.v(-1257852056);
                afbe afbeVar = afbe.a;
                buxVar.v(-956250770);
                Iterator it = woy.bY(hjwVar.b(buxVar), afbeVar).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cjvVar2 = null;
                        break;
                    }
                    long j3 = ((cjv) it.next()).a;
                    cjvVar2 = fww.o(j3, j, true) ? new cjv(j3) : null;
                    if (cjvVar2 != null) {
                        break;
                    }
                }
                bvv bvvVar3 = (bvv) buxVar;
                bvvVar3.Y(false);
                bvvVar3.Y(false);
            }
            if (cjvVar2 == null) {
                buxVar.v(-1257840741);
                cjv cjvVar3 = new cjv(fww.r(new cjv(j2), j, buxVar));
                cjv cjvVar4 = cjvVar3.a != 16 ? cjvVar3 : null;
                ((bvv) buxVar).Y(false);
                cjvVar2 = cjvVar4;
            } else {
                buxVar.v(-1257852366);
                ((bvv) buxVar).Y(false);
            }
            if (cjvVar2 != null) {
                fxe fxeVar2 = new fxe(new fxf(j, 1), new fxf(cjvVar2.a, 0), null, null, 60);
                ((bvv) buxVar).Y(false);
                return fxeVar2;
            }
            ((ynz) a.h().o(ypi.a, "CarApp.H.Action").ai(5)).y("%s", "Content color failed contrast check against background color");
            bvvVar = (bvv) buxVar;
        }
        bvvVar.Y(false);
        return fxeVar;
    }
}
