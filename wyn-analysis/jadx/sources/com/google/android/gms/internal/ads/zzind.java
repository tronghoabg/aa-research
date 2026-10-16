package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzind extends zzimv {
    static {
        zzina.zza(Collections.EMPTY_MAP);
    }

    public /* synthetic */ zzind(Map map, zzinb zzinbVar) {
        super(map);
    }

    public static zzinc zzc(int i5) {
        return new zzinc(i5, null);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzc = zzimw.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), ((zzini) entry.getValue()).zzb());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapZzc);
    }
}
