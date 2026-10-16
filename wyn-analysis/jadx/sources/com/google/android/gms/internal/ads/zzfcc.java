package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfcc implements zzfcs {
    private final zzceg zza;
    private final zzhcp zzb;
    private final Context zzc;

    public zzfcc(zzceg zzcegVar, zzhcp zzhcpVar, Context context) {
        this.zza = zzcegVar;
        this.zzb = zzhcpVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zzb.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 34;
    }

    public final zzfcd zzc() {
        zzceg zzcegVar = this.zza;
        Context context = this.zzc;
        if (!zzcegVar.zzb(context)) {
            return new zzfcd(null, null, null, null, null);
        }
        String strZzi = zzcegVar.zzi(context);
        String str = strZzi == null ? "" : strZzi;
        String strZzj = zzcegVar.zzj(context);
        String str2 = strZzj == null ? "" : strZzj;
        String strZzk = zzcegVar.zzk(context);
        String str3 = strZzk == null ? "" : strZzk;
        String str4 = true != zzcegVar.zzb(context) ? null : "fa";
        return new zzfcd(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) C0395s.f2489e.f2492c.zzd(zzbix.zzba) : null);
    }
}
