package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class zzagn {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzagm zzk;
    private final zzap zzl;

    public zzagn(int i5, int i10, int i11, int i12, int i13, int i14, int i15, long j8, zzagm zzagmVar, zzap zzapVar) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = zzf(i13);
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = zzg(i15);
        this.zzj = j8;
        this.zzk = zzagmVar;
        this.zzl = zzapVar;
    }

    private static int zzf(int i5) {
        switch (i5) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int zzg(int i5) {
        if (i5 == 8) {
            return 1;
        }
        if (i5 == 12) {
            return 2;
        }
        if (i5 == 16) {
            return 4;
        }
        if (i5 == 20) {
            return 5;
        }
        if (i5 != 24) {
            return i5 != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long zza() {
        long j8 = this.zzj;
        if (j8 == 0) {
            return -9223372036854775807L;
        }
        return (j8 * 1000000) / this.zze;
    }

    public final long zzb(long j8) {
        String str = zzfm.zza;
        return Math.max(0L, Math.min((j8 * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzv zzc(byte[] bArr, zzap zzapVar) {
        bArr[4] = -128;
        zzap zzapVarZzd = zzd(zzapVar);
        zzt zztVar = new zzt();
        zztVar.zzo("audio/flac");
        int i5 = this.zzd;
        if (i5 <= 0) {
            i5 = -1;
        }
        zztVar.zzp(i5);
        zztVar.zzG(this.zzg);
        zztVar.zzI(this.zze);
        zztVar.zzJ(zzfm.zzC(this.zzh, ByteOrder.LITTLE_ENDIAN));
        zztVar.zzr(Collections.singletonList(bArr));
        zztVar.zzl(zzapVarZzd);
        return zztVar.zzP();
    }

    public final zzap zzd(zzap zzapVar) {
        zzap zzapVar2 = this.zzl;
        return zzapVar2 == null ? zzapVar : zzapVar2.zzf(zzapVar);
    }

    public final zzagn zze(zzagm zzagmVar) {
        return new zzagn(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzagmVar, this.zzl);
    }

    public zzagn(byte[] bArr, int i5) {
        zzet zzetVar = new zzet(bArr, bArr.length);
        zzetVar.zzf(i5 * 8);
        this.zza = zzetVar.zzj(16);
        this.zzb = zzetVar.zzj(16);
        this.zzc = zzetVar.zzj(24);
        this.zzd = zzetVar.zzj(24);
        int iZzj = zzetVar.zzj(20);
        this.zze = iZzj;
        this.zzf = zzf(iZzj);
        this.zzg = zzetVar.zzj(3) + 1;
        int iZzj2 = zzetVar.zzj(5) + 1;
        this.zzh = iZzj2;
        this.zzi = zzg(iZzj2);
        this.zzj = zzetVar.zzk(36);
        this.zzk = null;
        this.zzl = null;
    }
}
