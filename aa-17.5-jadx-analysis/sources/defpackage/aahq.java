package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class aahq {
    public final HashMap a = new HashMap();

    public final Object a(int i, int i2, int i3) {
        HashMap map;
        HashMap map2 = (HashMap) this.a.get(Integer.valueOf(i));
        if (map2 == null || (map = (HashMap) map2.get(Integer.valueOf(i2))) == null) {
            return null;
        }
        return map.get(Integer.valueOf(i3));
    }

    public final void b(int i, int i2, int i3, Object obj) {
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        Integer numValueOf3 = Integer.valueOf(i3);
        aclh.o(obj != null, "value for [%s,%s,%s] cannot be <null>", new Object[]{numValueOf, numValueOf2, numValueOf3});
        HashMap map = this.a;
        HashMap map2 = (HashMap) map.get(numValueOf);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(numValueOf, map2);
        }
        HashMap map3 = (HashMap) map2.get(numValueOf2);
        if (map3 == null) {
            map3 = new HashMap();
            map2.put(numValueOf2, map3);
        }
        map3.put(numValueOf3, obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aahq) {
            return a.C(this.a, ((aahq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return this.a.toString();
    }
}
