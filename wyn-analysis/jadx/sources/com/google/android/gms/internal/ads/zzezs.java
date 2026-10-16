package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzezs implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    public zzezs(zzhcp zzhcpVar, Context context) {
        this.zzb = zzhcpVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 57;
    }

    public final zzezt zzc() {
        U u10 = C6.n.f1857D.f1863c;
        Object systemService = this.zza.getSystemService("display");
        return new zzezt(systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null);
    }
}
