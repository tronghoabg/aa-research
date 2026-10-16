package androidx.fragment.app;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import Va.M6;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC1450n;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final K f18478a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f18479b;

    /* renamed from: c, reason: collision with root package name */
    public final F f18480c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18481d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18482e = -1;

    public l0(K k, m0 m0Var, F f10) {
        this.f18478a = k;
        this.f18479b = m0Var;
        this.f18480c = f10;
    }

    public final void a() {
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + f10);
        }
        Bundle bundle = f10.mSavedFragmentState;
        f10.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f18478a.a(f10, false);
    }

    public final void b() {
        F f10;
        View view;
        View view2;
        int iIndexOfChild = -1;
        F f11 = this.f18480c;
        View view3 = f11.mContainer;
        while (true) {
            f10 = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            F f12 = tag instanceof F ? (F) tag : null;
            if (f12 != null) {
                f10 = f12;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        F parentFragment = f11.getParentFragment();
        if (f10 != null && !f10.equals(parentFragment)) {
            int i5 = f11.mContainerId;
            D1.c cVar = D1.d.f2276a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(f11);
            sb2.append(" within the view of parent fragment ");
            sb2.append(f10);
            sb2.append(" via container with ID ");
            D1.d.b(new D1.a(f11, AbstractC0279p0.j(i5, " without using parent's childFragmentManager", sb2)));
            D1.d.a(f11).getClass();
        }
        m0 m0Var = this.f18479b;
        m0Var.getClass();
        ViewGroup viewGroup = f11.mContainer;
        if (viewGroup != null) {
            ArrayList arrayList = m0Var.f18496a;
            int iIndexOf = arrayList.indexOf(f11);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        F f13 = (F) arrayList.get(iIndexOf);
                        if (f13.mContainer == viewGroup && (view = f13.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    F f14 = (F) arrayList.get(i10);
                    if (f14.mContainer == viewGroup && (view2 = f14.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        f11.mContainer.addView(f11.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "moveto ATTACHED: " + f10);
        }
        F f11 = f10.mTarget;
        l0 l0Var = null;
        m0 m0Var = this.f18479b;
        if (f11 != null) {
            l0 l0Var2 = (l0) m0Var.f18497b.get(f11.mWho);
            if (l0Var2 == null) {
                throw new IllegalStateException("Fragment " + f10 + " declared target fragment " + f10.mTarget + " that does not belong to this FragmentManager!");
            }
            f10.mTargetWho = f10.mTarget.mWho;
            f10.mTarget = null;
            l0Var = l0Var2;
        } else {
            String str = f10.mTargetWho;
            if (str != null && (l0Var = (l0) m0Var.f18497b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(f10);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(wg.b.c(sb2, f10.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (l0Var != null) {
            l0Var.k();
        }
        e0 e0Var = f10.mFragmentManager;
        f10.mHost = e0Var.f18428v;
        f10.mParentFragment = e0Var.f18430x;
        K k = this.f18478a;
        k.g(f10, false);
        f10.performAttach();
        k.b(f10, false);
    }

    public final int d() {
        F f10 = this.f18480c;
        if (f10.mFragmentManager == null) {
            return f10.mState;
        }
        int iMin = this.f18482e;
        int iOrdinal = f10.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (f10.mFromLayout) {
            if (f10.mInLayout) {
                iMin = Math.max(this.f18482e, 2);
                View view = f10.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f18482e < 4 ? Math.min(iMin, f10.mState) : Math.min(iMin, 1);
            }
        }
        if (!f10.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = f10.mContainer;
        if (viewGroup != null) {
            C1426o c1426oJ = C1426o.j(viewGroup, f10.getParentFragmentManager());
            c1426oJ.getClass();
            A0 a0G = c1426oJ.g(f10);
            int i5 = a0G != null ? a0G.f18279b : 0;
            A0 a0H = c1426oJ.h(f10);
            i = a0H != null ? a0H.f18279b : 0;
            int i10 = i5 == 0 ? -1 : B0.f18294a[AbstractC0213f.f(i5)];
            if (i10 != -1 && i10 != 1) {
                i = i5;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (f10.mRemoving) {
            iMin = f10.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (f10.mDeferStart && f10.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (f10.mTransitioning && f10.mContainer != null) {
            iMin = Math.max(iMin, 3);
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + f10);
        }
        return iMin;
    }

    public final void e() {
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "moveto CREATED: " + f10);
        }
        Bundle bundle = f10.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (f10.mIsCreated) {
            f10.mState = 1;
            f10.restoreChildFragmentState();
        } else {
            K k = this.f18478a;
            k.h(f10, false);
            f10.performCreate(bundle2);
            k.c(f10, false);
        }
    }

    public final void f() throws Resources.NotFoundException {
        String resourceName;
        F f10 = this.f18480c;
        if (f10.mFromLayout) {
            return;
        }
        if (e0.J(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + f10);
        }
        Bundle bundle = f10.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = f10.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = f10.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i5 = f10.mContainerId;
            if (i5 != 0) {
                if (i5 == -1) {
                    throw new IllegalArgumentException(M6.p("Cannot create fragment ", f10, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) f10.mFragmentManager.f18429w.b(i5);
                if (viewGroup == null) {
                    if (!f10.mRestored) {
                        try {
                            resourceName = f10.getResources().getResourceName(f10.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(f10.mContainerId) + " (" + resourceName + ") for fragment " + f10);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    D1.c cVar = D1.d.f2276a;
                    D1.d.b(new D1.e(f10, viewGroup, 1));
                    D1.d.a(f10).getClass();
                }
            }
        }
        f10.mContainer = viewGroup;
        f10.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (f10.mView != null) {
            if (e0.J(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + f10);
            }
            f10.mView.setSaveFromParentEnabled(false);
            f10.mView.setTag(R.id.fragment_container_view_tag, f10);
            if (viewGroup != null) {
                b();
            }
            if (f10.mHidden) {
                f10.mView.setVisibility(8);
            }
            if (f10.mView.isAttachedToWindow()) {
                View view = f10.mView;
                WeakHashMap weakHashMap = k1.S.f38779a;
                k1.H.c(view);
            } else {
                View view2 = f10.mView;
                view2.addOnAttachStateChangeListener(new k0(view2));
            }
            f10.performViewCreated();
            this.f18478a.m(f10, f10.mView, false);
            int visibility = f10.mView.getVisibility();
            f10.setPostOnViewCreatedAlpha(f10.mView.getAlpha());
            if (f10.mContainer != null && visibility == 0) {
                View viewFindFocus = f10.mView.findFocus();
                if (viewFindFocus != null) {
                    f10.setFocusedView(viewFindFocus);
                    if (e0.J(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + f10);
                    }
                }
                f10.mView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        f10.mState = 2;
    }

    public final void g() {
        F fB;
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATED: " + f10);
        }
        boolean zIsChangingConfigurations = true;
        boolean z2 = f10.mRemoving && !f10.isInBackStack();
        m0 m0Var = this.f18479b;
        if (z2 && !f10.mBeingSaved) {
            m0Var.i(null, f10.mWho);
        }
        if (!z2) {
            h0 h0Var = m0Var.f18499d;
            if (!((h0Var.f18452b.containsKey(f10.mWho) && h0Var.f18455e) ? h0Var.f18456f : true)) {
                String str = f10.mTargetWho;
                if (str != null && (fB = m0Var.b(str)) != null && fB.mRetainInstance) {
                    f10.mTarget = fB;
                }
                f10.mState = 0;
                return;
            }
        }
        O o7 = f10.mHost;
        if (o7 instanceof androidx.lifecycle.f0) {
            zIsChangingConfigurations = m0Var.f18499d.f18456f;
        } else {
            FragmentActivity fragmentActivity = o7.f18333b;
            if (fragmentActivity instanceof Activity) {
                zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z2 && !f10.mBeingSaved) || zIsChangingConfigurations) {
            m0Var.f18499d.d(f10, false);
        }
        f10.performDestroy();
        this.f18478a.d(f10, false);
        Iterator it = m0Var.d().iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            if (l0Var != null) {
                String str2 = f10.mWho;
                F f11 = l0Var.f18480c;
                if (str2.equals(f11.mTargetWho)) {
                    f11.mTarget = f10;
                    f11.mTargetWho = null;
                }
            }
        }
        String str3 = f10.mTargetWho;
        if (str3 != null) {
            f10.mTarget = m0Var.b(str3);
        }
        m0Var.h(this);
    }

    public final void h() {
        View view;
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + f10);
        }
        ViewGroup viewGroup = f10.mContainer;
        if (viewGroup != null && (view = f10.mView) != null) {
            viewGroup.removeView(view);
        }
        f10.performDestroyView();
        this.f18478a.n(f10, false);
        f10.mContainer = null;
        f10.mView = null;
        f10.mViewLifecycleOwner = null;
        f10.mViewLifecycleOwnerLiveData.j(null);
        f10.mInLayout = false;
    }

    public final void i() {
        boolean zJ = e0.J(3);
        F f10 = this.f18480c;
        if (zJ) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + f10);
        }
        f10.performDetach();
        this.f18478a.e(f10, false);
        f10.mState = -1;
        f10.mHost = null;
        f10.mParentFragment = null;
        f10.mFragmentManager = null;
        if (!f10.mRemoving || f10.isInBackStack()) {
            h0 h0Var = this.f18479b.f18499d;
            if (!((h0Var.f18452b.containsKey(f10.mWho) && h0Var.f18455e) ? h0Var.f18456f : true)) {
                return;
            }
        }
        if (e0.J(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + f10);
        }
        f10.initState();
    }

    public final void j() {
        F f10 = this.f18480c;
        if (f10.mFromLayout && f10.mInLayout && !f10.mPerformedCreateView) {
            if (e0.J(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + f10);
            }
            Bundle bundle = f10.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            f10.performCreateView(f10.performGetLayoutInflater(bundle2), null, bundle2);
            View view = f10.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                f10.mView.setTag(R.id.fragment_container_view_tag, f10);
                if (f10.mHidden) {
                    f10.mView.setVisibility(8);
                }
                f10.performViewCreated();
                this.f18478a.m(f10, f10.mView, false);
                f10.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.k():void");
    }

    public final void l(ClassLoader classLoader) {
        F f10 = this.f18480c;
        Bundle bundle = f10.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (f10.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            f10.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            f10.mSavedViewState = f10.mSavedFragmentState.getSparseParcelableArray("viewState");
            f10.mSavedViewRegistryState = f10.mSavedFragmentState.getBundle("viewRegistryState");
            j0 j0Var = (j0) f10.mSavedFragmentState.getParcelable("state");
            if (j0Var != null) {
                f10.mTargetWho = j0Var.f18470l;
                f10.mTargetRequestCode = j0Var.f18471m;
                Boolean bool = f10.mSavedUserVisibleHint;
                if (bool != null) {
                    f10.mUserVisibleHint = bool.booleanValue();
                    f10.mSavedUserVisibleHint = null;
                } else {
                    f10.mUserVisibleHint = j0Var.f18472n;
                }
            }
            if (f10.mUserVisibleHint) {
                return;
            }
            f10.mDeferStart = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + f10, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.e0.J(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.F r2 = r6.f18480c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.e0.J(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.K r1 = r6.f18478a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.m0 r1 = r6.f18479b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l0.m():void");
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        F f10 = this.f18480c;
        if (f10.mState == -1 && (bundle = f10.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new j0(f10));
        if (f10.mState > -1) {
            Bundle bundle3 = new Bundle();
            f10.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f18478a.j(f10, bundle3, false);
            Bundle bundle4 = new Bundle();
            f10.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = f10.mChildFragmentManager.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
            }
            if (f10.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = f10.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = f10.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = f10.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        F f10 = this.f18480c;
        if (f10.mView == null) {
            return;
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + f10 + " with view " + f10.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        f10.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            f10.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        f10.mViewLifecycleOwner.f18562e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        f10.mSavedViewRegistryState = bundle;
    }

    public l0(K k, m0 m0Var, ClassLoader classLoader, W w2, Bundle bundle) {
        this.f18478a = k;
        this.f18479b = m0Var;
        j0 j0Var = (j0) bundle.getParcelable("state");
        F fInstantiate = F.instantiate(w2.f18346a.f18428v.f18333b, j0Var.f18460a, null);
        fInstantiate.mWho = j0Var.f18461b;
        fInstantiate.mFromLayout = j0Var.f18462c;
        fInstantiate.mRestored = true;
        fInstantiate.mFragmentId = j0Var.f18463d;
        fInstantiate.mContainerId = j0Var.f18464e;
        fInstantiate.mTag = j0Var.f18465f;
        fInstantiate.mRetainInstance = j0Var.f18466g;
        fInstantiate.mRemoving = j0Var.f18467h;
        fInstantiate.mDetached = j0Var.f18468i;
        fInstantiate.mHidden = j0Var.f18469j;
        fInstantiate.mMaxState = EnumC1450n.values()[j0Var.k];
        fInstantiate.mTargetWho = j0Var.f18470l;
        fInstantiate.mTargetRequestCode = j0Var.f18471m;
        fInstantiate.mUserVisibleHint = j0Var.f18472n;
        this.f18480c = fInstantiate;
        fInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fInstantiate.setArguments(bundle2);
        if (e0.J(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fInstantiate);
        }
    }

    public l0(K k, m0 m0Var, F f10, Bundle bundle) {
        this.f18478a = k;
        this.f18479b = m0Var;
        this.f18480c = f10;
        f10.mSavedViewState = null;
        f10.mSavedViewRegistryState = null;
        f10.mBackStackNesting = 0;
        f10.mInLayout = false;
        f10.mAdded = false;
        F f11 = f10.mTarget;
        f10.mTargetWho = f11 != null ? f11.mWho : null;
        f10.mTarget = null;
        f10.mSavedFragmentState = bundle;
        f10.mArguments = bundle.getBundle("arguments");
    }
}
