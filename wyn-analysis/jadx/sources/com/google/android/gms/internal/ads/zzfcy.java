package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfcy implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    public zzfcy(Context context, zzhcp zzhcpVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return ((Boolean) zzbkp.zzb.zze()).booleanValue() ? this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzhcf.zza(new zzfcz(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzfcz zzc() {
        Context context = this.zza;
        return new zzfcz(zzbii.zzc(context), zzbii.zzd(context));
    }
}
