package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jod implements defpackage.jnz {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DelegateICarSupplier");
    public final android.content.Context b;
    public final defpackage.yys c;
    public final defpackage.jog d;
    public final defpackage.xzi e;
    public final long f;
    public final int g;
    public final java.util.concurrent.atomic.AtomicBoolean h;
    public final java.util.concurrent.CountDownLatch i;
    public final java.util.concurrent.atomic.AtomicLong j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    private final long l;
    private final java.util.concurrent.Executor m;

    public jod(android.content.Context context, defpackage.yys yysVar, defpackage.jog jogVar, long j, int i) {
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = new java.util.concurrent.CountDownLatch(1);
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.l = jElapsedRealtime;
        this.j = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = context;
        this.c = yysVar;
        this.d = jogVar;
        this.f = j;
        this.g = i;
        this.m = executorServiceNewSingleThreadExecutor;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(2429);
        java.lang.Long lValueOf = java.lang.Long.valueOf(jElapsedRealtime);
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("Acquisition start recorded at %s.[Generation: %s]", new defpackage.zkf(zkeVar, lValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
        this.e = defpackage.ysr.aQ(new defpackage.jbr(this, jogVar, 3, null));
    }

    public static void d(android.content.Context context, defpackage.yys yysVar, long j, int i, int i2, long j2, long j3) {
        java.lang.String str;
        int i3 = i2 - 1;
        if (i3 == 1) {
            str = "successful";
        } else if (i3 != 2) {
            str = i3 != 3 ? "canceled" : "null";
        } else {
            str = "failed";
        }
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(2438);
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.T("Logging %s delegate lifespan (%s ms). Delay at start (%s ms). Acquisition (%s ms). [Generation: %s]", new defpackage.zkf(zkeVar, str), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(j3)), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(j)), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(j2)), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
        defpackage.rqt rqtVarA = defpackage.rqt.a(context);
        defpackage.abor aborVarN = defpackage.yzm.a.n();
        int i4 = yysVar.f;
        aborVarN.t();
        defpackage.yzm yzmVar = (defpackage.yzm) aborVarN.b;
        yzmVar.b = 1 | yzmVar.b;
        yzmVar.c = i4;
        aborVarN.t();
        defpackage.yzm yzmVar2 = (defpackage.yzm) aborVarN.b;
        yzmVar2.b |= 32;
        yzmVar2.h = j;
        aborVarN.t();
        defpackage.yzm yzmVar3 = (defpackage.yzm) aborVarN.b;
        yzmVar3.b |= 2;
        yzmVar3.d = i;
        aborVarN.t();
        defpackage.yzm yzmVar4 = (defpackage.yzm) aborVarN.b;
        yzmVar4.b |= 4;
        yzmVar4.e = i3;
        aborVarN.t();
        defpackage.yzm yzmVar5 = (defpackage.yzm) aborVarN.b;
        yzmVar5.b |= 16;
        yzmVar5.g = j2;
        aborVarN.t();
        defpackage.yzm yzmVar6 = (defpackage.yzm) aborVarN.b;
        yzmVar6.b |= 8;
        yzmVar6.f = j3;
        defpackage.yzm yzmVar7 = (defpackage.yzm) aborVarN.q();
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        yzmVar7.getClass();
        yygVar.X = yzmVar7;
        yygVar.c |= 67108864;
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN2.q();
        defpackage.yyh yyhVar = defpackage.yyh.GEARHEAD_CAR_SERVICE_DELEGATE_INFO;
        int i5 = defpackage.ygw.d;
        rqtVarA.e(yyhVar, yygVar2, defpackage.ymx.a);
    }

    @Override // defpackage.jnz
    public final void a(java.util.function.Consumer consumer, java.util.function.Consumer consumer2) {
        ((defpackage.yqj) a.l().ai((char) 2430)).u("acquire()");
        defpackage.ysr.bk(this.h.compareAndSet(false, true), "Cannot call acquire() more than once!");
        defpackage.zhm zhmVarV = defpackage.zhm.v(this.d.a);
        zhmVarV.c(new defpackage.zhi(zhmVarV, new defpackage.joa(this, consumer, consumer2)), this.m);
    }

    @Override // defpackage.jnz
    public final void b(java.util.function.Consumer consumer) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 2440)).u("release()");
        if (!this.k.compareAndSet(false, true)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 2442)).u("Release has already been called!");
        }
        defpackage.zhs zhsVar = this.d.a;
        if (!zhsVar.isDone()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2441)).u("Release called while acquisition still in progress. Canceling.");
            zhsVar.cancel(true);
        }
        defpackage.ysr.cy(defpackage.zhm.v(zhsVar), new job(this, consumer), this.m);
    }

    public final /* synthetic */ java.lang.Boolean c(defpackage.jog jogVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2434)).u("Releasing delegate ICar.");
        java.util.concurrent.atomic.AtomicLong atomicLong = this.j;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (atomicLong.compareAndSet(-1L, jElapsedRealtime)) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(2439);
            java.lang.Long lValueOf = java.lang.Long.valueOf(jElapsedRealtime);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("Incomplete acquisition recorded at %s.[Generation: %s]", new defpackage.zkf(zkeVar, lValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.g)));
        }
        defpackage.ysr.cy(defpackage.zhm.v(this.d.a), new joc(this, jElapsedRealtime, atomicLong.get() - this.l), this.m);
        try {
            return (java.lang.Boolean) defpackage.zhm.v((defpackage.zhs) jogVar.b.fF()).w(new defpackage.ikt(3), defpackage.zgt.INSTANCE).t(250L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.TimeoutException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 2435)).u("ICar release task did not finish.");
            return java.lang.Boolean.FALSE;
        } catch (java.util.concurrent.ExecutionException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2.getCause())).ai((char) 2436)).u("ICar release task failed.");
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jod(android.content.Context context, defpackage.yys yysVar, android.os.Handler handler, long j, int i) {
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.ilu(new defpackage.jbr(context, handler, 2, null), 14));
        this(context, yysVar, new defpackage.jog(new defpackage.ilu(xziVarAQ, 15), new defpackage.ilu(xziVarAQ, 16), j), j, i);
        if (j > 0) {
            throw new java.lang.UnsupportedOperationException("Delaying connection to CarChimeraService (which is in-process) is pointless. Only call this API with delayMs of 0.");
        }
    }
}
