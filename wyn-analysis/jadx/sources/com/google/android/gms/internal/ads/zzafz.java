package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import com.vungle.ads.internal.protos.Sdk;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzafz {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE, 256, 384, 448, 512, 640, 768, 896, Segment.SHARE_MINIMUM, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(int i5) {
        if (i5 == 2147385345 || i5 == -25230976 || i5 == 536864768 || i5 == -14745368) {
            return 1;
        }
        if (i5 == 1683496997 || i5 == 622876772) {
            return 2;
        }
        if (i5 == 1078008818 || i5 == -233094848) {
            return 3;
        }
        return (i5 == 1908687592 || i5 == -398277519) ? 4 : 0;
    }

    public static zzv zzb(byte[] bArr, String str, String str2, int i5, String str3, zzq zzqVar) {
        zzet zzetVarZzi = zzi(bArr);
        zzetVarZzi.zzh(60);
        int i10 = zzb[zzetVarZzi.zzj(6)];
        int i11 = zzc[zzetVarZzi.zzj(4)];
        int iZzj = zzetVarZzi.zzj(5);
        int i12 = iZzj >= 29 ? -1 : (zzd[iZzj] * 1000) / 2;
        zzetVarZzi.zzh(10);
        int i13 = i10 + (zzetVarZzi.zzj(2) > 0 ? 1 : 0);
        zzt zztVar = new zzt();
        zztVar.zza(str);
        zztVar.zzn("video/mp2t");
        zztVar.zzo("audio/vnd.dts");
        zztVar.zzi(i12);
        zztVar.zzG(i13);
        zztVar.zzI(i11);
        zztVar.zzs(null);
        zztVar.zze(str2);
        zztVar.zzg(i5);
        return zztVar.zzP();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zzc(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4e
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r3]
        L1f:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r1 = r1 | r2
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5c
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 8
            r7 = r7[r2]
        L35:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r0 = r0 | r1
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5c
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r2 = 9
            r7 = r7[r2]
            goto L35
        L4e:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r7 = r7[r4]
            goto L1f
        L5c:
            if (r0 == 0) goto L62
            int r7 = r7 * 16
            int r7 = r7 / 14
        L62:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafz.zzc(byte[]):int");
    }

    public static zzafy zzd(byte[] bArr) throws zzat {
        int iZzj;
        int i5;
        long jZzw;
        int i10;
        zzet zzetVarZzi = zzi(bArr);
        zzetVarZzi.zzh(40);
        int iZzj2 = zzetVarZzi.zzj(2);
        boolean zZzi = zzetVarZzi.zzi();
        int i11 = true != zZzi ? 16 : 20;
        zzetVarZzi.zzh(true != zZzi ? 8 : 12);
        int iZzj3 = zzetVarZzi.zzj(i11) + 1;
        boolean zZzi2 = zzetVarZzi.zzi();
        int iZzj4 = -1;
        int i12 = 0;
        if (zZzi2) {
            iZzj = zzetVarZzi.zzj(2);
            int iZzj5 = zzetVarZzi.zzj(3) + 1;
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzh(36);
            }
            int iZzj6 = zzetVarZzi.zzj(3) + 1;
            int iZzj7 = zzetVarZzi.zzj(3) + 1;
            if (iZzj6 != 1 || iZzj7 != 1) {
                throw zzat.zzc("Multiple audio presentations or assets not supported");
            }
            int i13 = iZzj2 + 1;
            int iZzj8 = zzetVarZzi.zzj(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((iZzj8 >> i14) & 1) == 1) {
                    zzetVarZzi.zzh(8);
                }
            }
            int i15 = iZzj5 * 512;
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzh(2);
                int iZzj9 = (zzetVarZzi.zzj(2) + 1) << 2;
                int iZzj10 = zzetVarZzi.zzj(2) + 1;
                while (i12 < iZzj10) {
                    zzetVarZzi.zzh(iZzj9);
                    i12++;
                }
            }
            i12 = i15;
        } else {
            iZzj = -1;
        }
        zzetVarZzi.zzh(i11);
        zzetVarZzi.zzh(12);
        if (zZzi2) {
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzh(4);
            }
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzh(24);
            }
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzo(zzetVarZzi.zzj(10) + 1);
            }
            zzetVarZzi.zzh(5);
            i5 = zze[zzetVarZzi.zzj(4)];
            iZzj4 = zzetVarZzi.zzj(8) + 1;
        } else {
            i5 = -2147483647;
        }
        int i16 = i5;
        if (zZzi2) {
            if (iZzj == 0) {
                i10 = 32000;
            } else if (iZzj == 1) {
                i10 = 44100;
            } else {
                if (iZzj != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj).length() + 51);
                    sb2.append("Unsupported reference clock code in DTS HD header: ");
                    sb2.append(iZzj);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i10 = 48000;
            }
            jZzw = zzfm.zzw(i12, 1000000L, i10, RoundingMode.DOWN);
        } else {
            jZzw = -9223372036854775807L;
        }
        return new zzafy("audio/vnd.dts.hd;profile=lbr", iZzj4, i16, iZzj3, jZzw, 0, null);
    }

    public static int zze(byte[] bArr) {
        zzet zzetVarZzi = zzi(bArr);
        zzetVarZzi.zzh(42);
        return zzetVarZzi.zzj(true != zzetVarZzi.zzi() ? 8 : 12) + 1;
    }

    public static zzafy zzf(byte[] bArr, AtomicInteger atomicInteger) throws zzat {
        long jZzw;
        int iZzj;
        AtomicInteger atomicInteger2;
        int i5;
        int i10;
        zzet zzetVarZzi = zzi(bArr);
        int iZzj2 = zzetVarZzi.zzj(32);
        int iZzh = zzh(zzetVarZzi, zzf, true);
        int i11 = iZzh + 1;
        char c10 = iZzj2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jZzw = -9223372036854775807L;
            iZzj = -2147483647;
        } else {
            if (!zzetVarZzi.zzi()) {
                throw zzat.zzc("Only supports full channel mask-based audio presentation");
            }
            int i12 = iZzh - 1;
            if (((bArr[iZzh] & ForkServer.ERROR) | ((char) (bArr[i12] << 8))) != zzfm.zzM(bArr, 0, i12, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
                throw zzat.zzb("CRC check failed", null);
            }
            int iZzj3 = zzetVarZzi.zzj(2);
            if (iZzj3 == 0) {
                i5 = 512;
            } else if (iZzj3 == 1) {
                i5 = 480;
            } else {
                if (iZzj3 != 2) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj3).length() + 51);
                    sb2.append("Unsupported base duration index in DTS UHD header: ");
                    sb2.append(iZzj3);
                    throw zzat.zzb(sb2.toString(), null);
                }
                i5 = 384;
            }
            int iZzj4 = zzetVarZzi.zzj(3) + 1;
            int iZzj5 = zzetVarZzi.zzj(2);
            if (iZzj5 == 0) {
                i10 = 32000;
            } else if (iZzj5 == 1) {
                i10 = 44100;
            } else {
                if (iZzj5 != 2) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj5).length() + 48);
                    sb3.append("Unsupported clock rate index in DTS UHD header: ");
                    sb3.append(iZzj5);
                    throw zzat.zzb(sb3.toString(), null);
                }
                i10 = 48000;
            }
            if (zzetVarZzi.zzi()) {
                zzetVarZzi.zzh(36);
            }
            iZzj = (1 << zzetVarZzi.zzj(2)) * i10;
            jZzw = zzfm.zzw(i5 * iZzj4, 1000000L, i10, RoundingMode.DOWN);
        }
        int i13 = iZzj;
        long j8 = jZzw;
        int iZzh2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iZzh2 += zzh(zzetVarZzi, zzg, true);
        }
        for (int i14 = 0; i14 <= 0; i14++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzh(zzetVarZzi, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzh2 += atomicInteger2.get() != 0 ? zzh(zzetVarZzi, zzi, true) : 0;
        }
        return new zzafy("audio/vnd.dts.uhd;profile=p2", 2, i13, i11 + iZzh2, j8, 0, null);
    }

    public static int zzg(byte[] bArr) {
        zzet zzetVarZzi = zzi(bArr);
        zzetVarZzi.zzh(32);
        return zzh(zzetVarZzi, zzj, true) + 1;
    }

    private static int zzh(zzet zzetVar, int[] iArr, boolean z2) {
        int i5 = 0;
        for (int i10 = 0; i10 < 3 && zzetVar.zzi(); i10++) {
            i5++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 += 1 << iArr[i12];
        }
        return zzetVar.zzj(iArr[i5]) + i11;
    }

    private static zzet zzi(byte[] bArr) {
        byte b5 = bArr[0];
        if (b5 == 127 || b5 == 100 || b5 == 64 || b5 == 113) {
            return new zzet(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b10 = bArrCopyOf[0];
        if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
            for (int i5 = 0; i5 < bArrCopyOf.length - 1; i5 += 2) {
                byte b11 = bArrCopyOf[i5];
                int i10 = i5 + 1;
                bArrCopyOf[i5] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b11;
            }
        }
        int length = bArrCopyOf.length;
        zzet zzetVar = new zzet(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzet zzetVar2 = new zzet(bArrCopyOf, length);
            while (zzetVar2.zzc() >= 16) {
                zzetVar2.zzh(2);
                zzetVar.zzp(zzetVar2.zzj(14), 14);
            }
        }
        zzetVar.zzb(bArrCopyOf, bArrCopyOf.length);
        return zzetVar;
    }
}
