package com.bytedance.adsdk.oa;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class cq<T> {
    public static Executor uef = Executors.newCachedThreadPool();
    private volatile wrv<T> lw;
    private final Handler moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Set<dj<T>> f24532oa;
    private final Set<dj<Throwable>> yo;

    public class uef extends FutureTask<wrv<T>> {
        public uef(Callable<wrv<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                cq.this.uef((wrv) get());
            } catch (InterruptedException | ExecutionException e7) {
                cq.this.uef(new wrv(e7));
            }
        }
    }

    public cq(Callable<wrv<T>> callable) {
        this(callable, false);
    }

    public synchronized cq<T> moa(dj<Throwable> djVar) {
        this.yo.remove(djVar);
        return this;
    }

    public synchronized cq<T> oa(dj<T> djVar) {
        this.f24532oa.remove(djVar);
        return this;
    }

    public synchronized cq<T> yo(dj<Throwable> djVar) {
        try {
            wrv<T> wrvVar = this.lw;
            if (wrvVar != null && wrvVar.oa() != null) {
                djVar.uef(wrvVar.oa());
            }
            this.yo.add(djVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public cq(Callable<wrv<T>> callable, boolean z2) {
        this.f24532oa = new LinkedHashSet(1);
        this.yo = new LinkedHashSet(1);
        this.moa = new Handler(Looper.getMainLooper());
        this.lw = null;
        if (!z2) {
            uef.execute(new uef(callable));
            return;
        }
        try {
            uef((wrv) callable.call());
        } catch (Throwable th) {
            uef((wrv) new wrv<>(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(wrv<T> wrvVar) {
        if (this.lw == null) {
            this.lw = wrvVar;
            uef();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized cq<T> uef(dj<T> djVar) {
        try {
            wrv<T> wrvVar = this.lw;
            if (wrvVar != null && wrvVar.uef() != null) {
                djVar.uef(wrvVar.uef());
            }
            this.f24532oa.add(djVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void uef() {
        this.moa.post(new Runnable() { // from class: com.bytedance.adsdk.oa.cq.1
            @Override // java.lang.Runnable
            public void run() {
                wrv wrvVar = cq.this.lw;
                if (wrvVar == null) {
                    return;
                }
                if (wrvVar.uef() != null) {
                    cq.this.uef((cq) wrvVar.uef());
                } else {
                    cq.this.uef(wrvVar.oa());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void uef(T t10) {
        Iterator it = new ArrayList(this.f24532oa).iterator();
        while (it.hasNext()) {
            ((dj) it.next()).uef(t10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void uef(Throwable th) {
        ArrayList arrayList = new ArrayList(this.yo);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dj) it.next()).uef(th);
        }
    }
}
