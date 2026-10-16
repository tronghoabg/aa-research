package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class eex extends afde implements afeg {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    /* synthetic */ Object f;
    final /* synthetic */ List g;
    final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eex(List list, List list2, afck afckVar) {
        super(2, afckVar);
        this.g = list;
        this.h = list2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        eex eexVar = new eex(this.g, this.h, afckVar);
        eexVar.f = obj;
        return eexVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            afcr r1 = defpackage.afcr.a
            int r2 = r8.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L23
            if (r2 == r3) goto L14
            java.lang.Object r0 = r8.b
            java.lang.Object r2 = r8.a
            defpackage.woy.dF(r9)
            goto L31
        L14:
            java.lang.Object r0 = r8.d
            java.lang.Object r2 = r8.c
            java.lang.Object r5 = r8.b
            java.lang.Object r6 = r8.a
            defpackage.woy.dF(r9)
            r7 = r6
            r6 = r2
            r2 = r7
            goto L54
        L23:
            defpackage.woy.dF(r9)
            java.util.List r9 = r8.g
            java.util.List r2 = r8.h
            java.util.Iterator r9 = r9.iterator()
            r7 = r0
            r0 = r9
            r9 = r7
        L31:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r0.next()
            eet r5 = (defpackage.eet) r5
            r8.f = r4
            r8.a = r2
            r8.b = r0
            r8.c = r5
            r8.d = r9
            r8.e = r3
            java.lang.Object r6 = r5.c()
            if (r6 == r1) goto L7c
            r7 = r0
            r0 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L54:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L79
            eew r9 = new eew
            r0 = 0
            r9.<init>(r6, r4, r0)
            r2.add(r9)
            r8.f = r4
            r8.a = r2
            r8.b = r5
            r8.c = r4
            r8.d = r4
            r9 = 2
            r8.e = r9
            java.lang.Object r9 = r6.b()
            if (r9 == r1) goto L7c
            goto L7a
        L79:
            r9 = r0
        L7a:
            r0 = r5
            goto L31
        L7c:
            return r1
        L7d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eex.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((eex) b(obj, (afck) obj2)).hT(afak.a);
    }
}
