package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
final class zzgot implements zzgop {
    private final zzgfe zza;
    private final zzgfe zzb;
    private final zzimt zzc;
    private final zzgqo zzd;
    private final ExecutorService zze;

    public zzgot(zzgfe zzgfeVar, zzgfe zzgfeVar2, zzimt zzimtVar, ExecutorService executorService, zzgqo zzgqoVar) {
        this.zza = zzgfeVar;
        this.zzb = zzgfeVar2;
        this.zzc = zzimtVar;
        this.zzd = zzgqoVar;
        this.zze = executorService;
    }

    private final p8.p zzi(zzggb zzggbVar) {
        p8.p pVarZzc = this.zza.zzc(zzggbVar);
        this.zzd.zze(20303, pVarZzc);
        return pVarZzc;
    }

    private final p8.p zzj(byte[] bArr) {
        p8.p pVarZzc = this.zzb.zzc(bArr);
        this.zzd.zze(20305, pVarZzc);
        return pVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zza() {
        return zzhcf.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzb() {
        p8.p pVarZzb = this.zza.zzb();
        this.zzd.zze(20302, pVarZzb);
        return pVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzc(final zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        p8.p pVarZzc = ((zzgfe) this.zzc.zzb()).zzc(bArr);
        this.zzd.zze(20307, pVarZzc);
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzhcf.zzl(pVarZzc, zzj(bArr2))), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgor
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzh(zzggbVar, (List) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgng
    public final p8.p zzd(final zzggb zzggbVar, byte[] bArr) {
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(zzj(bArr)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzgoq
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzg(zzggbVar, (Void) obj);
            }
        }, zzhcw.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final p8.p zze() {
        p8.p pVarZzb = this.zzb.zzb();
        this.zzd.zze(20304, pVarZzb);
        return pVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final p8.p zzf() {
        p8.p pVarZzd = zzhcf.zzd(zzgos.zza, this.zze);
        this.zzd.zze(20312, pVarZzd);
        return pVarZzd;
    }

    public final /* synthetic */ p8.p zzg(zzggb zzggbVar, Void r22) {
        return zzi(zzggbVar);
    }

    public final /* synthetic */ p8.p zzh(zzggb zzggbVar, List list) {
        return zzi(zzggbVar);
    }
}
