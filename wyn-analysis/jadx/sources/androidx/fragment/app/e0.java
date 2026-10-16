package androidx.fragment.app;

import A7.AbstractC0279p0;
import Va.M6;
import X0.C1281i;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1457v;
import com.wynauto.wyn.R;
import g.C2657e;
import j$.util.DesugarCollections;
import j1.InterfaceC3073a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.InterfaceC3123j;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import n3.C3592d;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: A, reason: collision with root package name */
    public final X f18394A;

    /* renamed from: B, reason: collision with root package name */
    public C2657e f18395B;

    /* renamed from: C, reason: collision with root package name */
    public C2657e f18396C;

    /* renamed from: D, reason: collision with root package name */
    public C2657e f18397D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f18398E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f18399F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18400G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f18401H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f18402I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f18403J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f18404K;
    public ArrayList L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f18405M;

    /* renamed from: N, reason: collision with root package name */
    public h0 f18406N;

    /* renamed from: O, reason: collision with root package name */
    public final RunnableC1427p f18407O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18409b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f18412e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.w f18414g;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f18419m;

    /* renamed from: n, reason: collision with root package name */
    public final K f18420n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f18421o;

    /* renamed from: p, reason: collision with root package name */
    public final S f18422p;

    /* renamed from: q, reason: collision with root package name */
    public final S f18423q;

    /* renamed from: r, reason: collision with root package name */
    public final S f18424r;

    /* renamed from: s, reason: collision with root package name */
    public final S f18425s;

    /* renamed from: t, reason: collision with root package name */
    public final V f18426t;

    /* renamed from: u, reason: collision with root package name */
    public int f18427u;

    /* renamed from: v, reason: collision with root package name */
    public O f18428v;

    /* renamed from: w, reason: collision with root package name */
    public M f18429w;

    /* renamed from: x, reason: collision with root package name */
    public F f18430x;

    /* renamed from: y, reason: collision with root package name */
    public F f18431y;

    /* renamed from: z, reason: collision with root package name */
    public final W f18432z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18408a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final m0 f18410c = new m0();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f18411d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final Q f18413f = new Q(this);

    /* renamed from: h, reason: collision with root package name */
    public C1409a f18415h = null;

    /* renamed from: i, reason: collision with root package name */
    public final U f18416i = new U(this);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f18417j = new AtomicInteger();
    public final Map k = M6.v();

    /* renamed from: l, reason: collision with root package name */
    public final Map f18418l = M6.v();

    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.fragment.app.S] */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.fragment.app.S] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.S] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.S] */
    public e0() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f18419m = new ArrayList();
        this.f18420n = new K(this);
        this.f18421o = new CopyOnWriteArrayList();
        final int i5 = 0;
        this.f18422p = new InterfaceC3073a(this) { // from class: androidx.fragment.app.S

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f18340b;

            {
                this.f18340b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        e0 e0Var = this.f18340b;
                        if (e0Var.L()) {
                            e0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e0 e0Var2 = this.f18340b;
                        if (e0Var2.L() && num.intValue() == 80) {
                            e0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1281i c1281i = (C1281i) obj;
                        e0 e0Var3 = this.f18340b;
                        if (e0Var3.L()) {
                            e0Var3.n(c1281i.f15839a, false);
                            break;
                        }
                        break;
                    default:
                        X0.S s10 = (X0.S) obj;
                        e0 e0Var4 = this.f18340b;
                        if (e0Var4.L()) {
                            e0Var4.s(s10.f15819a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f18423q = new InterfaceC3073a(this) { // from class: androidx.fragment.app.S

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f18340b;

            {
                this.f18340b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        e0 e0Var = this.f18340b;
                        if (e0Var.L()) {
                            e0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e0 e0Var2 = this.f18340b;
                        if (e0Var2.L() && num.intValue() == 80) {
                            e0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1281i c1281i = (C1281i) obj;
                        e0 e0Var3 = this.f18340b;
                        if (e0Var3.L()) {
                            e0Var3.n(c1281i.f15839a, false);
                            break;
                        }
                        break;
                    default:
                        X0.S s10 = (X0.S) obj;
                        e0 e0Var4 = this.f18340b;
                        if (e0Var4.L()) {
                            e0Var4.s(s10.f15819a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.f18424r = new InterfaceC3073a(this) { // from class: androidx.fragment.app.S

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f18340b;

            {
                this.f18340b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        e0 e0Var = this.f18340b;
                        if (e0Var.L()) {
                            e0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e0 e0Var2 = this.f18340b;
                        if (e0Var2.L() && num.intValue() == 80) {
                            e0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1281i c1281i = (C1281i) obj;
                        e0 e0Var3 = this.f18340b;
                        if (e0Var3.L()) {
                            e0Var3.n(c1281i.f15839a, false);
                            break;
                        }
                        break;
                    default:
                        X0.S s10 = (X0.S) obj;
                        e0 e0Var4 = this.f18340b;
                        if (e0Var4.L()) {
                            e0Var4.s(s10.f15819a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.f18425s = new InterfaceC3073a(this) { // from class: androidx.fragment.app.S

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f18340b;

            {
                this.f18340b = this;
            }

            @Override // j1.InterfaceC3073a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        e0 e0Var = this.f18340b;
                        if (e0Var.L()) {
                            e0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        e0 e0Var2 = this.f18340b;
                        if (e0Var2.L() && num.intValue() == 80) {
                            e0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        C1281i c1281i = (C1281i) obj;
                        e0 e0Var3 = this.f18340b;
                        if (e0Var3.L()) {
                            e0Var3.n(c1281i.f15839a, false);
                            break;
                        }
                        break;
                    default:
                        X0.S s10 = (X0.S) obj;
                        e0 e0Var4 = this.f18340b;
                        if (e0Var4.L()) {
                            e0Var4.s(s10.f15819a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f18426t = new V(this);
        this.f18427u = -1;
        this.f18432z = new W(this);
        this.f18394A = new X(0);
        this.f18398E = new ArrayDeque();
        this.f18407O = new RunnableC1427p(this, 2);
    }

    public static HashSet E(C1409a c1409a) {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < c1409a.f18350a.size(); i5++) {
            F f10 = ((n0) c1409a.f18350a.get(i5)).f18504b;
            if (f10 != null && c1409a.f18356g) {
                hashSet.add(f10);
            }
        }
        return hashSet;
    }

    public static boolean J(int i5) {
        return Log.isLoggable("FragmentManager", i5);
    }

    public static boolean K(F f10) {
        if (f10.mHasMenu && f10.mMenuVisible) {
            return true;
        }
        Iterator it = f10.mChildFragmentManager.f18410c.e().iterator();
        boolean zK = false;
        while (it.hasNext()) {
            F f11 = (F) it.next();
            if (f11 != null) {
                zK = K(f11);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(F f10) {
        if (f10 == null) {
            return true;
        }
        e0 e0Var = f10.mFragmentManager;
        return f10.equals(e0Var.f18431y) && M(e0Var.f18430x);
    }

    public static void b0(F f10) {
        if (J(2)) {
            Log.v("FragmentManager", "show: " + f10);
        }
        if (f10.mHidden) {
            f10.mHidden = false;
            f10.mHiddenChanged = !f10.mHiddenChanged;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0219 A[PHI: r14
  0x0219: PHI (r14v9 int) = (r14v8 int), (r14v10 int) binds: [B:103:0x0209, B:108:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.util.ArrayList r27, java.util.ArrayList r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e0.A(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final F B(int i5) {
        m0 m0Var = this.f18410c;
        ArrayList arrayList = m0Var.f18496a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f10 = (F) arrayList.get(size);
            if (f10 != null && f10.mFragmentId == i5) {
                return f10;
            }
        }
        for (l0 l0Var : m0Var.f18497b.values()) {
            if (l0Var != null) {
                F f11 = l0Var.f18480c;
                if (f11.mFragmentId == i5) {
                    return f11;
                }
            }
        }
        return null;
    }

    public final F C(String str) {
        m0 m0Var = this.f18410c;
        ArrayList arrayList = m0Var.f18496a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            F f10 = (F) arrayList.get(size);
            if (f10 != null && str.equals(f10.mTag)) {
                return f10;
            }
        }
        for (l0 l0Var : m0Var.f18497b.values()) {
            if (l0Var != null) {
                F f11 = l0Var.f18480c;
                if (str.equals(f11.mTag)) {
                    return f11;
                }
            }
        }
        return null;
    }

    public final void D() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C1426o c1426o = (C1426o) it.next();
            if (c1426o.f18516e) {
                if (J(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c1426o.f18516e = false;
                c1426o.e();
            }
        }
    }

    public final ViewGroup F(F f10) {
        ViewGroup viewGroup = f10.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (f10.mContainerId <= 0 || !this.f18429w.c()) {
            return null;
        }
        View viewB = this.f18429w.b(f10.mContainerId);
        if (viewB instanceof ViewGroup) {
            return (ViewGroup) viewB;
        }
        return null;
    }

    public final W G() {
        F f10 = this.f18430x;
        return f10 != null ? f10.mFragmentManager.G() : this.f18432z;
    }

    public final X H() {
        F f10 = this.f18430x;
        return f10 != null ? f10.mFragmentManager.H() : this.f18394A;
    }

    public final void I(F f10) {
        if (J(2)) {
            Log.v("FragmentManager", "hide: " + f10);
        }
        if (f10.mHidden) {
            return;
        }
        f10.mHidden = true;
        f10.mHiddenChanged = true ^ f10.mHiddenChanged;
        a0(f10);
    }

    public final boolean L() {
        F f10 = this.f18430x;
        if (f10 == null) {
            return true;
        }
        return f10.isAdded() && this.f18430x.getParentFragmentManager().L();
    }

    public final void N(int i5, boolean z2) {
        HashMap map;
        O o7;
        if (this.f18428v == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i5 != this.f18427u) {
            this.f18427u = i5;
            m0 m0Var = this.f18410c;
            Iterator it = m0Var.f18496a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = m0Var.f18497b;
                if (!zHasNext) {
                    break;
                }
                l0 l0Var = (l0) map.get(((F) it.next()).mWho);
                if (l0Var != null) {
                    l0Var.k();
                }
            }
            for (l0 l0Var2 : map.values()) {
                if (l0Var2 != null) {
                    l0Var2.k();
                    F f10 = l0Var2.f18480c;
                    if (f10.mRemoving && !f10.isInBackStack()) {
                        if (f10.mBeingSaved && !m0Var.f18498c.containsKey(f10.mWho)) {
                            m0Var.i(l0Var2.n(), f10.mWho);
                        }
                        m0Var.h(l0Var2);
                    }
                }
            }
            Iterator it2 = m0Var.d().iterator();
            while (it2.hasNext()) {
                l0 l0Var3 = (l0) it2.next();
                F f11 = l0Var3.f18480c;
                if (f11.mDeferStart) {
                    if (this.f18409b) {
                        this.f18403J = true;
                    } else {
                        f11.mDeferStart = false;
                        l0Var3.k();
                    }
                }
            }
            if (this.f18399F && (o7 = this.f18428v) != null && this.f18427u == 7) {
                ((J) o7).f18323e.invalidateMenu();
                this.f18399F = false;
            }
        }
    }

    public final void O() {
        if (this.f18428v == null) {
            return;
        }
        this.f18400G = false;
        this.f18401H = false;
        this.f18406N.f18457g = false;
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.noteStateNotSaved();
            }
        }
    }

    public final boolean P() {
        return Q(-1, 0);
    }

    public final boolean Q(int i5, int i10) {
        z(false);
        y(true);
        F f10 = this.f18431y;
        if (f10 != null && i5 < 0 && f10.getChildFragmentManager().P()) {
            return true;
        }
        boolean zR = R(this.f18404K, this.L, i5, i10);
        if (zR) {
            this.f18409b = true;
            try {
                T(this.f18404K, this.L);
            } finally {
                d();
            }
        }
        d0();
        boolean z2 = this.f18403J;
        m0 m0Var = this.f18410c;
        if (z2) {
            this.f18403J = false;
            Iterator it = m0Var.d().iterator();
            while (it.hasNext()) {
                l0 l0Var = (l0) it.next();
                F f11 = l0Var.f18480c;
                if (f11.mDeferStart) {
                    if (this.f18409b) {
                        this.f18403J = true;
                    } else {
                        f11.mDeferStart = false;
                        l0Var.k();
                    }
                }
            }
        }
        m0Var.f18497b.values().removeAll(Collections.singleton(null));
        return zR;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i5, int i10) {
        boolean z2 = (i10 & 1) != 0;
        int size = -1;
        if (!this.f18411d.isEmpty()) {
            if (i5 < 0) {
                size = z2 ? 0 : this.f18411d.size() - 1;
            } else {
                int size2 = this.f18411d.size() - 1;
                while (size2 >= 0) {
                    C1409a c1409a = (C1409a) this.f18411d.get(size2);
                    if (i5 >= 0 && i5 == c1409a.f18367s) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z2) {
                    size = size2;
                    while (size > 0) {
                        C1409a c1409a2 = (C1409a) this.f18411d.get(size - 1);
                        if (i5 < 0 || i5 != c1409a2.f18367s) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f18411d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f18411d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C1409a) this.f18411d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(F f10) {
        if (J(2)) {
            Log.v("FragmentManager", "remove: " + f10 + " nesting=" + f10.mBackStackNesting);
        }
        boolean zIsInBackStack = f10.isInBackStack();
        if (f10.mDetached && zIsInBackStack) {
            return;
        }
        m0 m0Var = this.f18410c;
        synchronized (m0Var.f18496a) {
            m0Var.f18496a.remove(f10);
        }
        f10.mAdded = false;
        if (K(f10)) {
            this.f18399F = true;
        }
        f10.mRemoving = true;
        a0(f10);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i5 = 0;
        int i10 = 0;
        while (i5 < size) {
            if (!((C1409a) arrayList.get(i5)).f18364p) {
                if (i10 != i5) {
                    A(arrayList, arrayList2, i10, i5);
                }
                i10 = i5 + 1;
                if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((C1409a) arrayList.get(i10)).f18364p) {
                        i10++;
                    }
                }
                A(arrayList, arrayList2, i5, i10);
                i5 = i10 - 1;
            }
            i5++;
        }
        if (i10 != size) {
            A(arrayList, arrayList2, i10, size);
        }
    }

    public final void U(Bundle bundle) {
        int i5;
        K k;
        int i10;
        l0 l0Var;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f18428v.f18333b.getClassLoader());
                this.f18418l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f18428v.f18333b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        m0 m0Var = this.f18410c;
        HashMap map2 = m0Var.f18498c;
        map2.clear();
        map2.putAll(map);
        g0 g0Var = (g0) bundle.getParcelable("state");
        if (g0Var == null) {
            return;
        }
        HashMap map3 = m0Var.f18497b;
        map3.clear();
        Iterator it = g0Var.f18441a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i5 = 2;
            k = this.f18420n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = m0Var.i(null, (String) it.next());
            if (bundleI != null) {
                F f10 = (F) this.f18406N.f18452b.get(((j0) bundleI.getParcelable("state")).f18461b);
                if (f10 != null) {
                    if (J(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + f10);
                    }
                    l0Var = new l0(k, m0Var, f10, bundleI);
                } else {
                    l0Var = new l0(this.f18420n, this.f18410c, this.f18428v.f18333b.getClassLoader(), G(), bundleI);
                }
                F f11 = l0Var.f18480c;
                f11.mSavedFragmentState = bundleI;
                f11.mFragmentManager = this;
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + f11.mWho + "): " + f11);
                }
                l0Var.l(this.f18428v.f18333b.getClassLoader());
                m0Var.g(l0Var);
                l0Var.f18482e = this.f18427u;
            }
        }
        h0 h0Var = this.f18406N;
        h0Var.getClass();
        Iterator it2 = new ArrayList(h0Var.f18452b.values()).iterator();
        while (it2.hasNext()) {
            F f12 = (F) it2.next();
            if (map3.get(f12.mWho) == null) {
                if (J(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + f12 + " that was not found in the set of active Fragments " + g0Var.f18441a);
                }
                this.f18406N.g(f12);
                f12.mFragmentManager = this;
                l0 l0Var2 = new l0(k, m0Var, f12);
                l0Var2.f18482e = 1;
                l0Var2.k();
                f12.mRemoving = true;
                l0Var2.k();
            }
        }
        ArrayList<String> arrayList = g0Var.f18442b;
        m0Var.f18496a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                F fB = m0Var.b(str3);
                if (fB == null) {
                    throw new IllegalStateException(AbstractC0279p0.l("No instantiated fragment for (", str3, ")"));
                }
                if (J(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fB);
                }
                m0Var.a(fB);
            }
        }
        if (g0Var.f18443c != null) {
            this.f18411d = new ArrayList(g0Var.f18443c.length);
            int i11 = 0;
            while (true) {
                C1411b[] c1411bArr = g0Var.f18443c;
                if (i11 >= c1411bArr.length) {
                    break;
                }
                C1411b c1411b = c1411bArr[i11];
                c1411b.getClass();
                C1409a c1409a = new C1409a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = c1411b.f18370a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    n0 n0Var = new n0();
                    int i14 = i12 + 1;
                    int i15 = i5;
                    n0Var.f18503a = iArr[i12];
                    if (J(i15)) {
                        Log.v("FragmentManager", "Instantiate " + c1409a + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    n0Var.f18510h = EnumC1450n.values()[c1411b.f18372c[i13]];
                    n0Var.f18511i = EnumC1450n.values()[c1411b.f18373d[i13]];
                    int i16 = i12 + 2;
                    n0Var.f18505c = iArr[i14] != 0;
                    int i17 = iArr[i16];
                    n0Var.f18506d = i17;
                    int i18 = iArr[i12 + 3];
                    n0Var.f18507e = i18;
                    int i19 = i12 + 5;
                    int i20 = iArr[i12 + 4];
                    n0Var.f18508f = i20;
                    i12 += 6;
                    int i21 = iArr[i19];
                    n0Var.f18509g = i21;
                    c1409a.f18351b = i17;
                    c1409a.f18352c = i18;
                    c1409a.f18353d = i20;
                    c1409a.f18354e = i21;
                    c1409a.b(n0Var);
                    i13++;
                    i5 = i15;
                }
                int i22 = i5;
                c1409a.f18355f = c1411b.f18374e;
                c1409a.f18358i = c1411b.f18375f;
                c1409a.f18356g = true;
                c1409a.f18359j = c1411b.f18377h;
                c1409a.k = c1411b.f18378i;
                c1409a.f18360l = c1411b.f18379j;
                c1409a.f18361m = c1411b.k;
                c1409a.f18362n = c1411b.f18380l;
                c1409a.f18363o = c1411b.f18381m;
                c1409a.f18364p = c1411b.f18382n;
                c1409a.f18367s = c1411b.f18376g;
                int i23 = 0;
                while (true) {
                    ArrayList arrayList2 = c1411b.f18371b;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i23);
                    if (str4 != null) {
                        ((n0) c1409a.f18350a.get(i23)).f18504b = m0Var.b(str4);
                    }
                    i23++;
                }
                c1409a.c(1);
                if (J(i22)) {
                    StringBuilder sbL = pd.f.l(i11, "restoreAllState: back stack #", " (index ");
                    sbL.append(c1409a.f18367s);
                    sbL.append("): ");
                    sbL.append(c1409a);
                    Log.v("FragmentManager", sbL.toString());
                    PrintWriter printWriter = new PrintWriter(new x0());
                    c1409a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f18411d.add(c1409a);
                i11++;
                i5 = i22;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f18411d = new ArrayList();
        }
        this.f18417j.set(g0Var.f18444d);
        String str5 = g0Var.f18445e;
        if (str5 != null) {
            F fB2 = m0Var.b(str5);
            this.f18431y = fB2;
            r(fB2);
        }
        ArrayList arrayList3 = g0Var.f18446f;
        if (arrayList3 != null) {
            for (int i24 = i10; i24 < arrayList3.size(); i24++) {
                this.k.put((String) arrayList3.get(i24), (C1413c) g0Var.f18447g.get(i24));
            }
        }
        this.f18398E = new ArrayDeque(g0Var.f18448h);
    }

    public final Bundle V() {
        ArrayList arrayList;
        C1411b[] c1411bArr;
        Bundle bundle = new Bundle();
        D();
        w();
        z(true);
        this.f18400G = true;
        this.f18406N.f18457g = true;
        m0 m0Var = this.f18410c;
        m0Var.getClass();
        HashMap map = m0Var.f18497b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (l0 l0Var : map.values()) {
            if (l0Var != null) {
                F f10 = l0Var.f18480c;
                m0Var.i(l0Var.n(), f10.mWho);
                arrayList2.add(f10.mWho);
                if (J(2)) {
                    Log.v("FragmentManager", "Saved state of " + f10 + ": " + f10.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = this.f18410c.f18498c;
        if (!map2.isEmpty()) {
            m0 m0Var2 = this.f18410c;
            synchronized (m0Var2.f18496a) {
                try {
                    if (m0Var2.f18496a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(m0Var2.f18496a.size());
                        Iterator it = m0Var2.f18496a.iterator();
                        while (it.hasNext()) {
                            F f11 = (F) it.next();
                            arrayList.add(f11.mWho);
                            if (J(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + f11.mWho + "): " + f11);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f18411d.size();
            if (size > 0) {
                c1411bArr = new C1411b[size];
                for (int i5 = 0; i5 < size; i5++) {
                    c1411bArr[i5] = new C1411b((C1409a) this.f18411d.get(i5));
                    if (J(2)) {
                        StringBuilder sbL = pd.f.l(i5, "saveAllState: adding back stack #", ": ");
                        sbL.append(this.f18411d.get(i5));
                        Log.v("FragmentManager", sbL.toString());
                    }
                }
            } else {
                c1411bArr = null;
            }
            g0 g0Var = new g0();
            g0Var.f18445e = null;
            ArrayList arrayList3 = new ArrayList();
            g0Var.f18446f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            g0Var.f18447g = arrayList4;
            g0Var.f18441a = arrayList2;
            g0Var.f18442b = arrayList;
            g0Var.f18443c = c1411bArr;
            g0Var.f18444d = this.f18417j.get();
            F f12 = this.f18431y;
            if (f12 != null) {
                g0Var.f18445e = f12.mWho;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            g0Var.f18448h = new ArrayList(this.f18398E);
            bundle.putParcelable("state", g0Var);
            for (String str : this.f18418l.keySet()) {
                bundle.putBundle(R8.v.f("result_", str), (Bundle) this.f18418l.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(R8.v.f("fragment_", str2), (Bundle) map2.get(str2));
            }
        } else if (J(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void W() {
        synchronized (this.f18408a) {
            try {
                if (this.f18408a.size() == 1) {
                    this.f18428v.f18334c.removeCallbacks(this.f18407O);
                    this.f18428v.f18334c.post(this.f18407O);
                    d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(F f10, boolean z2) {
        ViewGroup viewGroupF = F(f10);
        if (viewGroupF == null || !(viewGroupF instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupF).setDrawDisappearingViewsLast(!z2);
    }

    public final void Y(F f10, EnumC1450n enumC1450n) {
        if (f10.equals(this.f18410c.b(f10.mWho)) && (f10.mHost == null || f10.mFragmentManager == this)) {
            f10.mMaxState = enumC1450n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f10 + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(F f10) {
        if (f10 != null) {
            if (!f10.equals(this.f18410c.b(f10.mWho)) || (f10.mHost != null && f10.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + f10 + " is not an active fragment of FragmentManager " + this);
            }
        }
        F f11 = this.f18431y;
        this.f18431y = f10;
        r(f11);
        r(this.f18431y);
    }

    public final l0 a(F f10) {
        String str = f10.mPreviousWho;
        if (str != null) {
            D1.d.c(f10, str);
        }
        if (J(2)) {
            Log.v("FragmentManager", "add: " + f10);
        }
        l0 l0VarG = g(f10);
        f10.mFragmentManager = this;
        m0 m0Var = this.f18410c;
        m0Var.g(l0VarG);
        if (!f10.mDetached) {
            m0Var.a(f10);
            f10.mRemoving = false;
            if (f10.mView == null) {
                f10.mHiddenChanged = false;
            }
            if (K(f10)) {
                this.f18399F = true;
            }
        }
        return l0VarG;
    }

    public final void a0(F f10) {
        ViewGroup viewGroupF = F(f10);
        if (viewGroupF != null) {
            if (f10.getPopExitAnim() + f10.getPopEnterAnim() + f10.getExitAnim() + f10.getEnterAnim() > 0) {
                if (viewGroupF.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupF.setTag(R.id.visible_removing_fragment_view_tag, f10);
                }
                ((F) viewGroupF.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(f10.getPopDirection());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(O o7, M m10, F f10) {
        if (this.f18428v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f18428v = o7;
        this.f18429w = m10;
        this.f18430x = f10;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f18421o;
        if (f10 != null) {
            copyOnWriteArrayList.add(new Y(f10));
        } else if (o7 instanceof i0) {
            copyOnWriteArrayList.add((i0) o7);
        }
        if (this.f18430x != null) {
            d0();
        }
        if (o7 instanceof androidx.activity.y) {
            androidx.activity.y yVar = (androidx.activity.y) o7;
            androidx.activity.w onBackPressedDispatcher = yVar.getOnBackPressedDispatcher();
            this.f18414g = onBackPressedDispatcher;
            InterfaceC1457v interfaceC1457v = yVar;
            if (f10 != null) {
                interfaceC1457v = f10;
            }
            onBackPressedDispatcher.a(interfaceC1457v, this.f18416i);
        }
        if (f10 != null) {
            h0 h0Var = f10.mFragmentManager.f18406N;
            HashMap map = h0Var.f18453c;
            h0 h0Var2 = (h0) map.get(f10.mWho);
            if (h0Var2 == null) {
                h0Var2 = new h0(h0Var.f18455e);
                map.put(f10.mWho, h0Var2);
            }
            this.f18406N = h0Var2;
        } else if (o7 instanceof androidx.lifecycle.f0) {
            androidx.lifecycle.e0 store = ((androidx.lifecycle.f0) o7).getViewModelStore();
            a2.k kVar = h0.f18451h;
            AbstractC3340k.e(store, "store");
            H1.a defaultCreationExtras = H1.a.f4870b;
            AbstractC3340k.e(defaultCreationExtras, "defaultCreationExtras");
            G9.e eVar = new G9.e(store, kVar, defaultCreationExtras);
            KClass modelClass = Fe.b.B(h0.class);
            AbstractC3340k.e(modelClass, "modelClass");
            String qualifiedName = modelClass.getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f18406N = (h0) eVar.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
        } else {
            this.f18406N = new h0(false);
        }
        h0 h0Var3 = this.f18406N;
        h0Var3.f18457g = this.f18400G || this.f18401H;
        this.f18410c.f18499d = h0Var3;
        Object obj = this.f18428v;
        if ((obj instanceof n3.f) && f10 == null) {
            C3592d savedStateRegistry = ((n3.f) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new G(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        Object obj2 = this.f18428v;
        if (obj2 instanceof g.i) {
            g.h activityResultRegistry = ((g.i) obj2).getActivityResultRegistry();
            String strF = R8.v.f("FragmentManager:", f10 != null ? wg.b.c(new StringBuilder(), f10.mWho, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER) : "");
            this.f18395B = activityResultRegistry.d(N0.a.f(strF, "StartActivityForResult"), new Z(2), new T(this, 1));
            this.f18396C = activityResultRegistry.d(N0.a.f(strF, "StartIntentSenderForResult"), new Z(0), new T(this, 2));
            this.f18397D = activityResultRegistry.d(N0.a.f(strF, "RequestPermissions"), new Z(1), new T(this, 0));
        }
        Object obj3 = this.f18428v;
        if (obj3 instanceof Y0.f) {
            ((Y0.f) obj3).addOnConfigurationChangedListener(this.f18422p);
        }
        Object obj4 = this.f18428v;
        if (obj4 instanceof Y0.g) {
            ((Y0.g) obj4).addOnTrimMemoryListener(this.f18423q);
        }
        Object obj5 = this.f18428v;
        if (obj5 instanceof X0.O) {
            ((X0.O) obj5).addOnMultiWindowModeChangedListener(this.f18424r);
        }
        Object obj6 = this.f18428v;
        if (obj6 instanceof X0.P) {
            ((X0.P) obj6).addOnPictureInPictureModeChangedListener(this.f18425s);
        }
        Object obj7 = this.f18428v;
        if ((obj7 instanceof InterfaceC3123j) && f10 == null) {
            ((InterfaceC3123j) obj7).addMenuProvider(this.f18426t);
        }
    }

    public final void c(F f10) {
        if (J(2)) {
            Log.v("FragmentManager", "attach: " + f10);
        }
        if (f10.mDetached) {
            f10.mDetached = false;
            if (f10.mAdded) {
                return;
            }
            this.f18410c.a(f10);
            if (J(2)) {
                Log.v("FragmentManager", "add from attach: " + f10);
            }
            if (K(f10)) {
                this.f18399F = true;
            }
        }
    }

    public final void c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new x0());
        O o7 = this.f18428v;
        if (o7 == null) {
            try {
                v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            ((J) o7).f18323e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw illegalStateException;
        }
    }

    public final void d() {
        this.f18409b = false;
        this.L.clear();
        this.f18404K.clear();
    }

    public final void d0() {
        synchronized (this.f18408a) {
            try {
                if (!this.f18408a.isEmpty()) {
                    this.f18416i.f(true);
                    if (J(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z2 = this.f18411d.size() + (this.f18415h != null ? 1 : 0) > 0 && M(this.f18430x);
                if (J(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z2);
                }
                this.f18416i.f(z2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet e() {
        C1426o c1426o;
        HashSet hashSet = new HashSet();
        Iterator it = this.f18410c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((l0) it.next()).f18480c.mContainer;
            if (viewGroup != null) {
                X factory = H();
                AbstractC3340k.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C1426o) {
                    c1426o = (C1426o) tag;
                } else {
                    c1426o = new C1426o(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c1426o);
                }
                hashSet.add(c1426o);
            }
        }
        return hashSet;
    }

    public final HashSet f(ArrayList arrayList, int i5, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i5 < i10) {
            Iterator it = ((C1409a) arrayList.get(i5)).f18350a.iterator();
            while (it.hasNext()) {
                F f10 = ((n0) it.next()).f18504b;
                if (f10 != null && (viewGroup = f10.mContainer) != null) {
                    hashSet.add(C1426o.j(viewGroup, this));
                }
            }
            i5++;
        }
        return hashSet;
    }

    public final l0 g(F f10) {
        String str = f10.mWho;
        m0 m0Var = this.f18410c;
        l0 l0Var = (l0) m0Var.f18497b.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(this.f18420n, m0Var, f10);
        l0Var2.l(this.f18428v.f18333b.getClassLoader());
        l0Var2.f18482e = this.f18427u;
        return l0Var2;
    }

    public final void h(F f10) {
        if (J(2)) {
            Log.v("FragmentManager", "detach: " + f10);
        }
        if (f10.mDetached) {
            return;
        }
        f10.mDetached = true;
        if (f10.mAdded) {
            if (J(2)) {
                Log.v("FragmentManager", "remove from detach: " + f10);
            }
            m0 m0Var = this.f18410c;
            synchronized (m0Var.f18496a) {
                m0Var.f18496a.remove(f10);
            }
            f10.mAdded = false;
            if (K(f10)) {
                this.f18399F = true;
            }
            a0(f10);
        }
    }

    public final void i(boolean z2, Configuration configuration) {
        if (z2 && (this.f18428v instanceof Y0.f)) {
            c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.performConfigurationChanged(configuration);
                if (z2) {
                    f10.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f18427u < 1) {
            return false;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null && f10.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f18427u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (F f10 : this.f18410c.f()) {
            if (f10 != null && f10.isMenuVisible() && f10.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(f10);
                z2 = true;
            }
        }
        if (this.f18412e != null) {
            for (int i5 = 0; i5 < this.f18412e.size(); i5++) {
                F f11 = (F) this.f18412e.get(i5);
                if (arrayList == null || !arrayList.contains(f11)) {
                    f11.onDestroyOptionsMenu();
                }
            }
        }
        this.f18412e = arrayList;
        return z2;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.f18402I = true;
        z(true);
        w();
        O o7 = this.f18428v;
        boolean z2 = o7 instanceof androidx.lifecycle.f0;
        m0 m0Var = this.f18410c;
        if (z2) {
            zIsChangingConfigurations = m0Var.f18499d.f18456f;
        } else {
            FragmentActivity fragmentActivity = o7.f18333b;
            if (fragmentActivity instanceof Activity) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1413c) it.next()).f18383a.iterator();
                while (it2.hasNext()) {
                    m0Var.f18499d.e((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f18428v;
        if (obj instanceof Y0.g) {
            ((Y0.g) obj).removeOnTrimMemoryListener(this.f18423q);
        }
        Object obj2 = this.f18428v;
        if (obj2 instanceof Y0.f) {
            ((Y0.f) obj2).removeOnConfigurationChangedListener(this.f18422p);
        }
        Object obj3 = this.f18428v;
        if (obj3 instanceof X0.O) {
            ((X0.O) obj3).removeOnMultiWindowModeChangedListener(this.f18424r);
        }
        Object obj4 = this.f18428v;
        if (obj4 instanceof X0.P) {
            ((X0.P) obj4).removeOnPictureInPictureModeChangedListener(this.f18425s);
        }
        Object obj5 = this.f18428v;
        if ((obj5 instanceof InterfaceC3123j) && this.f18430x == null) {
            ((InterfaceC3123j) obj5).removeMenuProvider(this.f18426t);
        }
        this.f18428v = null;
        this.f18429w = null;
        this.f18430x = null;
        if (this.f18414g != null) {
            this.f18416i.e();
            this.f18414g = null;
        }
        C2657e c2657e = this.f18395B;
        if (c2657e != null) {
            c2657e.b();
            this.f18396C.b();
            this.f18397D.b();
        }
    }

    public final void m(boolean z2) {
        if (z2 && (this.f18428v instanceof Y0.g)) {
            c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.performLowMemory();
                if (z2) {
                    f10.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z2, boolean z10) {
        if (z10 && (this.f18428v instanceof X0.O)) {
            c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.performMultiWindowModeChanged(z2);
                if (z10) {
                    f10.mChildFragmentManager.n(z2, true);
                }
            }
        }
    }

    public final void o() {
        Iterator it = this.f18410c.e().iterator();
        while (it.hasNext()) {
            F f10 = (F) it.next();
            if (f10 != null) {
                f10.onHiddenChanged(f10.isHidden());
                f10.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f18427u < 1) {
            return false;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null && f10.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f18427u < 1) {
            return;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(F f10) {
        if (f10 != null) {
            if (f10.equals(this.f18410c.b(f10.mWho))) {
                f10.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z2, boolean z10) {
        if (z10 && (this.f18428v instanceof X0.P)) {
            c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null) {
                f10.performPictureInPictureModeChanged(z2);
                if (z10) {
                    f10.mChildFragmentManager.s(z2, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z2 = false;
        if (this.f18427u < 1) {
            return false;
        }
        for (F f10 : this.f18410c.f()) {
            if (f10 != null && f10.isMenuVisible() && f10.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        F f10 = this.f18430x;
        if (f10 != null) {
            sb2.append(f10.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f18430x)));
            sb2.append("}");
        } else {
            O o7 = this.f18428v;
            if (o7 != null) {
                sb2.append(o7.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f18428v)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i5) {
        try {
            this.f18409b = true;
            for (l0 l0Var : this.f18410c.f18497b.values()) {
                if (l0Var != null) {
                    l0Var.f18482e = i5;
                }
            }
            N(i5, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C1426o) it.next()).i();
            }
            this.f18409b = false;
            z(true);
        } catch (Throwable th) {
            this.f18409b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strF = N0.a.f(str, "    ");
        m0 m0Var = this.f18410c;
        m0Var.getClass();
        String str2 = str + "    ";
        HashMap map = m0Var.f18497b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (l0 l0Var : map.values()) {
                printWriter.print(str);
                if (l0Var != null) {
                    F f10 = l0Var.f18480c;
                    printWriter.println(f10);
                    f10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = m0Var.f18496a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size2; i5++) {
                F f11 = (F) arrayList.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(f11.toString());
            }
        }
        ArrayList arrayList2 = this.f18412e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                F f12 = (F) this.f18412e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(f12.toString());
            }
        }
        int size3 = this.f18411d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                C1409a c1409a = (C1409a) this.f18411d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c1409a.toString());
                c1409a.f(strF, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f18417j.get());
        synchronized (this.f18408a) {
            try {
                int size4 = this.f18408a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (InterfaceC1412b0) this.f18408a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f18428v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f18429w);
        if (this.f18430x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f18430x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f18427u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f18400G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f18401H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f18402I);
        if (this.f18399F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f18399F);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C1426o) it.next()).i();
        }
    }

    public final void x(InterfaceC1412b0 interfaceC1412b0, boolean z2) {
        if (!z2) {
            if (this.f18428v == null) {
                if (!this.f18402I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f18400G || this.f18401H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f18408a) {
            try {
                if (this.f18428v == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f18408a.add(interfaceC1412b0);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z2) {
        if (this.f18409b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f18428v == null) {
            if (!this.f18402I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f18428v.f18334c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f18400G || this.f18401H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f18404K == null) {
            this.f18404K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    public final boolean z(boolean z2) {
        boolean zA;
        y(z2);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f18404K;
            ArrayList arrayList2 = this.L;
            synchronized (this.f18408a) {
                if (this.f18408a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f18408a.size();
                        zA = false;
                        for (int i5 = 0; i5 < size; i5++) {
                            zA |= ((InterfaceC1412b0) this.f18408a.get(i5)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f18409b = true;
            try {
                T(this.f18404K, this.L);
                d();
                z10 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        d0();
        if (this.f18403J) {
            this.f18403J = false;
            Iterator it = this.f18410c.d().iterator();
            while (it.hasNext()) {
                l0 l0Var = (l0) it.next();
                F f10 = l0Var.f18480c;
                if (f10.mDeferStart) {
                    if (this.f18409b) {
                        this.f18403J = true;
                    } else {
                        f10.mDeferStart = false;
                        l0Var.k();
                    }
                }
            }
        }
        this.f18410c.f18497b.values().removeAll(Collections.singleton(null));
        return z10;
    }
}
