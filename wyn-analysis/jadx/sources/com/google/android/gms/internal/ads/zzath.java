package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class zzath {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private zzath(int i5, byte[] bArr, Map map, List list, boolean z2, long j8) {
        this.zza = i5;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.zze = z2;
    }

    private static List zza(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzatd((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzath(int i5, byte[] bArr, Map map, boolean z2, long j8) {
        this(i5, bArr, map, zza(map), z2, j8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public zzath(int i5, byte[] bArr, boolean z2, long j8, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzatd zzatdVar = (zzatd) it.next();
                treeMap.put(zzatdVar.zza(), zzatdVar.zzb());
            }
        }
        this(i5, bArr, treeMap, list, z2, j8);
    }

    @Deprecated
    public zzath(byte[] bArr, Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
