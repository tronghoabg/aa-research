package M0;

import A.C0208a;
import A.W;
import B.F;
import Ef.E;
import Ef.H;
import N.C0736m;
import U8.v0;
import X.u;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.V;
import com.wynauto.wyn.R;
import d0.C2384c;
import java.util.LinkedHashMap;
import k1.InterfaceC3130q;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import o0.C3635c;
import o0.C3638f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.r;
import t0.t;
import u0.I0;
import u0.Q;

/* loaded from: classes.dex */
public abstract class i extends ViewGroup implements InterfaceC3130q {

    /* renamed from: a, reason: collision with root package name */
    public final C3635c f7250a;

    /* renamed from: b, reason: collision with root package name */
    public View f7251b;

    /* renamed from: c, reason: collision with root package name */
    public tf.a f7252c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7253d;

    /* renamed from: e, reason: collision with root package name */
    public Z.k f7254e;

    /* renamed from: f, reason: collision with root package name */
    public tf.l f7255f;

    /* renamed from: g, reason: collision with root package name */
    public L0.b f7256g;

    /* renamed from: h, reason: collision with root package name */
    public tf.l f7257h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1457v f7258i;

    /* renamed from: j, reason: collision with root package name */
    public n3.f f7259j;
    public final u k;

    /* renamed from: l, reason: collision with root package name */
    public final c f7260l;

    /* renamed from: m, reason: collision with root package name */
    public final f f7261m;

    /* renamed from: n, reason: collision with root package name */
    public tf.l f7262n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f7263o;

    /* renamed from: p, reason: collision with root package name */
    public int f7264p;

    /* renamed from: q, reason: collision with root package name */
    public int f7265q;

    /* renamed from: r, reason: collision with root package name */
    public final D9.n f7266r;

