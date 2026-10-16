package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import x6.C4470a;

/* loaded from: classes3.dex */
public final class zzbwa {
    private final zzbvp zza;

    public zzbwa(zzbvp zzbvpVar) {
        this.zza = zzbvpVar;
    }

    public final void onAdClosed() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToShow(C4470a c4470a) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdFailedToShow.");
        int iA = c4470a.a();
        int length = String.valueOf(iA).length();
        String str = c4470a.f47721b;
        int length2 = String.valueOf(str).length();
        String str2 = c4470a.f47722c;
        StringBuilder sb2 = new StringBuilder(length + 60 + length2 + 16 + String.valueOf(str2).length());
        sb2.append("Mediation ad failed to show: Error Code = ");
        sb2.append(iA);
        sb2.append(". Error Message = ");
        sb2.append(str);
        sb2.append(" Error Domain = ");
        sb2.append(str2);
        H6.l.f(sb2.toString());
        try {
            this.zza.zzy(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdOpened() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoComplete() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onVideoComplete.");
        try {
            this.zza.zzt();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onVideoPause.");
        try {
            this.zza.zzq();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoPlay() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onVideoPlay.");
        try {
            this.zza.zzu();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void reportAdImpression() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called reportAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
