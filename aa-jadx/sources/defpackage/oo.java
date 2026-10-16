package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oo extends defpackage.ewz {
    public boolean a;
    private final defpackage.op g;

    public oo(defpackage.op opVar, defpackage.exb exbVar) {
        super(exbVar, opVar.c);
        this.g = opVar;
        this.a = true;
    }

    @Override // defpackage.ewz
    protected final void a() {
        this.g.a();
    }

    @Override // defpackage.ewz
    protected final void b() {
        this.g.b();
    }

    @Override // defpackage.ewz
    protected final void c(defpackage.ewy ewyVar) {
        this.g.c(new defpackage.ny(ewyVar.c, ewyVar.d, ewyVar.b, ewyVar.a, ewyVar.e));
    }

    public final void d(boolean z) {
        this.a = z;
        boolean z2 = false;
        if (z && this.g.c) {
            z2 = true;
        }
        g(z2);
    }

    @Override // defpackage.ewz
    public final void e() {
        this.g.d();
    }
}
