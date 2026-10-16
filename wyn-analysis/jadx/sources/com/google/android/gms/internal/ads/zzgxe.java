package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzgxe extends zzgwz {
    public final zzgxe zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder("[");
            boolean z2 = true;
            while (it.hasNext()) {
                if (!z2) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z2 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgwo zzgwoVarZzt = (zzgwo) zza().get(obj);
            if (zzgwoVarZzt == null) {
                zzgwoVarZzt = zzgxd.zzt(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzgwoVarZzt);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgvp.zza(obj, next);
                zzgwoVarZzt.zzd(next);
            }
        }
        return this;
    }

    public final zzgxg zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgwh.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgwh.zza;
        }
        zzgwv zzgwvVar = new zzgwv(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgxd zzgxdVarZzp = zzgxd.zzp(((zzgxc) entry.getValue()).zzh());
            if (!zzgxdVarZzp.isEmpty()) {
                zzgwvVar.zza(key, zzgxdVarZzp);
                size += zzgxdVarZzp.size();
            }
        }
        return new zzgxg(zzgwvVar.zzc(), size, null);
    }
}
