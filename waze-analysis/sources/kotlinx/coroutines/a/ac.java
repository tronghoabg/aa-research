package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends p implements ad {
    @Override // kotlinx.coroutines.a.ad
    public final /* synthetic */ ag U() {
        return this;
    }

    @Override // kotlinx.coroutines.a
    protected final void bR(Throwable th, boolean z) {
        if (j().v(th) || z) {
            return;
        }
        h.f.s.h(getContext(), th);
    }

    @Override // kotlinx.coroutines.a
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        j().v(null);
    }
}
