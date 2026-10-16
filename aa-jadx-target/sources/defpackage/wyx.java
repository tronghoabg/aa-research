package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wyx {
    static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean();
    public static final /* synthetic */ int b = 0;

    public static void a() {
        if (a.compareAndSet(false, true)) {
            defpackage.zki zkiVar = new defpackage.zki(new defpackage.tft(1), new defpackage.tft(0));
            defpackage.yrz.b();
            defpackage.yrz.a(zkiVar);
            defpackage.yse.a.c();
            defpackage.rrx.a = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [android.content.SharedPreferences, java.lang.Object] */
    public static void b(android.content.Context context, defpackage.jrm jrmVar, defpackage.zzx zzxVar, defpackage.qsh qshVar, defpackage.yzn yznVar, java.util.concurrent.Executor executor) {
        java.lang.Object objValueOf;
        boolean z;
        a();
        if (executor != null) {
            defpackage.tfv.b = executor;
        }
        defpackage.tfu tfuVar = defpackage.tfu.a;
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(zzxVar);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.String string = ((defpackage.zzx) optionalOfNullable.get()).b.getString("vn_log_buffer_size", "");
            if (string.isEmpty()) {
                optionalOfNullable = j$.util.Optional.empty();
            } else {
                try {
                    optionalOfNullable = j$.util.Optional.of(java.lang.Integer.valueOf(java.lang.Integer.parseInt(string)));
                } catch (java.lang.NumberFormatException unused) {
                    optionalOfNullable = j$.util.Optional.empty();
                }
            }
        }
        defpackage.wyw wywVar = new defpackage.wyw(yznVar);
        if (true != optionalOfNullable.isPresent()) {
            objValueOf = java.lang.Integer.valueOf(wywVar.a == defpackage.yzn.ALPHA ? 5000 : 500);
        } else {
            objValueOf = optionalOfNullable.get();
        }
        defpackage.tfv.e(tfuVar, ((java.lang.Integer) objValueOf).intValue());
        defpackage.tfv.e(defpackage.tfu.d, yznVar == defpackage.yzn.PROD ? 250 : 500);
        defpackage.tfv.e(defpackage.tfu.e, true != jrmVar.equals(defpackage.jrm.SHARED_SERVICE) ? 0 : 50);
        defpackage.tfv.e(defpackage.tfu.b, 500);
        defpackage.acqw acqwVar = defpackage.acqw.a;
        defpackage.tfv.a = acqwVar.fF().a();
        if (zzxVar != null) {
            if (zzxVar.b.getBoolean("vn_force_verbose_logging", ((android.content.Context) zzxVar.a).getResources().getBoolean(2131034142))) {
                z = true;
            } else {
                z = false;
            }
        } else if (context.getResources().getBoolean(2131034142)) {
            z = true;
        } else {
            z = false;
        }
        boolean zB = acqwVar.fF().b();
        if (qshVar != null && !zB && !z) {
            try {
                defpackage.mkp.a.g();
                zB = ((defpackage.qtv) qshVar).d().N("car_force_logging");
            } catch (defpackage.qst unused2) {
            }
        }
        if (z) {
            defpackage.tfr.a.set(2);
            defpackage.tfv.c.put(defpackage.tfu.a, 2);
            defpackage.omv.b = true;
            defpackage.omv.a = true;
            defpackage.ooa.a = true;
            return;
        }
        if (zB) {
            defpackage.tfr.a.set(3);
            defpackage.tfv.c.put(defpackage.tfu.a, 3);
            defpackage.omv.b = false;
            defpackage.omv.a = true;
            defpackage.ooa.a = true;
            return;
        }
        defpackage.tfr.a.set(7);
        defpackage.tfv.c.put(defpackage.tfu.a, 3);
        defpackage.omv.b = false;
        defpackage.omv.a = false;
        defpackage.ooa.a = false;
    }
}
