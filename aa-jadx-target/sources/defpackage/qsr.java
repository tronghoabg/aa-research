package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsr {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public qsr() {
        this.b = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        this.d = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        this.f = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        this.e = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        this.a = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
        new java.util.concurrent.ConcurrentLinkedDeque();
        j$.util.DesugarCollections.synchronizedSortedSet(new java.util.TreeSet(tvf.a));
        this.c = new defpackage.htw((byte[]) null, (byte[]) null, (short[]) null);
    }

    public final void a() {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.e).compareAndSet(true, false)) {
            ((pte) this.b).e(this.c);
        }
    }

    public final void b(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            uas uasVar = ((uat) it.next()).b;
            if (uasVar != null) {
                ((defpackage.rkc) this.e).e(uasVar.b, uasVar);
                int i = 0;
                while (true) {
                    defpackage.ygw ygwVar = uasVar.c;
                    if (i < ((defpackage.ymx) ygwVar).c) {
                        uau uauVar = (uau) ygwVar.get(i);
                        ((defpackage.rkc) this.b).e(uauVar.a(), uauVar);
                        i++;
                    }
                }
            }
        }
    }

    public final void c(toz tozVar, uac uacVar) {
        ((defpackage.rkc) this.e).d(tozVar, uacVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Type inference failed for: r0v3, types: [afak, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, xzi] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tmy] */
    public final void d() {
        ?? r2;
        j$.util.Optional optional;
        java.lang.String strTrim;
        if (((defpackage.sr) this.f).t(pzj.bG)) {
            ?? r0 = this.d;
            ?? r1 = this.a;
            if (r1 == 0 || (r2 = this.e) == 0) {
                return;
            }
            char c = 1;
            if (((java.util.concurrent.atomic.AtomicBoolean) this.b).getAndSet(true)) {
                return;
            }
            wep wepVar = (wep) r1.fF();
            adft adftVar = adft.a;
            if (adftVar.b().c()) {
                boolean zB = adftVar.b().b();
                boolean zA = adftVar.b().a();
                if (zB) {
                    c = 2;
                } else if (zA) {
                    c = 3;
                } else {
                    java.lang.Object obj = wepVar.b;
                    optional = vdu.a;
                    if (!optional.isEmpty()) {
                        strTrim = ((java.lang.String) optional.get()).trim();
                        if (wepVar.c("level_1_gpu_blocklist", strTrim)) {
                            c = 2;
                        } else if (wepVar.c("level_1_gpu_allowlist", strTrim)) {
                            c = 3;
                        }
                    }
                }
            } else {
                java.lang.Object obj2 = wepVar.b;
                optional = vdu.a;
                if (!optional.isEmpty()) {
                    strTrim = ((java.lang.String) optional.get()).trim();
                    if (wepVar.c("level_1_gpu_blocklist", strTrim)) {
                        c = 2;
                    } else if (wepVar.c("level_1_gpu_allowlist", strTrim)) {
                        c = 3;
                    }
                }
            }
            ywn ywnVar = ywn.p;
            if (c == 3) {
                ywn ywnVar2 = ywn.o;
            } else if (c == 2) {
                ywn ywnVar3 = ywn.q;
            }
            qbs qbsVar = (qbs) r0.a();
            j$.time.Duration.ofMillis(r2.a());
            qbsVar.c(new qbe((byte[]) null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xzi] */
    public final boolean e() {
        if (((java.lang.Boolean) this.c.fF()).booleanValue()) {
            return true;
        }
        d();
        return false;
    }

    public final void f(tuz tuzVar, java.util.concurrent.Executor executor) {
        ((defpackage.htw) this.c).y(tuzVar, executor);
    }

    public final void g(tuz tuzVar) {
        vbd vbdVar;
        java.lang.Object obj = this.c;
        synchronized (obj) {
            vbdVar = (vbd) ((java.util.HashMap) ((defpackage.htw) obj).a).remove(tuzVar);
        }
        if (vbdVar != null) {
            vbdVar.a = true;
        }
    }

    public final void h() {
        ((defpackage.htw) this.b).z(new defpackage.rdi(12));
    }

    public qsr(qxm qxmVar, defpackage.qxq qxqVar, android.os.Looper looper) throws android.os.RemoteException {
        defpackage.qxn qxnVar = new defpackage.qxn(this, 0);
        this.d = qxnVar;
        defpackage.qxs qxsVar = new defpackage.qxs(this);
        this.e = qxsVar;
        kel kelVar = new kel(2);
        this.c = kelVar;
        this.b = new defpackage.stq(looper, (android.os.Handler.Callback) kelVar);
        this.f = qxmVar;
        this.a = qxqVar;
        qxqVar.h(qxsVar);
        if (qxmVar != null) {
            defpackage.ijv ijvVar = (defpackage.ijv) qxmVar;
            android.os.Parcel parcelFp = ijvVar.fp();
            defpackage.ijx.i(parcelFp, qxnVar);
            android.os.Parcel parcelFq = ijvVar.fq(5, parcelFp);
            defpackage.ijx.j(parcelFq);
            parcelFq.recycle();
        }
    }

    public qsr(pte pteVar, java.util.concurrent.Executor executor, defpackage.aclm aclmVar, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.b = pteVar;
        this.a = executor;
        this.f = aclmVar;
        this.d = optional3;
        aclmVar.a();
        this.c = new kzy(aclmVar, optional, optional2, optional4);
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public qsr(defpackage.sr srVar, defpackage.afak afakVar, defpackage.afak afakVar2, defpackage.tmy tmyVar, defpackage.xzi xziVar) {
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = srVar;
        this.d = afakVar2;
        this.e = tmyVar;
        this.a = xziVar;
        this.c = defpackage.ysr.aQ(new qfz(afakVar, 8));
        defpackage.ysr.aQ(new defpackage.pmg(srVar, afakVar, 7));
        defpackage.ysr.aQ(new rdw(4));
    }

    public qsr(plr plrVar, java.util.concurrent.Executor executor, upc upcVar) {
        this.d = executor;
        this.a = upcVar;
        this.c = new uar(50, plt.q, plrVar);
        this.e = new defpackage.rkc(new uar(1024, plt.r, plrVar));
        this.b = new defpackage.rkc(new uar(1024, plt.s, plrVar));
        this.f = new java.util.HashMap();
    }
}
