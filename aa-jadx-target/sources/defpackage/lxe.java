package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lxe implements defpackage.lhn, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SmsBrdcstRcv");
    public final android.content.Context b;
    public int d;
    private boolean e;
    private defpackage.xzi g;
    public final java.util.Set c = new java.util.HashSet();
    private final android.content.BroadcastReceiver f = new defpackage.lxd(this);

    public lxe(android.content.Context context) {
        this.b = context;
    }

    public static defpackage.lxe a() {
        return (defpackage.lxe) defpackage.mkp.a.i(defpackage.lxe.class);
    }

    public final void b(java.util.function.Consumer consumer) {
        this.c.add(consumer);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.g = null;
        if (this.e) {
            this.b.unregisterReceiver(this.f);
            this.e = false;
        }
        this.d = 0;
        defpackage.mni.a().d(defpackage.mnh.v);
    }

    public final void e(java.util.function.Consumer consumer) {
        this.c.remove(consumer);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (f(defpackage.kit.b().e())) {
            defpackage.mni.a().b(defpackage.mnh.v, this);
            if (this.e) {
                return;
            }
            this.e = true;
            defpackage.duw.e(this.b, this.f, new android.content.IntentFilter("android.provider.Telephony.SMS_RECEIVED"), null, 2);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean f(defpackage.qsh qshVar) {
        defpackage.xzi xziVarAQ = this.g;
        if (xziVarAQ == null) {
            xziVarAQ = defpackage.ysr.aQ(new defpackage.pmg(this, qshVar, 1));
            this.g = xziVarAQ;
        }
        return ((java.lang.Boolean) xziVarAQ.fF()).booleanValue();
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        try {
            defpackage.xzi xziVar = this.g;
            if (xziVar == null) {
                printWriter.println("SmsBroadcastReceiver is out of lifecycle so there is no status.");
            } else {
                printWriter.printf("SmsBroadcastReceiver | Enabled: %b; SMSs received this session: %d%n", xziVar.fF(), java.lang.Integer.valueOf(this.d));
            }
        } catch (java.lang.Throwable th) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(th)).ai((char) 4424)).u("Failed to produce report status for SmsBroadcastReceiver");
            printWriter.println("Failed to produce status report for SmsBroadcastReceiver");
            printWriter.println(th);
        }
    }
}
