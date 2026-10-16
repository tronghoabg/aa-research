package defpackage;

import android.R;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.WindowManager;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class mdt implements mdk, mnd {
    private static final yph a = yph.c("GH.PermissionChecker");
    private final yfs b;
    private final Context c;

    public mdt(Context context) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4784)).y("checking permission for package: %s", context.getPackageName());
        if (!acxa.a.gu().aS() || Build.VERSION.SDK_INT < 36) {
            context.getClass();
            this.c = context;
        } else {
            context.getClass();
            this.c = context.createDeviceContext(0);
        }
        ((ype) yphVar.l().ai(4785)).w("initAppPermissions: %d", Build.VERSION.SDK_INT);
        yfr yfrVar = new yfr();
        mdj mdjVar = mdj.a;
        yfrVar.b(mdjVar, "android.permission.READ_PHONE_STATE");
        yfrVar.b(mdjVar, "android.permission.CALL_PHONE");
        mdj mdjVar2 = mdj.c;
        yfrVar.b(mdjVar2, "android.permission.ACCESS_FINE_LOCATION");
        yfrVar.b(mdjVar2, "com.google.android.gms.permission.CAR_SPEED");
        mdj mdjVar3 = mdj.d;
        yfrVar.b(mdjVar3, "android.permission.RECEIVE_SMS");
        yfrVar.b(mdjVar3, "android.permission.SEND_SMS");
        yfrVar.b(mdj.e, "android.permission.RECORD_AUDIO");
        yfrVar.b(mdj.b, "android.permission.READ_CONTACTS");
        yfrVar.b(mdj.g, "android.permission.READ_CALL_LOG");
        if (dsg.A()) {
            yfrVar.b(mdj.f, "android.permission.READ_CALENDAR");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            mdj mdjVar4 = mdj.h;
            yfrVar.b(mdjVar4, "android.permission.BLUETOOTH_CONNECT");
            yfrVar.b(mdjVar4, "android.permission.BLUETOOTH_SCAN");
        }
        this.b = yfrVar.a();
        int i = mnc.a;
        ((mnc) mki.a.i(mnc.class)).b(mnb.t, this);
    }

    private static final String A(String str) {
        String[] strArr = {"com.google.android.gms.permission.", "android.permission."};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2)) {
                return str.substring(str2.length());
            }
        }
        return str;
    }

    private final boolean y(String str, boolean z) throws PackageManager.NameNotFoundException {
        Context context = this.c;
        try {
            int packageUid = context.getPackageManager().getPackageUid(str, 0);
            return ((!z || !acxa.X()) ? context.checkPermission("android.permission.RECORD_AUDIO", -1, packageUid) : dln.o(context, "android.permission.RECORD_AUDIO", -1, packageUid, str)) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 4791)).y("Failed to get package uid for %s", str);
            return false;
        }
    }

    private final boolean z(String str) {
        return dup.c(this.c, str) == 0;
    }

    @Override // defpackage.mdk
    public final yfq a(mdj mdjVar) {
        return this.b.c(mdjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdk
    public final yfy b() {
        yfu yfuVar = new yfu(4);
        mdj[] mdjVarArrValues = mdj.values();
        int length = mdjVarArrValues.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return yfuVar.d(true);
            }
            mdj mdjVar = mdjVarArrValues[i];
            yfq yfqVarA = a(mdjVar);
            if (yfqVarA.isEmpty() || !z((String) yfqVarA.get(0))) {
                z = false;
            }
            yfuVar.e(mdjVar, Boolean.valueOf(z));
            i++;
        }
    }

    @Override // defpackage.mdk
    public final void c() {
        ebf.j().x(13, new dug(this.c).c() ? yyv.PERMISSIONS_SYSTEM_NOTIFICATION_ENABLED : yyv.PERMISSIONS_SYSTEM_NOTIFICATION_BLOCKED);
    }

    @Override // defpackage.mdk
    public final void d(Activity activity, String str) {
        e(activity, yfq.q(str));
    }

    @Override // defpackage.mdk
    public final void e(Activity activity, Collection collection) {
        dsm.a(activity, (String[]) collection.toArray(new String[0]), 46);
    }

    @Override // defpackage.mdk
    public final boolean f() {
        return j(this.b.d());
    }

    @Override // defpackage.mdk
    public final boolean g() {
        return j(this.b.c(mdj.h));
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        mnf mnfVarL = mnk.l();
        mng mngVarA = mnh.a();
        mngVarA.a = "Group";
        mngVarA.b();
        mngVarA.c('|');
        mngVarA.d(true);
        mnfVarL.b(mngVarA.a());
        mng mngVarA2 = mnh.a();
        mngVarA2.a = "Permission";
        mngVarA2.b();
        mngVarA2.c('|');
        mngVarA2.d(true);
        mnfVarL.b(mngVarA2.a());
        mng mngVarA3 = mnh.a();
        mngVarA3.a = "Granted";
        mngVarA3.b();
        mngVarA3.c('|');
        mngVarA3.d(true);
        mnfVarL.b(mngVarA3.a());
        yno it = this.b.u().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mnfVarL.c(entry.getKey(), A((String) entry.getValue()), Boolean.valueOf(z((String) entry.getValue())));
        }
        mnfVarL.c("SENSITIVE", "SYSTEM_ALERT_WINDOW_PERMISSION", Boolean.valueOf(n()));
        mnfVarL.c("SENSITIVE", "NOTIFICATION_LISTENER_SERVICE", Boolean.valueOf(m()));
        mnfVarL.a().m(printWriter);
    }

    @Override // defpackage.mdk
    public final boolean i() {
        return j(this.b.c(mdj.b));
    }

    @Override // defpackage.mdk
    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z(str)) {
                ((ype) ((ype) a.g()).ai((char) 4786)).y("Permission is not granted: %s", str);
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mdk
    public final boolean k() {
        return j(this.b.c(mdj.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdk
    public final boolean l(Activity activity) {
        ArrayList arrayList = new ArrayList();
        yno it = this.b.d().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z(str)) {
                ((ype) ((ype) a.g()).ai((char) 4788)).y("Permission is not granted: %s", str);
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        e(activity, arrayList);
        return false;
    }

    @Override // defpackage.mdk
    public final boolean m() {
        return ((NotificationManager) this.c.getSystemService(NotificationManager.class)).isNotificationListenerAccessGranted(((mbm) mki.a.i(mbm.class)).a());
    }

    @Override // defpackage.mdk
    public final boolean n() {
        String strBn;
        if (Build.FINGERPRINT.contains(":7.1.2/")) {
            ((ype) ((ype) a.h()).ai((char) 4790)).u("Device running N-MR2. Probing for overlay support.");
            Context context = this.c;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            View view = new View(context);
            view.setBackgroundResource(R.color.transparent);
            try {
                windowManager.addView(view, new WindowManager.LayoutParams(1, 1, 0, 0, 2010, 312, -2));
                windowManager.removeView(view);
                return true;
            } catch (Exception e) {
                ((ype) ((ype) a.h()).ai((char) 4794)).y("Overlay permission denied: %s", e);
                return false;
            }
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 4789)).u("Checking for overlay permission.");
        Context context2 = this.c;
        AppOpsManager appOpsManager = (AppOpsManager) context2.getSystemService("appops");
        int iMyUid = Process.myUid();
        String packageName = context2.getPackageName();
        int iCheckOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", iMyUid, packageName);
        if (iCheckOpNoThrow == 0) {
            strBn = "ALLOWED";
        } else if (iCheckOpNoThrow == 3) {
            z = context2.checkSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == 0;
            strBn = "DEFAULT";
        } else {
            strBn = iCheckOpNoThrow == 2 ? "ERRORED" : iCheckOpNoThrow == 1 ? "IGNORED" : a.bn(iCheckOpNoThrow, "UNKNOWN (", ")");
            z = false;
        }
        ((ype) yphVar.l().ai(4787)).R("checkOpNoThrow(SYSTEM_ALERT_WINDOW, %d, %s) = %s", Integer.valueOf(iMyUid), packageName, strBn);
        return z;
    }

    @Override // defpackage.mdk
    public final boolean o(String str) {
        if (skn.a(this.c).b(str)) {
            return RemoteApiConstants.NOW_PACKAGE.equals(str) || "com.google.android.projection.gearhead".equals(str);
        }
        return false;
    }

    @Override // defpackage.mdk
    public final boolean p() {
        return z("android.permission.READ_CALENDAR");
    }

    @Override // defpackage.mdk
    public final boolean q() {
        return z("android.permission.READ_CALL_LOG");
    }

    @Override // defpackage.mdk
    public final boolean r() {
        return z("com.google.android.gms.permission.CAR_SPEED");
    }

    @Override // defpackage.mdk
    public final boolean s() {
        return z("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // defpackage.mdk
    public final boolean t() {
        return z("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // defpackage.mdk
    public final boolean u() {
        return y(this.c.getPackageName(), true);
    }

    @Override // defpackage.mdk
    public final boolean v(String str) {
        return y(str, false);
    }

    @Override // defpackage.mdk
    public final boolean w() {
        return z("android.permission.RECEIVE_SMS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdk
    public final String[] x() {
        ArrayList arrayList = new ArrayList();
        yno it = this.b.d().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z(str)) {
                arrayList.add(A(str));
            }
        }
        if (n()) {
            arrayList.add("SYSTEM_ALERT_WINDOW_PERMISSION");
        }
        if (m()) {
            arrayList.add("NOTIFICATION_LISTENER_SERVICE");
        }
        Collections.sort(arrayList);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
