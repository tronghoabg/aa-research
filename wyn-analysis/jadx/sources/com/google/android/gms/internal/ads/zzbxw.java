package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import x6.C4470a;

/* loaded from: classes3.dex */
final class zzbxw {
    final zzbvp zza;

    public zzbxw(zzbvp zzbvpVar) {
        this.zza = zzbvpVar;
    }

    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(C4470a c4470a) {
        try {
            int iA = c4470a.a();
            String str = c4470a.f47721b;
            String str2 = c4470a.f47722c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iA).length() + 59 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
            sb2.append("Mediated ad failed to show: Error Code = ");
            sb2.append(iA);
            sb2.append(". Error Message = ");
            sb2.append(str);
            sb2.append(" Error Domain = ");
            sb2.append(str2);
            H6.l.f(sb2.toString());
            this.zza.zzy(c4470a.b());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zza.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zza.zzi();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward() {
        try {
            this.zza.zzz();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzq();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzu();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zza.zzo();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zza.zzk();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(R6.b bVar) {
        try {
            this.zza.zzr(new zzcdg(bVar));
        } catch (RemoteException unused) {
        }
    }
}
