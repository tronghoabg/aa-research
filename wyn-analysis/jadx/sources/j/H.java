package j;

import a2.C1323c;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import k1.X;
import o.C3629j;
import q.InterfaceC3804c;
import q.InterfaceC3819j0;
import q.o1;

/* loaded from: classes.dex */
public final class H extends xg.g implements InterfaceC3804c {

    /* renamed from: D, reason: collision with root package name */
    public static final AccelerateInterpolator f38384D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    public static final DecelerateInterpolator f38385E = new DecelerateInterpolator();

    /* renamed from: A, reason: collision with root package name */
    public final F f38386A;

    /* renamed from: B, reason: collision with root package name */
    public final F f38387B;

    /* renamed from: C, reason: collision with root package name */
    public final C1323c f38388C;

    /* renamed from: e, reason: collision with root package name */
    public Context f38389e;

    /* renamed from: f, reason: collision with root package name */
    public Context f38390f;

    /* renamed from: g, reason: collision with root package name */
    public final Activity f38391g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarOverlayLayout f38392h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContainer f38393i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC3819j0 f38394j;
    public ActionBarContextView k;

    /* renamed from: l, reason: collision with root package name */
    public final View f38395l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f38396m;

    /* renamed from: n, reason: collision with root package name */
    public G f38397n;

    /* renamed from: o, reason: collision with root package name */
    public G f38398o;

    /* renamed from: p, reason: collision with root package name */
    public Y2.B f38399p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38400q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f38401r;

    /* renamed from: s, reason: collision with root package name */
    public int f38402s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f38403t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f38404u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38405v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f38406w;

    /* renamed from: x, reason: collision with root package name */
    public mc.b f38407x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f38408y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f38409z;

    public H(Dialog dialog) {
        new ArrayList();
        this.f38401r = new ArrayList();
        this.f38402s = 0;
        this.f38403t = true;
        this.f38406w = true;
        this.f38386A = new F(this, 0);
        this.f38387B = new F(this, 1);
        this.f38388C = new C1323c(this, 14);
        f0(dialog.getWindow().getDecorView());
    }

