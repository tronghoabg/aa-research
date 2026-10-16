package defpackage;

/* loaded from: classes.dex */
public final class bxx extends bxz {
    public Object a;
    public Object b;
    public aixy c;
    public aap d;
    public aap e;
    private final afec g = new bji(this, 16);
    private final cdz h = byx.j(new alx(this, 14));

    private final void f() {
        this.b = null;
        this.e = null;
    }

    @Override // defpackage.bxz
    public final afec a(aixy aixyVar) {
        aixy aixyVar2 = this.c;
        if (aixyVar2 != null && !affa.f(aixyVar2, aixyVar)) {
            bxc.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.c = aixyVar;
        return this.g;
    }

    @Override // defpackage.bxz
    public final void b(aixy aixyVar) {
        f();
    }

    @Override // defpackage.bxz
    public final void c() {
        synchronized (this.f) {
            this.a = this.b;
            if (this.e == null) {
                this.d = null;
            } else {
                aap aapVar = this.d;
                if (aapVar == null) {
                    aap aapVar2 = aaq.a;
                    aapVar = new aap(6);
                    this.d = aapVar;
                }
                this.d = this.e;
                this.e = aapVar;
            }
        }
    }

    @Override // defpackage.bxz
    public final void d() {
        this.h.a();
        f();
        synchronized (this.f) {
            this.c = null;
            this.a = null;
            this.d = null;
        }
    }

    @Override // defpackage.bxz
    public final void e(aixy aixyVar) {
        this.c = null;
        f();
        c();
    }
}
