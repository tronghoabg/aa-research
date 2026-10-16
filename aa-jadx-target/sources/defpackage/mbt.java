package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbt {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public mbt() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(bool, bxvVar);
    }

    public static defpackage.mbt b() {
        return (defpackage.mbt) defpackage.mkp.a.i(defpackage.mbt.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public static void c(java.io.PrintWriter printWriter, defpackage.afak afakVar) {
        java.lang.String strConcat;
        defpackage.mbt mbtVar = new defpackage.mbt(afakVar, (defpackage.afak) null);
        printWriter.printf("Connectivity event logger history\n", new java.lang.Object[0]);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        int i = 5;
        for (java.util.Map.Entry entry : defpackage.xzd.d(",").b().f().j("/").k(mbtVar.a.getString("drive_session_info_key", "")).entrySet()) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            try {
                strConcat = simpleDateFormat.format(java.lang.Long.valueOf((java.lang.String) entry.getValue()));
            } catch (java.lang.NumberFormatException unused) {
                strConcat = "unknown - ".concat(java.lang.String.valueOf((java.lang.String) entry.getValue()));
            }
            printWriter.printf("%s: %s\n", strConcat, entry.getKey());
            i = i2;
        }
        printWriter.println();
    }

    public static final java.lang.String e(okf okfVar) {
        return okfVar.c.name();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.content.ComponentName a() {
        return new android.content.ComponentName((android.content.Context) this.b, (java.lang.Class<?>) ((defpackage.ygw) this.a).get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dte, java.lang.Object] */
    public final void d(okf okfVar) {
        ?? B = okfVar.n().f() ? okfVar.n().b() : ((android.content.Context) this.a).getString(2132085410);
        java.lang.String strO = okfVar.o();
        android.content.Context context = (android.content.Context) this.a;
        ?? dteVar = new defpackage.dte(context, strO);
        dteVar.l();
        dteVar.r = "status";
        dteVar.n(2131231572);
        dteVar.t = context.getColor(2131103604);
        dteVar.u = okfVar.h();
        dteVar.i = okfVar.g();
        dteVar.i(okfVar.b());
        dteVar.h(B);
        j$.util.Optional optionalOf = okfVar.i().f() ? j$.util.Optional.of(android.app.PendingIntent.getActivity(context, 0, (android.content.Intent) okfVar.i().b(), 201326592)) : j$.util.Optional.ofNullable(wer.b(context, 0, new android.content.Intent().setClassName(context, "com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity").setFlags(335544320), 201326592));
        mlc mlcVar = new mlc((java.lang.Object) dteVar, 6);
        if (true == optionalOf.isPresent()) {
            ((defpackage.dte) mlcVar.a).g = (android.app.PendingIntent) optionalOf.get();
        }
        if (okfVar.f() == 4) {
            dteVar.m(1, 0, true);
        }
        ((android.app.NotificationManager) this.b).notify(e(okfVar), 24, dteVar.a());
        if (okfVar.l().f()) {
            defpackage.omv.i(context, (defpackage.yyn) okfVar.l().b());
        } else {
            defpackage.omv.k(context, defpackage.yyn.TROUBLESHOOTER_ISSUE_NOTIFIED, okfVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bwx, java.lang.Object] */
    public final void f(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public mbt(java.util.Map map, defpackage.jdg jdgVar) {
        this.a = map;
        this.b = jdgVar;
    }

    public mbt(android.content.Context context, defpackage.ygw ygwVar) {
        this.b = context;
        this.a = ygwVar;
    }

    public mbt(android.content.Context context) {
        this.a = context;
        java.lang.Object systemService = context.getSystemService("notification");
        systemService.getClass();
        this.b = (android.app.NotificationManager) systemService;
    }

    public mbt(defpackage.afak afakVar, defpackage.afak afakVar2) {
        this.a = (android.content.SharedPreferences) afakVar.a();
        this.b = afakVar2 == null ? null : afakVar2.a();
    }
}
