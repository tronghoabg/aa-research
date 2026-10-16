package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.car.app.model.Alert;
import com.google.android.gms.carsetup.BinderParcel;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class scr extends seg implements seb {
    public static final /* synthetic */ int c = 0;
    private static final ypf e = ols.R("CAR.SETUP");
    public boolean a;
    sbp b;
    private Context f;
    private boolean g;
    private sad h;
    private boolean i;
    private boolean j;

    private final void A(boolean z) {
        this.d.i(new scp(z));
    }

    @Override // defpackage.seb
    public final int a() {
        rhx rhxVar = rhx.c;
        if (acsl.g() && this.b == null) {
            e.h().ai(8747).u("FrxState unavailable, device support result is unknown");
            return -1;
        }
        int i = this.b.e;
        return 0;
    }

    @Override // defpackage.seg
    public final int b(String str) {
        if ("EVENT_ALL_PERMISSIONS_GRANTED".equals(str)) {
            return 22;
        }
        if ("EVENT_APPLICATION_INSTALLATION_FAILED".equals(str)) {
            return 13;
        }
        if ("EVENT_APPLICATION_INSTALLED".equals(str)) {
            return 58;
        }
        if ("EVENT_APPLICATION_INSTALLATION_ALLOWED".equals(str)) {
            return 11;
        }
        if ("EVENT_APPLICATION_INSTALLATION_CANCELLED".equals(str)) {
            return 12;
        }
        if ("EVENT_APPLICATIONS_UP_TO_DATE".equals(str)) {
            return 14;
        }
        if ("EVENT_BACKBUTTON_PRESSED".equals(str)) {
            return 77;
        }
        if ("EVENT_CAR_CONNECTION_ALLOWED".equals(str)) {
            return 8;
        }
        if ("EVENT_CAR_CONNECTION_CANCELLED".equals(str)) {
            return 19;
        }
        if ("EVENT_CAR_CONNECTION_DISALLOWED".equals(str)) {
            return 9;
        }
        if ("EVENT_CAR_DISCONNECTED".equals(str)) {
            return 2;
        }
        if ("EVENT_CAR_DOCK_CHOICE_RESET".equals(str)) {
            return 80;
        }
        if ("EVENT_CAR_PARKED".equals(str)) {
            return 78;
        }
        if ("EVENT_CAR_SERVICE_STARTED".equals(str)) {
            return 79;
        }
        if ("EVENT_CAR_STARTED_MOVING".equals(str)) {
            return 10;
        }
        if ("EVENT_COUNTRY_NOT_WHITELISTED".equals(str)) {
            return 4;
        }
        if ("EVENT_COUNTRY_WHITELISTED".equals(str)) {
            return 3;
        }
        if ("EVENT_DEVICE_COMPATIBLE".equals(str)) {
            return 53;
        }
        if ("EVENT_DEVICE_COMPATIBLE_WHITELIST_BYPASS".equals(str)) {
            return 90;
        }
        if ("EVENT_DEVICE_INCOMPATIBLE".equals(str)) {
            return 54;
        }
        if ("EVENT_ERROR".equals(str)) {
            return 17;
        }
        if ("EVENT_FRX_OPT_IN_ACCEPTED".equals(str)) {
            return 16;
        }
        if ("EVENT_FRX_OPT_IN_CANCELLED".equals(str)) {
            return 15;
        }
        if ("EVENT_GEARHEAD_APK_INSTALLED".equals(str)) {
            return 5;
        }
        if ("EVENT_INTRO_ACKNOWLEDGED".equals(str)) {
            return 49;
        }
        if ("EVENT_INTRO_DECLINED".equals(str)) {
            return 48;
        }
        if ("EVENT_INTRO_LOCK_TIMEOUT".equals(str)) {
            return 60;
        }
        if ("EVENT_OK_STATE_SKIPPED".equals(str)) {
            return 76;
        }
        if ("EVENT_PERMISSION_DENIED".equals(str)) {
            return 21;
        }
        if ("EVENT_PHONE_IN_BLACKLIST".equals(str)) {
            return 6;
        }
        if ("EVENT_PHONE_NOT_IN_BLACKLIST".equals(str)) {
            return 7;
        }
        if ("EVENT_USE_VANAGON_CLICKED".equals(str)) {
            return 50;
        }
        return "EVENT_USER_EXIT".equals(str) ? 18 : 0;
    }

    @Override // defpackage.seb
    public final Intent c() {
        sad sadVar = this.h;
        for (ses sesVar : sadVar.d) {
            if (!sesVar.d(sadVar.b)) {
                String str = sesVar.a;
                if (sadVar.a(str) != null) {
                    return null;
                }
                Intent intentA = sev.a(str);
                intentA.toUri(0);
                return intentA;
            }
        }
        return null;
    }

    @Override // defpackage.seb
    public final shm d() {
        return this.b.c();
    }

    @Override // defpackage.seb
    public final ExecutorService e() {
        return Executors.newSingleThreadExecutor();
    }

    @Override // defpackage.seb
    public final void f() {
        sad sadVar = this.h;
        FsmController fsmController = this.d;
        sad.a.l().ai(8587).u("beginUpdateInstalledApps");
        sadVar.c.registerSessionCallback(new sac(sadVar, fsmController));
    }

    @Override // defpackage.seb
    public final void g() {
        this.d.i(new sec(1));
    }

    @Override // defpackage.seg
    public final void gP(zab zabVar) {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        zabVar.getClass();
        yxbVar.o = zabVar;
        yxbVar.b |= 4096;
        this.b.e((yxb) abnpVarN.q(), yxc.UI);
    }

    @Override // defpackage.seb
    public final void h() {
        int i;
        if (this.a) {
            return;
        }
        sbp sbpVar = this.b;
        if (sbpVar == null) {
            e.h().ai(8746).u("enableDrivingStatusListener called while mFrxState is null");
            i = 31;
        } else {
            sdg sdgVar = sbpVar.d;
            sdv sdvVar = (sdv) sdgVar;
            synchronized (sdvVar.b) {
                if (((sdv) sdgVar).e) {
                    i = ((sdv) sdgVar).d;
                } else {
                    sdg sdgVar2 = sdvVar.c;
                    i = 0;
                }
            }
        }
        l(i);
        this.a = true;
    }

    @Override // defpackage.seb
    public final void i() {
        if (!this.g) {
            sbp sbpVar = this.b;
            sbp.a.f().ai(8725).u("onSetupSuccess");
            sbpVar.m(Boolean.TRUE);
        }
        this.g = true;
        A(true);
    }

    @Override // defpackage.seg
    public final void k(int i, int i2, int i3) {
        abnp abnpVarN = yyd.a.n();
        if (i >= 0) {
            abnpVarN.t();
            yyd yydVar = (yyd) abnpVarN.b;
            yydVar.b |= 1;
            yydVar.c = i;
        }
        if (i2 >= 0) {
            abnpVarN.t();
            yyd yydVar2 = (yyd) abnpVarN.b;
            yydVar2.b |= 2;
            yydVar2.d = i2;
        }
        abnpVarN.t();
        yyd yydVar3 = (yyd) abnpVarN.b;
        yydVar3.b |= 4;
        yydVar3.e = i3;
        if (this.b == null) {
            e.h().ai(8749).u("FrxState unavailable, not logging state change.");
            return;
        }
        abnp abnpVarN2 = yxb.a.n();
        yyd yydVar4 = (yyd) abnpVarN.q();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yydVar4.getClass();
        yxbVar.h = yydVar4;
        yxbVar.b |= 16;
        this.b.e((yxb) abnpVarN2.q(), yxc.FRX_STATE_CHANGE);
    }

    public final void l(int i) {
        int i2 = i & 8;
        FsmController fsmController = this.d;
        if (i2 == 0) {
            fsmController.f("EVENT_CAR_PARKED", null);
        } else {
            fsmController.f("EVENT_CAR_STARTED_MOVING", null);
        }
    }

    @Override // defpackage.seb
    public final void m(boolean z) {
        try {
            this.b.c.i();
        } catch (IllegalStateException | SecurityException e2) {
            e.h().p(e2).ai(8755).u("Error setIncompleteConnectionCount");
        }
        sbp sbpVar = this.b;
        if (sbpVar.j) {
            sbp.a.g().ai(8735).u("Failed to update car authorization, setup already finished.");
            return;
        }
        sbpVar.l = z;
        rod rodVar = sbpVar.o;
        CarSetupServiceImpl.a.f().ai(8623).y("Received projectionAuthorization update: %s", Boolean.valueOf(z));
        CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) rodVar.a;
        carSetupServiceImpl.t.e(z, carSetupServiceImpl.j.c);
        carSetupServiceImpl.j.p = z;
    }

    @Override // defpackage.seb
    public final void n() {
        this.i = true;
    }

    @Override // defpackage.seb
    public final void o() {
        this.b.j(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.seg, android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public final void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        sbp sbpVar;
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        if (this.j || (sbpVar = this.b) == null) {
            return;
        }
        ykd ykdVar = new ykd(this, null);
        if (!sbpVar.k) {
            ykdVar.w();
        } else if (sbpVar.p != null) {
            sbp.a.g().ai(8727).u("Unexpected listener registration");
            sbpVar.m(Boolean.FALSE);
        } else {
            sbpVar.p = ykdVar;
            CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) sbpVar.o.a;
            sky skyVar = carSetupServiceImpl.y;
            if (skyVar != null) {
                skyVar.b();
                carSetupServiceImpl.y = null;
            }
        }
        this.j = true;
    }

    @Override // defpackage.seg, android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        sbz sbxVar;
        IBinder iBinderE;
        super.onAttach(context);
        this.f = context;
        if (this.b == null) {
            try {
                Intent intent = ((bc) context).getIntent();
                ypf ypfVar = sbp.a;
                IBinder iBinder = ((BinderParcel) intent.getParcelableExtra("frx_state")).a;
                sbp sbpVar = null;
                if (iBinder == null) {
                    sbxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.carsetup.ILocalBinderTransport");
                    sbxVar = iInterfaceQueryLocalInterface instanceof sbz ? (sbz) iInterfaceQueryLocalInterface : new sbx(iBinder);
                }
                try {
                    iBinderE = sbxVar.e();
                } catch (RemoteException unused) {
                    iBinderE = null;
                }
                if (iBinderE != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderE.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    sbpVar = (sbp) sqi.a(iInterfaceQueryLocalInterface2 instanceof sqj ? (sqj) iInterfaceQueryLocalInterface2 : new sqh(iBinderE));
                }
                this.b = sbpVar;
            } catch (Exception e2) {
                e.g().p(e2).ai(8750).u("Failed to get FrxState");
            }
        }
        this.h = new sad(context, this.b);
    }

    @Override // defpackage.seg, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(null);
        if (this.b == null) {
            ((bc) getContext()).finish();
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        if (!this.g) {
            FsmController fsmController = this.d;
            rhx rhxVar = rhx.c;
            if (acsl.g() && fsmController != null && fsmController.g != null) {
                fsmController.f("EVENT_CAR_DISCONNECTED", null);
            }
            sbp sbpVar = this.b;
            if (sbpVar != null) {
                sbpVar.n();
            }
            this.g = true;
            this.b = null;
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        FsmController fsmController = this.d;
        sej sejVar = fsmController == null ? null : fsmController.g;
        if (sejVar != null) {
            e.f().ai(8753).u("FRX_ACTIVITY_START");
            k(46, sejVar.a(), yyb.FRX_ACTIVITY_START.aW);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        FsmController fsmController = this.d;
        sej sejVar = fsmController == null ? null : fsmController.g;
        if (sejVar != null) {
            e.f().ai(8754).u("FRX_ACTIVITY_STOP");
            k(sejVar.a(), 46, yyb.FRX_ACTIVITY_STOP.aW);
        }
        super.onStop();
    }

    @Override // defpackage.seb
    public final boolean p() {
        return this.h.e().isEmpty();
    }

    @Override // defpackage.seb
    public final boolean q() {
        return this.b.f;
    }

    @Override // defpackage.seb
    public final boolean r() {
        return this.b.l;
    }

    @Override // defpackage.seb
    public final boolean s() {
        try {
            Context context = this.f;
            qtr.b(context, skn.a(context).b(context.getPackageName()));
            return true;
        } catch (IllegalStateException | SecurityException unused) {
            return false;
        }
    }

    @Override // defpackage.seb
    public final boolean t() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // defpackage.seb
    public final boolean u() {
        return !this.b.c.d("car_only_connect_to_known_cars", false);
    }

    @Override // defpackage.seb
    public final boolean v() {
        sbp sbpVar = this.b;
        if (!sbpVar.k) {
            return false;
        }
        if (!sbpVar.m) {
            rod rodVar = sbpVar.o;
            ((CarSetupServiceImpl) rodVar.a).i(sbpVar.g, true);
            sbpVar.m = true;
        }
        return sbpVar.n;
    }

    @Override // defpackage.seb
    public final Intent w() {
        String strB;
        sbp sbpVar = this.b;
        Intent intent = new Intent();
        Context context = sbpVar.b;
        try {
            strB = qtr.b(context, skn.a(context).b(context.getPackageName()));
        } catch (IllegalStateException | SecurityException unused) {
            strB = "";
        }
        Intent intentPutExtra = intent.setComponent(new ComponentName(strB, "com.google.android.projection.gearhead.frx.SetupActivity")).putExtra("com.google.android.gearhead.CAKEWALK_STYLE", true);
        rhx rhxVar = rhx.c;
        intentPutExtra.putExtra("EXTRA_GEARHEAD_ORIGIN", true);
        return intentPutExtra;
    }

    @Override // defpackage.seb
    public final void x() {
        sbp sbpVar = this.b;
        if (sbpVar != null) {
            if (sbpVar.j) {
                sbp.a.g().ai(8728).u("Failed to set bluetooth authorization, setup already finished.");
                return;
            }
            rod rodVar = sbpVar.o;
            CarSetupServiceImpl.a.f().ai(8622).y("Received BTAuthorization update: %s", true);
            CarSetupServiceImpl carSetupServiceImpl = (CarSetupServiceImpl) rodVar.a;
            carSetupServiceImpl.t.e(carSetupServiceImpl.j.p, true);
            carSetupServiceImpl.j.c = true;
        }
    }

    @Override // defpackage.seb
    public final void y() throws PackageManager.NameNotFoundException {
        Intent intentB;
        String string;
        if (this.i) {
            ypf ypfVar = saj.a;
            Context context = this.f;
            sbp sbpVar = this.b;
            int i = sbpVar.c.b.getInt("times_show_reminder_notification", 0);
            ypf ypfVar2 = saj.a;
            ypfVar2.l().ai(8597).w("maybePostReminderNotification %d", i);
            if (i < adbe.a.gu().a()) {
                set setVar = seu.a;
                if (!setVar.c(context)) {
                    String string2 = context.getString(R.string.car_setup_android_auto_reminder_title);
                    String string3 = context.getString(R.string.car_setup_android_auto_reminder_message);
                    int iA = setVar.a(context);
                    if (iA == 2) {
                        intentB = sev.b(context, "utm_source%3Dgms_car_setup%26utm_campaign%3Dgms_car_setup_update_the_app");
                        string = context.getString(R.string.car_setup_get_the_app);
                    } else if (iA != 3) {
                        string = null;
                        intentB = null;
                    } else {
                        intentB = sev.b(context, "utm_source%3Dgms_car_setup%26utm_campaign%3Dgms_car_setup_get_the_app");
                        string = context.getString(R.string.car_setup_get_the_app);
                    }
                    if (intentB != null) {
                        PendingIntent pendingIntentA = ssn.a(context, intentB, ssn.a | 134217728);
                        dst dstVar = new dst(0, string, pendingIntentA);
                        dsx dsxVar = new dsx(context, null);
                        dsxVar.i(string2);
                        dsxVar.h(string3);
                        dsxVar.n(2131231122);
                        dsxVar.t = context.getColor(R.color.car_light_blue_500);
                        dsw dswVar = new dsw();
                        dswVar.d(string3);
                        dsxVar.o(dswVar);
                        dsxVar.e(16, true);
                        dsxVar.e(8, true);
                        dsxVar.l();
                        dsxVar.g(dstVar);
                        dsxVar.g = pendingIntentA;
                        Notification notificationA = dsxVar.a();
                        kwp kwpVarE = kwp.e(context);
                        notificationA.getClass();
                        ((NotificationManager) kwpVarE.a).notify(null, 100, notificationA);
                        sbpVar.j(i + 1);
                        if (iA == 3) {
                            sbpVar.g(yzy.nM);
                        } else if (iA == 2) {
                            sbpVar.g(yzy.nN);
                        }
                        ypfVar2.l().ai(8598).y("Reminder Intent %s", intentB.toUri(0));
                    }
                }
            }
        }
        if (!this.g) {
            sbp sbpVar2 = this.b;
            if (sbpVar2 != null) {
                sbpVar2.n();
            }
            this.g = true;
        }
        A(false);
    }

    @Override // defpackage.seb
    public final erb z() {
        return this.h.e;
    }
}
