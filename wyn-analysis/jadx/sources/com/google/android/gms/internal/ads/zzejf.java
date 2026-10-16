package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzejf implements zzhcc {
    final /* synthetic */ zzfos zza;

    public zzejf(zzejh zzejhVar, zzfos zzfosVar) {
        this.zza = zzfosVar;
        Objects.requireNonNull(zzejhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        int i5 = G6.L.f4523b;
        H6.l.c("Failed to get offline signal database: ".concat(strValueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i5 = G6.L.f4523b;
            H6.l.c("Error executing function on offline signal database: ".concat(strValueOf));
        }
    }
}
