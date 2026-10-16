package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzgvy extends zzgvk {
    final /* synthetic */ zzgwa zza;
    private final Object zzb;
    private int zzc;

    public zzgvy(zzgwa zzgwaVar, int i5) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
        this.zzb = zzgwaVar.zzo(i5);
        this.zzc = i5;
    }

    private final void zza() {
        int i5 = this.zzc;
        if (i5 != -1) {
            zzgwa zzgwaVar = this.zza;
            if (i5 < zzgwaVar.size() && Objects.equals(this.zzb, zzgwaVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object getValue() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            return null;
        }
        return zzgwaVar.zzp(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i5 = this.zzc;
        if (i5 == -1) {
            zzgwaVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgwaVar.zzp(i5);
        zzgwaVar.zzq(this.zzc, obj);
        return objZzp;
    }
}
