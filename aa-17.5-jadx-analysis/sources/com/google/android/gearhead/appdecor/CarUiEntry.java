package com.google.android.gearhead.appdecor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.apps.auto.components.drawer.AlphaJumpFab;
import com.google.android.apps.auto.components.drawer.AlphaJumpKeyboard;
import com.google.android.apps.auto.components.support.CarRestrictedEditText;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import defpackage.acow;
import defpackage.actd;
import defpackage.ebf;
import defpackage.fhl;
import defpackage.jmq;
import defpackage.krj;
import defpackage.lau;
import defpackage.lay;
import defpackage.lbg;
import defpackage.lza;
import defpackage.lzb;
import defpackage.lzc;
import defpackage.lzd;
import defpackage.lze;
import defpackage.mki;
import defpackage.mo;
import defpackage.moi;
import defpackage.ntb;
import defpackage.oht;
import defpackage.ohx;
import defpackage.omz;
import defpackage.ouz;
import defpackage.ovc;
import defpackage.ovi;
import defpackage.ovk;
import defpackage.ovq;
import defpackage.ovt;
import defpackage.ovw;
import defpackage.ovz;
import defpackage.owc;
import defpackage.owe;
import defpackage.owj;
import defpackage.qfg;
import defpackage.qfh;
import defpackage.qfi;
import defpackage.qfj;
import defpackage.qfl;
import defpackage.qfm;
import defpackage.qfn;
import defpackage.qfp;
import defpackage.qfs;
import defpackage.qfv;
import defpackage.qfy;
import defpackage.qga;
import defpackage.qgb;
import defpackage.qgc;
import defpackage.qgd;
import defpackage.qge;
import defpackage.qgf;
import defpackage.qgg;
import defpackage.qgh;
import defpackage.qgm;
import defpackage.qgn;
import defpackage.qgo;
import defpackage.qgp;
import defpackage.qgr;
import defpackage.qgs;
import defpackage.qgt;
import defpackage.qgu;
import defpackage.qgv;
import defpackage.qgw;
import defpackage.qgx;
import defpackage.qgz;
import defpackage.qhb;
import defpackage.qhe;
import defpackage.qhf;
import defpackage.qtu;
import defpackage.rax;
import defpackage.tmb;
import defpackage.wae;
import defpackage.whk;
import defpackage.ygr;
import defpackage.ykd;
import defpackage.ype;
import defpackage.yph;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class CarUiEntry {
    public static final /* synthetic */ int a = 0;
    private final Context appContext;
    private qtu appDecorService;
    private boolean appDecorServiceReadyHasCompleted;
    private qfh capabilityController;
    private qfi carAppLayout;
    private qfj carRegionController;
    private final CarRegionId carRegionId;
    private qfs demandSpaceController;
    private int drawerContentLayoutDescendantFocusability;
    private qga drawerController;
    private DrawerLayout drawerLayout;
    final qfp drivingStatusCallback;
    private qgb facetBarController;
    private final Handler handler;
    private qgc imeController;
    private qgd inputController;
    private final lzc interactionModerator;
    private boolean isRunning;
    private qgo memoryMonitorController;
    private qgp menuController;
    private boolean overrideStatusBarForSearch;
    private final Context sdkContext;
    private rax sdkContextWrapper;
    private qgx searchController;
    private CarRestrictedEditText searchEditText;
    private final ServiceConnection serviceConnection;
    private qgz statusBarController;
    private int statusBarViewDescendantFocusability;
    private qhf toastController;
    private boolean touchpadNavEnabled;
    private final boolean useConfigurationContext;
    private static final yph logger = yph.c("ADU.CarUiEntry");
    static final ygr<String> OPTIMIZED_CAR_ACTIVITY_PACKAGES = ygr.t("com.google.android.projection.gearhead", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", RemoteApiConstants.NOW_PACKAGE);

    public CarUiEntry(Context context, Context context2, LayoutInflater.Factory factory, int i, int i2) {
        this.handler = new Handler();
        this.isRunning = false;
        this.statusBarViewDescendantFocusability = 131072;
        this.drawerContentLayoutDescendantFocusability = 131072;
        this.drivingStatusCallback = new qfp(this);
        this.serviceConnection = new lbg(this, 2);
        this.appContext = context;
        this.sdkContext = createSdkContext(context, context2);
        this.carRegionId = new CarRegionId(i2, new CarDisplayId(i));
        try {
            int iA = owj.a(context);
            yph yphVar = logger;
            ((ype) ((ype) yphVar.f()).ai(7056)).R("Initializing CarUiEntry appSdkVersion: %d, appContext: %s, sdkContext: %s", Integer.valueOf(iA), context, context2);
            wae.c(context);
            lzc defaultInteractionModerator = getDefaultInteractionModerator();
            this.interactionModerator = defaultInteractionModerator;
            if (mki.a != null) {
                defaultInteractionModerator.a = ebf.j();
            }
            setLayoutInflaterFactory(factory);
            boolean z = context.getSharedPreferences("car_ui_entry", 0).getBoolean("use_configuration_context", true);
            this.useConfigurationContext = z;
            if (z) {
                this.sdkContextWrapper = createSdkConfigurationContext(context, context2);
            }
            if (useOptimizedCarActivity(context)) {
                ((ype) ((ype) yphVar.f()).ai((char) 7058)).y("Using optimized car activity controllers for %s", context.getPackageName());
                initializeOptimizedControllers();
            } else {
                ((ype) ((ype) yphVar.f()).ai((char) 7057)).y("Using legacy car activity controllers for %s", context.getPackageName());
                initializeLegacyControllers();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Cannot get app SDK version", e);
        }
    }

    private void applyConfigParams() {
        try {
            qtu qtuVar = this.appDecorService;
            qtuVar.getClass();
            Bundle bundleE = qtuVar.e();
            if (bundleE == null) {
                ((ype) ((ype) logger.h()).ai((char) 7059)).u("appDecorService.getConfigParams() returned null");
                return;
            }
            this.inputController.a(bundleE);
            this.menuController.s(bundleE);
            this.drawerController.o(bundleE);
            this.touchpadNavEnabled = bundleE.getBoolean("touchpad_nav_enabled");
            maybeUpdateConfigContextValue(bundleE.getBoolean("use_configuration_context", true));
        } catch (RemoteException | RuntimeException e) {
            ((ype) ((ype) ((ype) logger.g()).p(e)).ai((char) 7060)).u("appDecorService.getConfigParams() threw an exception");
        }
    }

    private void blockDescendantFocusability(StatusBarView statusBarView, DrawerContentLayout drawerContentLayout) {
        this.statusBarViewDescendantFocusability = statusBarView.getDescendantFocusability();
        this.drawerContentLayoutDescendantFocusability = drawerContentLayout.getDescendantFocusability();
        statusBarView.setDescendantFocusability(393216);
        drawerContentLayout.setDescendantFocusability(393216);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cleanupAppDecorService() {
        if (this.appDecorService != null) {
            this.statusBarController.b();
            qgb qgbVar = this.facetBarController;
            ((ype) qgb.a.l().ai((char) 7099)).u("onAppDecorServiceDisconnected");
            qgbVar.b = null;
            this.toastController.a = null;
            this.carRegionController.c = null;
            try {
                this.appDecorService.j(this.drivingStatusCallback);
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) logger.g()).p(e)).ai((char) 7063)).u("Error unregistering callback for AppDecorService");
            }
        }
        this.appDecorService = null;
    }

    private Context getSdkContext() {
        return this.useConfigurationContext ? this.sdkContextWrapper : this.sdkContext;
    }

    private oht getTelemetry() {
        if (mki.a != null) {
            ((ype) logger.l().ai((char) 7065)).u("Using CSL Telemetry");
            return ebf.j();
        }
        ((ype) logger.l().ai((char) 7064)).u("No Telemetry available.");
        return new ohx();
    }

    private void initializeLegacyControllers() {
        getSdkContext().setTheme(R.style.Theme_Gearhead_Projected);
        qge qgeVar = new qge(this.appContext, getSdkContext());
        this.carAppLayout = qgeVar;
        ViewGroup viewGroup = (ViewGroup) qgeVar.findViewById(R.id.system_layout_container);
        ViewGroup viewGroup2 = (ViewGroup) this.carAppLayout.findViewById(R.id.status_bar_container);
        final StatusBarView statusBarView = (StatusBarView) this.carAppLayout.findViewById(R.id.status_bar);
        View viewFindViewById = this.carAppLayout.findViewById(R.id.car_app_bar_background);
        ImageView imageView = statusBarView.b;
        this.searchEditText = (CarRestrictedEditText) statusBarView.findViewById(R.id.car_search_box_edit_text);
        ImageView imageView2 = statusBarView.i;
        DrawerLayout drawerLayout = (DrawerLayout) this.carAppLayout.findViewById(R.id.drawer_layout);
        this.drawerLayout = drawerLayout;
        final DrawerContentLayout drawerContentLayout = (DrawerContentLayout) drawerLayout.findViewById(R.id.drawer_content);
        Context context = drawerContentLayout.b;
        LayoutInflater.from(context).inflate(R.layout.adu_drawer, (ViewGroup) drawerContentLayout, true);
        drawerContentLayout.e = (ProgressBar) drawerContentLayout.findViewById(R.id.progress);
        drawerContentLayout.d = (PagedListView) drawerContentLayout.findViewById(R.id.menu_list);
        drawerContentLayout.f = (AlphaJumpFab) drawerContentLayout.findViewById(R.id.alpha_jump_fab);
        drawerContentLayout.g = (AlphaJumpKeyboard) drawerContentLayout.findViewById(R.id.alpha_jump_keyboard);
        drawerContentLayout.c = new qgw(drawerContentLayout.d, AnimationUtils.loadAnimation(context, R.anim.adu_plv_enter), AnimationUtils.loadAnimation(context, R.anim.adu_plv_exit), AnimationUtils.loadAnimation(context, R.anim.adu_plv_back));
        drawerContentLayout.h = (TextView) drawerContentLayout.findViewById(R.id.empty_view);
        drawerContentLayout.j = (ImageView) drawerContentLayout.findViewById(R.id.fundip_drawable);
        drawerContentLayout.j.setImageDrawable(omz.a(context));
        drawerContentLayout.i = drawerContentLayout.findViewById(R.id.fundip_container);
        drawerContentLayout.p = drawerContentLayout.findViewById(R.id.drawer_shadow);
        drawerContentLayout.q = context.getResources().getDimension(R.dimen.drawer_header_elevation);
        drawerContentLayout.r = context.getResources().getDimension(R.dimen.drawer_header_scroll_animation_distance);
        drawerContentLayout.p.setBackgroundColor(context.getColor(R.color.gearhead_sdk_card_background));
        drawerContentLayout.u = drawerContentLayout.findViewById(R.id.truncated_list_card);
        drawerContentLayout.u.setOnTouchListener(new qfv(0));
        ((TextView) drawerContentLayout.findViewById(R.id.truncated_list_text)).setText(drawerContentLayout.getContext().getResources().getText(R.string.content_browse_park_to_continue));
        drawerContentLayout.v = drawerContentLayout.findViewById(R.id.lockout_scrim);
        drawerContentLayout.v.setOnTouchListener(new qfv(2));
        drawerContentLayout.w = drawerContentLayout.findViewById(R.id.top_focus_dummy);
        drawerContentLayout.x = drawerContentLayout.findViewById(R.id.bottom_focus_dummy);
        drawerContentLayout.d.q(drawerContentLayout.A);
        drawerContentLayout.k = this.interactionModerator;
        this.carRegionController = new qfj(this.carRegionId);
        this.demandSpaceController = createDemandSpaceController(getSdkContext(), imageView2);
        this.facetBarController = new qgb();
        this.capabilityController = new qfh();
        this.toastController = new qhf(this.carRegionId);
        qhb qhbVar = new qhb(getSdkContext(), statusBarView);
        this.statusBarController = createLegacyStatusBarController(statusBarView, viewFindViewById, qhbVar);
        final lay layVar = new lay(drawerContentLayout, getTelemetry());
        layVar.f = new qfl(this);
        layVar.i = new qfm(this);
        qgh qghVarCreateLegacyMenuController = createLegacyMenuController(statusBarView, imageView, drawerContentLayout);
        this.menuController = qghVarCreateLegacyMenuController;
        qghVarCreateLegacyMenuController.A(new whk(this, statusBarView, layVar));
        this.imeController = new qgc();
        qgm qgmVar = new qgm(this.appContext, getSdkContext(), this.imeController, viewGroup, statusBarView);
        qgmVar.n = new whk(this, imageView, viewGroup2);
        this.searchController = qgmVar;
        final View viewFindViewById2 = this.carAppLayout.findViewById(R.id.unlimited_browsing_exit_header);
        viewFindViewById2.setOnClickListener(new ntb(4));
        final View viewFindViewById3 = this.carAppLayout.findViewById(R.id.unlimited_browsing_exit_button);
        viewFindViewById3.setOnClickListener(new jmq(this, viewFindViewById2, 17, null));
        qgf qgfVar = new qgf(qhbVar, this.drawerLayout, drawerContentLayout, imageView, new moi(getSdkContext()));
        this.drawerController = qgfVar;
        qgfVar.p(new qfn(this, layVar, viewFindViewById2, qhbVar));
        this.inputController = new qgg(this.carAppLayout, this.demandSpaceController, (qgf) this.drawerController, this.menuController, this.searchController, layVar, imageView, statusBarView.c, imageView2, this.interactionModerator);
        this.interactionModerator.g(new lza() { // from class: qfk
            @Override // defpackage.lza
            public final void a(lzb lzbVar) throws Resources.NotFoundException {
                this.a.lambda$initializeLegacyControllers$2(drawerContentLayout, layVar, viewFindViewById2, statusBarView, viewFindViewById3, lzbVar);
            }
        });
    }

    private void initializeOptimizedControllers() {
        getSdkContext().setTheme(R.style.Theme_Gearhead_Projected);
        qhe qheVar = new qhe(this.appContext, getSdkContext());
        this.carAppLayout = qheVar;
        this.demandSpaceController = createDemandSpaceController(getSdkContext(), null);
        this.facetBarController = new qgb();
        this.capabilityController = new qfh();
        this.toastController = new qhf(this.carRegionId);
        this.carRegionController = new qfj(this.carRegionId);
        this.statusBarController = new qfg(this.carRegionId, qheVar);
        this.imeController = new qgc();
        this.menuController = new qgu();
        this.searchController = new qgv();
        this.drawerController = new qgs();
        this.inputController = new qgt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTouchpadNavEnabled() {
        if (!this.appDecorServiceReadyHasCompleted) {
            ((ype) ((ype) logger.h()).ai((char) 7066)).u("appDecorService has not yet completed its ready state.  touchpadNavEnabled truth may not be accurate.  This may cause focus to be lost to content behind drawer in UI");
        }
        return this.touchpadNavEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLegacyControllers$1(View view, View view2) {
        this.drawerController.e();
        view.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeLegacyControllers$2(DrawerContentLayout drawerContentLayout, lay layVar, View view, StatusBarView statusBarView, View view2, lzb lzbVar) throws Resources.NotFoundException {
        mo moVarH;
        lzc lzcVar = this.interactionModerator;
        if (lzcVar instanceof lze) {
            int iOrdinal = lzbVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                this.drawerController.k();
                drawerContentLayout.k();
                drawerContentLayout.g.b(false);
                drawerContentLayout.i.setVisibility(0);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(drawerContentLayout.getContext(), R.anim.speedbump_in);
                drawerContentLayout.i.clearAnimation();
                drawerContentLayout.i.startAnimation(animationLoadAnimation);
                ((fhl) drawerContentLayout.j.getDrawable()).start();
                drawerContentLayout.n = true;
                layVar.f(true);
                return;
            }
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.drawerController.l();
                drawerContentLayout.g.b(true);
                if (drawerContentLayout.i.getVisibility() == 0) {
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(drawerContentLayout.getContext(), R.anim.speedbump_out);
                    animationLoadAnimation2.setAnimationListener(new qfy(drawerContentLayout));
                    ((fhl) drawerContentLayout.j.getDrawable()).stop();
                    drawerContentLayout.i.startAnimation(animationLoadAnimation2);
                    if (drawerContentLayout.n && (mki.a == null || ((Integer) lau.c().i().e()).intValue() != 2)) {
                        drawerContentLayout.l.b(omz.a, 0);
                    }
                    drawerContentLayout.n = false;
                }
                layVar.f(false);
                return;
            }
            return;
        }
        if (lzcVar instanceof lzd) {
            int iOrdinal2 = lzbVar.ordinal();
            if (iOrdinal2 == 0) {
                this.drawerController.k();
                drawerContentLayout.i();
                drawerContentLayout.k();
                layVar.f(true);
                view.setVisibility(0);
                view2.requestFocus();
                blockDescendantFocusability(statusBarView, drawerContentLayout);
                return;
            }
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2 || iOrdinal2 == 3) {
                    this.drawerController.l();
                    drawerContentLayout.i();
                    layVar.f(false);
                    view.setVisibility(8);
                    restoreDescendantFocusability(statusBarView, drawerContentLayout);
                    return;
                }
                return;
            }
            this.drawerController.k();
            drawerContentLayout.u.setVisibility(0);
            if (drawerContentLayout.s == null) {
                PagedListView pagedListView = drawerContentLayout.d;
                View viewN = pagedListView.g.N();
                if (viewN == null) {
                    moVarH = null;
                } else {
                    int iBl = CarLayoutManager.bl(viewN);
                    mo moVarH2 = pagedListView.i().h(iBl + 1);
                    moVarH = moVarH2 == null ? pagedListView.i().h(iBl) : moVarH2;
                }
                drawerContentLayout.s = (qgr) moVarH;
                qgr qgrVar = drawerContentLayout.s;
                if (qgrVar != null) {
                    Log.v("GH.MenuItemHolder", "enable end bouncer");
                    krj krjVar = new krj(qgrVar, 10);
                    View view3 = qgrVar.x;
                    view3.setOnFocusChangeListener(krjVar);
                    view3.setFocusable(true);
                    view3.setClickable(true);
                }
            }
            drawerContentLayout.h();
            layVar.f(true);
            view.setVisibility(8);
            restoreDescendantFocusability(statusBarView, drawerContentLayout);
        }
    }

    private void maybeUpdateConfigContextValue(boolean z) {
        SharedPreferences.Editor editorEdit = this.appContext.getSharedPreferences("car_ui_entry", 0).edit();
        if (this.useConfigurationContext != z) {
            ((ype) ((ype) logger.f()).ai((char) 7069)).y("Updating useConfigurationContext to %b", Boolean.valueOf(z));
            editorEdit.putBoolean("use_configuration_context", z);
        }
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAppDecorServiceReady(qtu qtuVar) {
        DrawerLayout drawerLayout;
        yph yphVar = logger;
        ((ype) yphVar.l().ai((char) 7070)).y("onAppDecorServiceReady, client started: %b", Boolean.valueOf(this.isRunning));
        if (this.isRunning) {
            if (this.appDecorService != null) {
                ((ype) ((ype) yphVar.h()).ai((char) 7073)).u("received onReady callback while connected to existing service");
                cleanupAppDecorService();
            }
            this.appDecorService = qtuVar;
            this.statusBarController.a(qtuVar);
            qgb qgbVar = this.facetBarController;
            ((ype) qgb.a.l().ai((char) 7098)).u("onAppDecorServiceConnected");
            qgbVar.b = qtuVar;
            qgbVar.a(qgbVar.c);
            this.toastController.a = qtuVar;
            qfj qfjVar = this.carRegionController;
            qfjVar.c = qtuVar;
            tmb tmbVar = qfjVar.d;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - qfjVar.e.longValue();
            qfj.b.longValue();
            if (jElapsedRealtime < 100) {
                ((ype) ((ype) qfj.a.f()).ai((char) 7047)).u("Requesting increased content area for pending request");
                qfjVar.e();
                qfjVar.e = -1L;
            }
            try {
                qtuVar.h(this.drivingStatusCallback);
                this.interactionModerator.n(qtuVar.f());
                if (acow.f() && (drawerLayout = this.drawerLayout) != null) {
                    lzc lzcVar = this.interactionModerator;
                    lzcVar.o();
                }
                applyConfigParams();
                this.carAppLayout.f(new ykd(this));
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) logger.g()).p(e)).ai((char) 7071)).u("Error calling into AppDecorService");
            }
            if (actd.c()) {
                this.memoryMonitorController = new qgo();
            }
            this.appDecorServiceReadyHasCompleted = true;
        }
    }

    private void restoreDescendantFocusability(StatusBarView statusBarView, DrawerContentLayout drawerContentLayout) {
        if (statusBarView.getDescendantFocusability() == 393216) {
            statusBarView.setDescendantFocusability(this.statusBarViewDescendantFocusability);
        }
        if (drawerContentLayout.getDescendantFocusability() == 393216) {
            drawerContentLayout.setDescendantFocusability(this.drawerContentLayoutDescendantFocusability);
        }
    }

    private void setLayoutInflaterFactory(LayoutInflater.Factory factory) {
        LayoutInflater.from(getSdkContext()).setFactory(factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverrideStatusBarForSearch(boolean z, ViewGroup viewGroup) {
        this.overrideStatusBarForSearch = z;
        viewGroup.setFitsSystemWindows(!z);
        if (z) {
            viewGroup.setPadding(0, 0, 0, 0);
        }
        applySystemUiVisibility(this.carAppLayout.getWindowSystemUiVisibility());
        viewGroup.requestApplyInsets();
    }

    private boolean useOptimizedCarActivity(Context context) {
        boolean zContains = OPTIMIZED_CAR_ACTIVITY_PACKAGES.contains(context.getPackageName());
        ((ype) ((ype) logger.f()).ai(7082)).N("useOptimizedCarActivity for %s: %s", context.getPackageName(), zContains);
        return zContains;
    }

    public void applySystemUiVisibility(int i) {
        if (this.appDecorService == null) {
            return;
        }
        yph yphVar = logger;
        ((ype) yphVar.l().ai((char) 7061)).w("applySystemUiVisibility: %d", i);
        if (true == this.overrideStatusBarForSearch) {
            i = 4;
        }
        try {
            CarRegionId carRegionId = this.carRegionId;
            int i2 = carRegionId.h.b;
            int i3 = carRegionId.g;
            if (this.statusBarController.y() || !this.statusBarController.z()) {
                return;
            }
            if (this.appDecorService.g(i2, i3) != null) {
                this.appDecorService.g(i2, i3).f(i);
            } else {
                ((ype) ((ype) yphVar.h()).ai(7062)).u("Unable to obtain SystemUiService to set system UI visibility");
            }
        } catch (RemoteException e) {
            throw new RuntimeException("Error setting system visibility", e);
        }
    }

    public qfs createDemandSpaceController(Context context, ImageView imageView) {
        return new qfs(context, imageView);
    }

    public InputConnection createInputConnection(EditorInfo editorInfo) {
        if (useOptimizedCarActivity(this.appContext)) {
            return new BaseInputConnection(this.carAppLayout, false);
        }
        CarRestrictedEditText carRestrictedEditText = this.searchEditText;
        carRestrictedEditText.getClass();
        return carRestrictedEditText.onCreateInputConnection(editorInfo);
    }

    public qgh createLegacyMenuController(StatusBarView statusBarView, ImageView imageView, DrawerContentLayout drawerContentLayout) {
        return new qgh(this.appContext, getSdkContext(), statusBarView, drawerContentLayout, imageView, this.interactionModerator);
    }

    public qgn createLegacyStatusBarController(StatusBarView statusBarView, View view, qhb qhbVar) {
        return new qgn(qhbVar, statusBarView, view, this.carRegionId);
    }

    public rax createSdkConfigurationContext(Context context, Context context2) {
        Configuration configuration = context.getResources().getConfiguration();
        Configuration configuration2 = new Configuration();
        configuration2.touchscreen = configuration.touchscreen;
        configuration2.navigation = configuration.navigation;
        configuration2.uiMode = configuration.uiMode;
        return new rax(context2.createConfigurationContext(configuration2));
    }

    public Context createSdkContext(Context context, Context context2) {
        Configuration configuration = context.getResources().getConfiguration();
        Configuration configuration2 = new Configuration();
        configuration2.touchscreen = configuration.touchscreen;
        configuration2.navigation = configuration.navigation;
        configuration2.uiMode = configuration.uiMode;
        return context2.createConfigurationContext(configuration2);
    }

    public View getAppLayout() {
        return this.carAppLayout;
    }

    public ouz getCapabilityController() {
        return this.capabilityController;
    }

    public ovc getCarRegionController() {
        return this.carRegionController;
    }

    public int getContentContainerId() {
        return R.id.content_view_container;
    }

    public lzc getDefaultInteractionModerator() {
        return acow.d() ? new lze() : new lzd();
    }

    public ovi getDrawerController() {
        return this.drawerController;
    }

    public ovk getFacetBarController() {
        return this.facetBarController;
    }

    public ovq getImeController() {
        return this.imeController;
    }

    public ovt getMenuController() {
        return this.menuController;
    }

    public ovw getSearchController() {
        return this.searchController;
    }

    public ovz getStatusBarController() {
        return this.statusBarController;
    }

    public owc getToastController() {
        return this.toastController;
    }

    public owe getVoiceSearchController() {
        return this.demandSpaceController;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ((ype) logger.l().ai((char) 7074)).y("onConfigurationChanged %s", configuration);
        Resources resources = getSdkContext().getResources();
        resources.getConfiguration().updateFrom(configuration);
        if (this.useConfigurationContext) {
            rax raxVar = this.sdkContextWrapper;
            raxVar.getClass();
            raxVar.a(resources.getConfiguration(), resources.getDisplayMetrics());
        } else {
            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }
        this.carAppLayout.dispatchConfigurationChanged(configuration);
        this.statusBarController.B();
        if (this.drawerController.j()) {
            this.menuController.z();
        }
        if (this.searchController.t()) {
            this.searchController.y();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        ((ype) logger.l().ai((char) 7075)).y("onRestoreInstanceState %s", bundle);
        this.drawerController.q();
        this.searchController.n(bundle);
        this.statusBarController.c(bundle);
        qgb qgbVar = this.facetBarController;
        ((ype) qgb.a.l().ai((char) 7100)).y("onRestoreInstanceState %s", bundle);
        boolean z = bundle.getBoolean("com.google.android.gearhead.appdecor.FacetBarController.SHOW_FACET_BAR", qgbVar.c);
        qgbVar.c = z;
        qgbVar.a(z);
        this.carAppLayout.a(bundle);
    }

    public void onSaveInstanceState(Bundle bundle) {
        ((ype) logger.l().ai((char) 7076)).y("onSaveInstanceState %s", bundle);
        this.drawerController.m(bundle);
        this.searchController.o(bundle);
        this.statusBarController.d(bundle);
        qgb qgbVar = this.facetBarController;
        ((ype) qgb.a.l().ai((char) 7101)).y("onSaveInstanceState %s", bundle);
        bundle.putBoolean("com.google.android.gearhead.appdecor.FacetBarController.SHOW_FACET_BAR", qgbVar.c);
        this.carAppLayout.b(bundle);
    }

    public void onStart() {
        ((ype) logger.l().ai((char) 7077)).u("onStart");
        qfs qfsVar = this.demandSpaceController;
        ((ype) qfs.a.l().ai((char) 7086)).u("onStart");
        qfsVar.c.c();
        this.statusBarController.v();
        this.drawerController.n();
        this.isRunning = true;
        this.appContext.bindService(new Intent().setComponent(new ComponentName(getSdkContext().getPackageName(), "com.google.android.gearhead.appdecor.AppDecorService")), this.serviceConnection, 1);
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout != null) {
            drawerLayout.requestLayout();
        }
        this.interactionModerator.l();
    }

    public void onStop() {
        ((ype) logger.l().ai((char) 7078)).u("onStop");
        this.isRunning = false;
        this.interactionModerator.m();
        this.statusBarController.w();
        qfs qfsVar = this.demandSpaceController;
        ((ype) qfs.a.l().ai((char) 7087)).u("onStop");
        qfsVar.c.a();
        this.appContext.unbindService(this.serviceConnection);
        cleanupAppDecorService();
    }

    public void requestXRayScan(IBinder iBinder) {
        ((ype) logger.l().ai((char) 7079)).u("XRayScan requested");
    }

    public void startCarActivity(Intent intent) {
        try {
            qtu qtuVar = this.appDecorService;
            if (qtuVar != null) {
                CarRegionId carRegionId = this.carRegionId;
                qtuVar.g(carRegionId.h.b, carRegionId.g).h(intent);
            }
        } catch (RemoteException e) {
            ((ype) ((ype) ((ype) logger.g()).p(e)).ai((char) 7081)).y("Error starting CarActivity with intent: %s", intent.toUri(0));
        }
    }

    public CarUiEntry(Context context, Context context2, LayoutInflater.Factory factory, int i) {
        this(context, context2, factory, i, CarRegionId.a.g);
    }

    public CarUiEntry(Context context, Context context2, LayoutInflater.Factory factory) {
        this(context, context2, factory, CarDisplayId.a.b);
    }
}
