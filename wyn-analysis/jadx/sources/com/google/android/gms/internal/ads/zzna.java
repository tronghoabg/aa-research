package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzna extends zziy {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbf[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzna(Collection collection, zzzg zzzgVar) {
        zzbf[] zzbfVarArr = new zzbf[collection.size()];
        Iterator it = collection.iterator();
        int i5 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            zzbfVarArr[i10] = ((zzmi) it.next()).zzb();
            i10++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i5] = ((zzmi) it2.next()).zza();
            i5++;
        }
        this(zzbfVarArr, objArr, zzzgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzp(int i5) {
        return zzfm.zzn(this.zze, i5 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzq(int i5) {
        return zzfm.zzn(this.zzf, i5 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzr(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final zzbf zzs(int i5) {
        return this.zzg[i5];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzt(int i5) {
        return this.zze[i5];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final int zzu(int i5) {
        return this.zzf[i5];
    }

    @Override // com.google.android.gms.internal.ads.zziy
    public final Object zzv(int i5) {
        return this.zzh[i5];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzna zzx(zzzg zzzgVar) {
        zzbf[] zzbfVarArr = this.zzg;
        zzbf[] zzbfVarArr2 = new zzbf[zzbfVarArr.length];
        for (int i5 = 0; i5 < zzbfVarArr.length; i5++) {
            zzbfVarArr2[i5] = new zzmz(this, zzbfVarArr[i5]);
        }
        return new zzna(zzbfVarArr2, this.zzh, zzzgVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzna(zzbf[] zzbfVarArr, Object[] objArr, zzzg zzzgVar) {
        super(false, zzzgVar);
        int i5 = 0;
        this.zzg = zzbfVarArr;
        int length = zzbfVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZza = 0;
        int iZzc = 0;
        int i10 = 0;
        while (i5 < zzbfVarArr.length) {
            zzbf zzbfVar = zzbfVarArr[i5];
            this.zzg[i10] = zzbfVar;
            this.zzf[i10] = iZza;
            this.zze[i10] = iZzc;
            iZza += zzbfVar.zza();
            iZzc += this.zzg[i10].zzc();
            this.zzi.put(objArr[i10], Integer.valueOf(i10));
            i5++;
            i10++;
        }
        this.zzc = iZza;
        this.zzd = iZzc;
    }
}
