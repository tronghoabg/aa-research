package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzgxt {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i5) {
        zzgvp.zzb(i5, "initialArraySize");
        return new ArrayList(i5);
    }

    public static List zzc(List list, zzgti zzgtiVar) {
        return list instanceof RandomAccess ? new zzgxq(list, zzgtiVar) : new zzgxs(list, zzgtiVar);
    }
}
