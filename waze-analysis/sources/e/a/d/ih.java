package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ih extends e.a.p {

    /* renamed from: b, reason: collision with root package name */
    long f47149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ iy f47150c;

    /* renamed from: d, reason: collision with root package name */
    private final iw f47151d;

    ih(iy iyVar, iw iwVar) {
        Objects.requireNonNull(iyVar);
        this.f47150c = iyVar;
        this.f47151d = iwVar;
    }

    @Override // e.a.dw
    public final void d(long j2) {
        iy iyVar = this.f47150c;
        if (iyVar.w.f47168f != null) {
            return;
        }
        synchronized (iyVar.r) {
            if (iyVar.w.f47168f == null) {
                iw iwVar = this.f47151d;
                if (!iwVar.f47187b) {
                    long j3 = this.f47149b + j2;
                    this.f47149b = j3;
                    if (j3 <= iyVar.B) {
                        return;
                    }
                    if (j3 > iyVar.s) {
                        iwVar.f47188c = true;
                    } else {
                        long jC = iyVar.I.c(j3 - iyVar.B);
                        iyVar.B = this.f47149b;
                        if (jC > iyVar.t) {
                            iwVar.f47188c = true;
                        }
                    }
                    Runnable runnableAd = iwVar.f47188c ? iyVar.ad(iwVar) : null;
                    if (runnableAd != null) {
                        runnableAd.run();
                    }
                }
            }
        }
    }
}
