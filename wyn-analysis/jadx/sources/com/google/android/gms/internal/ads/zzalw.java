package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzalw implements zzaga {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalv zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzagd zzI;
    private zzahm[] zzJ;
    private zzahm[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final zzanq zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzeu zzg;
    private final zzeu zzh;
    private final zzeu zzi;
    private final byte[] zzj;
    private final zzeu zzk;
    private final zzajf zzl;
    private final zzeu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzhb zzp;
    private final zzafp zzq;
    private zzgwt zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzeu zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        zzt zztVar = new zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzP();
    }

    @Deprecated
    public zzalw() {
        this(zzanq.zza, 32, null, null, zzgwt.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x07ed, code lost:
    
        zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x07f0, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(long r59) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 2033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalw.zzj(long):void");
    }

    private static int zzk(int i5) throws zzat {
        if (i5 >= 0) {
            return i5;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 27);
        sb2.append("Unexpected negative value: ");
        sb2.append(i5);
        throw zzat.zzb(sb2.toString(), null);
    }

    private static void zzl(zzeu zzeuVar, int i5, zzamr zzamrVar) throws zzat {
        zzeuVar.zzh(i5 + 8);
        int iZzB = zzeuVar.zzB();
        int i10 = zzalo.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z2 = (iZzB & 2) != 0;
        int iZzH = zzeuVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzamrVar.zzl, 0, zzamrVar.zze, false);
            return;
        }
        int i11 = zzamrVar.zze;
        if (iZzH != i11) {
            throw zzat.zzb(com.google.android.gms.internal.consent_sdk.a.u(iZzH, i11, "Senc sample count ", " is different from fragment sample count", new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i11).length())), null);
        }
        Arrays.fill(zzamrVar.zzl, 0, iZzH, z2);
        zzamrVar.zza(zzeuVar.zzd());
        zzeu zzeuVar2 = zzamrVar.zzn;
        zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar2.zze());
        zzeuVar2.zzh(0);
        zzamrVar.zzo = false;
    }

    private static Pair zzm(zzeu zzeuVar, long j8) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzh(8);
        int iZza = zzalo.zza(zzeuVar2.zzB());
        zzeuVar2.zzk(4);
        long jZzz = zzeuVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzeuVar2.zzz();
            jZzJ2 = zzeuVar2.zzz();
        } else {
            jZzJ = zzeuVar2.zzJ();
            jZzJ2 = zzeuVar2.zzJ();
        }
        long j10 = jZzJ2 + j8;
        long jZzw = zzfm.zzw(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzeuVar2.zzk(2);
        int iZzt = zzeuVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j11 = j10;
        long j12 = jZzw;
        int i5 = 0;
        while (i5 < iZzt) {
            int iZzB = zzeuVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzeuVar2.zzz();
            iArr[i5] = iZzB & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            jArr[i5] = j11;
            jArr3[i5] = j12;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzw2 = zzfm.zzw(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i5] = jZzw2 - jArr5[i5];
            zzeuVar2.zzk(4);
            j11 += iArr[i5];
            i5++;
            zzeuVar2 = zzeuVar;
            iZzt = iZzt;
            j12 = jZzw2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzw), new zzafo(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.zzq zzn(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalw.zzn(java.util.List):com.google.android.gms.internal.ads.zzq");
    }

    private final void zzo(zzahd zzahdVar, zzaha zzahaVar) {
        this.zzI.zzw(zzahdVar);
        this.zzL = true;
        zzahaVar.zza = this.zzO;
        zzi();
    }

    private static final zzalp zzp(SparseArray sparseArray, int i5) {
        if (sparseArray.size() == 1) {
            return (zzalp) sparseArray.valueAt(0);
        }
        zzalp zzalpVar = (zzalp) sparseArray.get(i5);
        zzalpVar.getClass();
        return zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzahh zzahhVarZza = zzamn.zza(zzagbVar);
        this.zzr = zzahhVarZza != null ? zzgwt.zzj(zzahhVarZza) : zzgwt.zzi();
        return zzahhVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        int i5;
        int i10 = this.zzd;
        if ((i10 & 32) == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzc);
        }
        this.zzI = zzagdVar;
        zzi();
        zzahm[] zzahmVarArr = new zzahm[2];
        this.zzJ = zzahmVarArr;
        int i11 = 100;
        int i12 = 0;
        if ((i10 & 4) != 0) {
            zzahmVarArr[0] = this.zzI.zzs(100, 5);
            i5 = 1;
            i11 = 101;
        } else {
            i5 = 0;
        }
        zzahm[] zzahmVarArr2 = (zzahm[]) zzfm.zzb(this.zzJ, i5);
        this.zzJ = zzahmVarArr2;
        for (zzahm zzahmVar : zzahmVarArr2) {
            zzahmVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahm[list.size()];
        while (i12 < this.zzK.length) {
            zzahm zzahmVarZzs = this.zzI.zzs(i11, 3);
            zzahmVarZzs.zzA((zzv) list.get(i12));
            this.zzK[i12] = zzahmVarZzs;
            i12++;
            i11++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e7, code lost:
    
        if (r43.zzK.length <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
    
        if (r6 <= 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
    
        if (com.google.android.gms.internal.ads.zzgr.zzb(r2.zzg, r13, 4) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f3, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f5, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f6, code lost:
    
        r43.zzH = r5;
        r10.zzc(r8, r6);
        r43.zzE += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0200, code lost:
    
        if (r6 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        if (r43.zzG != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x020d, code lost:
    
        if (com.google.android.gms.internal.ads.zzgr.zzd(r13, 4, r6, r2.zzg) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020f, code lost:
    
        r43.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021e, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0221, code lost:
    
        if (r43.zzH == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0223, code lost:
    
        r5 = r43.zzi;
        r5.zza(r6);
        r44.zzc(r5.zzi(), r9, r43.zzF);
        r10.zzc(r5, r43.zzF);
        r6 = r43.zzF;
        r7 = com.google.android.gms.internal.ads.zzgr.zza(r5.zzi(), r5.zze());
        r5.zzh(r9);
        r5.zzf(r7);
        r7 = r2.zzg.zzr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x024f, code lost:
    
        if (r7 != (-1)) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0251, code lost:
    
        r7 = r43.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0257, code lost:
    
        if (r7.zzb() == 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0259, code lost:
    
        r7.zza(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025d, code lost:
    
        r15 = r43.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0263, code lost:
    
        if (r15.zzb() == r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0265, code lost:
    
        r15.zza(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0268, code lost:
    
        r7 = r43.zzp;
        r7.zzc(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0275, code lost:
    
        if ((r3.zzg() & 4) == 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0277, code lost:
    
        r7.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027b, code lost:
    
        r6 = r10.zza(r44, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0280, code lost:
    
        r43.zzE += r6;
        r43.zzF -= r6;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0290, code lost:
    
        r1 = r3.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0296, code lost:
    
        if (r43.zzG != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0298, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029b, code lost:
    
        r13 = r1;
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a0, code lost:
    
        if (r1 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a2, code lost:
    
        r16 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02a7, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a9, code lost:
    
        r10.zze(r11, r13, r43.zzD, 0, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02af, code lost:
    
        r1 = r43.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b5, code lost:
    
        if (r1.isEmpty() != false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02b7, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzalt) r1.removeFirst();
        r2 = r43.zzy;
        r8 = r1.zzc;
        r43.zzy = r2 - r8;
        r4 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c8, code lost:
    
        if (r1.zzb == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ca, code lost:
    
        r4 = r4 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02cb, code lost:
    
        r5 = r4;
        r1 = r43.zzJ;
        r2 = r1.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d0, code lost:
    
        if (r13 >= r2) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d2, code lost:
    
        r1[r13].zze(r5, 1, r8, r43.zzy, null);
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e2, code lost:
    
        if (r3.zzh() != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e4, code lost:
    
        r43.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e7, code lost:
    
        r43.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02eb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x082e, code lost:
    
        throw com.google.android.gms.internal.ads.zzat.zzc("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
    
        if (r43.zzs != 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r43.zzD = r3.zzf();
        r2 = r3.zzd.zza.zzg.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (j$.util.Objects.equals(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_H264) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if ((r43.zzd & 64) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (j$.util.Objects.equals(r2, com.unity3d.services.core.device.MimeTypes.VIDEO_H265) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e0, code lost:
    
        if ((r43.zzd & 128) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
    
        r43.zzG = !r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        if (r3.zzf >= r3.zzi) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
    
        r44.zzf(r43.zzD);
        r1 = r3.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r1 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
    
        r2 = r3.zzb;
        r4 = r2.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fe, code lost:
    
        if (r1 == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        r4.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0109, code lost:
    
        if (r2.zzb(r3.zzf) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010b, code lost:
    
        r4.zzk(r4.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0118, code lost:
    
        if (r3.zzh() != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
    
        r43.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011c, code lost:
    
        r43.zzs = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        if (r3.zzd.zza.zzh != 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0127, code lost:
    
        r43.zzD -= 8;
        r44.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x013e, code lost:
    
        if ("audio/ac4".equals(r3.zzd.zza.zzg.zzp) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0140, code lost:
    
        r43.zzE = r3.zzi(r43.zzD, 7);
        r2 = r43.zzD;
        r8 = r43.zzk;
        com.google.android.gms.internal.ads.zzafd.zzc(r2, r8);
        r3.zza.zzc(r8, 7);
        r2 = r43.zzE + 7;
        r43.zzE = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r2 = r3.zzi(r43.zzD, 0);
        r43.zzE = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
    
        r43.zzD += r2;
        r43.zzs = 4;
        r43.zzF = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r2 = r3.zzd.zza;
        r10 = r3.zza;
        r11 = r3.zzd();
        r4 = r2.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0179, code lost:
    
        if (r4 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        r2 = r43.zzE;
        r4 = r43.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        if (r2 >= r4) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0181, code lost:
    
        r43.zzE += r10.zza(r44, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018c, code lost:
    
        r8 = r43.zzh;
        r13 = r8.zzi();
        r13[0] = 0;
        r13[1] = 0;
        r13[r25] = 0;
        r14 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019e, code lost:
    
        if (r43.zzE >= r43.zzD) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        r6 = r43.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a2, code lost:
    
        if (r6 != 0) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a7, code lost:
    
        if (r43.zzK.length > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
    
        if (r43.zzG != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        r6 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        r6 = com.google.android.gms.internal.ads.zzgr.zzc(r2.zzg);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bd, code lost:
    
        if ((r4 + r6) <= (r43.zzD - r43.zzE)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c0, code lost:
    
        r44.zzc(r13, r14, r4 + r6);
        r8.zzh(r9);
        r5 = r8.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cc, code lost:
    
        if (r5 < 0) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ce, code lost:
    
        r43.zzF = r5 - r6;
        r5 = r43.zzg;
        r5.zzh(r9);
        r10.zzc(r5, 4);
        r43.zzE += 4;
        r43.zzD += r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x08f5  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzd(com.google.android.gms.internal.ads.zzagb r44, com.google.android.gms.internal.ads.zzaha r45) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalw.zzd(com.google.android.gms.internal.ads.zzagb, com.google.android.gms.internal.ads.zzaha):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j8, long j10) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzalv) sparseArray.valueAt(i5)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j10;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ zzaga zzg() {
        return AbstractC1742f.b(this);
    }

    public final /* synthetic */ void zzh(long j8, zzeu zzeuVar) {
        zzafn.zza(j8, zzeuVar, this.zzK);
    }

    public zzalw(zzanq zzanqVar, int i5, zzfj zzfjVar, zzamp zzampVar, List list, zzahm zzahmVar) {
        this.zzc = zzanqVar;
        this.zzd = i5;
        this.zze = DesugarCollections.unmodifiableList(list);
        this.zzl = new zzajf();
        this.zzm = new zzeu(16);
        this.zzg = new zzeu(zzgr.zza);
        this.zzh = new zzeu(6);
        this.zzi = new zzeu();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzeu(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgwt.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzagd.zza;
        this.zzJ = new zzahm[0];
        this.zzK = new zzahm[0];
        this.zzp = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzals
            @Override // com.google.android.gms.internal.ads.zzha
            public final /* synthetic */ void zza(long j8, zzeu zzeuVar) {
                this.zza.zzh(j8, zzeuVar);
            }
        });
        this.zzq = new zzafp();
        this.zzN = -1L;
        this.zzO = -1L;
    }
}
