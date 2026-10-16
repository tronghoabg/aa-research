package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import Va.M6;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzalo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfm.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i5) {
        return (i5 >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
    
        r13 = r41;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0cc7  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0cc9  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0e56  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0e5c  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List zzb(com.google.android.gms.internal.ads.zzfz r85, com.google.android.gms.internal.ads.zzagt r86, long r87, com.google.android.gms.internal.ads.zzq r89, boolean r90, boolean r91, com.google.android.gms.internal.ads.zzgti r92, boolean r93) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 3900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzb(com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzagt, long, com.google.android.gms.internal.ads.zzq, boolean, boolean, com.google.android.gms.internal.ads.zzgti, boolean):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzap zzc(com.google.android.gms.internal.ads.zzga r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzc(com.google.android.gms.internal.ads.zzga):com.google.android.gms.internal.ads.zzap");
    }

    public static zzgd zzd(zzeu zzeuVar) {
        long jZzD;
        long jZzD2;
        zzeuVar.zzh(8);
        if (zza(zzeuVar.zzB()) == 0) {
            jZzD = zzeuVar.zzz();
            jZzD2 = zzeuVar.zzz();
        } else {
            jZzD = zzeuVar.zzD();
            jZzD2 = zzeuVar.zzD();
        }
        return new zzgd(jZzD, jZzD2, zzeuVar.zzz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        r8 = r12.zzB();
        r10 = r12.zzB();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.zzm(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzfx(r6, r11, r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        cb.AbstractC1593a.C(r6, "Failed to parse metadata entry with key: ", "MetadataUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzap zze(com.google.android.gms.internal.ads.zzfz r12) {
        /*
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzga r0 = r12.zzc(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            com.google.android.gms.internal.ads.zzga r1 = r12.zzc(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            com.google.android.gms.internal.ads.zzga r12 = r12.zzc(r2)
            r2 = 0
            if (r0 == 0) goto Ld8
            if (r1 == 0) goto Ld8
            if (r12 == 0) goto Ld8
            com.google.android.gms.internal.ads.zzeu r0 = r0.zza
            int r0 = zzj(r0)
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L29
            goto Ld8
        L29:
            com.google.android.gms.internal.ads.zzeu r0 = r1.zza
            r1 = 12
            r0.zzh(r1)
            int r1 = r0.zzB()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r5 = r4
        L38:
            if (r5 >= r1) goto L4f
            int r6 = r0.zzB()
            r7 = 4
            r0.zzk(r7)
            int r6 = r6 + (-8)
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r0.zzK(r6, r7)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L38
        L4f:
            com.google.android.gms.internal.ads.zzeu r12 = r12.zza
            r0 = 8
            r12.zzh(r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L5b:
            int r6 = r12.zzd()
            if (r6 <= r0) goto Lcc
            int r6 = r12.zzg()
            int r7 = r12.zzB()
            int r7 = r7 + r6
            int r6 = r12.zzB()
            int r6 = r6 + (-1)
            if (r6 < 0) goto Lb2
            if (r6 >= r1) goto Lb2
            r6 = r3[r6]
        L76:
            int r8 = r12.zzg()
            if (r8 >= r7) goto La5
            int r9 = r12.zzB()
            int r10 = r12.zzB()
            r11 = 1684108385(0x64617461, float:1.6635614E22)
            if (r10 != r11) goto La7
            int r8 = r12.zzB()
            int r10 = r12.zzB()
            int r9 = r9 + (-16)
            byte[] r11 = new byte[r9]
            r12.zzm(r11, r4, r9)
            com.google.android.gms.internal.ads.zzfx r9 = new com.google.android.gms.internal.ads.zzfx     // Catch: java.lang.Exception -> L9e
            r9.<init>(r6, r11, r10, r8)     // Catch: java.lang.Exception -> L9e
            goto Lac
        L9e:
            java.lang.String r8 = "MetadataUtil"
            java.lang.String r9 = "Failed to parse metadata entry with key: "
            cb.AbstractC1593a.C(r6, r9, r8)
        La5:
            r9 = r2
            goto Lac
        La7:
            int r8 = r8 + r9
            r12.zzh(r8)
            goto L76
        Lac:
            if (r9 == 0) goto Lc8
            r5.add(r9)
            goto Lc8
        Lb2:
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 41
            r9.<init>(r8)
            java.lang.String r8 = "Skipped metadata with unknown key index: "
            java.lang.String r10 = "BoxParsers"
            cb.AbstractC1593a.v(r9, r8, r6, r10)
        Lc8:
            r12.zzh(r7)
            goto L5b
        Lcc:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto Ld8
            com.google.android.gms.internal.ads.zzap r12 = new com.google.android.gms.internal.ads.zzap
            r12.<init>(r5)
            return r12
        Ld8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zze(com.google.android.gms.internal.ads.zzfz):com.google.android.gms.internal.ads.zzap");
    }

    public static void zzf(zzeu zzeuVar) {
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(4);
        if (zzeuVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzeuVar.zzh(iZzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Type inference failed for: r15v8, types: [int[]] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r26v8 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzams zzg(com.google.android.gms.internal.ads.zzamp r44, com.google.android.gms.internal.ads.zzfz r45, com.google.android.gms.internal.ads.zzagt r46, boolean r47) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzg(com.google.android.gms.internal.ads.zzamp, com.google.android.gms.internal.ads.zzfz, com.google.android.gms.internal.ads.zzagt, boolean):com.google.android.gms.internal.ads.zzams");
    }

    public static zzap zzh(zzeu zzeuVar) {
        try {
            zzeuVar.zzk(5);
            int iZzB = zzeuVar.zzB();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < iZzB; i5++) {
                long jZzD = zzeuVar.zzD() / 10000;
                if (jZzD < 0) {
                    jZzD = -9223372036854775807L;
                }
                String strZzK = zzeuVar.zzK(zzeuVar.zzs(), StandardCharsets.UTF_8);
                zzaiy zzaiyVar = new zzaiy();
                zzaiyVar.zza(jZzD);
                zzaiyVar.zzd(new zzx(null, strZzK));
                arrayList.add(zzaiyVar.zze());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zzap(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static zzap zzi(zzeu zzeuVar) {
        short sZzv = zzeuVar.zzv();
        zzeuVar.zzk(2);
        String strZzK = zzeuVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzgc(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(zzeu zzeuVar) {
        zzeuVar.zzh(16);
        return zzeuVar.zzB();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r9 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzalh zzk(com.google.android.gms.internal.ads.zzeu r13) {
        /*
            r0 = 3
            r1 = 0
            r2 = 1
            r3 = 8
            r13.zzh(r3)
            int r4 = r13.zzB()
            int r4 = zza(r4)
            if (r4 != 0) goto L14
            r5 = r3
            goto L16
        L14:
            r5 = 16
        L16:
            r13.zzk(r5)
            long r7 = r13.zzz()
            int r5 = r13.zzg()
            r6 = r1
        L22:
            if (r4 != 0) goto L26
            r9 = 4
            goto L27
        L26:
            r9 = r3
        L27:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 >= r9) goto L5c
            byte[] r9 = r13.zzi()
            int r12 = r5 + r6
            r9 = r9[r12]
            r12 = -1
            if (r9 == r12) goto L5a
            if (r4 != 0) goto L40
            long r3 = r13.zzz()
            goto L44
        L40:
            long r3 = r13.zzJ()
        L44:
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L4c
        L4a:
            r9 = r10
            goto L60
        L4c:
            r10 = r7
            r8 = 1000000(0xf4240, double:4.940656E-318)
            java.math.RoundingMode r12 = java.math.RoundingMode.DOWN
            r6 = r3
            long r3 = com.google.android.gms.internal.ads.zzfm.zzw(r6, r8, r10, r12)
            r7 = r10
            r9 = r3
            goto L60
        L5a:
            int r6 = r6 + r2
            goto L22
        L5c:
            r13.zzk(r9)
            goto L4a
        L60:
            int r13 = r13.zzt()
            int r3 = r13 >> 10
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            int r4 = r13 >> 5
            r4 = r4 & 31
            int r4 = r4 + 96
            char r4 = (char) r4
            r13 = r13 & 31
            int r13 = r13 + 96
            char r13 = (char) r13
            char[] r5 = new char[r0]
            r5[r1] = r3
            r5[r2] = r4
            r3 = 2
            r5[r3] = r13
        L80:
            if (r1 >= r0) goto L91
            char r13 = r5[r1]
            r3 = 97
            r4 = 0
            if (r13 < r3) goto L8d
            r3 = 122(0x7a, float:1.71E-43)
            if (r13 <= r3) goto L8f
        L8d:
            r11 = r4
            goto L97
        L8f:
            int r1 = r1 + r2
            goto L80
        L91:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
            goto L8d
        L97:
            com.google.android.gms.internal.ads.zzalh r6 = new com.google.android.gms.internal.ads.zzalh
            r6.<init>(r7, r9, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzk(com.google.android.gms.internal.ads.zzeu):com.google.android.gms.internal.ads.zzalh");
    }

    private static String zzl(byte[] bArr, int i5, int i10) {
        zzgtr.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i11 = 0; i11 < bArr.length - 3; i11 += 4) {
            int iZze = zzhaq.zze(bArr[i11], bArr[i11 + 1], bArr[i11 + 2], bArr[i11 + 3]);
            String str = zzfm.zza;
            int i12 = ((iZze >> 8) & 255) - 128;
            int i13 = (iZze >> 16) & 255;
            int i14 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(((i14 * 17790) / 10000) + i13, 255)) | (Math.max(0, Math.min(((i12 * 14075) / 10000) + i13, 255)) << 16) | (Math.max(0, Math.min((i13 - ((i14 * 3455) / 10000)) - ((i12 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgtl.zzd(arrayList, ", ");
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(AbstractC0279p0.g(String.valueOf(i5).length() + 7, 10, String.valueOf(i10)), 1, strZzd));
        sb2.append("size: ");
        sb2.append(i5);
        sb2.append("x");
        sb2.append(i10);
        return M6.t(sb2, "\npalette: ", strZzd, "\n");
    }

    private static zzi zzm(zzeu zzeuVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzeuVar.zzi();
        zzet zzetVar = new zzet(bArrZzi, bArrZzi.length);
        zzetVar.zzf(zzeuVar.zzg() * 8);
        zzetVar.zzo(1);
        int iZzj = zzetVar.zzj(8);
        for (int i5 = 0; i5 < iZzj; i5++) {
            zzetVar.zzo(1);
            int iZzj2 = zzetVar.zzj(8);
            for (int i10 = 0; i10 < iZzj2; i10++) {
                zzetVar.zzh(6);
                boolean zZzi = zzetVar.zzi();
                zzetVar.zzg();
                zzetVar.zzo(11);
                zzetVar.zzh(4);
                int iZzj3 = zzetVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzetVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzetVar.zzj(8);
                    int iZzj5 = zzetVar.zzj(8);
                    zzetVar.zzo(1);
                    boolean zZzi2 = zzetVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzo(zzfz zzfzVar) {
        zzga zzgaVarZzc = zzfzVar.zzc(1701606260);
        if (zzgaVarZzc == null) {
            return null;
        }
        zzeu zzeuVar = zzgaVarZzc.zza;
        zzeuVar.zzh(8);
        int iZza = zza(zzeuVar.zzB());
        int iZzH = zzeuVar.zzH();
        zzhan zzhanVarZza = zzhao.zza(iZzH);
        zzhan zzhanVarZza2 = zzhao.zza(iZzH);
        for (int i5 = 0; i5 < iZzH; i5++) {
            zzhanVarZza.zza(iZza == 1 ? zzeuVar.zzJ() : zzeuVar.zzz());
            zzhanVarZza2.zza(iZza == 1 ? zzeuVar.zzD() : zzeuVar.zzB());
            if (zzeuVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzeuVar.zzk(2);
        }
        return Pair.create(zzhanVarZza.zzb(), zzhanVarZza2.zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzp(com.google.android.gms.internal.ads.zzeu r38, int r39, int r40, int r41, int r42, java.lang.String r43, boolean r44, com.google.android.gms.internal.ads.zzq r45, com.google.android.gms.internal.ads.zzalk r46, int r47) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 1788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzp(com.google.android.gms.internal.ads.zzeu, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzq, com.google.android.gms.internal.ads.zzalk, int):void");
    }

    private static zzalf zzq(zzeu zzeuVar, int i5) {
        zzeuVar.zzh(i5 + 12);
        zzeuVar.zzk(1);
        zzt(zzeuVar);
        zzeuVar.zzk(2);
        int iZzs = zzeuVar.zzs();
        if ((iZzs & 128) != 0) {
            zzeuVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzeuVar.zzk(zzeuVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzeuVar.zzk(2);
        }
        zzeuVar.zzk(1);
        zzt(zzeuVar);
        String strZze = zzas.zze(zzeuVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzalf(strZze, null, -1L, -1L);
        }
        zzeuVar.zzk(4);
        long jZzz = zzeuVar.zzz();
        long jZzz2 = zzeuVar.zzz();
        zzeuVar.zzk(1);
        int iZzt = zzt(zzeuVar);
        long j8 = jZzz2;
        byte[] bArr = new byte[iZzt];
        zzeuVar.zzm(bArr, 0, iZzt);
        if (j8 <= 0) {
            j8 = -1;
        }
        return new zzalf(strZze, bArr, j8, jZzz > 0 ? jZzz : -1L);
    }

    private static zzald zzr(zzeu zzeuVar, int i5) {
        zzeuVar.zzh(i5 + 8);
        zzeuVar.zzk(4);
        return new zzald(zzeuVar.zzz(), zzeuVar.zzz());
    }

    private static Pair zzs(zzeu zzeuVar, int i5, int i10) throws zzat {
        Integer num;
        zzamq zzamqVar;
        Pair pairCreate;
        int i11;
        int i12;
        Integer num2;
        boolean z2;
        int iZzg = zzeuVar.zzg();
        while (iZzg - i5 < i10) {
            zzeuVar.zzh(iZzg);
            int iZzB = zzeuVar.zzB();
            zzage.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzeuVar.zzB() == 1936289382) {
                int i13 = iZzg + 8;
                int i14 = 0;
                int i15 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i13 - iZzg < iZzB) {
                    zzeuVar.zzh(i13);
                    int iZzB2 = zzeuVar.zzB();
                    int iZzB3 = zzeuVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzeuVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzeuVar.zzk(4);
                        strZzK = zzeuVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i15 = i13;
                        i14 = iZzB2;
                    }
                    i13 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzage.zza(numValueOf != null, "frma atom is mandatory");
                    zzage.zza(i15 != -1, "schi atom is mandatory");
                    int i16 = i15 + 8;
                    while (true) {
                        if (i16 - i15 >= i14) {
                            num = numValueOf;
                            zzamqVar = null;
                            break;
                        }
                        zzeuVar.zzh(i16);
                        int iZzB4 = zzeuVar.zzB();
                        if (zzeuVar.zzB() == 1952804451) {
                            int iZza = zza(zzeuVar.zzB());
                            zzeuVar.zzk(1);
                            if (iZza == 0) {
                                zzeuVar.zzk(1);
                                i12 = 0;
                                i11 = 0;
                            } else {
                                int iZzs = zzeuVar.zzs();
                                i11 = iZzs & 15;
                                i12 = (iZzs & 240) >> 4;
                            }
                            if (zzeuVar.zzs() == 1) {
                                num2 = numValueOf;
                                z2 = true;
                            } else {
                                num2 = numValueOf;
                                z2 = false;
                            }
                            int iZzs2 = zzeuVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.zzm(bArr2, 0, 16);
                            if (z2 && iZzs2 == 0) {
                                int iZzs3 = zzeuVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzeuVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzamqVar = new zzamq(z2, strZzK, iZzs2, bArr2, i12, i11, bArr);
                        } else {
                            i16 += iZzB4;
                        }
                    }
                    zzage.zza(zzamqVar != null, "tenc atom is mandatory");
                    String str = zzfm.zza;
                    pairCreate = Pair.create(num, zzamqVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzt(zzeu zzeuVar) {
        int iZzs = zzeuVar.zzs();
        int i5 = iZzs & 127;
        while ((iZzs & 128) == 128) {
            iZzs = zzeuVar.zzs();
            i5 = (i5 << 7) | (iZzs & 127);
        }
        return i5;
    }
}
