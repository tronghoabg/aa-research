package com.google.firebase.perf.e;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f10397a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f10398b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f10399c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f10400d;

    private g(View view, Runnable runnable, Runnable runnable2) {
        this.f10398b = new AtomicReference(view);
        this.f10399c = runnable;
        this.f10400d = runnable2;
    }

    public static void a(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new g(view, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f10398b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f10397a;
        handler.post(this.f10399c);
        handler.postAtFrontOfQueue(this.f10400d);
        return true;
    }
}
