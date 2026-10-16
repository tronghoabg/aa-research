package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class omv {
    public static volatile boolean a;
    public static volatile boolean b;

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.oqy a() {
        return (defpackage.oqy) defpackage.mkp.a.i(defpackage.oqy.class);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static final defpackage.qtv b(android.content.Context context, defpackage.rco rcoVar, defpackage.rcq rcqVar, defpackage.qrb qrbVar, int i) {
        if (rcoVar == null) {
            rcoVar = new qtx();
        }
        defpackage.rco rcoVar2 = rcoVar;
        if (rcqVar == null) {
            rcqVar = new defpackage.qty();
        }
        defpackage.rcq rcqVar2 = rcqVar;
        if (qrbVar == null) {
            qrbVar = new defpackage.qtw();
        }
        defpackage.qrb qrbVar2 = qrbVar;
        android.os.Looper mainLooper = context.getMainLooper();
        if (i == 0) {
            i = 1;
        }
        return new defpackage.qtv(context, rcoVar2, rcqVar2, qrbVar2, mainLooper, i);
    }

    public static final boolean c(java.lang.String str, int i) {
        if (a) {
            if (i >= 3 || b) {
                return true;
            }
            i = 2;
        }
        return android.util.Log.isLoggable(str, i);
    }

    public static android.content.Intent d(java.lang.String str, int i, long j) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.putExtra("stage_state", i);
        intent.putExtra("event_time_since_boot", j);
        return intent;
    }

    public static defpackage.xyn e(android.content.Intent intent, java.lang.String str) {
        return intent.hasExtra(str) ? new defpackage.xys(java.lang.Integer.valueOf(intent.getIntExtra(str, -1))) : defpackage.xxe.a;
    }

    public static java.lang.Enum f(android.content.Intent intent, java.lang.Enum[] enumArr) throws defpackage.rsn {
        intent.getClass();
        enumArr.getClass();
        int intExtra = intent.getIntExtra("stage_state", -1);
        if (intExtra == -1) {
            throw new defpackage.rsn("missing the stage_state extra");
        }
        if (intExtra < 0 || intExtra >= enumArr.length) {
            throw new defpackage.rsn(java.lang.String.format("out of bounds %s extra: %d", "stage_state", java.lang.Integer.valueOf(intExtra)));
        }
        return enumArr[intExtra];
    }

    public static void g(android.content.Context context, java.lang.String str, int i, android.os.Bundle bundle) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        android.content.Intent intentD = d(str, i, jElapsedRealtime);
        intentD.setPackage("com.google.android.projection.gearhead");
        android.content.Intent intentD2 = d(str, i, jElapsedRealtime);
        if (bundle != null) {
            intentD.putExtras(bundle);
            intentD2.putExtras(bundle);
        }
        l(context, intentD);
        defpackage.eth.a(context).d(intentD2);
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.Enum r2, android.os.Bundle bundle) {
        g(context, str, r2.ordinal(), bundle);
    }

    public static void i(android.content.Context context, defpackage.yyn yynVar) {
        android.content.Intent intentQ = q(yynVar);
        l(context, intentQ);
        defpackage.eth.a(context).d(intentQ);
        if (defpackage.rlw.n()) {
            defpackage.rlw.m().k(yynVar);
        }
    }

    public static void j(android.content.Context context, defpackage.yyn yynVar, int i) {
        android.content.Intent intentQ = q(yynVar);
        intentQ.putExtra("event_detail", i);
        defpackage.eth.a(context).d(intentQ);
        l(context, intentQ);
        if (defpackage.rlw.n()) {
            defpackage.rlw.m().k(yynVar);
        }
    }

    public static void k(android.content.Context context, defpackage.yyn yynVar, yyt yytVar) {
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.CONNECTIVITY_EVENT");
        intent.putExtra("event_type", yynVar.pE);
        intent.putExtra("event_time_since_boot", android.os.SystemClock.elapsedRealtime());
        intent.putExtra("event_detail", yytVar.r);
        intent.setPackage("com.google.android.projection.gearhead");
        l(context, intent);
    }

    public static void l(android.content.Context context, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            omv$.ExternalSyntheticApiModelOutline1.m(context, intent, (java.lang.String) null, omv$.ExternalSyntheticApiModelOutline1.m(omv$.ExternalSyntheticApiModelOutline1.m(axd$.ExternalSyntheticApiModelOutline0.m(), true)));
        }
    }

    public static void m(android.content.Context context, defpackage.rsr rsrVar, int i) {
        android.os.Bundle bundle;
        if (i != 0) {
            bundle = new android.os.Bundle();
            bundle.putInt("failure_reason", i - 1);
        } else {
            bundle = null;
        }
        g(context, "com.google.android.gms.car.AUTHORIZATION", rsrVar.ordinal(), bundle);
    }

    public static defpackage.yqm n(java.lang.String str) {
        return new defpackage.yqm(defpackage.yrs.d(java.lang.String.valueOf(str).concat(".LITE")));
    }

    public static void o(java.io.PrintWriter printWriter) {
        defpackage.tfv.d(printWriter, defpackage.tfu.c);
    }

    public static defpackage.rro p(defpackage.acbk... acbkVarArr) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 19, defpackage.zaa.LOG_TESTCODES);
        rroVarH.j(acbkVarArr);
        return rroVarH;
    }

    private static android.content.Intent q(defpackage.yyn yynVar) {
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.car.CONNECTIVITY_EVENT");
        intent.putExtra("event_type", yynVar.pE);
        intent.putExtra("event_time_since_boot", android.os.SystemClock.elapsedRealtime());
        intent.setPackage("com.google.android.projection.gearhead");
        return intent;
    }
}
