package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class hxh {
    private final hxg a = new hxg(null);
    private final Map b = new HashMap();

    private static void d(hxg hxgVar) {
        hxg hxgVar2 = hxgVar.d;
        hxgVar2.c = hxgVar.c;
        hxgVar.c.d = hxgVar2;
    }

    private static void e(hxg hxgVar) {
        hxgVar.c.d = hxgVar;
        hxgVar.d.c = hxgVar;
    }

    public final Object a(hxo hxoVar) {
        Map map = this.b;
        hxg hxgVar = (hxg) map.get(hxoVar);
        if (hxgVar == null) {
            hxgVar = new hxg(hxoVar);
            map.put(hxoVar, hxgVar);
        } else {
            hxoVar.a();
        }
        d(hxgVar);
        hxg hxgVar2 = this.a;
        hxgVar.d = hxgVar2;
        hxgVar.c = hxgVar2.c;
        e(hxgVar);
        return hxgVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [hxo, java.lang.Object] */
    public final Object b() {
        hxg hxgVar = this.a;
        for (hxg hxgVar2 = hxgVar.d; !hxgVar2.equals(hxgVar); hxgVar2 = hxgVar2.d) {
            Object objB = hxgVar2.b();
            if (objB != null) {
                return objB;
            }
            d(hxgVar2);
            Map map = this.b;
            ?? r3 = hxgVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(hxo hxoVar, Object obj) {
        Map map = this.b;
        hxg hxgVar = (hxg) map.get(hxoVar);
        if (hxgVar == null) {
            hxgVar = new hxg(hxoVar);
            d(hxgVar);
            hxg hxgVar2 = this.a;
            hxgVar.d = hxgVar2.d;
            hxgVar.c = hxgVar2;
            e(hxgVar);
            map.put(hxoVar, hxgVar);
        } else {
            hxoVar.a();
        }
        if (hxgVar.b == null) {
            hxgVar.b = new ArrayList();
        }
        hxgVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        hxg hxgVar = this.a;
        hxg hxgVar2 = hxgVar.c;
        boolean z = false;
        while (!hxgVar2.equals(hxgVar)) {
            sb.append('{');
            sb.append(hxgVar2.a);
            sb.append(':');
            sb.append(hxgVar2.a());
            sb.append("}, ");
            hxgVar2 = hxgVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
