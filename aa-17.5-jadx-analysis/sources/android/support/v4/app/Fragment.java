package android.support.v4.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.aau;
import defpackage.af;
import defpackage.ag;
import defpackage.ap;
import defpackage.aq;
import defpackage.ar;
import defpackage.as;
import defpackage.at;
import defpackage.au;
import defpackage.av;
import defpackage.aw;
import defpackage.ax;
import defpackage.ay;
import defpackage.az;
import defpackage.bc;
import defpackage.be;
import defpackage.bf;
import defpackage.bg;
import defpackage.bt;
import defpackage.bw;
import defpackage.ca;
import defpackage.cl;
import defpackage.cq;
import defpackage.cr;
import defpackage.dun;
import defpackage.ebi;
import defpackage.enh;
import defpackage.eni;
import defpackage.enj;
import defpackage.enl;
import defpackage.enm;
import defpackage.enn;
import defpackage.enp;
import defpackage.enq;
import defpackage.enr;
import defpackage.epo;
import defpackage.epr;
import defpackage.eps;
import defpackage.ept;
import defpackage.eqa;
import defpackage.eqc;
import defpackage.eqj;
import defpackage.eqm;
import defpackage.erg;
import defpackage.erh;
import defpackage.erp;
import defpackage.erq;
import defpackage.ert;
import defpackage.eru;
import defpackage.esc;
import defpackage.ese;
import defpackage.esm;
import defpackage.esn;
import defpackage.fbe;
import defpackage.fbf;
import defpackage.fbg;
import defpackage.inp;
import defpackage.mh;
import defpackage.ny;
import defpackage.ov;
import defpackage.ow;
import defpackage.ox;
import defpackage.oy;
import defpackage.pc;
import defpackage.pe;
import defpackage.pf;
import defpackage.pr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, eqa, eru, epo, fbg {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public ax mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public bt mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    private final az mContextAwareAttachListener;
    public final ov mContextAwareHelper;
    public erq mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public bt mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public bg<?> mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    public eqc mLifecycleRegistry;
    public eps mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<az> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final az mSavedStateAttachListener;
    public fbf mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    private final ca mTracer;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public cl mViewLifecycleOwner;
    public eqm<eqa> mViewLifecycleOwnerLiveData;
    public String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new bt();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new ap(this, 14, null);
        this.mMaxState = eps.e;
        this.mContextAwareHelper = new ov();
        this.mViewLifecycleOwnerLiveData = new eqm<>();
        this.mTracer = new ca();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new at(this);
        this.mContextAwareAttachListener = new au(this);
        initLifecycle();
    }

    private ax ensureAnimationInfo() {
        ax axVar = this.mAnimationInfo;
        if (axVar != null) {
            return axVar;
        }
        ax axVar2 = new ax();
        this.mAnimationInfo = axVar2;
        return axVar2;
    }

    private int getMinimumMaxLifecycleState() {
        eps epsVar = this.mMaxState;
        return (epsVar == eps.b || this.mParentFragment == null) ? epsVar.ordinal() : Math.min(epsVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            int i = enj.a;
            enn ennVar = new enn(this);
            enj.d(ennVar);
            eni eniVarB = enj.b(this);
            if (eniVarB.b.contains(enh.h) && enj.e(eniVarB, getClass(), ennVar.getClass())) {
                enj.c(eniVarB, ennVar);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        bt btVar = this.mFragmentManager;
        if (btVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return btVar.d(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new eqc(this, true);
        this.mSavedStateRegistryController = ebi.l(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
        if (this.mOnPreAttachedListeners.contains(this.mContextAwareAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mContextAwareAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) bf.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new ay(a.bq(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e4);
        }
    }

    private <I, O> oy<I> prepareCallInternal(pf<I, O> pfVar, pr<Void, pc> prVar, ox<O> oxVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new ar(this, prVar, atomicReference, pfVar, oxVar));
        return new as(atomicReference);
    }

    private void registerOnPreAttachListener(az azVar) {
        if (this.mState >= 0) {
            azVar.a();
        } else {
            this.mOnPreAttachedListeners.add(azVar);
        }
    }

    public void addOnContextAvailableListener(ow owVar) {
        this.mContextAwareHelper.a(owVar);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        bt btVar;
        ax axVar = this.mAnimationInfo;
        if (axVar != null) {
            axVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (btVar = this.mFragmentManager) == null) {
            return;
        }
        cq cqVarC = ca.c(viewGroup, btVar);
        cqVarC.g();
        if (z) {
            this.mHost.d.post(new ag(cqVarC, 12, null));
        } else {
            cqVarC.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public be createFragmentContainer() {
        return new av(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            esm.a(this).c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.H(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.b.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final bc getActivity() {
        bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return (bc) bgVar.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        ax axVar = this.mAnimationInfo;
        if (axVar == null || (bool = axVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        ax axVar = this.mAnimationInfo;
        if (axVar == null || (bool = axVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final bt getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return bgVar.c;
    }

    @Override // defpackage.epo
    public esc getDefaultViewModelCreationExtras() {
        byte[] bArr;
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            bArr = null;
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && bt.ac(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ese eseVar = new ese(bArr);
        if (application != null) {
            eseVar.b(erp.b, application);
        }
        eseVar.b(erg.a, this);
        eseVar.b(erg.b, this);
        if (getArguments() != null) {
            eseVar.b(erg.c, getArguments());
        }
        return eseVar;
    }

    @Override // defpackage.epo
    public erq getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && bt.ac(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new erh(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.b;
    }

    public Object getEnterTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.i;
    }

    public dun getEnterTransitionCallback() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.q;
    }

    public int getExitAnim() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.c;
    }

    public Object getExitTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.k;
    }

    public dun getExitTransitionCallback() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.r;
    }

    public View getFocusedView() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.t;
    }

    @Deprecated
    public final bt getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return bgVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = bgVar.c();
        layoutInflaterC.setFactory2(this.mChildFragmentManager.d);
        return layoutInflaterC;
    }

    @Override // defpackage.eqa
    public ept getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public esm getLoaderManager() {
        return esm.a(this);
    }

    public int getNextTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final bt getParentFragmentManager() {
        bt btVar = this.mFragmentManager;
        if (btVar != null) {
            return btVar;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return false;
        }
        return axVar.a;
    }

    public int getPopEnterAnim() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.d;
    }

    public int getPopExitAnim() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 1.0f;
        }
        return axVar.s;
    }

    public Object getReenterTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        Object obj = axVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        int i = enj.a;
        enl enlVar = new enl(this);
        enj.d(enlVar);
        eni eniVarB = enj.b(this);
        if (eniVarB.b.contains(enh.f) && enj.e(eniVarB, getClass(), enlVar.getClass())) {
            enj.c(eniVarB, enlVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        Object obj = axVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.m;
    }

    public Object getSharedElementReturnTransition() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        Object obj = axVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        ax axVar = this.mAnimationInfo;
        return (axVar == null || (arrayList = axVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        ax axVar = this.mAnimationInfo;
        return (axVar == null || (arrayList = axVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        int i = enj.a;
        enm enmVar = new enm(this);
        enj.d(enmVar);
        eni eniVarB = enj.b(this);
        if (eniVarB.b.contains(enh.h) && enj.e(eniVarB, getClass(), enmVar.getClass())) {
            enj.c(eniVarB, enmVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public eqa getViewLifecycleOwner() {
        cl clVar = this.mViewLifecycleOwner;
        if (clVar != null) {
            return clVar;
        }
        throw new IllegalStateException(a.bm(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public eqj<eqa> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.eru
    public ert getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == eps.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.z.d;
        ert ertVar = (ert) map.get(this.mWho);
        if (ertVar != null) {
            return ertVar;
        }
        ert ertVar2 = new ert();
        map.put(this.mWho, ertVar2);
        return ertVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new bt();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        Fragment fragment;
        if (this.mHidden) {
            return true;
        }
        return (this.mFragmentManager == null || (fragment = this.mParentFragment) == null || !fragment.isHidden()) ? false : true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || bt.ak(this.mParentFragment);
        }
        return false;
    }

    public boolean isPostponed() {
        ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return false;
        }
        return axVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        bt btVar = this.mFragmentManager;
        if (btVar == null) {
            return false;
        }
        return btVar.af();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* renamed from: lambda$performAttach$2$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m106lambda$performAttach$2$androidsupportv4appFragment() {
        onAttach(this.mHost.c);
    }

    /* renamed from: lambda$performCreate$4$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m108lambda$performCreate$4$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_CREATE);
    }

    /* renamed from: lambda$performCreateView$5$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m109lambda$performCreateView$5$androidsupportv4appFragment() {
        cl clVar = this.mViewLifecycleOwner;
        clVar.b.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    /* renamed from: lambda$performCreateView$6$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m110lambda$performCreateView$6$androidsupportv4appFragment(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: lambda$performDestroy$19$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m111lambda$performDestroy$19$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_DESTROY);
    }

    /* renamed from: lambda$performDestroyView$18$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m112lambda$performDestroyView$18$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_DESTROY);
    }

    /* renamed from: lambda$performPause$14$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m113lambda$performPause$14$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_PAUSE);
    }

    /* renamed from: lambda$performPause$15$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m114lambda$performPause$15$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_PAUSE);
    }

    /* renamed from: lambda$performResume$11$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m115lambda$performResume$11$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_RESUME);
    }

    /* renamed from: lambda$performResume$12$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m116lambda$performResume$12$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_RESUME);
    }

    /* renamed from: lambda$performStart$10$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m118lambda$performStart$10$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_START);
    }

    /* renamed from: lambda$performStart$9$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m119lambda$performStart$9$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_START);
    }

    /* renamed from: lambda$performStop$16$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m120lambda$performStop$16$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_STOP);
    }

    /* renamed from: lambda$performStop$17$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m121lambda$performStop$17$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(epr.ON_STOP);
    }

    /* renamed from: lambda$performViewCreated$7$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m122lambda$performViewCreated$7$androidsupportv4appFragment(Bundle bundle) {
        onViewCreated(this.mView, bundle);
    }

    /* renamed from: lambda$restoreViewState$1$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m124lambda$restoreViewState$1$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(epr.ON_CREATE);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.N();
    }

    @Deprecated
    /* renamed from: onActivityCreated, reason: merged with bridge method [inline-methods] */
    public void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        bg<?> bgVar = this.mHost;
        Activity activity = bgVar == null ? null : bgVar.b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    /* renamed from: onCreate, reason: merged with bridge method [inline-methods] */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        bt btVar = this.mChildFragmentManager;
        if (btVar.l > 0) {
            return;
        }
        btVar.u();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        bg<?> bgVar = this.mHost;
        Activity activity = bgVar == null ? null : bgVar.b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    /* renamed from: onViewStateRestored, reason: merged with bridge method [inline-methods] */
    public void m123lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mState = 3;
        this.mCalled = false;
        ca.a(new aq(this, bundle, 1));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.s();
    }

    public void performAttach() {
        ArrayList<az> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        ca.a(new ap(this, i));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.k.iterator();
        while (it.hasNext()) {
            ((bw) it.next()).p(this);
        }
        bt btVar = this.mChildFragmentManager;
        btVar.w = false;
        btVar.x = false;
        btVar.z.g = false;
        btVar.F(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.Y(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new ny(this, 1, null));
        ca.a(new aq(this, bundle, 3));
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        ca.a(new ap(this, 13));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.Z(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new cl(this, getViewModelStore(), new ap(this, 5));
        ca.a(new inp(this, layoutInflater, viewGroup, bundle, 1));
        View view = this.mView;
        cl clVar = this.mViewLifecycleOwner;
        if (view == null) {
            if (clVar.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        clVar.b();
        if (bt.ac(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        View view2 = this.mView;
        cl clVar2 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_lifecycle_owner, clVar2);
        View view3 = this.mView;
        cl clVar3 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_view_model_store_owner, clVar3);
        View view4 = this.mView;
        cl clVar4 = this.mViewLifecycleOwner;
        view4.getClass();
        view4.setTag(R.id.view_tree_saved_state_registry_owner, clVar4);
        this.mViewLifecycleOwnerLiveData.m(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.v();
        ca.a(new ag(this, 9));
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        ca.a(new ag(this, 10));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.F(1);
        if (this.mView != null && ((eqc) this.mViewLifecycleOwner.getLifecycle()).e.a(eps.c)) {
            ca.a(new ag(this, 3));
        }
        this.mState = 1;
        this.mCalled = false;
        ca.a(new ag(this, 4));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        aau aauVar = esm.a(this).a.b;
        int iC = aauVar.c();
        for (int i = 0; i < iC; i++) {
            ((esn) aauVar.e(i)).b();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        ca.a(new ag(this, 8));
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        bt btVar = this.mChildFragmentManager;
        if (btVar.y) {
            return;
        }
        btVar.v();
        this.mChildFragmentManager = new bt();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.aa(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.z(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.B();
        if (this.mView != null) {
            ca.a(new ap(this, 10));
        }
        ca.a(new ap(this, 11));
        this.mState = 6;
        this.mCalled = false;
        ca.a(new ap(this, 12));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.ab(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zAe = this.mFragmentManager.ae(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zAe) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zAe);
            onPrimaryNavigationFragmentChanged(zAe);
            bt btVar = this.mChildFragmentManager;
            btVar.X();
            btVar.A(btVar.p);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.an(true);
        int i = 7;
        this.mState = 7;
        this.mCalled = false;
        ca.a(new ap(this, 6));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onResume()"));
        }
        ca.a(new ap(this, i));
        if (this.mView != null) {
            ca.a(new ap(this, 8));
        }
        this.mChildFragmentManager.D();
    }

    public void performSaveInstanceState(Bundle bundle) {
        ca.a(new af(this, bundle, 5));
    }

    public void performStart() {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.an(true);
        this.mState = 5;
        this.mCalled = false;
        ca.a(new ap(this, 2));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onStart()"));
        }
        ca.a(new ap(this, 3));
        if (this.mView != null) {
            ca.a(new ap(this, 4));
        }
        this.mChildFragmentManager.E();
    }

    public void performStop() {
        this.mChildFragmentManager.G();
        if (this.mView != null) {
            ca.a(new ag(this, 5));
        }
        ca.a(new ag(this, 6));
        this.mState = 4;
        this.mCalled = false;
        ca.a(new ag(this, 7));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        ca.a(new aq(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 2));
        this.mChildFragmentManager.F(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().u = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        bt btVar = this.mFragmentManager;
        if (btVar != null) {
            handler = btVar.m.d;
            this.mPostponedHandler = handler;
        } else {
            handler = new Handler(Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> oy<I> registerForActivityResult(pf<I, O> pfVar, ox<O> oxVar) {
        return prepareCallInternal(pfVar, new aw(this, 1), oxVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void removeOnContextAvailableListener(ow owVar) {
        owVar.getClass();
        this.mContextAwareHelper.a.remove(owVar);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to Activity"));
        }
        bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.t == null) {
            parentFragmentManager.m.u(strArr);
            return;
        }
        parentFragmentManager.u.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
        parentFragmentManager.t.b(strArr);
    }

    public final bc requireActivity() {
        bc activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final bt requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.bm(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.S(bundle);
        this.mChildFragmentManager.u();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        ca.a(new aq(this, bundle, 0));
        if (!this.mCalled) {
            throw new cr(a.bm(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            ca.a(new ap(this, 9));
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        ensureAnimationInfo().b = i;
        ensureAnimationInfo().c = i2;
        ensureAnimationInfo().d = i3;
        ensureAnimationInfo().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(dun dunVar) {
        ensureAnimationInfo().q = dunVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(dun dunVar) {
        ensureAnimationInfo().r = dunVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.j();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (savedState != null && (bundle = savedState.a) != null) {
            bundle2 = bundle;
        }
        this.mSavedFragmentState = bundle2;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.j();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        int i = enj.a;
        enp enpVar = new enp(this);
        enj.d(enpVar);
        eni eniVarB = enj.b(this);
        if (eniVarB.b.contains(enh.f) && enj.e(eniVarB, getClass(), enpVar.getClass())) {
            enj.c(eniVarB, enpVar);
        }
        this.mRetainInstance = z;
        bt btVar = this.mFragmentManager;
        if (btVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            btVar.z.a(this);
        } else {
            btVar.z.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        ax axVar = this.mAnimationInfo;
        axVar.g = arrayList;
        axVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            int i2 = enj.a;
            enq enqVar = new enq(this, fragment, i);
            enj.d(enqVar);
            eni eniVarB = enj.b(this);
            if (eniVarB.b.contains(enh.h) && enj.e(eniVarB, getClass(), enqVar.getClass())) {
                enj.c(eniVarB, enqVar);
            }
        }
        bt btVar = this.mFragmentManager;
        bt btVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (btVar != null && btVar2 != null && btVar != btVar2) {
            throw new IllegalArgumentException(a.bm(fragment, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException(a.bw(this, fragment, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
                this.mTargetRequestCode = i;
            }
            this.mTargetWho = fragment.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        bt btVar;
        int i = enj.a;
        enr enrVar = new enr(this, z);
        enj.d(enrVar);
        eni eniVarB = enj.b(this);
        if (eniVarB.b.contains(enh.g) && enj.e(eniVarB, getClass(), enrVar.getClass())) {
            enj.c(eniVarB, enrVar);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && (btVar = this.mFragmentManager) != null && isAdded() && this.mIsCreated) {
            btVar.P(btVar.k(this));
        }
        this.mUserVisibleHint = z;
        boolean z2 = false;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        bg<?> bgVar = this.mHost;
        if (bgVar != null) {
            return bgVar.o(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to Activity"));
        }
        bgVar.v(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to Activity"));
        }
        bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.r == null) {
            parentFragmentManager.m.v(intent, i, bundle);
            return;
        }
        parentFragmentManager.u.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.r.b(intent);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bm(this, "Fragment ", " not attached to Activity"));
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.s == null) {
            bg bgVar = parentFragmentManager.m;
            intentSender.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            Activity activity = bgVar.b;
            if (activity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activity.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (bt.ac(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        pe peVar = new pe(intentSender);
        peVar.a = intent;
        peVar.b(i3, i2);
        IntentSenderRequest intentSenderRequestA = peVar.a();
        parentFragmentManager.u.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(this, "Fragment ", "is launching an IntentSender for result "));
        }
        parentFragmentManager.s.b(intentSenderRequestA);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.d.getLooper()) {
            this.mHost.d.postAtFrontOfQueue(new ag(this, 11, null));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final <I, O> oy<I> registerForActivityResult(pf<I, O> pfVar, pc pcVar, ox<O> oxVar) {
        return prepareCallInternal(pfVar, new aw(pcVar, 0), oxVar);
    }

    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new mh(1);
        final Bundle a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }

        public SavedState(Bundle bundle) {
            this.a = bundle;
        }
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    /* renamed from: onSaveInstanceState, reason: merged with bridge method [inline-methods] */
    public void m117x22bc4f96(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    private void restoreViewState() {
        if (bt.ac(3)) {
            toString();
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: ".concat(toString()));
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
