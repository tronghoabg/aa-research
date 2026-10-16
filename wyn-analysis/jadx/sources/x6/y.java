package x6;

import D6.L;
import D6.S0;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcaf;

/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4479j f47760b;

    public /* synthetic */ y(AbstractC4479j abstractC4479j, int i5) {
        this.f47759a = i5;
        this.f47760b = abstractC4479j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47759a) {
            case 0:
                AbstractC4479j abstractC4479j = this.f47760b;
                try {
                    S0 s02 = abstractC4479j.f47739a;
                    s02.getClass();
                    try {
                        L l10 = s02.f2383i;
                        if (l10 != null) {
                            l10.zzf();
                            break;
                        }
                    } catch (RemoteException e7) {
                        H6.l.i("#007 Could not call remote method.", e7);
                        return;
                    }
                } catch (IllegalStateException e10) {
                    zzcaf.zza(abstractC4479j.getContext()).zzh(e10, "BaseAdView.pause");
                    return;
                }
                break;
            case 1:
                AbstractC4479j abstractC4479j2 = this.f47760b;
                try {
                    S0 s03 = abstractC4479j2.f47739a;
                    s03.getClass();
                    try {
                        L l11 = s03.f2383i;
                        if (l11 != null) {
                            l11.zzg();
                        }
                    } catch (RemoteException e11) {
                        H6.l.i("#007 Could not call remote method.", e11);
                    }
                    break;
                } catch (IllegalStateException e12) {
                    zzcaf.zza(abstractC4479j2.getContext()).zzh(e12, "BaseAdView.resume");
                    return;
                }
            default:
                AbstractC4479j abstractC4479j3 = this.f47760b;
                try {
                    S0 s04 = abstractC4479j3.f47739a;
                    s04.getClass();
                    try {
                        L l12 = s04.f2383i;
                        if (l12 != null) {
                            l12.zzc();
                            break;
                        }
                    } catch (RemoteException e13) {
                        H6.l.i("#007 Could not call remote method.", e13);
                        return;
                    }
                } catch (IllegalStateException e14) {
                    zzcaf.zza(abstractC4479j3.getContext()).zzh(e14, "BaseAdView.destroy");
                }
                break;
        }
    }
}
