package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final /* synthetic */ class zzdto implements zzgti {
    static final /* synthetic */ zzdto zza = new zzdto();

    private /* synthetic */ zzdto() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzdtm zzdtmVar : (List) obj) {
            if (zzdtmVar != null) {
                arrayList.add(zzdtmVar);
            }
        }
        return arrayList;
    }
}
