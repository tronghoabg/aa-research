package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class azd {
    public final List a;
    public cwk b;
    private int c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final aan h;
    private final aap i;
    private smv j;

    public azd() {
        long[] jArr = aao.a;
        this.h = new aan(6);
        aap aapVar = aaq.a;
        this.i = new aap(6);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.a = new ArrayList();
    }

    static /* synthetic */ void d(azd azdVar, axk axkVar, int i, boolean z) {
        Object objA = azdVar.h.a(axkVar.e);
        objA.getClass();
        k(axkVar, i, (azb) objA, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f() {
        /*
            r15 = this;
            aan r15 = r15.h
            boolean r0 = r15.e()
            if (r0 == 0) goto L5d
            java.lang.Object[] r0 = r15.c
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L13:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            r8 = r3
        L26:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L4f
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            azb r9 = (defpackage.azb) r9
            aza[] r9 = r9.a
            int r11 = r9.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r9[r12]
            if (r13 == 0) goto L4c
            r13.c()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L26
        L53:
            if (r9 != r10) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L13
        L5a:
            r15.k()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azd.f():void");
    }

    private final void g(Object obj) {
        aza[] azaVarArr;
        azb azbVar = (azb) this.h.i(obj);
        if (azbVar == null || (azaVarArr = azbVar.a) == null) {
            return;
        }
        for (aza azaVar : azaVarArr) {
            if (azaVar != null) {
                azaVar.c();
            }
        }
    }

    private final void h(axk axkVar, boolean z) {
        aew aewVar;
        Object objA = this.h.a(axkVar.e);
        objA.getClass();
        aza[] azaVarArr = ((azb) objA).a;
        int length = azaVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            aza azaVar = azaVarArr[i];
            int i3 = i2 + 1;
            if (azaVar != null) {
                long jB = axkVar.b(i2);
                long j = azaVar.h;
                if (j != 9223372034707292159L && j != jB && (aewVar = azaVar.d) != null) {
                    long jC = dlo.c(azaVar.a(), dlo.c(jB, j));
                    azaVar.g(jC);
                    azaVar.f(true);
                    azaVar.f = z;
                    ahnc.d(azaVar.a, null, 0, new ayz(azaVar, aewVar, jC, null), 3);
                }
                azaVar.h = jB;
            }
            i++;
            i2 = i3;
        }
    }

    private static final int i(axk axkVar, boolean z) {
        long jB = axkVar.b(0);
        return (int) (!z ? 4294967295L & jB : jB >> 32);
    }

    private static final boolean j(axk axkVar) {
        List list = axkVar.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object objG = ((cuo) list.get(i)).g();
            if ((objG instanceof ayo ? (ayo) objG : null) != null) {
                return true;
            }
        }
        return false;
    }

    private static final void k(axk axkVar, int i, azb azbVar, boolean z) {
        int i2 = 0;
        long jB = axkVar.b(0);
        long jF = z ? dlo.f(jB, 0, i, 1) : dlo.f(jB, i, 0, 2);
        aza[] azaVarArr = azbVar.a;
        int length = azaVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            aza azaVar = azaVarArr[i2];
            int i4 = i3 + 1;
            if (azaVar != null) {
                azaVar.h = dlo.d(jF, dlo.c(axkVar.b(i3), jB));
            }
            i2++;
            i3 = i4;
        }
    }

    private static final int l(int[] iArr, axk axkVar, boolean z) {
        int iMax = 0;
        for (int i = 0; i <= 0; i++) {
            int iA = iArr[i] + azm.a(axkVar, z);
            iArr[i] = iA;
            iMax = Math.max(iMax, iA);
        }
        return iMax;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            aza azaVar = (aza) list.get(i);
            cmi cmiVar = azaVar.k;
            if (cmiVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (azaVar.h >> 32)) + ((int) (cmiVar.n >> 32)));
                jMax = (Math.max((int) (jMax & 4294967295L), ((int) (azaVar.h & 4294967295L)) + ((int) (cmiVar.n & 4294967295L))) & 4294967295L) | (iMax << 32);
            }
        }
        return jMax;
    }

    public final aza b(Object obj, int i) {
        aza[] azaVarArr;
        azb azbVar = (azb) this.h.a(obj);
        if (azbVar == null || (azaVarArr = azbVar.a) == null) {
            return null;
        }
        return azaVarArr[i];
    }

    public final void c() {
        f();
        this.j = null;
        this.c = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r47, int r48, int r49, java.util.List r50, defpackage.smv r51, defpackage.azn r52, boolean r53, boolean r54, boolean r55, int r56, int r57, defpackage.aitx r58, defpackage.cji r59) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azd.e(int, int, int, java.util.List, smv, azn, boolean, boolean, boolean, int, int, aitx, cji):void");
    }
}
