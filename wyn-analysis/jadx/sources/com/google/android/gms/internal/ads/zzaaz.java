package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzaaz extends zzabf implements zznd {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgyn zzc = zzgyn.zzc(zzaai.zza);
    public final Context zza;
    private final Object zzd;
    private zzaan zze;
    private Thread zzf;
    private zzaco zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzzu zzj;

    public zzaaz(Context context) {
        zzzu zzzuVar = new zzzu();
        zzaan zzaanVar = zzaan.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzzuVar;
        if (zzaanVar instanceof zzaan) {
            this.zze = zzaanVar;
        } else {
            zzaam zzaamVar = new zzaam(zzaanVar, bArr);
            zzaamVar.zzx((zzbl) zzaanVar);
            this.zze = new zzaan(zzaamVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static Pair zzA(zzaba[] zzabaVarArr, int i5) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzaba zzabaVar = zzabaVarArr[i10];
            if (zzabaVar != null && zzabaVar.zza.zzc == i5) {
                return Pair.create(zzabaVar, Integer.valueOf(i10));
            }
        }
        return null;
    }

    private static final Pair zzB(int i5, zzabe zzabeVar, int[][][] iArr, zzaaq zzaaqVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzabe zzabeVar2 = zzabeVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i5 == zzabeVar2.zza(i10)) {
                zzzo zzzoVarZzb = zzabeVar2.zzb(i10);
                for (int i11 = 0; i11 < zzzoVarZzb.zzb; i11++) {
                    zzbg zzbgVarZza = zzzoVarZzb.zza(i11);
                    List listZza = zzaaqVar.zza(i10, zzbgVarZza, iArr[i10][i11]);
                    int i12 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i13 + 1;
                        zzaar zzaarVar = (zzaar) listZza.get(i13);
                        int iZza = zzaarVar.zza();
                        if (!zArr[i13] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgwt.zzj(zzaarVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzaarVar);
                                for (int i15 = i14; i15 < i12; i15++) {
                                    zzaar zzaarVar2 = (zzaar) listZza.get(i15);
                                    if (zzaarVar2.zza() == 2 && zzaarVar.zzc(zzaarVar2)) {
                                        arrayList2.add(zzaarVar2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i13 = i14;
                    }
                }
            }
            i10++;
            zzabeVar2 = zzabeVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((zzaar) list.get(i16)).zzc;
        }
        zzaar zzaarVar3 = (zzaar) list.get(0);
        return Pair.create(new zzaba(zzaarVar3.zzb, iArr2, 0), Integer.valueOf(zzaarVar3.zza));
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z2 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzfm.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i5, int i10) {
        return (i5 == 0 || i5 != i10) ? Integer.bitCount(i5 & i10) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzgwt r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaaz.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzgwt):int");
    }

    public static final zzaba zzp(int i5, zzzo zzzoVar, int[][] iArr, zzaan zzaanVar) throws zzjm {
        int i10 = zzaanVar.zzw.zzb;
        int i11 = 0;
        zzbg zzbgVar = null;
        zzaal zzaalVar = null;
        for (int i12 = 0; i12 < zzzoVar.zzb; i12++) {
            zzbg zzbgVarZza = zzzoVar.zza(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < zzbgVarZza.zza; i13++) {
                if (I.c(iArr2[i13], zzaanVar.zzV)) {
                    zzaal zzaalVar2 = new zzaal(zzbgVarZza.zza(i13), iArr2[i13]);
                    if (zzaalVar == null || zzaalVar2.compareTo(zzaalVar) > 0) {
                        zzbgVar = zzbgVarZza;
                        i11 = i13;
                        zzaalVar = zzaalVar2;
                    }
                }
            }
        }
        if (zzbgVar == null) {
            return null;
        }
        return new zzaba(zzbgVar, new int[]{i11}, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzk() {
        boolean z2;
        zzaco zzacoVar;
        synchronized (this.zzd) {
            try {
                z2 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null && zzacoVar.zzb()) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzt();
        }
    }

    private static void zzw(zzabe zzabeVar, zzbl zzblVar, zzaba[] zzabaVarArr) {
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < 2; i5++) {
            zzx(zzabeVar.zzb(i5), zzblVar, map);
        }
        zzx(zzabeVar.zze(), zzblVar, map);
        for (int i10 = 0; i10 < 2; i10++) {
            if (((zzbh) map.get(Integer.valueOf(zzabeVar.zza(i10)))) != null) {
                throw null;
            }
        }
    }

    private static void zzx(zzzo zzzoVar, zzbl zzblVar, Map map) {
        for (int i5 = 0; i5 < zzzoVar.zzb; i5++) {
            if (((zzbh) zzblVar.zzH.get(zzzoVar.zza(i5))) != null) {
                throw null;
            }
        }
    }

    private static void zzy(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i5 = 0; i5 < 2; i5++) {
            zzzo zzzoVarZzb = zzabeVar.zzb(i5);
            if (zzaanVar.zzb(i5, zzzoVarZzb)) {
                if (zzaanVar.zzc(i5, zzzoVarZzb) != null) {
                    throw null;
                }
                zzabaVarArr[i5] = null;
            }
        }
    }

    private static void zzz(zzabe zzabeVar, zzaan zzaanVar, zzaba[] zzabaVarArr) {
        for (int i5 = 0; i5 < 2; i5++) {
            int iZza = zzabeVar.zza(i5);
            if (zzaanVar.zza(i5) || zzaanVar.zzI.contains(Integer.valueOf(iZza))) {
                zzabaVarArr[i5] = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznd
    public final void zza(zznc zzncVar) {
        synchronized (this.zzd) {
            boolean z2 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzb() {
        zzaco zzacoVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgtr.zzj(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null) {
            zzacoVar.zzg();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzaan zzc() {
        zzaan zzaanVar;
        synchronized (this.zzd) {
            zzaanVar = this.zze;
        }
        return zzaanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzk();
    }

    public final void zzf(zzaam zzaamVar) {
        boolean zEquals;
        zzaan zzaanVar = new zzaan(zzaamVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzaanVar);
            this.zze = zzaanVar;
        }
        if (zEquals) {
            return;
        }
        if (zzaanVar.zzU && this.zza == null) {
            zzeh.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final zznd zzg() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzabf
    public final Pair zzh(zzabe zzabeVar, int[][][] iArr, final int[] iArr2, zzxl zzxlVar, zzbf zzbfVar) throws zzjm {
        final zzaan zzaanVar;
        final String str;
        zzzu zzzuVar;
        int[] iArr3;
        int length;
        zzabb zzabbVarZza;
        int i5;
        int i10;
        final String languageTag;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        final boolean z2;
        Context context3;
        int i11 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzaanVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzfm.zzR(context3));
        }
        if (zzaanVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzaco(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzk();
                }
            }, this.zzi);
        }
        zzaba[] zzabaVarArr = new zzaba[2];
        zzw(zzabeVar, zzaanVar, zzabaVarArr);
        zzy(zzabeVar, zzaanVar, zzabaVarArr);
        zzz(zzabeVar, zzaanVar, zzabaVarArr);
        Pair pairZzA = zzA(zzabaVarArr, 1);
        int i12 = 0;
        if (pairZzA == null) {
            int i13 = 0;
            while (true) {
                if (i13 >= 2) {
                    z2 = false;
                    break;
                }
                if (zzabeVar.zza(i13) == 2 && zzabeVar.zzb(i13).zzb > 0) {
                    z2 = true;
                    break;
                }
                i13++;
            }
            pairZzA = zzB(1, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaae
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i14, zzbg zzbgVar, int[] iArr4) {
                    final zzaaz zzaazVar = this.zza;
                    final zzaan zzaanVar2 = zzaanVar;
                    zzgts zzgtsVar = new zzgts() { // from class: com.google.android.gms.internal.ads.zzaah
                        @Override // com.google.android.gms.internal.ads.zzgts
                        public final /* synthetic */ boolean zza(Object obj) {
                            return zzaazVar.zzl(zzaanVar2, (zzv) obj);
                        }
                    };
                    int i15 = iArr2[i14];
                    int i16 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i17 = 0; i17 < zzbgVar.zza; i17++) {
                        zzgwqVar.zzf(new zzzy(i14, zzbgVar, i17, zzaanVar2, iArr4[i17], z2, zzgtsVar, i15));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzzz.zza);
            if (pairZzA != null) {
                zzabaVarArr[((Integer) pairZzA.second).intValue()] = (zzaba) pairZzA.first;
            }
        }
        if (pairZzA == null) {
            str = null;
        } else {
            Object obj = pairZzA.first;
            str = ((zzaba) obj).zza.zza(((zzaba) obj).zzb[0]).zzd;
        }
        Pair pairZzA2 = zzA(zzabaVarArr, 2);
        Pair pairZzA3 = zzA(zzabaVarArr, 4);
        if (pairZzA2 == null && pairZzA3 == null) {
            int i14 = zzaanVar.zzw.zzb;
            final Point pointZzT = (!zzaanVar.zzk || (context2 = this.zza) == null) ? null : zzfm.zzT(context2);
            Pair pairZzB = zzB(2, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaad
                /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
                @Override // com.google.android.gms.internal.ads.zzaaq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ java.util.List zza(int r19, com.google.android.gms.internal.ads.zzbg r20, int[] r21) {
                    /*
                        Method dump skipped, instructions count: 221
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaad.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
                }
            }, zzaac.zza);
            Pair pairZzB2 = pairZzB == null ? zzB(4, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaag
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i15, zzbg zzbgVar, int[] iArr4) {
                    int i16 = zzaaz.zzb;
                    int i17 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i18 = 0; i18 < zzbgVar.zza; i18++) {
                        zzgwqVar.zzf(new zzaak(i15, zzbgVar, i18, zzaanVar, iArr4[i18]));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzaaa.zza) : null;
            if (pairZzB2 != null) {
                zzabaVarArr[((Integer) pairZzB2.second).intValue()] = (zzaba) pairZzB2.first;
            } else if (pairZzB != null) {
                zzabaVarArr[((Integer) pairZzB.second).intValue()] = (zzaba) pairZzB.first;
            }
        }
        if (zzA(zzabaVarArr, 3) == null) {
            int i15 = zzaanVar.zzw.zzb;
            if (!zzaanVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = null;
            } else {
                String str2 = zzfm.zza;
                languageTag = locale.toLanguageTag();
            }
            Pair pairZzB3 = zzB(3, zzabeVar, iArr, new zzaaq() { // from class: com.google.android.gms.internal.ads.zzaaf
                @Override // com.google.android.gms.internal.ads.zzaaq
                public final /* synthetic */ List zza(int i16, zzbg zzbgVar, int[] iArr4) {
                    int i17 = zzaaz.zzb;
                    int i18 = zzgwt.zzd;
                    zzgwq zzgwqVar = new zzgwq();
                    for (int i19 = 0; i19 < zzbgVar.zza; i19++) {
                        zzgwqVar.zzf(new zzaap(i16, zzbgVar, i19, zzaanVar, iArr4[i19], str, languageTag));
                    }
                    return zzgwqVar.zzi();
                }
            }, zzaab.zza);
            if (pairZzB3 != null) {
                zzabaVarArr[((Integer) pairZzB3.second).intValue()] = (zzaba) pairZzB3.first;
            }
        }
        int i16 = zzaanVar.zzw.zzb;
        zzgxc zzgxcVar = new zzgxc();
        int i17 = 0;
        while (i17 < 2) {
            zzaba zzabaVar = zzabaVarArr[i17];
            if (zzabaVar == null || zzaanVar.zza(i17)) {
                i10 = i12;
            } else {
                zzgxd zzgxdVar = zzaanVar.zzI;
                zzbg zzbgVar = zzabaVar.zza;
                i10 = i12;
                if (!zzgxdVar.contains(Integer.valueOf(zzbgVar.zzc))) {
                    zzgxcVar.zzf(zzbgVar.zzb);
                    int i18 = i10;
                    while (true) {
                        int[] iArr4 = zzabaVar.zzb;
                        if (i18 < iArr4.length) {
                            String str3 = zzbgVar.zza(iArr4[i18]).zzn;
                            if (str3 != null) {
                                zzgxcVar.zzf(str3);
                            }
                            i18++;
                        }
                    }
                }
            }
            i17++;
            i12 = i10;
        }
        int i19 = i12;
        zzgxd zzgxdVarZzh = zzgxcVar.zzh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i20 = i19;
        while (i20 < 2) {
            if (zzabeVar.zza(i20) == 5) {
                zzzo zzzoVarZzb = zzabeVar.zzb(i20);
                int i21 = i19;
                while (i21 < zzzoVarZzb.zzb) {
                    zzbg zzbgVarZza = zzzoVarZzb.zza(i21);
                    arrayList.add(zzbgVarZza);
                    int[] iArr5 = (int[]) iArr[i20][i21].clone();
                    int i22 = i11;
                    for (int i23 = i19; i23 < iArr5.length; i23++) {
                        String str4 = zzbgVarZza.zza(i23).zzn;
                        if (str4 != null && !zzgxdVarZzh.contains(str4)) {
                            iArr5[i23] = 128;
                        }
                    }
                    arrayList2.add(iArr5);
                    i21++;
                    i11 = i22;
                }
            }
            i20++;
            i11 = i11;
        }
        int i24 = i11;
        int i25 = 128;
        zzbg[] zzbgVarArr = new zzbg[arrayList.size()];
        zzfm.zzc(arrayList, zzbgVarArr);
        zzzo zzzoVar = new zzzo(zzbgVarArr);
        int[][] iArr6 = new int[arrayList2.size()][];
        zzfm.zzc(arrayList2, iArr6);
        int i26 = i19;
        while (i26 < 2) {
            if (zzabeVar.zza(i26) == 5) {
                zzaba zzabaVarZzp = zzp(5, zzzoVar, iArr6, zzaanVar);
                zzabaVarArr[i26] = zzabaVarZzp;
                if (zzabaVarZzp == null) {
                    break;
                }
                i5 = i25;
                Arrays.fill(iArr6[zzzoVar.zzb(zzabaVarZzp.zza)], i5);
            } else {
                i5 = i25;
            }
            i26++;
            i25 = i5;
        }
        int i27 = i19;
        while (i27 < 2) {
            int iZza = zzabeVar.zza(i27);
            if (iZza != 2 && iZza != i24) {
                if (iZza != 3 && iZza != 4 && iZza != 5 && zzabaVarArr[i27] == null) {
                    zzabaVarArr[i27] = zzp(iZza, zzabeVar.zzb(i27), iArr[i27], zzaanVar);
                }
            }
            i27++;
            i24 = 1;
        }
        zzw(zzabeVar, zzaanVar, zzabaVarArr);
        zzy(zzabeVar, zzaanVar, zzabaVarArr);
        zzz(zzabeVar, zzaanVar, zzabaVarArr);
        zzzu zzzuVar2 = this.zzj;
        zzabr zzabrVarZzu = zzu();
        zzgwt zzgwtVarZzd = zzzv.zzd(zzabaVarArr);
        zzabb[] zzabbVarArr = new zzabb[2];
        int i28 = i19;
        while (i28 < 2) {
            zzaba zzabaVar2 = zzabaVarArr[i28];
            if (zzabaVar2 == null || (length = (iArr3 = zzabaVar2.zzb).length) == 0) {
                zzzuVar = zzzuVar2;
            } else {
                if (length == 1) {
                    zzabbVarZza = new zzabc(zzabaVar2.zza, iArr3[i19], 0, 0, null);
                    zzzuVar = zzzuVar2;
                } else {
                    zzzuVar = zzzuVar2;
                    zzabbVarZza = zzzuVar.zza(zzabaVar2.zza, iArr3, 0, zzabrVarZzu, (zzgwt) zzgwtVarZzd.get(i28));
                }
                zzabbVarArr[i28] = zzabbVarZza;
            }
            i28++;
            zzzuVar2 = zzzuVar;
        }
        zznf[] zznfVarArr = new zznf[2];
        for (int i29 = i19; i29 < 2; i29++) {
            zznfVarArr[i29] = (zzaanVar.zza(i29) || zzaanVar.zzI.contains(Integer.valueOf(zzabeVar.zza(i29))) || (zzabeVar.zza(i29) != -2 && zzabbVarArr[i29] == null)) ? null : zznf.zza;
        }
        return Pair.create(zznfVarArr, zzabbVarArr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final /* synthetic */ boolean zzl(zzaan zzaanVar, zzv zzvVar) {
        Boolean bool;
        zzaco zzacoVar;
        zzaco zzacoVar2;
        if (!zzaanVar.zzU || ((bool = this.zzi) != null && bool.booleanValue())) {
            return true;
        }
        int i5 = zzvVar.zzH;
        char c10 = 65535;
        if (i5 != -1 && i5 > 2) {
            String str = zzvVar.zzp;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            c10 = 1;
                            break;
                        }
                        break;
                }
                if ((c10 == 0 || c10 == 1 || c10 == 2 || c10 == 3) && (Build.VERSION.SDK_INT < 32 || (zzacoVar2 = this.zzg) == null || !zzacoVar2.zzb())) {
                    return true;
                }
            }
            return Build.VERSION.SDK_INT >= 32 && (zzacoVar = this.zzg) != null && zzacoVar.zzb() && zzacoVar.zzc() && this.zzg.zzd() && this.zzg.zze(this.zzh, zzvVar);
        }
        return true;
    }
}
