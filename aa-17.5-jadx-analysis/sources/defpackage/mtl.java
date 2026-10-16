package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class mtl implements ctw {
    final /* synthetic */ float a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afeg c;

    public mtl(float f, boolean z, afeg afegVar) {
        this.a = f;
        this.b = z;
        this.c = afegVar;
    }

    public static final int f(cuo cuoVar, boolean z) {
        return z ? cuoVar.a : cuoVar.b;
    }

    private static final long g(long j, boolean z, int i) {
        return z ? dle.m(j, 0, i, 0, 0, 12) : dle.m(j, 0, 0, 0, i, 3);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int a(csq csqVar, List list, int i) {
        return tr.m(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int b(csq csqVar, List list, int i) {
        return tr.n(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int c(csq csqVar, List list, int i) {
        return tr.o(this, csqVar, list, i);
    }

    @Override // defpackage.ctw
    public final /* synthetic */ int d(csq csqVar, List list, int i) {
        return tr.p(this, csqVar, list, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // defpackage.ctw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ctq e(defpackage.cts r12, java.util.List r13, long r14) {
        /*
            r11 = this;
            r12.getClass()
            float r0 = r11.a
            int r1 = r12.eF(r0)
            boolean r2 = r11.b
            if (r2 == 0) goto L12
            int r3 = defpackage.dle.b(r14)
            goto L16
        L12:
            int r3 = defpackage.dle.a(r14)
        L16:
            afeg r11 = r11.c
            dle r4 = new dle
            r4.<init>(r14)
            java.lang.Object r11 = r11.invoke(r12, r4)
            dlj r11 = (defpackage.dlj) r11
            r4 = 1
            r5 = 0
            if (r11 == 0) goto L3a
            if (r4 != r2) goto L2a
            r11 = r5
        L2a:
            if (r11 == 0) goto L3a
            float r11 = r11.a
            float r11 = r11 + r0
            r0 = 0
            float r11 = r11 + r0
            int r11 = r12.eF(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L3b
        L3a:
            r11 = r5
        L3b:
            int r1 = r1 + r3
            r0 = 2
            if (r11 == 0) goto L44
            int r11 = r11.intValue()
            goto L46
        L44:
            int r11 = r1 / 2
        L46:
            java.lang.Object r1 = defpackage.woy.bF(r13)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = defpackage.woy.bp(r1, r7)
            r6.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r1.next()
            cto r8 = (defpackage.cto) r8
            long r9 = g(r14, r2, r11)
            cuo r8 = r8.v(r9)
            r6.add(r8)
            goto L5b
        L73:
            java.util.Iterator r11 = r6.iterator()
            boolean r1 = r11.hasNext()
            if (r1 != 0) goto L7e
            goto La8
        L7e:
            java.lang.Object r1 = r11.next()
            cuo r1 = (defpackage.cuo) r1
            int r1 = f(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L8c:
            r5 = r1
        L8d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r11.next()
            cuo r1 = (defpackage.cuo) r1
            int r1 = f(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r8 = r5.compareTo(r1)
            if (r8 >= 0) goto L8d
            goto L8c
        La8:
            if (r5 == 0) goto Laf
            int r11 = r5.intValue()
            int r3 = r3 - r11
        Laf:
            java.lang.Object r11 = r13.get(r4)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            int r1 = defpackage.woy.bp(r11, r7)
            r13.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        Lc2:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lda
            java.lang.Object r1 = r11.next()
            cto r1 = (defpackage.cto) r1
            long r7 = g(r14, r2, r3)
            cuo r1 = r1.v(r7)
            r13.add(r1)
            goto Lc2
        Lda:
            java.util.List[] r11 = new java.util.List[r0]
            r0 = 0
            r11[r0] = r6
            r11[r4] = r13
            java.util.List r11 = defpackage.woy.bi(r11)
            int r13 = defpackage.dle.b(r14)
            int r14 = defpackage.dle.a(r14)
            glh r15 = new glh
            r0 = 4
            r15.<init>(r11, r2, r0)
            ctq r11 = defpackage.bzi.B(r12, r13, r14, r15)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtl.e(cts, java.util.List, long):ctq");
    }
}
