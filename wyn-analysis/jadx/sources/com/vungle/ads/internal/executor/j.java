package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j extends ThreadPoolExecutor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32993b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final c f32994a;

    static {
        new g();
    }

    public j(int i5, int i10, long j8, TimeUnit timeUnit, BlockingQueue blockingQueue, c cVar) {
        super(i5, i10, j8, timeUnit, (BlockingQueue<Runnable>) blockingQueue, cVar);
        this.f32994a = cVar;
        allowCoreThreadTimeOut(true);
    }

    public static final void b(j this$0) {
        AbstractC3340k.e(this$0, "this$0");
        StringBuilder sbA = l.a("submit error in ");
        sbA.append(this$0.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public static final void c(j this$0) {
        AbstractC3340k.e(this$0, "this$0");
        StringBuilder sbA = l.a("submit error with result in ");
        sbA.append(this$0.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final String a() {
        String str;
        c cVar = this.f32994a;
        return (cVar == null || (str = cVar.f32977a) == null) ? "VungleThreadPoolExecutor" : str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable command) {
        AbstractC3340k.e(command, "command");
        try {
            super.execute(g.a(command, new Bb.a(this, 1)));
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.a("VungleThreadPool", "execute exception", e7);
        } catch (OutOfMemoryError e10) {
            StringBuilder sbA = l.a("execute error in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e10.getLocalizedMessage());
            String string = sbA.toString();
            boolean z10 = u.f33874a;
            t.a("VungleThreadPool", string, e10);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable task) {
        AbstractC3340k.e(task, "task");
        try {
            Future<?> futureSubmit = super.submit(g.a(task, new Bb.a(this, 2)));
            AbstractC3340k.d(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.a("VungleThreadPool", "submit exception", e7);
            return new b(null);
        } catch (OutOfMemoryError e10) {
            StringBuilder sbA = l.a("submit error in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e10.getLocalizedMessage());
            String string = sbA.toString();
            boolean z10 = u.f33874a;
            t.a("VungleThreadPool", string, e10);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    public static final void a(j this$0) {
        AbstractC3340k.e(this$0, "this$0");
        StringBuilder sbA = l.a("execute error in ");
        sbA.append(this$0.a());
        new OutOfMemory(sbA.toString()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final void a(Runnable command, Runnable fail) {
        AbstractC3340k.e(command, "command");
        AbstractC3340k.e(fail, "fail");
        try {
            super.execute(g.a(command, fail));
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.a("VungleThreadPool", "execute exception with fail", e7);
            fail.run();
        } catch (OutOfMemoryError e10) {
            StringBuilder sbA = l.a("execute error with fail in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e10.getLocalizedMessage());
            String string = sbA.toString();
            boolean z10 = u.f33874a;
            t.a("VungleThreadPool", string, e10);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable task, Object obj) {
        AbstractC3340k.e(task, "task");
        try {
            Future futureSubmit = super.submit(g.a(task, new Bb.a(this, 0)), obj);
            AbstractC3340k.d(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.a("VungleThreadPool", "submit exception with result", e7);
            return new b(null);
        } catch (OutOfMemoryError e10) {
            StringBuilder sbA = l.a("submit error with result in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e10.getLocalizedMessage());
            String string = sbA.toString();
            boolean z10 = u.f33874a;
            t.a("VungleThreadPool", string, e10);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable task) {
        AbstractC3340k.e(task, "task");
        try {
            Future futureSubmit = super.submit(g.b(task, new i(this)));
            AbstractC3340k.d(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            t.b("VungleThreadPool", "submit exception callable: " + e7);
            return new b(null);
        } catch (OutOfMemoryError e10) {
            StringBuilder sbA = l.a("submit error callable in ");
            sbA.append(a());
            sbA.append(": ");
            sbA.append(e10.getLocalizedMessage());
            String string = sbA.toString();
            boolean z10 = u.f33874a;
            t.a("VungleThreadPool", string, e10);
            new OutOfMemory(string).logErrorNoReturnValue$vungle_ads_release();
            return new b(null);
        }
    }
}
