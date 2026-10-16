package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcwi implements zzimz {
    private final zzcvz zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;
    private final zzini zze;

    private zzcwi(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zzcvzVar;
        this.zzb = zziniVar;
        this.zzc = zziniVar2;
        this.zzd = zziniVar3;
        this.zze = zziniVar4;
    }

    public static zzcwi zza(zzcvz zzcvzVar, zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzcwi(zzcvzVar, zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    public static zzdky zzc(zzcvz zzcvzVar, final Context context, final H6.a aVar, final zzfkn zzfknVar, final zzflg zzflgVar) {
        return new zzdky(new zzden() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // com.google.android.gms.internal.ads.zzden
            public final void zzg() {
                zzflg zzflgVar2 = zzflgVar;
                JSONObject jSONObject = zzfknVar.zzC;
                C6.n.f1857D.f1874o.d(context, aVar.f4927a, jSONObject.toString(), zzflgVar2.zzg);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzcop) this.zzc).zza(), ((zzcyr) this.zzd).zza(), ((zzdcq) this.zze).zza());
    }
}
