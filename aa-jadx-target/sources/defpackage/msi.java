package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class msi extends defpackage.msh {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ContextMngrImpl");
    public java.util.Map c;
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    private final defpackage.nst e = new defpackage.xge(this, 1);
    public final java.util.Map b = new java.util.HashMap();

    public static defpackage.tho j(defpackage.ntb ntbVar, com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.nrr nrrVar) {
        defpackage.tho thoVar = new defpackage.tho();
        thoVar.e(defpackage.ntb.class, new defpackage.kpm(ntbVar, 3));
        thoVar.e(defpackage.nrr.class, new defpackage.kpm(nrrVar, 4));
        thoVar.e(defpackage.mpq.class, new defpackage.kpm(carRegionId, 5));
        return thoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    private final void k() throws lhz {
        if (!this.d.get()) {
            throw new lhz("Cannot use this method if service has not been started.");
        }
    }

    @Override // defpackage.msh
    public final void b() {
        this.d.set(false);
        java.util.Map map = this.b;
        j$.lang.Iterable.-EL.forEach(map.values(), new defpackage.ixc(17));
        java.util.Map map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
        map.clear();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        defpackage.ygw ygwVarE = defpackage.nte.c().e();
        int size = ygwVarE.size();
        for (int i = 0; i < size; i++) {
            defpackage.ntb ntbVar = (defpackage.ntb) ygwVarE.get(i);
            ntbVar.A(this.e);
            ntbVar.d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.msh
    public final void e(final defpackage.qsh qshVar) throws wfo {
        defpackage.wfp.c();
        this.c = new java.util.HashMap();
        defpackage.yqm yqmVar = defpackage.nte.a;
        defpackage.ysr.bk(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).h(), "DisplayLayoutManager must be initialized.");
        defpackage.yqm yqmVar2 = defpackage.mpy.a;
        defpackage.ysr.bk(((defpackage.mpy) defpackage.mkp.a.i(defpackage.mpy.class)).g, "AuxiliaryDisplayConfiguration must be initialized.");
        defpackage.ygw ygwVarE = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).e();
        int size = ygwVarE.size();
        for (int i = 0; i < size; i++) {
            final defpackage.ntb ntbVar = (defpackage.ntb) ygwVarE.get(i);
            defpackage.nrr nrrVar = (defpackage.nrr) j$.util.Map.-EL.computeIfAbsent(this.b, ntbVar.o, new defpackage.mmf(2));
            defpackage.ygw ygwVarS = ntbVar.s();
            int size2 = ygwVarS.size();
            for (int i2 = 0; i2 < size2; i2++) {
                com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) ygwVarS.get(i2);
                this.c.put(carRegionId, j(ntbVar, carRegionId, nrrVar));
            }
            defpackage.wfp.c();
            defpackage.kgu.c(new defpackage.kjg(new defpackage.kje() { // from class: nsr
                @Override // defpackage.kje
                public final void a() throws defpackage.qst {
                    defpackage.mkp.a.g();
                    defpackage.rcz rczVar = ((defpackage.rbu) qshVar).a;
                    defpackage.rps rpsVar = ((defpackage.ref) rczVar).f;
                    defpackage.ntb ntbVar2 = ntbVar;
                    rpsVar.g(new defpackage.req(rczVar, ntbVar2.G, 1));
                    ntbVar2.C = true;
                }
            }, 1), "GH.DisplayLayout", defpackage.zbe.DISPLAY_LAYOUT, defpackage.zbd.rN, false, "Car not connected when trying to register CarDisplayLayoutUpdateCompleteListener", new java.lang.Object[0]);
            defpackage.mib mibVarA = defpackage.mib.a();
            defpackage.wyz wyzVar = ntbVar.F;
            defpackage.wfp.c();
            mibVarA.f.add(wyzVar);
            ntbVar.w(this.e);
        }
        j$.lang.Iterable.-EL.forEach(this.b.values(), new defpackage.jpe(qshVar, 2));
        this.d.set(true);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        defpackage.nrr nrrVarA = defpackage.nrr.a();
        defpackage.omf.u().n(defpackage.ygw.s(nrrVarA.e() ? defpackage.acbk.i : defpackage.acbk.l, nrrVarA.d() ? defpackage.acbk.j : defpackage.acbk.m, nrrVarA.f() ? defpackage.acbk.k : defpackage.acbk.n));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    @Override // defpackage.msh
    public final defpackage.tho f(com.google.android.gms.car.display.CarRegionId carRegionId) throws lhz {
        k();
        defpackage.tho thoVar = (defpackage.tho) this.c.get(carRegionId);
        thoVar.getClass();
        return thoVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    @Override // defpackage.msh
    public final defpackage.tho g(defpackage.rkf rkfVar) throws lhz {
        k();
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            defpackage.tho thoVar = (defpackage.tho) entry.getValue();
            defpackage.ntb ntbVar = (defpackage.ntb) thoVar.i(defpackage.ntb.class);
            if (((com.google.android.gms.car.display.CarRegionId) entry.getKey()).a() && ntbVar.q == defpackage.rke.c) {
                if (defpackage.mpy.a().c(ntbVar.o) == rkfVar) {
                    return thoVar;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    @Override // defpackage.msh
    public final defpackage.tho h() throws lhz {
        k();
        for (java.util.Map.Entry entry : this.c.entrySet()) {
            defpackage.tho thoVar = (defpackage.tho) entry.getValue();
            defpackage.ntb ntbVar = (defpackage.ntb) thoVar.i(defpackage.ntb.class);
            if (((com.google.android.gms.car.display.CarRegionId) entry.getKey()).a() && ntbVar.q == defpackage.rke.b) {
                return thoVar;
            }
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    @Override // defpackage.msh
    public final defpackage.tho i() throws lhz {
        k();
        defpackage.tho thoVar = (defpackage.tho) this.c.get(com.google.android.gms.car.display.CarRegionId.a);
        thoVar.getClass();
        return thoVar;
    }
}
