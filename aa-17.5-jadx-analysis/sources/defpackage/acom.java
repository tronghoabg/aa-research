package defpackage;

/* loaded from: classes.dex */
public final class acom implements acol {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acol
    public final double a() {
        return ((Double) a.a(1, "CarSensorParameters__max_parked_speed_gps_sensor", 1.5d).gu()).doubleValue();
    }

    @Override // defpackage.acol
    public final double b() {
        return ((Double) a.a(2, "CarSensorParameters__max_parked_speed_wheel_sensor", 0.5d).gu()).doubleValue();
    }

    @Override // defpackage.acol
    public final abru c() {
        return (abru) a.e(4, "CarSensorParameters__sensor_types_to_rate_throttle_at_delivery_phase", new acml(9), "CgxTRU5TT1JfU1BFRUQKD1NFTlNPUl9MT0NBVElPTg").gu();
    }

    @Override // defpackage.acol
    public final boolean d() {
        return ((Boolean) a.d(0, "CarSensorParameters__enable_rate_throttler_jitter_allowance_kill_switch", true).gu()).booleanValue();
    }

    @Override // defpackage.acol
    public final boolean e() {
        return ((Boolean) a.d(3, "CarSensorParameters__refine_car_sensor_rate_kill_switch", true).gu()).booleanValue();
    }
}
