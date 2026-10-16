package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class svw implements swa, svv, svu, svr {
    public final svy a;
    private final Executor b;
    private final swe c;

    public svw(Executor executor, svy svyVar, swe sweVar) {
        this.b = executor;
        this.a = svyVar;
        this.c = sweVar;
    }

    @Override // defpackage.swa
    public final void a(svz svzVar) {
        this.b.execute(new sbj(this, svzVar, 12, (char[]) null));
    }

    @Override // defpackage.svr
    public final void b() {
        this.c.r();
    }

    @Override // defpackage.svu
    public final void d(Exception exc) {
        this.c.o(exc);
    }

    @Override // defpackage.svv
    public final void e(Object obj) {
        this.c.p(obj);
    }
}
