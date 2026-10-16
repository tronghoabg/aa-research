package vd;

import A7.C0237b0;
import java.util.List;
import md.AbstractC3537e;

/* renamed from: vd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4339b extends AbstractC3537e {
    @Override // md.AbstractC3537e
    public final List b() {
        return s().b();
    }

    @Override // md.AbstractC3537e
    public final AbstractC3537e d() {
        return s().d();
    }

    @Override // md.AbstractC3537e
    public final Object e() {
        return s().e();
    }

    @Override // md.AbstractC3537e
    public final void o() {
        s().o();
    }

    @Override // md.AbstractC3537e
    public void p() {
        s().p();
    }

    @Override // md.AbstractC3537e
    public void r(List list) {
        s().r(list);
    }

    public abstract AbstractC3537e s();

    public String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(s(), "delegate");
        return c0237b0S.toString();
    }
}
