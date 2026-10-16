package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f5 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f21553a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f21554b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f21555c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21556d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f21557e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f21558f;

    /* renamed from: g, reason: collision with root package name */
    private a f21559g;

    public interface a {
        void a(int i5, int i10);
    }

    public f5(View view) {
        this.f21557e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f21558f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.P
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f20823a.b();
            }
        };
        this.f21558f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f21554b) {
            try {
                this.f21556d = false;
                int iMin = -1;
                int iMax = -1;
                for (Map.Entry entry : this.f21553a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (iMin == -1 && iMax == -1) {
                            iMin = num.intValue();
                            iMax = num.intValue();
                        } else {
                            iMin = Math.min(iMin, ((Integer) entry.getValue()).intValue());
                            iMax = Math.max(iMax, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f21559g;
                if (aVar != null) {
                    aVar.a(iMin, iMax);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.f21556d) {
            return;
        }
        this.f21556d = true;
        this.f21555c.postDelayed(new D0(this, 7), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f21559g = null;
        View view = (View) this.f21557e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f21558f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f21557e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f21554b) {
            this.f21553a.remove(view);
        }
    }

    public void a(a aVar) {
        this.f21559g = aVar;
    }

    public void a(View view, int i5) {
        synchronized (this.f21554b) {
            this.f21553a.put(view, Integer.valueOf(i5));
            d();
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }
}
