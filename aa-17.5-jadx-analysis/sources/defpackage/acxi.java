package defpackage;

/* loaded from: classes.dex */
public final class acxi implements acxh {
    private static final wcv a = new wcv(aclg.b, 8);

    @Override // defpackage.acxh
    public final long a() {
        return ((Long) a.b(0, "TouchpadUiNavigation__base_fraction", 6L).gu()).longValue();
    }

    @Override // defpackage.acxh
    public final long b() {
        return ((Long) a.b(1, "TouchpadUiNavigation__focus_navigation_history_max_age_ms", 4000L).gu()).longValue();
    }

    @Override // defpackage.acxh
    public final long c() {
        return ((Long) a.b(2, "TouchpadUiNavigation__focus_navigation_history_max_size", 30L).gu()).longValue();
    }

    @Override // defpackage.acxh
    public final long d() {
        return ((Long) a.b(4, "TouchpadUiNavigation__min_size_mm", 4L).gu()).longValue();
    }

    @Override // defpackage.acxh
    public final long e() {
        return ((Long) a.b(5, "TouchpadUiNavigation__multimove_penalty_mm", 4L).gu()).longValue();
    }

    @Override // defpackage.acxh
    public final abru f() {
        return (abru) a.e(6, "TouchpadUiNavigation__sensitivity_override_car_list", new acut(9), "").gu();
    }

    @Override // defpackage.acxh
    public final boolean g() {
        return ((Boolean) a.d(3, "TouchpadUiNavigation__force_enabled", false).gu()).booleanValue();
    }

    @Override // defpackage.acxh
    public final boolean h() {
        return ((Boolean) a.d(7, "TouchpadUiNavigation__tuning_enabled", false).gu()).booleanValue();
    }
}
