package ad;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import x6.C4481l;
import x6.InterfaceC4487r;

/* loaded from: classes5.dex */
public final class S extends S6.b implements R6.a, InterfaceC4487r {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17533a;

    public S(T t10) {
        this.f17533a = new WeakReference(t10);
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        WeakReference weakReference = this.f17533a;
        if (weakReference.get() != null) {
            T t10 = (T) weakReference.get();
            t10.getClass();
            t10.f17534b.y(t10.f17586a, new C1361f(c4481l));
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        S6.a aVar = (S6.a) obj;
        WeakReference weakReference = this.f17533a;
        if (weakReference.get() != null) {
            T t10 = (T) weakReference.get();
            t10.f17539g = aVar;
            G9.e eVar = t10.f17534b;
            aVar.setOnPaidEventListener(new S3.e(eVar, false, t10, 28));
            eVar.z(t10.f17586a, aVar.getResponseInfo());
        }
    }

    @Override // R6.a
    public final void onAdMetadataChanged() {
        WeakReference weakReference = this.f17533a;
        if (weakReference.get() != null) {
            T t10 = (T) weakReference.get();
            G9.e eVar = t10.f17534b;
            eVar.getClass();
            HashMap map = new HashMap();
            map.put("adId", Integer.valueOf(t10.f17586a));
            map.put("eventName", "onAdMetadataChanged");
            eVar.w(map);
        }
    }

    @Override // x6.InterfaceC4487r
    public final void onUserEarnedReward(R6.b bVar) {
        WeakReference weakReference = this.f17533a;
        if (weakReference.get() != null) {
            T t10 = (T) weakReference.get();
            t10.getClass();
            t10.f17534b.B(t10.f17586a, new P(Integer.valueOf(bVar.getAmount()), bVar.getType()));
        }
    }
}
