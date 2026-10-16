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
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ar implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller, ContextAware {
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
    am mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    bv mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    private final ao mContextAwareAttachListener;
    final ContextAwareHelper mContextAwareHelper;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    bv mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    ba<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<ao> mOnPreAttachedListeners;
    ar mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final ao mSavedStateAttachListener;
    SavedStateRegistryController mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    ar mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    private final cf mTracer;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    cr mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    public ar() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new bv();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new ae(this, 3, null);
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mContextAwareHelper = new ContextAwareHelper();
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mTracer = new cf(this);
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new ah(this);
        this.mContextAwareAttachListener = new ai(this);
        initLifecycle();
    }

    private am ensureAnimationInfo() {
        am amVar = this.mAnimationInfo;
        if (amVar != null) {
            return amVar;
        }
        am amVar2 = new am();
        this.mAnimationInfo = amVar2;
        return amVar2;
    }

    private int getMinimumMaxLifecycleState() {
        return (this.mMaxState == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? this.mMaxState.ordinal() : Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private ar getTargetFragment(boolean z) {
        String str;
        if (z) {
            FragmentStrictMode.onGetTargetFragmentUsage(this);
        }
        ar arVar = this.mTarget;
        if (arVar != null) {
            return arVar;
        }
        bv bvVar = this.mFragmentManager;
        if (bvVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return bvVar.e(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.create(this);
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
    public static ar instantiate(Context context, String str, Bundle bundle) {
        try {
            ar arVar = (ar) az.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(arVar.getClass().getClassLoader());
                arVar.setArguments(bundle);
            }
            return arVar;
        } catch (IllegalAccessException e2) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new an(k.g(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e5);
        }
    }

    private <I, O> ActivityResultLauncher<I> prepareCallInternal(ActivityResultContract<I, O> activityResultContract, Function<Void, ActivityResultRegistry> function, ActivityResultCallback<O> activityResultCallback) {
        if (this.mState > 1) {
            throw new IllegalStateException(k.e(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new af(this, function, atomicReference, activityResultContract, activityResultCallback));
        return new ag(atomicReference, activityResultContract);
    }

    private void registerOnPreAttachListener(ao aoVar) {
        if (this.mState >= 0) {
            aoVar.a();
        } else {
            this.mOnPreAttachedListeners.add(aoVar);
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    public void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        bv bvVar;
        am amVar = this.mAnimationInfo;
        if (amVar != null) {
            amVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (bvVar = this.mFragmentManager) == null) {
            return;
        }
        da daVarB = da.b(viewGroup, bvVar);
        daVarB.o();
        if (z) {
            this.mHost.j().post(new ae(daVarB, 5, null));
        } else {
            daVarB.l();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    ay createFragmentContainer() {
        return new aj(this);
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
        ar targetFragment = getTargetFragment(false);
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
            LoaderManager.getInstance(this).dump(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.ae(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    ar findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.i(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final av getActivity() {
        ba<?> baVar = this.mHost;
        if (baVar == null) {
            return null;
        }
        return (av) baVar.h();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        am amVar = this.mAnimationInfo;
        if (amVar == null || (bool = amVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        am amVar = this.mAnimationInfo;
        if (amVar == null || (bool = amVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final bv getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        ba<?> baVar = this.mHost;
        if (baVar == null) {
            return null;
        }
        return baVar.i();
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
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
        if (application == null && bv.aM(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
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
            if (application == null && bv.aM(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 0;
        }
        return amVar.f121b;
    }

    public Object getEnterTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.f128i;
    }

    SharedElementCallback getEnterTransitionCallback() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.q;
    }

    int getExitAnim() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 0;
        }
        return amVar.f122c;
    }

    public Object getExitTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.f130k;
    }

    SharedElementCallback getExitTransitionCallback() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.r;
    }

    View getFocusedView() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.t;
    }

    @Deprecated
    public final bv getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        ba<?> baVar = this.mHost;
        if (baVar == null) {
            return null;
        }
        return baVar.d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        ba<?> baVar = this.mHost;
        if (baVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = baVar.c();
        LayoutInflaterCompat.setFactory2(layoutInflaterC, this.mChildFragmentManager.v());
        return layoutInflaterC;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    int getNextTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 0;
        }
        return amVar.f125f;
    }

    public final ar getParentFragment() {
        return this.mParentFragment;
    }

    public final bv getParentFragmentManager() {
        bv bvVar = this.mFragmentManager;
        if (bvVar != null) {
            return bvVar;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " not associated with a fragment manager."));
    }

    boolean getPopDirection() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return false;
        }
        return amVar.f120a;
    }

    int getPopEnterAnim() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 0;
        }
        return amVar.f123d;
    }

    int getPopExitAnim() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 0;
        }
        return amVar.f124e;
    }

    float getPostOnViewCreatedAlpha() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return 1.0f;
        }
        return amVar.s;
    }

    public Object getReenterTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        Object obj = amVar.f131l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.onGetRetainInstanceUsage(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        Object obj = amVar.f129j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public Object getSharedElementEnterTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        return amVar.m;
    }

    public Object getSharedElementReturnTransition() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return null;
        }
        Object obj = amVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        am amVar = this.mAnimationInfo;
        return (amVar == null || (arrayList = amVar.f126g) == null) ? new ArrayList<>() : arrayList;
    }

    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        am amVar = this.mAnimationInfo;
        return (amVar == null || (arrayList = amVar.f127h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.onGetTargetFragmentRequestCodeUsage(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        cr crVar = this.mViewLifecycleOwner;
        if (crVar != null) {
            return crVar;
        }
        throw new IllegalStateException(k.e(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.w(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
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
        this.mChildFragmentManager = new bv();
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
        ar arVar;
        if (this.mHidden) {
            return true;
        }
        return (this.mFragmentManager == null || (arVar = this.mParentFragment) == null || !arVar.isHidden()) ? false : true;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || bv.aY(this.mParentFragment);
        }
        return false;
    }

    boolean isPostponed() {
        am amVar = this.mAnimationInfo;
        if (amVar == null) {
            return false;
        }
        return amVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        bv bvVar = this.mFragmentManager;
        if (bvVar == null) {
            return false;
        }
        return bvVar.aO();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* renamed from: lambda$performAttach$2$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m36lambda$performAttach$2$androidsupportv4appFragment() {
        onAttach(this.mHost.i());
    }

    /* renamed from: lambda$performCreate$4$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m38lambda$performCreate$4$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    /* renamed from: lambda$performCreateView$5$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m39lambda$performCreateView$5$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.c(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    /* renamed from: lambda$performCreateView$6$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m40lambda$performCreateView$6$androidsupportv4appFragment(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* renamed from: lambda$performDestroy$19$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m41lambda$performDestroy$19$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    /* renamed from: lambda$performDestroyView$18$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m42lambda$performDestroyView$18$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
    }

    /* renamed from: lambda$performPause$14$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m43lambda$performPause$14$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
    }

    /* renamed from: lambda$performPause$15$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m44lambda$performPause$15$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    /* renamed from: lambda$performResume$11$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m45lambda$performResume$11$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    /* renamed from: lambda$performResume$12$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m46lambda$performResume$12$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_RESUME);
    }

    /* renamed from: lambda$performStart$10$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m48lambda$performStart$10$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_START);
    }

    /* renamed from: lambda$performStart$9$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m49lambda$performStart$9$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    /* renamed from: lambda$performStop$16$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m50lambda$performStop$16$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
    }

    /* renamed from: lambda$performStop$17$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m51lambda$performStop$17$androidsupportv4appFragment() {
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    /* renamed from: lambda$performViewCreated$7$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m52lambda$performViewCreated$7$androidsupportv4appFragment(Bundle bundle) {
        onViewCreated(this.mView, bundle);
    }

    /* renamed from: lambda$restoreViewState$1$android-support-v4-app-Fragment, reason: not valid java name */
    /* synthetic */ void m54lambda$restoreViewState$1$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.as();
    }

    @Deprecated
    /* renamed from: onActivityCreated, reason: merged with bridge method [inline-methods] */
    public void m35lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        ba<?> baVar = this.mHost;
        Activity activityH = baVar == null ? null : baVar.h();
        if (activityH != null) {
            this.mCalled = false;
            onAttach(activityH);
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
    public void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        bv bvVar = this.mChildFragmentManager;
        if (bvVar.f199e > 0) {
            return;
        }
        bvVar.P();
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
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
        ba<?> baVar = this.mHost;
        Activity activityH = baVar == null ? null : baVar.h();
        if (activityH != null) {
            this.mCalled = false;
            onInflate(activityH, attributeSet, bundle);
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
    public void m53lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    @Override // androidx.activity.contextaware.ContextAware
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.peekAvailableContext();
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.as();
        this.mState = 3;
        this.mCalled = false;
        this.mTracer.a("Fragment#onActivityCreated", new ac(this, bundle, 2));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.M();
    }

    void performAttach() {
        ArrayList<ao> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.F(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        this.mTracer.a("Fragment#onAttach", new r(this, 3));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        this.mFragmentManager.U(this);
        this.mChildFragmentManager.N();
    }

    void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.aH(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.as();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new ak(this));
        this.mTracer.a("Fragment#onCreate", new ac(this, bundle, 5));
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_CREATE)", new ae(this, 2));
    }

    boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.aI(menu, menuInflater) | z;
    }

    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.as();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new cr(this, getViewModelStore(), new r(this, 9));
        this.mTracer.a("Fragment#onCreateView", new ad(this, layoutInflater, viewGroup, bundle, 0));
        View view = this.mView;
        cr crVar = this.mViewLifecycleOwner;
        if (view == null) {
            if (crVar.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        crVar.b();
        if (bv.aM(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
        ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
        ViewTreeSavedStateRegistryOwner.set(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.Q();
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)", new ae(this, 1));
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.mTracer.a("Fragment#onDestroy", new ae(this, 0));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    void performDestroyView() {
        this.mChildFragmentManager.R();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)", new r(this, 4));
        }
        this.mState = 1;
        this.mCalled = false;
        this.mTracer.a("Fragment#onDestroyView", new r(this, 5));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        LoaderManager.getInstance(this).markForRedelivery();
        this.mPerformedCreateView = false;
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        this.mTracer.a("Fragment#onDetach", new r(this, 13));
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        if (this.mChildFragmentManager.aL()) {
            return;
        }
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager = new bv();
    }

    LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.aJ(menuItem);
    }

    void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.W(menu);
    }

    void performPause() {
        this.mChildFragmentManager.X();
        if (this.mView != null) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)", new r(this, 18));
        }
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)", new r(this, 19));
        this.mState = 6;
        this.mCalled = false;
        this.mTracer.a("Fragment#onPause", new r(this, 20));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.aK(menu) | z;
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zAN = this.mFragmentManager.aN(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zAN) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zAN);
            onPrimaryNavigationFragmentChanged(zAN);
            this.mChildFragmentManager.Z();
        }
    }

    void performResume() {
        this.mChildFragmentManager.as();
        this.mChildFragmentManager.be(true);
        this.mState = 7;
        this.mCalled = false;
        this.mTracer.a("Fragment#onResume", new r(this, 14));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onResume()"));
        }
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_RESUME)", new r(this, 15));
        if (this.mView != null) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)", new r(this, 16));
        }
        this.mChildFragmentManager.aa();
    }

    void performSaveInstanceState(Bundle bundle) {
        this.mTracer.a("Fragment#onSaveInstanceState", new ac(this, bundle, 0));
    }

    void performStart() {
        this.mChildFragmentManager.as();
        this.mChildFragmentManager.be(true);
        this.mState = 5;
        this.mCalled = false;
        this.mTracer.a("Fragment#onStart", new r(this, 6));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onStart()"));
        }
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_START)", new r(this, 7));
        if (this.mView != null) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_START)", new r(this, 8));
        }
        this.mChildFragmentManager.ab();
    }

    void performStop() {
        this.mChildFragmentManager.ac();
        if (this.mView != null) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)", new r(this, 10));
        }
        this.mTracer.a("FragmentLifecycle#handleLifecycleEvent(ON_STOP)", new r(this, 11));
        this.mState = 4;
        this.mCalled = false;
        this.mTracer.a("Fragment#onStop", new r(this, 12));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        this.mTracer.a("Fragment#onViewCreated", new ac(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 4));
        this.mChildFragmentManager.ad();
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().u = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        bv bvVar = this.mFragmentManager;
        if (bvVar != null) {
            handler = bvVar.p().j();
            this.mPostponedHandler = handler;
        } else {
            handler = new Handler(Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new al(this, 1), activityResultCallback);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) {
        if (this.mHost == null) {
            throw new IllegalStateException(k.e(this, "Fragment ", " not attached to Activity"));
        }
        getParentFragmentManager().ao(this, strArr, i2);
    }

    public final av requireActivity() {
        av activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final bv requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " not attached to a host."));
    }

    public final ar requireParentFragment() {
        ar parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(k.e(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(k.e(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.az(bundle);
        this.mChildFragmentManager.P();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        this.mTracer.a("Fragment#onViewStateRestored", new ac(this, bundle, 3));
        if (!this.mCalled) {
            throw new db(k.e(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mTracer.a("FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)", new r(this, 17));
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0) {
            i2 = 0;
            if (i3 == 0) {
                if (i4 != 0) {
                    i3 = 0;
                } else {
                    if (i5 == 0) {
                        return;
                    }
                    i3 = 0;
                    i4 = 0;
                }
            }
        }
        ensureAnimationInfo().f121b = i2;
        ensureAnimationInfo().f122c = i3;
        ensureAnimationInfo().f123d = i4;
        ensureAnimationInfo().f124e = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().q = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f128i = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().r = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f130k = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.e();
        }
    }

    public void setInitialSavedState(aq aqVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (aqVar != null && (bundle = aqVar.f132a) != null) {
            bundle2 = bundle;
        }
        this.mSavedFragmentState = bundle2;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.e();
            }
        }
    }

    void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f125f = i2;
    }

    void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f120a = z;
    }

    void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().s = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f131l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        FragmentStrictMode.onSetRetainInstanceUsage(this);
        this.mRetainInstance = z;
        bv bvVar = this.mFragmentManager;
        if (bvVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            bvVar.E(this);
        } else {
            bvVar.ax(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f129j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        am amVar = this.mAnimationInfo;
        amVar.f126g = arrayList;
        amVar.f127h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(ar arVar, int i2) {
        if (arVar != null) {
            FragmentStrictMode.onSetTargetFragmentUsage(this, arVar, i2);
        }
        bv bvVar = this.mFragmentManager;
        bv bvVar2 = arVar != null ? arVar.mFragmentManager : null;
        if (bvVar != null && bvVar2 != null && bvVar != bvVar2) {
            throw new IllegalArgumentException(k.e(arVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ar targetFragment = arVar; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + arVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (arVar == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || arVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = arVar;
                this.mTargetRequestCode = i2;
            }
            this.mTargetWho = arVar.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        bv bvVar;
        FragmentStrictMode.onSetUserVisibleHint(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && (bvVar = this.mFragmentManager) != null && isAdded() && this.mIsCreated) {
            bvVar.au(bvVar.s(this));
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
        ba<?> baVar = this.mHost;
        if (baVar != null) {
            return baVar.f(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        ba<?> baVar = this.mHost;
        if (baVar == null) {
            throw new IllegalStateException(k.e(this, "Fragment ", " not attached to Activity"));
        }
        baVar.l(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(k.e(this, "Fragment ", " not attached to Activity"));
        }
        getParentFragmentManager().ap(this, intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        Bundle bundle2;
        if (this.mHost == null) {
            throw new IllegalStateException(k.e(this, "Fragment ", " not attached to Activity"));
        }
        if (bv.aM(2)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i2);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            bundle2 = bundle;
            sb.append(bundle2);
            Log.v("FragmentManager", sb.toString());
        } else {
            bundle2 = bundle;
        }
        getParentFragmentManager().aq(this, intentSender, i2, intent, i3, i4, i5, bundle2);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.j().getLooper()) {
            this.mHost.j().postAtFrontOfQueue(new ae(this, 4, null));
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

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new al(activityResultRegistry, 0), activityResultCallback);
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(ar arVar) {
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
    public void m47x22bc4f96(Bundle bundle) {
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

    @Deprecated
    public final ar getTargetFragment() {
        return getTargetFragment(true);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
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
        if (bv.aM(3)) {
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
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public static ar instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public ar(int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}
