package defpackage;

/* loaded from: classes.dex */
public final class bcb extends cfx {
    private bca a;

    public bcb(bca bcaVar) {
        this.a = bcaVar;
    }

    private final void d() {
        bca bcaVar = this.a;
        if (bcaVar instanceof bca) {
            bcaVar.getClass();
            bcaVar.a.m(this);
        }
    }

    public final void b(bca bcaVar) {
        d();
        if (bcaVar instanceof bca) {
            bcaVar.a.n(this);
        }
        this.a = bcaVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        b(this.a);
    }

    @Override // defpackage.cfx
    public final void q() {
        d();
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
