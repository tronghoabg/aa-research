package com.google.android.gms.internal.ads;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class zzavt {
    public static zzawt zza(final long j8) {
        return zzawt.zzf(new zzawl() { // from class: com.google.android.gms.internal.ads.zzavs
            public final /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                try {
                    ((zzawo) obj).zzb.zzb(zzawt.zzb(j8));
                    return Optional.empty();
                } catch (zzawj unused) {
                    return Optional.of(zzavd.zza);
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public static int zzb(long j8, zzaws zzawsVar, boolean z2) throws IOException {
        long[] jArr = {2000490107, 1476547902, 1834034217, 268849430, 1839467528, 4368198174L, 449620248, 1652701270, 1629190168};
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = (((((~j10) & j11) | j12) + ((j10 & j13) | j14)) - j15) + j16;
        long j19 = j17 % 1629190168;
        int i5 = ((((~1725868784) & 388366538) | 739792167) + ((1725868784 & 1395525853) | 1087913783)) - 2073845026;
        int i10 = 1550046828 % 184366026;
        int i11 = ((((~84870791) & 719462960) | 688752780) + ((84870791 & 317383283) | 806209731)) - 1437974767;
        int i12 = 2023762697 % 959200313;
        int i13 = ((((~294151249) & 1465191424) | 201912514) + ((294151249 & 1398095366) | 75641662)) - 1330100008;
        int i14 = 1583887958 % 619175679;
        long j20 = z2 ? (j8 >> ((((((~1375552878) & 930005102) | 1249030018) + ((1375552878 & 1024213116) | 136481682)) - 2090967727) ^ (2014126950 % 228698447))) ^ (j8 + j8) : j8;
        int i15 = 1;
        while (true) {
            long j21 = j18 ^ j19;
            long j22 = j20 >>> (i11 ^ i12);
            boolean z10 = j22 != 0 || i15 < 0;
            int i16 = (int) (j20 & j21);
            if (z10) {
                int i17 = i5 ^ i10;
                i16 = ((i16 | (i13 ^ i14)) << i17) >> i17;
            }
            zzawsVar.zza((byte) i16);
            if (!z10) {
                return i15;
            }
            i15++;
            j20 = j22;
        }
    }
}
