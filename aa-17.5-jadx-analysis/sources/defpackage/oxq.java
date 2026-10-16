package defpackage;

/* loaded from: classes.dex */
public final class oxq implements oxm {
    private final wcp a;
    private final wcp b;
    private final wcp c;

    public oxq() {
        eqj eqjVar = tby.d;
        this.a = wcp.c(eqjVar);
        this.b = wcp.c(eqjVar);
        this.c = wcp.c(eqjVar);
    }

    @Override // defpackage.oxm
    public final void a(eqj eqjVar) {
        this.a.b(eqjVar);
    }

    @Override // defpackage.oxm
    public final void b(eqj eqjVar) {
        this.c.b(eqjVar);
    }

    @Override // defpackage.oxm
    public final void c(eqj eqjVar) {
        this.b.b(eqjVar);
    }
}
