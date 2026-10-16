package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46670a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bm f46671b;

    bj(bm bmVar, e.a.ee eeVar) {
        this.f46670a = eeVar;
        Objects.requireNonNull(bmVar);
        this.f46671b = bmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46671b.f46686h.c(this.f46670a, js.SUBCHANNEL_SHUTDOWN);
    }
}
