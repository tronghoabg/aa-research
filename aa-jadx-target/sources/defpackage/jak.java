package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jak implements defpackage.jae {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    public static final defpackage.kwv l = new defpackage.kwv("debug.car.framer_send_latency");
    public final android.content.Context b;
    final defpackage.jcn c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.Semaphore e;
    public defpackage.jch f;
    public iyx g;
    final int h;
    public final boolean i;
    public final boolean j;
    public final defpackage.izq k;
    private final defpackage.jai m;
    private final defpackage.jaj n;
    private final defpackage.jaw o;

    public jak(defpackage.jad jadVar) {
        defpackage.jaj jajVar;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        this.d = atomicBoolean;
        this.e = new java.util.concurrent.Semaphore(0);
        defpackage.izq izqVar = jadVar.h;
        this.k = izqVar;
        this.f = null;
        this.g = jadVar.a;
        android.content.Context context = jadVar.g;
        this.b = context;
        defpackage.jag jagVar = jadVar.e;
        this.h = jagVar.a;
        defpackage.jcb jcbVar = jagVar.d;
        this.i = jcbVar.o;
        this.j = jcbVar.p;
        defpackage.jah jahVar = new defpackage.jah(jadVar.g, jadVar.c, jadVar.f, jagVar);
        jahVar.start();
        this.o = new defpackage.jaw(jahVar);
        int i = jadVar.e.b;
        if (i > 0) {
            jajVar = new defpackage.jaj(this, jadVar.d, i);
            this.n = jajVar;
        } else {
            jajVar = new defpackage.jaj(this, jadVar.d);
            this.n = jajVar;
        }
        defpackage.jag jagVar2 = jadVar.e;
        java.util.function.BiFunction biFunction = jadVar.b;
        a.f().ai(1734).u("Creating per-channel priority writer thread.");
        this.c = new defpackage.jbm(jajVar, izqVar, context, jagVar2, biFunction);
        this.m = new defpackage.jai(this, jadVar.i);
        atomicBoolean.set(false);
    }

    @Override // defpackage.jae
    public final void a(java.io.PrintWriter printWriter) {
        printWriter.println("PerChannelQueues:");
        int i = 0;
        while (true) {
            defpackage.jbl[] jblVarArr = ((defpackage.jbm) this.c).l;
            int length = jblVarArr.length;
            if (i >= 256) {
                return;
            }
            defpackage.jbl jblVar = jblVarArr[i];
            if (jblVar != null) {
                jblVar.g(i, printWriter);
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jae
    public final void b() throws java.io.IOException {
        defpackage.jcn jcnVar = this.c;
        jcnVar.e();
        while (true) {
            defpackage.ysr.cb((java.lang.Thread) jcnVar, 5L, java.util.concurrent.TimeUnit.SECONDS);
            if (!((defpackage.jbm) jcnVar).isAlive()) {
                return;
            } else {
                defpackage.jbm.a.h().ai(1773).u("Joining PerChannelWriterThread is taking a long time...");
            }
        }
    }

    @Override // defpackage.jae
    public final void c(defpackage.izk izkVar) {
        defpackage.jbm jbmVar = (defpackage.jbm) this.c;
        defpackage.jbl[] jblVarArr = jbmVar.l;
        int i = izkVar.b;
        if (jblVarArr[i] != null) {
            defpackage.jbm.a.h().ai(1772).w("InitializeForChannel called twice for channel %d", i);
            return;
        }
        defpackage.jei jeiVar = izkVar.f;
        defpackage.jei jeiVar2 = defpackage.jei.AUDIO_MEDIA;
        if (jeiVar != jeiVar2 && jeiVar != defpackage.jei.AUDIO_GUIDANCE) {
            defpackage.jbm.a.f().ai(1771).w("Creating PerChannelQueue for channel %d", i);
            jblVarArr[i] = new defpackage.jbl(jbmVar, jeiVar);
            return;
        }
        defpackage.jbm.a.f().ai(1770).w("Creating AudioPerChannelQueue for channel %d", i);
        defpackage.ipz ipzVar = (defpackage.ipz) a$.ExternalSyntheticApiModelOutline2.m(jbmVar.g, java.lang.Integer.valueOf(jeiVar == jeiVar2 ? 3 : 5), java.lang.Boolean.FALSE);
        long j = ipzVar.a * 1000000;
        long j2 = ipzVar.b * 1000000;
        long j3 = ipzVar.c * 1000000;
        long j4 = ipzVar.d * 1000000;
        if (j2 == 0) {
            j2 = Long.MAX_VALUE;
        }
        if (j == 0) {
            j = Long.MAX_VALUE;
        }
        jblVarArr[i] = new defpackage.jbk(jbmVar, jeiVar, j, j2, j3, j4);
    }

    @Override // defpackage.jae
    public final void d() throws java.io.IOException {
        android.content.Context context = this.b;
        if (context != null && (this.d.get() || this.c.k())) {
            defpackage.omv.i(context, defpackage.yyn.FRAMER_STOPPED);
        }
        try {
            java.lang.Thread thread = null;
            if (this.d.compareAndSet(true, false)) {
                try {
                    thread = (java.lang.Thread) defpackage.jau.a(this.o.a());
                } catch (android.os.RemoteException e) {
                    a.g().p(e).ai(1741).u("Impossible");
                }
            }
            if (thread != null) {
                try {
                    thread.join(400L);
                } catch (java.lang.InterruptedException unused) {
                }
                if (thread.isAlive()) {
                    a.h().ai(1740).u("reader thread stuck? Trying SIGQUIT.");
                    android.os.Process.sendSignal(android.os.Process.myPid(), 3);
                    android.os.Process.sendSignal(android.os.Process.myPid(), 3);
                    try {
                        thread.join(400L);
                    } catch (java.lang.InterruptedException unused2) {
                    }
                    if (thread.isAlive()) {
                        java.lang.Object obj = this.k.a;
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).ai((char) 2486)).u("Reader thread stuck.");
                    }
                }
            }
            try {
                this.c.j();
            } catch (java.lang.RuntimeException e2) {
                a.g().p(e2).ai(1735).u("Exception while trying to stop writer thread.");
            }
        } catch (java.lang.Throwable th) {
            try {
                this.c.j();
            } catch (java.lang.RuntimeException e3) {
                a.g().p(e3).ai(1736).u("Exception while trying to stop writer thread.");
            }
            throw th;
        }
    }

    @Override // defpackage.jae
    public final void e(iyx iyxVar) {
        this.g = iyxVar;
        try {
            this.o.b(iyxVar != null ? new jar(iyxVar) : null);
        } catch (android.os.RemoteException e) {
            a.g().p(e).ai(1737).u("Impossible");
        }
    }

    @Override // defpackage.jae
    public final void f(defpackage.jch jchVar) {
        this.f = jchVar;
        jchVar.k[0] = java.nio.ByteBuffer.allocateDirect(jchVar.n + 8);
        this.e.release();
        a.l().ai(1738).u("Ssl negotiation complete, turning on encryption!");
    }

    @Override // defpackage.jae
    public final void g() {
        this.c.i();
        if (this.d.compareAndSet(false, true)) {
            try {
                defpackage.jaw jawVar = this.o;
                defpackage.jai jaiVar = this.m;
                defpackage.yqk yqkVar = defpackage.jbw.a;
                if (!jawVar.c(new defpackage.jau(jaiVar))) {
                    this.k.a(defpackage.zak.READER_INIT_FAIL);
                }
            } catch (android.os.RemoteException e) {
                a.g().p(e).ai(1739).u("Impossible");
            }
        }
        android.content.Context context = this.b;
        if (context != null) {
            defpackage.omv.i(context, defpackage.yyn.FRAMER_STARTED);
        }
    }

    @Override // defpackage.jae
    public final void h(int i, defpackage.jcu jcuVar, boolean z, defpackage.izu izuVar) {
        boolean z2 = !z;
        defpackage.jaj jajVar = this.n;
        if (z && jcuVar.d() > jajVar.e.h - 4) {
            throw new java.lang.IllegalArgumentException("Message is too long to send as one fragment");
        }
        defpackage.izt iztVar = new defpackage.izt(i, jcuVar, z2, z, izuVar);
        defpackage.jcn jcnVar = jajVar.e.c;
        if (((defpackage.jbm) jcnVar).e) {
            long andIncrement = ((defpackage.jbm) jcnVar).m.getAndIncrement();
            if (andIncrement <= 0) {
                throw new java.lang.IllegalStateException();
            }
            iztVar.k = andIncrement;
        }
        synchronized (jcnVar) {
            if (!((defpackage.jbm) jcnVar).j && !((defpackage.jbm) jcnVar).i) {
                ((defpackage.jbm) jcnVar).l[iztVar.b].e(iztVar);
                return;
            }
            defpackage.jbm.a.h().ai(1777).u("Message sent after shutown ignored!");
            iztVar.c.close();
        }
    }
}
