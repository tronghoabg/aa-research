package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ert {
    public final Map a = new LinkedHashMap();

    public final void a() {
        Map map = this.a;
        Map mapBd = woy.bd(map);
        map.clear();
        Iterator it = mapBd.values().iterator();
        while (it.hasNext()) {
            ((erm) it.next()).g();
        }
    }

    public final String toString() {
        String simpleName = affw.b(getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "ViewModelStore";
        }
        String string = Integer.toString(hashCode(), 16);
        string.getClass();
        return simpleName + "@" + string + "(keys=" + woy.cl(this.a.keySet()) + ")";
    }
}
