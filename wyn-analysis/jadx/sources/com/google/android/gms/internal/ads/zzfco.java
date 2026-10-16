package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfco implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    public zzfco(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 37;
    }

    public final zzfcm zzc() {
        return new zzfcm(Fe.c.K(this.zzb, (String) C0395s.f2489e.f2492c.zzd(zzbix.zzhi)));
    }
}
