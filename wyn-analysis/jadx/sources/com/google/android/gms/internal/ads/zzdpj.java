package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.L0;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.unity3d.services.UnityAdsConstants;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzdpj extends zzbmh {
    private final zzdqb zza;
    private InterfaceC3876a zzb;

    public zzdpj(zzdqb zzdqbVar) {
        this.zza = zzdqbVar;
    }

    private static float zzb(InterfaceC3876a interfaceC3876a) {
        Drawable drawable;
        return (interfaceC3876a == null || (drawable = (Drawable) BinderC3877b.S(interfaceC3876a)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zze() throws RemoteException {
        zzcnl zzcnlVarZzN;
        int i5;
        int i10;
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzab() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return zzdqbVar.zzab();
        }
        if (zzdqbVar.zzy() != null) {
            try {
                return zzdqbVar.zzy().zzm();
            } catch (RemoteException e7) {
                int i11 = G6.L.f4523b;
                H6.l.d("Remote exception getting video controller aspect ratio.", e7);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        InterfaceC3876a interfaceC3876a = this.zzb;
        if (interfaceC3876a != null) {
            return zzb(interfaceC3876a);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoa)).booleanValue() && zzdqbVar.zzU() != null && (zzcnlVarZzN = zzdqbVar.zzU().zzN()) != null && (i5 = zzcnlVarZzN.zzb) >= 0 && (i10 = zzcnlVarZzN.zza) > 0) {
            return i5 / i10;
        }
        zzbml zzbmlVarZzD = zzdqbVar.zzD();
        if (zzbmlVarZzD == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float fZze = (zzbmlVarZzD.zze() == -1 || zzbmlVarZzD.zzf() == -1) ? 0.0f : zzbmlVarZzD.zze() / zzbmlVarZzD.zzf();
        return fZze == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? zzb(zzbmlVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(InterfaceC3876a interfaceC3876a) {
        this.zzb = interfaceC3876a;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final InterfaceC3876a zzg() throws RemoteException {
        InterfaceC3876a interfaceC3876a = this.zzb;
        if (interfaceC3876a != null) {
            return interfaceC3876a;
        }
        zzbml zzbmlVarZzD = this.zza.zzD();
        if (zzbmlVarZzD == null) {
            return null;
        }
        return zzbmlVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzh() throws RemoteException {
        zzdqb zzdqbVar = this.zza;
        return zzdqbVar.zzy() != null ? zzdqbVar.zzy().zzj() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final float zzi() throws RemoteException {
        zzdqb zzdqbVar = this.zza;
        return zzdqbVar.zzy() != null ? zzdqbVar.zzy().zzk() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final L0 zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzm(zzbnq zzbnqVar) {
        zzdqb zzdqbVar = this.zza;
        if (zzdqbVar.zzy() instanceof zzcmh) {
            ((zzcmh) zzdqbVar.zzy()).zzv(zzbnqVar);
        }
    }
}
