package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hy f47126a;

    hx(hy hyVar) {
        Objects.requireNonNull(hyVar);
        this.f47126a = hyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47126a.f47133g;
        iyVar.H = true;
        iyVar.C.c(iyVar.A.f47159a, iyVar.A.f47160b, iyVar.A.f47161c);
    }
}
