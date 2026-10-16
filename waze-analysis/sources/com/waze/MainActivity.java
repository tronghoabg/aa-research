package com.waze;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.internal.AssetHelper;
import com.waze.config.ConfigValues;
import com.waze.location.LocationPermissionActivity;
import com.waze.location.LocationSensorListener;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.sharedui.utils.RequestPermissionActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class MainActivity extends el implements com.waze.mywaze.s, com.waze.sharedui.e {
    private com.waze.google_assistant.a n;
    private View p;
    private MapCoverView q;
    private int t;

    /* renamed from: k, reason: collision with root package name */
    private static final ArrayList f13556k = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13554f = false;

    /* renamed from: g, reason: collision with root package name */
    public static String f13555g = null;

    /* renamed from: l, reason: collision with root package name */
    private static final ArrayList f13557l = new ArrayList(10);
    private static final Set m = new HashSet();
    private Boolean o = null;
    private final com.waze.shared_infra.o.a r = com.waze.shared_infra.o.b.a();
    private com.waze.main_screen.ab.i s = null;
    private AddressItem u = null;
    private volatile boolean v = false;

    public static void B(df dfVar) {
        Looper mainLooper = Looper.getMainLooper();
        if (Thread.currentThread() == mainLooper.getThread()) {
            aO(dfVar);
        } else {
            new Handler(mainLooper).post(new ay(dfVar, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void aO(df dfVar) {
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null || !mainActivityC.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            f13556k.add(dfVar);
        } else {
            dfVar.a(mainActivityC);
        }
    }

    private final void aP() {
        com.waze.app_nav.a.e eVarO = O();
        if (eVarO != null) {
            eVarO.a().c();
        } else {
            ix.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aQ() {
        M().unsetUpdateHandler(NativeManager.UH_LOGIN_DONE, this.y);
        Log.i("MainActivity", "Map shown and ready");
        if (f13554f) {
            f13554f = false;
            M().SetSocialIsFirstTime(false);
        }
        File file = new File(com.waze.resources.h.f(this));
        if (!file.canExecute() || !file.canRead() || !file.canWrite()) {
            com.waze.shared_infra.i.h.c("Skins dir " + file.getPath() + " permissions were changed; Notifying and exiting");
            N().n();
            com.waze.app_nav.hub.b.m.c().b(new com.waze.app_nav.hub.b.k("onLogin", new gp(this, 1)));
        }
        com.waze.sound.bg.c().k();
        C();
        if (!LocationSensorListener.canUseLocation(this)) {
            N().n();
            startActivity(new Intent(this, (Class<?>) LocationPermissionActivity.class));
        }
        Z().v();
    }

    private final void aR() {
        Boolean bool = this.o;
        if (bool == null || bool.booleanValue() == com.waze.shared_infra.i.h.B(this)) {
            return;
        }
        aS();
        this.o = Boolean.valueOf(com.waze.shared_infra.i.h.B(this));
    }

    private final void aS() {
        android.support.v4.app.ar arVarG = bv().g(R.id.mainContent);
        if (arVarG != null) {
            android.support.v4.app.ch chVarU = bv().u();
            chVarU.m(arVarG);
            chVarU.a();
            bv().aV();
            android.support.v4.app.ch chVarU2 = bv().u();
            chVarU2.v(arVarG);
            chVarU2.a();
        }
    }

    private static void aT(Intent intent, String str) {
        kw.f25072a.a().c(str, com.waze.ui.z.as.c(com.waze.shared_infra.i.a.a(), intent.getStringExtra("NotificationType")));
    }

    public static /* synthetic */ com.waze.app_nav.hub.b.i n(MainActivity mainActivity, Context context) {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = mainActivity.r;
        oVar.Q(aVar.c(R.string.WAZE_CORRUPT_FILE_SYSTEM_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.WAZE_CORRUPT_FILE_SYSTEM_TEXT, new Object[0]));
        oVar.N(aVar.c(R.string.WAZE_CORRUPT_FILE_SYSTEM_BUTTON, new Object[0]));
        oVar.C(false);
        oVar.f13808a = new dc(mainActivity, 0);
        com.waze.ab.s sVar = new com.waze.ab.s(context, oVar);
        sVar.show();
        return new com.waze.app_nav.hub.b.h(sVar);
    }

    public static /* synthetic */ void p(MainActivity mainActivity) {
        View currentFocus = mainActivity.getCurrentFocus();
        if (currentFocus == null || (currentFocus instanceof com.waze.map.dw) || (currentFocus instanceof com.waze.map.gf)) {
            mainActivity.L().k();
        } else {
            currentFocus.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) mainActivity.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        mainActivity.aP();
    }

    public static /* synthetic */ void r(MainActivity mainActivity, com.waze.app_nav.g gVar) {
        int i2 = 0;
        if (gVar != com.waze.app_nav.g.f15207c) {
            mainActivity.q.animate().alpha(0.0f).withEndAction(new da(mainActivity, gVar == com.waze.app_nav.g.f15206b ? 0 : 8, i2));
            return;
        }
        if (mainActivity.q.getVisibility() != 0) {
            mainActivity.q.setAlpha(0.0f);
            mainActivity.q.setVisibility(0);
        }
        mainActivity.q.animate().alpha(1.0f);
    }

    public static /* synthetic */ void s(MainActivity mainActivity) {
        mainActivity.M().CloseProgressPopup();
        if (mainActivity.s == null) {
            mainActivity.s = ((com.waze.main_screen.ab.h) com.waze.web.r.h(com.waze.main_screen.ab.h.class)).a();
        }
        mainActivity.s.a(1);
    }

    public static /* synthetic */ void u(MainActivity mainActivity, com.waze.planned_drive.o oVar) {
        String strC;
        if (oVar != null) {
            if (oVar.a() instanceof com.waze.planned_drive.k) {
                strC = mainActivity.r.c(R.string.PLANNED_DRIVE_SAVED_SNACKBAR_ERROR_TEXT, new Object[0]);
            } else if (!(oVar.a() instanceof com.waze.planned_drive.l)) {
                return;
            } else {
                strC = mainActivity.r.c(R.string.PLANNED_DRIVE_SAVED_SNACKBAR_TEXT, new Object[0]);
            }
            com.waze.design_components.d.a(mainActivity, strC, new dd(mainActivity));
        }
    }

    public static void z(Runnable runnable) {
        MainActivity mainActivityC = lm.d().c();
        if (mainActivityC == null || !mainActivityC.v) {
            f13557l.add(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // com.waze.sharedui.e
    public final void A(com.waze.sharedui.f fVar) {
        m.remove(fVar);
    }

    public final void C() {
        setRequestedOrientation(2);
    }

    @Override // com.waze.sharedui.a.e
    protected final boolean D(Message message) {
        if (message.what == DriveToNativeManager.UH_SEARCH_ADD_RESULT) {
            M().CloseProgressPopup();
            this.y.removeCallbacks(null);
            aM();
            AddressItem addressItem = (AddressItem) message.getData().getParcelable("address_item");
            ((DriveToNativeManager) com.waze.web.r.h(DriveToNativeManager.class)).unsetUpdateHandler(DriveToNativeManager.UH_SEARCH_ADD_RESULT, this.y);
            if (addressItem.getLongitudeInt() == -1 && addressItem.getLatitudeInt() == -1) {
                return true;
            }
            new com.waze.navigate.cs(addressItem).b(this, 1);
            return true;
        }
        if (message.what == NativeManager.UH_LOGIN_DONE) {
            aQ();
            int i2 = RequestPermissionActivity.f39074a;
            ConfigValues.CONFIG_VALUE_PERMISSIONS_LOCATION.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0));
            ConfigValues.CONFIG_VALUE_PERMISSIONS_CONTACTS.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CONTACTS") == 0));
            ConfigValues.CONFIG_VALUE_PERMISSIONS_CALENDAR.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.READ_CALENDAR") == 0));
            ConfigValues.CONFIG_VALUE_PERMISSIONS_MICROPHONE.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0));
            ConfigValues.CONFIG_VALUE_PERMISSIONS_CAMERA.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") == 0));
            if (Build.VERSION.SDK_INT >= 33) {
                ConfigValues.CONFIG_VALUE_PERMISSIONS_NOTIFICATIONS.d(Boolean.valueOf(ContextCompat.checkSelfPermission(this, "android.permission.POST_NOTIFICATIONS") == 0));
            }
        }
        return false;
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.el, org.a.d.a.a
    public final org.a.d.a getKoin() {
        return com.waze.web.r.k();
    }

    @Override // com.waze.el, org.a.a.b.a
    public final void m() {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.MainActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getOnBackPressedDispatcher().hasEnabledCallbacks()) {
            super.onBackPressed();
            return;
        }
        com.waze.map.canvas.bj bjVar = (com.waze.map.canvas.bj) W().g().d();
        if (bjVar != null) {
            com.waze.app_nav.c cVar = com.waze.app_nav.c.f15197a;
            int iOrdinal = bjVar.ordinal();
            if (iOrdinal != 0 && iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new h.i();
                    }
                }
            }
            W().r(com.waze.map.b.q.f28364a, true);
            return;
        }
        if (V().a().d() == com.waze.ui.r.a.e.b.a.f43359a) {
            ((KeyguardManager) getSystemService(KeyguardManager.class)).requestDismissKeyguard(this, null);
            return;
        }
        com.waze.shared_infra.i.h.j("MainActivity: onBackPressed: showing exit popup");
        al().b().c(Q());
        al().b().b(Q());
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.orientation;
        Log.i("WAZE", "Configuration changed: " + i2);
        if (this.t != i2) {
            ((p) com.waze.web.r.h(p.class)).g(i2);
            this.t = i2;
            aS();
            if (NativeManager.isAppStarted()) {
                M().notifyOrientationChanged();
            }
            ArrayList arrayList = new ArrayList(m);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((com.waze.sharedui.f) arrayList.get(i3)).u();
            }
        }
        aR();
        L().o(configuration.orientation == 2);
    }

    @Override // com.waze.el, com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z().f35310a = new de(this);
        int i2 = 0;
        L().a().observe(this, new cz(this, i2));
        int i3 = 1;
        int i4 = 2;
        L().o(getResources().getConfiguration().orientation == 2);
        L().c().observe(this, new cz(this, i4));
        if (!NativeManager.isAppStarted()) {
            aA();
            return;
        }
        this.o = Boolean.valueOf(com.waze.shared_infra.i.h.B(this));
        setContentView(R.layout.waze_main_activity);
        View viewFindViewById = findViewById(R.id.mainContent);
        this.p = viewFindViewById;
        viewFindViewById.setClipToOutline(true);
        this.p.setOutlineProvider(new lf(com.waze.ui.z.as.h(getResources(), 20)));
        aE();
        ((ComposeView) findViewById(R.id.mainContentCompose)).setContent(ComposableLambdaKt.composableLambdaInstance(1241405868, true, new dv(this, i2)));
        MapCoverView mapCoverView = (MapCoverView) findViewById(R.id.mapCover);
        this.q = mapCoverView;
        mapCoverView.b(new android.support.v7.app.p(this, 19));
        L().b().observe(this, new cz(this, 3));
        ak();
        ac().c();
        this.t = getResources().getConfiguration().orientation;
        NativeManager nativeManagerM = M();
        if (nativeManagerM.isLoggedIn()) {
            aF(new com.google.android.material.internal.o(this, i3));
        } else {
            nativeManagerM.setUpdateHandler(NativeManager.UH_LOGIN_DONE, this.y);
        }
        this.n = (com.waze.google_assistant.a) com.waze.web.r.i(com.waze.main_screen.j.h.class);
        com.waze.google_assistant.aa.f24060a.a().x(this.n);
        NativeManager.setWebUserAgent(this, com.waze.sharedui.web.at.d(this));
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("AnalyticsType");
            if ("LH".equals(stringExtra)) {
                kw.f25072a.a().a(com.waze.ui.z.as.c(com.waze.shared_infra.i.a.a(), stringExtra));
                L().n();
            }
            String stringExtra2 = intent.getStringExtra("ButtonName");
            if (stringExtra2 != null) {
                aT(intent, stringExtra2);
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        ix.e();
        return false;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        com.waze.shared_infra.i.h.j("Destroying main activity");
        if (NativeManager.isAppStarted()) {
            M().unsetUpdateHandler(NativeManager.UH_LOGIN_DONE, this.y);
            com.waze.google_assistant.aa.f24060a.a().z(this.n);
        }
        Z().f35310a = null;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected final void onNewIntent(Intent intent) {
        String stringExtra;
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent == null || (stringExtra = intent.getStringExtra("ButtonName")) == null) {
            return;
        }
        aT(intent, stringExtra);
    }

    @Override // com.waze.el, com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.v = false;
        if (NativeManager.isAppStarted()) {
            return;
        }
        C();
    }

    @Override // com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onPostResume() {
        super.onPostResume();
        com.waze.perf.c.a(com.waze.perf.b.f33029g);
        if (((com.waze.map.opengl.t) com.waze.web.r.h(com.waze.map.opengl.t.class)).a()) {
            return;
        }
        ((com.waze.map.opengl.g) com.waze.web.r.h(com.waze.map.opengl.g.class)).e();
    }

    @Override // com.waze.el, com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onResume() {
        MainActivity mainActivity;
        int i2;
        Log.w("WAZE DEBUG", "ON RESUME. Task id: " + getTaskId());
        super.onResume();
        this.v = true;
        try {
            reportFullyDrawn();
        } catch (Exception unused) {
        }
        if (t.o()) {
            mainActivity = this;
            K().a(getIntent(), new ee(mainActivity, LifecycleOwnerKt.getLifecycleScope(this), N(), R(), T(), Y(), S(), X()));
        } else {
            mainActivity = this;
        }
        while (true) {
            ArrayList arrayList = f13557l;
            if (arrayList.size() <= 0) {
                break;
            } else {
                ((Runnable) arrayList.remove(0)).run();
            }
        }
        mainActivity.aR();
        mainActivity.runOnUiThread(new ay(mainActivity, 6));
        com.waze.utils.d.a().d();
        ArrayList arrayList2 = f13556k;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        int size = arrayList3.size();
        for (i2 = 0; i2 < size; i2++) {
            ((df) arrayList3.get(i2)).a(mainActivity);
        }
        com.waze.app_nav.a.e eVarO = mainActivity.O();
        if (eVarO != null) {
            eVarO.a().a().observe(mainActivity, new cz(mainActivity, 3));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        com.waze.a.af.h(com.waze.alerters.a.k.e(), false, "");
        return false;
    }

    public final void v(String str) {
        com.waze.shared_infra.o.a aVar = this.r;
        String strC = aVar.c(R.string.EMAIL_SUBJECT, new Object[0]);
        String strConcat = (aVar.c(R.string.EMAIL_BODY1, new Object[0]) + "\n" + aVar.c(R.string.EMAIL_BODY2, new Object[0]) + "\n" + aVar.c(R.string.EMAIL_BODY3, new Object[0]) + "\n").concat(String.valueOf(str));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.SUBJECT", strC);
        intent.putExtra("exit_on_sent", true);
        intent.putExtra("android.intent.extra.TEXT", strConcat);
        startActivity(Intent.createChooser(intent, aVar.c(R.string.PICK_UP_TITLE_SEND, new Object[0])));
    }

    @Override // com.waze.sharedui.e
    public final void w(com.waze.sharedui.f fVar) {
        m.add(fVar);
    }

    @Override // com.waze.mywaze.s
    public final void y(com.waze.mywaze.a aVar) {
        Intent intent = new Intent(this, (Class<?>) RequestPermissionActivity.class);
        intent.putExtra("needed_permissions", new String[]{"android.permission.READ_CONTACTS"});
        com.waze.shared_infra.i.h.j("MainActivity: onMyWazeDataReceived: Requesting permission READ_CONTACTS");
        startActivityForResult(intent, 0);
    }
}
