package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzgwe extends zzgwg {
    public zzgwe() {
        super(null);
    }

    public static final zzgwg zzf(int i5) {
        return i5 < 0 ? zzgwg.zzb : i5 > 0 ? zzgwg.zzc : zzgwg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzb(int i5, int i10) {
        return zzf(Integer.compare(i5, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzc(boolean z2, boolean z10) {
        return zzf(Boolean.compare(z10, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwg zzd(boolean z2, boolean z10) {
        return zzf(Boolean.compare(z2, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final int zze() {
        return 0;
    }
}
