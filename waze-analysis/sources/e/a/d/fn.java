package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f46939a;

    fn(g gVar) {
        Objects.requireNonNull(gVar);
        this.f46939a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46939a.f46990f.F(fp.f46946c);
    }
}
