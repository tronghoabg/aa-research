package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes3.dex */
public final class zznl {
    private final zzjv zza;

    @Deprecated
    public zznl(Context context, zznh zznhVar) {
        this.zza = new zzjv(context, zznhVar);
    }

    @Deprecated
    public final zznl zza(final zzabi zzabiVar) {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzabiVar.getClass();
        zzjvVar.zze = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjs
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return zzabiVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zznl zzb(final zzma zzmaVar) {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzmaVar.getClass();
        zzjvVar.zzf = new zzguj() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzguj
            public final /* synthetic */ Object zza() {
                int i5 = zzjv.zzA;
                return zzmaVar;
            }
        };
        return this;
    }

    @Deprecated
    public final zznm zzc() {
        zzjv zzjvVar = this.zza;
        zzgtr.zzi(!zzjvVar.zzw);
        zzjvVar.zzw = true;
        return new zznm(zzjvVar);
    }
}
