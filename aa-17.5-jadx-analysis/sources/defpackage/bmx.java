package defpackage;

/* loaded from: classes2.dex */
final class bmx implements asw {
    private final float a;
    private final float b;
    private final float c;

    public bmx(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = (f + f2) / 2.0f;
    }

    @Override // defpackage.asw
    public final float a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    @Override // defpackage.asw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dlg r9, int r10, int[] r11, defpackage.dlr r12, int[] r13) {
        /*
            r8 = this;
            int r0 = r11.length
            if (r0 != 0) goto L4
            goto L3c
        L4:
            float r1 = r8.a
            int r1 = r9.eF(r1)
            float r8 = r8.b
            int r8 = r9.eF(r8)
            r9 = 0
            r2 = r9
            r3 = r2
        L13:
            if (r2 >= r0) goto L3c
            r4 = r11[r2]
            int r5 = r3 + 1
            if (r3 == 0) goto L2e
            r6 = 1
            if (r3 == r6) goto L25
            r6 = 2
            if (r3 == r6) goto L22
            goto L2e
        L22:
            int r6 = r10 - r4
            goto L2f
        L25:
            r6 = r11[r9]
            if (r6 <= 0) goto L2b
            r7 = r1
            goto L2c
        L2b:
            r7 = r8
        L2c:
            int r6 = r6 + r7
            goto L2f
        L2e:
            r6 = r9
        L2f:
            dlr r7 = defpackage.dlr.a
            if (r12 == r7) goto L36
            int r6 = r10 - r6
            int r6 = r6 - r4
        L36:
            r13[r3] = r6
            int r2 = r2 + 1
            r3 = r5
            goto L13
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmx.b(dlg, int, int[], dlr, int[]):void");
    }
}
