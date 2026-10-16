package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cr extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final l f51814a;

    public cr(l lVar) {
        this.f51814a = lVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        Object objBX = e().bX();
        int i2 = ai.f51347a;
        boolean z = objBX instanceof u;
        l lVar = this.f51814a;
        if (z) {
            lVar.resumeWith(e.b.c.a(((u) objBX).f52067a));
        } else {
            lVar.resumeWith(cg.b(objBX));
        }
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
