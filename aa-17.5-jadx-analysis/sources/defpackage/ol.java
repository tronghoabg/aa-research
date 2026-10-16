package defpackage;

/* loaded from: classes.dex */
public final class ol extends ewt {
    public boolean a;
    private final om g;

    public ol(om omVar, ewv ewvVar) {
        super(ewvVar, omVar.c);
        this.g = omVar;
        this.a = true;
    }

    @Override // defpackage.ewt
    protected final void a() {
        this.g.a();
    }

    @Override // defpackage.ewt
    protected final void b() {
        this.g.b();
    }

    @Override // defpackage.ewt
    protected final void c(ews ewsVar) {
        this.g.c(new nw(ewsVar.c, ewsVar.d, ewsVar.b, ewsVar.a, ewsVar.e));
    }

    public final void d(boolean z) {
        this.a = z;
        boolean z2 = false;
        if (z && this.g.c) {
            z2 = true;
        }
        g(z2);
    }

    @Override // defpackage.ewt
    public final void e() {
        this.g.d();
    }
}
