package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qma {
    final Map a = new HashMap();

    public final Map a(String str) {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            String strValueOf = String.valueOf((String) entry.getKey());
            map.put(str.concat(strValueOf), (String) entry.getValue());
        }
        return map;
    }

    public final String toString() {
        return qle.a(this.a, 1);
    }
}
