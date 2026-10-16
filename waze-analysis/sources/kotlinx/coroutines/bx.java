package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bx extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final cf f51771a;

    /* renamed from: b, reason: collision with root package name */
    private final by f51772b;

    /* renamed from: d, reason: collision with root package name */
    private final q f51773d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f51774e;

    public bx(cf cfVar, by byVar, q qVar, Object obj) {
        this.f51771a = cfVar;
        this.f51772b = byVar;
        this.f51773d = qVar;
        this.f51774e = obj;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        cf.G(this.f51771a, this.f51772b, this.f51773d, this.f51774e);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
