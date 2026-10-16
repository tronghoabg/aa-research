package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class h8 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21668a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f21672e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f21673f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f21674g;

    /* renamed from: h, reason: collision with root package name */
    private final long f21675h;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private float f21678l;

    /* renamed from: m, reason: collision with root package name */
    private float f21679m;

    /* renamed from: n, reason: collision with root package name */
    private long f21680n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21669b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f21670c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f21676i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f21677j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f21681o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f21671d = new Handler(Looper.getMainLooper());

    public interface a {
        void onLogVisibilityImpression();
    }

    public h8(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f21668a = kVar.O();
        this.f21675h = ((Long) kVar.a(y4.f23574D1)).longValue();
        this.f21674g = new WeakReference(view);
        this.f21672e = new F(8, this, new WeakReference(aVar));
        this.f21673f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.T
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return this.f20843a.a(view);
            }
        };
    }

    private void c(View view) {
        View viewB = f8.b((View) this.f21674g.get());
        if (viewB == null) {
            viewB = f8.b(view);
        }
        if (viewB == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21668a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = viewB.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f21676i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f21673f);
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21668a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f21674g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f21677j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (!a(viewGroup, view2)) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21668a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
        }
        b();
        a aVar = (a) weakReference.get();
        if (aVar != null) {
            aVar.onLogVisibilityImpression();
        }
    }

    public void b() {
        synchronized (this.f21669b) {
            this.f21671d.removeMessages(0);
            b((View) this.f21674g.get());
            this.f21681o = Long.MIN_VALUE;
            this.f21677j.clear();
        }
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f21670c)) {
            return false;
        }
        long jPxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21670c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f21670c.width());
        if (jPxToDp < this.k) {
            return false;
        }
        if ((jPxToDp / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f21678l) {
            return false;
        }
        return (((float) ((long) (this.f21670c.height() * this.f21670c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f21679m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    public void a(h3 h3Var) {
        View viewL0;
        if (h3Var instanceof b3) {
            viewL0 = h3Var.y();
        } else if (!(h3Var instanceof d3)) {
            return;
        } else {
            viewL0 = ((d3) h3Var).l0();
        }
        a(h3Var.d0(), h3Var.f0(), h3Var.g0(), h3Var.h0(), viewL0);
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f21676i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f21673f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f21673f);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21668a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21668a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f21676i.clear();
    }

    public void a(int i5, float f10, float f11, long j8, View view) {
        synchronized (this.f21669b) {
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21668a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f21677j = weakReference;
                this.k = i5;
                this.f21678l = f10;
                this.f21679m = f11;
                this.f21680n = j8;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        this.f21671d.postDelayed(this.f21672e, this.f21675h);
    }

    private boolean a(View view, View view2) {
        if (b(view, view2)) {
            if (this.f21681o == Long.MIN_VALUE) {
                this.f21681o = SystemClock.uptimeMillis();
            }
            if (SystemClock.uptimeMillis() - this.f21681o >= this.f21680n) {
                return true;
            }
        }
        return false;
    }
}
