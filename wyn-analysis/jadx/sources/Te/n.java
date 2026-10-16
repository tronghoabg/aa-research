package Te;

import J9.O;

/* loaded from: classes5.dex */
public final class n extends He.i implements Oe.f {

    /* renamed from: a, reason: collision with root package name */
    public final O f11892a;

    public n(O o7) {
        this.f11892a = o7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f11892a;
    }

    @Override // He.i
    public final void d(He.j jVar) {
        o oVar = new o(jVar, this.f11892a);
        jVar.a(oVar);
        oVar.run();
    }
}