    /* renamed from: s, reason: collision with root package name */
    public final t f7267s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, C0736m c0736m, C3635c dispatcher) {
        super(context);
        int i5 = 4;
        int i10 = 2;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(dispatcher, "dispatcher");
        this.f7250a = dispatcher;
        LinkedHashMap linkedHashMap = I0.f46125a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0736m);
        setSaveFromParentEnabled(false);
        this.f7252c = h.f7249i;
        this.f7254e = Z.i.f16922a;
        this.f7256g = new L0.c(1.0f, 1.0f);
        o oVar = (o) this;
        this.k = new u(new c(oVar, 1));
        this.f7260l = new c(oVar, 0);
        this.f7261m = new f(oVar, 0);
        this.f7263o = new int[2];
        this.f7264p = Integer.MIN_VALUE;
        this.f7265q = Integer.MIN_VALUE;
        this.f7266r = new D9.n(9);
        t tVar = new t(false);
        r rVar = new r();
        rVar.f43169a = new c(oVar, 2);
        Gf.r rVar2 = new Gf.r();
        Gf.r rVar3 = rVar.f43170b;
        if (rVar3 != null) {
            rVar3.f4838b = null;
        }
        rVar.f43170b = rVar2;
        rVar2.f4838b = rVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(rVar2);
        Z.k kVarX = v0.X(AbstractC3230e0.m(rVar, new a(oVar, tVar)), new a(oVar, tVar, i10));
        tVar.D(this.f7254e.g(kVarX));
        this.f7255f = new W(10, tVar, kVarX);
        tVar.B(this.f7256g);
        this.f7257h = new F(tVar, 4);
        G g9 = new G();
        tVar.f45500F = new C0208a(oVar, tVar, g9, i5);
        tVar.f45501G = new W(11, oVar, g9);
        tVar.C(new b(oVar, tVar));
        this.f7267s = tVar;
    }

    public static final int g(o oVar, int i5, int i10, int i11) {
        return (i11 >= 0 || i5 == i10) ? View.MeasureSpec.makeMeasureSpec(android.support.v4.media.session.b.S(i11, i5, i10), 1073741824) : (i11 != -2 || i10 == Integer.MAX_VALUE) ? (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    @Override // k1.InterfaceC3129p
    public final void a(int i5, View view) {
        D9.n nVar = this.f7266r;
        if (i5 == 1) {
            nVar.f2593c = 0;
        } else {
            nVar.f2592b = 0;
        }
    }

    @Override // k1.InterfaceC3129p
    public final void b(View child, View view, int i5, int i10) {
        AbstractC3340k.e(child, "child");
        D9.n nVar = this.f7266r;
        if (i10 == 1) {
            nVar.f2593c = i5;
        } else {
            nVar.f2592b = i5;
        }
    }

    @Override // k1.InterfaceC3129p
    public final void c(View view, int i5, int i10, int[] iArr, int i11) {
        if (isNestedScrollingEnabled()) {
            float f10 = i5;
            float f11 = -1;
            long jF = v0.f(f10 * f11, i10 * f11);
            int i12 = i11 == 0 ? 1 : 2;
            C3638f c3638f = this.f7250a.f41247c;
            long jI = c3638f != null ? c3638f.i(i12, jF) : C2384c.f33931b;
            iArr[0] = Q.d(C2384c.b(jI));
            iArr[1] = Q.d(C2384c.c(jI));
        }
    }

    @Override // k1.InterfaceC3130q
    public final void d(View view, int i5, int i10, int i11, int i12, int i13, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            float f10 = i5;
            float f11 = -1;
            long jF = v0.f(f10 * f11, i10 * f11);
            long jF2 = v0.f(i11 * f11, i12 * f11);
            int i14 = i13 == 0 ? 1 : 2;
            C3638f c3638f = this.f7250a.f41247c;
            long jD = c3638f != null ? c3638f.d(i14, jF, jF2) : C2384c.f33931b;
            iArr[0] = Q.d(C2384c.b(jD));
            iArr[1] = Q.d(C2384c.c(jD));
        }
    }

    @Override // k1.InterfaceC3129p
    public final void e(View view, int i5, int i10, int i11, int i12, int i13) {
        if (isNestedScrollingEnabled()) {
            float f10 = i5;
            float f11 = -1;
            long jF = v0.f(f10 * f11, i10 * f11);
            long jF2 = v0.f(i11 * f11, i12 * f11);
            int i14 = i13 == 0 ? 1 : 2;
            C3638f c3638f = this.f7250a.f41247c;
            if (c3638f != null) {
                c3638f.d(i14, jF, jF2);
            } else {
                int i15 = C2384c.f33934e;
            }
        }
    }

    @Override // k1.InterfaceC3129p
    public final boolean f(View child, View view, int i5, int i10) {
        AbstractC3340k.e(child, "child");
        return ((i5 & 2) == 0 && (i5 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f7263o;
        getLocationInWindow(iArr);
        int i5 = iArr[0];
        region.op(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @NotNull
    public final L0.b getDensity() {
        return this.f7256g;
    }

    @NotNull
    public final t getLayoutNode() {
        return this.f7267s;
    }

    @Override // android.view.View
    @Nullable
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f7251b;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Nullable
    public final InterfaceC1457v getLifecycleOwner() {
        return this.f7258i;
    }

    @NotNull
    public final Z.k getModifier() {
        return this.f7254e;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        D9.n nVar = this.f7266r;
        return nVar.f2593c | nVar.f2592b;
    }

    @Nullable
    public final tf.l getOnDensityChanged$ui_release() {
        return this.f7257h;
    }

    @Nullable
    public final tf.l getOnModifierChanged$ui_release() {
        return this.f7255f;
    }

    @Nullable
    public final tf.l getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f7262n;
    }

    @Nullable
    public final n3.f getSavedStateRegistryOwner() {
        return this.f7259j;
    }

    @NotNull
    public final tf.a getUpdate() {
        return this.f7252c;
    }

    @Nullable
    public final View getView() {
        return this.f7251b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.f7267s.o();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.f7251b;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.k.d();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        AbstractC3340k.e(child, "child");
        AbstractC3340k.e(target, "target");
        super.onDescendantInvalidated(child, target);
        this.f7267s.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u uVar = this.k;
        S8.b bVar = uVar.f15758g;
        if (bVar != null) {
            bVar.c();
        }
        uVar.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        View view = this.f7251b;
        if (view != null) {
            view.layout(0, 0, i11 - i5, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        View view = this.f7251b;
        if (view != null) {
            view.measure(i5, i10);
        }
        View view2 = this.f7251b;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        View view3 = this.f7251b;
        setMeasuredDimension(measuredWidth, view3 != null ? view3.getMeasuredHeight() : 0);
        this.f7264p = i5;
        this.f7265q = i10;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.jvm.internal.n, tf.a] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f10, float f11, boolean z2) {
        AbstractC3340k.e(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long jD = Fe.c.d(f10 * (-1.0f), f11 * (-1.0f));
        E e7 = (E) this.f7250a.f41245a.invoke();
        if (e7 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        H.D(e7, null, new d(z2, this, jD, null), 3);
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.internal.n, tf.a] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f10, float f11) {
        AbstractC3340k.e(target, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long jD = Fe.c.d(f10 * (-1.0f), f11 * (-1.0f));
        E e7 = (E) this.f7250a.f41245a.invoke();
        if (e7 == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        H.D(e7, null, new e(this, jD, null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        tf.l lVar = this.f7262n;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(@NotNull L0.b value) {
        AbstractC3340k.e(value, "value");
        if (value != this.f7256g) {
            this.f7256g = value;
            tf.l lVar = this.f7257h;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setLifecycleOwner(@Nullable InterfaceC1457v interfaceC1457v) {
        if (interfaceC1457v != this.f7258i) {
            this.f7258i = interfaceC1457v;
            V.h(this, interfaceC1457v);
        }
    }

    public final void setModifier(@NotNull Z.k value) {
        AbstractC3340k.e(value, "value");
        if (value != this.f7254e) {
            this.f7254e = value;
            tf.l lVar = this.f7255f;
            if (lVar != null) {
                lVar.invoke(value);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Nullable tf.l lVar) {
        this.f7257h = lVar;
    }

    public final void setOnModifierChanged$ui_release(@Nullable tf.l lVar) {
        this.f7255f = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Nullable tf.l lVar) {
        this.f7262n = lVar;
    }

    public final void setSavedStateRegistryOwner(@Nullable n3.f fVar) {
        if (fVar != this.f7259j) {
            this.f7259j = fVar;
            tg.b.O(this, fVar);
        }
    }

    public final void setUpdate(@NotNull tf.a value) {
        AbstractC3340k.e(value, "value");
        this.f7252c = value;
        this.f7253d = true;
        this.f7261m.invoke();
    }

    public final void setView$ui_release(@Nullable View view) {
        if (view != this.f7251b) {
            this.f7251b = view;
            removeAllViews();
            if (view != null) {
                addView(view);
                this.f7261m.invoke();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
