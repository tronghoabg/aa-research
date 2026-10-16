package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzezw implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;

    public zzezw(zzhcp zzhcpVar, zzflg zzflgVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 21;
    }

    public final /* synthetic */ zzezx zzc() {
        return new zzezx("requester_type_2".equals(AbstractC3772b.Y(this.zzb.zzd)));
    }
}
