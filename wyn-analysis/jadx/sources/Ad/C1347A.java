package ad;

import java.lang.ref.WeakReference;
import x6.C4481l;
import z6.AbstractC4618a;
import z6.AbstractC4619b;

/* renamed from: ad.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1347A extends AbstractC4618a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f17491a;

    public C1347A(C1348B c1348b) {
        this.f17491a = new WeakReference(c1348b);
    }

    @Override // x6.AbstractC4473d
    public final void onAdFailedToLoad(C4481l c4481l) {
        WeakReference weakReference = this.f17491a;
        if (weakReference.get() != null) {
            C1348B c1348b = (C1348B) weakReference.get();
            c1348b.getClass();
            c1348b.f17492b.y(c1348b.f17586a, new C1361f(c4481l));
        }
    }

    @Override // x6.AbstractC4473d
    public final void onAdLoaded(Object obj) {
        AbstractC4619b abstractC4619b = (AbstractC4619b) obj;
        WeakReference weakReference = this.f17491a;
        if (weakReference.get() != null) {
            C1348B c1348b = (C1348B) weakReference.get();
            c1348b.f17493c = abstractC4619b;
            G9.e eVar = c1348b.f17492b;
            abstractC4619b.setOnPaidEventListener(new S3.e(eVar, false, c1348b, 28));
            eVar.z(c1348b.f17586a, abstractC4619b.getResponseInfo());
        }
    }
}
