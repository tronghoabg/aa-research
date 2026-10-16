package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eqi extends defpackage.epy {
    public boolean c;
    public defpackage.epx e;
    private final boolean f;
    private int g;
    private boolean h;
    private final ajba i;
    private final defpackage.kwv j;
    public defpackage.epq b = new defpackage.epq();
    public final java.util.List d = new java.util.ArrayList();

    public eqi(defpackage.eqg eqgVar, boolean z) {
        this.f = z;
        this.j = new defpackage.kwv(eqgVar, (byte[]) null);
        defpackage.epx epxVar = defpackage.epx.b;
        this.e = epxVar;
        this.i = ajbb.a(epxVar);
    }

    private final defpackage.epx g(defpackage.eqf eqfVar) {
        defpackage.epx epxVar;
        defpackage.epp eppVar = (defpackage.epp) ((defpackage.aau) this.b.c).a(eqfVar);
        defpackage.epp eppVar2 = eppVar != null ? eppVar.c : null;
        if (eppVar2 == null || (epxVar = ((defpackage.eqh) eppVar2.a).a) == null) {
            epxVar = defpackage.epx.e;
        }
        defpackage.epx epxVar2 = (defpackage.epx) defpackage.afga.aF(this.d);
        if (epxVar2 == null) {
            epxVar2 = defpackage.epx.e;
        }
        defpackage.epx epxVar3 = this.e;
        epxVar3.getClass();
        epxVar.getClass();
        return (defpackage.epx) defpackage.afga.z(epxVar3, defpackage.afga.z(epxVar, epxVar2));
    }

    private final void h(java.lang.String str) {
        if (this.f && !defpackage.pn.bn().bo()) {
            throw new java.lang.IllegalStateException(defpackage.a.bp(str, "Method ", " must be called on the main thread"));
        }
    }

    private final void i(defpackage.epx epxVar) {
        if (this.e == epxVar) {
            return;
        }
        defpackage.eqg eqgVar = (defpackage.eqg) this.j.z();
        defpackage.epx epxVar2 = this.e;
        if (epxVar2 == defpackage.epx.b && epxVar == defpackage.epx.a) {
            throw new java.lang.IllegalStateException("State must be at least '" + defpackage.epx.c + "' to be moved to '" + epxVar + "' in component " + eqgVar);
        }
        defpackage.epx epxVar3 = defpackage.epx.a;
        if (epxVar2 == epxVar3 && epxVar2 != epxVar) {
            throw new java.lang.IllegalStateException("State is '" + epxVar3 + "' and cannot be moved to `" + epxVar + "` in component " + eqgVar);
        }
        this.e = epxVar;
        if (this.h || this.g != 0) {
            this.c = true;
            return;
        }
        this.h = true;
        j();
        this.h = false;
        if (this.e == epxVar3) {
            this.b = new defpackage.epq();
        }
    }

    private final void j() {
        java.lang.Object objZ = this.j.z();
        if (objZ == null) {
            throw new java.lang.IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        defpackage.eqg eqgVar = (defpackage.eqg) objZ;
        while (true) {
            defpackage.epq epqVar = this.b;
            if (((defpackage.aau) epqVar.c).e == 0) {
                break;
            }
            defpackage.epx epxVar = ((defpackage.eqh) ((defpackage.epp) epqVar.a()).a).a;
            defpackage.epq epqVar2 = this.b;
            java.lang.Object obj = epqVar2.b;
            if (obj == null) {
                throw new java.util.NoSuchElementException("Collection is empty.");
            }
            defpackage.epx epxVar2 = ((defpackage.eqh) ((defpackage.epp) obj).a).a;
            if (epxVar == epxVar2 && this.e == epxVar2) {
                break;
            }
            this.c = false;
            if (this.e.compareTo(((defpackage.eqh) ((defpackage.epp) epqVar2.a()).a).a) < 0) {
                defpackage.epq epqVar3 = this.b;
                defpackage.beh behVar = new defpackage.beh(this, eqgVar, 20);
                java.lang.Object obj2 = epqVar3.b;
                while (obj2 != null) {
                    defpackage.epp eppVar = (defpackage.epp) obj2;
                    if (!eppVar.d) {
                        behVar.invoke(obj2);
                    }
                    obj2 = eppVar.c;
                }
            }
            java.lang.Object obj3 = this.b.b;
            char[] cArr = null;
            defpackage.epx epxVar3 = obj3 != null ? ((defpackage.eqh) ((defpackage.epp) obj3).a).a : null;
            if (!this.c && epxVar3 != null && this.e.compareTo(epxVar3) > 0) {
                defpackage.epq epqVar4 = this.b;
                defpackage.err errVar = new defpackage.err(this, eqgVar, 1, cArr);
                java.lang.Object obj4 = epqVar4.a;
                while (obj4 != null) {
                    defpackage.epp eppVar2 = (defpackage.epp) obj4;
                    if (!eppVar2.d) {
                        errVar.invoke(obj4);
                    }
                    obj4 = eppVar2.b;
                }
            }
        }
        this.c = false;
        this.i.d(this.e);
    }

    @Override // defpackage.epy
    public final defpackage.epx a() {
        return this.e;
    }

    @Override // defpackage.epy
    public final ajay b() {
        return new ajak(this.i, (aiwg) null);
    }

    @Override // defpackage.epy
    public final void c(defpackage.eqf eqfVar) {
        java.lang.Object obj;
        defpackage.eqg eqgVar;
        eqfVar.getClass();
        h("addObserver");
        defpackage.epx epxVar = this.e;
        defpackage.epx epxVar2 = defpackage.epx.a;
        if (epxVar != epxVar2) {
            epxVar2 = defpackage.epx.b;
        }
        defpackage.eqh eqhVar = new defpackage.eqh(eqfVar, epxVar2);
        defpackage.epq epqVar = this.b;
        defpackage.aau aauVar = (defpackage.aau) epqVar.c;
        defpackage.epp eppVar = (defpackage.epp) aauVar.a(eqfVar);
        if (eppVar != null) {
            obj = eppVar.a;
        } else {
            defpackage.epp eppVar2 = new defpackage.epp(eqfVar, eqhVar);
            aauVar.m(eqfVar, eppVar2);
            java.lang.Object obj2 = epqVar.b;
            if (obj2 == null) {
                epqVar.a = eppVar2;
            } else {
                defpackage.epp eppVar3 = (defpackage.epp) obj2;
                eppVar3.b = eppVar2;
                eppVar2.c = eppVar3;
            }
            epqVar.b = eppVar2;
            obj = null;
        }
        if (obj == null && (eqgVar = (defpackage.eqg) this.j.z()) != null) {
            boolean z = this.g != 0 || this.h;
            defpackage.epx epxVarG = g(eqfVar);
            this.g++;
            while (eqhVar.a.compareTo(epxVarG) < 0 && this.b.b(eqfVar)) {
                java.util.List list = this.d;
                list.add(eqhVar.a);
                defpackage.epv epvVar = defpackage.epw.Companion;
                defpackage.epw epwVarB = defpackage.epv.b(eqhVar.a);
                if (epwVarB == null) {
                    defpackage.epx epxVar3 = eqhVar.a;
                    java.util.Objects.toString(epxVar3);
                    throw new java.lang.IllegalStateException("no event up from ".concat(java.lang.String.valueOf(epxVar3)));
                }
                eqhVar.a(eqgVar, epwVarB);
                defpackage.afga.bu(list);
                epxVarG = g(eqfVar);
            }
            if (!z) {
                j();
            }
            this.g--;
        }
    }

    @Override // defpackage.epy
    public final void d(defpackage.eqf eqfVar) {
        eqfVar.getClass();
        h("removeObserver");
        defpackage.epq epqVar = this.b;
        defpackage.epp eppVar = (defpackage.epp) ((defpackage.aau) epqVar.c).i(eqfVar);
        if (eppVar == null) {
            return;
        }
        defpackage.epp eppVar2 = eppVar.c;
        defpackage.epp eppVar3 = eppVar.b;
        if (eppVar2 == null) {
            epqVar.a = eppVar3;
        } else {
            eppVar2.b = eppVar3;
        }
        defpackage.epp eppVar4 = eppVar.b;
        if (eppVar4 == null) {
            epqVar.b = eppVar2;
        } else {
            eppVar4.c = eppVar2;
        }
        eppVar.d = true;
    }

    public final void e(defpackage.epw epwVar) {
        epwVar.getClass();
        h("handleLifecycleEvent");
        defpackage.fdr fdrVar = defpackage.fdr.a;
        fdrVar.a("androidx.lifecycle");
        defpackage.fdm fdmVar = defpackage.fdm.b;
        try {
            i(epwVar.a());
            defpackage.acmj.o(fdmVar);
        } catch (java.lang.Throwable th) {
            try {
                defpackage.edd.n(fdrVar, th);
                throw new defpackage.afap();
            } catch (java.lang.Throwable th2) {
                defpackage.acmj.o(fdmVar);
                throw th2;
            }
        }
    }

    public final void f(defpackage.epx epxVar) {
        epxVar.getClass();
        h("setCurrentState");
        i(epxVar);
    }
}
