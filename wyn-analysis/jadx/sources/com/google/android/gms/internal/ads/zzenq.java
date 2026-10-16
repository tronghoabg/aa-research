package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzenq extends zzccg implements zzdej {
    private zzcch zza;
    private zzdei zzb;
    private zzdlr zzc;

    @Override // com.google.android.gms.internal.ads.zzdej
    public final synchronized void zza(zzdei zzdeiVar) {
        this.zzb = zzdeiVar;
    }

    public final synchronized void zzc(zzcch zzcchVar) {
        this.zza = zzcchVar;
    }

    public final synchronized void zzd(zzdlr zzdlrVar) {
        this.zzc = zzdlrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zze(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzdlr zzdlrVar = this.zzc;
        if (zzdlrVar != null) {
            final zzemd zzemdVar = ((zzeqq) zzdlrVar).zzc;
            final zzfkn zzfknVar = ((zzeqq) zzdlrVar).zzb;
            final zzfky zzfkyVar = ((zzeqq) zzdlrVar).zza;
            final zzeqq zzeqqVar = (zzeqq) zzdlrVar;
            ((zzeqq) zzdlrVar).zzd.zzc().execute(new Runnable(zzeqqVar, zzfkyVar, zzfknVar, zzemdVar) { // from class: com.google.android.gms.internal.ads.zzeqp
                private final /* synthetic */ zzfky zza;
                private final /* synthetic */ zzfkn zzb;
                private final /* synthetic */ zzemd zzc;

                {
                    this.zza = zzfkyVar;
                    this.zzb = zzfknVar;
                    this.zzc = zzemdVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeqt.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzf(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        zzdlr zzdlrVar = this.zzc;
        if (zzdlrVar != null) {
            String str = ((zzeqq) zzdlrVar).zzc.zza;
            int i10 = G6.L.f4523b;
            H6.l.f("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzg(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzh(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzi(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzj(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            zzcchVar.zzj(interfaceC3876a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzk(InterfaceC3876a interfaceC3876a, zzcci zzcciVar) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zzb(zzcciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzl(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzm(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        zzdei zzdeiVar = this.zzb;
        if (zzdeiVar != null) {
            zzdeiVar.zzb(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzn(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzo(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcch
    public final synchronized void zzp(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzcch zzcchVar = this.zza;
        if (zzcchVar != null) {
            ((zzeqs) zzcchVar).zzd.zzb(null);
        }
    }
}
