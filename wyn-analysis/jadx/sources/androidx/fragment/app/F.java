package androidx.fragment.app;

import A7.AbstractC0279p0;
import Va.M6;
import X0.AbstractC1274b;
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
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1445i;
import androidx.lifecycle.InterfaceC1457v;
import g.AbstractC2655c;
import g.InterfaceC2654b;
import h.AbstractC2762a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;
import org.apache.tika.metadata.TikaCoreProperties;
import t.InterfaceC4035a;
import x.C4430w;

/* loaded from: classes.dex */
public abstract class F implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1457v, androidx.lifecycle.f0, InterfaceC1445i, n3.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.d0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    e0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    O mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1459x mLifecycleRegistry;
    F mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    n3.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    F mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    w0 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    e0 mChildFragmentManager = new f0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC1433w(this, 0);
    EnumC1450n mMaxState = EnumC1450n.f18680e;
    androidx.lifecycle.E mViewLifecycleOwnerLiveData = new androidx.lifecycle.E();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<D> mOnPreAttachedListeners = new ArrayList<>();
    private final D mSavedStateAttachListener = new C1434x(this);

    public F() {
        E();
    }

    @Deprecated
    public static F instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final C B() {
        if (this.mAnimationInfo == null) {
            C c10 = new C();
            c10.f18303i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            c10.f18304j = obj;
            c10.k = null;
            c10.f18305l = obj;
            c10.f18306m = null;
            c10.f18307n = obj;
            c10.f18310q = 1.0f;
            c10.f18311r = null;
            this.mAnimationInfo = c10;
        }
        return this.mAnimationInfo;
    }

    public final int C() {
        EnumC1450n enumC1450n = this.mMaxState;
        return (enumC1450n == EnumC1450n.f18677b || this.mParentFragment == null) ? enumC1450n.ordinal() : Math.min(enumC1450n.ordinal(), this.mParentFragment.C());
    }

    public final F D(boolean z2) {
        String str;
        if (z2) {
            D1.c cVar = D1.d.f2276a;
            D1.d.b(new D1.g(this, "Attempting to get target fragment from fragment " + this));
            D1.d.a(this).getClass();
        }
        F f10 = this.mTarget;
        if (f10 != null) {
            return f10;
        }
        e0 e0Var = this.mFragmentManager;
        if (e0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return e0Var.f18410c.b(str);
    }

    public final void E() {
        this.mLifecycleRegistry = new C1459x(this);
        this.mSavedStateRegistryController = new n3.e(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        D d3 = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            d3.a();
        } else {
            this.mOnPreAttachedListeners.add(d3);
        }
    }

    public final C1432v F(AbstractC2762a abstractC2762a, InterfaceC4035a interfaceC4035a, InterfaceC2654b interfaceC2654b) {
        if (this.mState > 1) {
            throw new IllegalStateException(M6.p("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        B b5 = new B(this, interfaceC4035a, atomicReference, abstractC2762a, interfaceC2654b);
        if (this.mState >= 0) {
            b5.a();
        } else {
            this.mOnPreAttachedListeners.add(b5);
        }
        return new C1432v(atomicReference);
    }

    public void callStartTransitionListener(boolean z2) {
        ViewGroup viewGroup;
        e0 e0Var;
        C c10 = this.mAnimationInfo;
        if (c10 != null) {
            c10.f18312s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (e0Var = this.mFragmentManager) == null) {
            return;
        }
        C1426o c1426oJ = C1426o.j(viewGroup, e0Var);
        c1426oJ.k();
        if (z2) {
            this.mHost.f18334c.post(new RunnableC1427p(c1426oJ, 1));
        } else {
            c1426oJ.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public M createFragmentContainer() {
        return new C1435y(this);
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
        F fD = D(false);
        if (fD != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fD);
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
            J1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        this.mChildFragmentManager.v(N0.a.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public F findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f18410c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C c10 = this.mAnimationInfo;
        if (c10 == null || (bool = c10.f18309p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C c10 = this.mAnimationInfo;
        if (c10 == null || (bool = c10.f18308o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        c10.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final e0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        O o7 = this.mHost;
        if (o7 == null) {
            return null;
        }
        return o7.f18333b;
    }

    @Override // androidx.lifecycle.InterfaceC1445i
    public H1.b getDefaultViewModelCreationExtras() {
        Application application;
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
        if (application == null && e0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        H1.c cVar = new H1.c();
        LinkedHashMap linkedHashMap = cVar.f4871a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.c0.f18661d, application);
        }
        linkedHashMap.put(androidx.lifecycle.V.f18636a, this);
        linkedHashMap.put(androidx.lifecycle.V.f18637b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.V.f18638c, getArguments());
        }
        return cVar;
    }

    public androidx.lifecycle.d0 getDefaultViewModelProviderFactory() {
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
            if (application == null && e0.J(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.Y(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 0;
        }
        return c10.f18296b;
    }

    public Object getEnterTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        return c10.f18303i;
    }

    public X0.U getEnterTransitionCallback() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        c10.getClass();
        return null;
    }

    public int getExitAnim() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 0;
        }
        return c10.f18297c;
    }

    public Object getExitTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        return c10.k;
    }

    public X0.U getExitTransitionCallback() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        c10.getClass();
        return null;
    }

    public View getFocusedView() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        return c10.f18311r;
    }

    @Deprecated
    public final e0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        O o7 = this.mHost;
        if (o7 == null) {
            return null;
        }
        return ((J) o7).f18323e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public AbstractC1451o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public J1.a getLoaderManager() {
        return J1.a.a(this);
    }

    public int getNextTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 0;
        }
        return c10.f18300f;
    }

    public final F getParentFragment() {
        return this.mParentFragment;
    }

    public final e0 getParentFragmentManager() {
        e0 e0Var = this.mFragmentManager;
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return false;
        }
        return c10.f18295a;
    }

    public int getPopEnterAnim() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 0;
        }
        return c10.f18298d;
    }

    public int getPopExitAnim() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 0;
        }
        return c10.f18299e;
    }

    public float getPostOnViewCreatedAlpha() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return 1.0f;
        }
        return c10.f18310q;
    }

    public Object getReenterTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        Object obj = c10.f18305l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        D1.c cVar = D1.d.f2276a;
        D1.d.b(new D1.f(this, "Attempting to get retain instance for fragment " + this));
        D1.d.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        Object obj = c10.f18304j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f40911b;
    }

    public Object getSharedElementEnterTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        return c10.f18306m;
    }

    public Object getSharedElementReturnTransition() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return null;
        }
        Object obj = c10.f18307n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C c10 = this.mAnimationInfo;
        return (c10 == null || (arrayList = c10.f18301g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C c10 = this.mAnimationInfo;
        return (c10 == null || (arrayList = c10.f18302h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i5) {
        return getResources().getString(i5);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final F getTargetFragment() {
        return D(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        D1.c cVar = D1.d.f2276a;
        D1.d.b(new D1.g(this, "Attempting to get target request code from fragment " + this));
        D1.d.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i5) {
        return getResources().getText(i5);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1457v getViewLifecycleOwner() {
        w0 w0Var = this.mViewLifecycleOwner;
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException(M6.p("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.D getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.f0
    public androidx.lifecycle.e0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (C() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f18406N.f18454d;
        androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) map.get(this.mWho);
        if (e0Var != null) {
            return e0Var;
        }
        androidx.lifecycle.e0 e0Var2 = new androidx.lifecycle.e0();
        map.put(this.mWho, e0Var2);
        return e0Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        E();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new f0();
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
        if (this.mHidden) {
            return true;
        }
        e0 e0Var = this.mFragmentManager;
        if (e0Var != null) {
            F f10 = this.mParentFragment;
            e0Var.getClass();
            if (f10 == null ? false : f10.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            F f10 = this.mParentFragment;
            if (!(f10 == null ? true : f10.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        C c10 = this.mAnimationInfo;
        if (c10 == null) {
            return false;
        }
        return c10.f18312s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        e0 e0Var = this.mFragmentManager;
        if (e0Var == null) {
            return false;
        }
        return e0Var.f18400G || e0Var.f18401H;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.O();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i5, int i10, Intent intent) {
        if (e0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i5 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        O o7 = this.mHost;
        FragmentActivity fragmentActivity = o7 == null ? null : o7.f18332a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onAttach((Activity) fragmentActivity);
        }
    }

    @Deprecated
    public void onAttachFragment(F f10) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        e0 e0Var = this.mChildFragmentManager;
        if (e0Var.f18427u >= 1) {
            return;
        }
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(1);
    }

    public Animation onCreateAnimation(int i5, boolean z2, int i10) {
        return null;
    }

    public Animator onCreateAnimator(int i5, boolean z2, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            return layoutInflater.inflate(i5, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
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

    public void onHiddenChanged(boolean z2) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        O o7 = this.mHost;
        FragmentActivity fragmentActivity = o7 == null ? null : o7.f18332a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onInflate((Activity) fragmentActivity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z2) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z2) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (e0.J(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(4);
    }

    public void performAttach() {
        Iterator<D> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f18333b);
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f18421o.iterator();
        while (it2.hasNext()) {
            ((i0) it2.next()).a(this);
        }
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(0);
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
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new C1436z(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(EnumC1449m.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z2 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z2;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.O();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new w0(this, getViewModelStore(), new RunnableC1431u(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f18561d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (e0.J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.V.h(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.V.i(this.mView, this.mViewLifecycleOwner);
        tg.b.O(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(EnumC1449m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            w0 w0Var = this.mViewLifecycleOwner;
            w0Var.b();
            if (w0Var.f18561d.f18692d.compareTo(EnumC1450n.f18678c) >= 0) {
                this.mViewLifecycleOwner.a(EnumC1449m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        C4430w c4430w = J1.a.a(this).f5541b.f5538b;
        int i5 = c4430w.f47566c;
        for (int i10 = 0; i10 < i5; i10++) {
            ((J1.b) c4430w.f47565b[i10]).k();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onDetach()"));
        }
        e0 e0Var = this.mChildFragmentManager;
        if (e0Var.f18402I) {
            return;
        }
        e0Var.l();
        this.mChildFragmentManager = new f0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z2) {
        onMultiWindowModeChanged(z2);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1449m.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(EnumC1449m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z2) {
        onPictureInPictureModeChanged(z2);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z2 = true;
        }
        return this.mChildFragmentManager.t(menu) | z2;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM = e0.M(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM);
            onPrimaryNavigationFragmentChanged(zM);
            e0 e0Var = this.mChildFragmentManager;
            e0Var.d0();
            e0Var.r(e0Var.f18431y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1459x c1459x = this.mLifecycleRegistry;
        EnumC1449m enumC1449m = EnumC1449m.ON_RESUME;
        c1459x.f(enumC1449m);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f18561d.f(enumC1449m);
        }
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.O();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1459x c1459x = this.mLifecycleRegistry;
        EnumC1449m enumC1449m = EnumC1449m.ON_START;
        c1459x.f(enumC1449m);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f18561d.f(enumC1449m);
        }
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(5);
    }

    public void performStop() {
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18401H = true;
        e0Var.f18406N.f18457g = true;
        e0Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1449m.ON_STOP);
        }
        this.mLifecycleRegistry.f(EnumC1449m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        B().f18312s = true;
    }

    public final <I, O> AbstractC2655c registerForActivityResult(AbstractC2762a abstractC2762a, InterfaceC2654b interfaceC2654b) {
        return F(abstractC2762a, new A(this, 0), interfaceC2654b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i5) {
        if (this.mHost == null) {
            throw new IllegalStateException(M6.p("Fragment ", this, " not attached to Activity"));
        }
        e0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f18397D == null) {
            parentFragmentManager.f18428v.getClass();
            AbstractC3340k.e(permissions, "permissions");
        } else {
            parentFragmentManager.f18398E.addLast(new C1410a0(this.mWho, i5));
            parentFragmentManager.f18397D.a(permissions);
        }
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final e0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " not attached to a host."));
    }

    public final F requireParentFragment() {
        F parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(M6.p("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(M6.p("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.U(bundle);
        e0 e0Var = this.mChildFragmentManager;
        e0Var.f18400G = false;
        e0Var.f18401H = false;
        e0Var.f18406N.f18457g = false;
        e0Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C0(M6.p("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(EnumC1449m.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        B().f18309p = Boolean.valueOf(z2);
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        B().f18308o = Boolean.valueOf(z2);
    }

    public void setAnimations(int i5, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i5 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        B().f18296b = i5;
        B().f18297c = i10;
        B().f18298d = i11;
        B().f18299e = i12;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(X0.U u10) {
        B().getClass();
    }

    public void setEnterTransition(Object obj) {
        B().f18303i = obj;
    }

    public void setExitSharedElementCallback(X0.U u10) {
        B().getClass();
    }

    public void setExitTransition(Object obj) {
        B().k = obj;
    }

    public void setFocusedView(View view) {
        B().f18311r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z2) {
        if (this.mHasMenu != z2) {
            this.mHasMenu = z2;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((J) this.mHost).f18323e.invalidateMenu();
        }
    }

    public void setInitialSavedState(E e7) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (e7 == null || (bundle = e7.f18313a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z2) {
        if (this.mMenuVisible != z2) {
            this.mMenuVisible = z2;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((J) this.mHost).f18323e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i5) {
        if (this.mAnimationInfo == null && i5 == 0) {
            return;
        }
        B();
        this.mAnimationInfo.f18300f = i5;
    }

    public void setPopDirection(boolean z2) {
        if (this.mAnimationInfo == null) {
            return;
        }
        B().f18295a = z2;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        B().f18310q = f10;
    }

    public void setReenterTransition(Object obj) {
        B().f18305l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        D1.c cVar = D1.d.f2276a;
        D1.d.b(new D1.f(this, "Attempting to set retain instance for fragment " + this));
        D1.d.a(this).getClass();
        this.mRetainInstance = z2;
        e0 e0Var = this.mFragmentManager;
        if (e0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z2) {
            e0Var.f18406N.c(this);
        } else {
            e0Var.f18406N.g(this);
        }
    }

    public void setReturnTransition(Object obj) {
        B().f18304j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        B().f18306m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        B();
        C c10 = this.mAnimationInfo;
        c10.f18301g = arrayList;
        c10.f18302h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        B().f18307n = obj;
    }

    @Deprecated
    public void setTargetFragment(F f10, int i5) {
        if (f10 != null) {
            D1.c cVar = D1.d.f2276a;
            D1.d.b(new D1.g(this, "Attempting to set target fragment " + f10 + " with request code " + i5 + " for fragment " + this));
            D1.d.a(this).getClass();
        }
        e0 e0Var = this.mFragmentManager;
        e0 e0Var2 = f10 != null ? f10.mFragmentManager : null;
        if (e0Var != null && e0Var2 != null && e0Var != e0Var2) {
            throw new IllegalArgumentException(M6.p("Fragment ", f10, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (F fD = f10; fD != null; fD = fD.D(false)) {
            if (fD.equals(this)) {
                throw new IllegalArgumentException("Setting " + f10 + " as the target of " + this + " would create a target cycle");
            }
        }
        if (f10 == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || f10.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = f10;
        } else {
            this.mTargetWho = f10.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i5;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        D1.c cVar = D1.d.f2276a;
        D1.d.b(new D1.a(this, "Attempting to set user visible hint to " + z2 + " for fragment " + this));
        D1.d.a(this).getClass();
        boolean z10 = false;
        if (!this.mUserVisibleHint && z2 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            e0 e0Var = this.mFragmentManager;
            l0 l0VarG = e0Var.g(this);
            F f10 = l0VarG.f18480c;
            if (f10.mDeferStart) {
                if (e0Var.f18409b) {
                    e0Var.f18403J = true;
                } else {
                    f10.mDeferStart = false;
                    l0VarG.k();
                }
            }
        }
        this.mUserVisibleHint = z2;
        if (this.mState < 5 && !z2) {
            z10 = true;
        }
        this.mDeferStart = z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        O o7 = this.mHost;
        if (o7 != null) {
            return AbstractC1274b.b(((J) o7).f18323e, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i5) {
        startActivityForResult(intent, i5, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i5, Intent intent2, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(M6.p("Fragment ", this, " not attached to Activity"));
        }
        if (e0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i5 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        e0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f18396C == null) {
            O o7 = parentFragmentManager.f18428v;
            o7.getClass();
            AbstractC3340k.e(intent, "intent");
            if (i5 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            FragmentActivity fragmentActivity = o7.f18332a;
            if (fragmentActivity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            fragmentActivity.startIntentSenderForResult(intent, i5, intent2, i10, i11, i12, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (e0.J(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        AbstractC3340k.e(intent, "intentSender");
        g.j jVar = new g.j(intent, intent2, i10, i11);
        parentFragmentManager.f18398E.addLast(new C1410a0(this.mWho, i5));
        if (e0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.f18396C.a(jVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !B().f18312s) {
            return;
        }
        if (this.mHost == null) {
            B().f18312s = false;
        } else if (Looper.myLooper() != this.mHost.f18334c.getLooper()) {
            this.mHost.f18334c.postAtFrontOfQueue(new RunnableC1433w(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public Activity u() {
        return getActivity();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static F instantiate(Context context, String str, Bundle bundle) {
        try {
            F f10 = (F) W.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle == null) {
                return f10;
            }
            bundle.setClassLoader(f10.getClass().getClassLoader());
            f10.setArguments(bundle);
            return f10;
        } catch (IllegalAccessException e7) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7, 6);
        } catch (InstantiationException e10) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10, 6);
        } catch (NoSuchMethodException e11) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11, 6);
        } catch (InvocationTargetException e12) {
            throw new E5.Q(AbstractC0279p0.l("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12, 6);
        }
    }

    public final FragmentActivity getActivity() {
        O o7 = this.mHost;
        if (o7 == null) {
            return null;
        }
        return o7.f18332a;
    }

    public final String getString(int i5, Object... objArr) {
        return getResources().getString(i5, objArr);
    }

    public final void postponeEnterTransition(long j8, TimeUnit timeUnit) {
        B().f18312s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        e0 e0Var = this.mFragmentManager;
        if (e0Var != null) {
            this.mPostponedHandler = e0Var.f18428v.f18334c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j8));
    }

    public final <I, O> AbstractC2655c registerForActivityResult(AbstractC2762a abstractC2762a, g.h hVar, InterfaceC2654b interfaceC2654b) {
        return F(abstractC2762a, new A(hVar, 2), interfaceC2654b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        O o7 = this.mHost;
        if (o7 == null) {
            throw new IllegalStateException(M6.p("Fragment ", this, " not attached to Activity"));
        }
        AbstractC3340k.e(intent, "intent");
        Y0.e.startActivity(o7.f18333b, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(M6.p("Fragment ", this, " not attached to Activity"));
        }
        e0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f18395B != null) {
            parentFragmentManager.f18398E.addLast(new C1410a0(this.mWho, i5));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f18395B.a(intent);
            return;
        }
        O o7 = parentFragmentManager.f18428v;
        o7.getClass();
        AbstractC3340k.e(intent, "intent");
        if (i5 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        Y0.e.startActivity(o7.f18333b, intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        O o7 = this.mHost;
        if (o7 != null) {
            FragmentActivity fragmentActivity = ((J) o7).f18323e;
            LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f18413f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
