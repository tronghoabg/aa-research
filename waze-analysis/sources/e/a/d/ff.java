package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ff implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fl f46923a;

    ff(fl flVar) {
        Objects.requireNonNull(flVar);
        this.f46923a = flVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46923a.f46934a.U();
    }
}
