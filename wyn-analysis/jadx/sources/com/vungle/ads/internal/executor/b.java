package com.vungle.ads.internal.executor;

import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class b implements Future {

    /* renamed from: b, reason: collision with root package name */
    public static final String f32975b = "b";

    /* renamed from: a, reason: collision with root package name */
    public final Future f32976a;

    public b(Future future) {
        this.f32976a = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Future future = this.f32976a;
        if (future != null) {
            return future.cancel(z2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            Future future = this.f32976a;
            if (future != null) {
                return future.get();
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z2 = u.f33874a;
            String TAG = f32975b;
            AbstractC3340k.d(TAG, "TAG");
            t.c(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e7) {
            boolean z10 = u.f33874a;
            String TAG2 = f32975b;
            AbstractC3340k.d(TAG2, "TAG");
            t.a(TAG2, "error on execution", e7);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Future future = this.f32976a;
        if (future != null) {
            return future.isCancelled();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Future future = this.f32976a;
        if (future != null) {
            return future.isDone();
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit unit) {
        AbstractC3340k.e(unit, "unit");
        try {
            Future future = this.f32976a;
            if (future != null) {
                return future.get(j8, unit);
            }
            return null;
        } catch (InterruptedException unused) {
            boolean z2 = u.f33874a;
            String TAG = f32975b;
            AbstractC3340k.d(TAG, "TAG");
            t.c(TAG, "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e7) {
            boolean z10 = u.f33874a;
            String TAG2 = f32975b;
            AbstractC3340k.d(TAG2, "TAG");
            t.a(TAG2, "error on execution", e7);
            return null;
        } catch (TimeoutException e10) {
            boolean z11 = u.f33874a;
            String TAG3 = f32975b;
            AbstractC3340k.d(TAG3, "TAG");
            t.a(TAG3, "error on timeout", e10);
            t.c(TAG3, "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }
}
