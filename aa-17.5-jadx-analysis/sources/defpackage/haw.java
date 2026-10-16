package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class haw implements gmo {
    public xs a() {
        throw null;
    }

    protected abstract ham b(uf ufVar, geu geuVar);

    protected abstract haw c(List list);

    public List d() {
        throw null;
    }

    public abstract boolean e();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.geu r6, defpackage.afck r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hau
            if (r0 == 0) goto L13
            r0 = r7
            hau r0 = (defpackage.hau) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hau r0 = new hau
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.woy.dF(r7)
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.woy.dF(r7)
            xs r7 = r5.a()
            if (r7 != 0) goto L41
            return r5
        L41:
            hel r2 = defpackage.hel.a
            r0.a = r6
            r0.b = r5
            r0.e = r3
            r3 = 100
            java.lang.Object r7 = r2.a(r7, r6, r3, r0)
            if (r7 == r1) goto L82
            r0 = r7
            r7 = r5
        L53:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.woy.bp(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L64:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r0.next()
            uf r2 = (defpackage.uf) r2
            r3 = r6
            geu r3 = (defpackage.geu) r3
            ham r2 = r5.b(r2, r3)
            r1.add(r2)
            goto L64
        L7b:
            haw r7 = (defpackage.haw) r7
            haw r5 = r7.c(r1)
            return r5
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haw.g(geu, afck):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.geu r6, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hav
            if (r0 == 0) goto L13
            r0 = r7
            hav r0 = (defpackage.hav) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hav r0 = new hav
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            afcr r1 = defpackage.afcr.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.woy.dF(r7)
            r4 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            goto L52
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.woy.dF(r7)
            xs r7 = r5.a()
            if (r7 != 0) goto L41
            return r5
        L41:
            r0.a = r6
            r0.b = r5
            r0.e = r3
            r2 = 0
            r3 = 100
            java.lang.Object r7 = defpackage.hel.b(r7, r6, r2, r3, r0)
            if (r7 == r1) goto L81
            r0 = r7
            r7 = r5
        L52:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.woy.bp(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r0.next()
            uf r2 = (defpackage.uf) r2
            r3 = r6
            geu r3 = (defpackage.geu) r3
            ham r2 = r5.b(r2, r3)
            r1.add(r2)
            goto L63
        L7a:
            haw r7 = (defpackage.haw) r7
            haw r5 = r7.c(r1)
            return r5
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haw.h(geu, afck):java.lang.Object");
    }

    public final boolean i() {
        xs xsVarA = a();
        return xsVarA == null || xsVarA.get_size() == 0 || xsVarA.get_size() == d().size();
    }
}
