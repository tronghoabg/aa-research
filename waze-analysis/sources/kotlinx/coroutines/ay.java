package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ay extends bv {

    /* renamed from: a, reason: collision with root package name */
    private final ax f51374a;

    public ay(ax axVar) {
        this.f51374a = axVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        this.f51374a.dispose();
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
