package defpackage;

/* loaded from: classes.dex */
public final class acpn implements acpm {
    private static final wcv a = new wcv(aclg.b, 9);

    @Override // defpackage.acpm
    public final long a() {
        return ((Long) a.b(1, "Csat__global_impression_cooldown_secs", 604800L).gu()).longValue();
    }

    @Override // defpackage.acpm
    public final long b() {
        return ((Long) a.b(2, "Csat__global_response_cooldown_secs", 2592000L).gu()).longValue();
    }

    @Override // defpackage.acpm
    public final abrc c() {
        return (abrc) a.e(8, "Csat__survey_config", new acms(10), "Cg0I1EEVj8L1PBiAmp4BCg0I1kEVj8L1PBiAmp4BCg0I2EEVj8L1PBiAmp4BCg0I0UEVj8L1PBiAmp4BCgwI0kEVAACAPxiAowUKDQjeQRWPwvU8GICangEKDQjfQRWPwvU8GICangEKDQjgQRWPwvU8GICangEKDQjcQRWPwvU8GICangE").gu();
    }

    @Override // defpackage.acpm
    public final String d() {
        return (String) a.c(7, "Csat__proof_mode_survey", "").gu();
    }

    @Override // defpackage.acpm
    public final boolean e() {
        return ((Boolean) a.d(0, "Csat__assistant_csat_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acpm
    public final boolean f() {
        return ((Boolean) a.d(3, "Csat__media_csat_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acpm
    public final boolean g() {
        return ((Boolean) a.d(4, "Csat__messaging_csat_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acpm
    public final boolean h() {
        return ((Boolean) a.d(5, "Csat__navigation_csat_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acpm
    public final boolean i() {
        return ((Boolean) a.d(6, "Csat__phone_call_csat_enabled", false).gu()).booleanValue();
    }
}
