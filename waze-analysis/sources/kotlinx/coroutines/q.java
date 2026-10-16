package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class q extends bv implements p {

    /* renamed from: a, reason: collision with root package name */
    public final cf f52061a;

    public q(cf cfVar) {
        this.f52061a = cfVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        this.f52061a.M(e());
    }

    @Override // kotlinx.coroutines.p
    public final br b() {
        return e();
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return true;
    }

    @Override // kotlinx.coroutines.p
    public final boolean d(Throwable th) {
        return e().N(th);
    }
}
