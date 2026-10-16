package D6;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import x6.AbstractC4480k;

/* renamed from: D6.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC0397t extends zzbem implements InterfaceC0373g0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4480k f2495a;

    public BinderC0397t(AbstractC4480k abstractC4480k) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.f2495a = abstractC4480k;
    }

    @Override // D6.InterfaceC0373g0
    public final void B(K0 k02) {
        AbstractC4480k abstractC4480k = this.f2495a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdFailedToShowFullScreenContent(k02.V());
        }
    }

    @Override // D6.InterfaceC0373g0
    public final void zzc() {
        AbstractC4480k abstractC4480k = this.f2495a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdShowedFullScreenContent();
        }
    }

    @Override // D6.InterfaceC0373g0
    public final void zzd() {
        AbstractC4480k abstractC4480k = this.f2495a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) {
        if (i5 == 1) {
            K0 k02 = (K0) zzben.zzb(parcel, K0.CREATOR);
            zzben.zzh(parcel);
            B(k02);
        } else if (i5 == 2) {
            zzc();
        } else if (i5 == 3) {
            zzd();
        } else if (i5 == 4) {
            zze();
        } else {
            if (i5 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // D6.InterfaceC0373g0
    public final void zze() {
        AbstractC4480k abstractC4480k = this.f2495a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdImpression();
        }
    }

    @Override // D6.InterfaceC0373g0
    public final void zzf() {
        AbstractC4480k abstractC4480k = this.f2495a;
        if (abstractC4480k != null) {
            abstractC4480k.onAdClicked();
        }
    }
}
