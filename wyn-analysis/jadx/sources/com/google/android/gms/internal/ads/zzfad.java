package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class zzfad implements zzfcs {
    private final Context zza;
    private final Intent zzb;

    public zzfad(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        G6.L.k("HsdpMigrationSignal.produce");
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoy)).booleanValue()) {
            return zzhcf.zza(new zzfae(null));
        }
        boolean z2 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                G6.L.k("HSDP intent is supported");
                z2 = true;
            }
        } catch (Exception e7) {
            C6.n.f1857D.f1868h.zzh(e7, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzhcf.zza(new zzfae(Boolean.valueOf(z2)));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 60;
    }
}
