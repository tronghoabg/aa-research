package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzhj implements zzhr {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhv zzd;

    public zzhj(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
        zzipVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzipVar)) {
            return;
        }
        arrayList.add(zzipVar);
        this.zzc++;
    }

    public final void zzf(zzhv zzhvVar) {
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzip) this.zzb.get(i5)).zza(this, zzhvVar, this.zza);
        }
    }

    public final void zzg(zzhv zzhvVar) {
        this.zzd = zzhvVar;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzip) this.zzb.get(i5)).zzb(this, zzhvVar, this.zza);
        }
    }

    public final void zzh(int i5) {
        zzhv zzhvVar = this.zzd;
        String str = zzfm.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzip) this.zzb.get(i10)).zzc(this, zzhvVar, this.zza, i5);
        }
    }

    public final void zzi() {
        zzhv zzhvVar = this.zzd;
        String str = zzfm.zza;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            ((zzip) this.zzb.get(i5)).zzd(this, zzhvVar, this.zza);
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public /* synthetic */ Map zzj() {
        return z.a(this);
    }
}
