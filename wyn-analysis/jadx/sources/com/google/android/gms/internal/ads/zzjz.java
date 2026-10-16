package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzjz {
    private final Map zza;
    private zzjb zzb;

    public /* synthetic */ zzjz(zzlj zzljVar, int i5, byte[] bArr) {
        Objects.requireNonNull(zzljVar);
        this.zza = new HashMap();
        this.zzb = zzjb.zza;
    }

    private static final zzjb zzb(zzjb zzjbVar, List list) {
        zzja zzjaVar = new zzja(zzjbVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzjbVar.zza()) {
            if (!hashSet.contains(str)) {
                zzjaVar.zzf(str);
            }
        }
        return zzjaVar.zzg();
    }

    public final /* synthetic */ void zza(zzjb zzjbVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zzjc zzjcVar = (zzjc) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzjbVar, list).equals(zzb(this.zzb, list))) {
                zzjcVar.zza();
            }
        }
        this.zzb = zzjbVar;
    }
}
