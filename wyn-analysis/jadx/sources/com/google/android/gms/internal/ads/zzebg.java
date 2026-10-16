package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzebg {
    private final zzbqx zza;

    public zzebg(zzbqx zzbqxVar) {
        this.zza = zzbqxVar;
    }

    private final void zzs(zzebf zzebfVar) throws JSONException, RemoteException {
        String strZza = zzebfVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i5 = G6.L.f4523b;
        H6.l.e(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzebf(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void zzb(long j8) throws RemoteException {
        zzebf zzebfVar = new zzebf("creation", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("nativeObjectCreated");
        zzs(zzebfVar);
    }

    public final void zzc(long j8) throws RemoteException {
        zzebf zzebfVar = new zzebf("creation", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("nativeObjectNotCreated");
        zzs(zzebfVar);
    }

    public final void zzd(long j8) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebfVar);
    }

    public final void zze(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdLoaded");
        zzs(zzebfVar);
    }

    public final void zzf(long j8, int i5) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdFailedToLoad");
        zzebfVar.zzd(Integer.valueOf(i5));
        zzs(zzebfVar);
    }

    public final void zzg(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdOpened");
        zzs(zzebfVar);
    }

    public final void zzh(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdClicked");
        this.zza.zzb(zzebfVar.zza());
    }

    public final void zzi(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdClosed");
        zzs(zzebfVar);
    }

    public final void zzj(long j8) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebfVar);
    }

    public final void zzk(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onRewardedAdLoaded");
        zzs(zzebfVar);
    }

    public final void zzl(long j8, int i5) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onRewardedAdFailedToLoad");
        zzebfVar.zzd(Integer.valueOf(i5));
        zzs(zzebfVar);
    }

    public final void zzm(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onRewardedAdOpened");
        zzs(zzebfVar);
    }

    public final void zzn(long j8, int i5) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onRewardedAdFailedToShow");
        zzebfVar.zzd(Integer.valueOf(i5));
        zzs(zzebfVar);
    }

    public final void zzo(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onRewardedAdClosed");
        zzs(zzebfVar);
    }

    public final void zzp(long j8, zzccm zzccmVar) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onUserEarnedReward");
        zzebfVar.zze(zzccmVar.zze());
        zzebfVar.zzf(Integer.valueOf(zzccmVar.zzf()));
        zzs(zzebfVar);
    }

    public final void zzq(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdImpression");
        zzs(zzebfVar);
    }

    public final void zzr(long j8) throws JSONException, RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j8));
        zzebfVar.zzc("onAdClicked");
        zzs(zzebfVar);
    }
}
