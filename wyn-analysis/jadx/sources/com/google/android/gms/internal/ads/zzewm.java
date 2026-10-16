package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzewm implements zzfcs {
    private final zzhcp zza;
    private final H6.a zzb;

    public zzewm(H6.a aVar, zzhcp zzhcpVar) {
        this.zzb = aVar;
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzewn zzc() {
        return zzewn.zzb(this.zzb);
    }
}
