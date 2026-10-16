package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pxd implements pxc {
    private static final Map a = DesugarCollections.synchronizedMap(new HashMap());

    public pxd() {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    @Override // defpackage.pxc
    public final pxb a(abow abowVar, pwh pwhVar, pwp pwpVar) {
        accb accbVar = pwpVar.h;
        accbVar.getClass();
        String strValueOf = String.valueOf(accbVar.name());
        Map map = a;
        String strConcat = strValueOf.concat("");
        synchronized (map) {
            if (!map.containsKey(strConcat)) {
                map.put(strConcat, new ArrayList());
            }
            ((List) map.get(strConcat)).add(abowVar);
        }
        throw null;
    }

    @Override // defpackage.pxc
    public final void b() {
    }
}
