package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acoq implements defpackage.acop {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 8);

    @Override // defpackage.acop
    public final defpackage.absv a() {
        return (defpackage.absv) a.e(3, "BluetoothPairing__fsm_telemetry_interesting_fsm_state_types", new defpackage.acnn(5), "Cg8BAgMEBQYHCAkKCwwODxA").fF();
    }

    @Override // defpackage.acop
    public final boolean b() {
        return ((java.lang.Boolean) a.d(0, "BluetoothPairing__car_bluetooth_service_disable", false).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean c() {
        return ((java.lang.Boolean) a.d(1, "BluetoothPairing__check_bluetooth_profile_util_is_initialized_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean d() {
        return ((java.lang.Boolean) a.d(2, "BluetoothPairing__disable_a2dp", false).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean e() {
        return ((java.lang.Boolean) a.d(4, "BluetoothPairing__log_connectivity_event_on_bluetooth_fsm_state_change_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean f() {
        return ((java.lang.Boolean) a.d(5, "BluetoothPairing__no_force_enable_a2dp_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean g() {
        return ((java.lang.Boolean) a.d(6, "BluetoothPairing__prevent_rebonding_during_wired_projection", false).fF()).booleanValue();
    }

    @Override // defpackage.acop
    public final boolean h() {
        return ((java.lang.Boolean) a.d(7, "BluetoothPairing__prevent_rebonding_during_wireless_projection", false).fF()).booleanValue();
    }
}
