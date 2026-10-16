package com.google.firebase.perf.e;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f10391a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f10392b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f10393c;

    private d(View view, Runnable runnable) {
        this.f10392b = new AtomicReference(view);
        this.f10393c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new d(view, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f10392b.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.firebase.perf.e.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnDrawListener(this.f10389a);
            }
        });
        this.f10391a.postAtFrontOfQueue(this.f10393c);
    }
}
