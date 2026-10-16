package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzhlo {
    final zzhln zza;
    final long[] zzb;

    public zzhlo(zzhln zzhlnVar, long[] jArr) {
        this.zza = zzhlnVar;
        this.zzb = jArr;
    }

    public static /* synthetic */ zzhlo zza(zzhlo zzhloVar, zzhlm zzhlmVar) {
        zzb(zzhloVar, zzhlmVar);
        return zzhloVar;
    }

    private static zzhlo zzb(zzhlo zzhloVar, zzhlm zzhlmVar) {
        zzhln zzhlnVar = zzhlmVar.zza;
        zzhln zzhlnVar2 = zzhloVar.zza;
        long[] jArr = zzhlnVar2.zza;
        long[] jArr2 = zzhlnVar.zza;
        long[] jArr3 = zzhlmVar.zzb;
        zzhlw.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhlnVar2.zzb;
        long[] jArr5 = zzhlnVar.zzb;
        long[] jArr6 = zzhlnVar.zzc;
        zzhlw.zze(jArr4, jArr5, jArr6);
        zzhlw.zze(zzhlnVar2.zzc, jArr6, jArr3);
        zzhlw.zze(zzhloVar.zzb, jArr2, jArr5);
        return zzhloVar;
    }

    public zzhlo() {
        this(new zzhln(), new long[10]);
    }

    public zzhlo(zzhlm zzhlmVar) {
        this();
        zzb(this, zzhlmVar);
    }
}
