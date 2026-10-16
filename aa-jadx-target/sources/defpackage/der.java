package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class der {
    public final defpackage.cwn a;
    public defpackage.der b;
    public long c;
    public long d;
    public long e = Long.MIN_VALUE;
    final /* synthetic */ defpackage.des f;
    private final int g;
    private final defpackage.affc h;

    public der(defpackage.des desVar, int i, defpackage.cwn cwnVar, defpackage.affc affcVar) {
        this.f = desVar;
        this.g = i;
        this.a = cwnVar;
        this.h = affcVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        defpackage.deq deqVar;
        defpackage.cwn cwnVar = this.a;
        long j5 = this.f.e;
        defpackage.cyl cylVarS = defpackage.cjv.s(cwnVar, 2);
        defpackage.cxl cxlVarR = defpackage.cjv.r(cwnVar);
        if (!cxlVarR.an()) {
            deqVar = null;
        } else if (cxlVarR.q() != cylVarS) {
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits((int) (j >> 32));
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits((int) (j & 4294967295L));
            long jH = cylVarS.h();
            long jD = defpackage.dlv.d(cxlVarR.q().i(cylVarS, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L)));
            deqVar = new defpackage.deq(jD, (((long) (((int) (jD >> 32)) + ((int) (jH >> 32)))) << 32) | (((long) (((int) (jD & 4294967295L)) + ((int) (jH & 4294967295L)))) & 4294967295L), j3, j4, j5, fArr, cwnVar);
        } else {
            deqVar = new defpackage.deq(j, j2, j3, j4, j5, fArr, cwnVar);
        }
        if (deqVar == null) {
            return;
        }
        this.h.invoke(deqVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c A[LOOP:1: B:32:0x006c->B:39:0x007c, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006c, code lost:
    
        r0 = r1.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            des r0 = r7.f
            zo r1 = r0.g
            int r2 = r7.g
            java.lang.Object r3 = r1.d(r2)
            der r3 = (defpackage.der) r3
            r4 = 0
            if (r3 != 0) goto L10
            goto L5d
        L10:
            boolean r5 = defpackage.afga.f(r3, r7)
            if (r5 == 0) goto L49
            der r0 = r7.b
            r7.b = r4
            if (r0 != 0) goto L45
            cwn r7 = r7.a
            cge r7 = r7.M()
            cxl r7 = defpackage.cjv.r(r7)
            boolean r0 = r7.am()
            if (r0 == 0) goto L7f
            cyu r0 = defpackage.cxo.a(r7)
            czz r0 = (defpackage.czz) r0
            dep r0 = r0.p
            boolean r1 = defpackage.dep.h(r7)
            if (r1 == 0) goto L7f
            den r1 = r0.b
            int r7 = r0.a(r7)
            r0 = 0
            r1.b(r7, r0)
            return
        L45:
            r1.h(r2, r0)
            return
        L49:
            r1.h(r2, r3)
        L4c:
            if (r3 == 0) goto L7f
            der r1 = r3.b
            if (r1 == 0) goto L5d
            if (r1 == r7) goto L56
            r3 = r1
            goto L4c
        L56:
            der r0 = r7.b
            r3.b = r0
            r7.b = r4
            return
        L5d:
            der r1 = r0.a
            if (r1 != r7) goto L68
            der r1 = r1.b
            r0.a = r1
            r7.b = r4
            return
        L68:
            if (r1 == 0) goto L6b
            goto L7c
        L6b:
            r0 = r4
        L6c:
            r6 = r1
            r1 = r0
            r0 = r6
            if (r1 == 0) goto L7f
            if (r1 != r7) goto L7c
            if (r0 == 0) goto L79
            der r1 = r1.b
            r0.b = r1
        L79:
            r7.b = r4
            return
        L7c:
            der r0 = r1.b
            goto L6c
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.der.b():void");
    }
}
