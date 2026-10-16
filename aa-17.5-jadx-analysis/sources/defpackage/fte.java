package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fte implements Iterable, afgc {
    public static final fte a = new fte(afbf.a);
    public final Map b;

    public fte(Map map) {
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fte) && affa.f(this.b, ((fte) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<aezu<String, ftd>> iterator() {
        Map map = this.b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new aezu((String) entry.getKey(), (ftd) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.b + ")";
    }

    public fte() {
        this(afbf.a);
    }
}
