package od;

import g5.RunnableC2707d;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.RunnableC3307c;
import md.AbstractC3537e;

/* renamed from: od.f1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3685f1 extends md.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41955a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f41956b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final Object f41957c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.O f41958d;

    public C3685f1(C3691h1 c3691h1, C3691h1 c3691h12) {
        this.f41958d = c3691h1;
        Fe.e.t(c3691h12, "pickFirstLeafLoadBalancer");
        this.f41957c = c3691h12;
    }

    @Override // md.M
    public final md.K a(C3709n1 c3709n1) {
        switch (this.f41955a) {
            case 0:
                if (this.f41956b.compareAndSet(false, true)) {
                    md.n0 n0VarG = ((C3691h1) this.f41958d).f41973f.g();
                    C3691h1 c3691h1 = (C3691h1) this.f41957c;
                    Objects.requireNonNull(c3691h1);
                    n0VarG.execute(new RunnableC3307c(c3691h1, 3));
                }
                break;
            default:
                if (this.f41956b.compareAndSet(false, true)) {
                    ((C3703l1) this.f41958d).f42007f.g().execute(new RunnableC2707d(this, 12));
                }
                break;
        }
        return md.K.f40583e;
    }

    public C3685f1(C3703l1 c3703l1, AbstractC3537e abstractC3537e) {
        this.f41958d = c3703l1;
        Fe.e.t(abstractC3537e, "subchannel");
        this.f41957c = abstractC3537e;
    }
}
