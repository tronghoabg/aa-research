package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class prg {
    private static final Map a = new HashMap();
    private static ohe[] c = new ohe[0];
    private static final StringBuilder b = new StringBuilder();

    public static synchronized void a(String str, String str2) {
        b(str, str2);
    }

    public static synchronized void b(String str, String str2) {
        Map map;
        if (str2 == null) {
            map = a;
            if (map.remove(str) == null) {
                return;
            }
            c = (ohe[]) map.values().toArray(new ohe[map.size()]);
            c();
            return;
        }
        Map map2 = a;
        ohe oheVar = (ohe) map2.get(str);
        if (oheVar == null || !((String) oheVar.b).equals(str2)) {
            map2.put(str, new ohe(str, str2));
            map = map2;
            c = (ohe[]) map.values().toArray(new ohe[map.size()]);
            c();
            return;
        }
        return;
    }

    private static synchronized void c() {
        StringBuilder sb = b;
        sb.setLength(0);
        for (ohe oheVar : c) {
            sb.append("{");
            sb.append((String) oheVar.a);
            sb.append(": ");
            sb.append((String) oheVar.b);
            sb.append("} ");
        }
        sb.toString();
    }
}
