package defpackage;

/* loaded from: classes3.dex */
public final class acrp implements acro {
    private static final wcv a = new wcv(aclg.b, 6);

    @Override // defpackage.acro
    public final double a() {
        return ((Double) a.a(4, "Hats__survey_rate_limiting_threshold", 0.9d).gu()).doubleValue();
    }

    @Override // defpackage.acro
    public final abrq b() {
        return (abrq) a.e(5, "Hats__triggers", new acms(15), "").gu();
    }

    @Override // defpackage.acro
    public final boolean c() {
        return ((Boolean) a.d(0, "Hats__enable_proof_mode", false).gu()).booleanValue();
    }

    @Override // defpackage.acro
    public final boolean d() {
        return ((Boolean) a.d(1, "Hats__enable_survey_rate_limiting", false).gu()).booleanValue();
    }

    @Override // defpackage.acro
    public final boolean e() {
        return ((Boolean) a.d(2, "Hats__gearhead_assistant_share_eta_survey_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acro
    public final boolean f() {
        return ((Boolean) a.d(3, "Hats__gearhead_package_key_fix_kill_switch", true).gu()).booleanValue();
    }
}
