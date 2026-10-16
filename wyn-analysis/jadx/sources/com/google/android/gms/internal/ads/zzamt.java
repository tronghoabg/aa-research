package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzamt implements zzahh {
    public final int zza;
    public final zzham zzb;

    public zzamt(int i5, int[] iArr) {
        this.zza = i5;
        this.zzb = iArr != null ? zzham.zzf(iArr) : zzham.zza();
    }

    public final String toString() {
        zzham zzhamVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzhamVar.zzh());
        for (int i5 = 0; i5 < zzhamVar.zzh(); i5++) {
            arrayList.add(zzfm.zzA(zzhamVar.zzi(i5)));
        }
        String strZzA = zzfm.zzA(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(strZzA.length() + 37, 1, string));
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzA);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
