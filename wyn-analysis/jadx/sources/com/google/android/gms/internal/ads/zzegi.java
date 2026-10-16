package com.google.android.gms.internal.ads;

import G6.C0551o;
import G6.C0553q;
import android.os.ParcelFileDescriptor;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzegi extends zzcba {
    final /* synthetic */ zzegk zza;

    public zzegi(zzegk zzegkVar) {
        Objects.requireNonNull(zzegkVar);
        this.zza = zzegkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzegk zzegkVar = this.zza;
        zzegkVar.zza.zzc(new zzeha(autoCloseInputStream, zzegkVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(C0553q c0553q) {
        zzcgd zzcgdVar = this.zza.zza;
        c0553q.getClass();
        zzcgdVar.zzd(new C0551o(c0553q.f4627a, c0553q.f4628b));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) {
        this.zza.zza.zzc(new zzeha(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzcbkVar));
    }
}
