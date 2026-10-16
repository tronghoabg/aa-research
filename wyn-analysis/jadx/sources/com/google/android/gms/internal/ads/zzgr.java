package com.google.android.gms.internal.ads;

import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgr {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zza(byte[] bArr, int i5) {
        int i10;
        synchronized (zzc) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i5) {
                while (true) {
                    try {
                        if (i11 >= i5 - 2) {
                            i11 = i5;
                            break;
                        }
                        int i13 = i11 + 1;
                        if (bArr[i11] == 0 && bArr[i13] == 0 && bArr[i11 + 2] == 3) {
                            break;
                        }
                        i11 = i13;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i11 < i5) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i12) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i5 - i12;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = zzd[i16] - i14;
                System.arraycopy(bArr, i14, bArr, i15, i17);
                int i18 = i15 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i15 = i18 + 2;
                bArr[i19] = 0;
                i14 += i17 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i15, i10 - i15);
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzv r4, byte[] r5, int r6) {
        /*
            java.lang.String r4 = zzq(r4)
            r6 = 0
            if (r4 != 0) goto L8
            return r6
        L8:
            int r0 = r4.hashCode()
            r1 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L32
            r1 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r0 == r1) goto L28
            r1 = 1331856911(0x4f62860f, float:3.8004365E9)
            if (r0 == r1) goto L1e
            goto L3c
        L1e:
            java.lang.String r0 = "video/vvc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3c
            r4 = r2
            goto L3d
        L28:
            java.lang.String r0 = "video/avc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3c
            r4 = r6
            goto L3d
        L32:
            java.lang.String r0 = "video/hevc"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L3c
            r4 = r3
            goto L3d
        L3c:
            r4 = -1
        L3d:
            r0 = 4
            if (r4 == 0) goto L5d
            if (r4 == r3) goto L52
            if (r4 == r2) goto L45
            return r6
        L45:
            r4 = 5
            r4 = r5[r4]
            r4 = r4 & 248(0xf8, float:3.48E-43)
            int r4 = r4 >> 3
            r5 = 23
            if (r4 != r5) goto L51
            return r3
        L51:
            return r6
        L52:
            r4 = r5[r0]
            r4 = r4 & 126(0x7e, float:1.77E-43)
            int r4 = r4 >> r3
            r5 = 39
            if (r4 != r5) goto L5c
            return r3
        L5c:
            return r6
        L5d:
            r4 = r5[r0]
            r4 = r4 & 31
            r5 = 6
            if (r4 != r5) goto L65
            return r3
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zzb(com.google.android.gms.internal.ads.zzv, byte[], int):boolean");
    }

    public static int zzc(zzv zzvVar) {
        String strZzq = zzq(zzvVar);
        if (Objects.equals(strZzq, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(strZzq, MimeTypes.VIDEO_H265) || Objects.equals(strZzq, "video/vvc")) ? 2 : 0;
    }

    public static boolean zzd(byte[] bArr, int i5, int i10, zzv zzvVar) {
        String str = zzvVar.zzp;
        if (Objects.equals(str, MimeTypes.VIDEO_H264)) {
            byte b5 = bArr[4];
            if (((b5 & 96) >> 5) != 0) {
                return true;
            }
            int i11 = b5 & 31;
            return (i11 == 1 || i11 == 9 || i11 == 14) ? false : true;
        }
        if (Objects.equals(str, MimeTypes.VIDEO_H265)) {
            zzgf zzgfVarZzl = zzl(new zzgy(bArr, 4, i10 + 4));
            int i12 = zzgfVarZzl.zza;
            if (i12 == 35) {
                return false;
            }
            return (i12 <= 14 && i12 % 2 == 0 && zzgfVarZzl.zzc == zzvVar.zzG + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c A[PHI: r2
  0x016c: PHI (r2v6 int) = (r2v4 int), (r2v3 int) binds: [B:87:0x0171, B:83:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016f A[PHI: r2
  0x016f: PHI (r2v4 int) = (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v7 int) binds: [B:74:0x0156, B:76:0x015a, B:78:0x015e, B:80:0x0162, B:82:0x0166, B:84:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgq zze(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zze(byte[], int, int):com.google.android.gms.internal.ads.zzgq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:307:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgo zzf(byte[] r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zzf(byte[], int, int):com.google.android.gms.internal.ads.zzgo");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgl zzg(byte[] r36, int r37, int r38, com.google.android.gms.internal.ads.zzgo r39) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zzg(byte[], int, int, com.google.android.gms.internal.ads.zzgo):com.google.android.gms.internal.ads.zzgl");
    }

    public static zzgp zzh(byte[] bArr, int i5, int i10) {
        zzgy zzgyVar = new zzgy(bArr, 4, i10);
        int iZzg = zzgyVar.zzg();
        int iZzg2 = zzgyVar.zzg();
        zzgyVar.zza();
        return new zzgp(iZzg, iZzg2, zzgyVar.zze());
    }

    public static int zzi(byte[] bArr, int i5, int i10, boolean[] zArr) {
        int i11 = i10 - i5;
        zzgtr.zzi(i11 >= 0);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            zzj(zArr);
            return i5 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i5] == 1) {
            zzj(zArr);
            return i5 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i5] == 0 && bArr[i5 + 1] == 1) {
            zzj(zArr);
            return i5 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i5 + 2;
        while (i13 < i12) {
            byte b5 = bArr[i13];
            if ((b5 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b5 == 1) {
                    zzj(zArr);
                    return i14;
                }
                i13 = i14;
            }
            i13 += 3;
        }
        zArr[0] = i11 <= 2 ? !(i11 != 2 ? !(zArr[1] && bArr[i12] == 1) : !(zArr[2] && bArr[i10 + (-2)] == 0 && bArr[i12] == 1)) : bArr[i10 + (-3)] == 0 && bArr[i10 + (-2)] == 0 && bArr[i12] == 1;
        zArr[1] = i11 <= 1 ? zArr[2] && bArr[i12] == 0 : bArr[i10 + (-2)] == 0 && bArr[i12] == 0;
        zArr[2] = bArr[i12] == 0;
        return i10;
    }

    public static void zzj(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzk(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            byte[] bArr = (byte[]) list.get(i5);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i10 = zzgwt.zzd;
                zzgwq zzgwqVar = new zzgwq();
                int i11 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i11 >= length2) {
                        break;
                    }
                    int iZzi = zzi(bArr, i11, length2, zArr);
                    if (iZzi != length2) {
                        zzgwqVar.zzf(Integer.valueOf(iZzi));
                    }
                    i11 = iZzi + 3;
                }
                zzgwt zzgwtVarZzi = zzgwqVar.zzi();
                for (int i12 = 0; i12 < zzgwtVarZzi.size(); i12++) {
                    if (((Integer) zzgwtVarZzi.get(i12)).intValue() + 3 < length) {
                        zzgy zzgyVar = new zzgy(bArr, ((Integer) zzgwtVarZzi.get(i12)).intValue() + 3, length);
                        zzgf zzgfVarZzl = zzl(zzgyVar);
                        if (zzgfVarZzl.zza == 33 && zzgfVarZzl.zzb == 0) {
                            zzgyVar.zzb(4);
                            int iZzf = zzgyVar.zzf(3);
                            zzgyVar.zza();
                            zzgg zzggVarZzm = zzm(zzgyVar, true, iZzf, null);
                            return zzdr.zzc(zzggVarZzm.zza, zzggVarZzm.zzb, zzggVarZzm.zzc, zzggVarZzm.zzd, zzggVarZzm.zze, zzggVarZzm.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzgf zzl(zzgy zzgyVar) {
        zzgyVar.zza();
        return new zzgf(zzgyVar.zzf(6), zzgyVar.zzf(6), zzgyVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzgg zzm(com.google.android.gms.internal.ads.zzgy r18, boolean r19, int r20, com.google.android.gms.internal.ads.zzgg r21) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 8
            r6 = 0
            if (r19 == 0) goto L41
            r2 = 2
            int r2 = r0.zzf(r2)
            boolean r7 = r0.zze()
            r8 = 5
            int r8 = r0.zzf(r8)
            r9 = r6
            r10 = r9
        L1e:
            r11 = 32
            if (r9 >= r11) goto L2e
            boolean r11 = r0.zze()
            if (r11 == 0) goto L2b
            r11 = 1
            int r11 = r11 << r9
            r10 = r10 | r11
        L2b:
            int r9 = r9 + 1
            goto L1e
        L2e:
            r9 = r6
        L2f:
            if (r9 >= r3) goto L3a
            int r11 = r0.zzf(r5)
            r4[r9] = r11
            int r9 = r9 + 1
            goto L2f
        L3a:
            r12 = r2
        L3b:
            r16 = r4
            r13 = r7
            r14 = r8
            r15 = r10
            goto L55
        L41:
            if (r2 == 0) goto L4f
            int r3 = r2.zza
            boolean r7 = r2.zzb
            int r8 = r2.zzc
            int r10 = r2.zzd
            int[] r4 = r2.zze
            r12 = r3
            goto L3b
        L4f:
            r16 = r4
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L55:
            int r17 = r0.zzf(r5)
            r2 = r6
        L5a:
            if (r6 >= r1) goto L6f
            boolean r3 = r0.zze()
            if (r3 == 0) goto L64
            int r2 = r2 + 88
        L64:
            boolean r3 = r0.zze()
            if (r3 == 0) goto L6c
            int r2 = r2 + 8
        L6c:
            int r6 = r6 + 1
            goto L5a
        L6f:
            r0.zzb(r2)
            if (r1 <= 0) goto L79
            int r5 = r5 - r1
            int r5 = r5 + r5
            r0.zzb(r5)
        L79:
            com.google.android.gms.internal.ads.zzgg r11 = new com.google.android.gms.internal.ads.zzgg
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgr.zzm(com.google.android.gms.internal.ads.zzgy, boolean, int, com.google.android.gms.internal.ads.zzgg):com.google.android.gms.internal.ads.zzgg");
    }

    private static int zzn(int i5, int i10, int i11, int i12) {
        int i13 = 2;
        if (i10 != 1 && i10 != 2) {
            i13 = 1;
        }
        return i5 - ((i11 + i12) * i13);
    }

    private static int zzo(int i5, int i10, int i11, int i12) {
        return i5 - ((i11 + i12) * (i10 == 1 ? 2 : 1));
    }

    private static void zzp(zzgy zzgyVar) {
        int iZzg = zzgyVar.zzg() + 1;
        zzgyVar.zzb(8);
        for (int i5 = 0; i5 < iZzg; i5++) {
            zzgyVar.zzg();
            zzgyVar.zzg();
            zzgyVar.zza();
        }
        zzgyVar.zzb(20);
    }

    private static String zzq(zzv zzvVar) {
        String str;
        String str2 = zzvVar.zzp;
        if (Objects.equals(str2, "video/dolby-vision") && (str = zzvVar.zzk) != null) {
            if (str.startsWith("dva1") || str.startsWith("dvav")) {
                return MimeTypes.VIDEO_H264;
            }
            if (str.startsWith("dvh1") || str.startsWith("dvhe")) {
                return MimeTypes.VIDEO_H265;
            }
        }
        return str2;
    }
}
