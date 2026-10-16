package com.google.android.gms.internal.p002firebaseauthapi;

import J8.C0630e;
import a.AbstractC1304a;

/* loaded from: classes.dex */
final class zzzo implements zzael<zzagl> {
    private final /* synthetic */ C0630e zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;
    private final /* synthetic */ zzzk zzd;

    public zzzo(zzzk zzzkVar, C0630e c0630e, String str, zzade zzadeVar) {
        this.zza = c0630e;
        this.zzb = str;
        this.zzc = zzadeVar;
        this.zzd = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(AbstractC1304a.i0(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzd.zza(new zzafn(this.zza, zzaglVar.zzc(), this.zzb), this.zzc);
    }
}
