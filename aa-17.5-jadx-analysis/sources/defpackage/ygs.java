package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ygs extends ygj {
    public final ygu a() {
        Map map = this.a;
        if (map == null) {
            return ydw.a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return ydw.a;
        }
        yfu yfuVar = new yfu(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            ygr ygrVarN = ygr.n(((ygp) entry.getValue()).g());
            if (!ygrVarN.isEmpty()) {
                yfuVar.e(key, ygrVarN);
                size += ygrVarN.size();
            }
        }
        return new ygu(yfuVar.d(true), size, null);
    }

    public final void b(Object obj, Object obj2) {
        super.f(obj, obj2);
    }

    public final void c(Object obj, Iterable iterable) {
        super.g(obj, iterable);
    }

    @Override // defpackage.ygj
    public final yff d(int i) {
        wub.G(i, "expectedSize");
        return new ygp(i);
    }

    @Override // defpackage.ygj
    public final int h(Iterable iterable) {
        if (iterable instanceof Set) {
            return Math.max(4, ((Set) iterable).size());
        }
        return 4;
    }
}
