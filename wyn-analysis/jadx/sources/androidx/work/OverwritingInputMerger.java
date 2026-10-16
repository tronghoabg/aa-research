package androidx.work;

import J3.g;
import J3.h;
import J3.k;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends k {
    @Override // J3.k
    public final h a(ArrayList arrayList) {
        g gVar = new g(0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(DesugarCollections.unmodifiableMap(((h) it.next()).f5572a));
        }
        gVar.j(map);
        return gVar.a();
    }
}
