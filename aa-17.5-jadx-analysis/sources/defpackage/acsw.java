package defpackage;

/* loaded from: classes.dex */
public final class acsw implements acsv {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;
    private static final wcj d;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.s("McFly__max_all_day_events", 1L);
        b = rjuVar.v("McFly__supported_pin_regexes", new acms(20), "CgwgUElOOiAoXGQqIykKEzx0ZWw6W14sXSosLChcZCojKT4KEywsKFxkKiMsLFxkKiMsXGQqIykKCCwsKFxkKiMpChQgXChbXjopXG5dKzogKFxkKylcKQpFW146XGRcbl0qXG5bXjpcZFxuXSo6IHRlbDpbJVxkLUEtRmEtZl0rLCxcKjAxXCooW1xkJUEtRmEtZl0rKVwqMDFcKlxuCkdbXjpcZDxdKjxicj5bXjpcZDxdKjogdGVsOlslXGQtQS1GYS1mXSssLFwqMDFcKihbXGQlQS1GYS1mXSspXCowMVwqPGJyPgoXIFwoW146KVxuXSs6IChbXGQtXSspXCk");
        c = rjuVar.s("McFly__work_profile_integration_prompt_count", 0L);
        d = rjuVar.s("McFly__work_profile_integration_prompt_delay", 3L);
    }

    @Override // defpackage.acsv
    public final long a() {
        return ((Long) a.gu()).longValue();
    }

    @Override // defpackage.acsv
    public final long b() {
        return ((Long) c.gu()).longValue();
    }

    @Override // defpackage.acsv
    public final long c() {
        return ((Long) d.gu()).longValue();
    }

    @Override // defpackage.acsv
    public final abru d() {
        return (abru) b.gu();
    }
}
