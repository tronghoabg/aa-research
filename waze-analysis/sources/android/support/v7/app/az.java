package android.support.v7.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.app.dc;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.gm;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class az extends android.support.a.i implements android.support.v7.widget.f {
    private static final Interpolator q = new AccelerateInterpolator();
    private static final Interpolator r = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f564a;

    /* renamed from: b, reason: collision with root package name */
    ActionBarOverlayLayout f565b;

    /* renamed from: c, reason: collision with root package name */
    ActionBarContainer f566c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarContextView f567d;

    /* renamed from: e, reason: collision with root package name */
    View f568e;

    /* renamed from: f, reason: collision with root package name */
    ay f569f;

    /* renamed from: g, reason: collision with root package name */
    android.support.v7.view.b f570g;

    /* renamed from: h, reason: collision with root package name */
    android.support.v7.view.a f571h;

    /* renamed from: i, reason: collision with root package name */
    boolean f572i;

    /* renamed from: j, reason: collision with root package name */
    boolean f573j;

    /* renamed from: k, reason: collision with root package name */
    android.support.v7.view.k f574k;

    /* renamed from: l, reason: collision with root package name */
    boolean f575l;
    final ViewPropertyAnimatorListener m;
    final ViewPropertyAnimatorListener n;
    final ViewPropertyAnimatorUpdateListener o;
    gm p;
    private Context s;
    private boolean t;
    private boolean u;
    private final ArrayList v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    public az(Activity activity, boolean z) throws Resources.NotFoundException {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.f572i = true;
        this.y = true;
        this.m = new av(this);
        this.n = new aw(this);
        this.o = new ax(this);
        View decorView = activity.getWindow().getDecorView();
        r(decorView);
        if (z) {
            return;
        }
        this.f568e = decorView.findViewById(R.id.content);
    }

    static boolean q(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void r(View view) throws Resources.NotFoundException {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.waze.R.id.decor_content_parent);
        this.f565b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.f(this);
        }
        View viewFindViewById = view.findViewById(com.waze.R.id.action_bar);
        if (!(viewFindViewById instanceof Toolbar)) {
            StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
            sb.append(viewFindViewById != null ? viewFindViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(sb.toString());
        }
        this.p = ((Toolbar) viewFindViewById).C();
        this.f567d = (ActionBarContextView) view.findViewById(com.waze.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.waze.R.id.action_bar_container);
        this.f566c = actionBarContainer;
        gm gmVar = this.p;
        if (gmVar == null || this.f567d == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.f564a = gmVar.b();
        if ((this.p.a() & 4) != 0) {
            this.t = true;
        }
        Context context = this.f564a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        dc.b(context);
        t();
        TypedArray typedArrayObtainStyledAttributes = this.f564a.obtainStyledAttributes(null, android.support.v7.a.a.f479a, com.waze.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f565b.n()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f575l = true;
            this.f565b.g(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ViewCompat.setElevation(this.f566c, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void s(boolean z) {
        View view;
        View view2;
        View view3;
        boolean zQ = q(this.f573j, this.x);
        boolean z2 = this.y;
        if (!zQ) {
            if (z2) {
                this.y = false;
                android.support.v7.view.k kVar = this.f574k;
                if (kVar != null) {
                    kVar.a();
                }
                if (this.w == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.f566c.setAlpha(1.0f);
                    this.f566c.a(true);
                    android.support.v7.view.k kVar2 = new android.support.v7.view.k();
                    float f2 = -this.f566c.getHeight();
                    if (z) {
                        this.f566c.getLocationInWindow(new int[]{0, 0});
                        f2 -= r7[1];
                    }
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(this.f566c);
                    viewPropertyAnimatorCompatAnimate.translationY(f2);
                    viewPropertyAnimatorCompatAnimate.setUpdateListener(this.o);
                    kVar2.d(viewPropertyAnimatorCompatAnimate);
                    if (this.f572i && (view = this.f568e) != null) {
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate2 = ViewCompat.animate(view);
                        viewPropertyAnimatorCompatAnimate2.translationY(f2);
                        kVar2.d(viewPropertyAnimatorCompatAnimate2);
                    }
                    kVar2.g(q);
                    kVar2.f();
                    kVar2.h(this.m);
                    this.f574k = kVar2;
                    kVar2.c();
                    return;
                }
                this.m.onAnimationEnd(null);
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.y = true;
        android.support.v7.view.k kVar3 = this.f574k;
        if (kVar3 != null) {
            kVar3.a();
        }
        this.f566c.setVisibility(0);
        if (this.w != 0) {
            this.f566c.setAlpha(1.0f);
            this.f566c.setTranslationY(0.0f);
            if (this.f572i && (view2 = this.f568e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.n.onAnimationEnd(null);
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                }
                this.f566c.setAlpha(1.0f);
                this.f566c.setTranslationY(0.0f);
                if (this.f572i) {
                    view2.setTranslationY(0.0f);
                }
                this.n.onAnimationEnd(null);
            }
            this.f566c.setTranslationY(0.0f);
            float f3 = -this.f566c.getHeight();
            if (z) {
                this.f566c.getLocationInWindow(new int[]{0, 0});
                f3 -= r7[1];
            }
            this.f566c.setTranslationY(f3);
            android.support.v7.view.k kVar4 = new android.support.v7.view.k();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate3 = ViewCompat.animate(this.f566c);
            viewPropertyAnimatorCompatAnimate3.translationY(0.0f);
            viewPropertyAnimatorCompatAnimate3.setUpdateListener(this.o);
            kVar4.d(viewPropertyAnimatorCompatAnimate3);
            if (this.f572i && (view3 = this.f568e) != null) {
                view3.setTranslationY(f3);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate4 = ViewCompat.animate(this.f568e);
                viewPropertyAnimatorCompatAnimate4.translationY(0.0f);
                kVar4.d(viewPropertyAnimatorCompatAnimate4);
            }
            kVar4.g(r);
            kVar4.f();
            kVar4.h(this.n);
            this.f574k = kVar4;
            kVar4.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f565b;
        if (actionBarOverlayLayout != null) {
            ViewCompat.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    private final void t() {
        this.p.j();
    }

    @Override // android.support.a.i
    public final Context e() {
        if (this.s == null) {
            TypedValue typedValue = new TypedValue();
            this.f564a.getTheme().resolveAttribute(com.waze.R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.s = new ContextThemeWrapper(this.f564a, i2);
            } else {
                this.s = this.f564a;
            }
        }
        return this.s;
    }

    @Override // android.support.a.i
    public final void f(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) arrayList.get(i2)).a();
        }
    }

    @Override // android.support.a.i
    public final void g(boolean z) {
        if (this.t) {
            return;
        }
        int i2 = true != z ? 0 : 4;
        int iA = this.p.a();
        this.t = true;
        this.p.e((i2 & 4) | (iA & (-5)));
    }

    @Override // android.support.a.i
    public final void h(boolean z) {
        android.support.v7.view.k kVar;
        this.z = z;
        if (z || (kVar = this.f574k) == null) {
            return;
        }
        kVar.a();
    }

    @Override // android.support.a.i
    public final void i(CharSequence charSequence) {
        this.p.h(charSequence);
    }

    @Override // android.support.a.i
    public final void j() throws Resources.NotFoundException {
        dc.b(this.f564a);
        t();
    }

    public final void k(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB2;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                s(false);
            }
        } else if (z2) {
            this.x = false;
            s(false);
        }
        if (!this.f566c.isLaidOut()) {
            gm gmVar = this.p;
            if (z) {
                gmVar.g(4);
                this.f567d.setVisibility(0);
                return;
            } else {
                gmVar.g(0);
                this.f567d.setVisibility(8);
                return;
            }
        }
        gm gmVar2 = this.p;
        if (z) {
            viewPropertyAnimatorCompatB = gmVar2.c(4, 100L);
            viewPropertyAnimatorCompatB2 = this.f567d.b(0, 200L);
        } else {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatC = gmVar2.c(0, 200L);
            viewPropertyAnimatorCompatB = this.f567d.b(8, 100L);
            viewPropertyAnimatorCompatB2 = viewPropertyAnimatorCompatC;
        }
        android.support.v7.view.k kVar = new android.support.v7.view.k();
        kVar.e(viewPropertyAnimatorCompatB, viewPropertyAnimatorCompatB2);
        kVar.c();
    }

    @Override // android.support.v7.widget.f
    public final void l(boolean z) {
        this.f572i = z;
    }

    @Override // android.support.v7.widget.f
    public final void m() {
        if (this.f573j) {
            return;
        }
        this.f573j = true;
        s(true);
    }

    @Override // android.support.v7.widget.f
    public final void n() {
        android.support.v7.view.k kVar = this.f574k;
        if (kVar != null) {
            kVar.a();
            this.f574k = null;
        }
    }

    @Override // android.support.v7.widget.f
    public final void o(int i2) {
        this.w = i2;
    }

    @Override // android.support.v7.widget.f
    public final void p() {
        if (this.f573j) {
            this.f573j = false;
            s(true);
        }
    }

    public az(Dialog dialog) throws Resources.NotFoundException {
        new ArrayList();
        this.v = new ArrayList();
        this.w = 0;
        this.f572i = true;
        this.y = true;
        this.m = new av(this);
        this.n = new aw(this);
        this.o = new ax(this);
        r(dialog.getWindow().getDecorView());
    }
}
