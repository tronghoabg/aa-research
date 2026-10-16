package com.google.android.gms.common.api.internal;

import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.rbk;
import defpackage.sld;
import defpackage.slf;
import defpackage.slg;
import defpackage.sli;
import defpackage.slw;
import defpackage.slx;
import defpackage.sly;
import defpackage.smj;
import defpackage.sne;
import defpackage.spu;
import defpackage.uqw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends sli> extends slg<R> {
    public static final ThreadLocal b = new slw();
    public sli c;
    private Status h;
    private volatile boolean i;
    private boolean j;
    private volatile uqw k;
    private sly resultGuardian;
    private final Object a = new Object();
    private final CountDownLatch e = new CountDownLatch(1);
    private final ArrayList f = new ArrayList();
    private final AtomicReference g = new AtomicReference();
    public boolean d = false;

    protected BasePendingResult(sld sldVar) {
        new slx(((smj) sldVar).a.g);
        new WeakReference(sldVar);
    }

    public static void i(sli sliVar) {
        if (sliVar instanceof rbk) {
            try {
                Bitmap bitmap = ((rbk) sliVar).a;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(sliVar))), e);
            }
        }
    }

    protected abstract sli a(Status status);

    @Override // defpackage.slg
    @ResultIgnorabilityUnspecified
    public final sli c(long j, TimeUnit timeUnit) {
        sli sliVar;
        if (j > 0) {
            spu.aq("await must not be called on the UI thread when time is greater than zero.");
        }
        if (this.i) {
            throw new IllegalStateException("Result has already been consumed.");
        }
        try {
            if (!this.e.await(j, timeUnit)) {
                h(Status.d);
            }
        } catch (InterruptedException unused) {
            h(Status.b);
        }
        if (!k()) {
            throw new IllegalStateException("Result is not ready.");
        }
        synchronized (this.a) {
            if (this.i) {
                throw new IllegalStateException("Result has already been consumed.");
            }
            if (!k()) {
                throw new IllegalStateException("Result is not ready.");
            }
            sliVar = this.c;
            this.c = null;
            this.i = true;
        }
        sne sneVar = (sne) this.g.getAndSet(null);
        if (sneVar != null) {
            sneVar.a();
        }
        if (sliVar != null) {
            return sliVar;
        }
        throw new NullPointerException("null reference");
    }

    @Override // defpackage.slg
    public final void d(slf slfVar) {
        synchronized (this.a) {
            if (k()) {
                slfVar.a(this.h);
            } else {
                this.f.add(slfVar);
            }
        }
    }

    @Deprecated
    public final void h(Status status) {
        synchronized (this.a) {
            if (!k()) {
                j(a(status));
                this.j = true;
            }
        }
    }

    public final void j(sli sliVar) {
        synchronized (this.a) {
            if (this.j) {
                i(sliVar);
                return;
            }
            k();
            if (k()) {
                throw new IllegalStateException("Results have already been set");
            }
            if (this.i) {
                throw new IllegalStateException("Result has already been consumed");
            }
            this.c = sliVar;
            this.h = sliVar.b();
            this.e.countDown();
            if (this.c instanceof rbk) {
                this.resultGuardian = new sly(this);
            }
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((slf) arrayList.get(i)).a(this.h);
            }
            arrayList.clear();
        }
    }

    public final boolean k() {
        return this.e.getCount() == 0;
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        new slx(looper);
        new WeakReference(null);
    }

    @Deprecated
    BasePendingResult() {
        new slx(Looper.getMainLooper());
        new WeakReference(null);
    }
}
