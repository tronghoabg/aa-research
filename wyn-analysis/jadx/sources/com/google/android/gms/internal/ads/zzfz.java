package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzfz extends zzgb {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzfz(int i5, long j8) {
        super(i5, null);
        this.zza = j8;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        List list = this.zzb;
        String strZze = zzgb.zze(this.zzd);
        String string = Arrays.toString(list.toArray());
        String string2 = Arrays.toString(this.zzc.toArray());
        int length = strZze.length();
        StringBuilder sb2 = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        AbstractC3256n.p(sb2, strZze, " leaves: ", string, " containers: ");
        sb2.append(string2);
        return sb2.toString();
    }

    public final void zza(zzga zzgaVar) {
        this.zzb.add(zzgaVar);
    }

    public final void zzb(zzfz zzfzVar) {
        this.zzc.add(zzfzVar);
    }

    public final zzga zzc(int i5) {
        List list = this.zzb;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzga zzgaVar = (zzga) list.get(i10);
            if (zzgaVar.zzd == i5) {
                return zzgaVar;
            }
        }
        return null;
    }

    public final zzfz zzd(int i5) {
        List list = this.zzc;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzfz zzfzVar = (zzfz) list.get(i10);
            if (zzfzVar.zzd == i5) {
                return zzfzVar;
            }
        }
        return null;
    }
}
