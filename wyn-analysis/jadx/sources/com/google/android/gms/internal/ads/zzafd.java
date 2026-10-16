package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzafd {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:143:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a6 A[PHI: r2 r5 r11
  0x02a6: PHI (r2v2 int) = (r2v1 int), (r2v11 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x02a6: PHI (r5v2 int) = (r5v1 int), (r5v35 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]
  0x02a6: PHI (r11v3 int) = (r11v2 int), (r11v35 int) binds: [B:172:0x02a8, B:165:0x027e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0398  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzv zza(com.google.android.gms.internal.ads.zzeu r22, java.lang.String r23, java.lang.String r24, com.google.android.gms.internal.ads.zzq r25) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zza(com.google.android.gms.internal.ads.zzeu, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzq):com.google.android.gms.internal.ads.zzv");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzafc zzb(com.google.android.gms.internal.ads.zzet r11) {
        /*
            r0 = 16
            int r1 = r11.zzj(r0)
            int r0 = r11.zzj(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.zzj(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.zzj(r0)
            r2 = 0
            r4 = 3
            if (r1 != r4) goto L39
            r1 = r2
        L2c:
            int r5 = r11.zzj(r0)
            int r5 = r5 + r1
            boolean r1 = r11.zzi()
            if (r1 != 0) goto L3b
            int r1 = r5 + 3
        L39:
            r5 = r1
            goto L40
        L3b:
            int r5 = r5 + 1
            int r1 = r5 << 2
            goto L2c
        L40:
            r1 = 10
            int r1 = r11.zzj(r1)
            boolean r6 = r11.zzi()
            if (r6 == 0) goto L55
            int r6 = r11.zzj(r4)
            if (r6 <= 0) goto L55
            r11.zzh(r0)
        L55:
            boolean r6 = r11.zzi()
            r7 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            r10 = 1
            if (r10 == r6) goto L65
            r6 = r7
            r7 = r9
            goto L66
        L65:
            r6 = r7
        L66:
            int r11 = r11.zzj(r3)
            if (r7 != r9) goto L76
            r9 = 13
            if (r11 != r9) goto L76
            int[] r11 = com.google.android.gms.internal.ads.zzafd.zzb
            r2 = r11[r9]
        L74:
            r9 = r2
            goto La2
        L76:
            if (r7 != r6) goto L74
            r6 = 14
            if (r11 >= r6) goto L74
            int[] r2 = com.google.android.gms.internal.ads.zzafd.zzb
            r2 = r2[r11]
            int r1 = r1 % 5
            r6 = 8
            if (r1 == r10) goto L9d
            r9 = 11
            if (r1 == r0) goto L98
            if (r1 == r4) goto L9d
            if (r1 == r3) goto L8f
            goto L74
        L8f:
            if (r11 == r4) goto L95
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
        L95:
            int r2 = r2 + 1
            goto L74
        L98:
            if (r11 == r6) goto L95
            if (r11 != r9) goto L74
            goto L95
        L9d:
            if (r11 == r4) goto L95
            if (r11 != r6) goto L74
            goto L95
        La2:
            com.google.android.gms.internal.ads.zzafc r4 = new com.google.android.gms.internal.ads.zzafc
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zzb(com.google.android.gms.internal.ads.zzet):com.google.android.gms.internal.ads.zzafc");
    }

    public static void zzc(int i5, zzeu zzeuVar) {
        zzeuVar.zza(7);
        byte[] bArrZzi = zzeuVar.zzi();
        bArrZzi[0] = -84;
        bArrZzi[1] = 64;
        bArrZzi[2] = -1;
        bArrZzi[3] = -1;
        bArrZzi[4] = (byte) ((i5 >> 16) & 255);
        bArrZzi[5] = (byte) ((i5 >> 8) & 255);
        bArrZzi[6] = (byte) (i5 & 255);
    }

    private static void zzd(zzet zzetVar, zzafb zzafbVar) throws zzat {
        int iZzj = zzetVar.zzj(5);
        zzetVar.zzh(2);
        if (zzetVar.zzi()) {
            zzetVar.zzh(5);
        }
        if (iZzj >= 7 && iZzj <= 10) {
            zzetVar.zzg();
        }
        if (zzetVar.zzi()) {
            int iZzj2 = zzetVar.zzj(3);
            if (zzafbVar.zzb == -1 && iZzj >= 0 && iZzj <= 15 && (iZzj2 == 0 || iZzj2 == 1)) {
                zzafbVar.zzb = iZzj;
            }
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zze(zzet zzetVar, zzafb zzafbVar) throws zzat {
        zzetVar.zzh(2);
        boolean zZzi = zzetVar.zzi();
        int iZzj = zzetVar.zzj(8);
        for (int i5 = 0; i5 < iZzj; i5++) {
            zzetVar.zzh(2);
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
            }
            if (zZzi) {
                zzetVar.zzh(24);
            } else {
                if (zzetVar.zzi()) {
                    if (!zzetVar.zzi()) {
                        zzetVar.zzh(4);
                    }
                    zzafbVar.zzc = zzetVar.zzj(6) + 1;
                }
                zzetVar.zzh(4);
            }
        }
        if (zzetVar.zzi()) {
            zzetVar.zzh(3);
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zzf(zzet zzetVar) throws zzat {
        int iZzj = zzetVar.zzj(6);
        if (iZzj < 2 || iZzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iZzj)));
        }
        zzetVar.zzh(iZzj * 8);
    }

    private static boolean zzg(zzet zzetVar) {
        if (zzetVar.zzc() < 66) {
            return false;
        }
        zzetVar.zzh(66);
        return true;
    }
}
