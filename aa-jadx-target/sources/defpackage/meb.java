package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class meb implements defpackage.mds, defpackage.mnj {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.PermissionChecker");
    private final defpackage.ygy b;
    private final android.content.Context c;

    public meb(android.content.Context context) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4787)).y("checking permission for package: %s", context.getPackageName());
        if (!defpackage.acyc.a.fF().aV() || android.os.Build.VERSION.SDK_INT < 36) {
            context.getClass();
            this.c = context;
        } else {
            context.getClass();
            this.c = axd$.ExternalSyntheticApiModelOutline0.m(context, 0);
        }
        ((defpackage.yqj) yqmVar.l().ai(4788)).w("initAppPermissions: %d", android.os.Build.VERSION.SDK_INT);
        defpackage.ygx ygxVar = new defpackage.ygx();
        defpackage.mdr mdrVar = defpackage.mdr.a;
        ygxVar.b(mdrVar, "android.permission.READ_PHONE_STATE");
        ygxVar.b(mdrVar, "android.permission.CALL_PHONE");
        defpackage.mdr mdrVar2 = defpackage.mdr.c;
        ygxVar.b(mdrVar2, "android.permission.ACCESS_FINE_LOCATION");
        ygxVar.b(mdrVar2, "com.google.android.gms.permission.CAR_SPEED");
        defpackage.mdr mdrVar3 = defpackage.mdr.d;
        ygxVar.b(mdrVar3, "android.permission.RECEIVE_SMS");
        ygxVar.b(mdrVar3, "android.permission.SEND_SMS");
        ygxVar.b(defpackage.mdr.e, "android.permission.RECORD_AUDIO");
        ygxVar.b(defpackage.mdr.b, "android.permission.READ_CONTACTS");
        ygxVar.b(defpackage.mdr.g, "android.permission.READ_CALL_LOG");
        if (defpackage.ebq.o()) {
            ygxVar.b(defpackage.mdr.f, "android.permission.READ_CALENDAR");
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.mdr mdrVar4 = defpackage.mdr.h;
            ygxVar.b(mdrVar4, "android.permission.BLUETOOTH_CONNECT");
            ygxVar.b(mdrVar4, "android.permission.BLUETOOTH_SCAN");
        }
        this.b = ygxVar.a();
        int i = defpackage.mni.a;
        ((defpackage.mni) defpackage.mkp.a.i(defpackage.mni.class)).b(defpackage.mnh.t, this);
    }

    private static final java.lang.String A(java.lang.String str) {
        java.lang.String[] strArr = {"com.google.android.gms.permission.", "android.permission."};
        for (int i = 0; i < 2; i++) {
            java.lang.String str2 = strArr[i];
            if (str.startsWith(str2)) {
                return str.substring(str2.length());
            }
        }
        return str;
    }

    private final boolean y(java.lang.String str, boolean z) {
        android.content.Context context = this.c;
        try {
            int iM = a$.ExternalSyntheticApiModelOutline2.m(context.getPackageManager(), str, 0);
            return (z ? defpackage.dmh.F(context, "android.permission.RECORD_AUDIO", -1, iM, str) : context.checkPermission("android.permission.RECORD_AUDIO", -1, iM)) == 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 4794)).y("Failed to get package uid for %s", str);
            return false;
        }
    }

    private final boolean z(java.lang.String str) {
        return defpackage.duw.c(this.c, str) == 0;
    }

    @Override // defpackage.mds
    public final defpackage.ygw a(defpackage.mdr mdrVar) {
        return this.b.c(mdrVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mds
    public final defpackage.yhe b() {
        defpackage.yha yhaVar = new defpackage.yha(4);
        defpackage.mdr[] mdrVarArrValues = defpackage.mdr.values();
        int length = mdrVarArrValues.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return yhaVar.d(true);
            }
            defpackage.mdr mdrVar = mdrVarArrValues[i];
            defpackage.ygw ygwVarA = a(mdrVar);
            if (ygwVarA.isEmpty() || !z((java.lang.String) ygwVarA.get(0))) {
                z = false;
            }
            yhaVar.f(mdrVar, java.lang.Boolean.valueOf(z));
            i++;
        }
    }

    @Override // defpackage.mds
    public final void c() {
        defpackage.omf.u().x(13, new defpackage.dun(this.c).c() ? defpackage.zaa.PERMISSIONS_SYSTEM_NOTIFICATION_ENABLED : defpackage.zaa.PERMISSIONS_SYSTEM_NOTIFICATION_BLOCKED);
    }

    @Override // defpackage.mds
    public final void d(android.app.Activity activity, java.lang.String str) {
        e(activity, defpackage.ygw.q(str));
    }

    @Override // defpackage.mds
    public final void e(android.app.Activity activity, java.util.Collection collection) {
        dst.a(activity, (java.lang.String[]) collection.toArray(new java.lang.String[0]), 46);
    }

    @Override // defpackage.mds
    public final boolean f() {
        return j(this.b.d());
    }

    @Override // defpackage.mds
    public final boolean g() {
        return j(this.b.c(defpackage.mdr.h));
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        mnl mnlVarL = mnq.l();
        mnm mnmVarA = mnn.a();
        mnmVarA.a = "Group";
        mnmVarA.b();
        mnmVarA.c('|');
        mnmVarA.d(true);
        mnlVarL.b(mnmVarA.a());
        mnm mnmVarA2 = mnn.a();
        mnmVarA2.a = "Permission";
        mnmVarA2.b();
        mnmVarA2.c('|');
        mnmVarA2.d(true);
        mnlVarL.b(mnmVarA2.a());
        mnm mnmVarA3 = mnn.a();
        mnmVarA3.a = "Granted";
        mnmVarA3.b();
        mnmVarA3.c('|');
        mnmVarA3.d(true);
        mnlVarL.b(mnmVarA3.a());
        defpackage.yot it = this.b.u().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            mnlVarL.c(new java.lang.Object[]{entry.getKey(), A((java.lang.String) entry.getValue()), java.lang.Boolean.valueOf(z((java.lang.String) entry.getValue()))});
        }
        mnlVarL.c(new java.lang.Object[]{"SENSITIVE", "SYSTEM_ALERT_WINDOW_PERMISSION", java.lang.Boolean.valueOf(n())});
        mnlVarL.c(new java.lang.Object[]{"SENSITIVE", "NOTIFICATION_LISTENER_SERVICE", java.lang.Boolean.valueOf(m())});
        mnlVarL.a().m(printWriter);
    }

    @Override // defpackage.mds
    public final boolean i() {
        return j(this.b.c(defpackage.mdr.b));
    }

    @Override // defpackage.mds
    public final boolean j(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!z(str)) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 4789)).y("Permission is not granted: %s", str);
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mds
    public final boolean k() {
        return j(this.b.c(defpackage.mdr.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mds
    public final boolean l(android.app.Activity activity) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.yot it = this.b.d().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!z(str)) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 4791)).y("Permission is not granted: %s", str);
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        e(activity, arrayList);
        return false;
    }

    @Override // defpackage.mds
    public final boolean m() {
        return cgu$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) this.c.getSystemService(android.app.NotificationManager.class), ((defpackage.mbt) defpackage.mkp.a.i(defpackage.mbt.class)).a());
    }

    @Override // defpackage.mds
    public final boolean n() {
        java.lang.String strBm;
        boolean z = true;
        if (android.os.Build.FINGERPRINT.contains(":7.1.2/")) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4793)).u("Device running N-MR2. Probing for overlay support.");
            android.content.Context context = this.c;
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            android.view.View view = new android.view.View(context);
            view.setBackgroundResource(android.R.color.transparent);
            try {
                windowManager.addView(view, new android.view.WindowManager.LayoutParams(1, 1, 0, 0, 2010, 312, -2));
                windowManager.removeView(view);
                return true;
            } catch (java.lang.Exception e) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4797)).y("Overlay permission denied: %s", e);
                return false;
            }
        }
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4792)).u("Checking for overlay permission.");
        android.content.Context context2 = this.c;
        android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) context2.getSystemService("appops");
        int iMyUid = android.os.Process.myUid();
        java.lang.String packageName = context2.getPackageName();
        int iCheckOpNoThrow = appOpsManager.checkOpNoThrow("android:system_alert_window", iMyUid, packageName);
        if (iCheckOpNoThrow == 0) {
            strBm = "ALLOWED";
        } else if (iCheckOpNoThrow == 3) {
            z = context2.checkSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == 0;
            strBm = "DEFAULT";
        } else {
            if (iCheckOpNoThrow == 2) {
                strBm = "ERRORED";
            } else {
                strBm = iCheckOpNoThrow == 1 ? "IGNORED" : defpackage.a.bm(iCheckOpNoThrow, "UNKNOWN (", ")");
            }
            z = false;
        }
        ((defpackage.yqj) yqmVar.l().ai(4790)).R("checkOpNoThrow(SYSTEM_ALERT_WINDOW, %d, %s) = %s", java.lang.Integer.valueOf(iMyUid), packageName, strBm);
        return z;
    }

    @Override // defpackage.mds
    public final boolean o(java.lang.String str) {
        if (defpackage.slj.a(this.c).b(str)) {
            return "com.google.android.googlequicksearchbox".equals(str) || "com.google.android.projection.gearhead".equals(str);
        }
        return false;
    }

    @Override // defpackage.mds
    public final boolean p() {
        return z("android.permission.READ_CALENDAR");
    }

    @Override // defpackage.mds
    public final boolean q() {
        return z("android.permission.READ_CALL_LOG");
    }

    @Override // defpackage.mds
    public final boolean r() {
        return z("com.google.android.gms.permission.CAR_SPEED");
    }

    @Override // defpackage.mds
    public final boolean s() {
        return z("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // defpackage.mds
    public final boolean t() {
        return z("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // defpackage.mds
    public final boolean u() {
        return y(this.c.getPackageName(), true);
    }

    @Override // defpackage.mds
    public final boolean v(java.lang.String str) {
        return y(str, false);
    }

    @Override // defpackage.mds
    public final boolean w() {
        return z("android.permission.RECEIVE_SMS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mds
    public final java.lang.String[] x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.yot it = this.b.d().iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
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
        java.util.Collections.sort(arrayList);
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }
}
