package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
public final class zzerx {
    private final zzdno zza;

    public zzerx(zzdno zzdnoVar) {
        this.zza = zzdnoVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfky zzfkyVar, zzfkn zzfknVar, View view, zzert zzertVar) {
        zzerv zzervVar = new zzerv(this, new zzeru(this, zzfknVar));
        zzdmi zzdmiVarZzd = this.zza.zzd(new zzcyq(zzfkyVar, zzfknVar, null), zzervVar);
        zzertVar.zzd(new zzerw(this, zzdmiVarZzd));
        return zzdmiVarZzd.zzh();
    }
}
