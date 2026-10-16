package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzhbt extends zzhbh {
    private zzhbs zza;

    public zzhbt(zzgwp zzgwpVar, boolean z2, Executor executor, Callable callable) {
        super(zzgwpVar, z2, false);
        this.zza = new zzhbr(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzA(int i5) {
        super.zzA(i5);
        if (i5 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzhbs zzhbsVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzi() {
        zzhbs zzhbsVar = this.zza;
        if (zzhbsVar != null) {
            zzhbsVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzw(int i5, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzx() {
        zzhbs zzhbsVar = this.zza;
        if (zzhbsVar != null) {
            zzhbsVar.zze();
        }
    }
}
