package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class iu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iv f47183a;

    iu(iv ivVar) {
        Objects.requireNonNull(ivVar);
        this.f47183a = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47183a.f47185b;
        if (iyVar.H) {
            return;
        }
        iyVar.C.f();
    }
}
