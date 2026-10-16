package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzevh implements zzfcs {
    private final Set zza;

    public zzevh(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzhcf.zza(new zzevg(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 8;
    }
}
