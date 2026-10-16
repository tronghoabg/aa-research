package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acyb implements defpackage.acya {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 8);

    @Override // defpackage.acya
    public final long a() {
        return ((java.lang.Long) a.b(5, "SystemHealthFeature__odpm_api_refresh_interval_ms", 30000L).fF()).longValue();
    }

    @Override // defpackage.acya
    public final defpackage.absx b() {
        return (defpackage.absx) a.e(0, "SystemHealthFeature__cpu_big_power_rails", new defpackage.acuo(14), "CgVDUFUvMg").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx c() {
        return (defpackage.absx) a.e(1, "SystemHealthFeature__cpu_little_power_rails", new defpackage.acuo(14), "CgVDUFUvMA").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx d() {
        return (defpackage.absx) a.e(2, "SystemHealthFeature__cpu_mid_power_rails", new defpackage.acuo(14), "CgVDUFUvMQ").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx e() {
        return (defpackage.absx) a.e(3, "SystemHealthFeature__gpu_power_rails", new defpackage.acuo(14), "CgNHUFU").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx f() {
        return (defpackage.absx) a.e(4, "SystemHealthFeature__modem_power_rails", new defpackage.acuo(14), "CgxNT0JJTEVfUkFESU8").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx g() {
        return (defpackage.absx) a.e(6, "SystemHealthFeature__soc_power_rails", new defpackage.acuo(14), "CgNHUFUKBUNQVS8wCgVDUFUvMQoFQ1BVLzI").fF();
    }

    @Override // defpackage.acya
    public final defpackage.absx h() {
        return (defpackage.absx) a.e(7, "SystemHealthFeature__wifi_power_rails", new defpackage.acuo(14), "ChpbVlNZU19QV1JfV0xBTl9CVF06V0xBTi1CVA").fF();
    }
}
