package vd;

import A7.C0237b0;
import java.util.concurrent.ScheduledExecutorService;
import md.AbstractC3537e;
import md.AbstractC3556y;
import md.EnumC3545m;
import md.M;
import md.n0;

/* renamed from: vd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4338a extends AbstractC3556y {
    @Override // md.AbstractC3556y
    public AbstractC3537e b(Dd.c cVar) {
        return m().b(cVar);
    }

    @Override // md.AbstractC3556y
    public final AbstractC3537e d() {
        return m().d();
    }

    @Override // md.AbstractC3556y
    public final ScheduledExecutorService e() {
        return m().e();
    }

    @Override // md.AbstractC3556y
    public final n0 g() {
        return m().g();
    }

    @Override // md.AbstractC3556y
    public final void i() {
        m().i();
    }

    @Override // md.AbstractC3556y
    public void l(EnumC3545m enumC3545m, M m10) {
        m().l(enumC3545m, m10);
    }

    public abstract AbstractC3556y m();

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(m(), "delegate");
        return c0237b0S.toString();
    }
}
