package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzfhx implements zzgti {
    final /* synthetic */ zzfia zza;

    public zzfhx(zzfia zzfiaVar) {
        Objects.requireNonNull(zzfiaVar);
        this.zza = zzfiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzcbk zzcbkVar = (zzcbk) obj;
        zzfhy zzfhyVar = new zzfhy(zzcbkVar, new zzfnh(zzcbkVar.zzj), null);
        zzfia zzfiaVar = this.zza;
        zzfiaVar.zzd(zzfhyVar);
        return zzfiaVar.zzc();
    }
}
