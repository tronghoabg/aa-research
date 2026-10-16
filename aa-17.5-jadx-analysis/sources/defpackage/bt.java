package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecordState;
import android.support.v4.app.BackStackState;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class bt {
    public bii A;
    public final bii B;
    private boolean C;
    private ArrayList D;
    private final dzg F;
    private final dzg G;
    private final dzg H;
    private final dzg I;
    private final bf J;
    private boolean K;
    private ArrayList L;
    private ArrayList M;
    private ArrayList N;
    private final Runnable O;
    private final ca P;
    private final izj Q;
    public final ArrayList j;
    public final CopyOnWriteArrayList k;
    public int l;
    public bg m;
    public be n;
    public Fragment o;
    public Fragment p;
    public bf q;
    public oy r;
    public oy s;
    public oy t;
    public ArrayDeque u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public bv z;
    public final ArrayList a = new ArrayList();
    public final bz b = new bz();
    ArrayList c = new ArrayList();
    public final bh d = new bh(this);
    w e = null;
    boolean f = false;
    public final om g = new bj(this);
    public final AtomicInteger h = new AtomicInteger();
    public final Map i = DesugarCollections.synchronizedMap(new HashMap());
    private final Map E = DesugarCollections.synchronizedMap(new HashMap());

    public bt() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.j = new ArrayList();
        this.B = new bii(this);
        this.k = new CopyOnWriteArrayList();
        this.F = new ba(this, 2);
        this.G = new ba(this, 3);
        this.H = new ba(this, 4);
        this.I = new ba(this, 5);
        this.Q = new izj(this);
        this.l = -1;
        this.q = null;
        this.J = new bk(this);
        this.P = new ca();
        this.u = new ArrayDeque();
        this.O = new ap(this, 15, null);
    }

    private final void aA() {
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            P((by) it.next());
        }
    }

    public static boolean ac(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set ai(w wVar) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = wVar.e;
            if (i >= arrayList.size()) {
                return hashSet;
            }
            Fragment fragment = ((cb) arrayList.get(i)).b;
            if (fragment != null && wVar.k) {
                hashSet.add(fragment);
            }
            i++;
        }
    }

    public static final boolean aj(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zAj = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.b.f()) {
            if (fragment2 != null) {
                zAj = aj(fragment2);
            }
            if (zAj) {
                return true;
            }
        }
        return false;
    }

    public static final boolean ak(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    static final void am(Fragment fragment) {
        if (ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    private final ViewGroup aq(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.n.b()) {
            return null;
        }
        View viewA = this.n.a(fragment.mContainerId);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set ar() {
        HashSet hashSet = new HashSet();
        Iterator it = this.b.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((by) it.next()).a.mContainer;
            if (viewGroup != null) {
                hashSet.add(ca.d(viewGroup, ap()));
            }
        }
        return hashSet;
    }

    private final void as() {
        if (af()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void at() {
        this.C = false;
        this.M.clear();
        this.L.clear();
    }

    private final void au() {
        if (this.K) {
            this.K = false;
            aA();
        }
    }

    private final void av(boolean z) {
        if (this.C) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            if (!this.y) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.m.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            as();
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0220 A[PHI: r14
  0x0220: PHI (r14v16 int) = (r14v15 int), (r14v17 int) binds: [B:99:0x0210, B:104:0x021c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aw(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt.aw(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void ax() {
        for (cq cqVar : ar()) {
            if (cqVar.e) {
                if (ac(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                cqVar.e = false;
                cqVar.e();
            }
        }
    }

    private final void ay(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((w) arrayList.get(i)).t) {
                if (i2 != i) {
                    aw(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((w) arrayList.get(i2)).t) {
                        i2++;
                    }
                }
                aw(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            aw(arrayList, arrayList2, i2, size);
        }
    }

    private final void az(Fragment fragment) {
        ViewGroup viewGroupAq = aq(fragment);
        if (viewGroupAq == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupAq.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAq.setTag(R.id.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupAq.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    public static Fragment g(View view) {
        while (view != null) {
            Fragment fragmentH = h(view);
            if (fragmentH != null) {
                return fragmentH;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static Fragment h(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public final void A(Fragment fragment) {
        if (fragment == null || !fragment.equals(d(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    public final void B() {
        if (this.e != null) {
            q();
        }
        F(5);
    }

    final void C(boolean z, boolean z2) {
        if (z2 && (this.m instanceof dui)) {
            W(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.C(z, true);
                }
            }
        }
    }

    public final void D() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(7);
    }

    public final void E() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(5);
    }

    public final void F(int i) {
        try {
            this.C = true;
            for (by byVar : this.b.b.values()) {
                if (byVar != null) {
                    byVar.b = i;
                }
            }
            M(i, false);
            Iterator it = ar().iterator();
            while (it.hasNext()) {
                ((cq) it.next()).f();
            }
            this.C = false;
            an(true);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    public final void G() {
        this.x = true;
        this.z.g = true;
        F(4);
    }

    public final void H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        bz bzVar = this.b;
        HashMap map = bzVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (by byVar : map.values()) {
                printWriter.print(str);
                if (byVar != null) {
                    String strValueOf = String.valueOf(str);
                    Fragment fragment = byVar.a;
                    printWriter.println(fragment);
                    fragment.dump(strValueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = bzVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                Fragment fragment2 = (Fragment) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList arrayList2 = this.D;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment3 = (Fragment) this.D.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.c.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                w wVar = (w) this.c.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(wVar.toString());
                wVar.f(strValueOf2.concat("    "), printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.h.get());
        ArrayList arrayList3 = this.a;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (bo) arrayList3.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.w);
        printWriter.print(" mStopped=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.v);
        }
    }

    public final void I() {
        Iterator it = ar().iterator();
        while (it.hasNext()) {
            ((cq) it.next()).f();
        }
    }

    public final void J(bo boVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (!this.y) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            as();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.m == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(boVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.m.d.removeCallbacks(this.O);
                    this.m.d.post(this.O);
                    X();
                }
            }
        }
    }

    final void K(bo boVar, boolean z) {
        if (z && (this.m == null || this.y)) {
            return;
        }
        av(z);
        w wVar = this.e;
        if (wVar != null) {
            wVar.b = false;
            wVar.b();
            if (ac(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execSingleAction for action " + boVar);
            }
            this.e.i(false, false);
            this.e.g(this.L, this.M);
            ArrayList arrayList = this.e.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = ((cb) arrayList.get(i)).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.e = null;
        }
        boVar.g(this.L, this.M);
        this.C = true;
        try {
            ay(this.L, this.M);
            at();
            X();
            au();
            this.b.i();
        } catch (Throwable th) {
            at();
            throw th;
        }
    }

    final void L(Fragment fragment) {
        if (ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        az(fragment);
    }

    final void M(int i, boolean z) {
        bg bgVar;
        if (this.m == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.l) {
            this.l = i;
            bz bzVar = this.b;
            ArrayList arrayList = bzVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                by byVar = (by) bzVar.b.get(((Fragment) arrayList.get(i2)).mWho);
                if (byVar != null) {
                    byVar.e();
                }
            }
            for (by byVar2 : bzVar.b.values()) {
                if (byVar2 != null) {
                    byVar2.e();
                    Fragment fragment = byVar2.a;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !bzVar.c.containsKey(fragment.mWho)) {
                            bzVar.a(fragment.mWho, byVar2.a());
                        }
                        bzVar.k(byVar2);
                    }
                }
            }
            aA();
            if (this.v && (bgVar = this.m) != null && this.l == 7) {
                bgVar.j();
                this.v = false;
            }
        }
    }

    public final void N() {
        if (this.m == null) {
            return;
        }
        this.w = false;
        this.x = false;
        this.z.g = false;
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void O(FragmentContainerView fragmentContainerView) {
        View view;
        for (by byVar : this.b.e()) {
            Fragment fragment = byVar.a;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                byVar.b();
                byVar.e();
            }
        }
    }

    public final void P(by byVar) {
        Fragment fragment = byVar.a;
        if (fragment.mDeferStart) {
            if (this.C) {
                this.K = true;
            } else {
                fragment.mDeferStart = false;
                byVar.e();
            }
        }
    }

    public final void Q() {
        J(new bp(this, null, -1, 0), false);
    }

    final void R(Fragment fragment) {
        if (ac(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.b.l(fragment);
        if (aj(fragment)) {
            this.v = true;
        }
        fragment.mRemoving = true;
        az(fragment);
    }

    public final void S(Parcelable parcelable) {
        by byVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.m.c.getClassLoader());
                this.E.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.m.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        bz bzVar = this.b;
        HashMap map2 = bzVar.c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState != null) {
            bzVar.b.clear();
            ArrayList arrayList = fragmentManagerState.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Bundle bundleA = bzVar.a((String) arrayList.get(i), null);
                if (bundleA != null) {
                    Fragment fragment = (Fragment) this.z.b.get(((FragmentState) bundleA.getParcelable("state")).b);
                    if (fragment != null) {
                        if (ac(2)) {
                            Objects.toString(fragment);
                            Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(fragment.toString()));
                        }
                        byVar = new by(this.B, bzVar, fragment, bundleA);
                    } else {
                        byVar = new by(this.B, bzVar, this.m.c.getClassLoader(), i(), bundleA);
                    }
                    Fragment fragment2 = byVar.a;
                    fragment2.mSavedFragmentState = bundleA;
                    fragment2.mFragmentManager = this;
                    if (ac(2)) {
                        Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                    }
                    byVar.f(this.m.c.getClassLoader());
                    bzVar.j(byVar);
                    byVar.b = this.l;
                }
            }
            for (Fragment fragment3 : new ArrayList(this.z.b.values())) {
                if (!bzVar.m(fragment3.mWho)) {
                    if (ac(2)) {
                        Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                    }
                    this.z.e(fragment3);
                    fragment3.mFragmentManager = this;
                    by byVar2 = new by(this.B, bzVar, fragment3);
                    byVar2.b = 1;
                    byVar2.e();
                    fragment3.mRemoving = true;
                    byVar2.e();
                }
            }
            ArrayList<String> arrayList2 = fragmentManagerState.b;
            bzVar.a.clear();
            if (arrayList2 != null) {
                for (String str3 : arrayList2) {
                    Fragment fragmentB = bzVar.b(str3);
                    if (fragmentB == null) {
                        throw new IllegalStateException(a.bq(str3, "No instantiated fragment for (", ")"));
                    }
                    if (ac(2)) {
                        Log.v("FragmentManager", a.by(fragmentB, str3, "restoreSaveState: added (", "): "));
                    }
                    bzVar.h(fragmentB);
                }
            }
            BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
            if (backStackRecordStateArr != null) {
                this.c = new ArrayList(backStackRecordStateArr.length);
                int i2 = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.c;
                    if (i2 >= backStackRecordStateArr2.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr2[i2];
                    w wVar = new w(this);
                    backStackRecordState.a(wVar);
                    wVar.c = backStackRecordState.g;
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList3 = backStackRecordState.b;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        String str4 = (String) arrayList3.get(i3);
                        if (str4 != null) {
                            ((cb) wVar.e.get(i3)).b = d(str4);
                        }
                        i3++;
                    }
                    wVar.a(1);
                    if (ac(2)) {
                        Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + wVar.c + "): " + wVar);
                        PrintWriter printWriter = new PrintWriter(new cm());
                        wVar.f("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.c.add(wVar);
                    i2++;
                }
            } else {
                this.c = new ArrayList();
            }
            this.h.set(fragmentManagerState.d);
            String str5 = fragmentManagerState.e;
            if (str5 != null) {
                Fragment fragmentD = d(str5);
                this.p = fragmentD;
                A(fragmentD);
            }
            ArrayList arrayList4 = fragmentManagerState.f;
            if (arrayList4 != null) {
                for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                    this.i.put((String) arrayList4.get(i4), (BackStackState) fragmentManagerState.g.get(i4));
                }
            }
            this.u = new ArrayDeque(fragmentManagerState.h);
        }
    }

    final void T(Fragment fragment, boolean z) {
        ViewGroup viewGroupAq = aq(fragment);
        if (viewGroupAq == null || !(viewGroupAq instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupAq).a = !z;
    }

    final void U(Fragment fragment, eps epsVar) {
        if (!fragment.equals(d(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            throw new IllegalArgumentException(a.bt(this, fragment, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        fragment.mMaxState = epsVar;
    }

    final void V(Fragment fragment) {
        if (fragment != null && (!fragment.equals(d(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            throw new IllegalArgumentException(a.bt(this, fragment, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        Fragment fragment2 = this.p;
        this.p = fragment;
        A(fragment2);
        A(this.p);
    }

    public final void W(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new cm());
        bg bgVar = this.m;
        if (bgVar != null) {
            try {
                bgVar.q(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            H("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void X() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.g.f(true);
                if (ac(3)) {
                    Log.d("FragmentManager", a.bm(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = b() > 0 && ae(this.o);
            if (ac(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.g.f(z);
        }
    }

    public final boolean Y(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z(Menu menu, MenuInflater menuInflater) {
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.b.g()) {
            if (fragment != null && ak(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.D != null) {
            for (int i = 0; i < this.D.size(); i++) {
                Fragment fragment2 = (Fragment) this.D.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.D = arrayList;
        return z;
    }

    public final int a(String str, int i, boolean z) {
        if (this.c.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.c.size() - 1;
        }
        int size = this.c.size() - 1;
        while (size >= 0) {
            w wVar = (w) this.c.get(size);
            if ((str != null && str.equals(wVar.m)) || (i >= 0 && i == wVar.c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.c.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i2 = size - 1;
            w wVar2 = (w) this.c.get(i2);
            if ((str == null || !str.equals(wVar2.m)) && (i < 0 || i != wVar2.c)) {
                break;
            }
            size = i2;
        }
        return size;
    }

    public final boolean aa(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean ab(Menu menu) {
        boolean z = false;
        if (this.l <= 0) {
            return false;
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null && ak(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean ad() {
        Fragment fragment = this.o;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && fragment.getParentFragmentManager().ad();
    }

    public final boolean ae(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        bt btVar = fragment.mFragmentManager;
        return fragment.equals(btVar.p) && ae(btVar.o);
    }

    public final boolean af() {
        return this.w || this.x;
    }

    final boolean ag(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iA = a(str, i, 1 == i2);
        if (iA < 0) {
            return false;
        }
        int size = this.c.size();
        while (true) {
            size--;
            if (size < iA) {
                return true;
            }
            arrayList.add((w) this.c.remove(size));
            arrayList2.add(true);
        }
    }

    public final void ah() {
        an(true);
        ax();
    }

    public final void al(String str) {
        J(new bp(this, str, -1, 1), false);
    }

    public final void an(boolean z) {
        w wVar;
        av(z);
        if (!this.f && (wVar = this.e) != null) {
            wVar.b = false;
            wVar.b();
            if (ac(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.e + " as part of execPendingActions for actions " + this.a);
            }
            this.e.i(false, false);
            this.a.add(0, this.e);
            ArrayList arrayList = this.e.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = ((cb) arrayList.get(i)).b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.e = null;
        }
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            ArrayList arrayList4 = this.a;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zG = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zG |= ((bo) arrayList4.get(i2)).g(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.m.d.removeCallbacks(this.O);
                    if (!zG) {
                        break;
                    }
                    this.C = true;
                    try {
                        ay(this.L, this.M);
                    } finally {
                        at();
                    }
                } catch (Throwable th) {
                    this.a.clear();
                    this.m.d.removeCallbacks(this.O);
                    throw th;
                }
            }
        }
        X();
        au();
        this.b.i();
    }

    public final boolean ao() {
        an(false);
        av(true);
        Fragment fragment = this.p;
        if (fragment != null && fragment.getChildFragmentManager().ao()) {
            return true;
        }
        boolean zAg = ag(this.L, this.M, null, -1, 0);
        if (zAg) {
            this.C = true;
            try {
                ay(this.L, this.M);
            } finally {
                at();
            }
        }
        X();
        au();
        this.b.i();
        return zAg;
    }

    final ca ap() {
        Fragment fragment = this.o;
        return fragment != null ? fragment.mFragmentManager.ap() : this.P;
    }

    public final int b() {
        return this.c.size() + (this.e != null ? 1 : 0);
    }

    public final Bundle c() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        ax();
        I();
        an(true);
        this.w = true;
        this.z.g = true;
        bz bzVar = this.b;
        HashMap map = bzVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (by byVar : map.values()) {
            if (byVar != null) {
                Fragment fragment = byVar.a;
                bzVar.a(fragment.mWho, byVar.a());
                arrayList2.add(fragment.mWho);
                if (ac(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap map2 = bzVar.c;
        if (!map2.isEmpty()) {
            ArrayList arrayList3 = bzVar.a;
            synchronized (arrayList3) {
                backStackRecordStateArr = null;
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Fragment fragment2 = (Fragment) it.next();
                        arrayList.add(fragment2.mWho);
                        if (ac(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                        }
                    }
                }
            }
            int size = this.c.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((w) this.c.get(i));
                    if (ac(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.c.get(i));
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.h.get();
            Fragment fragment3 = this.p;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            ArrayList arrayList4 = fragmentManagerState.f;
            Map map3 = this.i;
            arrayList4.addAll(map3.keySet());
            fragmentManagerState.g.addAll(map3.values());
            fragmentManagerState.h = new ArrayList(this.u);
            bundle.putParcelable("state", fragmentManagerState);
            Map map4 = this.E;
            for (String str : map4.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str)), (Bundle) map4.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str2)), (Bundle) map2.get(str2));
            }
        } else if (ac(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final Fragment d(String str) {
        return this.b.b(str);
    }

    public final Fragment e(int i) {
        bz bzVar = this.b;
        ArrayList arrayList = bzVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (by byVar : bzVar.b.values()) {
                    if (byVar != null) {
                        Fragment fragment = byVar.a;
                        if (fragment.mFragmentId == i) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = (Fragment) arrayList.get(size);
            if (fragment2 != null && fragment2.mFragmentId == i) {
                return fragment2;
            }
        }
    }

    public final Fragment f(String str) {
        bz bzVar = this.b;
        ArrayList arrayList = bzVar.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                for (by byVar : bzVar.b.values()) {
                    if (byVar != null) {
                        Fragment fragment = byVar.a;
                        if (str.equals(fragment.mTag)) {
                            return fragment;
                        }
                    }
                }
                return null;
            }
            Fragment fragment2 = (Fragment) arrayList.get(size);
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
    }

    public final bf i() {
        bf bfVar = this.q;
        if (bfVar != null) {
            return bfVar;
        }
        Fragment fragment = this.o;
        return fragment != null ? fragment.mFragmentManager.i() : this.J;
    }

    final by j(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            enj.a(fragment, str);
        }
        if (ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(fragment)));
        }
        by byVarK = k(fragment);
        fragment.mFragmentManager = this;
        bz bzVar = this.b;
        bzVar.j(byVarK);
        if (!fragment.mDetached) {
            bzVar.h(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (aj(fragment)) {
                this.v = true;
            }
        }
        return byVarK;
    }

    public final by k(Fragment fragment) {
        bz bzVar = this.b;
        by byVarD = bzVar.d(fragment.mWho);
        if (byVarD != null) {
            return byVarD;
        }
        by byVar = new by(this.B, bzVar, fragment);
        byVar.f(this.m.c.getClassLoader());
        byVar.b = this.l;
        return byVar;
    }

    public final List l() {
        return this.b.g();
    }

    final Set m(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((w) arrayList.get(i)).e;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = ((cb) arrayList2.get(i3)).b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    ca caVarAp = ap();
                    caVarAp.getClass();
                    hashSet.add(ca.d(viewGroup, caVarAp));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void n(bw bwVar) {
        this.k.add(bwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(bg bgVar, be beVar, Fragment fragment) {
        bv bvVar;
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = bgVar;
        this.n = beVar;
        this.o = fragment;
        if (fragment != null) {
            n(new bl(fragment));
        } else if (bgVar instanceof bw) {
            n((bw) bgVar);
        }
        if (this.o != null) {
            X();
        }
        if (bgVar instanceof or) {
            or orVar = (or) bgVar;
            bii biiVarR = orVar.r();
            this.A = biiVarR;
            eqa eqaVar = orVar;
            if (fragment != null) {
                eqaVar = fragment;
            }
            biiVarR.x(eqaVar, this.g);
        }
        int i = 0;
        if (fragment != null) {
            bv bvVar2 = fragment.mFragmentManager.z;
            HashMap map = bvVar2.c;
            bvVar = (bv) map.get(fragment.mWho);
            if (bvVar == null) {
                bvVar = new bv(bvVar2.e);
                map.put(fragment.mWho, bvVar);
            }
            this.z = bvVar;
        } else {
            if (bgVar instanceof eru) {
                bvVar = (bv) new ers(((eru) bgVar).getViewModelStore(), bv.a).a(bv.class);
                this.z = bvVar;
            } else {
                bvVar = new bv(false);
                this.z = bvVar;
            }
            fragment = null;
        }
        bvVar.g = af();
        this.b.d = bvVar;
        Object obj = this.m;
        if ((obj instanceof fbg) && fragment == null) {
            fbe savedStateRegistry = ((fbg) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new bi(this, i));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                S(bundleA);
            }
        }
        Object obj2 = this.m;
        if (obj2 instanceof pd) {
            pc pcVarGA = ((pd) obj2).gA();
            String strConcat = fragment != null ? String.valueOf(fragment.mWho).concat(":") : "";
            ph phVar = new ph();
            bm bmVar = new bm(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.r = pcVarGA.a(strConcat2.concat("StartActivityForResult"), phVar, bmVar);
            this.s = pcVarGA.a(strConcat2.concat("StartIntentSenderForResult"), new bn(), new bm(this, 2));
            this.t = pcVarGA.a(strConcat2.concat("RequestPermissions"), new pg(), new bm(this, 1));
        }
        Object obj3 = this.m;
        if (obj3 instanceof dur) {
            ((dur) obj3).gB(this.F);
        }
        Object obj4 = this.m;
        if (obj4 instanceof dus) {
            ((dus) obj4).gE(this.G);
        }
        Object obj5 = this.m;
        if (obj5 instanceof duh) {
            ((duh) obj5).gC(this.H);
        }
        Object obj6 = this.m;
        if (obj6 instanceof dui) {
            ((dui) obj6).gD(this.I);
        }
        Object obj7 = this.m;
        if ((obj7 instanceof ead) && fragment == null) {
            ((ead) obj7).s(this.Q);
        }
    }

    final void p(Fragment fragment) {
        if (ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.b.h(fragment);
            if (ac(2)) {
                Objects.toString(fragment);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(fragment)));
            }
            if (aj(fragment)) {
                this.v = true;
            }
        }
    }

    final void q() {
        if (ac(3)) {
            w wVar = this.e;
            Objects.toString(wVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(wVar)));
        }
        w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.b = false;
            wVar2.b();
            w wVar3 = this.e;
            ag agVar = new ag(this, 13);
            if (wVar3.u == null) {
                wVar3.u = new ArrayList();
            }
            wVar3.u.add(agVar);
            this.e.i(false, true);
            this.f = true;
            ah();
            this.f = false;
            this.e = null;
        }
    }

    final void r(Fragment fragment) {
        if (ac(2)) {
            Objects.toString(fragment);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(fragment)));
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (ac(2)) {
                Objects.toString(fragment);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(fragment)));
            }
            this.b.l(fragment);
            if (aj(fragment)) {
                this.v = true;
            }
            az(fragment);
        }
    }

    public final void s() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(4);
    }

    public final void t(Configuration configuration, boolean z) {
        if (z && (this.m instanceof dur)) {
            W(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.t(configuration, true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.o;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            bg bgVar = this.m;
            if (bgVar != null) {
                sb.append(bgVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        this.w = false;
        this.x = false;
        this.z.g = false;
        F(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt.v():void");
    }

    final void w(boolean z) {
        if (z && (this.m instanceof dus)) {
            W(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.w(true);
                }
            }
        }
    }

    final void x(boolean z, boolean z2) {
        if (z2 && (this.m instanceof duh)) {
            W(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.x(z, true);
                }
            }
        }
    }

    final void y() {
        for (Fragment fragment : this.b.f()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.y();
            }
        }
    }

    public final void z(Menu menu) {
        if (this.l <= 0) {
            return;
        }
        for (Fragment fragment : this.b.g()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }
}
