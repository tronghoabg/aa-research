package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzacj {
    private static final Comparator zza = zzaci.zza;
    private static final Comparator zzb = zzach.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzacg[] zzd = new zzacg[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzacj(int i5) {
    }

    public final void zza() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }

    public final void zzb(int i5, float f10) {
        zzacg zzacgVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i10 = this.zzh;
        if (i10 > 0) {
            zzacg[] zzacgVarArr = this.zzd;
            int i11 = i10 - 1;
            this.zzh = i11;
            zzacgVar = zzacgVarArr[i11];
        } else {
            zzacgVar = new zzacg(null);
        }
        int i12 = this.zzf;
        this.zzf = i12 + 1;
        zzacgVar.zza = i12;
        zzacgVar.zzb = i5;
        zzacgVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzacgVar);
        this.zzg += i5;
        while (true) {
            int i13 = this.zzg;
            if (i13 <= 2000) {
                return;
            }
            int i14 = i13 - 2000;
            zzacg zzacgVar2 = (zzacg) arrayList.get(0);
            int i15 = zzacgVar2.zzb;
            if (i15 <= i14) {
                this.zzg -= i15;
                arrayList.remove(0);
                int i16 = this.zzh;
                if (i16 < 5) {
                    zzacg[] zzacgVarArr2 = this.zzd;
                    this.zzh = i16 + 1;
                    zzacgVarArr2[i16] = zzacgVar2;
                }
            } else {
                zzacgVar2.zzb = i15 - i14;
                this.zzg -= i14;
            }
        }
    }

    public final float zzc(float f10) {
        int i5 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i5 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzacg) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzacg zzacgVar = (zzacg) arrayList.get(i5);
            i10 += zzacgVar.zzb;
            if (i10 >= f12) {
                return zzacgVar.zzc;
            }
            i5++;
        }
    }
}
