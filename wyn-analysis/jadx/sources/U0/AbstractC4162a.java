package u0;

import E.C0421k;
import Ef.C0487f0;
import N.AbstractC0743q;
import N.C0713a0;
import N.C0740o;
import N.EnumC0731j0;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.InterfaceC1457v;
import com.wynauto.wyn.R;
import ef.C2532p;
import java.lang.ref.WeakReference;
import jf.C3109i;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.InterfaceC4044I;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4162a extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f46179a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f46180b;

    /* renamed from: c, reason: collision with root package name */
    public M0 f46181c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0743q f46182d;

    /* renamed from: e, reason: collision with root package name */
    public A0.d f46183e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46184f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46185g;

    private final void setParentContext(AbstractC0743q abstractC0743q) {
        if (this.f46182d != abstractC0743q) {
            this.f46182d = abstractC0743q;
            if (abstractC0743q != null) {
                this.f46179a = null;
            }
            M0 m02 = this.f46181c;
            if (m02 != null) {
                m02.dispose();
                this.f46181c = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f46180b != iBinder) {
            this.f46180b = iBinder;
            this.f46179a = null;
        }
    }

    public abstract void a(int i5, C0740o c0740o);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i5, layoutParams);
    }

    public final void b() {
        if (this.f46185g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f46181c == null) {
            try {
                this.f46185g = true;
                this.f46181c = P0.a(this, d(), new V.d(-656146368, true, new C0421k(this, 6)));
            } finally {
                this.f46185g = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC0743q d() {
        N.p0 p0Var;
        InterfaceC3108h interfaceC3108h;
        C0713a0 c0713a0;
        int i5 = 2;
        AbstractC0743q abstractC0743qB = this.f46182d;
        if (abstractC0743qB == null) {
            abstractC0743qB = I0.b(this);
            if (abstractC0743qB == null) {
                for (ViewParent parent = getParent(); abstractC0743qB == null && (parent instanceof View); parent = parent.getParent()) {
                    abstractC0743qB = I0.b((View) parent);
                }
            }
            EnumC0731j0 enumC0731j0 = EnumC0731j0.f7794b;
            if (abstractC0743qB != null) {
                AbstractC0743q abstractC0743q = (!(abstractC0743qB instanceof N.p0) || ((EnumC0731j0) ((N.p0) abstractC0743qB).f7897q.getValue()).compareTo(enumC0731j0) > 0) ? abstractC0743qB : null;
                if (abstractC0743q != null) {
                    this.f46179a = new WeakReference(abstractC0743q);
                }
            } else {
                abstractC0743qB = null;
            }
            if (abstractC0743qB == null) {
                WeakReference weakReference = this.f46179a;
                if (weakReference == null || (abstractC0743qB = (AbstractC0743q) weakReference.get()) == null || ((abstractC0743qB instanceof N.p0) && ((EnumC0731j0) ((N.p0) abstractC0743qB).f7897q.getValue()).compareTo(enumC0731j0) <= 0)) {
                    abstractC0743qB = null;
                }
                if (abstractC0743qB == null) {
                    if (!isAttachedToWindow()) {
                        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    AbstractC0743q abstractC0743qB2 = I0.b(view);
                    if (abstractC0743qB2 == null) {
                        ((z0) ((A0) C0.f46095a.get())).getClass();
                        C3109i c3109i = C3109i.f38759a;
                        N.P p10 = N.P.f7726b;
                        C2532p c2532p = B.f46080l;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC3108h = (InterfaceC3108h) B.f46080l.getValue();
                        } else {
                            interfaceC3108h = (InterfaceC3108h) B.f46081m.get();
                            if (interfaceC3108h == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC3108h interfaceC3108hPlus = interfaceC3108h.plus(c3109i);
                        N.Q q4 = (N.Q) interfaceC3108hPlus.get(p10);
                        if (q4 != null) {
                            C0713a0 c0713a02 = new C0713a0(q4);
                            c0713a02.a();
                            c0713a0 = c0713a02;
                        } else {
                            c0713a0 = 0;
                        }
                        kotlin.jvm.internal.G g9 = new kotlin.jvm.internal.G();
                        C4165b0 c4165b0 = (C4165b0) interfaceC3108hPlus.get(Z.a.f16912n);
                        if (c4165b0 == null) {
                            c4165b0 = new C4165b0();
                            g9.f39740a = c4165b0;
                        }
                        if (c0713a0 != 0) {
                            c3109i = c0713a0;
                        }
                        InterfaceC3108h interfaceC3108hPlus2 = interfaceC3108hPlus.plus(c3109i).plus(c4165b0);
                        p0Var = new N.p0(interfaceC3108hPlus2);
                        Kd.a aVarC = Ef.H.c(interfaceC3108hPlus2);
                        InterfaceC1457v interfaceC1457vE = androidx.lifecycle.V.e(view);
                        AbstractC1451o lifecycle = interfaceC1457vE != null ? interfaceC1457vE.getLifecycle() : null;
                        if (lifecycle == null) {
                            throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
                        }
                        view.addOnAttachStateChangeListener(new G3.i(view, i5, p0Var));
                        lifecycle.a(new G0(aVarC, c0713a0, p0Var, g9, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, p0Var);
                        C0487f0 c0487f0 = C0487f0.f3733a;
                        Handler handler = view.getHandler();
                        AbstractC3340k.d(handler, "rootView.handler");
                        int i10 = Ff.f.f4118a;
                        view.addOnAttachStateChangeListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T(Ef.H.D(c0487f0, new Ff.e(handler, "windowRecomposer cleanup", false).f4117e, new B0(p0Var, view, null), 2), 6));
                    } else {
                        if (!(abstractC0743qB2 instanceof N.p0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        p0Var = (N.p0) abstractC0743qB2;
                    }
                    N.p0 p0Var2 = ((EnumC0731j0) p0Var.f7897q.getValue()).compareTo(enumC0731j0) > 0 ? p0Var : null;
                    if (p0Var2 != null) {
                        this.f46179a = new WeakReference(p0Var2);
                    }
                    return p0Var;
                }
            }
        }
        return abstractC0743qB;
    }

    public final boolean getHasComposition() {
        return this.f46181c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f46184f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i11 - i5) - getPaddingRight(), (i12 - i10) - getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        c();
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i5, i10);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i5) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i5)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i10)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i5);
    }

    public final void setParentCompositionContext(@Nullable AbstractC0743q abstractC0743q) {
        setParentContext(abstractC0743q);
    }

    public final void setShowLayoutBounds(boolean z2) {
        this.f46184f = z2;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C4188n) ((InterfaceC4044I) childAt)).setShowLayoutBounds(z2);
        }
    }

    public final void setViewCompositionStrategy(@NotNull InterfaceC4191o0 strategy) {
        AbstractC3340k.e(strategy, "strategy");
        A0.d dVar = this.f46183e;
        if (dVar != null) {
            dVar.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T t10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.T(this, 5);
        addOnAttachStateChangeListener(t10);
        V v2 = new V();
        android.support.v4.media.session.b.g0(this).f44318a.add(v2);
        this.f46183e = new A0.d(this, t10, v2, 2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        b();
        super.addView(view, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z2) {
        b();
        return super.addViewInLayout(view, i5, layoutParams, z2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, int i10) {
        b();
        super.addView(view, i5, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i5, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
