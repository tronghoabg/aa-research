package e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.d.i f47693a;

    n(o oVar, e.a.d.i iVar) {
        this.f47693a = iVar;
        Objects.requireNonNull(oVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47693a.b();
    }
}
