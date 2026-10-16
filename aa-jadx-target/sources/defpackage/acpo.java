package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acpo implements defpackage.acpn {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 5);

    @Override // defpackage.acpn
    public final double a() {
        return ((java.lang.Double) a.a(1, "CarSensorParameters__max_parked_speed_gps_sensor", 1.5d).fF()).doubleValue();
    }

    @Override // defpackage.acpn
    public final double b() {
        return ((java.lang.Double) a.a(2, "CarSensorParameters__max_parked_speed_wheel_sensor", 0.5d).fF()).doubleValue();
    }

    @Override // defpackage.acpn
    public final defpackage.absx c() {
        return (defpackage.absx) a.e(4, "CarSensorParameters__sensor_types_to_rate_throttle_at_delivery_phase", new defpackage.acnn(9), "CgxTRU5TT1JfU1BFRUQKD1NFTlNPUl9MT0NBVElPTg").fF();
    }

    @Override // defpackage.acpn
    public final boolean d() {
        return ((java.lang.Boolean) a.d(0, "CarSensorParameters__enable_rate_throttler_jitter_allowance_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acpn
    public final boolean e() {
        return ((java.lang.Boolean) a.d(3, "CarSensorParameters__refine_car_sensor_rate_kill_switch", true).fF()).booleanValue();
    }
}
