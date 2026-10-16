package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class zzhbo extends zzhbq {
    public zzhbo(zzgwp zzgwpVar, boolean z2) {
        super(zzgwpVar, z2);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgxt.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhbp zzhbpVar = (zzhbp) it.next();
            arrayListZzb.add(zzhbpVar != null ? zzhbpVar.zza : null);
        }
        return DesugarCollections.unmodifiableList(arrayListZzb);
    }
}
