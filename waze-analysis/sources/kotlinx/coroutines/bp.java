package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bp extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.l f51763a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.a f51764b = h.e.b.e(false);

    public bp(h.g.a.l lVar) {
        this.f51763a = lVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        if (this.f51764b.b(false, true)) {
            this.f51763a.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return true;
    }
}
