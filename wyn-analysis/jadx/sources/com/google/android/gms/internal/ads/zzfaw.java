package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfaw implements zzfcs {
    private static String zzc;
    private final zzhcp zza;
    private final Context zzb;

    public zzfaw(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 27;
    }

    public final zzfax zzc() {
        zzbio zzbioVar = zzbix.zzgq;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return new zzfax(null);
        }
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzgz)).booleanValue()) {
            return new zzfax(C6.n.f1857D.f1884y.zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = C6.n.f1857D.f1884y.zzb(this.zzb);
        }
        return new zzfax(zzc);
    }
}
