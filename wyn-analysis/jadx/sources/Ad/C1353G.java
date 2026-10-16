package ad;

import java.lang.ref.WeakReference;
import nb.InterfaceC3613b;
import x6.C4481l;

/* renamed from: ad.G, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1353G extends I6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17500a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17501b;

    public C1353G(C1354H c1354h) {
        this.f17500a = 0;
        this.f17501b = new WeakReference(c1354h);
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        switch (this.f17500a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f17501b;
                if (weakReference.get() != null) {
                    C1354H c1354h = (C1354H) weakReference.get();
                    c1354h.getClass();
                    c1354h.f17502b.y(c1354h.f17586a, new C1361f(c4481l));
                    break;
                }
                break;
            case 1:
                ((rb.h) this.f17501b).f44731c.onAdFailedToLoad(c4481l.f47720a, c4481l.toString());
                break;
            default:
                ((vb.d) this.f17501b).f47148c.onAdFailedToLoad(c4481l.f47720a, c4481l.toString());
                break;
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        switch (this.f17500a) {
            case 0:
                I6.a aVar = (I6.a) obj;
                WeakReference weakReference = (WeakReference) this.f17501b;
                if (weakReference.get() != null) {
                    C1354H c1354h = (C1354H) weakReference.get();
                    c1354h.f17503c = aVar;
                    G9.e eVar = c1354h.f17502b;
                    aVar.setOnPaidEventListener(new S3.e(eVar, false, c1354h, 28));
                    eVar.z(c1354h.f17586a, aVar.getResponseInfo());
                    break;
                }
                break;
            case 1:
                I6.a aVar2 = (I6.a) obj;
                rb.h hVar = (rb.h) this.f17501b;
                hVar.f44731c.onAdLoaded();
                aVar2.setFullScreenContentCallback(hVar.f44733e);
                hVar.f44730b.f44712b = aVar2;
                InterfaceC3613b interfaceC3613b = hVar.f44718a;
                if (interfaceC3613b != null) {
                    interfaceC3613b.onAdLoaded();
                    break;
                }
                break;
            default:
                I6.a aVar3 = (I6.a) obj;
                vb.d dVar = (vb.d) this.f17501b;
                dVar.f47148c.onAdLoaded();
                aVar3.setFullScreenContentCallback(dVar.f47150e);
                dVar.f47147b.f44712b = aVar3;
                InterfaceC3613b interfaceC3613b2 = dVar.f44718a;
                if (interfaceC3613b2 != null) {
                    interfaceC3613b2.onAdLoaded();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C1353G(Object obj, int i5) {
        this.f17500a = i5;
        this.f17501b = obj;
    }
}
