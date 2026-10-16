package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iny extends java.lang.Thread {
    final java.util.Map a;
    java.util.Queue b;
    final java.util.Queue c;
    final java.util.Map d;
    public final java.util.concurrent.Semaphore e;
    public final java.lang.Object f;
    public volatile boolean g;
    public volatile boolean h;
    public boolean i;
    final java.util.concurrent.Semaphore j;
    defpackage.inn k;
    public final com.google.android.gms.car.display.CarRegionId l;
    public final /* synthetic */ defpackage.ioh m;
    private boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iny(defpackage.ioh iohVar, com.google.android.gms.car.display.CarRegionId carRegionId) {
        super("ClientConnectionThread");
        this.m = iohVar;
        this.a = new java.util.HashMap();
        this.b = new java.util.ArrayDeque();
        this.c = new java.util.ArrayDeque();
        this.d = new defpackage.zd();
        this.e = new java.util.concurrent.Semaphore(0);
        this.f = new java.lang.Object();
        this.g = true;
        this.h = false;
        this.j = new java.util.concurrent.Semaphore(0);
        this.l = carRegionId;
    }

    protected final void a(boolean z) {
        ((defpackage.yqj) defpackage.ioh.b.l().ai(647)).N("Clearing queue for %s, makePending=%b", this.l, z);
        defpackage.ill.d();
        synchronized (this.f) {
            java.util.concurrent.Semaphore semaphore = this.e;
            semaphore.drainPermits();
            for (com.google.android.gms.car.display.CarRegionId carRegionId : this.b) {
                java.util.Map map = this.a;
                defpackage.inx inxVar = (defpackage.inx) map.get(carRegionId);
                if (z) {
                    this.m.n(inxVar.b);
                }
                map.remove(carRegionId);
            }
            this.b = new java.util.ArrayDeque();
            semaphore.release(this.c.size());
        }
        this.i = false;
        this.m.S(this.l);
    }

    final void b() {
        this.i = false;
    }

    public final void c() {
        synchronized (this.f) {
            this.n = this.k != null;
            this.k = null;
            java.util.concurrent.Semaphore semaphore = this.j;
            int iAvailablePermits = semaphore.availablePermits();
            if (iAvailablePermits == 0) {
                defpackage.rcm.f(semaphore);
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.h()).ai(649)).w("completion semaphore has permits already %d", iAvailablePermits);
                semaphore.drainPermits();
                defpackage.rcm.f(semaphore);
            }
        }
        b();
        defpackage.ioh iohVar = this.m;
        if (iohVar.o) {
            iohVar.S(this.l);
        }
    }

    public final void d() {
        defpackage.rbz.h(new defpackage.iks(this, 8));
    }

    public final boolean e(defpackage.inn innVar) {
        boolean z;
        synchronized (this.f) {
            z = innVar == this.k;
        }
        return z;
    }

    public final boolean f(defpackage.inn innVar) {
        synchronized (this.f) {
            if (!e(innVar)) {
                return false;
            }
            ((defpackage.yqj) defpackage.ioh.b.l().ai(652)).M("Unlocking ClientConnectionThread for %s due to %s", this.l, innVar.g());
            c();
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d6 A[Catch: all -> 0x01e5, TryCatch #2 {, blocks: (B:36:0x00a1, B:38:0x00a7, B:44:0x00fe, B:45:0x0100, B:39:0x00d6, B:41:0x00da, B:43:0x00ed), top: B:89:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da A[Catch: all -> 0x01e5, TryCatch #2 {, blocks: (B:36:0x00a1, B:38:0x00a7, B:44:0x00fe, B:45:0x0100, B:39:0x00d6, B:41:0x00da, B:43:0x00ed), top: B:89:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed A[Catch: all -> 0x01e5, TryCatch #2 {, blocks: (B:36:0x00a1, B:38:0x00a7, B:44:0x00fe, B:45:0x0100, B:39:0x00d6, B:41:0x00da, B:43:0x00ed), top: B:89:0x00a1 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        java.util.concurrent.Semaphore semaphore;
        defpackage.inx inxVar;
        int i;
        boolean z;
        while (this.g) {
            java.util.concurrent.Semaphore semaphore2 = null;
            innVar = null;
            defpackage.inn innVar = null;
            semaphore2 = null;
            try {
                try {
                    this.e.acquire();
                    defpackage.ioh iohVar = this.m;
                    com.google.android.gms.car.display.CarRegionGroup carRegionGroupA = iohVar.l.a(this.l);
                    if (carRegionGroupA == null) {
                        semaphore = null;
                    } else {
                        synchronized (iohVar.w) {
                            try {
                                java.util.Map map = iohVar.x;
                                if (map.containsKey(carRegionGroupA)) {
                                    semaphore = (java.util.concurrent.Semaphore) map.get(carRegionGroupA);
                                } else {
                                    java.util.concurrent.Semaphore semaphore3 = new java.util.concurrent.Semaphore(1);
                                    map.put(carRegionGroupA, semaphore3);
                                    semaphore = semaphore3;
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (semaphore != null) {
                        try {
                            semaphore.acquire();
                        } catch (java.lang.InterruptedException unused) {
                            semaphore2 = semaphore;
                            this.g = false;
                            if (semaphore2 != null) {
                                semaphore2.release();
                                return;
                            }
                            return;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            semaphore2 = semaphore;
                            if (semaphore2 != null) {
                                semaphore2.release();
                            }
                            throw th;
                        }
                    }
                    java.lang.Object obj = this.f;
                    synchronized (obj) {
                        com.google.android.gms.car.display.CarRegionId carRegionId = (com.google.android.gms.car.display.CarRegionId) this.b.peek();
                        if (carRegionId == null) {
                            android.content.ComponentName componentName = (android.content.ComponentName) this.c.peek();
                            if (componentName != null) {
                                inxVar = (defpackage.inx) this.d.get(componentName);
                            } else if (semaphore != null) {
                            }
                        } else {
                            inxVar = (defpackage.inx) this.a.get(carRegionId);
                        }
                        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                        new defpackage.stq(android.os.Looper.getMainLooper()).post(inxVar);
                        defpackage.tgg tggVar = defpackage.tgg.a;
                        defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_CAR_ACTIVITY_MANAGER_CAMS;
                        tggVar.b(tgfVar);
                        java.util.concurrent.Semaphore semaphore4 = this.j;
                        boolean zI = defpackage.rcm.i(semaphore4, defpackage.acps.a.fF().b());
                        long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        defpackage.abor aborVarN = defpackage.yyk.a.n();
                        synchronized (obj) {
                            if (!zI) {
                                if (!semaphore4.tryAcquire()) {
                                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ioh.b.h()).ai(653)).y("Timeout in ClientConnectionThread while launching %s", inxVar.b.a);
                                    defpackage.inn innVar2 = this.k;
                                    this.k = null;
                                    aborVarN.t();
                                    defpackage.yyk yykVar = (defpackage.yyk) aborVarN.b;
                                    yykVar.b |= 16;
                                    yykVar.g = 3;
                                    innVar = innVar2;
                                } else if (this.n) {
                                    aborVarN.t();
                                    defpackage.yyk yykVar2 = (defpackage.yyk) aborVarN.b;
                                    yykVar2.b |= 16;
                                    yykVar2.g = 1;
                                } else {
                                    aborVarN.t();
                                    defpackage.yyk yykVar3 = (defpackage.yyk) aborVarN.b;
                                    yykVar3.b |= 16;
                                    i = 2;
                                    yykVar3.g = 2;
                                    z = false;
                                }
                                z = false;
                                i = 2;
                            } else if (this.n) {
                                aborVarN.t();
                                defpackage.yyk yykVar4 = (defpackage.yyk) aborVarN.b;
                                yykVar4.b |= 16;
                                yykVar4.g = 1;
                                z = false;
                                i = 2;
                            } else {
                                aborVarN.t();
                                defpackage.yyk yykVar5 = (defpackage.yyk) aborVarN.b;
                                yykVar5.b |= 16;
                                i = 2;
                                yykVar5.g = 2;
                                z = false;
                            }
                            this.n = z;
                        }
                        if (innVar != null) {
                            tggVar.d(tgfVar, i);
                            innVar.J();
                            d();
                        } else {
                            tggVar.d(tgfVar, 1);
                        }
                        int i2 = 0;
                        while (true) {
                            java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray = inxVar.a;
                            if (i2 >= atomicIntegerArray.length()) {
                                break;
                            }
                            int i3 = atomicIntegerArray.get(i2);
                            if (i3 != 0) {
                                defpackage.abor aborVarN2 = defpackage.yyl.a.n();
                                aborVarN2.t();
                                defpackage.yyl yylVar = (defpackage.yyl) aborVarN2.b;
                                yylVar.b |= 1;
                                yylVar.c = i3;
                                defpackage.yyl yylVar2 = (defpackage.yyl) aborVarN2.q();
                                aborVarN.t();
                                defpackage.yyk yykVar6 = (defpackage.yyk) aborVarN.b;
                                yylVar2.getClass();
                                defpackage.abpj abpjVar = yykVar6.h;
                                if (!abpjVar.c()) {
                                    int size = abpjVar.size();
                                    yykVar6.h = abpjVar.d(size + size);
                                }
                                yykVar6.h.add(yylVar2);
                            }
                            i2++;
                        }
                        java.lang.String str = inxVar.f;
                        aborVarN.t();
                        defpackage.yyk yykVar7 = (defpackage.yyk) aborVarN.b;
                        str.getClass();
                        yykVar7.b |= 4;
                        yykVar7.e = str;
                        int i4 = inxVar.e;
                        aborVarN.t();
                        defpackage.yyk yykVar8 = (defpackage.yyk) aborVarN.b;
                        yykVar8.b |= 2;
                        yykVar8.d = i4;
                        java.lang.String strFlattenToShortString = inxVar.b.a.flattenToShortString();
                        aborVarN.t();
                        defpackage.yyk yykVar9 = (defpackage.yyk) aborVarN.b;
                        strFlattenToShortString.getClass();
                        yykVar9.b |= 1;
                        yykVar9.c = strFlattenToShortString;
                        aborVarN.t();
                        defpackage.yyk yykVar10 = (defpackage.yyk) aborVarN.b;
                        yykVar10.b |= 8;
                        yykVar10.f = (int) (jElapsedRealtime2 - jElapsedRealtime);
                        defpackage.jfo jfoVar = iohVar.e;
                        defpackage.yyk yykVar11 = (defpackage.yyk) aborVarN.q();
                        defpackage.abor aborVarN3 = defpackage.yyg.a.n();
                        aborVarN3.t();
                        defpackage.yyg yygVar = (defpackage.yyg) aborVarN3.b;
                        yykVar11.getClass();
                        yygVar.q = yykVar11;
                        yygVar.b |= 16384;
                        defpackage.yyh yyhVar = defpackage.yyh.COMPONENT_CONNECTION_EVENT;
                        int i5 = defpackage.ygw.d;
                        ((defpackage.jfp) jfoVar).m(aborVarN3, yyhVar, defpackage.ymx.a);
                        if (semaphore != null) {
                        }
                    }
                    semaphore.release();
                } catch (java.lang.InterruptedException unused2) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        }
    }
}
