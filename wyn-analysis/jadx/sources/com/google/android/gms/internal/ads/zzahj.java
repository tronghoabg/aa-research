package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzahj extends zzagp {
    final /* synthetic */ zzahd zza;
    final /* synthetic */ zzahk zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzahj(zzahk zzahkVar, zzahd zzahdVar, zzahd zzahdVar2) {
        super(zzahdVar);
        this.zza = zzahdVar2;
        Objects.requireNonNull(zzahkVar);
        this.zzb = zzahkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagp, com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        zzahb zzahbVarZzc = this.zza.zzc(j8);
        zzahe zzaheVar = zzahbVarZzc.zza;
        long j10 = zzaheVar.zzb;
        zzahk zzahkVar = this.zzb;
        zzahe zzaheVar2 = new zzahe(j10, zzahkVar.zza() + zzaheVar.zzc);
        zzahe zzaheVar3 = zzahbVarZzc.zzb;
        return new zzahb(zzaheVar2, new zzahe(zzaheVar3.zzb, zzahkVar.zza() + zzaheVar3.zzc));
    }
}
