package com.google.android.gms.internal.ads;

import G6.C0551o;
import G6.C0553q;
import android.os.ParcelFileDescriptor;

/* loaded from: classes3.dex */
public final class zzegj extends zzcba {
    private final zzcgd zza;
    private final zzcbk zzb;

    public zzegj(zzcgd zzcgdVar, zzcbk zzcbkVar) {
        this.zza = zzcgdVar;
        this.zzb = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(C0553q c0553q) {
        zzcgd zzcgdVar = this.zza;
        c0553q.getClass();
        zzcgdVar.zzd(new C0551o(c0553q.f4627a, c0553q.f4628b));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }
}
