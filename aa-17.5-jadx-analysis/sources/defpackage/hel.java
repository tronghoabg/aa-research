package defpackage;

/* loaded from: classes2.dex */
public final class hel {
    public static final hel a = new hel();

    public static final Object b(xs xsVar, geu geuVar, int i, int i2, afck afckVar) {
        if (i >= xsVar.get_size()) {
            return afbe.a;
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i < 0 || i >= xsVar.get_size()) {
            throw new IllegalStateException(i + " not in 0..<" + xsVar.get_size());
        }
        int iMin = Math.min((i2 + i) - 1, xsVar.get_size() - 1);
        glp glpVarT = geuVar.t();
        gnk gnkVar = gnk.O;
        gli gliVar = new gli(xsVar, i, iMin, 2);
        aitg aitgVar = new aitg(affa.s(afckVar), 1);
        aitgVar.z();
        glpVarT.t(gnkVar, new gln((afec) gliVar, glpVarT, (aitf) aitgVar, 0));
        return aitgVar.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008e -> B:27:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xs r9, defpackage.geu r10, int r11, defpackage.afck r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.hek
            if (r0 == 0) goto L13
            r0 = r12
            hek r0 = (defpackage.hek) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            hek r0 = new hek
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r8 = r0.i
            afcr r12 = defpackage.afcr.a
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L45
            if (r1 != r2) goto L3d
            int r9 = r0.h
            int r10 = r0.g
            int r11 = r0.f
            int r1 = r0.e
            java.lang.Object r3 = r0.d
            java.lang.Object r4 = r0.c
            java.lang.Object r5 = r0.b
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r8)
            r7 = r3
            r3 = r9
            r9 = r6
            r6 = r10
            r10 = r5
            r5 = r7
            goto L96
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            defpackage.woy.dF(r8)
            int r8 = r9.get_size()
            if (r8 != 0) goto L51
            afbe r8 = defpackage.afbe.a
            return r8
        L51:
            if (r11 <= 0) goto La8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1 = 0
            int r3 = r9.get_size()
            afha r1 = defpackage.afpt.m(r1, r3)
            afgy r1 = defpackage.afpt.l(r1, r11)
            int r3 = r1.a
            int r4 = r1.b
            int r1 = r1.c
            if (r1 <= 0) goto L6f
            if (r3 <= r4) goto L73
        L6f:
            if (r1 >= 0) goto La7
            if (r4 > r3) goto La7
        L73:
            r0.a = r9
            r0.b = r10
            r0.c = r8
            r0.d = r8
            r0.e = r11
            r0.f = r3
            r0.g = r4
            r0.h = r1
            r0.k = r2
            r5 = r10
            geu r5 = (defpackage.geu) r5
            java.lang.Object r5 = b(r9, r5, r3, r11, r0)
            if (r5 == r12) goto La6
            r6 = r1
            r1 = r11
            r11 = r3
            r3 = r6
            r6 = r4
            r4 = r8
            r8 = r5
            r5 = r4
        L96:
            java.util.Collection r8 = (java.util.Collection) r8
            r5.addAll(r8)
            if (r11 == r6) goto La5
            int r8 = r11 + r3
            r11 = r1
            r1 = r3
            r3 = r8
            r8 = r4
            r4 = r6
            goto L73
        La5:
            return r4
        La6:
            return r12
        La7:
            return r8
        La8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hel.a(xs, geu, int, afck):java.lang.Object");
    }
}
