package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class uhw {
    public static final int a = uuc.a().b;
    public final List b = new ArrayList();
    public final Map c = new HashMap();

    public final short a(uic uicVar) {
        Map map = this.c;
        if (map.containsKey(uicVar)) {
            return ((Short) map.get(uicVar)).shortValue();
        }
        return (short) 0;
    }

    public final boolean b(uic uicVar) {
        return this.c.containsKey(uicVar);
    }

    final synchronized void c(uic uicVar) {
        Map map = this.c;
        if (map.containsKey(uicVar)) {
            ((Short) map.get(uicVar)).shortValue();
        } else {
            if (map.size() >= a) {
                return;
            }
            this.b.add(uicVar);
            map.put(uicVar, Short.valueOf((short) map.size()));
        }
    }
}
