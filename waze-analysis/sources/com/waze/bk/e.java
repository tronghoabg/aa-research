package com.waze.bk;

import com.waze.navigate.gn;
import h.g.b.x;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends Thread implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16849a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f16850b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f16851c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f16852d;

    /* renamed from: e, reason: collision with root package name */
    private final List f16853e;

    /* renamed from: f, reason: collision with root package name */
    private c f16854f;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue f16855g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f16856h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f16857i;

    /* renamed from: j, reason: collision with root package name */
    private final bm f16858j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, com.waze.shared_infra.i.b bVar, com.waze.shared_infra.i.e eVar) {
        super("RenderThread");
        x.f(bVar, "nonFatalErrorReporter");
        x.f(eVar, "logger");
        this.f16849a = z;
        this.f16850b = bVar;
        this.f16851c = eVar;
        this.f16853e = new ArrayList();
        this.f16854f = new d();
        this.f16855g = new LinkedBlockingQueue();
        this.f16856h = new Object();
        this.f16857i = h.g.a(new gn(this, 14));
        this.f16858j = bu.e(0, 16, null, 5);
    }

    static final void c(e eVar, r rVar) {
        eVar.f16853e.add(rVar);
    }

    static final void f(e eVar, r rVar) {
        eVar.f16853e.remove(rVar);
    }

    public final ab a() {
        return (ab) this.f16857i.getValue();
    }

    public final void b(r rVar) {
        x.f(rVar, "surfaceManager");
        execute(new b(this, rVar, 0));
    }

    public final void d() {
        if (getState() == Thread.State.NEW) {
            this.f16850b.a(new Exception("RenderThread: calling start() before initialization"), null);
            start();
        }
    }

    public final void e(r rVar) {
        x.f(rVar, "surfaceManager");
        execute(new b(this, rVar, 1));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x.f(runnable, "command");
        this.f16855g.offer(runnable);
        Object obj = this.f16856h;
        synchronized (obj) {
            obj.notify();
        }
    }

    public final void g(c cVar) {
        x.f(cVar, "initializer");
        this.f16854f = cVar;
        setPriority(10);
        start();
    }

    public final void h() {
        if (this.f16849a) {
            return;
        }
        this.f16852d = true;
    }

    public final boolean i() {
        return this.f16849a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object objA;
        this.f16854f.b();
        while (!this.f16852d) {
            try {
                this.f16854f.d();
                BlockingQueue blockingQueue = this.f16855g;
                Runnable runnable = (Runnable) blockingQueue.poll();
                boolean z = false;
                while (runnable != null) {
                    runnable.run();
                    runnable = (Runnable) blockingQueue.poll();
                    z = true;
                }
                Iterator it = this.f16853e.iterator();
                while (it.hasNext()) {
                    if (((r) it.next()).i()) {
                        this.f16858j.c(h.ab.f48028a);
                        z = true;
                    }
                }
                this.f16854f.c();
                if (!z) {
                    Object obj = this.f16856h;
                    synchronized (obj) {
                        obj.wait(1L);
                    }
                }
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
        }
        objA = h.ab.f48028a;
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            Iterator it2 = this.f16853e.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).e();
            }
            this.f16850b.a(thC, null);
            this.f16851c.c("error in RenderThread, exiting", thC);
        }
        this.f16854f.a();
    }
}
