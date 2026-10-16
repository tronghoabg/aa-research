package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ir implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iv f47178a;

    ir(iv ivVar) {
        Objects.requireNonNull(ivVar);
        this.f47178a = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47178a.f47185b;
        iyVar.H = true;
        iyVar.C.c(iyVar.A.f47159a, iyVar.A.f47160b, iyVar.A.f47161c);
    }
}
