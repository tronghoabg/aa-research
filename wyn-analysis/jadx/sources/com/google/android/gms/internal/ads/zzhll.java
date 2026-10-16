package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhll extends zzhlk {
    private final long[] zzd;

    public zzhll() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhlk
    public final void zza(long[] jArr, long[] jArr2) {
        zzhlw.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhll(zzhlo zzhloVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhln zzhlnVar = zzhloVar.zza;
        zzhlw.zza(jArr2, zzhlnVar.zzb, zzhlnVar.zza);
        long[] jArr3 = this.zzb;
        zzhln zzhlnVar2 = zzhloVar.zza;
        zzhlw.zzb(jArr3, zzhlnVar2.zzb, zzhlnVar2.zza);
        System.arraycopy(zzhloVar.zza.zzc, 0, jArr, 0, 10);
        zzhlw.zze(this.zzc, zzhloVar.zzb, zzhlr.zzb);
    }
}
