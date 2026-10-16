package defpackage;

/* loaded from: classes2.dex */
final class jwu implements gng {
    private final jwv a;
    private final jww b;
    private final gnh c;

    public /* synthetic */ jwu(jwv jwvVar, jww jwwVar, int i) {
        gnh gnhVar = new gnh(jwvVar.a);
        this.a = jwvVar;
        this.b = (i & 2) != 0 ? null : jwwVar;
        this.c = gnhVar;
    }

    @Override // defpackage.gng
    public final void a() {
        this.a.f(false);
        jww jwwVar = this.b;
        if (jwwVar != null) {
            jwwVar.f(false);
        }
        this.c.f(false);
    }

    @Override // defpackage.gng
    public final void b() {
        this.a.b();
        jww jwwVar = this.b;
        if (jwwVar != null) {
            jwwVar.b();
        }
        this.c.b();
    }

    @Override // defpackage.gng
    public final void c() {
        this.a.f(true);
        jww jwwVar = this.b;
        if (jwwVar != null) {
            jwwVar.f(true);
        }
        this.c.f(true);
    }

    @Override // defpackage.gng
    public final boolean d() {
        return this.a.d();
    }

    public jwu(tfj tfjVar) {
        this(new jwv(tfjVar), null, 6);
    }
}
