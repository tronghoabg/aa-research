package android.support.v4.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.waze.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bv {
    private ar A;
    private ActivityResultLauncher D;
    private ActivityResultLauncher E;
    private ActivityResultLauncher F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private ArrayList L;
    private ArrayList M;
    private ArrayList N;
    private by O;

    /* renamed from: f, reason: collision with root package name */
    ar f200f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f203i;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f205k;
    private OnBackPressedDispatcher m;
    private ba y;
    private ay z;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f202h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ce f204j = new ce();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f195a = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private final bc f206l = new bc(this);

    /* renamed from: b, reason: collision with root package name */
    a f196b = null;

    /* renamed from: c, reason: collision with root package name */
    boolean f197c = false;
    private final OnBackPressedCallback n = new bf(this);
    private final AtomicInteger o = new AtomicInteger();
    private final Map p = DesugarCollections.synchronizedMap(new HashMap());
    private final Map q = DesugarCollections.synchronizedMap(new HashMap());
    private final Map r = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    final ArrayList f198d = new ArrayList();
    private final aw R = new aw(this);
    private final CopyOnWriteArrayList s = new CopyOnWriteArrayList();
    private final Consumer t = new as(this, 2);
    private final Consumer u = new as(this, 3);
    private final Consumer v = new as(this, 4);
    private final Consumer w = new as(this, 5);
    private final MenuProvider x = new bg(this);

    /* renamed from: e, reason: collision with root package name */
    int f199e = -1;
    private az B = null;
    private final az C = new bh(this);
    private final bi Q = new bi();

    /* renamed from: g, reason: collision with root package name */
    ArrayDeque f201g = new ArrayDeque();
    private final Runnable P = new ae(this, 7, null);

    public static boolean aM(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    static final Set aW(a aVar) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = aVar.f257e;
            if (i2 >= arrayList.size()) {
                return hashSet;
            }
            ar arVar = ((cg) arrayList.get(i2)).f247b;
            if (arVar != null && aVar.f263k) {
                hashSet.add(arVar);
            }
            i2++;
        }
    }

    static final boolean aY(ar arVar) {
        if (arVar == null) {
            return true;
        }
        return arVar.isMenuVisible();
    }

    private static final boolean bA(ar arVar) {
        if (arVar.mHasMenu && arVar.mMenuVisible) {
            return true;
        }
        boolean zBA = false;
        for (ar arVar2 : arVar.mChildFragmentManager.f204j.n()) {
            if (arVar2 != null) {
                zBA = bA(arVar2);
            }
            if (zBA) {
                return true;
            }
        }
        return false;
    }

    private final boolean bB(int i2, int i3) {
        be(false);
        br(true);
        ar arVar = this.f200f;
        if (arVar != null && i2 < 0 && arVar.getChildFragmentManager().aP()) {
            return true;
        }
        boolean zAQ = aQ(this.L, this.M, null, i2, i3);
        if (zAQ) {
            this.f203i = true;
            try {
                bu(this.L, this.M);
            } finally {
                bm();
            }
        }
        by();
        bp();
        this.f204j.q();
        return zAQ;
    }

    static final void bd(ar arVar) {
        if (aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "show: ".concat(String.valueOf(arVar)));
        }
        if (arVar.mHidden) {
            arVar.mHidden = false;
            arVar.mHiddenChanged = !arVar.mHiddenChanged;
        }
    }

    private final int bi(String str, int i2, boolean z) {
        if (this.f195a.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.f195a.size() - 1;
        }
        int size = this.f195a.size() - 1;
        while (size >= 0) {
            a aVar = (a) this.f195a.get(size);
            if ((str != null && str.equals(aVar.m)) || (i2 >= 0 && i2 == aVar.f93c)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.f195a.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            int i3 = size - 1;
            a aVar2 = (a) this.f195a.get(i3);
            if ((str == null || !str.equals(aVar2.m)) && (i2 < 0 || i2 != aVar2.f93c)) {
                break;
            }
            size = i3;
        }
        return size;
    }

    private final ViewGroup bj(ar arVar) {
        ViewGroup viewGroup = arVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (arVar.mContainerId <= 0 || !this.z.b()) {
            return null;
        }
        View viewA = this.z.a(arVar.mContainerId);
        if (viewA instanceof ViewGroup) {
            return (ViewGroup) viewA;
        }
        return null;
    }

    private final Set bk() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f204j.m().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((cd) it.next()).c().mContainer;
            if (viewGroup != null) {
                hashSet.add(a.a.M(viewGroup, aU()));
            }
        }
        return hashSet;
    }

    private final void bl() {
        if (aO()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void bm() {
        this.f203i = false;
        this.M.clear();
        this.L.clear();
    }

    private final void bn(ar arVar) {
        if (arVar == null || !arVar.equals(e(arVar.mWho))) {
            return;
        }
        arVar.performPrimaryNavigationFragmentChanged();
    }

    private final void bo(int i2) {
        try {
            this.f203i = true;
            this.f204j.r(i2);
            ar(i2, false);
            Iterator it = bk().iterator();
            while (it.hasNext()) {
                ((da) it.next()).m();
            }
            this.f203i = false;
            be(true);
        } catch (Throwable th) {
            this.f203i = false;
            throw th;
        }
    }

    private final void bp() {
        if (this.K) {
            this.K = false;
            bw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bq() {
        Iterator it = bk().iterator();
        while (it.hasNext()) {
            ((da) it.next()).m();
        }
    }

    private final void br(boolean z) {
        if (this.f203i) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.y == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.y.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            bl();
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
    private final void bs(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.bv.bs(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void bt() {
        Iterator it = bk().iterator();
        while (it.hasNext()) {
            ((da) it.next()).n();
        }
    }

    private final void bu(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((a) arrayList.get(i2)).t) {
                if (i3 != i2) {
                    bs(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((a) arrayList.get(i3)).t) {
                        i3++;
                    }
                }
                bs(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            bs(arrayList, arrayList2, i3, size);
        }
    }

    private final void bv(ar arVar) {
        ViewGroup viewGroupBj = bj(arVar);
        if (viewGroupBj == null || arVar.getEnterAnim() + arVar.getExitAnim() + arVar.getPopEnterAnim() + arVar.getPopExitAnim() <= 0) {
            return;
        }
        if (viewGroupBj.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupBj.setTag(R.id.visible_removing_fragment_view_tag, arVar);
        }
        ((ar) viewGroupBj.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(arVar.getPopDirection());
    }

    private final void bw() {
        Iterator it = this.f204j.m().iterator();
        while (it.hasNext()) {
            au((cd) it.next());
        }
    }

    private final void bx(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new cs());
        ba baVar = this.y;
        if (baVar != null) {
            try {
                baVar.g(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            ae("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private final void by() {
        ArrayList arrayList = this.f202h;
        synchronized (arrayList) {
            if (!arrayList.isEmpty()) {
                this.n.setEnabled(true);
                if (aM(3)) {
                    Log.d("FragmentManager", k.e(this, "FragmentManager ", " enabling OnBackPressedCallback, caused by non-empty pending actions"));
                }
                return;
            }
            boolean z = b() > 0 && aN(this.A);
            if (aM(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            this.n.setEnabled(z);
        }
    }

    private final boolean bz() {
        ar arVar = this.A;
        if (arVar == null) {
            return true;
        }
        return arVar.isAdded() && arVar.getParentFragmentManager().bz();
    }

    public static ar f(View view) {
        ar arVarJ = j(view);
        if (arVarJ != null) {
            return arVarJ;
        }
        throw new IllegalStateException(k.e(view, "View ", " does not have a Fragment set"));
    }

    static ar j(View view) {
        while (view != null) {
            ar arVarM = m(view);
            if (arVarM != null) {
                return arVarM;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    static ar m(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ar) {
            return (ar) tag;
        }
        return null;
    }

    public static bv q(View view) {
        av avVar;
        ar arVarJ = j(view);
        if (arVarJ != null) {
            if (arVarJ.isAdded()) {
                return arVarJ.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + arVarJ + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                avVar = null;
                break;
            }
            if (context instanceof av) {
                avVar = (av) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (avVar != null) {
            return avVar.bv();
        }
        throw new IllegalStateException(k.e(view, "View ", " is not within a subclass of FragmentActivity."));
    }

    final Set A(ArrayList arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            ArrayList arrayList2 = ((a) arrayList.get(i2)).f257e;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                ar arVar = ((cg) arrayList2.get(i4)).f247b;
                if (arVar != null && (viewGroup = arVar.mContainer) != null) {
                    hashSet.add(da.b(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final void C(bz bzVar) {
        this.s.add(bzVar);
    }

    public final void D(bq bqVar) {
        this.f198d.add(bqVar);
    }

    final void E(ar arVar) {
        this.O.f(arVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void F(ba baVar, ay ayVar, ar arVar) {
        by byVar;
        if (this.y != null) {
            throw new IllegalStateException("Already attached");
        }
        this.y = baVar;
        this.z = ayVar;
        this.A = arVar;
        if (arVar != null) {
            C(new bk(arVar));
        } else if (baVar instanceof bz) {
            C((bz) baVar);
        }
        if (this.A != null) {
            by();
        }
        if (baVar instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) baVar;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.m = onBackPressedDispatcher;
            LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (arVar != null) {
                lifecycleOwner = arVar;
            }
            onBackPressedDispatcher.addCallback(lifecycleOwner, this.n);
        }
        int i2 = 0;
        if (arVar != null) {
            byVar = arVar.mFragmentManager.O.b(arVar);
            this.O = byVar;
        } else {
            if (baVar instanceof ViewModelStoreOwner) {
                byVar = by.c(((ViewModelStoreOwner) baVar).getViewModelStore());
                this.O = byVar;
            } else {
                byVar = new by(false);
                this.O = byVar;
            }
            arVar = null;
        }
        byVar.j(aO());
        this.f204j.A(this.O);
        Object obj = this.y;
        if ((obj instanceof SavedStateRegistryOwner) && arVar == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new be(this, i2));
            Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (bundleConsumeRestoredStateForKey != null) {
                az(bundleConsumeRestoredStateForKey);
            }
        }
        Object obj2 = this.y;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strConcat = arVar != null ? String.valueOf(arVar.mWho).concat(":") : "";
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            bl blVar = new bl(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.D = activityResultRegistry.register(strConcat2.concat("StartActivityForResult"), startActivityForResult, blVar);
            this.E = activityResultRegistry.register(strConcat2.concat("StartIntentSenderForResult"), new bn(), new bl(this, 2));
            this.F = activityResultRegistry.register(strConcat2.concat("RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new bl(this, 1));
        }
        Object obj3 = this.y;
        if (obj3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.t);
        }
        Object obj4 = this.y;
        if (obj4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.u);
        }
        Object obj5 = this.y;
        if (obj5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.v);
        }
        Object obj6 = this.y;
        if (obj6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.w);
        }
        Object obj7 = this.y;
        if ((obj7 instanceof MenuHost) && arVar == null) {
            ((MenuHost) obj7).addMenuProvider(this.x);
        }
    }

    final void G(ar arVar) {
        if (aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "attach: ".concat(String.valueOf(arVar)));
        }
        if (arVar.mDetached) {
            arVar.mDetached = false;
            if (arVar.mAdded) {
                return;
            }
            this.f204j.p(arVar);
            if (aM(2)) {
                Objects.toString(arVar);
                Log.v("FragmentManager", "add from attach: ".concat(String.valueOf(arVar)));
            }
            if (bA(arVar)) {
                this.G = true;
            }
        }
    }

    final void H() {
        if (aM(3)) {
            a aVar = this.f196b;
            Objects.toString(aVar);
            Log.d("FragmentManager", "cancelBackStackTransition for transition ".concat(String.valueOf(aVar)));
        }
        a aVar2 = this.f196b;
        if (aVar2 != null) {
            aVar2.f92b = false;
            aVar2.e();
            a aVar3 = this.f196b;
            ae aeVar = new ae(this, 6);
            if (aVar3.u == null) {
                aVar3.u = new ArrayList();
            }
            aVar3.u.add(aeVar);
            this.f196b.a();
            this.f197c = true;
            aV();
            this.f197c = false;
            this.f196b = null;
        }
    }

    public final void I(String str) {
        af(new bu(this, str, 1), false);
    }

    public final void J(String str) {
        this.q.remove(str);
        if (aM(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key ".concat(String.valueOf(str)));
        }
    }

    public final void K(String str) {
        bp bpVar = (bp) this.r.remove(str);
        if (bpVar != null) {
            bpVar.a();
        }
        if (aM(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key ".concat(String.valueOf(str)));
        }
    }

    final void L(ar arVar) {
        if (aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "detach: ".concat(String.valueOf(arVar)));
        }
        if (arVar.mDetached) {
            return;
        }
        arVar.mDetached = true;
        if (arVar.mAdded) {
            if (aM(2)) {
                Objects.toString(arVar);
                Log.v("FragmentManager", "remove from detach: ".concat(String.valueOf(arVar)));
            }
            this.f204j.w(arVar);
            if (bA(arVar)) {
                this.G = true;
            }
            bv(arVar);
        }
    }

    final void M() {
        this.H = false;
        this.I = false;
        this.O.j(false);
        bo(4);
    }

    final void N() {
        this.H = false;
        this.I = false;
        this.O.j(false);
        bo(0);
    }

    final void O(Configuration configuration, boolean z) {
        if (z && (this.y instanceof OnConfigurationChangedProvider)) {
            bx(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.performConfigurationChanged(configuration);
                if (z) {
                    arVar.mChildFragmentManager.O(configuration, true);
                }
            }
        }
    }

    final void P() {
        this.H = false;
        this.I = false;
        this.O.j(false);
        bo(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void Q() {
        /*
            r5 = this;
            r0 = 1
            r5.J = r0
            r5.be(r0)
            r5.bq()
            android.support.v4.app.ba r1 = r5.y
            boolean r2 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r2 == 0) goto L1a
            android.support.v4.app.ce r0 = r5.f204j
            android.support.v4.app.by r0 = r0.h()
            boolean r0 = r0.k()
            goto L2f
        L1a:
            android.content.Context r1 = r1.i()
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L31
            android.support.v4.app.ba r1 = r5.y
            android.content.Context r1 = r1.i()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            r0 = r0 ^ r1
        L2f:
            if (r0 == 0) goto L64
        L31:
            java.util.Map r0 = r5.p
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r0.next()
            android.support.v4.app.d r1 = (android.support.v4.app.d) r1
            java.util.List r1 = r1.f319a
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.support.v4.app.ce r3 = r5.f204j
            android.support.v4.app.by r3 = r3.h()
            r4 = 0
            r3.h(r2, r4)
            goto L4d
        L64:
            r0 = -1
            r5.bo(r0)
            android.support.v4.app.ba r0 = r5.y
            boolean r1 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r1 == 0) goto L75
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.core.util.Consumer r1 = r5.u
            r0.removeOnTrimMemoryListener(r1)
        L75:
            android.support.v4.app.ba r0 = r5.y
            boolean r1 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r1 == 0) goto L82
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.core.util.Consumer r1 = r5.t
            r0.removeOnConfigurationChangedListener(r1)
        L82:
            android.support.v4.app.ba r0 = r5.y
            boolean r1 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r1 == 0) goto L8f
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.core.util.Consumer r1 = r5.v
            r0.removeOnMultiWindowModeChangedListener(r1)
        L8f:
            android.support.v4.app.ba r0 = r5.y
            boolean r1 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r1 == 0) goto L9c
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.core.util.Consumer r1 = r5.w
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L9c:
            android.support.v4.app.ba r0 = r5.y
            boolean r1 = r0 instanceof androidx.core.view.MenuHost
            if (r1 == 0) goto Lad
            android.support.v4.app.ar r1 = r5.A
            if (r1 != 0) goto Lad
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r5.x
            r0.removeMenuProvider(r1)
        Lad:
            r0 = 0
            r5.y = r0
            r5.z = r0
            r5.A = r0
            androidx.activity.OnBackPressedDispatcher r1 = r5.m
            if (r1 == 0) goto Lbf
            androidx.activity.OnBackPressedCallback r1 = r5.n
            r1.remove()
            r5.m = r0
        Lbf:
            androidx.activity.result.ActivityResultLauncher r0 = r5.D
            if (r0 == 0) goto Ld0
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher r0 = r5.E
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher r5 = r5.F
            r5.unregister()
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.bv.Q():void");
    }

    final void R() {
        bo(1);
    }

    final void S(boolean z) {
        if (z && (this.y instanceof OnTrimMemoryProvider)) {
            bx(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.performLowMemory();
                if (z) {
                    arVar.mChildFragmentManager.S(true);
                }
            }
        }
    }

    final void T(boolean z, boolean z2) {
        if (z2 && (this.y instanceof OnMultiWindowModeChangedProvider)) {
            bx(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.performMultiWindowModeChanged(z);
                if (z2) {
                    arVar.mChildFragmentManager.T(z, true);
                }
            }
        }
    }

    final void U(ar arVar) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((bz) it.next()).onAttachFragment(this, arVar);
        }
    }

    final void V() {
        for (ar arVar : this.f204j.n()) {
            if (arVar != null) {
                arVar.onHiddenChanged(arVar.isHidden());
                arVar.mChildFragmentManager.V();
            }
        }
    }

    final void W(Menu menu) {
        if (this.f199e <= 0) {
            return;
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.performOptionsMenuClosed(menu);
            }
        }
    }

    final void X() {
        if (this.f196b != null) {
            H();
        }
        bo(5);
    }

    final void Y(boolean z, boolean z2) {
        if (z2 && (this.y instanceof OnPictureInPictureModeChangedProvider)) {
            bx(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    arVar.mChildFragmentManager.Y(z, true);
                }
            }
        }
    }

    final void Z() {
        by();
        bn(this.f200f);
    }

    final int a() {
        return this.o.getAndIncrement();
    }

    public final void aA(String str) {
        af(new bu(this, str, 2), false);
    }

    final void aB(ar arVar, boolean z) {
        ViewGroup viewGroupBj = bj(arVar);
        if (viewGroupBj == null || !(viewGroupBj instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupBj).a(!z);
    }

    public final void aC(az azVar) {
        this.B = azVar;
    }

    public final void aD(String str, Bundle bundle) {
        bp bpVar = (bp) this.r.get(str);
        if (bpVar == null || !bpVar.b(Lifecycle.State.STARTED)) {
            this.q.put(str, bundle);
        } else {
            bpVar.onFragmentResult(str, bundle);
        }
        if (aM(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    public final void aE(String str, LifecycleOwner lifecycleOwner, ca caVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        bj bjVar = new bj(this, str, caVar, lifecycle);
        bp bpVar = (bp) this.r.put(str, new bp(lifecycle, caVar, bjVar));
        if (bpVar != null) {
            bpVar.a();
        }
        if (aM(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + caVar);
        }
        lifecycle.addObserver(bjVar);
    }

    final void aF(ar arVar, Lifecycle.State state) {
        if (!arVar.equals(e(arVar.mWho)) || (arVar.mHost != null && arVar.mFragmentManager != this)) {
            throw new IllegalArgumentException(k.f(this, arVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        arVar.mMaxState = state;
    }

    final void aG(ar arVar) {
        if (arVar != null && (!arVar.equals(e(arVar.mWho)) || (arVar.mHost != null && arVar.mFragmentManager != this))) {
            throw new IllegalArgumentException(k.f(this, arVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ar arVar2 = this.f200f;
        this.f200f = arVar;
        bn(arVar2);
        bn(this.f200f);
    }

    final boolean aH(MenuItem menuItem) {
        if (this.f199e <= 0) {
            return false;
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null && arVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean aI(Menu menu, MenuInflater menuInflater) {
        if (this.f199e <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ar arVar : this.f204j.o()) {
            if (arVar != null && aY(arVar) && arVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(arVar);
                z = true;
            }
        }
        if (this.f205k != null) {
            for (int i2 = 0; i2 < this.f205k.size(); i2++) {
                ar arVar2 = (ar) this.f205k.get(i2);
                if (arrayList == null || !arrayList.contains(arVar2)) {
                    arVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f205k = arrayList;
        return z;
    }

    final boolean aJ(MenuItem menuItem) {
        if (this.f199e <= 0) {
            return false;
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null && arVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean aK(Menu menu) {
        boolean z = false;
        if (this.f199e <= 0) {
            return false;
        }
        for (ar arVar : this.f204j.o()) {
            if (arVar != null && aY(arVar) && arVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean aL() {
        return this.J;
    }

    final boolean aN(ar arVar) {
        if (arVar == null) {
            return true;
        }
        bv bvVar = arVar.mFragmentManager;
        return arVar.equals(bvVar.f200f) && aN(bvVar.A);
    }

    public final boolean aO() {
        return this.H || this.I;
    }

    public final boolean aP() {
        return bB(-1, 0);
    }

    final boolean aQ(ArrayList arrayList, ArrayList arrayList2, String str, int i2, int i3) {
        int iBi = bi(str, i2, 1 == i3);
        if (iBi < 0) {
            return false;
        }
        int size = this.f195a.size();
        while (true) {
            size--;
            if (size < iBi) {
                return true;
            }
            arrayList.add((a) this.f195a.remove(size));
            arrayList2.add(true);
        }
    }

    final boolean aR(ArrayList arrayList, ArrayList arrayList2) {
        if (aM(2)) {
            ArrayList arrayList3 = this.f202h;
            Objects.toString(arrayList3);
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: ".concat(arrayList3.toString()));
        }
        if (this.f195a.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        a aVar = (a) this.f195a.get(r0.size() - 1);
        this.f196b = aVar;
        ArrayList arrayList4 = aVar.f257e;
        int size = arrayList4.size();
        for (int i2 = 0; i2 < size; i2++) {
            ar arVar = ((cg) arrayList4.get(i2)).f247b;
            if (arVar != null) {
                arVar.mTransitioning = true;
            }
        }
        return aQ(arrayList, arrayList2, null, -1, 0);
    }

    final boolean aS(ArrayList arrayList, ArrayList arrayList2, String str) {
        d dVar = (d) this.p.remove(str);
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = (a) arrayList.get(i2);
            if (aVar.f94d) {
                ArrayList arrayList3 = aVar.f257e;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ar arVar = ((cg) arrayList3.get(i3)).f247b;
                    if (arVar != null) {
                        map.put(arVar.mWho, arVar);
                    }
                }
            }
        }
        List<String> list = dVar.f319a;
        HashMap map2 = new HashMap(list.size());
        for (String str2 : list) {
            ar arVar2 = (ar) map.get(str2);
            if (arVar2 != null) {
                map2.put(arVar2.mWho, arVar2);
            } else {
                Bundle bundleC = this.f204j.c(str2, null);
                if (bundleC != null) {
                    ClassLoader classLoader = this.y.i().getClassLoader();
                    ar arVarA = ((cb) bundleC.getParcelable("state")).a(o(), classLoader);
                    arVarA.mSavedFragmentState = bundleC;
                    if (arVarA.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                        arVarA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    Bundle bundle = bundleC.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    arVarA.setArguments(bundle);
                    map2.put(arVarA.mWho, arVarA);
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it = dVar.f320b.iterator();
        while (it.hasNext()) {
            arrayList4.add(((b) it.next()).b(this, map2));
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).k(arrayList, arrayList2);
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean aT(java.util.ArrayList r20, java.util.ArrayList r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.bv.aT(java.util.ArrayList, java.util.ArrayList, java.lang.String):boolean");
    }

    final bi aU() {
        ar arVar = this.A;
        return arVar != null ? arVar.mFragmentManager.aU() : this.Q;
    }

    public final void aV() {
        be(true);
        bt();
    }

    public final bm aX() {
        if (this.f195a.size() != 0) {
            return (bm) this.f195a.get(0);
        }
        a aVar = this.f196b;
        if (aVar != null) {
            return aVar;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void aZ(int i2) {
        ba(i2, false);
    }

    final void aa() {
        this.H = false;
        this.I = false;
        this.O.j(false);
        bo(7);
    }

    final void ab() {
        this.H = false;
        this.I = false;
        this.O.j(false);
        bo(5);
    }

    final void ac() {
        this.I = true;
        this.O.j(true);
        bo(4);
    }

    final void ad() {
        bo(2);
    }

    public final void ae(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        this.f204j.s(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f205k;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ar arVar = (ar) this.f205k.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(arVar.toString());
            }
        }
        int size2 = this.f195a.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                String strValueOf = String.valueOf(str);
                a aVar = (a) this.f195a.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.i(strValueOf.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.o.get());
        ArrayList arrayList2 = this.f202h;
        synchronized (arrayList2) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    br brVar = (br) arrayList2.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(brVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.y);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.z);
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.A);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f199e);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    final void af(br brVar, boolean z) {
        if (!z) {
            if (this.y == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            bl();
        }
        ArrayList arrayList = this.f202h;
        synchronized (arrayList) {
            if (this.y == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            arrayList.add(brVar);
            synchronized (arrayList) {
                if (arrayList.size() == 1) {
                    this.y.j().removeCallbacks(this.P);
                    this.y.j().post(this.P);
                    by();
                }
            }
        }
    }

    final void ag(br brVar, boolean z) {
        if (z && (this.y == null || this.J)) {
            return;
        }
        br(z);
        a aVar = this.f196b;
        if (aVar != null) {
            aVar.f92b = false;
            aVar.e();
            if (aM(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f196b + " as part of execSingleAction for action " + brVar);
            }
            this.f196b.b(false, false);
            this.f196b.k(this.L, this.M);
            ArrayList arrayList = this.f196b.f257e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ar arVar = ((cg) arrayList.get(i2)).f247b;
                if (arVar != null) {
                    arVar.mTransitioning = false;
                }
            }
            this.f196b = null;
        }
        brVar.k(this.L, this.M);
        this.f203i = true;
        try {
            bu(this.L, this.M);
            bm();
            by();
            bp();
            this.f204j.q();
        } catch (Throwable th) {
            bm();
            throw th;
        }
    }

    final void ah() {
        int i2;
        this.f197c = true;
        be(true);
        this.f197c = false;
        if (this.f196b == null) {
            if (this.n.isEnabled()) {
                if (aM(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                aP();
                return;
            } else {
                if (aM(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.m.onBackPressed();
                return;
            }
        }
        if (!this.f198d.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(aW(this.f196b));
            ArrayList arrayList = this.f198d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                bq bqVar = (bq) arrayList.get(i3);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i2 = i3 + 1;
                    if (it.hasNext()) {
                        bqVar.onBackStackChangeCommitted((ar) it.next(), true);
                    }
                }
                i3 = i2;
            }
        }
        ArrayList arrayList2 = this.f196b.f257e;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ar arVar = ((cg) arrayList2.get(i4)).f247b;
            if (arVar != null) {
                arVar.mTransitioning = false;
            }
        }
        Iterator it2 = A(new ArrayList(Collections.singletonList(this.f196b)), 0, 1).iterator();
        while (it2.hasNext()) {
            ((da) it2.next()).g();
        }
        ArrayList arrayList3 = this.f196b.f257e;
        int size3 = arrayList3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            ar arVar2 = ((cg) arrayList3.get(i5)).f247b;
            if (arVar2 != null && arVar2.mContainer == null) {
                s(arVar2).g();
            }
        }
        this.f196b = null;
        by();
        if (aM(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.n.isEnabled() + " for  FragmentManager " + this);
        }
    }

    final void ai(ar arVar) {
        if (aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "hide: ".concat(String.valueOf(arVar)));
        }
        if (arVar.mHidden) {
            return;
        }
        arVar.mHidden = true;
        arVar.mHiddenChanged = true ^ arVar.mHiddenChanged;
        bv(arVar);
    }

    final void aj(ar arVar) {
        if (arVar.mAdded && bA(arVar)) {
            this.G = true;
        }
    }

    final /* synthetic */ void ak(Configuration configuration) {
        if (bz()) {
            O(configuration, false);
        }
    }

    final /* synthetic */ void al(Integer num) {
        if (bz() && num.intValue() == 80) {
            S(false);
        }
    }

    final /* synthetic */ void am(MultiWindowModeChangedInfo multiWindowModeChangedInfo) {
        if (bz()) {
            T(multiWindowModeChangedInfo.isInMultiWindowMode(), false);
        }
    }

    final /* synthetic */ void an(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo) {
        if (bz()) {
            Y(pictureInPictureModeChangedInfo.isInPictureInPictureMode(), false);
        }
    }

    final void ao(ar arVar, String[] strArr, int i2) {
        if (this.F == null) {
            h.g.b.x.f(arVar, "fragment");
            h.g.b.x.f(strArr, "permissions");
        } else {
            this.f201g.addLast(new bo(arVar.mWho, i2));
            this.F.launch(strArr);
        }
    }

    final void ap(ar arVar, Intent intent, int i2, Bundle bundle) {
        if (this.D == null) {
            this.y.l(arVar, intent, i2, bundle);
            return;
        }
        this.f201g.addLast(new bo(arVar.mWho, i2));
        if (bundle != null) {
            intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        }
        this.D.launch(intent);
    }

    final void aq(ar arVar, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (this.E == null) {
            this.y.m(arVar, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (aM(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + arVar);
            }
            intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        }
        IntentSenderRequest.Builder builder = new IntentSenderRequest.Builder(intentSender);
        builder.setFillInIntent(intent);
        builder.setFlags(i4, i3);
        IntentSenderRequest intentSenderRequestBuild = builder.build();
        this.f201g.addLast(new bo(arVar.mWho, i2));
        if (aM(2)) {
            Log.v("FragmentManager", k.e(arVar, "Fragment ", "is launching an IntentSender for result "));
        }
        this.E.launch(intentSenderRequestBuild);
    }

    final void ar(int i2, boolean z) {
        ba baVar;
        if (this.y == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f199e) {
            this.f199e = i2;
            this.f204j.v();
            bw();
            if (this.G && (baVar = this.y) != null && this.f199e == 7) {
                baVar.e();
                this.G = false;
            }
        }
    }

    final void as() {
        if (this.y == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.j(false);
        for (ar arVar : this.f204j.o()) {
            if (arVar != null) {
                arVar.noteStateNotSaved();
            }
        }
    }

    public final void at(FragmentContainerView fragmentContainerView) {
        View view;
        for (cd cdVar : this.f204j.m()) {
            ar arVarC = cdVar.c();
            if (arVarC.mContainerId == fragmentContainerView.getId() && (view = arVarC.mView) != null && view.getParent() == null) {
                arVarC.mContainer = fragmentContainerView;
                cdVar.d();
                cdVar.g();
            }
        }
    }

    final void au(cd cdVar) {
        ar arVarC = cdVar.c();
        if (arVarC.mDeferStart) {
            if (this.f203i) {
                this.K = true;
            } else {
                arVarC.mDeferStart = false;
                cdVar.g();
            }
        }
    }

    public final void av() {
        af(new bs(this, null, -1, 0), false);
    }

    final void aw(ar arVar) {
        if (aM(2)) {
            Log.v("FragmentManager", "remove: " + arVar + " nesting=" + arVar.mBackStackNesting);
        }
        boolean zIsInBackStack = arVar.isInBackStack();
        if (arVar.mDetached && zIsInBackStack) {
            return;
        }
        this.f204j.w(arVar);
        if (bA(arVar)) {
            this.G = true;
        }
        arVar.mRemoving = true;
        bv(arVar);
    }

    final void ax(ar arVar) {
        this.O.i(arVar);
    }

    public final void ay(String str) {
        af(new bu(this, str, 0), false);
    }

    final void az(Parcelable parcelable) {
        cd cdVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.y.i().getClassLoader());
                this.q.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.y.i().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        ce ceVar = this.f204j;
        ceVar.z(map);
        bw bwVar = (bw) bundle3.getParcelable("state");
        if (bwVar == null) {
            return;
        }
        ceVar.x();
        ArrayList arrayList = bwVar.f207a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Bundle bundleC = ceVar.c((String) arrayList.get(i2), null);
            if (bundleC != null) {
                ar arVarA = this.O.a(((cb) bundleC.getParcelable("state")).f224b);
                if (arVarA != null) {
                    if (aM(2)) {
                        Objects.toString(arVarA);
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained ".concat(arVarA.toString()));
                    }
                    cdVar = new cd(this.R, ceVar, arVarA, bundleC);
                } else {
                    cdVar = new cd(this.R, ceVar, this.y.i().getClassLoader(), o(), bundleC);
                }
                ar arVarC = cdVar.c();
                arVarC.mSavedFragmentState = bundleC;
                arVarC.mFragmentManager = this;
                if (aM(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + arVarC.mWho + "): " + arVarC);
                }
                cdVar.h(this.y.i().getClassLoader());
                ceVar.t(cdVar);
                cdVar.j(this.f199e);
            }
        }
        for (ar arVar : this.O.e()) {
            if (!ceVar.B(arVar.mWho)) {
                if (aM(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + arVar + " that was not found in the set of active Fragments " + bwVar.f207a);
                }
                this.O.i(arVar);
                arVar.mFragmentManager = this;
                cd cdVar2 = new cd(this.R, ceVar, arVar);
                cdVar2.j(1);
                cdVar2.g();
                arVar.mRemoving = true;
                cdVar2.g();
            }
        }
        ceVar.y(bwVar.f208b);
        b[] bVarArr = bwVar.f209c;
        if (bVarArr != null) {
            this.f195a = new ArrayList(bVarArr.length);
            int i3 = 0;
            while (true) {
                b[] bVarArr2 = bwVar.f209c;
                if (i3 >= bVarArr2.length) {
                    break;
                }
                a aVarA = bVarArr2[i3].a(this);
                if (aM(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + aVarA.f93c + "): " + aVarA);
                    PrintWriter printWriter = new PrintWriter(new cs());
                    aVarA.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.f195a.add(aVarA);
                i3++;
            }
        } else {
            this.f195a = new ArrayList();
        }
        this.o.set(bwVar.f210d);
        String str3 = bwVar.f211e;
        if (str3 != null) {
            ar arVarE = e(str3);
            this.f200f = arVarE;
            bn(arVarE);
        }
        ArrayList arrayList2 = bwVar.f212f;
        if (arrayList2 != null) {
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                this.p.put((String) arrayList2.get(i4), (d) bwVar.f213g.get(i4));
            }
        }
        this.f201g = new ArrayDeque(bwVar.f214h);
    }

    public final int b() {
        return this.f195a.size() + (this.f196b != null ? 1 : 0);
    }

    final void ba(int i2, boolean z) {
        if (i2 >= 0) {
            af(new bs(this, null, i2, 1), z);
        } else {
            throw new IllegalArgumentException("Bad id: " + i2);
        }
    }

    public final void bb(String str) {
        af(new bs(this, str, -1, 1), false);
    }

    public final void bc(int i2) {
        if (i2 >= 0) {
            bB(i2, 1);
        } else {
            throw new IllegalArgumentException("Bad id: " + i2);
        }
    }

    final void be(boolean z) {
        a aVar;
        br(z);
        if (!this.f197c && (aVar = this.f196b) != null) {
            aVar.f92b = false;
            aVar.e();
            if (aM(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f196b + " as part of execPendingActions for actions " + this.f202h);
            }
            this.f196b.b(false, false);
            this.f202h.add(0, this.f196b);
            ArrayList arrayList = this.f196b.f257e;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ar arVar = ((cg) arrayList.get(i2)).f247b;
                if (arVar != null) {
                    arVar.mTransitioning = false;
                }
            }
            this.f196b = null;
        }
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            ArrayList arrayList4 = this.f202h;
            synchronized (arrayList4) {
                if (arrayList4.isEmpty()) {
                    break;
                }
                try {
                    int size2 = arrayList4.size();
                    boolean zK = false;
                    for (int i3 = 0; i3 < size2; i3++) {
                        zK |= ((br) arrayList4.get(i3)).k(arrayList2, arrayList3);
                    }
                    arrayList4.clear();
                    this.y.j().removeCallbacks(this.P);
                    if (!zK) {
                        break;
                    }
                    this.f203i = true;
                    try {
                        bu(this.L, this.M);
                    } finally {
                        bm();
                    }
                } catch (Throwable th) {
                    this.f202h.clear();
                    this.y.j().removeCallbacks(this.P);
                    throw th;
                }
            }
        }
        by();
        bp();
        this.f204j.q();
    }

    final aw bf() {
        return this.R;
    }

    public final void bg(android.support.a.i iVar) {
        this.R.o(iVar);
    }

    public final void bh(android.support.a.i iVar) {
        this.R.p(iVar);
    }

    final Bundle c() {
        b[] bVarArr;
        Bundle bundle = new Bundle();
        bt();
        bq();
        be(true);
        this.H = true;
        this.O.j(true);
        ce ceVar = this.f204j;
        ArrayList arrayListJ = ceVar.j();
        HashMap mapL = ceVar.l();
        if (!mapL.isEmpty()) {
            ArrayList arrayListK = ceVar.k();
            int size = this.f195a.size();
            if (size > 0) {
                bVarArr = new b[size];
                for (int i2 = 0; i2 < size; i2++) {
                    bVarArr[i2] = new b((a) this.f195a.get(i2));
                    if (aM(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f195a.get(i2));
                    }
                }
            } else {
                bVarArr = null;
            }
            bw bwVar = new bw();
            bwVar.f207a = arrayListJ;
            bwVar.f208b = arrayListK;
            bwVar.f209c = bVarArr;
            bwVar.f210d = this.o.get();
            ar arVar = this.f200f;
            if (arVar != null) {
                bwVar.f211e = arVar.mWho;
            }
            ArrayList arrayList = bwVar.f212f;
            Map map = this.p;
            arrayList.addAll(map.keySet());
            bwVar.f213g.addAll(map.values());
            bwVar.f214h = new ArrayList(this.f201g);
            bundle.putParcelable("state", bwVar);
            Map map2 = this.q;
            for (String str : map2.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str)), (Bundle) map2.get(str));
            }
            for (String str2 : mapL.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str2)), (Bundle) mapL.get(str2));
            }
        } else if (aM(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final aq d(ar arVar) {
        cd cdVarI = this.f204j.i(arVar.mWho);
        if (cdVarI == null || !cdVarI.c().equals(arVar)) {
            bx(new IllegalStateException(k.e(arVar, "Fragment ", " is not currently in the FragmentManager")));
        }
        return cdVarI.b();
    }

    final ar e(String str) {
        return this.f204j.d(str);
    }

    public final ar g(int i2) {
        return this.f204j.e(i2);
    }

    public final ar h(String str) {
        return this.f204j.f(str);
    }

    final ar i(String str) {
        return this.f204j.g(str);
    }

    final ar k() {
        return this.A;
    }

    public final ar l() {
        return this.f200f;
    }

    final ay n() {
        return this.z;
    }

    public final az o() {
        az azVar = this.B;
        if (azVar != null) {
            return azVar;
        }
        ar arVar = this.A;
        return arVar != null ? arVar.mFragmentManager.o() : this.C;
    }

    public final ba p() {
        return this.y;
    }

    final cd r(ar arVar) {
        String str = arVar.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(arVar, str);
        }
        if (aM(2)) {
            Objects.toString(arVar);
            Log.v("FragmentManager", "add: ".concat(String.valueOf(arVar)));
        }
        cd cdVarS = s(arVar);
        arVar.mFragmentManager = this;
        ce ceVar = this.f204j;
        ceVar.t(cdVarS);
        if (!arVar.mDetached) {
            ceVar.p(arVar);
            arVar.mRemoving = false;
            if (arVar.mView == null) {
                arVar.mHiddenChanged = false;
            }
            if (bA(arVar)) {
                this.G = true;
            }
        }
        return cdVarS;
    }

    final cd s(ar arVar) {
        ce ceVar = this.f204j;
        cd cdVarI = ceVar.i(arVar.mWho);
        if (cdVarI != null) {
            return cdVarI;
        }
        cd cdVar = new cd(this.R, ceVar, arVar);
        cdVar.h(this.y.i().getClassLoader());
        cdVar.j(this.f199e);
        return cdVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ar arVar = this.A;
        if (arVar != null) {
            sb.append(arVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.A)));
            sb.append("}");
        } else {
            ba baVar = this.y;
            if (baVar != null) {
                sb.append(baVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.y)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final ch u() {
        return new a(this);
    }

    final LayoutInflater.Factory2 v() {
        return this.f206l;
    }

    final ViewModelStore w(ar arVar) {
        return this.O.d(arVar);
    }

    public final List x() {
        return this.f204j.o();
    }
}
