package ad;

import java.lang.ref.WeakReference;
import x6.C4481l;

/* renamed from: ad.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1370o extends y6.e implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17598a;

    public C1370o(C1371p c1371p) {
        this.f17598a = new WeakReference(c1371p);
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        WeakReference weakReference = this.f17598a;
        if (weakReference.get() != null) {
            C1371p c1371p = (C1371p) weakReference.get();
            c1371p.getClass();
            c1371p.f17599b.y(c1371p.f17586a, new C1361f(c4481l));
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        y6.d dVar = (y6.d) obj;
        WeakReference weakReference = this.f17598a;
        if (weakReference.get() != null) {
            C1371p c1371p = (C1371p) weakReference.get();
            c1371p.f17600c = dVar;
            dVar.setAppEventListener(new C1370o(c1371p));
            G9.e eVar = c1371p.f17599b;
            dVar.setOnPaidEventListener(new S3.e(eVar, false, c1371p, 28));
            eVar.z(c1371p.f17586a, dVar.getResponseInfo());
        }
    }

    @Override // y6.f
    public final void onAppEvent(String str, String str2) {
        WeakReference weakReference = this.f17598a;
        if (weakReference.get() != null) {
            C1371p c1371p = (C1371p) weakReference.get();
            c1371p.f17599b.A(c1371p.f17586a, str, str2);
        }
    }
}
