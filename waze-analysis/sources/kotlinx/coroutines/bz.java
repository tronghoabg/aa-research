package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bz extends bv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f51779a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.g.l f51780b;

    public bz(cf cfVar, kotlinx.coroutines.g.l lVar) {
        this.f51779a = cfVar;
        this.f51780b = lVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        cf cfVar = this.f51779a;
        Object objBX = cfVar.bX();
        if (!(objBX instanceof u)) {
            objBX = cg.b(objBX);
        }
        this.f51780b.j(cfVar, objBX);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
