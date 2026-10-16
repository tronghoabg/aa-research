package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbrq extends zzbrn {
    final /* synthetic */ zzcgd zza;

    public zzbrq(zzbrr zzbrrVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbrrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(parcelFileDescriptor);
    }
}
