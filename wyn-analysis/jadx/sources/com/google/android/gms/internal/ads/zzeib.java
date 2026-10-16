package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import G6.C0553q;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeib implements zzhcc {
    final /* synthetic */ zzcbk zza;
    final /* synthetic */ zzcbb zzb;

    public zzeib(zzeiq zzeiqVar, zzcbk zzcbkVar, zzcbb zzcbbVar) {
        this.zza = zzcbkVar;
        this.zzb = zzcbbVar;
        Objects.requireNonNull(zzeiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        try {
            zzcbb zzcbbVar = this.zzb;
            K0 k0Zza = zzfmi.zza(th);
            zzcbbVar.zzf(new C0553q(zzgui.zzc(th.getMessage()) ? k0Zza.f2339b : th.getMessage(), k0Zza.f2338a));
        } catch (RemoteException e7) {
            G6.L.l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            zzbio zzbioVar = zzbix.zzcS;
            C0395s c0395s = C0395s.f2489e;
            if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                this.zzb.zze(parcelFileDescriptor);
                return;
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzcT)).booleanValue() && (bundle = this.zza.zzm) != null) {
                String strZza = zzdzc.BINDER_CALL_START.zza();
                C6.n.f1857D.k.getClass();
                bundle.putLong(strZza, System.currentTimeMillis());
            }
            this.zzb.zzg(parcelFileDescriptor, this.zza);
        } catch (RemoteException e7) {
            G6.L.l("Service can't call client", e7);
        }
    }
}
