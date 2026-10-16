package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cs extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final h.c.e f51815a;

    public cs(h.c.e eVar) {
        this.f51815a = eVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        this.f51815a.resumeWith(h.ab.f48028a);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
