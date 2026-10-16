package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class bad implements afec {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bad(int i, int i2, aae aaeVar, smv smvVar, int i3) {
        this.e = i3;
        this.a = i;
        this.b = i2;
        this.d = aaeVar;
        this.c = smvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[LOOP:0: B:8:0x003b->B:14:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[EDGE_INSN: B:17:0x0068->B:15:0x0068 BREAK  A[LOOP:0: B:8:0x003b->B:14:0x0065], SYNTHETIC] */
    @Override // defpackage.afec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            if (r0 == 0) goto L1c
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r0 = r6.b
            int r1 = r6.a
            java.lang.Object r2 = r6.c
            java.lang.Object r6 = r6.d
            bac r6 = (defpackage.bac) r6
            epk r2 = (defpackage.epk) r2
            r6.i(r2, r1, r0, r7)
            afak r6 = defpackage.afak.a
            return r6
        L1c:
            os r7 = (defpackage.os) r7
            java.lang.Object r0 = r7.c
            ayw r0 = (defpackage.ayw) r0
            afec r0 = r0.a()
            int r1 = r7.a
            int r2 = r6.a
            int r2 = java.lang.Math.max(r2, r1)
            int r7 = r7.b
            int r7 = r7 + r1
            int r3 = r6.b
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r3, r7)
            if (r2 > r7) goto L68
        L3b:
            if (r0 == 0) goto L49
            int r3 = r2 - r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.invoke(r3)
            if (r3 != 0) goto L4e
        L49:
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r3 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r3.<init>(r2)
        L4e:
            java.lang.Object r4 = r6.c
            java.lang.Object r5 = r6.d
            aae r5 = (defpackage.aae) r5
            r5.g(r3, r2)
            smv r4 = (defpackage.smv) r4
            int r5 = r4.a
            int r5 = r2 - r5
            java.lang.Object r4 = r4.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r4[r5] = r3
            if (r2 == r7) goto L68
            int r2 = r2 + 1
            goto L3b
        L68:
            afak r6 = defpackage.afak.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bad.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ bad(bac bacVar, epk epkVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = bacVar;
        this.c = epkVar;
        this.a = i;
        this.b = i2;
    }
}
