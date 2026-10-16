package N;

/* loaded from: classes.dex */
public final class A implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final tf.l f7665a;

    /* renamed from: b, reason: collision with root package name */
    public B f7666b;

    public A(tf.l lVar) {
        this.f7665a = lVar;
    }

    @Override // N.q0
    public final void c() {
        this.f7666b = (B) this.f7665a.invoke(C0718d.f7760h);
    }

    @Override // N.q0
    public final void k() {
        B b5 = this.f7666b;
        if (b5 != null) {
            b5.dispose();
        }
        this.f7666b = null;
    }

    @Override // N.q0
    public final void j() {
    }
}
