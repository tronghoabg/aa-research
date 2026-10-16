package defpackage;

/* loaded from: classes.dex */
public final class bjb implements ben {
    final /* synthetic */ afdr a;
    final /* synthetic */ afdr b;
    final /* synthetic */ bld c;
    private long d = 9205357640488583168L;
    private long e = 9205357640488583168L;
    private long f = 0;

    public bjb(afdr afdrVar, afdr afdrVar2, bld bldVar) {
        this.a = afdrVar;
        this.b = afdrVar2;
        this.c = bldVar;
    }

    @Override // defpackage.ben
    public final void a() {
        bld bldVar = this.c;
        if (ble.a(bldVar, g())) {
            bldVar.c();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cst, java.lang.Object] */
    @Override // defpackage.ben
    public final void b(long j) {
        ?? Invoke = this.b.invoke();
        if (Invoke != 0) {
            bld bldVar = this.c;
            if (Invoke.t() && ble.a(bldVar, g())) {
                this.f = a.ai(this.f, j);
                long jY = aclh.y(a.ai(this.d, this.f), aclh.y(Invoke.j(0L), this.e));
                if (bldVar.f()) {
                    this.d = jY;
                    this.e = Invoke.j(0L);
                    this.f = 0L;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [cst, java.lang.Object] */
    @Override // defpackage.ben
    public final void c(long j, bko bkoVar) {
        ?? Invoke = this.b.invoke();
        if (Invoke != 0) {
            bld bldVar = this.c;
            if (!Invoke.t()) {
                return;
            }
            bldVar.g();
            this.d = j;
            this.e = Invoke.j(0L);
        }
        if (ble.a(this.c, g())) {
            this.f = 0L;
        }
    }

    @Override // defpackage.ben
    public final void d() {
        bld bldVar = this.c;
        if (ble.a(bldVar, g())) {
            bldVar.c();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    public final long g() {
        return ((Number) this.a.invoke()).longValue();
    }

    @Override // defpackage.ben
    public final void e() {
    }

    @Override // defpackage.ben
    public final void f() {
    }
}
