package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ik implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ii f47157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iy f47158b;

    ik(iy iyVar, ii iiVar) {
        Objects.requireNonNull(iyVar);
        this.f47158b = iyVar;
        this.f47157a = iiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iy iyVar = this.f47158b;
        iw iwVarAc = iyVar.ac(iyVar.w.f47167e, false, true);
        if (iwVarAc == null) {
            return;
        }
        iyVar.f47204k.execute(new ij(this, iwVarAc));
    }
}
