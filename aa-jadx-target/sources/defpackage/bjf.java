package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bjf implements defpackage.beq {
    final /* synthetic */ defpackage.afer a;
    final /* synthetic */ defpackage.afer b;
    final /* synthetic */ defpackage.blh c;
    private long d = 9205357640488583168L;
    private long e = 9205357640488583168L;
    private long f = 0;

    public bjf(defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.blh blhVar) {
        this.a = aferVar;
        this.b = aferVar2;
        this.c = blhVar;
    }

    @Override // defpackage.beq
    public final void a() {
        defpackage.blh blhVar = this.c;
        if (defpackage.blj.a(blhVar, g())) {
            blhVar.c();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ctc, java.lang.Object] */
    @Override // defpackage.beq
    public final void b(long j) {
        ?? Invoke = this.b.invoke();
        if (Invoke != 0) {
            defpackage.blh blhVar = this.c;
            if (Invoke.t() && defpackage.blj.a(blhVar, g())) {
                this.f = defpackage.a.ah(this.f, j);
                long jR = defpackage.acmj.r(defpackage.a.ah(this.d, this.f), defpackage.acmj.r(Invoke.j(0L), this.e));
                if (blhVar.f()) {
                    this.d = jR;
                    this.e = Invoke.j(0L);
                    this.f = 0L;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ctc, java.lang.Object] */
    @Override // defpackage.beq
    public final void c(long j, defpackage.bks bksVar) {
        ?? Invoke = this.b.invoke();
        if (Invoke != 0) {
            defpackage.blh blhVar = this.c;
            if (!Invoke.t()) {
                return;
            }
            blhVar.g();
            this.d = j;
            this.e = Invoke.j(0L);
        }
        if (defpackage.blj.a(this.c, g())) {
            this.f = 0L;
        }
    }

    @Override // defpackage.beq
    public final void d() {
        defpackage.blh blhVar = this.c;
        if (defpackage.blj.a(blhVar, g())) {
            blhVar.c();
        }
        this.d = 9205357640488583168L;
        this.e = 9205357640488583168L;
    }

    public final long g() {
        return ((java.lang.Number) this.a.invoke()).longValue();
    }

    @Override // defpackage.beq
    public final void e() {
    }

    @Override // defpackage.beq
    public final void f() {
    }
}
