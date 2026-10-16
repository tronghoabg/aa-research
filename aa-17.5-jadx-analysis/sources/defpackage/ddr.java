package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ddr implements Iterable, dec, afgc {
    public boolean a;
    public boolean b;
    public final aan c;
    private Map d;

    public ddr() {
        long[] jArr = aao.a;
        this.c = new aan(6);
    }

    @Override // defpackage.dec
    public final void a(deb debVar, Object obj) {
        if (!(obj instanceof ddf) || !f(debVar)) {
            this.c.m(debVar, obj);
            return;
        }
        aan aanVar = this.c;
        Object objA = aanVar.a(debVar);
        objA.getClass();
        ddf ddfVar = (ddf) objA;
        ddf ddfVar2 = (ddf) obj;
        String str = ddfVar2.a;
        if (str == null) {
            str = ddfVar.a;
        }
        aanVar.m(debVar, new ddf(str, ddfVar2.b));
    }

    public final ddr b() {
        ddr ddrVar = new ddr();
        ddrVar.a = this.a;
        ddrVar.b = this.b;
        ddrVar.c.l(this.c);
        return ddrVar;
    }

    public final Object c(deb debVar) {
        Object objA = this.c.a(debVar);
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException(a.bm(debVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object d(deb debVar, afdr afdrVar) {
        Object objA = this.c.a(debVar);
        return objA == null ? afdrVar.invoke() : objA;
    }

    public final void e(ddr ddrVar) {
        int i;
        aan aanVar = ddrVar.c;
        Object[] objArr = aanVar.b;
        Object[] objArr2 = aanVar.c;
        long[] jArr = aanVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        deb debVar = (deb) obj;
                        aan aanVar2 = this.c;
                        Object objA = aanVar2.a(debVar);
                        debVar.getClass();
                        Object objInvoke = debVar.b.invoke(objA, obj2);
                        if (objInvoke != null) {
                            aanVar2.m(debVar, objInvoke);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddr)) {
            return false;
        }
        ddr ddrVar = (ddr) obj;
        return affa.f(this.c, ddrVar.c) && this.a == ddrVar.a && this.b == ddrVar.b;
    }

    public final boolean f(deb debVar) {
        return aan.f(this.c, debVar);
    }

    public final Object g(deb debVar) {
        Object objA = this.c.a(debVar);
        if (objA == null) {
            return null;
        }
        return objA;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + (true != this.a ? 1237 : 1231)) * 31) + (true == this.b ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<deb<?>, Object>> iterator() {
        Map mapB = this.d;
        if (mapB == null) {
            mapB = this.c.b();
            this.d = mapB;
        }
        return mapB.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[PHI: r2
  0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r20 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.a
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.b
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            aan r4 = r0.c
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L79
            int r12 = r9 - r7
            r13 = 0
        L44:
            int r14 = ~r12
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L77
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L73
            int r14 = r9 << 3
            int r14 = r14 + r13
            r16 = r5[r14]
            r14 = r6[r14]
            r8 = r16
            deb r8 = (defpackage.deb) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r14)
            r2 = r3
        L73:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L44
        L77:
            if (r14 != r15) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L31
        L7e:
            java.lang.String r0 = defpackage.dat.f(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddr.toString():java.lang.String");
    }
}
