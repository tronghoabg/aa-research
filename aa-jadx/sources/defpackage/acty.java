package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acty implements defpackage.actx {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.s("McFly__max_all_day_events", 1L);
        b = rkqVar.v("McFly__supported_pin_regexes", new defpackage.acnu(20), "CgwgUElOOiAoXGQqIykKEzx0ZWw6W14sXSosLChcZCojKT4KEywsKFxkKiMsLFxkKiMsXGQqIykKCCwsKFxkKiMpChQgXChbXjopXG5dKzogKFxkKylcKQpFW146XGRcbl0qXG5bXjpcZFxuXSo6IHRlbDpbJVxkLUEtRmEtZl0rLCxcKjAxXCooW1xkJUEtRmEtZl0rKVwqMDFcKlxuCkdbXjpcZDxdKjxicj5bXjpcZDxdKjogdGVsOlslXGQtQS1GYS1mXSssLFwqMDFcKihbXGQlQS1GYS1mXSspXCowMVwqPGJyPgoXIFwoW146KVxuXSs6IChbXGQtXSspXCk");
        c = rkqVar.s("McFly__work_profile_integration_prompt_count", 0L);
        d = rkqVar.s("McFly__work_profile_integration_prompt_delay", 3L);
    }

    @Override // defpackage.actx
    public final long a() {
        return ((java.lang.Long) a.fF()).longValue();
    }

    @Override // defpackage.actx
    public final long b() {
        return ((java.lang.Long) c.fF()).longValue();
    }

    @Override // defpackage.actx
    public final long c() {
        return ((java.lang.Long) d.fF()).longValue();
    }

    @Override // defpackage.actx
    public final defpackage.absx d() {
        return (defpackage.absx) b.fF();
    }
}
