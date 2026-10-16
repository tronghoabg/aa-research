package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rhc {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.BT.A2DP");
    public final java.util.function.Supplier b;
    private final android.content.Context c;

    public rhc(android.content.Context context, java.util.function.Supplier supplier) {
        this.c = context;
        this.b = supplier;
    }

    public final void a(java.lang.String str, int i) {
        android.content.Context context = this.c;
        defpackage.rhf rhfVarA = defpackage.rhf.a(context);
        rhfVarA.getClass();
        defpackage.ysr.bk(rhfVarA.f(context, new rhb(this, i, rhfVarA, str), 2), "Couldn't get A2DP proxy");
    }

    public final void b(java.lang.String str) {
        if (!c()) {
            a.h().ai(8038).u("Missing permissions for removePolicyAndEnable");
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
        defpackage.whw whwVarD = d();
        phr phrVar = new phr(str, atomicBoolean, 3);
        defpackage.zgt zgtVar = defpackage.zgt.INSTANCE;
        defpackage.ysr.cy(whwVarD.a(phrVar, zgtVar), new defpackage.ozs(this, atomicBoolean, str, 2), zgtVar);
    }

    public final boolean c() {
        return android.os.Build.VERSION.SDK_INT < 31 || defpackage.duw.c(this.c, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final defpackage.whw d() {
        defpackage.whf whfVarA = defpackage.whg.a();
        java.util.regex.Pattern pattern = defpackage.wfx.a;
        defpackage.wfw wfwVar = new defpackage.wfw(this.c);
        wfwVar.b("bluetooth_atwodp_policy");
        wfwVar.c("bluetooth_atwodp_policy.pb");
        whfVarA.d(wfwVar.a());
        whfVarA.c(ric.a);
        whfVarA.a = defpackage.whi.a;
        return defpackage.vsl.g().d(whfVarA.a());
    }
}
