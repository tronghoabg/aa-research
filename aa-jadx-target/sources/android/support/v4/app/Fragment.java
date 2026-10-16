package android.support.v4.app;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, defpackage.eqg, defpackage.esa, defpackage.epu, defpackage.fbm {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    public static final java.lang.Object USE_DEFAULT_TRANSITION = new java.lang.Object();
    static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public defpackage.ax mAnimationInfo;
    public android.os.Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public defpackage.bt mChildFragmentManager;
    public android.view.ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    private final defpackage.az mContextAwareAttachListener;
    public final defpackage.oy mContextAwareHelper;
    public defpackage.erw mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public defpackage.bt mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public defpackage.bg<?> mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    public defpackage.eqi mLifecycleRegistry;
    public defpackage.epx mMaxState;
    public boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<defpackage.az> mOnPreAttachedListeners;
    public android.support.v4.app.Fragment mParentFragment;
    public boolean mPerformedCreateView;
    java.lang.Runnable mPostponedDurationRunnable;
    android.os.Handler mPostponedHandler;
    public java.lang.String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public android.os.Bundle mSavedFragmentState;
    private final defpackage.az mSavedStateAttachListener;
    public defpackage.fbl mSavedStateRegistryController;
    public java.lang.Boolean mSavedUserVisibleHint;
    public android.os.Bundle mSavedViewRegistryState;
    public android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    public int mState;
    public java.lang.String mTag;
    public android.support.v4.app.Fragment mTarget;
    public int mTargetRequestCode;
    public java.lang.String mTargetWho;
    private final defpackage.ca mTracer;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public android.view.View mView;
    public defpackage.cl mViewLifecycleOwner;
    public defpackage.eqs<defpackage.eqg> mViewLifecycleOwnerLiveData;
    public java.lang.String mWho;

    public Fragment() {
        this.mState = INITIALIZING;
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new defpackage.bt();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new defpackage.ap(this, 11, null);
        this.mMaxState = defpackage.epx.e;
        this.mContextAwareHelper = new defpackage.oy();
        this.mViewLifecycleOwnerLiveData = new defpackage.eqs<>();
        this.mTracer = new defpackage.ca();
        this.mNextLocalRequestCode = new java.util.concurrent.atomic.AtomicInteger();
        this.mOnPreAttachedListeners = new java.util.ArrayList<>();
        this.mSavedStateAttachListener = new defpackage.at(this);
        this.mContextAwareAttachListener = new defpackage.au(this);
        initLifecycle();
    }

    private defpackage.ax ensureAnimationInfo() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar != null) {
            return axVar;
        }
        defpackage.ax axVar2 = new defpackage.ax();
        this.mAnimationInfo = axVar2;
        return axVar2;
    }

    private int getMinimumMaxLifecycleState() {
        defpackage.epx epxVar = this.mMaxState;
        return (epxVar == defpackage.epx.b || this.mParentFragment == null) ? epxVar.ordinal() : java.lang.Math.min(epxVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private android.support.v4.app.Fragment getTargetFragment(boolean z) {
        java.lang.String str;
        if (z) {
            int i = defpackage.enp.a;
            ent entVar = new ent(this);
            defpackage.enp.d(entVar);
            defpackage.eno enoVarB = defpackage.enp.b(this);
            if (enoVarB.b.contains(defpackage.enn.h) && defpackage.enp.e(enoVarB, getClass(), entVar.getClass())) {
                defpackage.enp.c(enoVarB, entVar);
            }
        }
        android.support.v4.app.Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        defpackage.bt btVar = this.mFragmentManager;
        if (btVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return btVar.d(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new defpackage.eqi(this, true);
        this.mSavedStateRegistryController = defpackage.ebq.h(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
        if (this.mOnPreAttachedListeners.contains(this.mContextAwareAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mContextAwareAttachListener);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ay */
    @java.lang.Deprecated
    public static android.support.v4.app.Fragment instantiate(android.content.Context context, java.lang.String str, android.os.Bundle bundle) throws ay {
        try {
            android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) defpackage.bf.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (java.lang.IllegalAccessException e) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (java.lang.InstantiationException e2) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new ay(defpackage.a.bp(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e4);
        }
    }

    private <I, O> defpackage.pb<I> prepareCallInternal(defpackage.pi<I, O> piVar, defpackage.pu<java.lang.Void, defpackage.pf> puVar, defpackage.pa<O> paVar) {
        if (this.mState > 1) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        registerOnPreAttachListener(new ar(this, puVar, atomicReference, piVar, paVar));
        return new as(atomicReference);
    }

    private void registerOnPreAttachListener(defpackage.az azVar) {
        if (this.mState >= 0) {
            azVar.a();
        } else {
            this.mOnPreAttachedListeners.add(azVar);
        }
    }

    public void addOnContextAvailableListener(defpackage.oz ozVar) {
        this.mContextAwareHelper.a(ozVar);
    }

    public void callStartTransitionListener(boolean z) {
        android.view.ViewGroup viewGroup;
        defpackage.bt btVar;
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar != null) {
            axVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (btVar = this.mFragmentManager) == null) {
            return;
        }
        defpackage.cq cqVarC = defpackage.ca.c(viewGroup, btVar);
        cqVarC.g();
        if (z) {
            this.mHost.d.post(new defpackage.ag(cqVarC, 15, null));
        } else {
            cqVarC.e();
        }
        android.os.Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public defpackage.be createFragmentContainer() {
        return new defpackage.av(this);
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(java.lang.Integer.toHexString(this.mContainerId));
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
        android.support.v4.app.Fragment targetFragment = getTargetFragment(false);
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
            defpackage.ess.a(this).c(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.H(java.lang.String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public android.support.v4.app.Fragment findFragmentByWho(java.lang.String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.b.c(str);
    }

    public java.lang.String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final defpackage.bc getActivity() {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return (defpackage.bc) bgVar.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        java.lang.Boolean bool;
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null || (bool = axVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        java.lang.Boolean bool;
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null || (bool = axVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public android.view.View getAnimatingAway() {
        return null;
    }

    public final android.os.Bundle getArguments() {
        return this.mArguments;
    }

    public final defpackage.bt getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " has not been attached yet."));
    }

    public android.content.Context getContext() {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return bgVar.c;
    }

    @Override // defpackage.epu
    public defpackage.esi getDefaultViewModelCreationExtras() {
        android.app.Application application;
        android.content.Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        defpackage.esk eskVar = new defpackage.esk((byte[]) null);
        if (application != null) {
            eskVar.b(defpackage.erv.b, application);
        }
        eskVar.b(defpackage.erm.a, this);
        eskVar.b(defpackage.erm.b, this);
        if (getArguments() != null) {
            eskVar.b(defpackage.erm.c, getArguments());
        }
        return eskVar;
    }

    @Override // defpackage.epu
    public defpackage.erw getDefaultViewModelProviderFactory() {
        android.app.Application application;
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            android.content.Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && defpackage.bt.ac(3)) {
                android.util.Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new defpackage.ern(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.b;
    }

    public java.lang.Object getEnterTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.i;
    }

    public defpackage.duu getEnterTransitionCallback() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.q;
    }

    public int getExitAnim() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.c;
    }

    public java.lang.Object getExitTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.k;
    }

    public defpackage.duu getExitTransitionCallback() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.r;
    }

    public android.view.View getFocusedView() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.t;
    }

    @java.lang.Deprecated
    public final defpackage.bt getFragmentManager() {
        return this.mFragmentManager;
    }

    public final java.lang.Object getHost() {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            return null;
        }
        return bgVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle bundle) {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            throw new java.lang.IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        android.view.LayoutInflater layoutInflaterC = bgVar.c();
        layoutInflaterC.setFactory2(this.mChildFragmentManager.d);
        return layoutInflaterC;
    }

    @Override // defpackage.eqg
    public defpackage.epy getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @java.lang.Deprecated
    public defpackage.ess getLoaderManager() {
        return defpackage.ess.a(this);
    }

    public int getNextTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.f;
    }

    public final android.support.v4.app.Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final defpackage.bt getParentFragmentManager() {
        defpackage.bt btVar = this.mFragmentManager;
        if (btVar != null) {
            return btVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return false;
        }
        return axVar.a;
    }

    public int getPopEnterAnim() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.d;
    }

    public int getPopExitAnim() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 0;
        }
        return axVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return 1.0f;
        }
        return axVar.s;
    }

    public java.lang.Object getReenterTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        java.lang.Object obj = axVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final android.content.res.Resources getResources() {
        return requireContext().getResources();
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
        int i = defpackage.enp.a;
        enr enrVar = new enr(this);
        defpackage.enp.d(enrVar);
        defpackage.eno enoVarB = defpackage.enp.b(this);
        if (enoVarB.b.contains(defpackage.enn.f) && defpackage.enp.e(enoVarB, getClass(), enrVar.getClass())) {
            defpackage.enp.c(enoVarB, enrVar);
        }
        return this.mRetainInstance;
    }

    public java.lang.Object getReturnTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        java.lang.Object obj = axVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) this.mSavedStateRegistryController.b;
    }

    public java.lang.Object getSharedElementEnterTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        return axVar.m;
    }

    public java.lang.Object getSharedElementReturnTransition() {
        defpackage.ax axVar = this.mAnimationInfo;
        if (axVar == null) {
            return null;
        }
        java.lang.Object obj = axVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        java.util.ArrayList<java.lang.String> arrayList;
        defpackage.ax axVar = this.mAnimationInfo;
        return (axVar == null || (arrayList = axVar.g) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        java.util.ArrayList<java.lang.String> arrayList;
        defpackage.ax axVar = this.mAnimationInfo;
        return (axVar == null || (arrayList = axVar.h) == null) ? new java.util.ArrayList<>() : arrayList;
    }

    public final java.lang.String getString(int i) {
        return getResources().getString(i);
    }

    public final java.lang.String getTag() {
        return this.mTag;
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
        int i = defpackage.enp.a;
        ens ensVar = new ens(this);
        defpackage.enp.d(ensVar);
        defpackage.eno enoVarB = defpackage.enp.b(this);
        if (enoVarB.b.contains(defpackage.enn.h) && defpackage.enp.e(enoVarB, getClass(), ensVar.getClass())) {
            defpackage.enp.c(enoVarB, ensVar);
        }
        return this.mTargetRequestCode;
    }

    public final java.lang.CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public android.view.View getView() {
        return this.mView;
    }

    public defpackage.eqg getViewLifecycleOwner() {
        defpackage.cl clVar = this.mViewLifecycleOwner;
        if (clVar != null) {
            return clVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public defpackage.eqp<defpackage.eqg> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.esa
    public defpackage.erz getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new java.lang.IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == defpackage.epx.b.ordinal()) {
            throw new java.lang.IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        java.util.HashMap map = this.mFragmentManager.z.d;
        defpackage.erz erzVar = (defpackage.erz) map.get(this.mWho);
        if (erzVar != null) {
            return erzVar;
        }
        defpackage.erz erzVar2 = new defpackage.erz();
        map.put(this.mWho, erzVar2);
        return erzVar2;
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
        this.mWho = java.util.UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new defpackage.bt();
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
        android.support.v4.app.Fragment fragment;
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
            return this.mFragmentManager == null || defpackage.bt.ak(this.mParentFragment);
        }
        return false;
    }

    public boolean isPostponed() {
        defpackage.ax axVar = this.mAnimationInfo;
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
        defpackage.bt btVar = this.mFragmentManager;
        if (btVar == null) {
            return false;
        }
        return btVar.af();
    }

    public final boolean isVisible() {
        android.view.View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: lambda$performAttach$2$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m5lambda$performAttach$2$androidsupportv4appFragment() {
        onAttach(this.mHost.c);
    }

    /* JADX INFO: renamed from: lambda$performCreate$4$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m7lambda$performCreate$4$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_CREATE);
    }

    /* JADX INFO: renamed from: lambda$performCreateView$5$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m8lambda$performCreateView$5$androidsupportv4appFragment() {
        defpackage.cl clVar = this.mViewLifecycleOwner;
        clVar.b.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: lambda$performCreateView$6$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m9lambda$performCreateView$6$androidsupportv4appFragment(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: lambda$performDestroy$19$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m10lambda$performDestroy$19$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_DESTROY);
    }

    /* JADX INFO: renamed from: lambda$performDestroyView$18$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m11lambda$performDestroyView$18$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_DESTROY);
    }

    /* JADX INFO: renamed from: lambda$performPause$14$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m12lambda$performPause$14$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_PAUSE);
    }

    /* JADX INFO: renamed from: lambda$performPause$15$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m13lambda$performPause$15$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_PAUSE);
    }

    /* JADX INFO: renamed from: lambda$performResume$11$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m14lambda$performResume$11$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_RESUME);
    }

    /* JADX INFO: renamed from: lambda$performResume$12$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m15lambda$performResume$12$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_RESUME);
    }

    /* JADX INFO: renamed from: lambda$performStart$10$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m17lambda$performStart$10$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_START);
    }

    /* JADX INFO: renamed from: lambda$performStart$9$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m18lambda$performStart$9$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_START);
    }

    /* JADX INFO: renamed from: lambda$performStop$16$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m19lambda$performStop$16$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_STOP);
    }

    /* JADX INFO: renamed from: lambda$performStop$17$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m20lambda$performStop$17$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(defpackage.epw.ON_STOP);
    }

    /* JADX INFO: renamed from: lambda$performViewCreated$7$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m21lambda$performViewCreated$7$androidsupportv4appFragment(android.os.Bundle bundle) {
        onViewCreated(this.mView, bundle);
    }

    /* JADX INFO: renamed from: lambda$restoreViewState$1$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m23lambda$restoreViewState$1$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(defpackage.epw.ON_CREATE);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.N();
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: onActivityCreated, reason: merged with bridge method [inline-methods] */
    public void m4lambda$performActivityCreated$8$androidsupportv4appFragment(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    @java.lang.Deprecated
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(android.content.Context context) {
        this.mCalled = true;
        defpackage.bg<?> bgVar = this.mHost;
        android.app.Activity activity = bgVar == null ? null : bgVar.b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(android.view.MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: onCreate, reason: merged with bridge method [inline-methods] */
    public void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        defpackage.bt btVar = this.mChildFragmentManager;
        if (btVar.l > 0) {
            return;
        }
        btVar.u();
    }

    public android.view.animation.Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public android.animation.Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
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

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
        defpackage.bg<?> bgVar = this.mHost;
        android.app.Activity activity = bgVar == null ? null : bgVar.b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @java.lang.Deprecated
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
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

    /* JADX INFO: renamed from: onViewStateRestored, reason: merged with bridge method [inline-methods] */
    public void m22lambda$restoreViewState$0$androidsupportv4appFragment(android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public android.content.Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performActivityCreated(android.os.Bundle bundle) throws cr {
        this.mChildFragmentManager.N();
        this.mState = 3;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.aq(this, bundle, 1));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performAttach() throws cr {
        java.util.ArrayList<defpackage.az> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ap(this, i));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        java.util.Iterator it = this.mFragmentManager.k.iterator();
        while (it.hasNext()) {
            ((defpackage.bw) it.next()).p(this);
        }
        defpackage.bt btVar = this.mChildFragmentManager;
        btVar.w = false;
        btVar.x = false;
        btVar.z.g = false;
        btVar.F(0);
    }

    public void performConfigurationChanged(android.content.res.Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.Y(menuItem);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performCreate(android.os.Bundle bundle) throws cr {
        this.mChildFragmentManager.N();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.c(new defpackage.oa(this, 1, null));
        defpackage.ca.a(new defpackage.aq(this, bundle, 3));
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        defpackage.ca.a(new defpackage.ap(this, 10));
    }

    public boolean performCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
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

    public void performCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.mChildFragmentManager.N();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new defpackage.cl(this, getViewModelStore(), new defpackage.ap(this, 5));
        defpackage.ca.a(new defpackage.inw(this, layoutInflater, viewGroup, bundle, 1));
        android.view.View view = this.mView;
        defpackage.cl clVar = this.mViewLifecycleOwner;
        if (view == null) {
            if (clVar.a != null) {
                throw new java.lang.IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        clVar.b();
        if (defpackage.bt.ac(3)) {
            android.util.Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        android.view.View view2 = this.mView;
        defpackage.cl clVar2 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(2131429869, clVar2);
        android.view.View view3 = this.mView;
        defpackage.cl clVar3 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(2131429873, clVar3);
        android.view.View view4 = this.mView;
        defpackage.cl clVar4 = this.mViewLifecycleOwner;
        view4.getClass();
        view4.setTag(2131429872, clVar4);
        this.mViewLifecycleOwnerLiveData.m(this.mViewLifecycleOwner);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performDestroy() throws cr {
        this.mChildFragmentManager.v();
        defpackage.ca.a(new defpackage.ag(this, 12));
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        defpackage.ca.a(new defpackage.ag(this, 13));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performDestroyView() throws cr {
        this.mChildFragmentManager.F(1);
        if (this.mView != null && ((defpackage.eqi) this.mViewLifecycleOwner.getLifecycle()).e.a(defpackage.epx.c)) {
            defpackage.ca.a(new defpackage.ag(this, 3));
        }
        this.mState = 1;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ag(this, 4));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        defpackage.abb abbVar = defpackage.ess.a(this).a.b;
        int iC = abbVar.c();
        for (int i = 0; i < iC; i++) {
            ((est) abbVar.e(i)).b();
        }
        this.mPerformedCreateView = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performDetach() throws cr {
        this.mState = INITIALIZING;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ag(this, 8));
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        defpackage.bt btVar = this.mChildFragmentManager;
        if (btVar.y) {
            return;
        }
        btVar.v();
        this.mChildFragmentManager = new defpackage.bt();
    }

    public android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.aa(menuItem);
    }

    public void performOptionsMenuClosed(android.view.Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.z(menu);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performPause() throws cr {
        this.mChildFragmentManager.B();
        if (this.mView != null) {
            defpackage.ca.a(new defpackage.ag(this, 9));
        }
        defpackage.ca.a(new defpackage.ag(this, 10));
        this.mState = 6;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ag(this, 11));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(android.view.Menu menu) {
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
        java.lang.Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zAe) {
            this.mIsPrimaryNavigationFragment = java.lang.Boolean.valueOf(zAe);
            onPrimaryNavigationFragmentChanged(zAe);
            defpackage.bt btVar = this.mChildFragmentManager;
            btVar.X();
            btVar.A(btVar.p);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performResume() throws cr {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.an(true);
        int i = 7;
        this.mState = 7;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ap(this, 6));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onResume()"));
        }
        defpackage.ca.a(new defpackage.ap(this, i));
        if (this.mView != null) {
            defpackage.ca.a(new defpackage.ap(this, 8));
        }
        this.mChildFragmentManager.D();
    }

    public void performSaveInstanceState(android.os.Bundle bundle) {
        defpackage.ca.a(new defpackage.af(this, bundle, 5));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performStart() throws cr {
        this.mChildFragmentManager.N();
        this.mChildFragmentManager.an(true);
        this.mState = 5;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ap(this, 2));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onStart()"));
        }
        defpackage.ca.a(new defpackage.ap(this, 3));
        if (this.mView != null) {
            defpackage.ca.a(new defpackage.ap(this, 4));
        }
        this.mChildFragmentManager.E();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    public void performStop() throws cr {
        this.mChildFragmentManager.G();
        if (this.mView != null) {
            defpackage.ca.a(new defpackage.ag(this, 5));
        }
        defpackage.ca.a(new defpackage.ag(this, 6));
        this.mState = 4;
        this.mCalled = false;
        defpackage.ca.a(new defpackage.ag(this, 7));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        android.os.Bundle bundle = this.mSavedFragmentState;
        defpackage.ca.a(new defpackage.aq(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 2));
        this.mChildFragmentManager.F(2);
    }

    public final void postponeEnterTransition(long j, java.util.concurrent.TimeUnit timeUnit) {
        android.os.Handler handler;
        ensureAnimationInfo().u = true;
        android.os.Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        defpackage.bt btVar = this.mFragmentManager;
        if (btVar != null) {
            handler = btVar.m.d;
            this.mPostponedHandler = handler;
        } else {
            handler = new android.os.Handler(android.os.Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> defpackage.pb<I> registerForActivityResult(defpackage.pi<I, O> piVar, defpackage.pa<O> paVar) {
        return prepareCallInternal(piVar, new aw(this, 1), paVar);
    }

    public void registerForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void removeOnContextAvailableListener(defpackage.oz ozVar) {
        ozVar.getClass();
        this.mContextAwareHelper.a.remove(ozVar);
    }

    @java.lang.Deprecated
    public final void requestPermissions(java.lang.String[] strArr, int i) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to Activity"));
        }
        defpackage.bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.t == null) {
            parentFragmentManager.m.u(strArr);
            return;
        }
        parentFragmentManager.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        parentFragmentManager.t.b(strArr);
    }

    public final defpackage.bc requireActivity() {
        defpackage.bc activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to an activity."));
    }

    public final android.os.Bundle requireArguments() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " does not have any arguments."));
    }

    public final android.content.Context requireContext() {
        android.content.Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to a context."));
    }

    @java.lang.Deprecated
    public final defpackage.bt requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final java.lang.Object requireHost() {
        java.lang.Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to a host."));
    }

    public final android.support.v4.app.Fragment requireParentFragment() {
        android.support.v4.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new java.lang.IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final android.view.View requireView() {
        android.view.View view = getView();
        if (view != null) {
            return view;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.S(bundle);
        this.mChildFragmentManager.u();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    final void restoreViewState(android.os.Bundle bundle) throws cr {
        android.util.SparseArray<android.os.Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        defpackage.ca.a(new defpackage.aq(this, bundle, 0));
        if (!this.mCalled) {
            throw new cr(defpackage.a.bl(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            defpackage.ca.a(new defpackage.ap(this, 9));
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = java.lang.Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = java.lang.Boolean.valueOf(z);
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

    public void setArguments(android.os.Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new java.lang.IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(defpackage.duu duuVar) {
        ensureAnimationInfo().q = duuVar;
    }

    public void setEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(defpackage.duu duuVar) {
        ensureAnimationInfo().r = duuVar;
    }

    public void setExitTransition(java.lang.Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(android.view.View view) {
        ensureAnimationInfo().t = view;
    }

    @java.lang.Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.j();
        }
    }

    public void setInitialSavedState(android.support.v4.app.Fragment.SavedState savedState) {
        android.os.Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new java.lang.IllegalStateException("Fragment already added");
        }
        android.os.Bundle bundle2 = null;
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

    public void setReenterTransition(java.lang.Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean z) {
        int i = defpackage.enp.a;
        env envVar = new env(this);
        defpackage.enp.d(envVar);
        defpackage.eno enoVarB = defpackage.enp.b(this);
        if (enoVarB.b.contains(defpackage.enn.f) && defpackage.enp.e(enoVarB, getClass(), envVar.getClass())) {
            defpackage.enp.c(enoVarB, envVar);
        }
        this.mRetainInstance = z;
        defpackage.bt btVar = this.mFragmentManager;
        if (btVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            btVar.z.a(this);
        } else {
            btVar.z.e(this);
        }
    }

    public void setReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(java.lang.Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        ensureAnimationInfo();
        defpackage.ax axVar = this.mAnimationInfo;
        axVar.g = arrayList;
        axVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(java.lang.Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @java.lang.Deprecated
    public void setTargetFragment(android.support.v4.app.Fragment fragment, int i) {
        if (fragment != null) {
            int i2 = defpackage.enp.a;
            enw enwVar = new enw(this, fragment, i);
            defpackage.enp.d(enwVar);
            defpackage.eno enoVarB = defpackage.enp.b(this);
            if (enoVarB.b.contains(defpackage.enn.h) && defpackage.enp.e(enoVarB, getClass(), enwVar.getClass())) {
                defpackage.enp.c(enoVarB, enwVar);
            }
        }
        defpackage.bt btVar = this.mFragmentManager;
        defpackage.bt btVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (btVar != null && btVar2 != null && btVar != btVar2) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(fragment, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (android.support.v4.app.Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bv(this, fragment, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (fragment != null) {
            if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
            }
            this.mTargetRequestCode = i;
        }
        this.mTargetWho = null;
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean z) {
        defpackage.bt btVar;
        int i = defpackage.enp.a;
        enx enxVar = new enx(this, z);
        defpackage.enp.d(enxVar);
        defpackage.eno enoVarB = defpackage.enp.b(this);
        if (enoVarB.b.contains(defpackage.enn.g) && defpackage.enp.e(enoVarB, getClass(), enxVar.getClass())) {
            defpackage.enp.c(enoVarB, enxVar);
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
            this.mSavedUserVisibleHint = java.lang.Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String str) {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar != null) {
            return bgVar.o(str);
        }
        return false;
    }

    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        defpackage.bg<?> bgVar = this.mHost;
        if (bgVar == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to Activity"));
        }
        bgVar.v(intent, INITIALIZING, bundle);
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to Activity"));
        }
        defpackage.bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.r == null) {
            parentFragmentManager.m.v(intent, i, bundle);
            return;
        }
        parentFragmentManager.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.r.b(intent);
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(this, "Fragment ", " not attached to Activity"));
        }
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        defpackage.bt parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.s == null) {
            defpackage.bg bgVar = parentFragmentManager.m;
            intentSender.getClass();
            if (i != INITIALIZING) {
                throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            android.app.Activity activity = bgVar.b;
            if (activity == null) {
                throw new java.lang.IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            activity.startIntentSenderForResult(intentSender, INITIALIZING, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new android.content.Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (defpackage.bt.ac(2)) {
                android.util.Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        ph phVar = new ph(intentSender);
        phVar.a = intent;
        phVar.b(i3, i2);
        androidx.activity.result.IntentSenderRequest intentSenderRequestA = phVar.a();
        parentFragmentManager.u.addLast(new android.support.v4.app.FragmentManager.LaunchedFragmentInfo(this.mWho, i));
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", defpackage.a.bl(this, "Fragment ", "is launching an IntentSender for result "));
        }
        parentFragmentManager.s.b(intentSenderRequestA);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (android.os.Looper.myLooper() != this.mHost.d.getLooper()) {
            this.mHost.d.postAtFrontOfQueue(new defpackage.ag(this, 14, null));
        } else {
            callStartTransitionListener(true);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(android.view.View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final java.lang.String getString(int i, java.lang.Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final <I, O> defpackage.pb<I> registerForActivityResult(defpackage.pi<I, O> piVar, defpackage.pf pfVar, defpackage.pa<O> paVar) {
        return prepareCallInternal(piVar, new aw(pfVar, 0), paVar);
    }

    @java.lang.Deprecated
    public void onDestroyOptionsMenu() {
    }

    @java.lang.Deprecated
    public void onAttach(android.app.Activity activity) {
        this.mCalled = true;
    }

    @java.lang.Deprecated
    public void onInflate(android.app.Activity activity, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(android.content.Intent intent) {
        startActivity(intent, null);
    }

    public final android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @java.lang.Deprecated
    public void onAttachFragment(android.support.v4.app.Fragment fragment) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @java.lang.Deprecated
    public void onOptionsMenuClosed(android.view.Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @java.lang.Deprecated
    public void onPrepareOptionsMenu(android.view.Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    /* JADX INFO: renamed from: onSaveInstanceState, reason: merged with bridge method [inline-methods] */
    public void m16x22bc4f96(android.os.Bundle bundle) {
    }

    @java.lang.Deprecated
    public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: cr */
    private void restoreViewState() throws cr {
        if (defpackage.bt.ac(3)) {
            toString();
            android.util.Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: ".concat(toString()));
        }
        if (this.mView != null) {
            android.os.Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @java.lang.Deprecated
    public final android.support.v4.app.Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @java.lang.Deprecated
    public static android.support.v4.app.Fragment instantiate(android.content.Context context, java.lang.String str) {
        return instantiate(context, str, null);
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
