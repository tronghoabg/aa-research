package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class mcb implements lhg {
    public final Map a = new HashMap();
    public final mca b = new mca();
    private final nui c = new ndm(this, 1);

    public static mcb b() {
        return (mcb) mki.a.b(mcb.class, new may(2));
    }

    public final mca a(String str) {
        Map map = this.a;
        if (map.containsKey(str)) {
            return (mca) map.get(str);
        }
        mca mcaVar = new mca();
        mcaVar.c();
        map.put(str, mcaVar);
        return mcaVar;
    }

    @Override // defpackage.lhg
    public final void c() {
        nuj.b().f(this.c);
    }

    @Override // defpackage.lhg
    public final void d() {
        nuj.b().k(this.c);
        Map map = this.a;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((mca) it.next()).d();
        }
        map.clear();
    }
}
