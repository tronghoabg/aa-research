package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class o extends bv {

    /* renamed from: a, reason: collision with root package name */
    public final l f52060a;

    public o(l lVar) {
        this.f52060a = lVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        cf cfVarE = e();
        l lVar = this.f52060a;
        lVar.w(lVar.o(cfVarE));
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return true;
    }
}
