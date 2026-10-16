package ad;

import java.lang.ref.WeakReference;

/* renamed from: ad.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1350D extends AbstractC1365j {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f17496c;

    public C1350D(int i5, G9.e eVar, InterfaceC1366k interfaceC1366k) {
        super(i5, eVar);
        this.f17496c = new WeakReference(interfaceC1366k);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        WeakReference weakReference = this.f17496c;
        if (weakReference.get() != null) {
            ((InterfaceC1366k) weakReference.get()).onAdLoaded();
        }
    }
}
