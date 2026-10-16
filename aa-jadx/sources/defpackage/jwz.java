package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jwz implements defpackage.gnn {
    private final defpackage.jxa a;
    private final defpackage.jxb b;
    private final defpackage.gno c;

    public /* synthetic */ jwz(defpackage.jxa jxaVar, defpackage.jxb jxbVar, int i) {
        defpackage.gno gnoVar = new defpackage.gno(jxaVar.a);
        this.a = jxaVar;
        this.b = (i & 2) != 0 ? null : jxbVar;
        this.c = gnoVar;
    }

    @Override // defpackage.gnn
    public final void a() {
        this.a.f(false);
        defpackage.jxb jxbVar = this.b;
        if (jxbVar != null) {
            jxbVar.f(false);
        }
        this.c.f(false);
    }

    @Override // defpackage.gnn
    public final void b() {
        this.a.b();
        defpackage.jxb jxbVar = this.b;
        if (jxbVar != null) {
            jxbVar.b();
        }
        this.c.b();
    }

    @Override // defpackage.gnn
    public final void c() {
        this.a.f(true);
        defpackage.jxb jxbVar = this.b;
        if (jxbVar != null) {
            jxbVar.f(true);
        }
        this.c.f(true);
    }

    @Override // defpackage.gnn
    public final boolean d() {
        return this.a.d();
    }

    public jwz(defpackage.tgf tgfVar) {
        this(new defpackage.jxa(tgfVar), null, 6);
    }
}
