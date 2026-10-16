package com.google.android.gms.internal.ads;

import D6.J0;
import D6.L0;
import D6.N0;
import android.os.RemoteException;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzdqa extends J0 {
    private final Object zza = new Object();
    private final L0 zzb;
    private final zzbvy zzc;

    public zzdqa(L0 l02, zzbvy zzbvyVar) {
        this.zzb = l02;
        this.zzc = zzbvyVar;
    }

    @Override // D6.L0
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final void zzf() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final void zzg(boolean z2) throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final boolean zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final float zzj() throws RemoteException {
        zzbvy zzbvyVar = this.zzc;
        return zzbvyVar != null ? zzbvyVar.zzA() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // D6.L0
    public final float zzk() throws RemoteException {
        zzbvy zzbvyVar = this.zzc;
        return zzbvyVar != null ? zzbvyVar.zzB() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // D6.L0
    public final void zzl(N0 n02) throws RemoteException {
        synchronized (this.zza) {
            try {
                L0 l02 = this.zzb;
                if (l02 != null) {
                    l02.zzl(n02);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.L0
    public final float zzm() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final N0 zzo() throws RemoteException {
        synchronized (this.zza) {
            try {
                L0 l02 = this.zzb;
                if (l02 == null) {
                    return null;
                }
                return l02.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D6.L0
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // D6.L0
    public final void zzq() throws RemoteException {
        throw new RemoteException();
    }
}
