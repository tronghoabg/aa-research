package D6;

import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.VideoController;
import j$.util.Objects;
import x6.C4481l;

/* loaded from: classes3.dex */
public final class R0 extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2372a;

    /* renamed from: b, reason: collision with root package name */
    public AdListener f2373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S0 f2374c;

    public R0(S0 s02) {
        Objects.requireNonNull(s02);
        this.f2374c = s02;
        this.f2372a = new Object();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdClicked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdClosed();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(C4481l c4481l) {
        S0 s02 = this.f2374c;
        VideoController videoController = s02.f2377c;
        L l10 = s02.f2383i;
        L0 l0ZzF = null;
        if (l10 != null) {
            try {
                l0ZzF = l10.zzF();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
        videoController.a(l0ZzF);
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdFailedToLoad(c4481l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdImpression();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        S0 s02 = this.f2374c;
        VideoController videoController = s02.f2377c;
        L l10 = s02.f2383i;
        L0 l0ZzF = null;
        if (l10 != null) {
            try {
                l0ZzF = l10.zzF();
            } catch (RemoteException e7) {
                H6.l.i("#007 Could not call remote method.", e7);
            }
        }
        videoController.a(l0ZzF);
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdLoaded();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.f2372a) {
            try {
                AdListener adListener = this.f2373b;
                if (adListener != null) {
                    adListener.onAdOpened();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
