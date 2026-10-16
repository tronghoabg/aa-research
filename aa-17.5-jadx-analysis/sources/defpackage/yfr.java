package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class yfr extends ygj {
    public final yfs a() {
        Map map = this.a;
        if (map == null) {
            return ydv.a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return ydv.a;
        }
        yfu yfuVar = new yfu(setEntrySet.size());
        int i = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            yfq yfqVarG = ((yfl) entry.getValue()).g();
            yfuVar.e(key, yfqVarG);
            i += ((yls) yfqVarG).c;
        }
        return new yfs(yfuVar.d(true), i);
    }

    public final void b(Object obj, Object obj2) {
        super.f(obj, obj2);
    }

    public final void c(Object obj, Iterable iterable) {
        super.g(obj, iterable);
    }
}
