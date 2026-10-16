package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfer implements zzfcs {
    final zzhcp zza;
    final List zzb;

    public zzfer(zzbih zzbihVar, zzhcp zzhcpVar, List list) {
        this.zza = zzhcpVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfeq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfes(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 48;
    }
}
