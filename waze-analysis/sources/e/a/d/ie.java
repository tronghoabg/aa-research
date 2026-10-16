package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ie implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iy f47144a;

    ie(iy iyVar) {
        Objects.requireNonNull(iyVar);
        this.f47144a = iyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47144a;
        if (iyVar.H) {
            return;
        }
        iyVar.C.f();
    }
}
