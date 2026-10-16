package defpackage;

/* loaded from: classes.dex */
public final class adbk implements adbj {
    private static final war a;
    private static final war b;

    static {
        wap wapVarA = new wap(wac.a("com.google.android.gms.car"), "", "", false, false).b().a();
        a = wapVarA.e("LegacyFrxBugs__log_frx_start_ui_event", true);
        b = wapVarA.e("use_new_frx_lib", false);
    }

    @Override // defpackage.adbj
    public final boolean a() {
        return ((Boolean) a.b()).booleanValue();
    }

    @Override // defpackage.adbj
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }
}
