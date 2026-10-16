package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jdl implements defpackage.jdg {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.XFER");
    static final defpackage.jdd b = new defpackage.jdi();
    public final defpackage.jbu c;
    public final defpackage.jde d;
    public final java.util.concurrent.Executor e;
    public final java.util.concurrent.Executor f;
    public final java.util.Map g;
    public final java.lang.Object h = new java.lang.Object();
    public int i;
    public final int j;
    private final java.util.concurrent.Executor k;
    private defpackage.jdj l;
    private defpackage.jdk m;

    public jdl(int i, defpackage.jbu jbuVar, defpackage.jde jdeVar, java.util.Map map) {
        this.j = i;
        this.c = jbuVar;
        this.d = jdeVar;
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.f = executorServiceNewSingleThreadExecutor;
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor2 = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.k = executorServiceNewSingleThreadExecutor2;
        this.g = map;
        if (jdeVar == null) {
            this.e = null;
            return;
        }
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor3 = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.e = executorServiceNewSingleThreadExecutor3;
        boolean z = false;
        if (executorServiceNewSingleThreadExecutor3 != executorServiceNewSingleThreadExecutor && executorServiceNewSingleThreadExecutor3 != executorServiceNewSingleThreadExecutor2) {
            z = true;
        }
        defpackage.ysr.bk(z, "byteCounterExecutor must not be same executor as read/write executors");
    }

    @Override // defpackage.jdg
    public final void a(int i, defpackage.jdd jddVar) {
        synchronized (this.h) {
            if (this.j == 0) {
                throw null;
            }
            this.g.put(java.lang.Integer.valueOf(i), jddVar);
        }
    }

    @Override // defpackage.jdg
    public final void b(int i) {
        synchronized (this.h) {
            if (this.j == 0) {
                throw null;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            java.util.Map map = this.g;
            map.remove(numValueOf);
            map.put(numValueOf, b);
        }
    }

    @Override // defpackage.jdg
    public final void c(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (this.j == 0) {
            throw null;
        }
        synchronized (this.h) {
            defpackage.jdj jdjVar = this.l;
            if (jdjVar != null) {
                jdjVar.c();
            }
            defpackage.jdk jdkVar = this.m;
            if (jdkVar != null) {
                jdkVar.a();
            }
            this.l = new defpackage.jdj(this, parcelFileDescriptor);
            this.m = new defpackage.jdk(this, parcelFileDescriptor);
            defpackage.jdj jdjVar2 = this.l;
            defpackage.ypu ypuVarAi = a.f().ai(1892);
            java.lang.Object obj = jdjVar2.a;
            int i = ((defpackage.jdl) obj).j;
            java.lang.String strT = defpackage.ebm.t(i);
            if (i == 0) {
                throw null;
            }
            ypuVarAi.y("%s Start executor and read messages", strT);
            ((defpackage.jdl) obj).f.execute(new defpackage.ire(jdjVar2, 12));
        }
        defpackage.jde jdeVar = this.d;
        if (jdeVar != null) {
            java.util.concurrent.Executor executor = this.e;
            executor.getClass();
            executor.execute(new defpackage.ire(jdeVar, 11));
        }
    }

    @Override // defpackage.jdg
    public final void d() {
        if (this.j == 0) {
            throw null;
        }
        synchronized (this.h) {
            defpackage.jdj jdjVar = this.l;
            defpackage.jdk jdkVar = this.m;
            this.l = null;
            this.m = null;
            this.i = 0;
            if (jdjVar != null) {
                this.f.execute(new defpackage.iqv(jdjVar, 19));
            }
            if (jdkVar != null) {
                this.k.execute(new defpackage.iqv(jdkVar, 20));
            }
        }
        defpackage.jde jdeVar = this.d;
        if (jdeVar != null) {
            java.util.concurrent.Executor executor = this.e;
            executor.getClass();
            executor.execute(new defpackage.jeo(jdeVar, 1));
        }
    }

    @Override // defpackage.jdg
    public final boolean e(int i, defpackage.izu izuVar, int i2, java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        defpackage.abor aborVarN = defpackage.qug.a.n();
        aborVarN.t();
        defpackage.qug qugVar = (defpackage.qug) aborVarN.b;
        qugVar.b |= 8;
        qugVar.f = i;
        aborVarN.t();
        defpackage.qug qugVar2 = (defpackage.qug) aborVarN.b;
        qugVar2.b |= 4;
        qugVar2.e = izuVar.a;
        aborVarN.t();
        defpackage.qug qugVar3 = (defpackage.qug) aborVarN.b;
        qugVar3.b |= 32;
        qugVar3.h = izuVar.b;
        int iRemaining = byteBufferDuplicate.remaining();
        aborVarN.t();
        defpackage.qug qugVar4 = (defpackage.qug) aborVarN.b;
        qugVar4.b |= 1;
        qugVar4.c = iRemaining;
        aborVarN.t();
        defpackage.qug qugVar5 = (defpackage.qug) aborVarN.b;
        qugVar5.b |= 2;
        qugVar5.d = i2;
        aborVarN.t();
        defpackage.qug qugVar6 = (defpackage.qug) aborVarN.b;
        qugVar6.b |= 64;
        qugVar6.i = izuVar.c;
        defpackage.qug qugVar7 = (defpackage.qug) aborVarN.q();
        synchronized (this.h) {
            defpackage.jdk jdkVar = this.m;
            if (jdkVar == null) {
                return false;
            }
            int i3 = this.i;
            if (i3 >= 1024) {
                throw new jdf();
            }
            this.i = i3 + 1;
            this.k.execute(new defpackage.ye(this, jdkVar, qugVar7, byteBufferDuplicate, 10));
            return true;
        }
    }

    @Override // defpackage.jdg
    public final boolean f(int i, int i2) {
        defpackage.abor aborVarN = defpackage.qug.a.n();
        aborVarN.t();
        defpackage.qug qugVar = (defpackage.qug) aborVarN.b;
        qugVar.b |= 8;
        qugVar.f = i;
        defpackage.abor aborVarN2 = defpackage.quf.a.n();
        aborVarN2.t();
        defpackage.quf qufVar = (defpackage.quf) aborVarN2.b;
        qufVar.c = 2;
        int i3 = 1;
        qufVar.b |= 1;
        aborVarN2.t();
        defpackage.quf qufVar2 = (defpackage.quf) aborVarN2.b;
        qufVar2.b = 2 | qufVar2.b;
        qufVar2.d = i2;
        aborVarN.t();
        defpackage.qug qugVar2 = (defpackage.qug) aborVarN.b;
        defpackage.quf qufVar3 = (defpackage.quf) aborVarN2.q();
        qufVar3.getClass();
        qugVar2.g = qufVar3;
        qugVar2.b |= 16;
        defpackage.qug qugVar3 = (defpackage.qug) aborVarN.q();
        synchronized (this.h) {
            defpackage.jdk jdkVar = this.m;
            if (jdkVar != null) {
                int i4 = this.i;
                if (i4 >= 1024) {
                    throw new jdf();
                }
                this.i = i4 + 1;
                this.k.execute(new defpackage.jdh(this, jdkVar, qugVar3, i3));
                return true;
            }
            defpackage.ypu ypuVarAi = a.g().ai(1898);
            int i5 = this.j;
            java.lang.String strT = defpackage.ebm.t(i5);
            if (i5 == 0) {
                throw null;
            }
            ypuVarAi.K("%s Send channel closed control message: failed writer null %d", strT, i);
            return false;
        }
    }

    @Override // defpackage.jdg
    public final boolean g(int i) {
        defpackage.abor aborVarN = defpackage.qug.a.n();
        aborVarN.t();
        defpackage.qug qugVar = (defpackage.qug) aborVarN.b;
        qugVar.b |= 8;
        qugVar.f = i;
        defpackage.abor aborVarN2 = defpackage.quf.a.n();
        aborVarN2.t();
        defpackage.quf qufVar = (defpackage.quf) aborVarN2.b;
        qufVar.c = 1;
        qufVar.b |= 1;
        aborVarN.t();
        defpackage.qug qugVar2 = (defpackage.qug) aborVarN.b;
        defpackage.quf qufVar2 = (defpackage.quf) aborVarN2.q();
        qufVar2.getClass();
        qugVar2.g = qufVar2;
        qugVar2.b |= 16;
        defpackage.qug qugVar3 = (defpackage.qug) aborVarN.q();
        synchronized (this.h) {
            defpackage.jdk jdkVar = this.m;
            if (jdkVar != null) {
                int i2 = this.i;
                if (i2 >= 1024) {
                    throw new jdf();
                }
                this.i = i2 + 1;
                this.k.execute(new defpackage.imx(this, jdkVar, qugVar3, 4, (short[]) null));
                return true;
            }
            if (i != 0) {
                defpackage.ypu ypuVarAi = a.g().ai(1899);
                int i3 = this.j;
                java.lang.String strT = defpackage.ebm.t(i3);
                if (i3 == 0) {
                    throw null;
                }
                ypuVarAi.K("%s Send channel opened control message: failed writer null %d", strT, i);
            }
            return false;
        }
    }

    @Override // defpackage.jdg
    public final boolean h(int i, int i2) {
        defpackage.abor aborVarN = defpackage.qug.a.n();
        aborVarN.t();
        defpackage.qug qugVar = (defpackage.qug) aborVarN.b;
        qugVar.b |= 8;
        qugVar.f = i;
        defpackage.abor aborVarN2 = defpackage.quf.a.n();
        aborVarN2.t();
        defpackage.quf qufVar = (defpackage.quf) aborVarN2.b;
        qufVar.c = 3;
        qufVar.b |= 1;
        aborVarN2.t();
        defpackage.quf qufVar2 = (defpackage.quf) aborVarN2.b;
        qufVar2.b |= 4;
        qufVar2.e = i2;
        aborVarN.t();
        defpackage.qug qugVar2 = (defpackage.qug) aborVarN.b;
        defpackage.quf qufVar3 = (defpackage.quf) aborVarN2.q();
        qufVar3.getClass();
        qugVar2.g = qufVar3;
        qugVar2.b |= 16;
        defpackage.qug qugVar3 = (defpackage.qug) aborVarN.q();
        synchronized (this.h) {
            defpackage.jdk jdkVar = this.m;
            int i3 = 0;
            if (jdkVar != null) {
                int i4 = this.i;
                if (i4 >= 1024) {
                    throw new jdf();
                }
                this.i = i4 + 1;
                this.k.execute(new defpackage.jdh(this, jdkVar, qugVar3, i3));
                return true;
            }
            defpackage.ypu ypuVarAi = a.g().ai(1900);
            int i5 = this.j;
            java.lang.String strT = defpackage.ebm.t(i5);
            if (i5 == 0) {
                throw null;
            }
            ypuVarAi.K("%s Send message sent control message: failed writer null %d", strT, i);
            return false;
        }
    }
}
