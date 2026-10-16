package h;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import l.a.ayd;
import l.a.ayq;
import l.a.azt;
import l.a.bbz;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {
    public static final f a(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "initializer");
        return new o(aVar);
    }

    public static final f b(h hVar, h.g.a.a aVar) {
        h.g.b.x.f(hVar, "mode");
        h.g.b.x.f(aVar, "initializer");
        h hVar2 = h.f48130a;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            return new o(aVar);
        }
        if (iOrdinal == 1) {
            return new n(aVar);
        }
        if (iOrdinal == 2) {
            return new ac(aVar);
        }
        throw new i();
    }

    public static final /* synthetic */ int c(Object[] objArr, int i2, int i3) {
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = objArr[i2 + i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final /* synthetic */ String d(Object[] objArr, int i2, int i3, Collection collection) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        h.g.b.x.e(string, "toString(...)");
        return string;
    }

    public static final void e(Object[] objArr, int i2) {
        h.g.b.x.f(objArr, "<this>");
        objArr[i2] = null;
    }

    public static final void f(Object[] objArr, int i2, int i3) {
        h.g.b.x.f(objArr, "<this>");
        while (i2 < i3) {
            e(objArr, i2);
            i2++;
        }
    }

    public static final /* synthetic */ boolean g(Object[] objArr, int i2, int i3, List list) {
        if (i3 != list.size()) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!h.g.b.x.n(objArr[i2 + i4], list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final Object[] h(int i2) {
        if (i2 >= 0) {
            return new Object[i2];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] i(Object[] objArr, int i2) {
        h.g.b.x.f(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        h.g.b.x.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final /* synthetic */ e.a.f.a.e j(ayd aydVar) {
        h.g.b.x.f(aydVar, "builder");
        return new e.a.f.a.e(aydVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c k(bbz bbzVar) {
        h.g.b.x.f(bbzVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bbzVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c l(azt aztVar) {
        h.g.b.x.f(aztVar, "builder");
        return new com.waze.shared_infra.coordinators.c(aztVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c m(ayq ayqVar) {
        h.g.b.x.f(ayqVar, "builder");
        return new com.waze.shared_infra.coordinators.c(ayqVar);
    }
}
