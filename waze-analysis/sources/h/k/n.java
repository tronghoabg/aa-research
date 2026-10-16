package h.k;

import h.g.b.x;
import h.n.o;
import kotlinx.b.a.ac;
import kotlinx.b.a.p;
import kotlinx.b.a.q;
import kotlinx.b.a.s;
import kotlinx.b.a.u;
import kotlinx.b.a.y;
import kotlinx.b.c.bw;
import kotlinx.b.c.bx;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class n {
    public static final Iterable C(q qVar) {
        x.f(qVar, "<this>");
        return new u(qVar, 0);
    }

    public static final e a(double d2, double d3) {
        return new c(d2, d3);
    }

    public static final e b(float f2, float f3) {
        return new d(f2, f3);
    }

    public static final f c(Comparable comparable, Comparable comparable2) {
        x.f(comparable, "<this>");
        x.f(comparable2, "that");
        return new g(comparable, comparable2);
    }

    public static double d(double d2, double d3, double d4) {
        if (d3 <= d4) {
            return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + ".");
    }

    public static float e(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static float f(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static float g(float f2, float f3, float f4) {
        if (f3 <= f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + ".");
    }

    public static int h(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static int i(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static int j(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + ".");
    }

    public static long k(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static long l(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static long m(long j2, f fVar) {
        x.f(fVar, "range");
        if (fVar instanceof e) {
            return ((Number) q(Long.valueOf(j2), (e) fVar)).longValue();
        }
        if (!fVar.isEmpty()) {
            return j2 < ((Number) fVar.getStart()).longValue() ? ((Number) fVar.getStart()).longValue() : j2 <= ((Number) fVar.getEndInclusive()).longValue() ? j2 : ((Number) fVar.getEndInclusive()).longValue();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + ".");
    }

    public static long n(long j2, long j3, long j4) {
        if (j3 <= j4) {
            return j2 < j3 ? j3 : j2 > j4 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j4 + " is less than minimum " + j3 + ".");
    }

    public static Comparable o(Comparable comparable, Comparable comparable2) {
        x.f(comparable, "<this>");
        x.f(comparable2, "minimumValue");
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static Comparable p(Comparable comparable, Comparable comparable2) {
        x.f(comparable, "<this>");
        x.f(comparable2, "maximumValue");
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    public static Comparable q(Comparable comparable, e eVar) {
        x.f(comparable, "<this>");
        x.f(eVar, "range");
        if (!eVar.isEmpty()) {
            return (!eVar.b(comparable, eVar.getStart()) || eVar.b(eVar.getStart(), comparable)) ? (!eVar.b(eVar.getEndInclusive(), comparable) || eVar.b(comparable, eVar.getEndInclusive())) ? comparable : eVar.getEndInclusive() : eVar.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Comparable r(java.lang.Comparable r2, java.lang.Comparable r3, java.lang.Comparable r4) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r2, r0)
            if (r3 == 0) goto L3e
            if (r4 == 0) goto L3e
            int r0 = r3.compareTo(r4)
            if (r0 > 0) goto L1d
            int r0 = r2.compareTo(r3)
            if (r0 >= 0) goto L16
            goto L46
        L16:
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L50
            goto L4f
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L3e:
            if (r3 == 0) goto L47
            int r0 = r2.compareTo(r3)
            if (r0 >= 0) goto L47
        L46:
            return r3
        L47:
            if (r4 == 0) goto L50
            int r3 = r2.compareTo(r4)
            if (r3 <= 0) goto L50
        L4f:
            return r4
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.k.n.r(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static h s(h hVar) {
        x.f(hVar, "<this>");
        return new h(hVar.b(), hVar.a(), -hVar.c());
    }

    public static h t(h hVar, int i2) {
        x.f(hVar, "<this>");
        x.f(Integer.valueOf(i2), "step");
        int iA = hVar.a();
        int iB = hVar.b();
        if (hVar.c() <= 0) {
            i2 = -i2;
        }
        return new h(iA, iB, i2);
    }

    public static j u(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? j.f48156a : new j(i2, i3 - 1);
    }

    public static final void v(h.l.c cVar, Object obj) {
        x.f(cVar, "<this>");
        if (!cVar.d(obj)) {
            throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(cVar.b())));
        }
        x.d(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
    }

    public static final q w(String str, p pVar) {
        x.f(str, "serialName");
        x.f(pVar, "kind");
        if (o.G(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        int i2 = bx.f51024a;
        x.f(str, "serialName");
        x.f(pVar, "kind");
        bx.b(str);
        return new bw(str, pVar);
    }

    public static final q x(String str, q qVar) {
        x.f(str, "serialName");
        x.f(qVar, "original");
        if (o.G(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (!x.n(str, qVar.d())) {
            if (qVar.h() instanceof p) {
                bx.b(str);
            }
            return new ac(str, qVar);
        }
        throw new IllegalArgumentException("The name of the wrapped descriptor (" + str + ") cannot be the same as the name of the original descriptor (" + qVar.d() + ')');
    }

    public static final q y(String str, q[] qVarArr, h.g.a.l lVar) {
        x.f(str, "serialName");
        x.f(qVarArr, "typeParameters");
        x.f(lVar, "builderAction");
        if (o.G(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        kotlinx.b.a.a aVar = new kotlinx.b.a.a(str);
        lVar.invoke(aVar);
        return new s(str, y.f50940a, aVar.d().size(), h.a.c.X(qVarArr), aVar);
    }

    public static final q z(String str, kotlinx.b.a.x xVar, q[] qVarArr, h.g.a.l lVar) {
        x.f(str, "serialName");
        x.f(xVar, "kind");
        x.f(qVarArr, "typeParameters");
        x.f(lVar, "builder");
        if (o.G(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (x.n(xVar, y.f50940a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        kotlinx.b.a.a aVar = new kotlinx.b.a.a(str);
        lVar.invoke(aVar);
        return new s(str, xVar, aVar.d().size(), h.a.c.X(qVarArr), aVar);
    }
}
