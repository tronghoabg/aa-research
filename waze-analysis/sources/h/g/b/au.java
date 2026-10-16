package h.g.b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au {
    public static ClassCastException a(ClassCastException classCastException) {
        x.p(classCastException, au.class.getName());
        throw classCastException;
    }

    public static Collection b(Object obj) {
        if ((obj instanceof h.g.b.a.a) && !(obj instanceof h.g.b.a.b)) {
            d(obj, "kotlin.collections.MutableCollection");
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            throw a(e2);
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof h.g.b.a.a) && !(obj instanceof h.g.b.a.e)) {
            d(obj, "kotlin.collections.MutableMap");
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            throw a(e2);
        }
    }

    public static void d(Object obj, String str) {
        throw a(new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str));
    }

    public static boolean e(Object obj, int i2) {
        if (obj instanceof h.c) {
            if ((obj instanceof s ? ((s) obj).getArity() : obj instanceof h.g.a.a ? 0 : obj instanceof h.g.a.l ? 1 : obj instanceof h.g.a.p ? 2 : obj instanceof h.g.a.q ? 3 : obj instanceof h.g.a.r ? 4 : obj instanceof h.g.a.s ? 5 : obj instanceof h.g.a.t ? 6 : obj instanceof h.g.a.u ? 7 : obj instanceof h.g.a.v ? 8 : obj instanceof h.g.a.w ? 9 : obj instanceof h.g.a.b ? 10 : obj instanceof h.g.a.c ? 11 : obj instanceof h.g.a.d ? 12 : obj instanceof h.g.a.e ? 13 : obj instanceof h.g.a.f ? 14 : obj instanceof h.g.a.g ? 15 : obj instanceof h.g.a.h ? 16 : obj instanceof h.g.a.i ? 17 : obj instanceof h.g.a.j ? 18 : obj instanceof h.g.a.k ? 19 : obj instanceof h.g.a.m ? 20 : obj instanceof h.g.a.n ? 21 : obj instanceof h.g.a.o ? 22 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof h.g.b.a.a) || (obj instanceof h.g.b.a.d);
        }
        return false;
    }

    public static boolean g(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof h.g.b.a.a) || (obj instanceof h.g.b.a.f);
        }
        return false;
    }

    public static void h(Object obj, int i2) {
        if (obj == null || e(obj, i2)) {
            return;
        }
        d(obj, "kotlin.jvm.functions.Function" + i2);
    }

    public static boolean i(h.k.f fVar) {
        return fVar.getStart().compareTo(fVar.getEndInclusive()) > 0;
    }

    public static final long j(long j2, long j3) {
        return j2 & (~j3);
    }

    public static final long k(long j2, int i2) {
        return j(j2, 1073741823L) | i2;
    }

    public static final kotlinx.coroutines.ab l(kotlinx.coroutines.ab abVar, String str) {
        return str != null ? new kotlinx.coroutines.e.ae(abVar, str) : abVar;
    }

    public static final void m(int i2) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException("Expected positive parallelism level, but got " + i2);
    }
}
