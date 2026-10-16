package com.applovin.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: h, reason: collision with root package name */
    public static final Executor f23286h = new T0(0);

    /* renamed from: i, reason: collision with root package name */
    public static final Executor f23287i = new T0(1);

    /* renamed from: b, reason: collision with root package name */
    private final String f23289b;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f23293f;

    /* renamed from: g, reason: collision with root package name */
    private volatile Object f23294g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f23288a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f23290c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f23291d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f23292e = false;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(boolean z2, Object obj, Object obj2);
    }

    public t4(String str) {
        this.f23289b = str;
    }

    public static t4 a(String str, Object obj) {
        return new t4(str).b(obj);
    }

    public String toString() {
        String str;
        if (!this.f23291d) {
            str = "Waiting";
        } else if (this.f23292e) {
            str = "Success -> " + this.f23293f;
        } else {
            str = "Failed -> " + this.f23294g;
        }
        return "Promise(" + b() + ": " + str + ")";
    }

    public t4 a(Object obj) {
        a(false, null, obj);
        return this;
    }

    public t4 b(Object obj) {
        a(true, obj, null);
        return this;
    }

    public boolean c() {
        return this.f23291d;
    }

    public boolean d() {
        return this.f23291d && !this.f23292e;
    }

    private Runnable c(Executor executor, b bVar) {
        return new com.applovin.impl.mediation.ads.f(this, executor, bVar, 6);
    }

    public void a(Executor executor, Runnable runnable) {
        a(executor, new G(runnable, 3));
    }

    public String b() {
        String str = this.f23289b;
        return str != null ? str : super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Runnable runnable, boolean z2, Object obj, Object obj2) {
        if (z2) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Executor executor, b bVar) {
        try {
            executor.execute(new F(23, this, bVar));
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(Executor executor, a aVar) {
        a(executor, new G(aVar, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, boolean z2, Object obj, Object obj2) {
        if (z2) {
            return;
        }
        aVar.a(obj2);
    }

    public void a(Executor executor, b bVar) {
        Runnable runnableC = c(executor, bVar);
        synchronized (this.f23288a) {
            try {
                if (!this.f23291d) {
                    this.f23290c.add(runnableC);
                } else {
                    runnableC.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object a() {
        l1.a(d());
        return this.f23294g;
    }

    private void a(boolean z2, Object obj, Object obj2) {
        synchronized (this.f23288a) {
            try {
                if (this.f23291d) {
                    return;
                }
                this.f23293f = obj;
                this.f23294g = obj2;
                this.f23292e = z2;
                this.f23291d = true;
                Iterator it = this.f23290c.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                this.f23290c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        try {
            bVar.a(this.f23292e, this.f23293f, this.f23294g);
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        l1.a(th);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f22986D0;
        if (kVar != null) {
            kVar.D().a("Promise", "PromiseCallback: " + b(), th);
        }
    }
}
