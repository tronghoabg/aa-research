package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgvt extends zzgvw {
    final /* synthetic */ zzgwa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgvt(zzgwa zzgwaVar) {
        super(zzgwaVar, null);
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgvw
    public final /* bridge */ /* synthetic */ Object zza(int i5) {
        return new zzgvy(this.zza, i5);
    }
}
