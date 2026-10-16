package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class khx {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.CPCalendarStore");
    public static final j$.time.Duration b = j$.time.Duration.ofSeconds(10);
    public final java.util.concurrent.ScheduledExecutorService c = java.util.concurrent.Executors.newScheduledThreadPool(1);

    private static boolean d() {
        return defpackage.duw.c(defpackage.mkp.a.c, "android.permission.READ_CALENDAR") == 0;
    }

    private static final void e() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            java.lang.String.format(java.util.Locale.US, "[runningOnWork=unknown, sdk=%d]", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
        } else {
            java.lang.String.format("[runningOnWork=%b]", java.lang.Boolean.valueOf(defpackage.kwu.b().c()));
        }
    }

    public final defpackage.zhs a(j$.time.LocalDate localDate) {
        e();
        defpackage.zif zifVar = new defpackage.zif();
        if (d()) {
            defpackage.wfp.e(new kht(this, localDate, zifVar));
            return zifVar;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3103)).u("[All-Day Events]: Permission not granted. Returning empty list.");
        int i = defpackage.ygw.d;
        zifVar.o(defpackage.ymx.a);
        return zifVar;
    }

    public final defpackage.zhs b(final java.lang.Long l) {
        e();
        final defpackage.zif zifVar = new defpackage.zif();
        if (d()) {
            defpackage.wfp.e(new java.lang.Runnable() { // from class: khv
                /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
                @Override // java.lang.Runnable
                public final void run() throws wfo {
                    java.util.concurrent.Executor executorM = hh$.ExternalSyntheticApiModelOutline0.m(defpackage.mkp.a.c);
                    defpackage.khs khsVarE = defpackage.khs.e();
                    defpackage.afdo afdoVar = defpackage.tcu.a;
                    defpackage.zhs zhsVarI = defpackage.tan.i(khsVarE.b(new defpackage.eqs(l)), defpackage.khx.b, this.a.c);
                    defpackage.ysr.cy(defpackage.zhm.v(zhsVarI), new defpackage.khw(3), executorM);
                    zifVar.r(zhsVarI);
                }
            });
            return zifVar;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3106)).u("[Reminders]: Permission not granted. Returning empty list.");
        int i = defpackage.ygw.d;
        zifVar.o(defpackage.ymx.a);
        return zifVar;
    }

    public final defpackage.zhs c(java.lang.Long l, java.lang.Long l2) {
        e();
        defpackage.zif zifVar = new defpackage.zif();
        if (d()) {
            defpackage.wfp.e(new khu(this, l, l2, zifVar));
            return zifVar;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 3109)).u("[Timed Events]: Permission not granted. Returning empty list.");
        int i = defpackage.ygw.d;
        zifVar.o(defpackage.ymx.a);
        return zifVar;
    }
}
