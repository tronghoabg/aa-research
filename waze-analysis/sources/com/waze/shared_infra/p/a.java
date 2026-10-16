package com.waze.shared_infra.p;

import com.waze.shared_infra.i.b;
import com.waze.shared_infra.i.e;
import e.b.c;
import h.f;
import h.g;
import h.g.b.x;
import h.m;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends Thread implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final e f37924a;

    /* renamed from: b, reason: collision with root package name */
    private final b f37925b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f37926c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f37927d;

    /* renamed from: e, reason: collision with root package name */
    private final f f37928e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i2, e eVar, b bVar) {
        super(str);
        x.f(str, "threadName");
        x.f(eVar, "logger");
        x.f(bVar, "exceptionReporter");
        this.f37924a = eVar;
        this.f37925b = bVar;
        setPriority(i2);
        this.f37926c = new AtomicBoolean(false);
        this.f37927d = new LinkedBlockingQueue();
        this.f37928e = g.a(new com.waze.bk.f(this, 12));
    }

    public final ab a() {
        if (!this.f37926c.getAndSet(true)) {
            this.f37924a.e("Starting thread");
            start();
        }
        return (ab) this.f37928e.getValue();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x.f(runnable, "command");
        this.f37927d.offer(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Object objA;
        this.f37924a.e("thread execution started");
        while (true) {
            try {
                try {
                    a aVar = this;
                    ((Runnable) this.f37927d.take()).run();
                    objA = h.ab.f48028a;
                } catch (Throwable th) {
                    objA = c.a(th);
                }
                Throwable thC = m.c(objA);
                if (thC != null) {
                    this.f37924a.c("Error in thread", thC);
                    this.f37925b.a(thC, null);
                }
            } catch (InterruptedException unused) {
                this.f37924a.e("thread execution stopped, will terminate");
                return;
            }
        }
    }
}
