package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzinl implements zzimz {
    private final List zza;
    private final List zzb;

    static {
        zzina.zza(Collections.EMPTY_SET);
    }

    public /* synthetic */ zzinl(List list, List list2, zzinj zzinjVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzink zza(int i5, int i10) {
        return new zzink(i5, i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Collection collection = (Collection) ((zzini) list2.get(i5)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzimw.zzb(size);
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object objZzb = ((zzini) list.get(i10)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i11 = 0; i11 < size4; i11++) {
            for (Object obj : (Collection) arrayList.get(i11)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSetZzb);
    }
}
