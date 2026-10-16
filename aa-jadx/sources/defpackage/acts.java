package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acts implements defpackage.actr {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 8);

    @Override // defpackage.actr
    public final long a() {
        return ((java.lang.Long) a.b(0, "LifecycleRecovery__good_connection_seconds", 60L).fF()).longValue();
    }

    @Override // defpackage.actr
    public final long b() {
        return ((java.lang.Long) a.b(3, "LifecycleRecovery__max_disconnects_before_crash_loop", 10L).fF()).longValue();
    }

    @Override // defpackage.actr
    public final boolean c() {
        return ((java.lang.Boolean) a.d(1, "LifecycleRecovery__handle_car_service_gone_in_lifetime", false).fF()).booleanValue();
    }

    @Override // defpackage.actr
    public final boolean d() {
        return ((java.lang.Boolean) a.d(2, "LifecycleRecovery__log_car_service_gone_telemetry_kill_switch", true).fF()).booleanValue();
    }

    @Override // defpackage.actr
    public final boolean e() {
        return ((java.lang.Boolean) a.d(4, "LifecycleRecovery__projection_crash_loop_mitigation_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.actr
    public final boolean f() {
        return ((java.lang.Boolean) a.d(5, "LifecycleRecovery__projection_crash_loop_use_user_selection_bye_bye", true).fF()).booleanValue();
    }

    @Override // defpackage.actr
    public final boolean g() {
        return ((java.lang.Boolean) a.d(6, "LifecycleRecovery__show_toast_on_usb_reset", false).fF()).booleanValue();
    }

    @Override // defpackage.actr
    public final boolean h() {
        return ((java.lang.Boolean) a.d(7, "LifecycleRecovery__watchdog_process", true).fF()).booleanValue();
    }
}
