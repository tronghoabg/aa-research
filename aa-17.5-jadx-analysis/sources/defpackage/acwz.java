package defpackage;

/* loaded from: classes3.dex */
public final class acwz implements acwy {
    private static final wcv a = new wcv(aclg.b, 8);

    @Override // defpackage.acwy
    public final long a() {
        return ((Long) a.b(5, "SystemHealthFeature__odpm_api_refresh_interval_ms", 30000L).gu()).longValue();
    }

    @Override // defpackage.acwy
    public final abru b() {
        return (abru) a.e(0, "SystemHealthFeature__cpu_big_power_rails", new actm(14), "CgVDUFUvMg").gu();
    }

    @Override // defpackage.acwy
    public final abru c() {
        return (abru) a.e(1, "SystemHealthFeature__cpu_little_power_rails", new actm(14), "CgVDUFUvMA").gu();
    }

    @Override // defpackage.acwy
    public final abru d() {
        return (abru) a.e(2, "SystemHealthFeature__cpu_mid_power_rails", new actm(14), "CgVDUFUvMQ").gu();
    }

    @Override // defpackage.acwy
    public final abru e() {
        return (abru) a.e(3, "SystemHealthFeature__gpu_power_rails", new actm(14), "CgNHUFU").gu();
    }

    @Override // defpackage.acwy
    public final abru f() {
        return (abru) a.e(4, "SystemHealthFeature__modem_power_rails", new actm(14), "CgxNT0JJTEVfUkFESU8").gu();
    }

    @Override // defpackage.acwy
    public final abru g() {
        return (abru) a.e(6, "SystemHealthFeature__soc_power_rails", new actm(14), "CgNHUFUKBUNQVS8wCgVDUFUvMQoFQ1BVLzI").gu();
    }

    @Override // defpackage.acwy
    public final abru h() {
        return (abru) a.e(7, "SystemHealthFeature__wifi_power_rails", new actm(14), "ChpbVlNZU19QV1JfV0xBTl9CVF06V0xBTi1CVA").gu();
    }
}
