package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.apps.auto.components.carlocalmedia.CarLocalMediaBrowserService;
import com.google.android.apps.auto.components.coolwalk.compose.catalog.ComposeCatalogCarActivityService;
import com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider;
import com.google.android.apps.auto.components.headunit.HeadUnitUpdateManager;
import com.google.android.apps.auto.components.softminversion.SoftMinversionManager;
import com.google.android.gearhead.appdecor.AppDecorService;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.handwriting.base.OnDeviceSpecUtils;
import com.google.android.libraries.handwriting.base.Util;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.AndroidAutoActivity;
import com.google.android.projection.gearhead.service.GearheadService;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class wxz extends lig implements mpb {
    public static final yph m = yph.c("GH.GHLifetimeManager");
    private boolean A;
    private final List B;
    public final Runnable n;
    public final xwx o;
    public HeadUnitUpdateManager p;
    public final Handler q;
    public xef r;
    public xfy s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    private final xwx x;
    private final ConnectivityManager.NetworkCallback y;
    private boolean z;

    public wxz(Context context) {
        kpi kpiVar = new kpi(12);
        kpi kpiVar2 = new kpi(13);
        super(context);
        this.n = new teg(this, 12);
        this.q = new Handler();
        this.t = false;
        this.A = false;
        this.u = false;
        this.v = false;
        this.w = false;
        this.B = new ArrayList();
        this.x = kpiVar;
        this.o = kpiVar2;
        this.y = new wxt(this);
    }

    public static final sab A() {
        return (sab) kgq.c(new kym(8), "GH.GHLifetimeManager", yzz.LIFETIME, yzy.pf, true, "Could not get car window manager", new Object[0]);
    }

    @Override // defpackage.mpb
    public final void b(Intent intent, CarRegionId carRegionId) {
        if (!mkn.y.equals(intent.getComponent()) && CarDisplayId.b(carRegionId.h)) {
            this.q.postDelayed(new wxj(this, 3), acur.c());
            mpd.b().j(this);
        }
    }

    @Override // defpackage.lig
    public final List k() {
        yfl yflVar = new yfl(4);
        yflVar.j(GearheadService.class, AppDecorService.class);
        return yflVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lig
    protected final void o() throws PackageManager.NameNotFoundException {
        if (acwc.c()) {
            tfk tfkVar = tfk.a;
            tfj tfjVar = tfj.GEARHEAD_PROJECTION_LIFETIME_START_PHONE_CAPABILITIES_REPORTER;
            tfkVar.b(tfjVar);
            ((mff) mki.a.i(mff.class)).a();
            tfkVar.d(tfjVar, 1);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                InstallSourceInfo installSourceInfo = this.c.getPackageManager().getInstallSourceInfo("com.google.android.projection.gearhead");
                if (installSourceInfo == null || !Objects.equals(installSourceInfo.getInitiatingPackageName(), "com.android.vending")) {
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LIFETIME, yzy.pl).l());
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((ype) ((ype) ((ype) m.h()).p(e)).ai((char) 9903)).u("PackageManager found no install info");
            }
        }
        if (Build.VERSION.SDK_INT == 34 && ((Boolean) kgq.c(new kym(9), "GH.GHLifetimeManager", yzz.LIFETIME, yzy.pf, true, "Could not get car connection type", new Object[0])).booleanValue()) {
            ((ConnectivityManager) this.c.getSystemService(ConnectivityManager.class)).registerNetworkCallback(new NetworkRequest.Builder().build(), this.y);
            this.z = true;
        }
        yfq yfqVar = wxy.d;
        int i = ((yls) yfqVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((lib) yfqVar.get(i2)).a("delayed");
        }
        this.A = false;
        yfq yfqVar2 = wxy.f;
        int i3 = ((yls) yfqVar2).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((lib) yfqVar2.get(i4)).a("Delayed Coolwalk");
        }
        Context context = this.c;
        boolean zR = acpc.r();
        yph yphVar = kuo.a;
        context.getClass();
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) ComposeCatalogCarActivityService.class), true != zR ? 2 : 1, 1);
        this.A = true;
        tfk tfkVar2 = tfk.a;
        tfj tfjVar2 = tfj.GEARHEAD_PROJECTION_LIFETIME_START_LOG_HOST_LEVEL_TELEMETRY;
        tfkVar2.b(tfjVar2);
        qrn qrnVarE = kio.b().e();
        yph yphVar2 = kad.a;
        int iB = (int) aczc.b();
        ((ype) kad.a.l().ai(2891)).w("Host SDK max api: %d", iB);
        rrb rrbVarA = kad.a(yzy.rU);
        rrbVarA.i(Integer.toString(iB));
        kad.e(rrbVarA);
        final yfq yfqVarC = kad.c(qrnVarE, "androidx.car.app.category.NAVIGATION");
        final yfq yfqVarC2 = kad.c(qrnVarE, "androidx.car.app.category.PARKING");
        final yfq yfqVarC3 = kad.c(qrnVarE, "androidx.car.app.category.CHARGING");
        final yfq yfqVarC4 = kad.c(qrnVarE, "androidx.car.app.category.MESSAGING");
        final yfq yfqVarC5 = kad.c(qrnVarE, "androidx.car.app.category.POI");
        kad.d((yfq) Collection.EL.stream(kad.c(qrnVarE, null)).filter(new Predicate() { // from class: kac
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo56negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                ComponentName componentName = (ComponentName) obj;
                yph yphVar3 = kad.a;
                return (componentName.getPackageName().equals("com.google.android.projection.gearhead") || yfqVarC.contains(componentName) || yfqVarC2.contains(componentName) || yfqVarC3.contains(componentName) || yfqVarC4.contains(componentName) || yfqVarC5.contains(componentName)) ? false : true;
            }
        }).collect(ycm.a), ywy.CAR_APP_CATEGORY_UNKNOWN, null);
        kad.d(yfqVarC, ywy.CAR_APP_CATEGORY_NAVIGATION, "navigation");
        kad.d(yfqVarC2, ywy.CAR_APP_CATEGORY_PARKING, "parking");
        kad.d(yfqVarC3, ywy.CAR_APP_CATEGORY_CHARGING, "charging");
        kad.d(yfqVarC4, ywy.CAR_APP_CATEGORY_MESSAGING, "messaging");
        kad.d(yfqVarC5, ywy.CAR_APP_CATEGORY_POI, "POI");
        tfkVar2.d(tfjVar2, 1);
        tfkVar2.b(tfjVar2);
    }

    @Override // defpackage.lig
    protected final void p() {
        boolean z;
        long longVersionCode;
        wxz wxzVar = this;
        ((oxo) mki.a.i(oxo.class)).b();
        Object objA = wxzVar.x.a(wxzVar.c);
        Iterator it = ((yfy) tgx.d(new miw(11), acwl.b()).collect(ycm.b(new kqm(17), new ric(17), new rib(3)))).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Long l = (Long) entry.getValue();
            long jLongValue = l.longValue();
            if (acxa.U() && lau.a().a(((SoftMinversionManager) objA).c, "soft_minversion_dismissed_prefs").getBoolean(str, false)) {
                ((ype) ((ype) SoftMinversionManager.a.f()).ai((char) 5100)).y("Package %s is dismissed, skipping notification.", str);
            } else {
                try {
                    longVersionCode = ((SoftMinversionManager) objA).c.getPackageManager().getPackageInfo(str, 0).getLongVersionCode();
                } catch (PackageManager.NameNotFoundException unused) {
                    longVersionCode = 0;
                }
                if (longVersionCode < jLongValue) {
                    yph yphVar = SoftMinversionManager.a;
                    ((ype) ((ype) yphVar.f()).ai(5099)).R("Package %s installed version is %d. Soft minversion is %d, notifying.", str, Long.valueOf(longVersionCode), l);
                    ComponentName componentName = new ComponentName(str, "");
                    SoftMinversionManager softMinversionManager = (SoftMinversionManager) objA;
                    rpz rpzVar = softMinversionManager.d;
                    yxy yxyVar = yxy.GEARHEAD;
                    yzz yzzVar = yzz.SOFT_MINVERSION;
                    rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.yA);
                    rrbVarH.p(componentName);
                    rrbVarH.r(jLongValue);
                    rpzVar.c(rrbVarH.l());
                    rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.yz);
                    rrbVarH2.p(componentName);
                    rrbVarH2.r(longVersionCode);
                    rpzVar.c(rrbVarH2.l());
                    Context context = softMinversionManager.c;
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) SoftMinversionManager.NotificationActionBroadcastReceiver.class);
                    intent.setAction("com.google.android.apps.auto.components.softminversion.ACTION_UPDATE.".concat(String.valueOf(str)));
                    intent.putExtra("app_to_update", str);
                    intent.putExtra("installed_version_code", longVersionCode);
                    intent.putExtra("soft_minversion_code", jLongValue);
                    Object obj = objA;
                    Iterator it2 = it;
                    intent.putExtra("notification_created_ms", SystemClock.elapsedRealtime());
                    intent.setFlags(268435456);
                    ((ype) ((ype) yphVar.f()).ai((char) 5098)).y("Created intent: %s", intent);
                    ClipData clipData = wdu.a;
                    PendingIntent pendingIntentC = wdu.c(context, 0, intent, 1409286144);
                    pendingIntentC.getClass();
                    String string = context.getString(((Integer) softMinversionManager.b.getOrDefault(str, Integer.valueOf(R.string.app_generic_required))).intValue());
                    String string2 = longVersionCode > 0 ? "com.google.android.projection.gearhead".equals(str) ? context.getString(R.string.notification_title_update_android_auto) : context.getString(R.string.notification_title_update_other_app, string) : context.getString(R.string.notification_title_install_other_app, string);
                    String string3 = context.getString(R.string.notification_body_update);
                    if (acxa.U()) {
                        if (Objects.equals(str, "com.google.android.apps.maps")) {
                            string2 = context.getString(R.string.notification_title_recommended_maps);
                            string3 = context.getString(R.string.notification_body_recommended_maps);
                        } else if (Objects.equals(str, RemoteApiConstants.NOW_PACKAGE)) {
                            string2 = context.getString(R.string.notification_title_recommended_assistant);
                            string3 = context.getString(R.string.notification_body_recommended_assistant);
                        }
                    }
                    mas.c();
                    dsx dsxVar = new dsx(context, "gearhead_alerts");
                    dsxVar.n(R.drawable.gs_android_auto_vd_24);
                    dsxVar.i(string2);
                    dsxVar.h(string3);
                    dsxVar.g = pendingIntentC;
                    dsxVar.e(16, true);
                    if (acxa.U()) {
                        Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) SoftMinversionManager.NotificationActionBroadcastReceiver.class);
                        intent2.setAction("com.google.android.apps.auto.components.softminversion.ACTION_DISMISS.".concat(String.valueOf(str)));
                        intent2.putExtra("app_to_update", str);
                        intent2.putExtra("installed_version_code", longVersionCode);
                        intent2.putExtra("soft_minversion_code", jLongValue);
                        intent2.putExtra("notification_created_ms", SystemClock.elapsedRealtime());
                        intent2.putExtra("dismiss_action", true);
                        intent2.setFlags(268435456);
                        PendingIntent pendingIntentC2 = wdu.c(context, 0, intent2, 1409286144);
                        pendingIntentC2.getClass();
                        dsxVar.f(0, context.getString(R.string.notification_action_dont_show_again), pendingIntentC2);
                    }
                    if (softMinversionManager.a(str) != null) {
                        dsxVar.k(softMinversionManager.a(str));
                    }
                    new dug(context).b(str, R.id.update_notification_id, dsxVar.a());
                    wxzVar = this;
                    objA = obj;
                    it = it2;
                } else {
                    wxzVar = this;
                }
            }
        }
        HeadUnitUpdateManager headUnitUpdateManager = wxzVar.p;
        if (headUnitUpdateManager != null) {
            Context context2 = headUnitUpdateManager.b;
            SharedPreferences sharedPreferences = context2.getSharedPreferences("HeadUnitManager", 0);
            String str2 = null;
            if (headUnitUpdateManager.f) {
                ((ype) HeadUnitUpdateManager.a.f()).y("Notifying head unit needs update, notification=", headUnitUpdateManager.e);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                String str3 = headUnitUpdateManager.g;
                if (str3 == null) {
                    affa.d("attributionKey");
                    str3 = null;
                }
                editorEdit.putBoolean(str3, true).apply();
                Notification notification = headUnitUpdateManager.e;
                if (notification != null) {
                    new dug(context2).b(null, R.id.head_unit_update_notification_id, notification);
                    z = true;
                } else {
                    z = false;
                }
                headUnitUpdateManager.c.c(rrc.h(yxy.GEARHEAD, yzz.HEAD_UNIT_UPDATER, yzy.Ku).l());
                if (z) {
                    String str4 = headUnitUpdateManager.j;
                    if (str4 == null) {
                        affa.d("numNotificationsKeyToStore");
                        str4 = null;
                    }
                    int i = sharedPreferences.getInt(str4, 0) + 1;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    String str5 = headUnitUpdateManager.j;
                    if (str5 == null) {
                        affa.d("numNotificationsKeyToStore");
                        str5 = null;
                    }
                    editorEdit2.putInt(str5, i).apply();
                }
            }
            if (headUnitUpdateManager.i != null) {
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                String str6 = headUnitUpdateManager.i;
                if (str6 == null) {
                    affa.d("notifiedKeyToStore");
                } else {
                    str2 = str6;
                }
                editorEdit3.putInt(str2, headUnitUpdateManager.h).apply();
            }
        }
    }

    @Override // defpackage.lig
    protected final void s() {
        if (acvh.r()) {
            Context context = this.c;
            yph yphVar = len.a;
            TimeUnit timeUnit = TimeUnit.HOURS;
            len.a(context, 3600000L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lig
    protected final void v() {
        List list = this.B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lxr.l().f((max) it.next());
        }
        list.clear();
        this.q.removeCallbacks(this.n);
        if (this.w) {
            wxy.i.b();
        }
        if (this.u) {
            wxy.g.b();
        }
        if (this.v) {
            wxy.h.b();
        }
        if (this.t) {
            yfq yfqVarH = wxy.e.h();
            int size = yfqVarH.size();
            for (int i = 0; i < size; i++) {
                ((lib) yfqVarH.get(i)).b();
            }
        }
        yfq yfqVarH2 = wxy.b.h();
        int size2 = yfqVarH2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lib) yfqVarH2.get(i2)).b();
        }
        mpe.a().d();
        lgp lgpVarA = lgp.a();
        if (lgpVarA.h()) {
            Iterator it2 = lgpVarA.d.iterator();
            loop3: while (true) {
                if (!it2.hasNext()) {
                    lgpVarA.f(false);
                    break;
                }
                ArrayList<String> filesFromSpec = OnDeviceSpecUtils.getFilesFromSpec(lgpVarA.b(((Locale) it2.next()).getLanguage()));
                int size3 = filesFromSpec.size();
                int i3 = 0;
                while (i3 < size3) {
                    String str = filesFromSpec.get(i3);
                    i3++;
                    if (!new File(Util.maybeMakeFilenameFromUrl(lgpVarA.c, str)).exists()) {
                        wym wymVarA = wym.a();
                        wymVarA.b(1, 2131231483, R.string.app_name, R.string.companion_handwriting_input_body, new Intent(wymVarA.b, (Class<?>) AndroidAutoActivity.class), 600000L);
                        break loop3;
                    }
                }
            }
        }
        ebf.A().E(xfx.O());
        xfx xfxVarO = xfx.O();
        kio.b().w(xfxVarO.g);
        xfxVarO.P();
        GhMicrophoneContentProvider ghMicrophoneContentProviderA = GhMicrophoneContentProvider.a();
        ghMicrophoneContentProviderA.c = null;
        kxe kxeVar = ghMicrophoneContentProviderA.d;
        if (kxeVar != null) {
            ((ype) GhMicrophoneContentProvider.a.l().ai((char) 3464)).u("stop");
            kxeVar.c();
            ghMicrophoneContentProviderA.d = null;
        }
        xef xefVar = this.r;
        Context context = this.c;
        xefVar.a = false;
        context.unregisterReceiver(xefVar);
        xefVar.b = null;
        xfy xfyVar = this.s;
        if (xfyVar != null) {
            if (xfyVar.b) {
                context.unregisterReceiver(xfyVar);
                xfyVar.b = false;
            } else {
                ((ype) ((ype) xfy.a.h()).ai((char) 10280)).u("Receiver not registered");
            }
        }
        yfq yfqVarH3 = wxy.c.h();
        int size4 = yfqVarH3.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((lib) yfqVarH3.get(i4)).b();
        }
        if (this.g) {
            if (this.A) {
                yfq yfqVarH4 = wxy.f.h();
                int size5 = yfqVarH4.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    ((lib) yfqVarH4.get(i5)).b();
                }
            }
            yfq yfqVarH5 = wxy.d.h();
            int size6 = yfqVarH5.size();
            for (int i6 = 0; i6 < size6; i6++) {
                ((lib) yfqVarH5.get(i6)).b();
            }
            if (this.z) {
                ((ConnectivityManager) context.getSystemService(ConnectivityManager.class)).unregisterNetworkCallback(this.y);
            }
        } else {
            ((ype) ((ype) m.f()).ai((char) 9905)).u("Skipping stop for delayed start services.");
        }
        juw.b().d(null);
        if (acrz.s()) {
            z(false);
        }
        if (lej.a().d()) {
            y(false);
        }
    }

    public final void x(max maxVar) {
        this.B.add(maxVar);
        lxr.l().e(maxVar);
    }

    public final void y(boolean z) {
        Context context = this.c;
        ComponentName componentName = new ComponentName(context, (Class<?>) CarLocalMediaBrowserService.class);
        try {
            ((ype) ((ype) m.h()).ai(9906)).N("Car local media set %s to %b", componentName, z);
            context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) m.f()).p(e)).ai((char) 9907)).u("CarLocalMediaBrowserService not found");
        }
    }

    public final void z(boolean z) {
        try {
            ype ypeVar = (ype) ((ype) m.h()).ai(9908);
            ComponentName componentName = mkn.G;
            ypeVar.N("Radio set %s to %b", componentName, z);
            this.c.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
        } catch (IllegalArgumentException e) {
            ((ype) ((ype) ((ype) m.f()).p(e)).ai((char) 9909)).u("RadioMediaBrowserService not found");
        }
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void e(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void f(Intent intent, CarRegionId carRegionId) {
    }
}
