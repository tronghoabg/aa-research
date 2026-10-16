package defpackage;

/* loaded from: classes2.dex */
public class ajde {
    private final aisv a = new aisv(0, aisy.a);
    public ajdf[] b;

    private final void h(int i, int i2) {
        ajdf[] ajdfVarArr = this.b;
        ajdfVarArr.getClass();
        ajdf ajdfVar = ajdfVarArr[i2];
        ajdfVar.getClass();
        ajdf ajdfVar2 = ajdfVarArr[i];
        ajdfVar2.getClass();
        ajdfVarArr[i] = ajdfVar;
        ajdfVarArr[i2] = ajdfVar2;
        ajdfVar.e(i);
        ajdfVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final ajdf b() {
        ajdf[] ajdfVarArr = this.b;
        if (ajdfVarArr != null) {
            return ajdfVarArr[0];
        }
        return null;
    }

    public final ajdf c() {
        ajdf ajdfVarB;
        synchronized (this) {
            ajdfVarB = b();
        }
        return ajdfVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajdf d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.aitz.a
            ajdf[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            ajdf[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r7 = r7.a()
            r0[r7] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajde.d(int):ajdf");
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            ajdf[] ajdfVarArr = this.b;
            ajdfVarArr.getClass();
            int i2 = (i - 1) >> 1;
            ajdf ajdfVar = ajdfVarArr[i2];
            ajdfVar.getClass();
            ajdf ajdfVar2 = ajdfVarArr[i];
            ajdfVar2.getClass();
            if (((Comparable) ajdfVar).compareTo(ajdfVar2) <= 0) {
                return;
            }
            h(i, i2);
            i = i2;
        }
    }

    public final boolean g() {
        return a() == 0;
    }
}
