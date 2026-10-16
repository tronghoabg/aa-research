package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
final class zzxz implements zzxj, zzxi {
    private final zzxj[] zza;
    private final boolean[] zzb;
    private zzxi zzf;
    private zzzo zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzzf zzi = new zzwv(zzgwt.zzi(), zzgwt.zzi());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzxj[] zzh = new zzxj[0];

    public zzxz(zzww zzwwVar, long[] jArr, zzxj... zzxjVarArr) {
        this.zza = zzxjVarArr;
        this.zzb = new boolean[zzxjVarArr.length];
        for (int i5 = 0; i5 < zzxjVarArr.length; i5++) {
            long j8 = jArr[i5];
            if (j8 != 0) {
                this.zzb[i5] = true;
                this.zza[i5] = new zzzl(zzxjVarArr[i5], j8);
            }
        }
    }

    public final zzxj zza(int i5) {
        return this.zzb[i5] ? ((zzzl) this.zza[i5]).zza() : this.zza[i5];
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        return this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return this.zzi.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzd(zzmcVar);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((zzxj) arrayList.get(i5)).zzd(zzmcVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return this.zzi.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
        this.zzi.zzf(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j8) {
        this.zzf = zzxiVar;
        ArrayList arrayList = this.zzd;
        zzxj[] zzxjVarArr = this.zza;
        Collections.addAll(arrayList, zzxjVarArr);
        for (zzxj zzxjVar : zzxjVarArr) {
            zzxjVar.zzl(this, j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        int i5 = 0;
        while (true) {
            zzxj[] zzxjVarArr = this.zza;
            if (i5 >= zzxjVarArr.length) {
                return;
            }
            zzxjVarArr[i5].zzm();
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        zzzo zzzoVar = this.zzg;
        zzzoVar.getClass();
        return zzzoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j8) {
        int length;
        int[] iArr;
        int length2 = zzabbVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i5 = 0;
        int i10 = 0;
        while (true) {
            length = zzabbVarArr.length;
            if (i10 >= length) {
                break;
            }
            zzzd zzzdVar = zzzdVarArr[i10];
            Integer num = zzzdVar == null ? null : (Integer) this.zzc.get(zzzdVar);
            iArr2[i10] = num == null ? -1 : num.intValue();
            zzabb zzabbVar = zzabbVarArr[i10];
            if (zzabbVar != null) {
                String str = zzabbVar.zza().zzb;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzxj[] zzxjVarArr = this.zza;
        zzzd[] zzzdVarArr2 = new zzzd[length];
        zzzd[] zzzdVarArr3 = new zzzd[length];
        zzabb[] zzabbVarArr2 = new zzabb[length];
        ArrayList arrayList = new ArrayList(zzxjVarArr.length);
        long j10 = j8;
        int i11 = 0;
        while (i11 < zzxjVarArr.length) {
            int i12 = i5;
            while (i12 < zzabbVarArr.length) {
                zzzdVarArr3[i12] = iArr2[i12] == i11 ? zzzdVarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    zzabb zzabbVar2 = zzabbVarArr[i12];
                    zzabbVar2.getClass();
                    iArr = iArr3;
                    zzbg zzbgVar = (zzbg) this.zze.get(zzabbVar2.zza());
                    zzbgVar.getClass();
                    zzabbVarArr2[i12] = new zzxy(zzabbVar2, zzbgVar);
                } else {
                    iArr = iArr3;
                    zzabbVarArr2[i12] = null;
                }
                i12++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i13 = i11;
            long jZzo = zzxjVarArr[i11].zzo(zzabbVarArr2, zArr, zzzdVarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = jZzo;
            } else if (jZzo != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i14 = 0; i14 < zzabbVarArr.length; i14++) {
                if (iArr4[i14] == i13) {
                    zzzd zzzdVar2 = zzzdVarArr3[i14];
                    zzzdVar2.getClass();
                    zzzdVarArr2[i14] = zzzdVar2;
                    identityHashMap.put(zzzdVar2, Integer.valueOf(i13));
                    z2 = true;
                } else if (iArr2[i14] == i13) {
                    zzgtr.zzi(zzzdVarArr3[i14] == null);
                }
            }
            if (z2) {
                arrayList2.add(zzxjVarArr[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i5 = 0;
        }
        int i15 = i5;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzzdVarArr2, i15, zzzdVarArr, i15, length);
        this.zzh = (zzxj[]) arrayList3.toArray(new zzxj[i15]);
        this.zzi = new zzwv(arrayList3, zzgxt.zzc(arrayList3, zzxx.zza));
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzxjVar);
        if (arrayList.isEmpty()) {
            zzxj[] zzxjVarArr = this.zza;
            int i5 = 0;
            for (zzxj zzxjVar2 : zzxjVarArr) {
                i5 += zzxjVar2.zzn().zzb;
            }
            zzbg[] zzbgVarArr = new zzbg[i5];
            int i10 = 0;
            for (int i11 = 0; i11 < zzxjVarArr.length; i11++) {
                zzzo zzzoVarZzn = zzxjVarArr[i11].zzn();
                int i12 = zzzoVarZzn.zzb;
                int i13 = 0;
                while (i13 < i12) {
                    zzbg zzbgVarZza = zzzoVarZzn.zza(i13);
                    int i14 = zzbgVarZza.zza;
                    zzv[] zzvVarArr = new zzv[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        zzv zzvVarZza = zzbgVarZza.zza(i15);
                        zzt zztVarZza = zzvVarZza.zza();
                        String str = zzvVarZza.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxj[] zzxjVarArr2 = zzxjVarArr;
                        int i16 = i10;
                        StringBuilder sb2 = new StringBuilder(str.length() + AbstractC0279p0.f(i11, 1));
                        sb2.append(i11);
                        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                        sb2.append(str);
                        zztVarZza.zza(sb2.toString());
                        String str2 = zzvVarZza.zzn;
                        if (str2 != null) {
                            StringBuilder sb3 = new StringBuilder(AbstractC0279p0.f(i11, 1) + str2.length());
                            sb3.append(i11);
                            sb3.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                            sb3.append(str2);
                            zztVarZza.zzm(sb3.toString());
                        }
                        zzvVarArr[i15] = zztVarZza.zzP();
                        i15++;
                        zzxjVarArr = zzxjVarArr2;
                        i10 = i16;
                    }
                    zzxj[] zzxjVarArr3 = zzxjVarArr;
                    int i17 = i10;
                    String str3 = zzbgVarZza.zzb;
                    StringBuilder sb4 = new StringBuilder(AbstractC0279p0.f(i11, 1) + String.valueOf(str3).length());
                    sb4.append(i11);
                    sb4.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    sb4.append(str3);
                    zzbg zzbgVar = new zzbg(sb4.toString(), zzvVarArr);
                    this.zze.put(zzbgVar, zzbgVarZza);
                    i10 = i17 + 1;
                    zzbgVarArr[i17] = zzbgVar;
                    i13++;
                    zzxjVarArr = zzxjVarArr3;
                }
            }
            this.zzg = new zzzo(zzbgVarArr);
            zzxi zzxiVar = this.zzf;
            zzxiVar.getClass();
            zzxiVar.zzp(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j8, boolean z2) {
        for (zzxj zzxjVar : this.zzh) {
            zzxjVar.zzq(j8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        long j8 = -9223372036854775807L;
        for (zzxj zzxjVar : this.zzh) {
            long jZzr = zzxjVar.zzr();
            if (jZzr == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && zzxjVar.zzt(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (zzxj zzxjVar2 : this.zzh) {
                    if (zzxjVar2 == zzxjVar) {
                        break;
                    }
                    if (zzxjVar2.zzt(jZzr) != jZzr) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = jZzr;
            } else if (jZzr != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        zzxi zzxiVar = this.zzf;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j8) {
        long jZzt = this.zzh[0].zzt(j8);
        int i5 = 1;
        while (true) {
            zzxj[] zzxjVarArr = this.zzh;
            if (i5 >= zzxjVarArr.length) {
                return jZzt;
            }
            if (zzxjVarArr[i5].zzt(jZzt) != jZzt) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j8, zznk zznkVar) {
        zzxj[] zzxjVarArr = this.zzh;
        return (zzxjVarArr.length > 0 ? zzxjVarArr[0] : this.zza[0]).zzu(j8, zznkVar);
    }
}
