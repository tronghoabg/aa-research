package Se;

/* loaded from: classes5.dex */
public final class o extends He.g implements Oe.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11092a;

    public o(Object obj) {
        this.f11092a = obj;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        hVar.a(Me.b.f7635a);
        hVar.onSuccess(this.f11092a);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f11092a;
    }
}
