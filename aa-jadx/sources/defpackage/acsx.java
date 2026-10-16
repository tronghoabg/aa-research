package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acsx implements defpackage.acsw {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 5);

    @Override // defpackage.acsw
    public final long a() {
        return ((java.lang.Long) a.b(2, "HeadUnitFeature__max_notifications_for_head_unit", 5L).fF()).longValue();
    }

    @Override // defpackage.acsw
    public final long b() {
        return ((java.lang.Long) a.b(4, "HeadUnitFeature__update_notification_frequency", 50L).fF()).longValue();
    }

    @Override // defpackage.acsw
    public final defpackage.absx c() {
        return (defpackage.absx) a.e(0, "HeadUnitFeature__hkmc_min_updates", new defpackage.acnu(16), "").fF();
    }

    @Override // defpackage.acsw
    public final defpackage.absx d() {
        return (defpackage.absx) a.e(1, "HeadUnitFeature__known_updates", new defpackage.acnu(16), "").fF();
    }

    @Override // defpackage.acsw
    public final boolean e() {
        return ((java.lang.Boolean) a.d(3, "HeadUnitFeature__show_update_notifications_enabled", false).fF()).booleanValue();
    }
}
