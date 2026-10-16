package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzevr implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    public zzevr(zzhcp zzhcpVar, Context context) {
        this.zzb = zzhcpVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoD)).booleanValue()) {
            return zzhcf.zza(new zzevs(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzhcf.zza(new zzevs(null, false)) : this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzevs(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 61;
    }
}
