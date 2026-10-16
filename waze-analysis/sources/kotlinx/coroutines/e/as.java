package kotlinx.coroutines.e;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class as {

    /* renamed from: a, reason: collision with root package name */
    private at[] f51880a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.b f51881b = h.e.b.f(0);

    private final void g(int i2) {
        this.f51881b.f(i2);
    }

    private final void h(int i2) {
        while (i2 > 0) {
            at[] atVarArr = this.f51880a;
            if (atVarArr == null) {
                h.g.b.x.g();
            }
            int i3 = (i2 - 1) >> 1;
            at atVar = atVarArr[i3];
            if (atVar == null) {
                h.g.b.x.g();
            }
            Comparable comparable = (Comparable) atVar;
            at atVar2 = atVarArr[i2];
            if (atVar2 == null) {
                h.g.b.x.g();
            }
            if (comparable.compareTo(atVar2) <= 0) {
                return;
            }
            i(i2, i3);
            i2 = i3;
        }
    }

    private final void i(int i2, int i3) {
        at[] atVarArr = this.f51880a;
        h.g.b.x.c(atVarArr);
        at atVar = atVarArr[i3];
        h.g.b.x.c(atVar);
        at atVar2 = atVarArr[i2];
        h.g.b.x.c(atVar2);
        atVarArr[i2] = atVar;
        atVarArr[i3] = atVar2;
        atVar.e(i2);
        atVar2.e(i3);
    }

    public final int a() {
        return this.f51881b.d();
    }

    public final at b() {
        at[] atVarArr = this.f51880a;
        if (atVarArr != null) {
            return atVarArr[0];
        }
        return null;
    }

    public final at c() {
        at atVarB;
        synchronized (this) {
            atVarB = b();
        }
        return atVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[LOOP:0: B:18:0x0042->B:43:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[EDGE_INSN: B:50:0x008e->B:44:0x008e BREAK  A[LOOP:0: B:18:0x0042->B:43:0x0089], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.e.at d(int r8) {
        /*
            r7 = this;
            int r0 = kotlinx.coroutines.ai.f51347a
            kotlinx.coroutines.e.at[] r0 = r7.f51880a
            if (r0 != 0) goto L9
            h.g.b.x.g()
        L9:
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.g(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L8e
            int r1 = r7.a()
            r7.i(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L42
            r3 = r0[r8]
            if (r3 != 0) goto L2a
            h.g.b.x.g()
        L2a:
            int r1 = r1 / 2
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            if (r4 != 0) goto L35
            h.g.b.x.g()
        L35:
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L42
            r7.i(r8, r1)
            r7.h(r1)
            goto L8e
        L42:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L8e
            kotlinx.coroutines.e.at[] r4 = r7.f51880a
            if (r4 != 0) goto L53
            h.g.b.x.g()
        L53:
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L72
            r5 = r4[r1]
            if (r5 != 0) goto L62
            h.g.b.x.g()
        L62:
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            if (r6 != 0) goto L6b
            h.g.b.x.g()
        L6b:
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L72
            goto L73
        L72:
            r1 = r3
        L73:
            r3 = r4[r8]
            if (r3 != 0) goto L7a
            h.g.b.x.g()
        L7a:
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            if (r4 != 0) goto L83
            h.g.b.x.g()
        L83:
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L8e
            r7.i(r8, r1)
            r8 = r1
            goto L42
        L8e:
            int r8 = r7.a()
            r8 = r0[r8]
            if (r8 != 0) goto L99
            h.g.b.x.g()
        L99:
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r7 = r7.a()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.e.as.d(int):kotlinx.coroutines.e.at");
    }

    public final void e(at atVar) {
        int i2 = kotlinx.coroutines.ai.f51347a;
        atVar.d(this);
        at[] atVarArr = this.f51880a;
        if (atVarArr == null) {
            atVarArr = new at[4];
            this.f51880a = atVarArr;
        } else if (a() >= atVarArr.length) {
            int iA = a();
            Object[] objArrCopyOf = Arrays.copyOf(atVarArr, iA + iA);
            h.g.b.x.e(objArrCopyOf, "copyOf(...)");
            atVarArr = (at[]) objArrCopyOf;
            this.f51880a = atVarArr;
        }
        int iA2 = a();
        g(iA2 + 1);
        atVarArr[iA2] = atVar;
        atVar.e(iA2);
        h(iA2);
    }

    public final boolean f() {
        return a() == 0;
    }
}
