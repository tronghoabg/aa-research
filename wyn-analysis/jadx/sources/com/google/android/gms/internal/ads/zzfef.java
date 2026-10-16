package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfef implements zzfcs {
    final zzhcp zza;

    public zzfef(zzbhl zzbhlVar, zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfeg(new JSONObject());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 45;
    }
}
