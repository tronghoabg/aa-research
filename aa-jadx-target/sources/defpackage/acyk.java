package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acyk implements defpackage.acyj {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 8);

    @Override // defpackage.acyj
    public final long a() {
        return ((java.lang.Long) a.b(0, "TouchpadUiNavigation__base_fraction", 6L).fF()).longValue();
    }

    @Override // defpackage.acyj
    public final long b() {
        return ((java.lang.Long) a.b(1, "TouchpadUiNavigation__focus_navigation_history_max_age_ms", 4000L).fF()).longValue();
    }

    @Override // defpackage.acyj
    public final long c() {
        return ((java.lang.Long) a.b(2, "TouchpadUiNavigation__focus_navigation_history_max_size", 30L).fF()).longValue();
    }

    @Override // defpackage.acyj
    public final long d() {
        return ((java.lang.Long) a.b(4, "TouchpadUiNavigation__min_size_mm", 4L).fF()).longValue();
    }

    @Override // defpackage.acyj
    public final long e() {
        return ((java.lang.Long) a.b(5, "TouchpadUiNavigation__multimove_penalty_mm", 4L).fF()).longValue();
    }

    @Override // defpackage.acyj
    public final defpackage.absx f() {
        return (defpackage.absx) a.e(6, "TouchpadUiNavigation__sensitivity_override_car_list", new defpackage.acvv(9), "").fF();
    }

    @Override // defpackage.acyj
    public final boolean g() {
        return ((java.lang.Boolean) a.d(3, "TouchpadUiNavigation__force_enabled", false).fF()).booleanValue();
    }

    @Override // defpackage.acyj
    public final boolean h() {
        return ((java.lang.Boolean) a.d(7, "TouchpadUiNavigation__tuning_enabled", false).fF()).booleanValue();
    }
}
