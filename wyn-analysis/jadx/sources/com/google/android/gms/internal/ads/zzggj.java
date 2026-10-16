package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzggj {
    private final zzimt zza;
    private final zzimt zzb;
    private final zzimt zzc;
    private final ExecutorService zzd;
    private final zzgqo zze;
    private final int zzf;

    public zzggj(zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzgdq zzgdqVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzimtVar;
        this.zzb = zzimtVar2;
        this.zzc = zzimtVar3;
        this.zzd = executorService;
        this.zze = zzgqoVar;
        this.zzf = zzgdqVar.zzL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final p8.p zzd(final int i5) {
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzggf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i5);
            }
        }, this.zzd)), zzggg.zza, zzhcw.zza());
    }

    public final /* synthetic */ zzgqo zza() {
        return this.zze;
    }

    public final p8.p zzb(int i5, boolean z2) {
        p8.p pVarZzd = zzd(i5);
        return (!z2 || i5 == this.zzf) ? pVarZzd : (zzhbx) zzhcf.zzj((zzhbx) zzhcf.zzg(zzhbx.zzw(pVarZzd), Throwable.class, zzggi.zza, zzhcw.zza()), new zzgge(this), zzhcw.zza());
    }

    public final /* synthetic */ zzggc zzc(int i5) {
        int i10 = i5 - 1;
        if (i10 == 1) {
            return (zzggc) this.zza.zzb();
        }
        if (i10 == 2) {
            return (zzggc) this.zzb.zzb();
        }
        if (i10 == 3) {
            return (zzggc) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ int zze() {
        return this.zzf;
    }
}
