package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbic;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdyt implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdyt(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar4;
    }

    public static zzdyt zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzdyt(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        Set setSingleton;
        final String strZza = ((zzffc) this.zza).zza();
        Context contextZza = ((zzcnz) this.zzb).zza();
        zzhcp zzhcpVarZzc = zzfoi.zzc();
        Map mapZzb = ((zzind) this.zzc).zzb();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgk)).booleanValue()) {
            zzbhw zzbhwVar = new zzbhw(new zzbib(contextZza));
            zzbhwVar.zzb(new zzbhv() { // from class: com.google.android.gms.internal.ads.zzdyu
                @Override // com.google.android.gms.internal.ads.zzbhv
                public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                    zzaVar.zzh(strZza);
                }
            });
            setSingleton = Collections.singleton(new zzdky(new zzdyw(zzbhwVar, mapZzb), zzhcpVarZzc));
        } else {
            setSingleton = Collections.EMPTY_SET;
        }
        zzinh.zzb(setSingleton);
        return setSingleton;
    }
}
