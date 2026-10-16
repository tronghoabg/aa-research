package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfas implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;
    private final PackageInfo zzc;
    private final G6.N zzd;

    public zzfas(zzhcp zzhcpVar, zzflg zzflgVar, PackageInfo packageInfo, G6.N n10) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
        this.zzc = packageInfo;
        this.zzd = n10;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzfat zzc() {
        return new zzfat(this.zzb, this.zzc, this.zzd);
    }
}
