package defpackage;

@afdo
/* loaded from: classes.dex */
public final class bza {
    public static final void a(aan aanVar, Object obj, Object obj2) {
        int iG = aanVar.g(obj);
        boolean z = iG < 0;
        Object obj3 = z ? null : aanVar.c[iG];
        if (obj3 != null) {
            if (obj3 instanceof aap) {
                ((aap) obj3).j(obj2);
            } else if (obj3 != obj2) {
                aap aapVar = new aap(6);
                aapVar.j(obj3);
                aapVar.j(obj2);
                obj2 = aapVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            aanVar.c[iG] = obj2;
            return;
        }
        int i = ~iG;
        aanVar.b[i] = obj;
        aanVar.c[i] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.aan r14, java.lang.Object r15) {
        /*
            long[] r0 = r14.a
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L5c
            r2 = 0
            r3 = r2
        L9:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L57
            int r6 = r3 - r1
            r7 = r2
        L1c:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L51
            int r8 = r3 << 3
            int r8 = r8 + r7
            java.lang.Object[] r10 = r14.b
            r10 = r10[r8]
            java.lang.Object[] r10 = r14.c
            r10 = r10[r8]
            boolean r11 = r10 instanceof defpackage.aap
            if (r11 == 0) goto L4c
            r10.getClass()
            aap r10 = (defpackage.aap) r10
            r10.l(r15)
            boolean r10 = r10.b()
            if (r10 == 0) goto L51
            goto L4e
        L4c:
            if (r10 != r15) goto L51
        L4e:
            r14.j(r8)
        L51:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L1c
        L55:
            if (r8 != r9) goto L5c
        L57:
            if (r3 == r1) goto L5c
            int r3 = r3 + 1
            goto L9
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bza.b(aan, java.lang.Object):void");
    }

    public static final boolean c(aan aanVar, Object obj, Object obj2) {
        Object objA = aanVar.a(obj);
        if (objA == null) {
            return false;
        }
        if (!(objA instanceof aap)) {
            if (!affa.f(objA, obj2)) {
                return false;
            }
            aanVar.i(obj);
            return true;
        }
        aap aapVar = (aap) objA;
        boolean zL = aapVar.l(obj2);
        if (!zL || !aapVar.b()) {
            return zL;
        }
        aanVar.i(obj);
        return true;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
