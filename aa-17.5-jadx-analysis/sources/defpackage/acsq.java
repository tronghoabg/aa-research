package defpackage;

/* loaded from: classes.dex */
public final class acsq implements acsp {
    private static final wcv a = new wcv(aclg.b, 6);

    @Override // defpackage.acsp
    public final long a() {
        return ((Long) a.b(0, "LifecycleRecovery__good_connection_seconds", 60L).gu()).longValue();
    }

    @Override // defpackage.acsp
    public final long b() {
        return ((Long) a.b(1, "LifecycleRecovery__max_disconnects_before_crash_loop", 10L).gu()).longValue();
    }

    @Override // defpackage.acsp
    public final boolean c() {
        return ((Boolean) a.d(2, "LifecycleRecovery__projection_crash_loop_mitigation_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acsp
    public final boolean d() {
        return ((Boolean) a.d(3, "LifecycleRecovery__projection_crash_loop_use_user_selection_bye_bye", true).gu()).booleanValue();
    }

    @Override // defpackage.acsp
    public final boolean e() {
        return ((Boolean) a.d(4, "LifecycleRecovery__show_toast_on_usb_reset", false).gu()).booleanValue();
    }

    @Override // defpackage.acsp
    public final boolean f() {
        return ((Boolean) a.d(5, "LifecycleRecovery__watchdog_process", true).gu()).booleanValue();
    }
}
