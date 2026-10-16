package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzgon implements zzgnh {
    private final zzglk zza;
    private final ExecutorService zzb;
    private final zzgqo zzc;

    public zzgon(zzglk zzglkVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzglkVar;
        this.zzb = executorService;
        this.zzc = zzgqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zza() {
        return zzhcf.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzb() {
        p8.p pVarZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgom
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, pVarZzd);
        return pVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzc(final zzggb zzggbVar, final byte[] bArr, final byte[] bArr2) {
        p8.p pVarZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgol
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzi(zzggbVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, pVarZzd);
        return pVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzd(final zzggb zzggbVar, final byte[] bArr) {
        p8.p pVarZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgok
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzh(zzggbVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, pVarZzd);
        return pVarZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgnh
    public final p8.p zze() {
        p8.p pVarZzd = zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgoj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, pVarZzd);
        return pVarZzd;
    }

    public final /* synthetic */ zzggb zzf() {
        zzggb zzggbVarZzc = this.zza.zzc(1);
        return zzggbVarZzc == null ? zzggb.zzh() : zzggbVarZzc;
    }

    public final /* synthetic */ zzfyz zzg() {
        return this.zza.zzb(1);
    }

    public final /* synthetic */ Void zzh(zzggb zzggbVar, byte[] bArr) {
        this.zza.zza(zzggbVar, null, bArr);
        return null;
    }

    public final /* synthetic */ Void zzi(zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzggbVar, bArr, bArr2);
        return null;
    }
}
