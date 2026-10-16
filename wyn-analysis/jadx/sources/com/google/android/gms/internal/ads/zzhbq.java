package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
abstract class zzhbq extends zzhbh {
    private List zza;

    public zzhbq(zzgwp zzgwpVar, boolean z2) {
        super(zzgwpVar, z2, true);
        List listZzb = zzgwpVar.isEmpty() ? Collections.EMPTY_LIST : zzgxt.zzb(zzgwpVar.size());
        for (int i5 = 0; i5 < zzgwpVar.size(); i5++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzA(int i5) {
        super.zzA(i5);
        this.zza = null;
    }

    public abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzw(int i5, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i5, new zzhbp(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    public final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
