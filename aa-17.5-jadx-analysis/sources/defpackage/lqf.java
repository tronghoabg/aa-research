package defpackage;

import j$.time.Duration;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class lqf extends eql {
    public final Predicate a;
    public final Duration h;
    public Object i;
    public boolean j;
    public final Runnable k = new lqj(this, 1);
    private final Object l;

    public lqf(eqj eqjVar, Predicate predicate, Duration duration, Object obj) {
        this.a = predicate;
        this.h = duration;
        this.l = obj;
        r(eqy.a(eqjVar), new lnc(this, 7));
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void c() {
        yph yphVar = lqu.a;
        this.j = false;
        super.c();
        if (this.j) {
            return;
        }
        m(this.l);
    }

    @Override // defpackage.eql, defpackage.eqj
    protected final void d() {
        yph yphVar = lqu.a;
        super.d();
        wer.f(this.k);
    }
}
