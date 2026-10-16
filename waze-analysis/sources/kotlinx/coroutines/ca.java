package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ca extends bv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f51789a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.g.l f51790b;

    public ca(cf cfVar, kotlinx.coroutines.g.l lVar) {
        this.f51789a = cfVar;
        this.f51790b = lVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        this.f51790b.j(this.f51789a, h.ab.f48028a);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
