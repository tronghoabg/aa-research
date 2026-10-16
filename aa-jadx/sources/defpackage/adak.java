package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class adak implements defpackage.adaj {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 6);

    @Override // defpackage.adaj
    public final long a() {
        return ((java.lang.Long) a.b(0, "Weather__api_call_polling_interval_ms", 360000L).fF()).longValue();
    }

    @Override // defpackage.adaj
    public final long b() {
        return ((java.lang.Long) a.b(1, "Weather__api_call_retry_interval_ms", 30000L).fF()).longValue();
    }

    @Override // defpackage.adaj
    public final long c() {
        return ((java.lang.Long) a.b(2, "Weather__auto_dismiss_threshold_ms", 600000L).fF()).longValue();
    }

    @Override // defpackage.adaj
    public final long d() {
        return ((java.lang.Long) a.b(4, "Weather__spatula_header_timeout_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.adaj
    public final long e() {
        return ((java.lang.Long) a.b(5, "Weather__touch_update_threshold_millis", 30L).fF()).longValue();
    }

    @Override // defpackage.adaj
    public final boolean f() {
        return ((java.lang.Boolean) a.d(3, "Weather__preinstalled_frx_toggle_enabled", false).fF()).booleanValue();
    }
}
