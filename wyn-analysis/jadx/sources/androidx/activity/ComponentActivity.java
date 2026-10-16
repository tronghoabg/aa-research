package androidx.activity;

import X0.C1281i;
import X0.O;
import X0.P;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.C1447k;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.EnumC1450n;
import androidx.lifecycle.InterfaceC1445i;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.S;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import com.wynauto.wyn.R;
import f.C2543a;
import f.InterfaceC2544b;
import g.AbstractC2655c;
import g.InterfaceC2654b;
import h.AbstractC2762a;
import j1.InterfaceC3073a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k1.C3125l;
import k1.C3126m;
import k1.InterfaceC3123j;
import k1.InterfaceC3127n;
import kotlin.jvm.internal.AbstractC3340k;
import n3.C3592d;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements f0, InterfaceC1445i, n3.f, y, g.i, Y0.f, Y0.g, O, P, InterfaceC3123j {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17695a = 0;
    private final g.h mActivityResultRegistry;
    private int mContentLayoutId;
    final C2543a mContextAwareHelper;
    private d0 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final n mFullyDrawnReporter;
    private final C1459x mLifecycleRegistry;
    private final C3126m mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private w mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC3073a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3073a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3073a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC3073a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC3073a> mOnTrimMemoryListeners;
    final k mReportFullyDrawnExecutor;
    final n3.e mSavedStateRegistryController;
    private e0 mViewModelStore;

    public ComponentActivity() {
        this.mContextAwareHelper = new C2543a();
        this.mMenuHostHelper = new C3126m(new C8.g(this, 25));
        this.mLifecycleRegistry = new C1459x(this);
        n3.e eVar = new n3.e(this);
        this.mSavedStateRegistryController = eVar;
        this.mOnBackPressedDispatcher = null;
        l lVar = new l(this);
        this.mReportFullyDrawnExecutor = lVar;
        this.mFullyDrawnReporter = new n(lVar, new Af.q(this, 4));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new f(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i5 = Build.VERSION.SDK_INT;
        getLifecycle().a(new g(this, 1));
        getLifecycle().a(new g(this, 0));
        getLifecycle().a(new g(this, 2));
        eVar.a();
        V.d(this);
        if (i5 <= 23) {
            AbstractC1451o lifecycle = getLifecycle();
            g gVar = new g();
            gVar.f17710b = this;
            lifecycle.a(gVar);
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new d(this, 0));
        addOnContextAvailableListener(new InterfaceC2544b() { // from class: androidx.activity.e
            @Override // f.InterfaceC2544b
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity.g(this.f17703a);
            }
        });
    }

    public static void g(ComponentActivity componentActivity) {
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            g.h hVar = componentActivity.mActivityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            hVar.f35471d = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = hVar.f35474g;
            bundle2.putAll(bundle);
            for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                String str = stringArrayList.get(i5);
                HashMap map = hVar.f35469b;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = hVar.f35468a;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i5);
                num2.intValue();
                String str2 = stringArrayList.get(i5);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    public static Bundle j(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        g.h hVar = componentActivity.mActivityResultRegistry;
        hVar.getClass();
        HashMap map = hVar.f35469b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f35471d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f35474g.clone());
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // k1.InterfaceC3123j
    public void addMenuProvider(InterfaceC3127n interfaceC3127n) {
        C3126m c3126m = this.mMenuHostHelper;
        c3126m.f38847b.add(interfaceC3127n);
        c3126m.f38846a.run();
    }

    @Override // Y0.f
    public final void addOnConfigurationChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnConfigurationChangedListeners.add(interfaceC3073a);
    }

    public final void addOnContextAvailableListener(InterfaceC2544b listener) {
        C2543a c2543a = this.mContextAwareHelper;
        c2543a.getClass();
        AbstractC3340k.e(listener, "listener");
        ComponentActivity componentActivity = c2543a.f34730b;
        if (componentActivity != null) {
            listener.a(componentActivity);
        }
        c2543a.f34729a.add(listener);
    }

    @Override // X0.O
    public final void addOnMultiWindowModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC3073a);
    }

    public final void addOnNewIntentListener(InterfaceC3073a interfaceC3073a) {
        this.mOnNewIntentListeners.add(interfaceC3073a);
    }

    @Override // X0.P
    public final void addOnPictureInPictureModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC3073a);
    }

    @Override // Y0.g
    public final void addOnTrimMemoryListener(InterfaceC3073a interfaceC3073a) {
        this.mOnTrimMemoryListeners.add(interfaceC3073a);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this.mViewModelStore = jVar.f17713b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new e0();
            }
        }
    }

    @Override // g.i
    public final g.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1445i
    public H1.b getDefaultViewModelCreationExtras() {
        H1.c cVar = new H1.c();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f4871a;
        if (application != null) {
            linkedHashMap.put(c0.f18661d, getApplication());
        }
        linkedHashMap.put(V.f18636a, this);
        linkedHashMap.put(V.f18637b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(V.f18638c, getIntent().getExtras());
        }
        return cVar;
    }

    public d0 getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new Y(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public n getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f17712a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.InterfaceC1457v
    public AbstractC1451o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.y
    public final w getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new w(new h(this));
            getLifecycle().a(new g(this, 3));
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f40911b;
    }

    @Override // androidx.lifecycle.f0
    public e0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        V.h(getWindow().getDecorView(), this);
        V.i(getWindow().getDecorView(), this);
        tg.b.O(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC3340k.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC3340k.e(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i5, int i10, Intent intent) {
        if (this.mActivityResultRegistry.a(i5, i10, intent)) {
            return;
        }
        super.onActivityResult(i5, i10, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC3073a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        C2543a c2543a = this.mContextAwareHelper;
        c2543a.getClass();
        c2543a.f34730b = this;
        Iterator it = c2543a.f34729a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2544b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i5 = S.f18625b;
        androidx.lifecycle.P.b(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i5, menu);
        C3126m c3126m = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c3126m.f38847b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.V) ((InterfaceC3127n) it.next())).f18344a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (super.onMenuItemSelected(i5, menuItem)) {
            return true;
        }
        if (i5 == 0) {
            return this.mMenuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC3073a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C1281i(z2));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC3073a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i5, Menu menu) {
        Iterator it = this.mMenuHostHelper.f38847b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.V) ((InterfaceC3127n) it.next())).f18344a.q(menu);
        }
        super.onPanelClosed(i5, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC3073a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new X0.S(z2));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i5, View view, Menu menu) {
        if (i5 != 0) {
            return true;
        }
        super.onPreparePanel(i5, view, menu);
        Iterator it = this.mMenuHostHelper.f38847b.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.V) ((InterfaceC3127n) it.next())).f18344a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i5, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i5, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i5, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        e0 e0Var = this.mViewModelStore;
        if (e0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            e0Var = jVar.f17713b;
        }
        if (e0Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f17712a = objOnRetainCustomNonConfigurationInstance;
        jVar2.f17713b = e0Var;
        return jVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1451o lifecycle = getLifecycle();
        if (lifecycle instanceof C1459x) {
            ((C1459x) lifecycle).h();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        super.onTrimMemory(i5);
        Iterator<InterfaceC3073a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i5));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f34730b;
    }

    public final <I, O> AbstractC2655c registerForActivityResult(AbstractC2762a abstractC2762a, g.h hVar, InterfaceC2654b interfaceC2654b) {
        return hVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC2762a, interfaceC2654b);
    }

    @Override // k1.InterfaceC3123j
    public void removeMenuProvider(InterfaceC3127n interfaceC3127n) {
        this.mMenuHostHelper.b(interfaceC3127n);
    }

    @Override // Y0.f
    public final void removeOnConfigurationChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnConfigurationChangedListeners.remove(interfaceC3073a);
    }

    public final void removeOnContextAvailableListener(InterfaceC2544b listener) {
        C2543a c2543a = this.mContextAwareHelper;
        c2543a.getClass();
        AbstractC3340k.e(listener, "listener");
        c2543a.f34729a.remove(listener);
    }

    @Override // X0.O
    public final void removeOnMultiWindowModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC3073a);
    }

    public final void removeOnNewIntentListener(InterfaceC3073a interfaceC3073a) {
        this.mOnNewIntentListeners.remove(interfaceC3073a);
    }

    @Override // X0.P
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC3073a);
    }

    @Override // Y0.g
    public final void removeOnTrimMemoryListener(InterfaceC3073a interfaceC3073a) {
        this.mOnTrimMemoryListeners.remove(interfaceC3073a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (tg.b.F()) {
                Trace.beginSection(tg.b.U("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            n nVar = this.mFullyDrawnReporter;
            synchronized (nVar.f17721a) {
                try {
                    nVar.f17722b = true;
                    Iterator it = nVar.f17723c.iterator();
                    while (it.hasNext()) {
                        ((tf.a) it.next()).invoke();
                    }
                    nVar.f17723c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5) {
        super.startActivityForResult(intent, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i5, Bundle bundle) {
        super.startActivityForResult(intent, i5, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i5, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i5, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2, Configuration newConfig) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z2, newConfig);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC3073a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                InterfaceC3073a next = it.next();
                AbstractC3340k.e(newConfig, "newConfig");
                next.accept(new C1281i(z2));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2, Configuration newConfig) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z2, newConfig);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC3073a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                InterfaceC3073a next = it.next();
                AbstractC3340k.e(newConfig, "newConfig");
                next.accept(new X0.S(z2));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> AbstractC2655c registerForActivityResult(AbstractC2762a abstractC2762a, InterfaceC2654b interfaceC2654b) {
        return registerForActivityResult(abstractC2762a, this.mActivityResultRegistry, interfaceC2654b);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC3127n interfaceC3127n, InterfaceC1457v interfaceC1457v) {
        C3126m c3126m = this.mMenuHostHelper;
        c3126m.f38847b.add(interfaceC3127n);
        c3126m.f38846a.run();
        AbstractC1451o lifecycle = interfaceC1457v.getLifecycle();
        HashMap map = c3126m.f38848c;
        C3125l c3125l = (C3125l) map.remove(interfaceC3127n);
        if (c3125l != null) {
            c3125l.f38842a.c(c3125l.f38843b);
            c3125l.f38843b = null;
        }
        map.put(interfaceC3127n, new C3125l(lifecycle, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.k(1, c3126m, interfaceC3127n)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final InterfaceC3127n interfaceC3127n, InterfaceC1457v interfaceC1457v, final EnumC1450n enumC1450n) {
        final C3126m c3126m = this.mMenuHostHelper;
        c3126m.getClass();
        AbstractC1451o lifecycle = interfaceC1457v.getLifecycle();
        HashMap map = c3126m.f38848c;
        C3125l c3125l = (C3125l) map.remove(interfaceC3127n);
        if (c3125l != null) {
            c3125l.f38842a.c(c3125l.f38843b);
            c3125l.f38843b = null;
        }
        map.put(interfaceC3127n, new C3125l(lifecycle, new InterfaceC1455t() { // from class: k1.k
            @Override // androidx.lifecycle.InterfaceC1455t
            public final void onStateChanged(InterfaceC1457v interfaceC1457v2, EnumC1449m enumC1449m) {
                C3126m c3126m2 = c3126m;
                c3126m2.getClass();
                EnumC1449m.Companion.getClass();
                EnumC1450n state = enumC1450n;
                AbstractC3340k.e(state, "state");
                int iOrdinal = state.ordinal();
                EnumC1449m enumC1449m2 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : EnumC1449m.ON_RESUME : EnumC1449m.ON_START : EnumC1449m.ON_CREATE;
                Runnable runnable = c3126m2.f38846a;
                CopyOnWriteArrayList copyOnWriteArrayList = c3126m2.f38847b;
                InterfaceC3127n interfaceC3127n2 = interfaceC3127n;
                if (enumC1449m == enumC1449m2) {
                    copyOnWriteArrayList.add(interfaceC3127n2);
                    runnable.run();
                } else if (enumC1449m == EnumC1449m.ON_DESTROY) {
                    c3126m2.b(interfaceC3127n2);
                } else if (enumC1449m == C1447k.a(state)) {
                    copyOnWriteArrayList.remove(interfaceC3127n2);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i5) {
        this();
        this.mContentLayoutId = i5;
    }
}
