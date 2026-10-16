package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vtz extends defpackage.vtw implements defpackage.vsw, defpackage.vrf, defpackage.vqw {
    volatile defpackage.vlu a;
    public final defpackage.aclm b;
    public final defpackage.afak d;
    public final defpackage.afak e;
    public final defpackage.vtm f;
    public final defpackage.vtu g;
    public final defpackage.row h;
    private final java.util.concurrent.Executor j;
    private final defpackage.vsu k;
    private final defpackage.xyn l;
    private final defpackage.vra m;
    private final defpackage.afak r;
    private final defpackage.xyn s;
    private final defpackage.afak t;
    private final defpackage.afak u;
    private final defpackage.vsl v;
    private final defpackage.row w;
    private final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicInteger n = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger o = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger p = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicBoolean q = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);

    public vtz(defpackage.wde wdeVar, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, defpackage.xyn xynVar, defpackage.vsl vslVar, defpackage.vra vraVar, defpackage.row rowVar, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.vtm vtmVar, defpackage.vtu vtuVar, defpackage.xyn xynVar2, defpackage.afak afakVar4, defpackage.afak afakVar5, defpackage.row rowVar2) {
        this.b = aclmVar;
        this.l = xynVar;
        this.v = vslVar;
        this.m = vraVar;
        this.w = rowVar;
        this.k = wdeVar.d(defpackage.zgt.INSTANCE, aclmVar, null);
        this.j = executor;
        this.r = afakVar;
        this.d = afakVar2;
        this.e = afakVar3;
        this.f = vtmVar;
        this.g = vtuVar;
        this.s = xynVar2;
        this.t = afakVar4;
        this.u = afakVar5;
        this.h = rowVar2;
    }

    private final void s(int i, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        this.j.execute(new defpackage.zim(new defpackage.vwb(this, atomicInteger, i, 1)));
    }

    @Override // defpackage.vrf
    public final void c(android.app.Activity activity) {
        this.j.execute(new defpackage.zim(new defpackage.vtx(this, 2)));
    }

    @Override // defpackage.vrf
    public final void d(android.app.Activity activity) {
        this.a = defpackage.vlu.c(null, activity.getClass());
    }

    @Override // defpackage.vqw
    public final void g(defpackage.vlu vluVar) {
        this.a = null;
    }

    @Override // defpackage.vrf
    public final void h() {
        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9840)).u("onActivityCreated");
        if (this.q.getAndSet(true)) {
            return;
        }
        s(4, this.o);
    }

    @Override // defpackage.vsw
    public final void k() {
        defpackage.xyn xynVar = this.l;
        if (xynVar.f()) {
            ((vug) ((defpackage.afak) xynVar.b()).a()).a();
        }
        this.v.a(this);
        this.m.a(this);
        s(3, this.n);
        this.j.execute(new defpackage.zim(new defpackage.vtx(this, 0)));
    }

    @Override // defpackage.vtw
    public final java.lang.Thread.UncaughtExceptionHandler l(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new defpackage.vty(this, uncaughtExceptionHandler);
    }

    @Override // defpackage.vtw
    public final void m() {
        if (this.i.compareAndSet(false, true)) {
            java.lang.Thread.setDefaultUncaughtExceptionHandler(new defpackage.vty(this, java.lang.Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    @Override // defpackage.vtw
    public final void n() {
        s(5, this.p);
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x015e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0174  */
    /* JADX WARN: Code duplicated, block: B:53:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x01cf A[PHI: r8 r17
  0x01cf: PHI (r8v2 ajhg) = (r8v1 ajhg), (r8v22 ajhg), (r8v22 ajhg) binds: [B:59:0x01cb, B:55:0x01c3, B:57:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r17v1 boolean) = (r17v0 boolean), (r17v11 boolean), (r17v11 boolean) binds: [B:59:0x01cb, B:55:0x01c3, B:57:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9 A[Catch: InterruptedException -> 0x0249, TRY_ENTER, TryCatch #6 {InterruptedException -> 0x0249, blocks: (B:61:0x01d1, B:64:0x01d9, B:66:0x01ea, B:65:0x01e2), top: B:89:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e2 A[Catch: InterruptedException -> 0x0249, TryCatch #6 {InterruptedException -> 0x0249, blocks: (B:61:0x01d1, B:64:0x01d9, B:66:0x01ea, B:65:0x01e2), top: B:89:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0258 A[LOOP:0: B:69:0x0250->B:71:0x0258, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0263  */
    /* JADX WARN: Code duplicated, block: B:82:0x028a A[LOOP:2: B:80:0x0282->B:82:0x028a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0290  */
    /* JADX WARN: Code duplicated, block: B:86:0x0293 A[LOOP:1: B:78:0x027a->B:86:0x0293, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01cf, please report this as an issue */
    public final void o(ajhg ajhgVar, vut vutVar) {
        boolean z;
        ajhg ajhgVar2;
        boolean z2;
        boolean zG;
        defpackage.afak afakVar;
        int i;
        ajhd ajhdVarQ;
        defpackage.vtk vtkVar = (defpackage.vtk) this.b.a();
        if (vtkVar.c()) {
            defpackage.xyn xynVar = this.s;
            vqj vqjVarA = xynVar.f() ? ((defpackage.wbw) xynVar.b()).a() : vqj.a;
            boolean z3 = true;
            try {
                if (p()) {
                    defpackage.vtm vtmVar = this.f;
                    if (((java.util.concurrent.atomic.AtomicBoolean) vtmVar.g).getAndSet(false)) {
                        java.lang.Object obj = vtmVar.b;
                        defpackage.abor aborVarN = ajhd.a.n();
                        defpackage.vud vudVar = (defpackage.vud) obj;
                        defpackage.vtn vtnVar = (defpackage.vtn) vudVar.c.a();
                        if (android.os.SystemClock.uptimeMillis() - vudVar.d <= vtnVar.e) {
                            defpackage.xzi xziVar = vudVar.a;
                            defpackage.xzi xziVar2 = vudVar.b;
                            defpackage.xyn xynVar2 = (defpackage.xyn) xziVar.fF();
                            boolean zF = xynVar2.f();
                            java.lang.Object objFF = xziVar2.fF();
                            if (zF) {
                                defpackage.xyn xynVar3 = (defpackage.xyn) objFF;
                                if (xynVar3.f()) {
                                    vtl vtlVar = new vtl((java.io.File) xynVar2.b(), (java.lang.String) xynVar3.b());
                                    int iA = vtlVar.a();
                                    aborVarN.t();
                                    ajhd ajhdVar = aborVarN.b;
                                    ajhdVar.b = 2 | ajhdVar.b;
                                    ajhdVar.d = iA;
                                    int i2 = iA + 1;
                                    if (i2 >= vtnVar.d) {
                                        aborVarN.t();
                                        ajhd ajhdVar2 = aborVarN.b;
                                        ajhdVar2.c = 5;
                                        ajhdVar2.b |= 1;
                                        ajhdVarQ = (ajhd) aborVarN.q();
                                    } else {
                                        if (!vtlVar.c()) {
                                            z = z3;
                                            break;
                                        }
                                        vtlVar.b++;
                                        defpackage.abor aborVarN2 = vtt.a.n();
                                        int i3 = vtlVar.b;
                                        aborVarN2.t();
                                        vtt vttVar = aborVarN2.b;
                                        vttVar.b |= 1;
                                        vttVar.c = i3;
                                        vtt vttVarQ = aborVarN2.q();
                                        boolean z4 = false;
                                        while (true) {
                                            try {
                                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(vtlVar.b());
                                                try {
                                                    vttVarQ.g(fileOutputStream);
                                                    fileOutputStream.close();
                                                    z = z3;
                                                    break;
                                                } catch (java.lang.Throwable th) {
                                                    z = z3;
                                                    try {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (java.lang.Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        throw th;
                                                    } catch (java.io.FileNotFoundException unused) {
                                                        if (z4) {
                                                            if (i2 >= vtnVar.c) {
                                                                aborVarN.t();
                                                                ajhd ajhdVar3 = aborVarN.b;
                                                                ajhdVar3.c = 4;
                                                                ajhdVar3.b |= 1;
                                                                ajhdVarQ = (ajhd) aborVarN.q();
                                                            } else {
                                                                aborVarN.t();
                                                                ajhd ajhdVar4 = aborVarN.b;
                                                                ajhdVar4.c = 3;
                                                                ajhdVar4.b |= 1;
                                                                ajhdVarQ = (ajhd) aborVarN.q();
                                                            }
                                                            defpackage.abor aborVarK = ajhgVar.K();
                                                            aborVarK.t();
                                                            ajhg ajhgVar3 = aborVarK.b;
                                                            ajhdVarQ.getClass();
                                                            ajhgVar3.k = ajhdVarQ;
                                                            ajhgVar3.b |= 2048;
                                                            ajhgVar2 = (ajhg) aborVarK.q();
                                                            int iAr = defpackage.a.ar(ajhdVarQ.c);
                                                            if (iAr == 0) {
                                                            }
                                                            zG = defpackage.wfp.g();
                                                            afakVar = this.r;
                                                            if (zG) {
                                                                i = ((vub) afakVar.a()).b;
                                                            } else {
                                                                i = ((vub) afakVar.a()).c;
                                                            }
                                                            long j = i;
                                                            defpackage.vsu vsuVar = this.k;
                                                            defpackage.vsp vspVarA = defpackage.vsq.a();
                                                            defpackage.abor aborVarN3 = ajht.a.n();
                                                            aborVarN3.t();
                                                            ajht ajhtVar = aborVarN3.b;
                                                            ajhgVar2.getClass();
                                                            ajhtVar.i = ajhgVar2;
                                                            ajhtVar.b |= 64;
                                                            vspVarA.g((ajht) aborVarN3.q());
                                                            vspVarA.g = vqjVarA;
                                                            vspVarA.c(vtkVar.b);
                                                            vspVarA.i(((java.lang.Boolean) this.t.a()).booleanValue());
                                                            vspVarA.f(((java.lang.Long) this.u.a()).intValue());
                                                            vspVarA.e = vutVar;
                                                            vsuVar.a(vspVarA.a()).get(j, java.util.concurrent.TimeUnit.MILLISECONDS);
                                                            while (this.n.getAndDecrement() > 0) {
                                                                q(3, vtkVar);
                                                            }
                                                            if (p()) {
                                                                r(6, vtkVar, ((defpackage.vtn) this.e.a()).f);
                                                            }
                                                            while (this.o.getAndDecrement() > 0) {
                                                                q(4, vtkVar);
                                                            }
                                                            while (this.p.getAndDecrement() > 0) {
                                                                q(5, vtkVar);
                                                            }
                                                            if (z2) {
                                                                defpackage.xyn xynVar4 = vtkVar.c;
                                                            }
                                                        }
                                                        vtlVar.a.mkdirs();
                                                        z3 = z;
                                                        z4 = z3;
                                                    } catch (java.io.IOException e) {
                                                        e = e;
                                                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9836)).u("failed to write counter to disk.");
                                                        if (i2 >= vtnVar.c) {
                                                            aborVarN.t();
                                                            ajhd ajhdVar5 = aborVarN.b;
                                                            ajhdVar5.c = 4;
                                                            ajhdVar5.b |= 1;
                                                            ajhdVarQ = (ajhd) aborVarN.q();
                                                        } else {
                                                            aborVarN.t();
                                                            ajhd ajhdVar6 = aborVarN.b;
                                                            ajhdVar6.c = 3;
                                                            ajhdVar6.b |= 1;
                                                            ajhdVarQ = (ajhd) aborVarN.q();
                                                        }
                                                        defpackage.abor aborVarK2 = ajhgVar.K();
                                                        aborVarK2.t();
                                                        ajhg ajhgVar4 = aborVarK2.b;
                                                        ajhdVarQ.getClass();
                                                        ajhgVar4.k = ajhdVarQ;
                                                        ajhgVar4.b |= 2048;
                                                        ajhgVar2 = (ajhg) aborVarK2.q();
                                                        int iAr2 = defpackage.a.ar(ajhdVarQ.c);
                                                        if (iAr2 == 0) {
                                                        }
                                                        zG = defpackage.wfp.g();
                                                        afakVar = this.r;
                                                        if (zG) {
                                                            i = ((vub) afakVar.a()).b;
                                                        } else {
                                                            i = ((vub) afakVar.a()).c;
                                                        }
                                                        long j2 = i;
                                                        defpackage.vsu vsuVar2 = this.k;
                                                        defpackage.vsp vspVarA2 = defpackage.vsq.a();
                                                        defpackage.abor aborVarN4 = ajht.a.n();
                                                        aborVarN4.t();
                                                        ajht ajhtVar2 = aborVarN4.b;
                                                        ajhgVar2.getClass();
                                                        ajhtVar2.i = ajhgVar2;
                                                        ajhtVar2.b |= 64;
                                                        vspVarA2.g((ajht) aborVarN4.q());
                                                        vspVarA2.g = vqjVarA;
                                                        vspVarA2.c(vtkVar.b);
                                                        vspVarA2.i(((java.lang.Boolean) this.t.a()).booleanValue());
                                                        vspVarA2.f(((java.lang.Long) this.u.a()).intValue());
                                                        vspVarA2.e = vutVar;
                                                        vsuVar2.a(vspVarA2.a()).get(j2, java.util.concurrent.TimeUnit.MILLISECONDS);
                                                        while (this.n.getAndDecrement() > 0) {
                                                            q(3, vtkVar);
                                                        }
                                                        if (p()) {
                                                            r(6, vtkVar, ((defpackage.vtn) this.e.a()).f);
                                                        }
                                                        while (this.o.getAndDecrement() > 0) {
                                                            q(4, vtkVar);
                                                        }
                                                        while (this.p.getAndDecrement() > 0) {
                                                            q(5, vtkVar);
                                                        }
                                                        if (z2) {
                                                            defpackage.xyn xynVar5 = vtkVar.c;
                                                        }
                                                    }
                                                }
                                            } catch (java.io.FileNotFoundException unused2) {
                                                z = z3;
                                            } catch (java.io.IOException e2) {
                                                e = e2;
                                                z = z3;
                                            }
                                            vtlVar.a.mkdirs();
                                            z3 = z;
                                            z4 = z3;
                                        }
                                        if (i2 >= vtnVar.c) {
                                            aborVarN.t();
                                            ajhd ajhdVar7 = aborVarN.b;
                                            ajhdVar7.c = 4;
                                            ajhdVar7.b |= 1;
                                            ajhdVarQ = (ajhd) aborVarN.q();
                                        } else {
                                            aborVarN.t();
                                            ajhd ajhdVar8 = aborVarN.b;
                                            ajhdVar8.c = 3;
                                            ajhdVar8.b |= 1;
                                            ajhdVarQ = (ajhd) aborVarN.q();
                                        }
                                    }
                                } else {
                                    z = true;
                                    aborVarN.t();
                                    ajhd ajhdVar9 = aborVarN.b;
                                    ajhdVar9.c = 6;
                                    ajhdVar9.b |= 1;
                                    ajhdVarQ = aborVarN.q();
                                }
                            } else {
                                z = true;
                                aborVarN.t();
                                ajhd ajhdVar10 = aborVarN.b;
                                ajhdVar10.c = 6;
                                ajhdVar10.b |= 1;
                                ajhdVarQ = aborVarN.q();
                            }
                            defpackage.abor aborVarK3 = ajhgVar.K();
                            aborVarK3.t();
                            ajhg ajhgVar5 = aborVarK3.b;
                            ajhdVarQ.getClass();
                            ajhgVar5.k = ajhdVarQ;
                            ajhgVar5.b |= 2048;
                            ajhgVar2 = (ajhg) aborVarK3.q();
                            int iAr3 = defpackage.a.ar(ajhdVarQ.c);
                            z2 = (iAr3 == 0 && iAr3 == 5) ? z : false;
                            zG = defpackage.wfp.g();
                            afakVar = this.r;
                            if (zG) {
                                i = ((vub) afakVar.a()).b;
                            } else {
                                i = ((vub) afakVar.a()).c;
                            }
                            long j3 = i;
                            defpackage.vsu vsuVar3 = this.k;
                            defpackage.vsp vspVarA3 = defpackage.vsq.a();
                            defpackage.abor aborVarN5 = ajht.a.n();
                            aborVarN5.t();
                            ajht ajhtVar3 = aborVarN5.b;
                            ajhgVar2.getClass();
                            ajhtVar3.i = ajhgVar2;
                            ajhtVar3.b |= 64;
                            vspVarA3.g((ajht) aborVarN5.q());
                            vspVarA3.g = vqjVarA;
                            vspVarA3.c(vtkVar.b);
                            vspVarA3.i(((java.lang.Boolean) this.t.a()).booleanValue());
                            vspVarA3.f(((java.lang.Long) this.u.a()).intValue());
                            vspVarA3.e = vutVar;
                            vsuVar3.a(vspVarA3.a()).get(j3, java.util.concurrent.TimeUnit.MILLISECONDS);
                            while (this.n.getAndDecrement() > 0) {
                                q(3, vtkVar);
                            }
                            if (p() && !this.c.getAndSet(z)) {
                                r(6, vtkVar, ((defpackage.vtn) this.e.a()).f);
                            }
                            while (this.o.getAndDecrement() > 0) {
                                q(4, vtkVar);
                            }
                            while (this.p.getAndDecrement() > 0) {
                                q(5, vtkVar);
                            }
                            if (z2) {
                                defpackage.xyn xynVar6 = vtkVar.c;
                            }
                        }
                        aborVarN.t();
                        ajhd ajhdVar11 = aborVarN.b;
                        ajhdVar11.c = 2;
                        ajhdVar11.b |= 1;
                        ajhdVarQ = (ajhd) aborVarN.q();
                    } else {
                        defpackage.abor aborVarN6 = ajhd.a.n();
                        aborVarN6.t();
                        ajhd ajhdVar12 = aborVarN6.b;
                        ajhdVar12.c = 1;
                        ajhdVar12.b |= 1;
                        ajhdVarQ = (ajhd) aborVarN6.q();
                    }
                    z = true;
                    defpackage.abor aborVarK4 = ajhgVar.K();
                    aborVarK4.t();
                    ajhg ajhgVar6 = aborVarK4.b;
                    ajhdVarQ.getClass();
                    ajhgVar6.k = ajhdVarQ;
                    ajhgVar6.b |= 2048;
                    ajhgVar2 = (ajhg) aborVarK4.q();
                    int iAr4 = defpackage.a.ar(ajhdVarQ.c);
                    if (iAr4 == 0) {
                    }
                    zG = defpackage.wfp.g();
                    afakVar = this.r;
                    if (zG) {
                        i = ((vub) afakVar.a()).b;
                    } else {
                        i = ((vub) afakVar.a()).c;
                    }
                    long j4 = i;
                    defpackage.vsu vsuVar4 = this.k;
                    defpackage.vsp vspVarA4 = defpackage.vsq.a();
                    defpackage.abor aborVarN7 = ajht.a.n();
                    aborVarN7.t();
                    ajht ajhtVar4 = aborVarN7.b;
                    ajhgVar2.getClass();
                    ajhtVar4.i = ajhgVar2;
                    ajhtVar4.b |= 64;
                    vspVarA4.g((ajht) aborVarN7.q());
                    vspVarA4.g = vqjVarA;
                    vspVarA4.c(vtkVar.b);
                    vspVarA4.i(((java.lang.Boolean) this.t.a()).booleanValue());
                    vspVarA4.f(((java.lang.Long) this.u.a()).intValue());
                    vspVarA4.e = vutVar;
                    vsuVar4.a(vspVarA4.a()).get(j4, java.util.concurrent.TimeUnit.MILLISECONDS);
                    while (this.n.getAndDecrement() > 0) {
                        q(3, vtkVar);
                    }
                    if (p()) {
                        r(6, vtkVar, ((defpackage.vtn) this.e.a()).f);
                    }
                    while (this.o.getAndDecrement() > 0) {
                        q(4, vtkVar);
                    }
                    while (this.p.getAndDecrement() > 0) {
                        q(5, vtkVar);
                    }
                    if (z2) {
                        defpackage.xyn xynVar7 = vtkVar.c;
                    }
                }
                z = true;
                ajhgVar2 = ajhgVar;
                zG = defpackage.wfp.g();
                afakVar = this.r;
                if (zG) {
                    i = ((vub) afakVar.a()).b;
                } else {
                    i = ((vub) afakVar.a()).c;
                }
                long j5 = i;
                defpackage.vsu vsuVar5 = this.k;
                defpackage.vsp vspVarA5 = defpackage.vsq.a();
                defpackage.abor aborVarN8 = ajht.a.n();
                aborVarN8.t();
                ajht ajhtVar5 = aborVarN8.b;
                ajhgVar2.getClass();
                ajhtVar5.i = ajhgVar2;
                ajhtVar5.b |= 64;
                vspVarA5.g((ajht) aborVarN8.q());
                vspVarA5.g = vqjVarA;
                vspVarA5.c(vtkVar.b);
                vspVarA5.i(((java.lang.Boolean) this.t.a()).booleanValue());
                vspVarA5.f(((java.lang.Long) this.u.a()).intValue());
                vspVarA5.e = vutVar;
                vsuVar5.a(vspVarA5.a()).get(j5, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException unused3) {
                java.lang.Thread.currentThread().interrupt();
            }
            while (this.n.getAndDecrement() > 0) {
                q(3, vtkVar);
            }
            if (p()) {
                r(6, vtkVar, ((defpackage.vtn) this.e.a()).f);
            }
            while (this.o.getAndDecrement() > 0) {
                q(4, vtkVar);
            }
            while (this.p.getAndDecrement() > 0) {
                q(5, vtkVar);
            }
            if (z2) {
                defpackage.xyn xynVar8 = vtkVar.c;
            }
        }
    }

    public final boolean p() {
        return ((defpackage.vtn) this.e.a()).b;
    }

    public final defpackage.zhs q(int i, defpackage.vtk vtkVar) {
        return r(i, vtkVar, vtkVar.a / 100.0f);
    }

    public final defpackage.zhs r(int i, defpackage.vtk vtkVar, float f) {
        if (!vtkVar.c()) {
            return defpackage.zho.a;
        }
        if (!this.w.e(f).a()) {
            return defpackage.zho.a;
        }
        defpackage.vsu vsuVar = this.k;
        defpackage.vsp vspVarA = defpackage.vsq.a();
        defpackage.abor aborVarN = ajht.a.n();
        defpackage.abor aborVarN2 = ajhq.a.n();
        float f2 = 1.0f / f;
        aborVarN2.t();
        ajhq ajhqVar = aborVarN2.b;
        ajhqVar.b |= 2;
        ajhqVar.d = (int) f2;
        aborVarN2.t();
        ajhq ajhqVar2 = aborVarN2.b;
        ajhqVar2.c = i - 1;
        ajhqVar2.b |= 1;
        aborVarN.t();
        ajht ajhtVar = aborVarN.b;
        ajhq ajhqVarQ = aborVarN2.q();
        ajhqVarQ.getClass();
        ajhtVar.A = ajhqVarQ;
        ajhtVar.b |= 8388608;
        vspVarA.g((ajht) aborVarN.q());
        return vsuVar.a(vspVarA.a());
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void b(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.vqw
    public final /* synthetic */ void j(defpackage.vlu vluVar) {
    }
}
