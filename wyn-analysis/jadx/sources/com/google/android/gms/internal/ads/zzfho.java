package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzfho implements zzhcc {
    public zzfho(zzfhr zzfhrVar) {
        Objects.requireNonNull(zzfhrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        G6.L.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        G6.L.k("Notification of cache hit successful.");
    }
}
