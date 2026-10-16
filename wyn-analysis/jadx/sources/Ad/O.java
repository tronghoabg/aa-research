package ad;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import x6.C4481l;
import x6.InterfaceC4487r;

/* loaded from: classes5.dex */
public final class O extends R6.d implements R6.a, InterfaceC4487r {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17524a;

    public O(Q q4) {
        this.f17524a = new WeakReference(q4);
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        WeakReference weakReference = this.f17524a;
        if (weakReference.get() != null) {
            Q q4 = (Q) weakReference.get();
            q4.getClass();
            q4.f17527b.y(q4.f17586a, new C1361f(c4481l));
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        R6.c cVar = (R6.c) obj;
        WeakReference weakReference = this.f17524a;
        if (weakReference.get() != null) {
            Q q4 = (Q) weakReference.get();
            q4.f17532g = cVar;
            G9.e eVar = q4.f17527b;
            cVar.setOnPaidEventListener(new S3.e(eVar, false, q4, 28));
            eVar.z(q4.f17586a, cVar.getResponseInfo());
        }
    }

    @Override // R6.a
    public final void onAdMetadataChanged() {
        WeakReference weakReference = this.f17524a;
        if (weakReference.get() != null) {
            Q q4 = (Q) weakReference.get();
            G9.e eVar = q4.f17527b;
            eVar.getClass();
            HashMap map = new HashMap();
            map.put("adId", Integer.valueOf(q4.f17586a));
            map.put("eventName", "onAdMetadataChanged");
            eVar.w(map);
        }
    }

    @Override // x6.InterfaceC4487r
    public final void onUserEarnedReward(R6.b bVar) {
        WeakReference weakReference = this.f17524a;
        if (weakReference.get() != null) {
            Q q4 = (Q) weakReference.get();
            q4.getClass();
            q4.f17527b.B(q4.f17586a, new P(Integer.valueOf(bVar.getAmount()), bVar.getType()));
        }
    }
}
