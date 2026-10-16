package defpackage;

/* loaded from: classes.dex */
public final class dek {
    public final cwd a;
    public dek b;
    public long c;
    public long d;
    public long e = Long.MIN_VALUE;
    final /* synthetic */ del f;
    private final int g;
    private final afec h;

    public dek(del delVar, int i, cwd cwdVar, afec afecVar) {
        this.f = delVar;
        this.g = i;
        this.a = cwdVar;
        this.h = afecVar;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        dej dejVar;
        cwd cwdVar = this.a;
        long j5 = this.f.e;
        cyc cycVarR = bzi.r(cwdVar, 2);
        cxb cxbVarQ = bzi.q(cwdVar);
        if (!cxbVarQ.an()) {
            dejVar = null;
        } else if (cxbVarQ.q() != cycVarR) {
            long jFloatToRawIntBits = Float.floatToRawIntBits((int) (j >> 32));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits((int) (j & 4294967295L));
            long jH = cycVarR.h();
            dejVar = new dej(dlf.s(cxbVarQ.q().i(cycVarR, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L))), ((((int) (r1 >> 32)) + ((int) (jH >> 32))) << 32) | ((((int) (r1 & 4294967295L)) + ((int) (jH & 4294967295L))) & 4294967295L), j3, j4, j5, fArr, cwdVar);
        } else {
            dejVar = new dej(j, j2, j3, j4, j5, fArr, cwdVar);
        }
        if (dejVar == null) {
            return;
        }
        this.h.invoke(dejVar);
    }

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
            del r0 = r7.f
            zh r1 = r0.g
            int r2 = r7.g
            java.lang.Object r3 = r1.d(r2)
            dek r3 = (defpackage.dek) r3
            r4 = 0
            if (r3 != 0) goto L10
            goto L5d
        L10:
            boolean r5 = defpackage.affa.f(r3, r7)
            if (r5 == 0) goto L49
            dek r0 = r7.b
            r7.b = r4
            if (r0 != 0) goto L45
            cwd r7 = r7.a
            cfx r7 = r7.M()
            cxb r7 = defpackage.bzi.q(r7)
            boolean r0 = r7.am()
            if (r0 == 0) goto L7f
            cym r0 = defpackage.cxe.a(r7)
            czq r0 = (defpackage.czq) r0
            dei r0 = r0.p
            boolean r1 = defpackage.dei.h(r7)
            if (r1 == 0) goto L7f
            def r1 = r0.b
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
            dek r1 = r3.b
            if (r1 == 0) goto L5d
            if (r1 == r7) goto L56
            r3 = r1
            goto L4c
        L56:
            dek r0 = r7.b
            r3.b = r0
            r7.b = r4
            return
        L5d:
            dek r1 = r0.a
            if (r1 != r7) goto L68
            dek r1 = r1.b
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
            dek r1 = r1.b
            r0.b = r1
        L79:
            r7.b = r4
            return
        L7c:
            dek r0 = r1.b
            goto L6c
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dek.b():void");
    }
}
