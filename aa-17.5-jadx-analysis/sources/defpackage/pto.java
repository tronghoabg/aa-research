package defpackage;

import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class pto {
    public final zgt a;
    public final Executor b;
    public final tmb d;
    public final ptk f;
    public final PriorityQueue c = new PriorityQueue(10, new ycd(new ikj(10), ymd.a));
    public zgr e = null;

    public pto(zgt zgtVar, tmb tmbVar, ptk ptkVar) {
        this.a = zgtVar;
        this.b = zgtVar instanceof prb ? ((prb) zgtVar).b("<sequential>", 1, null) : new prv(zgtVar);
        this.d = tmbVar;
        this.f = ptkVar;
    }

    public final void a(xxh xxhVar) {
        if (xxhVar.f()) {
            this.b.execute(new pfq(this, xxhVar, 13, null));
        }
    }

    public final void b(long j) {
        zgr zgrVar = this.e;
        if (zgrVar != null) {
            zgrVar.cancel(true);
        }
        this.e = this.a.schedule(new pru(this, 6), j, TimeUnit.MILLISECONDS);
    }
}
