package defpackage;

/* loaded from: classes.dex */
public final class acnx implements acnw {
    private static final wcv a = new wcv(aclg.b, 7);

    @Override // defpackage.acnw
    public final long a() {
        return ((Long) a.b(4, "Bugreport__min_minutes_between_requests", 1440L).gu()).longValue();
    }

    @Override // defpackage.acnw
    public final long b() {
        return ((Long) a.b(6, "Bugreport__user_education_nth_run_count", 5L).gu()).longValue();
    }

    @Override // defpackage.acnw
    public final abrt c() {
        return (abrt) a.e(1, "Bugreport__better_bug_hotlist_ids", new acms(5), "Cgeh/Qzase4B").gu();
    }

    @Override // defpackage.acnw
    public final boolean d() {
        return ((Boolean) a.d(0, "Bugreport__allow_trigger_from_hu", false).gu()).booleanValue();
    }

    @Override // defpackage.acnw
    public final boolean e() {
        return ((Boolean) a.d(2, "Bugreport__delayed_api_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acnw
    public final boolean f() {
        return ((Boolean) a.d(3, "Bugreport__keep_bugreport_on_retrieval", false).gu()).booleanValue();
    }

    @Override // defpackage.acnw
    public final boolean g() {
        return ((Boolean) a.d(5, "Bugreport__user_education_is_dry_run", false).gu()).booleanValue();
    }
}
