package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzfhw implements zzgti {
    final /* synthetic */ zzfia zza;

    public zzfhw(zzfia zzfiaVar) {
        Objects.requireNonNull(zzfiaVar);
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        int i5 = G6.L.f4523b;
        H6.l.d("", (zzegz) obj);
        G6.L.k("Failed to get a cache key, reverting to legacy flow.");
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zzd(new zzfhy(null, zzfiaVar.zzb(), null));
        return zzfiaVar.zzc();
    }
}
