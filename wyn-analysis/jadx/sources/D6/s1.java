package D6;

import com.google.android.gms.ads.AdListener;

/* loaded from: classes3.dex */
public final class s1 extends AbstractBinderC0405x {

    /* renamed from: a, reason: collision with root package name */
    public final AdListener f2494a;

    public s1(AdListener adListener) {
        this.f2494a = adListener;
    }

    @Override // D6.InterfaceC0407y
    public final void zzb() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzd(K0 k02) {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(k02.W());
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzf() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzg() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzh() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzi() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zzj() {
        AdListener adListener = this.f2494a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // D6.InterfaceC0407y
    public final void zze() {
    }

    @Override // D6.InterfaceC0407y
    public final void zzc(int i5) {
    }
}
