package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhnn {
    private final Map zza = new HashMap();

    public final zzhnn zza(zzibk zzibkVar, Object obj) throws GeneralSecurityException {
        List list;
        if (zzibkVar.zzd() != 0 && zzibkVar.zzd() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        Map map = this.zza;
        if (map.containsKey(zzibkVar)) {
            list = (List) map.get(zzibkVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(zzibkVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
        return this;
    }

    public final zzhnp zzb() {
        return new zzhnp(this.zza, null);
    }
}
