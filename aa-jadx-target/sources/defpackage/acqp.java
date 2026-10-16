package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acqp implements acqo {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 9);

    public final long a() {
        return ((java.lang.Long) a.b(1, "Csat__global_impression_cooldown_secs", 604800L).fF()).longValue();
    }

    public final long b() {
        return ((java.lang.Long) a.b(2, "Csat__global_response_cooldown_secs", 2592000L).fF()).longValue();
    }

    public final defpackage.absf c() {
        return (defpackage.absf) a.e(8, "Csat__survey_config", new defpackage.acnu(10), "Cg0I1EEVj8L1PBiAmp4BCg0I1kEVj8L1PBiAmp4BCg0I2EEVj8L1PBiAmp4BCg0I0UEVj8L1PBiAmp4BCgwI0kEVAACAPxiAowUKDQjeQRWPwvU8GICangEKDQjfQRWPwvU8GICangEKDQjgQRWPwvU8GICangEKDQjcQRWPwvU8GICangE").fF();
    }

    public final java.lang.String d() {
        return (java.lang.String) a.c(7, "Csat__proof_mode_survey", "").fF();
    }

    public final boolean e() {
        return ((java.lang.Boolean) a.d(0, "Csat__assistant_csat_enabled", false).fF()).booleanValue();
    }

    public final boolean f() {
        return ((java.lang.Boolean) a.d(3, "Csat__media_csat_enabled", false).fF()).booleanValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) a.d(4, "Csat__messaging_csat_enabled", false).fF()).booleanValue();
    }

    public final boolean h() {
        return ((java.lang.Boolean) a.d(5, "Csat__navigation_csat_enabled", false).fF()).booleanValue();
    }

    public final boolean i() {
        return ((java.lang.Boolean) a.d(6, "Csat__phone_call_csat_enabled", false).fF()).booleanValue();
    }
}
