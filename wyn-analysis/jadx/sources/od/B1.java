package od;

import A7.RunnableC0285r1;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3541i;

/* loaded from: classes5.dex */
public final class B1 extends AbstractC3541i {

    /* renamed from: b, reason: collision with root package name */
    public final G1 f41520b;

    /* renamed from: c, reason: collision with root package name */
    public long f41521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0 f41522d;

    public B1(B0 b02, G1 g12) {
        this.f41522d = b02;
        this.f41520b = g12;
    }

    @Override // md.AbstractC3541i
    public final void l(long j8) throws Exception {
        if (this.f41522d.f41508o.f41542f != null) {
            return;
        }
        synchronized (this.f41522d.f41503i) {
            try {
                if (this.f41522d.f41508o.f41542f == null) {
                    G1 g12 = this.f41520b;
                    if (!g12.f41565b) {
                        long j10 = this.f41521c + j8;
                        this.f41521c = j10;
                        B0 b02 = this.f41522d;
                        long j11 = b02.f41513t;
                        if (j10 <= j11) {
                            return;
                        }
                        if (j10 > b02.k) {
                            g12.f41566c = true;
                        } else {
                            long jAddAndGet = ((AtomicLong) b02.f41504j.f26356b).addAndGet(j10 - j11);
                            B0 b03 = this.f41522d;
                            b03.f41513t = this.f41521c;
                            if (jAddAndGet > b03.f41505l) {
                                this.f41520b.f41566c = true;
                            }
                        }
                        G1 g13 = this.f41520b;
                        RunnableC0285r1 runnableC0285r1N = g13.f41566c ? this.f41522d.n(g13) : null;
                        if (runnableC0285r1N != null) {
                            runnableC0285r1N.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
