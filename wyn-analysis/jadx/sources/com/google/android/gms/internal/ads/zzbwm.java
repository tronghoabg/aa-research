package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.internal.AbstractC1732v;
import x6.C4470a;

/* loaded from: classes3.dex */
public final class zzbwm implements J6.i, J6.m, J6.o {
    private final zzbvp zza;
    private J6.t zzb;
    private zzbnd zzc;

    public zzbwm(zzbvp zzbvpVar) {
        this.zza = zzbvpVar;
    }

    @Override // J6.i
    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.i
    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i5) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error. ");
        sb2.append(i5);
        H6.l.a(sb2.toString());
        try {
            this.zza.zzg(i5);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        J6.t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                H6.l.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f5717m) {
                H6.l.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        H6.l.a("Adapter called onAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.i
    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.i
    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onVideoEnd.");
        try {
            this.zza.zzn();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.i
    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAppEvent.");
        try {
            this.zza.zzl(str, str2);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final J6.t zzb() {
        return this.zzb;
    }

    @Override // J6.o
    public final void zzc(MediationNativeAdapter mediationNativeAdapter, zzbnd zzbndVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLoaded with template id ".concat(String.valueOf(zzbndVar.zzb())));
        this.zzc = zzbndVar;
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void zzd(MediationNativeAdapter mediationNativeAdapter, zzbnd zzbndVar, String str) {
        try {
            this.zza.zzm(zzbndVar.zza(), str);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final zzbnd zze() {
        return this.zzc;
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.m
    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.i
    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C4470a c4470a) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        int iA = c4470a.a();
        int length = String.valueOf(iA).length();
        String str = c4470a.f47721b;
        int length2 = String.valueOf(str).length();
        String str2 = c4470a.f47722c;
        StringBuilder sb2 = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(iA);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        H6.l.a(sb2.toString());
        try {
            this.zza.zzx(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.m
    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLoaded.");
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.m
    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        J6.t tVar = this.zzb;
        if (this.zzc == null) {
            if (tVar == null) {
                H6.l.i("#007 Could not call remote method.", null);
                return;
            } else if (!tVar.f5718n) {
                H6.l.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        H6.l.a("Adapter called onAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzh();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, J6.t tVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdLoaded.");
        this.zzb = tVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            new VideoController().a(new zzbvz());
        }
        try {
            this.zza.zzj();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        H6.l.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i5) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i5);
        sb2.append(".");
        H6.l.a(sb2.toString());
        try {
            this.zza.zzg(i5);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.m
    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C4470a c4470a) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        int iA = c4470a.a();
        int length = String.valueOf(iA).length();
        String str = c4470a.f47721b;
        int length2 = String.valueOf(str).length();
        String str2 = c4470a.f47722c;
        StringBuilder sb2 = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(iA);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        H6.l.a(sb2.toString());
        try {
            this.zza.zzx(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i5) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error ");
        sb2.append(i5);
        sb2.append(".");
        H6.l.a(sb2.toString());
        try {
            this.zza.zzg(i5);
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // J6.o
    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C4470a c4470a) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        int iA = c4470a.a();
        int length = String.valueOf(iA).length();
        String str = c4470a.f47721b;
        int length2 = String.valueOf(str).length();
        String str2 = c4470a.f47722c;
        StringBuilder sb2 = new StringBuilder(length + 71 + length2 + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(iA);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        H6.l.a(sb2.toString());
        try {
            this.zza.zzx(c4470a.b());
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
