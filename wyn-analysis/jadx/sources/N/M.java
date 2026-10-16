package N;

import jf.InterfaceC3108h;

/* loaded from: classes.dex */
public final class M implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final tf.p f7721a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f7722b;

    /* renamed from: c, reason: collision with root package name */
    public Ef.H0 f7723c;

    public M(InterfaceC3108h interfaceC3108h, tf.p pVar) {
        this.f7721a = pVar;
        this.f7722b = Ef.H.c(interfaceC3108h);
    }

    @Override // N.q0
    public final void c() {
        Ef.H0 h02 = this.f7723c;
        if (h02 != null) {
            Ef.H.k(h02, "Old job was still running!", null);
        }
        this.f7723c = Ef.H.D(this.f7722b, null, this.f7721a, 3);
    }

    @Override // N.q0
    public final void j() {
        Ef.H0 h02 = this.f7723c;
        if (h02 != null) {
            h02.r(new O());
        }
        this.f7723c = null;
    }

    @Override // N.q0
    public final void k() {
        Ef.H0 h02 = this.f7723c;
        if (h02 != null) {
            h02.r(new O());
        }
        this.f7723c = null;
    }
}
