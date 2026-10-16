package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acoz implements defpackage.acoy {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 7);

    @Override // defpackage.acoy
    public final long a() {
        return ((java.lang.Long) a.b(4, "Bugreport__min_minutes_between_requests", 1440L).fF()).longValue();
    }

    @Override // defpackage.acoy
    public final long b() {
        return ((java.lang.Long) a.b(6, "Bugreport__user_education_nth_run_count", 5L).fF()).longValue();
    }

    @Override // defpackage.acoy
    public final defpackage.absw c() {
        return (defpackage.absw) a.e(1, "Bugreport__better_bug_hotlist_ids", new defpackage.acnu(5), "Cgeh/Qzase4B").fF();
    }

    @Override // defpackage.acoy
    public final boolean d() {
        return ((java.lang.Boolean) a.d(0, "Bugreport__allow_trigger_from_hu", false).fF()).booleanValue();
    }

    @Override // defpackage.acoy
    public final boolean e() {
        return ((java.lang.Boolean) a.d(2, "Bugreport__delayed_api_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acoy
    public final boolean f() {
        return ((java.lang.Boolean) a.d(3, "Bugreport__keep_bugreport_on_retrieval", false).fF()).booleanValue();
    }

    @Override // defpackage.acoy
    public final boolean g() {
        return ((java.lang.Boolean) a.d(5, "Bugreport__user_education_is_dry_run", false).fF()).booleanValue();
    }
}
