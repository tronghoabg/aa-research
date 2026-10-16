package defpackage;

/* loaded from: classes.dex */
public final class cdg implements cdi {
    public boolean b;
    public boolean c;
    public boolean a = true;
    public final aan d = new aan(6);

    public final void a() {
        if (this.b) {
            return;
        }
        if (this.c) {
            cdj.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        b();
        this.c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            aan r15 = r15.d
            java.lang.Object[] r0 = r15.c
            long[] r1 = r15.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L69
            r3 = 0
            r4 = r3
        Ld:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L64
            int r7 = r4 - r2
            r8 = r3
        L20:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L62
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L5e
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r11 = r9 instanceof defpackage.aag
            if (r11 == 0) goto L55
            r9.getClass()
            aag r9 = (defpackage.aag) r9
            java.lang.Object[] r11 = r9.a
            int r9 = r9.b
            r12 = r3
        L45:
            if (r12 >= r9) goto L5e
            r13 = r11[r12]
            boolean r14 = r13 instanceof defpackage.cdh
            if (r14 == 0) goto L52
            cdh r13 = (defpackage.cdh) r13
            r13.a()
        L52:
            int r12 = r12 + 1
            goto L45
        L55:
            boolean r11 = r9 instanceof defpackage.cdh
            if (r11 == 0) goto L5e
            cdh r9 = (defpackage.cdh) r9
            r9.a()
        L5e:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L20
        L62:
            if (r9 != r10) goto L69
        L64:
            if (r4 == r2) goto L69
            int r4 = r4 + 1
            goto Ld
        L69:
            r15.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdg.b():void");
    }
}
