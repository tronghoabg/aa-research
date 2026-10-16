package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.vungle.ads.internal.f1;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import k1.S;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32996a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f32997b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f32998c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f32999d;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f33000e;

    /* renamed from: f, reason: collision with root package name */
    public final e1 f33001f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33002g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f33003h;

    public f1(Context context, WeakHashMap trackedViews, Handler visibilityHandler) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(trackedViews, "trackedViews");
        AbstractC3340k.e(visibilityHandler, "visibilityHandler");
        this.f32996a = trackedViews;
        this.f32997b = visibilityHandler;
        this.f32998c = new Rect();
        this.f33001f = new e1(this);
        this.f32999d = new ViewTreeObserver.OnPreDrawListener() { // from class: zb.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return f1.a(this.f48471a);
            }
        };
        this.f33000e = new WeakReference(null);
        this.f33003h = a(context, (View) null);
    }

    public static final boolean a(f1 f1Var, View view, int i5) {
        f1Var.getClass();
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.c("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (view.getGlobalVisibleRect(f1Var.f32998c)) {
                long jHeight = f1Var.f32998c.height() * f1Var.f32998c.width();
                long height = view.getHeight() * view.getWidth();
                if (height > 0 && 100 * jHeight >= i5 * height) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void d(f1 f1Var) {
        if (f1Var.f33002g) {
            return;
        }
        f1Var.f33002g = true;
        f1Var.f32997b.postDelayed(f1Var.f33001f, 100L);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        AbstractC3340k.e(context, "context");
    }

    public final boolean a(Context context, View view) {
        Window window;
        View decorView;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f33000e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            WeakHashMap weakHashMap = S.f38779a;
            if (!view.isAttachedToWindow()) {
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.c("f1", "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                viewFindViewById = rootView;
            }
        }
        if (viewFindViewById == null) {
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("f1", "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = viewFindViewById.getViewTreeObserver();
        if (!viewTreeObserver2.isAlive()) {
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("f1", "The root view tree observer was not alive");
            return false;
        }
        this.f33000e = new WeakReference(viewTreeObserver2);
        viewTreeObserver2.addOnPreDrawListener(this.f32999d);
        return true;
    }

    public final void a(View view, c1 c1Var) {
        AbstractC3340k.e(view, "view");
        this.f33003h = a(view.getContext(), view);
        d1 d1Var = (d1) this.f32996a.get(view);
        if (d1Var == null) {
            d1Var = new d1();
            this.f32996a.put(view, d1Var);
            if (!this.f33002g) {
                this.f33002g = true;
                this.f32997b.postDelayed(this.f33001f, 100L);
            }
        }
        d1Var.c();
        d1Var.a(c1Var);
    }

    public final void a(View view) {
        AbstractC3340k.e(view, "view");
        this.f32996a.remove(view);
    }

    public final void a() {
        this.f32996a.clear();
        this.f32997b.removeMessages(0);
        this.f33002g = false;
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f33000e.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f32999d);
        }
        this.f33000e.clear();
    }

    public static final boolean a(f1 this$0) {
        AbstractC3340k.e(this$0, "this$0");
        if (!this$0.f33002g) {
            this$0.f33002g = true;
            this$0.f32997b.postDelayed(this$0.f33001f, 100L);
        }
        return true;
    }
}
