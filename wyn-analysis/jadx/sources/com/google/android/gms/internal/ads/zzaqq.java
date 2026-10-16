package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import com.applovin.shadow.okio.Segment;

/* loaded from: classes3.dex */
final class zzaqq {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(com.google.android.gms.internal.ads.zzet r18, com.google.android.gms.internal.ads.zzaqo r19) throws com.google.android.gms.internal.ads.zzat {
        /*
            r0 = r18
            r1 = r19
            r0.zze()
            r2 = 3
            r3 = 8
            int r2 = zzf(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc1
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzgtr.zza(r6)
            int r6 = r0.zzc()
            r10 = -1
            if (r6 >= r2) goto L34
        L32:
            r12 = r10
            goto L5f
        L34:
            long r12 = r0.zzk(r2)
            r14 = 3
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L5f
            int r6 = r0.zzc()
            if (r6 >= r3) goto L45
            goto L32
        L45:
            long r12 = r0.zzk(r3)
            long r14 = r14 + r12
            r16 = 255(0xff, double:1.26E-321)
            int r3 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r3 != 0) goto L5e
            int r3 = r0.zzc()
            if (r3 >= r7) goto L57
            goto L32
        L57:
            long r6 = r0.zzk(r7)
            long r12 = r6 + r14
            goto L5f
        L5e:
            r12 = r14
        L5f:
            r1.zzb = r12
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 != 0) goto L66
            return r4
        L66:
            r6 = 16
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 > 0) goto La1
            r6 = 0
            int r3 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r3 != 0) goto L93
            int r3 = r1.zza
            r6 = 0
            if (r3 == r9) goto L8c
            if (r3 == r2) goto L85
            r2 = 17
            if (r3 == r2) goto L7e
            goto L93
        L7e:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L85:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L8c:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzb(r0, r6)
            throw r0
        L93:
            r2 = 11
            r3 = 24
            int r0 = zzf(r0, r2, r3, r3)
            r1.zzc = r0
            if (r0 == r5) goto La0
            return r9
        La0:
            return r4
        La1:
            java.lang.String r0 = java.lang.String.valueOf(r12)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 49
            r1.<init>(r0)
            java.lang.String r0 = "Contains sub-stream with an invalid packet label "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzat r0 = com.google.android.gms.internal.ads.zzat.zzc(r0)
            throw r0
        Lc1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqq.zza(com.google.android.gms.internal.ads.zzet, com.google.android.gms.internal.ads.zzaqo):boolean");
    }

    public static zzaqp zzb(zzet zzetVar) throws zzat {
        int iZzj;
        int i5;
        char c10;
        int i10;
        int i11;
        int iZzj2;
        char c11;
        int iZzj3 = zzetVar.zzj(8);
        int i12 = 5;
        int iZzj4 = zzetVar.zzj(5);
        if (iZzj4 != 31) {
            switch (iZzj4) {
                case 0:
                    iZzj = 96000;
                    break;
                case 1:
                    iZzj = 88200;
                    break;
                case 2:
                    iZzj = 64000;
                    break;
                case 3:
                    iZzj = 48000;
                    break;
                case 4:
                    iZzj = 44100;
                    break;
                case 5:
                    iZzj = 32000;
                    break;
                case 6:
                    iZzj = 24000;
                    break;
                case 7:
                    iZzj = 22050;
                    break;
                case 8:
                    iZzj = 16000;
                    break;
                case 9:
                    iZzj = 12000;
                    break;
                case 10:
                    iZzj = 11025;
                    break;
                case 11:
                    iZzj = 8000;
                    break;
                case 12:
                    iZzj = 7350;
                    break;
                case 13:
                case 14:
                default:
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj4).length() + 32);
                    sb2.append("Unsupported sampling rate index ");
                    sb2.append(iZzj4);
                    throw zzat.zzc(sb2.toString());
                case 15:
                    iZzj = 57600;
                    break;
                case 16:
                    iZzj = 51200;
                    break;
                case 17:
                    iZzj = 40000;
                    break;
                case 18:
                    iZzj = 38400;
                    break;
                case 19:
                    iZzj = 34150;
                    break;
                case 20:
                    iZzj = 28800;
                    break;
                case 21:
                    iZzj = 25600;
                    break;
                case 22:
                    iZzj = 20000;
                    break;
                case 23:
                    iZzj = 19200;
                    break;
                case 24:
                    iZzj = 17075;
                    break;
                case 25:
                    iZzj = 14400;
                    break;
                case 26:
                    iZzj = 12800;
                    break;
                case 27:
                    iZzj = 9600;
                    break;
            }
        } else {
            iZzj = zzetVar.zzj(24);
        }
        int iZzj5 = zzetVar.zzj(3);
        int i13 = 1;
        if (iZzj5 == 0) {
            i5 = 768;
        } else if (iZzj5 == 1) {
            i5 = Segment.SHARE_MINIMUM;
        } else if (iZzj5 == 2 || iZzj5 == 3) {
            i5 = 2048;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb3 = new StringBuilder(AbstractC0279p0.f(iZzj5, 36));
                sb3.append("Unsupported coreSbrFrameLengthIndex ");
                sb3.append(iZzj5);
                throw zzat.zzc(sb3.toString());
            }
            i5 = 4096;
        }
        if (iZzj5 == 0 || iZzj5 == 1) {
            c10 = 0;
        } else if (iZzj5 == 2) {
            c10 = 2;
        } else if (iZzj5 == 3) {
            c10 = 3;
        } else {
            if (iZzj5 != 4) {
                StringBuilder sb4 = new StringBuilder(AbstractC0279p0.f(iZzj5, 36));
                sb4.append("Unsupported coreSbrFrameLengthIndex ");
                sb4.append(iZzj5);
                throw zzat.zzc(sb4.toString());
            }
            c10 = 1;
        }
        zzetVar.zzh(2);
        zzc(zzetVar);
        int iZzj6 = zzetVar.zzj(5);
        int i14 = 0;
        int iZzf = 0;
        while (true) {
            int i15 = 16;
            if (i14 < iZzj6 + 1) {
                int iZzj7 = zzetVar.zzj(3);
                iZzf += zzf(zzetVar, 5, 8, 16) + 1;
                if ((iZzj7 == 0 || iZzj7 == 2) && zzetVar.zzi()) {
                    zzc(zzetVar);
                }
                i14++;
            } else {
                int iZzf2 = zzf(zzetVar, 4, 8, 16) + 1;
                zzetVar.zzg();
                int i16 = 0;
                while (true) {
                    double d3 = 2.0d;
                    if (i16 >= iZzf2) {
                        int i17 = iZzj3;
                        byte[] bArr = null;
                        if (zzetVar.zzi()) {
                            int iZzf3 = zzf(zzetVar, 2, 4, 8) + 1;
                            for (int i18 = 0; i18 < iZzf3; i18++) {
                                int iZzf4 = zzf(zzetVar, 4, 8, 16);
                                int iZzf5 = zzf(zzetVar, 4, 8, 16);
                                if (iZzf4 == 7) {
                                    int iZzj8 = zzetVar.zzj(4) + 1;
                                    zzetVar.zzh(4);
                                    byte[] bArr2 = new byte[iZzj8];
                                    for (int i19 = 0; i19 < iZzj8; i19++) {
                                        bArr2[i19] = (byte) zzetVar.zzj(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzetVar.zzh(iZzf5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (iZzj) {
                            case 14700:
                            case 16000:
                                d3 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d3 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d3 = 1.0d;
                                break;
                            default:
                                StringBuilder sb5 = new StringBuilder(String.valueOf(iZzj).length() + 26);
                                sb5.append("Unsupported sampling rate ");
                                sb5.append(iZzj);
                                throw zzat.zzc(sb5.toString());
                        }
                        return new zzaqp(i17, (int) (iZzj * d3), (int) (i5 * d3), bArr3, null);
                    }
                    int iZzj9 = zzetVar.zzj(2);
                    if (iZzj9 == 0) {
                        i10 = iZzj3;
                        i11 = i13;
                        zzd(zzetVar);
                        if (c10 > 0) {
                            zze(zzetVar);
                        }
                    } else if (iZzj9 == i13) {
                        i11 = i13;
                        if (zzd(zzetVar)) {
                            zzetVar.zzg();
                        }
                        if (c10 > 0) {
                            zze(zzetVar);
                            iZzj2 = zzetVar.zzj(2);
                            c11 = c10;
                        } else {
                            iZzj2 = 0;
                            c11 = 0;
                        }
                        if (iZzj2 > 0) {
                            zzetVar.zzh(6);
                            int iZzj10 = zzetVar.zzj(2);
                            zzetVar.zzh(4);
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(i12);
                            }
                            if (iZzj2 == 2 || iZzj2 == 3) {
                                zzetVar.zzh(6);
                            }
                            if (iZzj10 == 2) {
                                zzetVar.zzg();
                            }
                        }
                        i10 = iZzj3;
                        int iFloor = ((int) Math.floor(Math.log(iZzf - 1) / Math.log(2.0d))) + 1;
                        int iZzj11 = zzetVar.zzj(2);
                        if (iZzj11 > 0 && zzetVar.zzi()) {
                            zzetVar.zzh(iFloor);
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzh(iFloor);
                        }
                        if (c11 == 0 && iZzj11 == 0) {
                            zzetVar.zzg();
                        }
                    } else if (iZzj9 != 3) {
                        i10 = iZzj3;
                        i11 = i13;
                    } else {
                        zzf(zzetVar, 4, 8, i15);
                        int iZzf6 = zzf(zzetVar, 4, 8, i15);
                        i11 = i13;
                        if (zzetVar.zzi()) {
                            zzf(zzetVar, 8, i15, 0);
                        }
                        zzetVar.zzg();
                        if (iZzf6 > 0) {
                            zzetVar.zzh(iZzf6 * 8);
                        }
                        i10 = iZzj3;
                    }
                    i16++;
                    iZzj3 = i10;
                    i13 = i11;
                    i12 = 5;
                    i15 = 16;
                }
            }
        }
    }

    private static void zzc(zzet zzetVar) {
        int iZzj;
        int iZzj2 = zzetVar.zzj(2);
        if (iZzj2 == 0) {
            zzetVar.zzh(6);
            return;
        }
        int iZzf = zzf(zzetVar, 5, 8, 16) + 1;
        if (iZzj2 == 1) {
            zzetVar.zzh(iZzf * 7);
            return;
        }
        if (iZzj2 == 2) {
            boolean zZzi = zzetVar.zzi();
            int i5 = true != zZzi ? 5 : 1;
            int i10 = true == zZzi ? 7 : 5;
            int i11 = true == zZzi ? 8 : 6;
            int i12 = 0;
            while (i12 < iZzf) {
                if (zzetVar.zzi()) {
                    zzetVar.zzh(7);
                    iZzj = 0;
                } else {
                    if (zzetVar.zzj(2) == 3 && zzetVar.zzj(i10) * i5 != 0) {
                        zzetVar.zzg();
                    }
                    iZzj = zzetVar.zzj(i11) * i5;
                    if (iZzj != 0 && iZzj != 180) {
                        zzetVar.zzg();
                    }
                    zzetVar.zzg();
                }
                if (iZzj != 0 && iZzj != 180 && zzetVar.zzi()) {
                    i12++;
                }
                i12++;
            }
        }
    }

    private static boolean zzd(zzet zzetVar) {
        zzetVar.zzh(3);
        boolean zZzi = zzetVar.zzi();
        if (zZzi) {
            zzetVar.zzh(13);
        }
        return zZzi;
    }

    private static void zze(zzet zzetVar) {
        zzetVar.zzh(3);
        zzetVar.zzh(8);
        boolean zZzi = zzetVar.zzi();
        boolean zZzi2 = zzetVar.zzi();
        if (zZzi) {
            zzetVar.zzh(5);
        }
        if (zZzi2) {
            zzetVar.zzh(6);
        }
    }

    private static int zzf(zzet zzetVar, int i5, int i10, int i11) {
        zzgtr.zza(Math.max(Math.max(i5, i10), i11) <= 31);
        int i12 = (1 << i5) - 1;
        int i13 = (1 << i10) - 1;
        long j8 = i12 + i13;
        long j10 = (int) j8;
        if (j8 != j10) {
            throw new ArithmeticException();
        }
        if (j10 + (1 << i11) != ((int) r6)) {
            throw new ArithmeticException();
        }
        if (zzetVar.zzc() < i5) {
            return -1;
        }
        int iZzj = zzetVar.zzj(i5);
        if (iZzj == i12) {
            if (zzetVar.zzc() < i10) {
                return -1;
            }
            int iZzj2 = zzetVar.zzj(i10);
            iZzj += iZzj2;
            if (iZzj2 == i13) {
                if (zzetVar.zzc() < i11) {
                    return -1;
                }
                return zzetVar.zzj(i11) + iZzj;
            }
        }
        return iZzj;
    }
}
