package X;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272e extends g {

    /* renamed from: e, reason: collision with root package name */
    public final tf.l f15695e;

    /* renamed from: f, reason: collision with root package name */
    public final g f15696f;

    public C1272e(int i5, k kVar, tf.l lVar, g gVar) {
        super(i5, kVar);
        this.f15695e = lVar;
        this.f15696f = gVar;
        gVar.k();
    }

    @Override // X.g
    public final void c() {
        if (this.f15701c) {
            return;
        }
        int i5 = this.f15700b;
        g gVar = this.f15696f;
        if (i5 != gVar.d()) {
            a();
        }
        gVar.l();
        this.f15701c = true;
        synchronized (m.f15718b) {
            int i10 = this.f15702d;
            if (i10 >= 0) {
                m.v(i10);
                this.f15702d = -1;
            }
        }
    }

    @Override // X.g
    public final tf.l f() {
        return this.f15695e;
    }

    @Override // X.g
    public final boolean g() {
        return true;
    }

    @Override // X.g
    public final tf.l i() {
        return null;
    }

    @Override // X.g
    public final void k() {
        q.f();
        throw null;
    }

    @Override // X.g
    public final void l() {
        q.f();
        throw null;
    }

    @Override // X.g
    public final void n(y yVar) {
        Dd.c cVar = m.f15717a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // X.g
    public final g t(tf.l lVar) {
        return new C1272e(this.f15700b, this.f15699a, m.l(lVar, this.f15695e, true), this.f15696f);
    }

    @Override // X.g
    public final void m() {
    }
}
