package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class jnv implements jnr {
    public static final yph a = yph.c("GH.DelegateICarSupplier");
    public final Context b;
    public final yxn c;
    public final jny d;
    public final xyc e;
    public final long f;
    public final int g;
    public final AtomicBoolean h;
    public final CountDownLatch i;
    public final AtomicLong j;
    public final AtomicBoolean k;
    private final long l;
    private final Executor m;

    public jnv(Context context, yxn yxnVar, jny jnyVar, long j, int i) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.h = new AtomicBoolean(false);
        this.i = new CountDownLatch(1);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.l = jElapsedRealtime;
        this.j = new AtomicLong(-1L);
        this.k = new AtomicBoolean(false);
        this.b = context;
        this.c = yxnVar;
        this.d = jnyVar;
        this.f = j;
        this.g = i;
        this.m = executorServiceNewSingleThreadExecutor;
        ype ypeVar = (ype) ((ype) a.f()).ai(2428);
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        zjc zjcVar = zjc.a;
        ypeVar.M("Acquisition start recorded at %s.[Generation: %s]", new zjd(zjcVar, lValueOf), new zjd(zjcVar, Integer.valueOf(i)));
        this.e = wub.L(new jbk(this, jnyVar, 3, null));
    }

    public static void d(Context context, yxn yxnVar, long j, int i, int i2, long j2, long j3) {
        int i3 = i2 - 1;
        String str = i3 != 1 ? i3 != 2 ? i3 != 3 ? "canceled" : "null" : "failed" : "successful";
        ype ypeVar = (ype) ((ype) a.f()).ai(2437);
        zjc zjcVar = zjc.a;
        ypeVar.T("Logging %s delegate lifespan (%s ms). Delay at start (%s ms). Acquisition (%s ms). [Generation: %s]", new zjd(zjcVar, str), new zjd(zjcVar, Long.valueOf(j3)), new zjd(zjcVar, Long.valueOf(j)), new zjd(zjcVar, Long.valueOf(j2)), new zjd(zjcVar, Integer.valueOf(i)));
        rpz rpzVarA = rpz.a(context);
        abnp abnpVarN = yyh.a.n();
        int i4 = yxnVar.f;
        abnpVarN.t();
        yyh yyhVar = (yyh) abnpVarN.b;
        yyhVar.b = 1 | yyhVar.b;
        yyhVar.c = i4;
        abnpVarN.t();
        yyh yyhVar2 = (yyh) abnpVarN.b;
        yyhVar2.b |= 32;
        yyhVar2.h = j;
        abnpVarN.t();
        yyh yyhVar3 = (yyh) abnpVarN.b;
        yyhVar3.b |= 2;
        yyhVar3.d = i;
        abnpVarN.t();
        yyh yyhVar4 = (yyh) abnpVarN.b;
        yyhVar4.b |= 4;
        yyhVar4.e = i3;
        abnpVarN.t();
        yyh yyhVar5 = (yyh) abnpVarN.b;
        yyhVar5.b |= 16;
        yyhVar5.g = j2;
        abnpVarN.t();
        yyh yyhVar6 = (yyh) abnpVarN.b;
        yyhVar6.b |= 8;
        yyhVar6.f = j3;
        yyh yyhVar7 = (yyh) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yyhVar7.getClass();
        yxbVar.X = yyhVar7;
        yxbVar.c |= 67108864;
        yxb yxbVar2 = (yxb) abnpVarN2.q();
        yxc yxcVar = yxc.GEARHEAD_CAR_SERVICE_DELEGATE_INFO;
        int i5 = yfq.d;
        rpzVarA.e(yxcVar, yxbVar2, yls.a);
    }

    @Override // defpackage.jnr
    public final void a(Consumer consumer, Consumer consumer2) {
        ((ype) a.l().ai((char) 2429)).u("acquire()");
        woy.aa(this.h.compareAndSet(false, true), "Cannot call acquire() more than once!");
        zgj zgjVarV = zgj.v(this.d.a);
        zgjVarV.c(new zgf(zgjVarV, new jns(this, consumer, consumer2)), this.m);
    }

    @Override // defpackage.jnr
    public final void b(Consumer consumer) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 2439)).u("release()");
        if (!this.k.compareAndSet(false, true)) {
            ((ype) ((ype) yphVar.h()).ai((char) 2441)).u("Release has already been called!");
        }
        zgp zgpVar = this.d.a;
        if (!zgpVar.isDone()) {
            ((ype) ((ype) yphVar.f()).ai((char) 2440)).u("Release called while acquisition still in progress. Canceling.");
            zgpVar.cancel(true);
        }
        wub.ah(zgj.v(zgpVar), new jnt(this, consumer), this.m);
    }

    public final /* synthetic */ Boolean c(jny jnyVar) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 2433)).u("Releasing delegate ICar.");
        AtomicLong atomicLong = this.j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.compareAndSet(-1L, jElapsedRealtime)) {
            ype ypeVar = (ype) ((ype) yphVar.f()).ai(2438);
            Long lValueOf = Long.valueOf(jElapsedRealtime);
            zjc zjcVar = zjc.a;
            ypeVar.M("Incomplete acquisition recorded at %s.[Generation: %s]", new zjd(zjcVar, lValueOf), new zjd(zjcVar, Integer.valueOf(this.g)));
        }
        wub.ah(zgj.v(this.d.a), new jnu(this, jElapsedRealtime, atomicLong.get() - this.l), this.m);
        try {
            return (Boolean) zgj.v((zgp) jnyVar.b.gu()).w(new ikj(3), zfq.a).t(250L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | TimeoutException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 2434)).u("ICar release task did not finish.");
            return false;
        } catch (ExecutionException e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2.getCause())).ai((char) 2435)).u("ICar release task failed.");
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public jnv(Context context, yxn yxnVar, Handler handler, long j, int i) {
        xyc xycVarL = wub.L(new ilk(new jbk(context, handler, 2, null), 14));
        this(context, yxnVar, new jny(new ilk(xycVarL, 15), new ilk(xycVarL, 16), j), j, i);
        if (j > 0) {
            throw new UnsupportedOperationException("Delaying connection to CarChimeraService (which is in-process) is pointless. Only call this API with delayMs of 0.");
        }
    }
}
