package com.google.android.gms.internal.ads;

import cb.AbstractC1593a;

/* loaded from: classes3.dex */
public final class zzawc {
    public int zza;
    public zzavx zzb;
    public zzavl zzc;
    public zzavo zzd;

    public zzawc() {
        this(new zzavo(1));
    }

    private final long zzg() throws zzavz, zzawb {
        int i5 = ((((~1246322141) & 272302173) | 1841378864) + ((1246322141 & 825937997) | 658822930)) - (-1823634633);
        int i10 = 1600766768 % 649830540;
        int i11 = ((((~680326130) & 1378702392) | 3315809) + ((680326130 & 1913472410) | 739293607)) - 2048099035;
        int i12 = 1743768897 % 152059765;
        int i13 = ((((~973294814) & 1252035530) | 51191353) + ((973294814 & 1755616710) | 889459732)) - 1494176168;
        int i14 = 1861701682 % 1196748250;
        int i15 = ((((~29116548) & 174422021) | 84710160) + ((29116548 & (-1973327347)) | (-1266641286))) - (-1891729929);
        int i16 = 2091729405 % 1207774949;
        int i17 = ((((~80201211) & 1629524354) | 38778411) + ((80201211 & 1977746312) | 382371455)) - 1921480783;
        int i18 = 1050760512 % 184320788;
        int i19 = 0;
        long j8 = 0;
        while (i19 < (i5 ^ i10)) {
            try {
                zzavl zzavlVar = this.zzc;
                zzavx zzavxVar = this.zzb;
                int i20 = i5;
                int i21 = this.zza;
                int i22 = i10;
                this.zza = i21 + 1;
                byte bZza = zzavlVar.zza(zzavxVar, i21);
                int i23 = i13 ^ i14;
                j8 |= ((i11 ^ i12) & bZza) << i19;
                if (i19 == i23) {
                    if (bZza > 1) {
                        throw new zzavz();
                    }
                    i19 = i23;
                }
                if ((bZza & (i15 ^ i16)) == 0) {
                    return (j8 >>> 1) ^ (-(1 & j8));
                }
                i19 += i17 ^ i18;
                i5 = i20;
                i10 = i22;
            } catch (IndexOutOfBoundsException e7) {
                throw new zzawb(e7);
            }
        }
        throw new zzavz();
    }

    private static final void zzh(long j8) throws zzawa {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        if (j8 % (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + jArr[6]) ^ (jArr[7] % 477127367)) != 0) {
            throw new zzawa();
        }
    }

    public final void zza(long j8) throws zzawb, zzawa {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        zzh(j8);
        long j18 = j8 / (((((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16) ^ (j17 % 899334107));
        if (j18 < 0 || j18 > this.zzb.zza.length) {
            throw new zzawb();
        }
        this.zza = (int) j18;
    }

    public final long zzb() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j8 = jArr[0];
        long j10 = jArr[1];
        long j11 = jArr[2];
        long j12 = jArr[3];
        long j13 = jArr[4];
        return this.zza * (((((((~j8) & j10) | j11) + ((j8 & j12) | j13)) - jArr[5]) + jArr[6]) ^ (jArr[7] % 1780695788));
    }

    public final long zzc() throws zzawb {
        try {
            zzavl zzavlVar = this.zzc;
            zzavx zzavxVar = this.zzb;
            this.zza = this.zza + 1;
            return zzavlVar.zza(zzavxVar, r2);
        } catch (IndexOutOfBoundsException e7) {
            throw new zzawb(e7);
        }
    }

    public final int zzd() throws zzawb {
        int i5 = ((((~413360099) & 1621678468) | 84323740) + ((413360099 & 1621644360) | 385888249)) - 1513564466;
        int i10 = 1609416931 % 1031126087;
        int i11 = ((((~978587665) & 1228171537) | 1025392332) + ((978587665 & 1075859857) | 983056096)) - (-1589113644);
        int i12 = 1723578341 % 672563970;
        int i13 = ((((~1163384280) & 546336857) | 505597090) + ((1163384280 & 546323033) | 358992768)) - 1346988633;
        int i14 = 1124734562 % 530406424;
        int i15 = ((((~217161528) & 116398273) | 202500381) + ((217161528 & 316821712) | 269928733)) - 410012058;
        int i16 = 529302443 % 418646579;
        try {
            zzavl zzavlVar = this.zzc;
            zzavx zzavxVar = this.zzb;
            int i17 = this.zza;
            this.zza = i17 + 1;
            int i18 = i5 ^ i10;
            int iZza = zzavlVar.zza(zzavxVar, i17) & i18;
            zzavl zzavlVar2 = this.zzc;
            zzavx zzavxVar2 = this.zzb;
            int i19 = this.zza;
            this.zza = i19 + 1;
            int iZza2 = iZza | ((zzavlVar2.zza(zzavxVar2, i19) & i18) << (i11 ^ i12));
            zzavl zzavlVar3 = this.zzc;
            zzavx zzavxVar3 = this.zzb;
            int i20 = this.zza;
            this.zza = i20 + 1;
            int iZza3 = iZza2 | ((i18 & zzavlVar3.zza(zzavxVar3, i20)) << (i13 ^ i14));
            zzavl zzavlVar4 = this.zzc;
            zzavx zzavxVar4 = this.zzb;
            int i21 = this.zza;
            this.zza = i21 + 1;
            return iZza3 | (zzavlVar4.zza(zzavxVar4, i21) << (i15 ^ i16));
        } catch (IndexOutOfBoundsException e7) {
            throw new zzawb(e7);
        }
    }

    public final long zze() throws zzavz, zzawb {
        return zzg();
    }

    public final zzavx zzf(long j8) throws zzawb, zzawa {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i5 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int iB = AbstractC1593a.b((i10 & (~i5)) | i11, (i5 & i12) | i13, i14, i15);
        zzh(zzb() + j8);
        int i17 = this.zza;
        long j10 = i17;
        zzavx zzavxVar = this.zzb;
        long j11 = (j8 >> ((i16 % 774318984) ^ iB)) + j10;
        if (j11 > zzavxVar.zza.length || j11 < j10) {
            throw new zzawb();
        }
        try {
            int i18 = (int) j11;
            zzavx zzavxVarZzb = this.zzc.zzb(zzavxVar, i17, i18);
            this.zza = i18;
            return zzavxVarZzb;
        } catch (IndexOutOfBoundsException e7) {
            throw new AssertionError(zzavv.zza("CEiv6BFfPnitUE+D"), e7);
        }
    }

    public zzawc(zzavo zzavoVar) {
        this(zzavx.zzb, 0, new zzavm());
        this.zzd = zzavoVar;
    }

    private zzawc(zzavx zzavxVar, int i5, zzavl zzavlVar) {
        this.zzb = zzavxVar;
        this.zza = i5;
        this.zzc = zzavlVar;
    }

    public zzawc(zzavx zzavxVar, int i5, zzavl zzavlVar, zzavo zzavoVar) {
        this(zzavxVar, i5, zzavlVar);
        this.zzd = zzavoVar;
    }
}
