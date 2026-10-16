package X;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: e, reason: collision with root package name */
    public final tf.l f15697e;

    /* renamed from: f, reason: collision with root package name */
    public int f15698f;

    public f(int i5, k kVar, tf.l lVar) {
        super(i5, kVar);
        this.f15697e = lVar;
        this.f15698f = 1;
    }

    @Override // X.g
    public final void c() {
        if (this.f15701c) {
            return;
        }
        l();
        this.f15701c = true;
        synchronized (m.f15718b) {
            int i5 = this.f15702d;
            if (i5 >= 0) {
                m.v(i5);
                this.f15702d = -1;
            }
        }
    }

    @Override // X.g
    public final tf.l f() {
        return this.f15697e;
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
        this.f15698f++;
    }

    @Override // X.g
    public final void l() {
        int i5 = this.f15698f - 1;
        this.f15698f = i5;
        if (i5 == 0) {
            a();
        }
    }

    @Override // X.g
    public final void n(y yVar) {
        Dd.c cVar = m.f15717a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // X.g
    public final g t(tf.l lVar) {
        m.d(this);
        return new C1272e(this.f15700b, this.f15699a, m.l(lVar, this.f15697e, true), this);
    }

    @Override // X.g
    public final void m() {
    }
}
