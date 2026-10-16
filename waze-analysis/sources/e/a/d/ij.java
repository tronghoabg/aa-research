package e.a.d;

import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ij implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iw f47155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f47156b;

    ij(ik ikVar, iw iwVar) {
        this.f47155a = iwVar;
        Objects.requireNonNull(ikVar);
        this.f47156b = ikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ii iiVar;
        boolean z;
        ik ikVar = this.f47156b;
        iy iyVar = ikVar.f47158b;
        synchronized (iyVar.r) {
            iiVar = null;
            if (ikVar.f47157a.f47154c) {
                z = true;
            } else {
                iyVar.w = iyVar.w.a(this.f47155a);
                if (iyVar.ai(iyVar.w) && (iyVar.u == null || iyVar.u.a())) {
                    iiVar = new ii(iyVar.r);
                    iyVar.E = iiVar;
                } else {
                    iyVar.w = iyVar.w.b();
                    iyVar.E = null;
                }
                z = false;
            }
        }
        if (z) {
            iw iwVar = this.f47155a;
            iwVar.f47186a.m(new iv(this.f47156b.f47158b, iwVar));
            iwVar.f47186a.c(e.a.ee.f47402b.g("Unneeded hedging"));
            return;
        }
        if (iiVar != null) {
            iy iyVar2 = this.f47156b.f47158b;
            iiVar.b(iyVar2.m.schedule(new ik(iyVar2, iiVar), iyVar2.p.f46804b, TimeUnit.NANOSECONDS));
        }
        this.f47156b.f47158b.af(this.f47155a);
    }
}
