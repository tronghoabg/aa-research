package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acsr implements defpackage.acsq {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 6);

    @Override // defpackage.acsq
    public final double a() {
        return ((java.lang.Double) a.a(4, "Hats__survey_rate_limiting_threshold", 0.9d).fF()).doubleValue();
    }

    @Override // defpackage.acsq
    public final defpackage.abst b() {
        return (defpackage.abst) a.e(5, "Hats__triggers", new defpackage.acnu(15), "").fF();
    }

    @Override // defpackage.acsq
    public final boolean c() {
        return ((java.lang.Boolean) a.d(0, "Hats__enable_proof_mode", false).fF()).booleanValue();
    }

    @Override // defpackage.acsq
    public final boolean d() {
        return ((java.lang.Boolean) a.d(1, "Hats__enable_survey_rate_limiting", false).fF()).booleanValue();
    }

    @Override // defpackage.acsq
    public final boolean e() {
        return ((java.lang.Boolean) a.d(2, "Hats__gearhead_assistant_share_eta_survey_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acsq
    public final boolean f() {
        return ((java.lang.Boolean) a.d(3, "Hats__gearhead_package_key_fix_kill_switch", true).fF()).booleanValue();
    }
}