    public final void d0(boolean z2) {
        X xI;
        X xI2;
        if (z2) {
            if (!this.f38405v) {
                this.f38405v = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f38392h;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                i0(false);
            }
        } else if (this.f38405v) {
            this.f38405v = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38392h;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            i0(false);
        }
        ActionBarContainer actionBarContainer = this.f38393i;
        WeakHashMap weakHashMap = S.f38779a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((o1) this.f38394j).f43850a.setVisibility(4);
                this.k.setVisibility(0);
                return;
            } else {
                ((o1) this.f38394j).f43850a.setVisibility(0);
                this.k.setVisibility(8);
                return;
            }
        }
        if (z2) {
            o1 o1Var = (o1) this.f38394j;
            xI = S.a(o1Var.f43850a);
            xI.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            xI.c(100L);
            xI.d(new C3629j(o1Var, 4));
            xI2 = this.k.i(0, 200L);
        } else {
            o1 o1Var2 = (o1) this.f38394j;
            X xA = S.a(o1Var2.f43850a);
            xA.a(1.0f);
            xA.c(200L);
            xA.d(new C3629j(o1Var2, 0));
            xI = this.k.i(8, 100L);
            xI2 = xA;
        }
        mc.b bVar = new mc.b();
        ArrayList arrayList = (ArrayList) bVar.f40524c;
        arrayList.add(xI);
        View view = (View) xI.f38790a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) xI2.f38790a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(xI2);
        bVar.e();
    }

    public final Context e0() {
        if (this.f38390f == null) {
            TypedValue typedValue = new TypedValue();
            this.f38389e.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f38390f = new ContextThemeWrapper(this.f38389e, i5);
            } else {
                this.f38390f = this.f38389e;
            }
        }
        return this.f38390f;
    }

    public final void f0(View view) {
        InterfaceC3819j0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f38392h = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.action_bar);
        if (callbackFindViewById instanceof InterfaceC3819j0) {
            wrapper = (InterfaceC3819j0) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f38394j = wrapper;
        this.k = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f38393i = actionBarContainer;
        InterfaceC3819j0 interfaceC3819j0 = this.f38394j;
        if (interfaceC3819j0 == null || this.k == null || actionBarContainer == null) {
            throw new IllegalStateException(H.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((o1) interfaceC3819j0).f43850a.getContext();
        this.f38389e = context;
        if ((((o1) this.f38394j).f43851b & 4) != 0) {
            this.f38396m = true;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        this.f38394j.getClass();
        h0(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f38389e.obtainStyledAttributes(null, AbstractC2820a.f36438a, R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f38392h;
            if (!actionBarOverlayLayout2.f17822h) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f38409z = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f38393i;
            WeakHashMap weakHashMap = S.f38779a;
            J.k(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g0(boolean z2) {
        if (this.f38396m) {
            return;
        }
        int i5 = z2 ? 4 : 0;
        o1 o1Var = (o1) this.f38394j;
        int i10 = o1Var.f43851b;
        this.f38396m = true;
        o1Var.a((i5 & 4) | (i10 & (-5)));
    }

    public final void h0(boolean z2) {
        if (z2) {
            this.f38393i.setTabContainer(null);
            ((o1) this.f38394j).getClass();
        } else {
            ((o1) this.f38394j).getClass();
            this.f38393i.setTabContainer(null);
        }
        this.f38394j.getClass();
        ((o1) this.f38394j).f43850a.setCollapsible(false);
        this.f38392h.setHasNonEmbeddedTabs(false);
    }

    public final void i0(boolean z2) {
        boolean z10 = this.f38405v || !this.f38404u;
        View view = this.f38395l;
        final C1323c c1323c = this.f38388C;
        if (!z10) {
            if (this.f38406w) {
                this.f38406w = false;
                mc.b bVar = this.f38407x;
                if (bVar != null) {
                    bVar.a();
                }
                int i5 = this.f38402s;
                F f10 = this.f38386A;
                if (i5 != 0 || (!this.f38408y && !z2)) {
                    f10.e();
                    return;
                }
                this.f38393i.setAlpha(1.0f);
                this.f38393i.setTransitioning(true);
                mc.b bVar2 = new mc.b();
                float f11 = -this.f38393i.getHeight();
                if (z2) {
                    this.f38393i.getLocationInWindow(new int[]{0, 0});
                    f11 -= r12[1];
                }
                X xA = S.a(this.f38393i);
                xA.e(f11);
                final View view2 = (View) xA.f38790a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c1323c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: k1.W
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((j.H) c1323c.f17156b).f38393i.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z11 = bVar2.f40523b;
                ArrayList arrayList = (ArrayList) bVar2.f40524c;
                if (!z11) {
                    arrayList.add(xA);
                }
                if (this.f38403t && view != null) {
                    X xA2 = S.a(view);
                    xA2.e(f11);
                    if (!bVar2.f40523b) {
                        arrayList.add(xA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f38384D;
                boolean z12 = bVar2.f40523b;
                if (!z12) {
                    bVar2.f40525d = accelerateInterpolator;
                }
                if (!z12) {
                    bVar2.f40522a = 250L;
                }
                if (!z12) {
                    bVar2.f40526e = f10;
                }
                this.f38407x = bVar2;
                bVar2.e();
                return;
            }
            return;
        }
        if (this.f38406w) {
            return;
        }
        this.f38406w = true;
        mc.b bVar3 = this.f38407x;
        if (bVar3 != null) {
            bVar3.a();
        }
        this.f38393i.setVisibility(0);
        int i10 = this.f38402s;
        F f12 = this.f38387B;
        if (i10 == 0 && (this.f38408y || z2)) {
            this.f38393i.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f13 = -this.f38393i.getHeight();
            if (z2) {
                this.f38393i.getLocationInWindow(new int[]{0, 0});
                f13 -= r12[1];
            }
            this.f38393i.setTranslationY(f13);
            mc.b bVar4 = new mc.b();
            X xA3 = S.a(this.f38393i);
            xA3.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            final View view3 = (View) xA3.f38790a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c1323c != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: k1.W
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((j.H) c1323c.f17156b).f38393i.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z13 = bVar4.f40523b;
            ArrayList arrayList2 = (ArrayList) bVar4.f40524c;
            if (!z13) {
                arrayList2.add(xA3);
            }
            if (this.f38403t && view != null) {
                view.setTranslationY(f13);
                X xA4 = S.a(view);
                xA4.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (!bVar4.f40523b) {
                    arrayList2.add(xA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f38385E;
            boolean z14 = bVar4.f40523b;
            if (!z14) {
                bVar4.f40525d = decelerateInterpolator;
            }
            if (!z14) {
                bVar4.f40522a = 250L;
            }
            if (!z14) {
                bVar4.f40526e = f12;
            }
            this.f38407x = bVar4;
            bVar4.e();
        } else {
            this.f38393i.setAlpha(1.0f);
            this.f38393i.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.f38403t && view != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            f12.e();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f38392h;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = S.f38779a;
            k1.H.c(actionBarOverlayLayout);
        }
    }

    public H(boolean z2, Activity activity) {
        new ArrayList();
        this.f38401r = new ArrayList();
        this.f38402s = 0;
        this.f38403t = true;
        this.f38406w = true;
        this.f38386A = new F(this, 0);
        this.f38387B = new F(this, 1);
        this.f38388C = new C1323c(this, 14);
        this.f38391g = activity;
        View decorView = activity.getWindow().getDecorView();
        f0(decorView);
        if (z2) {
            return;
        }
        this.f38395l = decorView.findViewById(android.R.id.content);
    }
}
