package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f1932a = Executors.newCachedThreadPool(new com.airbnb.lottie.g.d());

    /* renamed from: b, reason: collision with root package name */
    private final Set f1933b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final Set f1934c = new LinkedHashSet(1);

    /* renamed from: d, reason: collision with root package name */
    private final Handler f1935d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private volatile y f1936e = null;

    ab(Callable callable, boolean z) {
        if (!z) {
            f1932a.execute(new aa(this, callable));
            return;
        }
        try {
            k((y) callable.call());
        } catch (Throwable th) {
            k(new y(th));
        }
    }

    private final synchronized void h(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f1934c);
        if (arrayList.isEmpty()) {
            com.airbnb.lottie.g.c.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((u) arrayList.get(i2)).a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        y yVar = this.f1936e;
        if (yVar == null) {
            return;
        }
        if (yVar.a() != null) {
            j(yVar.a());
        } else {
            h(yVar.b());
        }
    }

    private final synchronized void j(Object obj) {
        ArrayList arrayList = new ArrayList(this.f1933b);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((u) arrayList.get(i2)).a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(y yVar) {
        if (this.f1936e != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f1936e = yVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            i();
        } else {
            this.f1935d.post(new Runnable() { // from class: com.airbnb.lottie.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2516a.i();
                }
            });
        }
    }

    public final y a() {
        return this.f1936e;
    }

    public final synchronized void d(u uVar) {
        y yVar = this.f1936e;
        if (yVar != null && yVar.b() != null) {
            uVar.a(yVar.b());
        }
        this.f1934c.add(uVar);
    }

    public final synchronized void e(u uVar) {
        y yVar = this.f1936e;
        if (yVar != null && yVar.a() != null) {
            uVar.a(yVar.a());
        }
        this.f1933b.add(uVar);
    }

    public final synchronized void f(u uVar) {
        this.f1934c.remove(uVar);
    }

    public final synchronized void g(u uVar) {
        this.f1933b.remove(uVar);
    }

    public ab(Object obj) {
        k(new y(obj));
    }
}
