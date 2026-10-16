package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adcj implements defpackage.adci {
    private static final defpackage.wbn a;
    private static final defpackage.wbn b;

    static {
        defpackage.wbl wblVarA = new defpackage.wbl(defpackage.way.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wblVarA.e("LegacyFrxBugs__log_frx_start_ui_event", true);
        b = wblVarA.e("use_new_frx_lib", false);
    }

    @Override // defpackage.adci
    public final boolean a() {
        return ((java.lang.Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.adci
    public final boolean b() {
        return ((java.lang.Boolean) b.b()).booleanValue();
    }
}
