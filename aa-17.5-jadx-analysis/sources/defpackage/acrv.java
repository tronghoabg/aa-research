package defpackage;

/* loaded from: classes.dex */
public final class acrv implements acru {
    private static final wcv a = new wcv(aclg.b, 5);

    @Override // defpackage.acru
    public final long a() {
        return ((Long) a.b(2, "HeadUnitFeature__max_notifications_for_head_unit", 5L).gu()).longValue();
    }

    @Override // defpackage.acru
    public final long b() {
        return ((Long) a.b(4, "HeadUnitFeature__update_notification_frequency", 50L).gu()).longValue();
    }

    @Override // defpackage.acru
    public final abru c() {
        return (abru) a.e(0, "HeadUnitFeature__hkmc_min_updates", new acms(16), "").gu();
    }

    @Override // defpackage.acru
    public final abru d() {
        return (abru) a.e(1, "HeadUnitFeature__known_updates", new acms(16), "").gu();
    }

    @Override // defpackage.acru
    public final boolean e() {
        return ((Boolean) a.d(3, "HeadUnitFeature__show_update_notifications_enabled", false).gu()).booleanValue();
    }
}
