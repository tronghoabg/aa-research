package defpackage;

/* loaded from: classes.dex */
public final class aczi implements aczh {
    private static final wcv a = new wcv(aclg.b, 6);

    @Override // defpackage.aczh
    public final long a() {
        return ((Long) a.b(0, "Weather__api_call_polling_interval_ms", 360000L).gu()).longValue();
    }

    @Override // defpackage.aczh
    public final long b() {
        return ((Long) a.b(1, "Weather__api_call_retry_interval_ms", 30000L).gu()).longValue();
    }

    @Override // defpackage.aczh
    public final long c() {
        return ((Long) a.b(2, "Weather__auto_dismiss_threshold_ms", 600000L).gu()).longValue();
    }

    @Override // defpackage.aczh
    public final long d() {
        return ((Long) a.b(4, "Weather__spatula_header_timeout_ms", 5000L).gu()).longValue();
    }

    @Override // defpackage.aczh
    public final long e() {
        return ((Long) a.b(5, "Weather__touch_update_threshold_millis", 30L).gu()).longValue();
    }

    @Override // defpackage.aczh
    public final boolean f() {
        return ((Boolean) a.d(3, "Weather__preinstalled_frx_toggle_enabled", false).gu()).booleanValue();
    }
}
