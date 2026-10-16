package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nwy extends defpackage.lhm implements defpackage.mnj {
    public final defpackage.wdm c;
    private final java.util.List e = new java.util.ArrayList();
    private final android.os.Handler f = new android.os.Handler();
    private final java.lang.Runnable g = new defpackage.jpa(this, 16, null);
    private defpackage.nxa h;
    private boolean i;
    private static final defpackage.yqm d = defpackage.yqm.c("GH.HunManager");
    public static final java.util.Comparator a = new defpackage.cwq(3);
    static final j$.time.Duration b = j$.time.Duration.ofMinutes(3);

    public nwy() {
        defpackage.lem.a.a();
        this.h = new defpackage.nwz(null);
        defpackage.eqp eqpVar = defpackage.tcu.b;
        defpackage.wdm wdmVar = new defpackage.wdm((byte[]) null);
        wdmVar.b(eqpVar);
        this.c = wdmVar;
        this.i = true;
        int i = defpackage.mni.a;
        ((defpackage.mni) defpackage.mkp.a.i(defpackage.mni.class)).c(defpackage.mnh.l, this, this);
    }

    public static defpackage.nwy a() {
        return (defpackage.nwy) defpackage.mkp.a.b(defpackage.nwy.class, new defpackage.lga(12));
    }

    private final nwx j(nuv nuvVar) {
        for (nwx nwxVar : this.e) {
            if (j$.util.Objects.equals(nwxVar.a.d, nuvVar.d)) {
                return nwxVar;
            }
        }
        return null;
    }

    private static boolean k(nwx nwxVar) {
        if (!nwxVar.c) {
            defpackage.ngl nglVarA = defpackage.ngl.a();
            defpackage.nve nveVar = nwxVar.b().x;
            boolean zBooleanValue = ((java.lang.Boolean) nglVarA.k.e()).booleanValue();
            if (nveVar != defpackage.nve.d && nveVar != defpackage.nve.e && nveVar != defpackage.nve.c && nveVar != defpackage.nve.b && (((java.lang.Integer) defpackage.kpu.c().i().e()).intValue() == 2 || !zBooleanValue)) {
                if (nwxVar.a() > b.toMillis()) {
                    ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 5506)).u("Entry can interrupt user, beyond the max delay");
                    return true;
                }
                ((defpackage.yqj) d.l().ai((char) 5505)).y("InterruptionManager not allowing interruptions at this time for %s", nwxVar);
                return false;
            }
        }
        return true;
    }

    public final void b(nuv nuvVar) {
        defpackage.wfp.c();
        if (this.i) {
            return;
        }
        java.util.List list = this.e;
        ((defpackage.yqj) d.l().ai((char) 5512)).M("remove %s from %s", nuvVar, list);
        nwx nwxVarJ = j(nuvVar);
        if (nwxVarJ != null) {
            list.remove(nwxVarJ);
            g();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhm, defpackage.lhn
    public final void d() throws wfo {
        super.d();
        defpackage.wfp.c();
        this.e.clear();
        this.f.removeCallbacks(this.g);
        this.h.j(defpackage.nxh.a);
        this.i = true;
    }

    public final void e(defpackage.nve nveVar) {
        defpackage.wfp.c();
        if (this.i) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.e;
        int size = list.size();
        while (true) {
            size--;
            if (size <= 0) {
                break;
            } else if (((nwx) list.get(size)).b().x == nveVar) {
                arrayList.add(java.lang.Integer.valueOf(size));
            }
        }
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            ((defpackage.yqj) d.l().ai(5514)).M("removeAll(cat=%s) removed %s", nveVar, (nwx) list.remove(((java.lang.Integer) arrayList.get(i)).intValue()));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() throws wfo {
        super.eQ();
        defpackage.wfp.c();
        this.i = false;
        defpackage.lem.a();
        defpackage.nwz nwzVar = new defpackage.nwz(this);
        this.h = nwzVar;
        this.c.b(nwzVar.l);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void f(nuv nuvVar) throws wfo {
        defpackage.wfp.c();
        if (this.i) {
            return;
        }
        nwx nwxVarJ = j(nuvVar);
        ((defpackage.yqj) d.l().ai((char) 5516)).M("show old=%s new=%s", nwxVarJ, nuvVar);
        if (nwxVarJ != null) {
            defpackage.ysr.aX(j$.util.Objects.equals(nuvVar.d, nwxVarJ.a.d));
            nwxVarJ.a = nuvVar;
        } else {
            this.e.add(new nwx(nuvVar));
        }
        g();
    }

    public final void g() {
        nur nurVar;
        long j;
        defpackage.nxe nxeVar;
        nuv nuvVar;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        defpackage.nve nveVar;
        android.os.Handler handler = this.f;
        java.lang.Runnable runnable = this.g;
        handler.removeCallbacks(runnable);
        java.util.List<nwx> list = this.e;
        if (list.size() > 1) {
            nwx nwxVar = ((nwx) list.get(0)).c ? (nwx) list.remove(0) : null;
            java.util.Collections.sort(list);
            nwx nwxVar2 = (nwx) list.get(0);
            for (nwx nwxVar3 : list) {
                if (k(nwxVar3)) {
                    nwxVar2 = nwxVar3;
                    break;
                }
            }
            if (nwxVar == null || nwxVar2.b().x == defpackage.nve.d) {
                list.remove(nwxVar2);
                list.add(0, nwxVar2);
            } else {
                list.add(0, nwxVar);
            }
        }
        nwx nwxVar4 = (nwx) defpackage.ysr.au(list);
        defpackage.yqm yqmVar = d;
        ((defpackage.yqj) yqmVar.l().ai(5517)).M("update visibleHun=%s pending=%s", nwxVar4, list);
        if (nwxVar4 == null || !k(nwxVar4)) {
            this.h.j(defpackage.nxh.a);
            if (nwxVar4 != null) {
                if (nwxVar4.b == 0) {
                    nwxVar4.b = android.os.SystemClock.elapsedRealtime();
                }
                handler.postDelayed(runnable, defpackage.acyc.i());
                ((defpackage.yqj) yqmVar.l().ai(5515)).R("delaying HUN, delayed=%dms maxAllowed=%ds entry=%s", java.lang.Long.valueOf(nwxVar4.a()), java.lang.Long.valueOf(b.toSeconds()), nwxVar4);
                return;
            }
            return;
        }
        defpackage.nxh nxhVar = this.h.j;
        nvh nvhVarB = nwxVar4.b();
        nuv nuvVar2 = nwxVar4.a;
        defpackage.nxf nxfVar = new defpackage.nxf(defpackage.zbe.SYSTEM_UI_NOTIFICATION);
        nxfVar.b = nvhVarB.f;
        nxfVar.c = nvhVarB.x;
        nxfVar.d = nwxVar4.a();
        nxfVar.e = nvhVarB.w != null;
        defpackage.nxg nxgVar = new defpackage.nxg(nxfVar);
        defpackage.mbx mbxVar = new defpackage.mbx(this, nwxVar4, 18);
        nvh nvhVar = nuvVar2.c;
        if ((defpackage.acrf.p() || !((nveVar = nvhVar.x) == defpackage.nve.d || nveVar == defpackage.nve.e)) && (nurVar = nvhVar.t) != null) {
            defpackage.nve nveVar2 = nvhVar.x;
            int i = nurVar.k;
            java.lang.Integer numValueOf = i == 0 ? null : java.lang.Integer.valueOf(i);
            int i2 = numValueOf == null ? -1 : 2132150277;
            java.lang.String str = nuvVar2.d;
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i2);
            j = 0;
            nxeVar = new defpackage.nxe(str);
            nxeVar.b = (defpackage.acrf.p() && (nveVar2 == defpackage.nve.d || nveVar2 == defpackage.nve.e)) ? false : true;
            nxeVar.h = nveVar2;
            nxeVar.j = nurVar.a;
            nxeVar.k = nvhVar.e;
            nxeVar.i = nurVar.b;
            java.lang.CharSequence charSequence = nurVar.c;
            if (charSequence == null) {
                charSequence = "";
            }
            nxeVar.c = charSequence;
            java.lang.CharSequence charSequence2 = nurVar.d;
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            nxeVar.d = charSequence2;
            nxeVar.l = nurVar.j;
            nxeVar.e = nurVar.e;
            nxeVar.p = numValueOf;
            nxeVar.q = numValueOf2;
            nxeVar.r = nvhVar.C;
            nxeVar.s = nvhVar.E;
            nxeVar.t = defpackage.edd.y(nveVar2);
            nvb nvbVar = nurVar.f;
            nxeVar.m = nvbVar == null ? null : new nxk(nvbVar.a, nvbVar.b, nvbVar.c, nvbVar.e);
            nvb nvbVar2 = nurVar.g;
            nxeVar.n = nvbVar2 == null ? null : new nxk(nvbVar2.a, nvbVar2.b, nvbVar2.c, nvbVar2.e);
            nvb nvbVar3 = nurVar.h;
            nxeVar.o = nvbVar3 == null ? null : new nxk(nvbVar3.a, nvbVar3.b, nvbVar3.c, nvbVar3.e);
        } else {
            j = 0;
            nur nurVar2 = nvhVar.t;
            if (nurVar2 == null || (ghIcon = nurVar2.b) == null) {
                ghIcon = nvhVar.b;
            }
            defpackage.nve nveVar3 = nvhVar.x;
            boolean z = (nveVar3 == defpackage.nve.d || nveVar3 == defpackage.nve.e) ? false : true;
            int iY = defpackage.edd.y(nveVar3);
            defpackage.nxj nxjVarX = defpackage.edd.x(nvhVar.p, nveVar3);
            defpackage.nxj nxjVarX2 = defpackage.edd.x(nvhVar.q, nveVar3);
            int i3 = nvhVar.h;
            java.lang.Integer numValueOf3 = i3 != 0 ? java.lang.Integer.valueOf(i3) : null;
            int i4 = numValueOf3 == null ? -1 : 2132150277;
            java.lang.String str2 = nuvVar2.d;
            java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(i4);
            defpackage.nxe nxeVar2 = new defpackage.nxe(str2);
            nxeVar2.b = z;
            nxeVar2.h = nveVar3;
            nxeVar2.j = nvhVar.d;
            nxeVar2.k = nvhVar.e;
            nxeVar2.i = ghIcon;
            java.lang.CharSequence charSequence3 = nvhVar.m;
            if (charSequence3 == null) {
                charSequence3 = "";
            }
            nxeVar2.c = charSequence3;
            java.lang.CharSequence charSequence4 = nvhVar.n;
            if (charSequence4 == null) {
                charSequence4 = "";
            }
            nxeVar2.d = charSequence4;
            nxeVar2.l = nvhVar.c;
            nxeVar2.m = nxjVarX;
            nxeVar2.n = nxjVarX2;
            nxeVar2.t = iY;
            nxeVar2.p = numValueOf3;
            nxeVar2.q = numValueOf4;
            nxeVar2.r = nvhVar.C;
            nxeVar2.s = nvhVar.E;
            nxeVar = nxeVar2;
        }
        if (defpackage.lem.a().b() && nxhVar != null) {
            nxeVar.u = nxhVar.v;
        }
        nxeVar.g = nxgVar;
        nxeVar.f = mbxVar;
        defpackage.nxh nxhVar2 = new defpackage.nxh(nxeVar);
        if (defpackage.acqn.i() && nxhVar2.h.c == defpackage.nve.h) {
            defpackage.lby.m.e(defpackage.mkp.a.c);
        }
        defpackage.nxa nxaVar = this.h;
        nuv nuvVar3 = nwxVar4.a;
        nvh nvhVar2 = nuvVar3.c;
        nur nurVar3 = nvhVar2.t;
        if (nurVar3 == null || nurVar3.i == null) {
            nxaVar.j(nxhVar2);
        } else {
            defpackage.nxg nxgVar2 = nxhVar2.h;
            java.lang.Runnable runnable2 = nxhVar2.g;
            defpackage.nwi nwiVar = defpackage.nxa.g;
            defpackage.yqm yqmVar2 = defpackage.nwi.a;
            defpackage.yqj yqjVar = (defpackage.yqj) yqmVar2.l().ai(5497);
            long j2 = nvhVar2.i;
            yqjVar.x("#present timestamp=%s", j2);
            if (nwiVar.d(nuvVar3) && ((nuvVar = nwiVar.e) == null || j2 == nuvVar.c.i)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).ai((char) 5500)).y("Nothing new to present. entry=%s", nuvVar3);
            } else if (defpackage.ebo.n().L()) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 5498)).u("Active Assistant session while trying to autoplay");
                if (!nwiVar.d(nuvVar3)) {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 5499)).u("Registering callback when Assistant voice session ends.");
                    defpackage.ebo.n().r(nwiVar.c);
                }
                nwiVar.a(nuvVar3, nxgVar2, runnable2);
                nwiVar.d = new defpackage.mta(nwiVar, 16);
                nwiVar.b(defpackage.zbd.oG);
            } else {
                nwiVar.a(nuvVar3, nxgVar2, runnable2);
                nwiVar.c();
            }
        }
        if (nwxVar4.c) {
            ((defpackage.yqj) yqmVar.l().ai(5519)).M("Notification did not play chime due to it being a consecutive message visibleHun=%s pending=%s", nwxVar4, list);
            defpackage.mcl.C(nxhVar2, defpackage.zbd.ol);
        } else {
            nvh nvhVarB2 = nwxVar4.b();
            if (nwxVar4.a.b() == nuu.c) {
                ((defpackage.yqj) yqmVar.l().ai((char) 5511)).u("Notification did not play chime due to it being suppressed by DND");
                defpackage.mcl.C(nxhVar2, defpackage.zbd.os);
            } else {
                android.net.Uri uri = nvhVarB2.w;
                if (uri == null) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 5510)).y("Notification did not play chime due to no sound in notification notification=%s", nvhVarB2);
                    defpackage.mcl.C(nxhVar2, defpackage.zbd.om);
                } else if (defpackage.mpr.f().a().k()) {
                    defpackage.may.a().b(uri, 1);
                    defpackage.mcl.C(nxhVar2, defpackage.zbd.ok);
                } else {
                    ((defpackage.yqj) yqmVar.l().ai((char) 5509)).y("Notification did not play chime due  to user preference in settings notification=%s", nvhVarB2);
                    defpackage.mcl.C(nxhVar2, defpackage.zbd.on);
                }
            }
            if (nwxVar4.b != j) {
                defpackage.mcl.C(nxhVar2, defpackage.zbd.oM);
            }
        }
        nwxVar4.c = true;
        nwxVar4.a.e();
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.println("HunManager");
        java.util.List list = this.e;
        if (list.isEmpty()) {
            printWriter.println("No active notifications.");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            printWriter.println((nwx) it.next());
        }
        printWriter.println();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean i(nuv nuvVar) throws wfo {
        defpackage.wfp.c();
        return j(nuvVar) != null;
    }
}
