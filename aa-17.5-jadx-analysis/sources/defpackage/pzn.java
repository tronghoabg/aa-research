package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pzn implements pmn, pmo {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/zwieback/ZwiebackControllerImpl");
    public final pmq b;
    public final tmb c;
    public final ackk d;
    public String e = "Needs to be loaded from perstistent storage.";
    public zpi f;
    private final ackk g;

    public pzn(pmq pmqVar, tmb tmbVar, ackk ackkVar, xxh xxhVar) {
        this.b = pmqVar;
        this.c = tmbVar;
        this.d = ackkVar;
        this.g = (ackk) xxhVar.d(psr.b(aass.a));
    }

    public static String c(zpi zpiVar) {
        return woy.ak(vcw.a(zpiVar).a.c);
    }

    private static zpi f(String str) {
        vcw vcwVar;
        if (str != null) {
            abnp abnpVarN = zpg.a.n();
            abnpVarN.t();
            ((zpg) abnpVarN.b).c = str;
            abnp abnpVarN2 = zpe.a.n();
            abnpVarN2.t();
            ((zpe) abnpVarN2.b).b = aclh.d(4);
            abnpVarN2.t();
            ((zpe) abnpVarN2.b).c = 4;
            zpe zpeVar = (zpe) abnpVarN2.q();
            abnpVarN.t();
            zpg zpgVar = (zpg) abnpVarN.b;
            zpeVar.getClass();
            zpgVar.d = zpeVar;
            zpgVar.b |= 1;
            vcwVar = new vcw((zpg) abnpVarN.q(), zpi.a);
        } else {
            vcwVar = new vcw(zpg.a, zpi.a);
        }
        abnp abnpVarN3 = zpi.a.n();
        abnp abnpVarN4 = zpf.a.n();
        abms abmsVarF = vcwVar.a.f();
        abnpVarN4.t();
        ((zpf) abnpVarN4.b).b = abmsVarF;
        zpf zpfVar = (zpf) abnpVarN4.q();
        abnpVarN3.t();
        zpi zpiVar = (zpi) abnpVarN3.b;
        zpfVar.getClass();
        zpiVar.c = zpfVar;
        zpiVar.b |= 1;
        return (zpi) abnpVarN3.q();
    }

    @Override // defpackage.pmn
    public final /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public final zph b(boolean z) {
        zpi zpiVar;
        zpi zpiVar2;
        if (!d()) {
            return null;
        }
        if (z) {
            abry abryVar = this.b.a().c;
            if (abryVar == null) {
                abryVar = abry.a;
            }
            zpiVar2 = abryVar.e;
            if (zpiVar2 == null) {
                zpiVar2 = zpi.a;
            }
        } else {
            synchronized (this) {
                e();
                zpiVar = this.f;
                zpiVar.getClass();
            }
            zpiVar2 = zpiVar;
        }
        abnp abnpVarN = zph.a.n();
        zpf zpfVar = zpiVar2.c;
        if (zpfVar == null) {
            zpfVar = zpf.a;
        }
        abnpVarN.t();
        zph zphVar = (zph) abnpVarN.b;
        zpfVar.getClass();
        zphVar.c = zpfVar;
        zphVar.b |= 1;
        int i = true != z ? 3 : 2;
        abnpVarN.t();
        ((zph) abnpVarN.b).d = aclh.g(i);
        return (zph) abnpVarN.q();
    }

    public final boolean d() {
        return ((aass) this.g.a()).b;
    }

    public final synchronized void e() {
        if (Objects.equals(this.e, "Needs to be loaded from perstistent storage.")) {
            abry abryVar = this.b.a().c;
            if (abryVar == null) {
                abryVar = abry.a;
            }
            if ((abryVar.b & 16) != 0) {
                zpi zpiVar = abryVar.e;
                if (zpiVar == null) {
                    zpiVar = zpi.a;
                }
                this.f = zpiVar;
                this.e = c(zpiVar);
                if (!vja.i(this.f) && this.e == null) {
                    String strAk = woy.ak(abryVar.d);
                    this.e = strAk;
                    if (strAk != null) {
                        ((ynz) ((ynz) a.h()).ai((char) 6961)).u("Reusing naked Zwieback for sessionSignedOutStateResponse");
                        this.f = f(this.e);
                    }
                }
            } else {
                String strAk2 = woy.ak(abryVar.d);
                this.e = strAk2;
                this.f = f(strAk2);
            }
            ((ynz) ((ynz) a.d()).ai(6960)).M("getZwiebackCookie: sessionZwieback=%s\r\n%s", this.e, abryVar);
        }
    }
}
