package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hva {
    private static final huw a = new huy();
    private final Map b = new HashMap();

    public final synchronized hux a(Object obj) {
        huw huwVar;
        a.al(obj, "Argument must not be null");
        Map map = this.b;
        huwVar = (huw) map.get(obj.getClass());
        if (huwVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                huw huwVar2 = (huw) it.next();
                if (huwVar2.b().isAssignableFrom(obj.getClass())) {
                    huwVar = huwVar2;
                    break;
                }
            }
        }
        if (huwVar == null) {
            huwVar = a;
        }
        return huwVar.a(obj);
    }

    public final synchronized void b(huw huwVar) {
        this.b.put(huwVar.b(), huwVar);
    }
}
