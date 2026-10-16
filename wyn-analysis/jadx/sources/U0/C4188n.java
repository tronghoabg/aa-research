package u0;

import N.C0718d;
import U1.AbstractC0832b;
import Va.M6;
import a0.C1305a;
import a0.C1307c;
import a0.C1308d;
import a0.C1309e;
import a0.C1310f;
import a0.InterfaceC1306b;
import a1.C1318h;
import ac.C1346a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import ba.C1521a;
import c0.C1542g;
import c0.InterfaceC1540e;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import e0.C2450b;
import ef.C2515C;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2519c;
import g5.RunnableC2707d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import k0.InterfaceC3111a;
import kd.RunnableC3307c;
import kotlin.jvm.internal.AbstractC3340k;
import l0.C3368a;
import l0.C3370c;
import l0.InterfaceC3369b;
import m0.C3475a;
import n0.C3564c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.AbstractC3853c;
import q0.C3852b;
import q0.C3854d;
import t0.C4046K;
import t0.C4051P;
import t0.C4060h;
import t0.C4068p;
import t0.InterfaceC4042G;
import t0.InterfaceC4044I;
import t0.InterfaceC4049N;
import vf.AbstractC4345a;
import x0.C4440j;
import x0.C4442l;

/* renamed from: u0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4188n extends ViewGroup implements InterfaceC4044I, InterfaceC4049N, DefaultLifecycleObserver {

    /* renamed from: o0, reason: collision with root package name */
    public static Class f46260o0;

    /* renamed from: p0, reason: collision with root package name */
    public static Method f46261p0;

    /* renamed from: A, reason: collision with root package name */
    public S f46262A;

    /* renamed from: B, reason: collision with root package name */
    public L0.a f46263B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f46264C;

    /* renamed from: D, reason: collision with root package name */
    public final t0.z f46265D;

    /* renamed from: E, reason: collision with root package name */
    public final E f46266E;

    /* renamed from: F, reason: collision with root package name */
    public long f46267F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f46268G;

    /* renamed from: H, reason: collision with root package name */
    public final float[] f46269H;

    /* renamed from: I, reason: collision with root package name */
    public final float[] f46270I;

    /* renamed from: J, reason: collision with root package name */
    public long f46271J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f46272K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f46273M;

    /* renamed from: N, reason: collision with root package name */
    public final N.Y f46274N;

    /* renamed from: O, reason: collision with root package name */
    public tf.l f46275O;

    /* renamed from: P, reason: collision with root package name */
    public final Lb.f f46276P;

    /* renamed from: Q, reason: collision with root package name */
    public final Lb.e f46277Q;

    /* renamed from: R, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC4178i f46278R;

    /* renamed from: S, reason: collision with root package name */
    public final W9.u f46279S;

    /* renamed from: T, reason: collision with root package name */
    public final F0.c f46280T;

    /* renamed from: U, reason: collision with root package name */
    public final J4.c f46281U;

    /* renamed from: V, reason: collision with root package name */
    public final N.Y f46282V;

    /* renamed from: W, reason: collision with root package name */
    public int f46283W;

    /* renamed from: a, reason: collision with root package name */
    public long f46284a;

    /* renamed from: a0, reason: collision with root package name */
    public final N.Y f46285a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46286b;

    /* renamed from: b0, reason: collision with root package name */
    public final a2.k f46287b0;

    /* renamed from: c, reason: collision with root package name */
    public final t0.v f46288c;

    /* renamed from: c0, reason: collision with root package name */
    public final C3370c f46289c0;

    /* renamed from: d, reason: collision with root package name */
    public L0.c f46290d;

    /* renamed from: d0, reason: collision with root package name */
    public final V f46291d0;

    /* renamed from: e, reason: collision with root package name */
    public final b7.k f46292e;

    /* renamed from: e0, reason: collision with root package name */
    public MotionEvent f46293e0;

    /* renamed from: f, reason: collision with root package name */
    public final y0 f46294f;

    /* renamed from: f0, reason: collision with root package name */
    public long f46295f0;

    /* renamed from: g, reason: collision with root package name */
    public final C3564c f46296g;

    /* renamed from: g0, reason: collision with root package name */
    public final w0 f46297g0;

    /* renamed from: h, reason: collision with root package name */
    public final C1346a f46298h;

    /* renamed from: h0, reason: collision with root package name */
    public final P.d f46299h0;

    /* renamed from: i, reason: collision with root package name */
    public final t0.t f46300i;

    /* renamed from: i0, reason: collision with root package name */
    public final RunnableC2707d f46301i0;

    /* renamed from: j, reason: collision with root package name */
    public final C4188n f46302j;

    /* renamed from: j0, reason: collision with root package name */
    public final RunnableC3307c f46303j0;
    public final C4442l k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f46304k0;

    /* renamed from: l, reason: collision with root package name */
    public final C4195s f46305l;

    /* renamed from: l0, reason: collision with root package name */
    public final C4068p f46306l0;

    /* renamed from: m, reason: collision with root package name */
    public final C1310f f46307m;

    /* renamed from: m0, reason: collision with root package name */
    public final G f46308m0;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f46309n;

    /* renamed from: n0, reason: collision with root package name */
    public final V f46310n0;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f46311o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f46312p;

    /* renamed from: q, reason: collision with root package name */
    public final p0.c f46313q;

    /* renamed from: r, reason: collision with root package name */
    public final M.y f46314r;

    /* renamed from: s, reason: collision with root package name */
    public tf.l f46315s;

    /* renamed from: t, reason: collision with root package name */
    public final C1305a f46316t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f46317u;

    /* renamed from: v, reason: collision with root package name */
    public final C4176h f46318v;

    /* renamed from: w, reason: collision with root package name */
    public final C4174g f46319w;

    /* renamed from: x, reason: collision with root package name */
    public final C4046K f46320x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f46321y;

    /* renamed from: z, reason: collision with root package name */
    public F f46322z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13, types: [u0.i] */
    public C4188n(Context context) {
        super(context);
        int i5 = 2;
        int i10 = 4;
        boolean z2 = false;
        Object[] objArr = 0;
        this.f46284a = C2384c.f33933d;
        this.f46286b = true;
        this.f46288c = new t0.v();
        this.f46290d = new L0.c(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
        C4440j c4440j = new C4440j(C4440j.f47596c.addAndGet(1), false, C4186m.k);
        b7.k kVar = new b7.k(20);
        this.f46292e = kVar;
        this.f46294f = new y0();
        C3564c c3564c = new C3564c(new C4182k(this, 1));
        this.f46296g = c3564c;
        Z.i iVar = Z.i.f16922a;
        a2.v vVar = AbstractC3853c.f43960a;
        Z.k kVarA = Y.a(iVar, new C3475a(new C3852b(1), AbstractC3853c.f43960a));
        this.f46298h = new C1346a(4);
        t0.t tVar = new t0.t(false);
        tVar.C(r0.w.f44315a);
        tVar.D(M6.f(c4440j, kVarA).g((Z.k) kVar.f19397c).g(c3564c));
        tVar.B(getDensity());
        this.f46300i = tVar;
        this.f46302j = this;
        this.k = new C4442l(getRoot());
        C4195s c4195s = new C4195s(this);
        this.f46305l = c4195s;
        this.f46307m = new C1310f();
        this.f46309n = new ArrayList();
        this.f46313q = new p0.c();
        t0.t root = getRoot();
        AbstractC3340k.e(root, "root");
        M.y yVar = new M.y();
        yVar.f7227b = root;
        yVar.f7228c = new C1521a(root.f45533x);
        yVar.f7229d = new ad.L(19);
        yVar.f7230e = new C4060h();
        this.f46314r = yVar;
        this.f46315s = C4186m.f46255j;
        int i11 = Build.VERSION.SDK_INT;
        this.f46316t = i11 >= 26 ? new C1305a(this, getAutofillTree()) : null;
        this.f46318v = new C4176h(context);
        C4174g c4174g = new C4174g();
        Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f46319w = c4174g;
        this.f46320x = new C4046K(new C4182k(this, i5));
        this.f46265D = new t0.z(getRoot());
        AbstractC3340k.d(ViewConfiguration.get(context), "get(context)");
        this.f46266E = new E();
        this.f46267F = L0.g.f6802b;
        this.f46268G = new int[]{0, 0};
        this.f46269H = e0.z.h();
        this.f46270I = e0.z.h();
        this.f46271J = -1L;
        this.L = C2384c.f33932c;
        this.f46273M = true;
        N.P p10 = N.P.f7730f;
        this.f46274N = C0718d.G(null, p10);
        this.f46276P = new Lb.f(this, 1);
        this.f46277Q = new Lb.e(this, 1);
        this.f46278R = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: u0.i
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                C4188n this$0 = this.f46242a;
                AbstractC3340k.e(this$0, "this$0");
                this$0.f46289c0.f39843a.setValue(new C3368a(z10 ? 1 : 2));
                AbstractC4345a.P((C1542g) this$0.f46292e.f19396b);
            }
        };
        Context context2 = getContext();
        AbstractC3340k.d(context2, "view.context");
        xa.d dVar = new xa.d(context2);
        W9.u uVar = new W9.u();
        uVar.f15389a = this;
        uVar.f15390b = dVar;
        new F0.b(new z0.b(6, null, ""), z0.o.f48334a);
        uVar.f15391c = Fe.c.y(EnumC2526j.f34669c, new A0.p(uVar, 5));
        uVar.f15392d = ic.d.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
        this.f46279S = uVar;
        F0.c cVar = new F0.c();
        new AtomicReference(null);
        this.f46280T = cVar;
        this.f46281U = new J4.c(context, z2);
        this.f46282V = C0718d.G(AbstractC4345a.o(context), N.P.f7728d);
        Configuration configuration = context.getResources().getConfiguration();
        AbstractC3340k.d(configuration, "context.resources.configuration");
        this.f46283W = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        Configuration configuration2 = context.getResources().getConfiguration();
        AbstractC3340k.d(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        L0.i iVar2 = L0.i.f6806a;
        if (layoutDirection != 0 && layoutDirection == 1) {
            iVar2 = L0.i.f6807b;
        }
        this.f46285a0 = C0718d.G(iVar2, p10);
        this.f46287b0 = new a2.k();
        this.f46289c0 = new C3370c(isInTouchMode() ? 1 : 2, new C4182k(this, objArr == true ? 1 : 0));
        this.f46291d0 = new V();
        this.f46297g0 = new w0();
        this.f46299h0 = new P.d(new tf.a[16]);
        this.f46301i0 = new RunnableC2707d(this, 27);
        this.f46303j0 = new RunnableC3307c(this, 14);
        this.f46306l0 = new C4068p(this, i10);
        this.f46308m0 = i11 >= 29 ? new H() : new C1318h();
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            C4198v.f46378a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        k1.S.m(this, c4195s);
        getRoot().b(this);
        if (i11 >= 29) {
            C4196t.f46375a.a(this);
        }
        this.f46310n0 = new V();
    }

    public static void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof C4188n) {
                ((C4188n) childAt).m();
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    public static C2527k b(int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            return new C2527k(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new C2527k(0, Integer.valueOf(com.google.android.gms.common.api.f.API_PRIORITY_OTHER));
        }
        if (mode == 1073741824) {
            return new C2527k(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public static View c(int i5, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (AbstractC3340k.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i5))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            AbstractC3340k.d(childAt, "currentView.getChildAt(i)");
            View viewC = c(i5, childAt);
            if (viewC != null) {
                return viewC;
            }
        }
        return null;
    }

    public static void e(t0.t tVar) {
        tVar.p();
        P.d dVarL = tVar.l();
        int i5 = dVarL.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVarL.f8970a;
            int i10 = 0;
            do {
                e((t0.t) objArr[i10]);
                i10++;
            } while (i10 < i5);
        }
    }

    public static boolean g(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        if (Float.isInfinite(x5) || Float.isNaN(x5)) {
            return true;
        }
        float y10 = motionEvent.getY();
        if (Float.isInfinite(y10) || Float.isNaN(y10)) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return Float.isInfinite(rawY) || Float.isNaN(rawY);
    }

    private void setFontFamilyResolver(E0.e eVar) {
        this.f46282V.setValue(eVar);
    }

    private void setLayoutDirection(L0.i iVar) {
        this.f46285a0.setValue(iVar);
    }

    private final void setViewTreeOwners(C4180j c4180j) {
        this.f46274N.setValue(c4180j);
    }

    @Override // android.view.View
    public final void autofill(SparseArray values) {
        C1305a c1305a;
        AbstractC3340k.e(values, "values");
        if (Build.VERSION.SDK_INT < 26 || (c1305a = this.f46316t) == null) {
            return;
        }
        int size = values.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iKeyAt = values.keyAt(i5);
            AutofillValue value = AbstractC0832b.j(values.get(iKeyAt));
            C1308d c1308d = C1308d.f17096a;
            AbstractC3340k.d(value, "value");
            if (c1308d.d(value)) {
                String value2 = c1308d.i(value).toString();
                C1310f c1310f = c1305a.f17093b;
                c1310f.getClass();
                AbstractC3340k.e(value2, "value");
                if (c1310f.f17098a.get(Integer.valueOf(iKeyAt)) != null) {
                    throw new ClassCastException();
                }
            } else {
                if (c1308d.b(value)) {
                    throw new Ef.G("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (c1308d.c(value)) {
                    throw new Ef.G("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (c1308d.e(value)) {
                    throw new Ef.G("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        this.f46305l.k(this.f46284a, false);
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i5) {
        this.f46305l.k(this.f46284a, true);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4188n.d(android.view.MotionEvent):int");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
        if (!isAttachedToWindow()) {
            e(getRoot());
        }
        k(true);
        this.f46312p = true;
        C1346a c1346a = this.f46298h;
        C2450b c2450b = (C2450b) c1346a.f17489b;
        Canvas canvas2 = c2450b.f34357a;
        c2450b.f34357a = canvas;
        t0.t root = getRoot();
        C2450b c2450b2 = (C2450b) c1346a.f17489b;
        root.h(c2450b2);
        AbstractC3340k.e(canvas2, "<set-?>");
        c2450b2.f34357a = canvas2;
        ArrayList arrayList = this.f46309n;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((InterfaceC4042G) arrayList.get(i5)).h();
            }
        }
        if (s0.f46363q) {
            int iSave = canvas.save();
            canvas.clipRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f46312p = false;
        ArrayList arrayList2 = this.f46311o;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent event) {
        float fA;
        C3475a c3475a;
        AbstractC3340k.e(event, "event");
        if (event.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(event);
        }
        if (!event.isFromSource(4194304)) {
            return (g(event) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(event) : (d(event) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -event.getAxisValue(26);
        Context context = getContext();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            Method method = k1.T.f38785a;
            fA = Y0.b.d(viewConfiguration);
        } else {
            fA = k1.T.a(viewConfiguration, context);
        }
        C3854d c3854d = new C3854d(fA * f10, (i5 >= 26 ? Y0.b.c(viewConfiguration) : k1.T.a(viewConfiguration, getContext())) * f10, event.getEventTime());
        C1542g c1542gP = AbstractC4345a.p((C1542g) this.f46292e.f19396b);
        return (c1542gP == null || (c3475a = c1542gP.f19503g) == null || (!c3475a.b() && !c3475a.a(c3854d))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C4188n.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        C1542g c1542gT;
        t0.t tVar;
        AbstractC3340k.e(event, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(event);
        }
        C3564c c3564c = this.f46296g;
        c3564c.getClass();
        C1542g c1542g = c3564c.f40753b;
        if (c1542g != null && (c1542gT = A6.c.t(c1542g)) != null) {
            t0.y yVar = c1542gT.k;
            C3564c c3564c2 = null;
            if (yVar != null && (tVar = yVar.f45561e) != null) {
                P.d dVar = c1542gT.f19509n;
                int i5 = dVar.f8972c;
                if (i5 > 0) {
                    Object[] objArr = dVar.f8970a;
                    int i10 = 0;
                    do {
                        C3564c c3564c3 = (C3564c) objArr[i10];
                        if (AbstractC3340k.a(c3564c3.f40755d, tVar)) {
                            if (c3564c2 == null) {
                                c3564c2 = c3564c3;
                                break;
                            }
                            t0.t tVar2 = c3564c3.f40755d;
                            C3564c c3564c4 = c3564c2;
                            while (!c3564c4.equals(c3564c3)) {
                                c3564c4 = c3564c4.f40754c;
                                if (c3564c4 == null || !AbstractC3340k.a(c3564c4.f40755d, tVar2)) {
                                    c3564c2 = c3564c3;
                                    break;
                                }
                            }
                        }
                        i10++;
                    } while (i10 < i5);
                }
                if (c3564c2 == null) {
                    c3564c2 = c1542gT.f19508m;
                }
            }
            if (c3564c2 != null) {
                if (c3564c2.b(event)) {
                    return true;
                }
                return c3564c2.a(event);
            }
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC3340k.e(motionEvent, "motionEvent");
        if (this.f46304k0) {
            RunnableC3307c runnableC3307c = this.f46303j0;
            removeCallbacks(runnableC3307c);
            MotionEvent motionEvent2 = this.f46293e0;
            AbstractC3340k.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f46304k0 = false;
            } else {
                runnableC3307c.run();
            }
        }
        if (!g(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || i(motionEvent))) {
            int iD = d(motionEvent);
            if ((iD & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iD & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void f(t0.t tVar) {
        int i5 = 0;
        this.f46265D.f(tVar, false);
        P.d dVarL = tVar.l();
        int i10 = dVarL.f8972c;
        if (i10 > 0) {
            Object[] objArr = dVarL.f8970a;
            do {
                f((t0.t) objArr[i5]);
                i5++;
            } while (i5 < i10);
        }
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i5) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return c(i5, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i5));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @NotNull
    public final F getAndroidViewsHandler$ui_release() {
        if (this.f46322z == null) {
            Context context = getContext();
            AbstractC3340k.d(context, "context");
            F f10 = new F(context);
            this.f46322z = f10;
            addView(f10);
        }
        F f11 = this.f46322z;
        AbstractC3340k.b(f11);
        return f11;
    }

    @Nullable
    public InterfaceC1306b getAutofill() {
        return this.f46316t;
    }

    @NotNull
    public C1310f getAutofillTree() {
        return this.f46307m;
    }

    @NotNull
    public final tf.l getConfigurationChangeObserver() {
        return this.f46315s;
    }

    @NotNull
    public L0.b getDensity() {
        return this.f46290d;
    }

    @NotNull
    public InterfaceC1540e getFocusManager() {
        return this.f46292e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C2515C c2515c;
        AbstractC3340k.e(rect, "rect");
        C1542g c1542gP = AbstractC4345a.p((C1542g) this.f46292e.f19396b);
        if (c1542gP != null) {
            d0.d dVarV = A6.c.v(c1542gP);
            rect.left = AbstractC4345a.H(dVarV.f33937a);
            rect.top = AbstractC4345a.H(dVarV.f33938b);
            rect.right = AbstractC4345a.H(dVarV.f33939c);
            rect.bottom = AbstractC4345a.H(dVarV.f33940d);
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            super.getFocusedRect(rect);
        }
    }

    @NotNull
    public E0.e getFontFamilyResolver() {
        return (E0.e) this.f46282V.getValue();
    }

    @NotNull
    public E0.d getFontLoader() {
        return this.f46281U;
    }

    @NotNull
    public InterfaceC3111a getHapticFeedBack() {
        return this.f46287b0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !((C4051P) this.f46265D.f45579b.f16384c).isEmpty();
    }

    @NotNull
    public InterfaceC3369b getInputModeManager() {
        return this.f46289c0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f46271J;
    }

    @Override // android.view.View, android.view.ViewParent
    @NotNull
    public L0.i getLayoutDirection() {
        return (L0.i) this.f46285a0.getValue();
    }

    public long getMeasureIteration() {
        t0.z zVar = this.f46265D;
        if (zVar.f45580c) {
            return zVar.f45583f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    @NotNull
    public p0.i getPointerIconService() {
        return this.f46310n0;
    }

    @NotNull
    public t0.t getRoot() {
        return this.f46300i;
    }

    @NotNull
    public InterfaceC4049N getRootForTest() {
        return this.f46302j;
    }

    @NotNull
    public C4442l getSemanticsOwner() {
        return this.k;
    }

    @NotNull
    public t0.v getSharedDrawScope() {
        return this.f46288c;
    }

    public boolean getShowLayoutBounds() {
        return this.f46321y;
    }

    @NotNull
    public C4046K getSnapshotObserver() {
        return this.f46320x;
    }

    @NotNull
    public F0.c getTextInputService() {
        return this.f46280T;
    }

    @NotNull
    public InterfaceC4189n0 getTextToolbar() {
        return this.f46291d0;
    }

    @NotNull
    public InterfaceC4193p0 getViewConfiguration() {
        return this.f46266E;
    }

    @Nullable
    public final C4180j getViewTreeOwners() {
        return (C4180j) this.f46274N.getValue();
    }

    @NotNull
    public x0 getWindowInfo() {
        return this.f46294f;
    }

    public final boolean h(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x5 && x5 <= ((float) getWidth()) && UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= y10 && y10 <= ((float) getHeight());
    }

    public final boolean i(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f46293e0) != null && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final long j(long j8) {
        p();
        long jM = e0.z.m(j8, this.f46269H);
        return U8.v0.f(C2384c.b(this.L) + C2384c.b(jM), C2384c.c(this.L) + C2384c.c(jM));
    }

    public final void k(boolean z2) {
        C4068p c4068p;
        t0.z zVar = this.f46265D;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z2) {
            try {
                c4068p = this.f46306l0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            c4068p = null;
        }
        if (zVar.c(c4068p)) {
            requestLayout();
        }
        zVar.a(false);
        Trace.endSection();
    }

    public final void l(InterfaceC4042G interfaceC4042G, boolean z2) {
        ArrayList arrayList = this.f46309n;
        if (!z2) {
            if (!this.f46312p && !arrayList.remove(interfaceC4042G)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            if (!this.f46312p) {
                arrayList.add(interfaceC4042G);
                return;
            }
            ArrayList arrayList2 = this.f46311o;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.f46311o = arrayList2;
            }
            arrayList2.add(interfaceC4042G);
        }
    }

    public final void m() {
        if (this.f46317u) {
            X.u uVar = getSnapshotObserver().f45442a;
            synchronized (uVar.f15757f) {
                try {
                    P.d dVar = uVar.f15757f;
                    int i5 = dVar.f8972c;
                    int i10 = 0;
                    for (int i11 = 0; i11 < i5; i11++) {
                        X.t tVar = (X.t) dVar.f8970a[i11];
                        tVar.e();
                        if (tVar.f15746f.f47538e == 0) {
                            i10++;
                        } else if (i10 > 0) {
                            Object[] objArr = dVar.f8970a;
                            objArr[i11 - i10] = objArr[i11];
                        }
                    }
                    int i12 = i5 - i10;
                    Arrays.fill(dVar.f8970a, i12, i5, (Object) null);
                    dVar.f8972c = i12;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f46317u = false;
        }
        F f10 = this.f46322z;
        if (f10 != null) {
            a(f10);
        }
        while (this.f46299h0.j()) {
            int i13 = this.f46299h0.f8972c;
            for (int i14 = 0; i14 < i13; i14++) {
                Object[] objArr2 = this.f46299h0.f8970a;
                tf.a aVar = (tf.a) objArr2[i14];
                objArr2[i14] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            P.d dVar2 = this.f46299h0;
            if (i13 > 0) {
                int i15 = dVar2.f8972c;
                if (i13 < i15) {
                    Object[] objArr3 = dVar2.f8970a;
                    ff.m.h0(objArr3, 0, objArr3, i13, i15);
                }
                int i16 = dVar2.f8972c;
                int i17 = i16 - i13;
                int i18 = i16 - 1;
                if (i17 <= i18) {
                    int i19 = i17;
                    while (true) {
                        dVar2.f8970a[i19] = null;
                        if (i19 == i18) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                }
                dVar2.f8972c = i17;
            } else {
                dVar2.getClass();
            }
        }
    }

    public final void n(t0.t layoutNode) {
        AbstractC3340k.e(layoutNode, "layoutNode");
        C4195s c4195s = this.f46305l;
        c4195s.getClass();
        c4195s.f46349p = true;
        if (c4195s.r()) {
            c4195s.s(layoutNode);
        }
    }

    public final void o() {
        C4195s c4195s = this.f46305l;
        c4195s.f46349p = true;
        if (!c4195s.r() || c4195s.f46355v) {
            return;
        }
        c4195s.f46355v = true;
        c4195s.f46341g.post(c4195s.f46356w);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1451o lifecycle;
        InterfaceC1457v interfaceC1457v;
        C1305a c1305a;
        super.onAttachedToWindow();
        f(getRoot());
        e(getRoot());
        getSnapshotObserver().f45442a.d();
        if (Build.VERSION.SDK_INT >= 26 && (c1305a = this.f46316t) != null) {
            C1309e.f17097a.a(c1305a);
        }
        InterfaceC1457v interfaceC1457vE = androidx.lifecycle.V.e(this);
        n3.f fVarY = tg.b.y(this);
        C4180j viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1457vE != null && fVarY != null && (interfaceC1457vE != (interfaceC1457v = viewTreeOwners.f46244a) || fVarY != interfaceC1457v))) {
            if (interfaceC1457vE == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarY == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f46244a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            interfaceC1457vE.getLifecycle().a(this);
            C4180j c4180j = new C4180j(interfaceC1457vE, fVarY);
            setViewTreeOwners(c4180j);
            tf.l lVar = this.f46275O;
            if (lVar != null) {
                lVar.invoke(c4180j);
            }
            this.f46275O = null;
        }
        C4180j viewTreeOwners2 = getViewTreeOwners();
        AbstractC3340k.b(viewTreeOwners2);
        viewTreeOwners2.f46244a.getLifecycle().a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f46276P);
        getViewTreeObserver().addOnScrollChangedListener(this.f46277Q);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f46278R);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        this.f46279S.getClass();
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        AbstractC3340k.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        AbstractC3340k.d(context, "context");
        this.f46290d = new L0.c(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
        int i5 = Build.VERSION.SDK_INT;
        if ((i5 >= 31 ? newConfig.fontWeightAdjustment : 0) != this.f46283W) {
            this.f46283W = i5 >= 31 ? newConfig.fontWeightAdjustment : 0;
            Context context2 = getContext();
            AbstractC3340k.d(context2, "context");
            setFontFamilyResolver(AbstractC4345a.o(context2));
        }
        this.f46315s.invoke(newConfig);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        AbstractC3340k.e(outAttrs, "outAttrs");
        this.f46279S.getClass();
        return null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1305a c1305a;
        AbstractC1451o lifecycle;
        super.onDetachedFromWindow();
        X.u uVar = getSnapshotObserver().f45442a;
        S8.b bVar = uVar.f15758g;
        if (bVar != null) {
            bVar.c();
        }
        uVar.b();
        C4180j viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f46244a.getLifecycle()) != null) {
            lifecycle.c(this);
        }
        if (Build.VERSION.SDK_INT >= 26 && (c1305a = this.f46316t) != null) {
            C1309e.f17097a.b(c1305a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f46276P);
        getViewTreeObserver().removeOnScrollChangedListener(this.f46277Q);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f46278R);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AbstractC3340k.e(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i5, Rect rect) {
        super.onFocusChanged(z2, i5, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z2 + ')');
        b7.k kVar = this.f46292e;
        if (!z2) {
            xg.g.q((C1542g) kVar.f19396b, true);
            return;
        }
        C1542g c1542g = (C1542g) kVar.f19396b;
        if (c1542g.f19500d == c0.r.f19539f) {
            c1542g.e0(c0.r.f19534a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        this.f46263B = null;
        w();
        if (this.f46322z != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i11 - i5, i12 - i10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        t0.z zVar = this.f46265D;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                f(getRoot());
            }
            C2527k c2527kB = b(i5);
            int iIntValue = ((Number) c2527kB.f34671a).intValue();
            int iIntValue2 = ((Number) c2527kB.f34672b).intValue();
            C2527k c2527kB2 = b(i10);
            long jA = xg.g.a(iIntValue, iIntValue2, ((Number) c2527kB2.f34671a).intValue(), ((Number) c2527kB2.f34672b).intValue());
            L0.a aVar = this.f46263B;
            if (aVar == null) {
                this.f46263B = new L0.a(jA);
                this.f46264C = false;
            } else {
                if (!(aVar.f6792a == jA)) {
                    this.f46264C = true;
                }
            }
            L0.a aVar2 = zVar.f45585h;
            if (aVar2 == null || aVar2.f6792a != jA) {
                if (zVar.f45580c) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                zVar.f45585h = new L0.a(jA);
                t0.t tVar = zVar.f45578a;
                tVar.f45505K = true;
                zVar.f45579b.h(tVar);
            }
            zVar.c(this.f46306l0);
            setMeasuredDimension(getRoot().f45534y.f44307a, getRoot().f45534y.f44308b);
            if (this.f46322z != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f45534y.f44307a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f45534y.f44308b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i5) {
        C1305a c1305a;
        if (Build.VERSION.SDK_INT < 26 || viewStructure == null || (c1305a = this.f46316t) == null) {
            return;
        }
        C1307c c1307c = C1307c.f17095a;
        C1310f c1310f = c1305a.f17093b;
        int iA = c1307c.a(viewStructure, c1310f.f17098a.size());
        Iterator it = c1310f.f17098a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            Iterator it2 = it;
            ViewStructure viewStructureB = c1307c.b(viewStructure, iA);
            if (viewStructureB != null) {
                C1308d c1308d = C1308d.f17096a;
                AutofillId autofillIdA = c1308d.a(viewStructure);
                AbstractC3340k.b(autofillIdA);
                c1308d.g(viewStructureB, autofillIdA, iIntValue);
                c1307c.d(viewStructureB, iIntValue, c1305a.f17092a.getContext().getPackageName(), null, null);
                c1308d.h(viewStructureB, 1);
                throw null;
            }
            iA++;
            it = it2;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1457v owner) {
        AbstractC3340k.e(owner, "owner");
        setShowLayoutBounds(V.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        if (this.f46286b) {
            L0.i iVar = L0.i.f6806a;
            if (i5 != 0 && i5 == 1) {
                iVar = L0.i.f6807b;
            }
            setLayoutDirection(iVar);
            b7.k kVar = this.f46292e;
            kVar.getClass();
            kVar.f19398d = iVar;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1457v interfaceC1457v) {
        M6.e(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1457v interfaceC1457v) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        boolean zA;
        this.f46294f.f46411a.setValue(Boolean.valueOf(z2));
        super.onWindowFocusChanged(z2);
        if (!z2 || getShowLayoutBounds() == (zA = V.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        e(getRoot());
    }

    public final void p() {
        if (this.f46272K) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f46271J) {
            this.f46271J = jCurrentAnimationTimeMillis;
            G g9 = this.f46308m0;
            float[] fArr = this.f46269H;
            g9.a(this, fArr);
            Q.h(fArr, this.f46270I);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f46268G;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.L = U8.v0.f(f10 - iArr[0], f11 - iArr[1]);
        }
    }

    public final void q(InterfaceC4042G interfaceC4042G) {
        w0 w0Var;
        Reference referencePoll;
        P.d dVar;
        if (this.f46262A != null) {
            q0 q0Var = s0.f46359m;
        }
        do {
            w0Var = this.f46297g0;
            referencePoll = ((ReferenceQueue) w0Var.f46406b).poll();
            dVar = (P.d) w0Var.f46405a;
            if (referencePoll != null) {
                dVar.k(referencePoll);
            }
        } while (referencePoll != null);
        dVar.b(new WeakReference(interfaceC4042G, (ReferenceQueue) w0Var.f46406b));
    }

    public final void r(tf.a aVar) {
        P.d dVar = this.f46299h0;
        if (dVar.f(aVar)) {
            return;
        }
        dVar.b(aVar);
    }

    public final void s(t0.t tVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.f46264C && tVar != null) {
            while (tVar != null && tVar.f45508O == 1) {
                tVar = tVar.j();
            }
            if (tVar == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setConfigurationChangeObserver(@NotNull tf.l lVar) {
        AbstractC3340k.e(lVar, "<set-?>");
        this.f46315s = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j8) {
        this.f46271J = j8;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull tf.l callback) {
        AbstractC3340k.e(callback, "callback");
        C4180j viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f46275O = callback;
    }

    public void setShowLayoutBounds(boolean z2) {
        this.f46321y = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long t(long j8) {
        p();
        float fB = C2384c.b(j8) - C2384c.b(this.L);
        float fC = C2384c.c(j8) - C2384c.c(this.L);
        return e0.z.m(U8.v0.f(fB, fC), this.f46270I);
    }

    public final int u(MotionEvent motionEvent) {
        Object objPrevious;
        p0.c cVar = this.f46313q;
        Y2.B bA = cVar.a(motionEvent, this);
        M.y yVar = this.f46314r;
        if (bA == null) {
            yVar.h();
            return 0;
        }
        ArrayList arrayList = (ArrayList) bA.f16383b;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((p0.m) objPrevious).f43158e) {
                break;
            }
        }
        p0.m mVar = (p0.m) objPrevious;
        if (mVar != null) {
            this.f46284a = mVar.f43157d;
        }
        int iG = yVar.g(bA, this, h(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iG & 1) != 0) {
            return iG;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        cVar.f43120c.delete(pointerId);
        cVar.f43119b.delete(pointerId);
        return iG;
    }

    public final void v(MotionEvent motionEvent, int i5, long j8, boolean z2) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i5 != 9 && i5 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            long j10 = j(U8.v0.f(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C2384c.b(j10);
            pointerCoords.y = C2384c.c(j10);
            i12++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j8 : motionEvent.getDownTime(), j8, i5, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z2 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        AbstractC3340k.d(event, "event");
        Y2.B bA = this.f46313q.a(event, this);
        AbstractC3340k.b(bA);
        this.f46314r.g(bA, this, true);
        event.recycle();
    }

    public final void w() {
        int[] iArr = this.f46268G;
        getLocationOnScreen(iArr);
        long j8 = this.f46267F;
        int i5 = L0.g.f6803c;
        int i10 = (int) (j8 >> 32);
        boolean z2 = false;
        int i11 = iArr[0];
        if (i10 != i11 || ((int) (j8 & 4294967295L)) != iArr[1]) {
            this.f46267F = A6.h.b(i11, iArr[1]);
            z2 = true;
        }
        this.f46265D.a(z2);
    }

    @NotNull
    public C4174g getAccessibilityManager() {
        return this.f46319w;
    }

    @NotNull
    public C4176h getClipboardManager() {
        return this.f46318v;
    }

    @InterfaceC2519c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @NotNull
    public View getView() {
        return this;
    }
}
