package defpackage;

/* loaded from: classes2.dex */
public final class nie extends afdd implements afeg {
    int a;
    final /* synthetic */ bym b;
    final /* synthetic */ bwq c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nie(bym bymVar, bwq bwqVar, afck afckVar, int i) {
        super(afckVar);
        this.e = i;
        this.b = bymVar;
        this.c = bwqVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.e != 0) {
            nie nieVar = new nie(this.b, this.c, afckVar, 1, null);
            nieVar.d = obj;
            return nieVar;
        }
        nie nieVar2 = new nie(this.b, this.c, afckVar, 0);
        nieVar2.d = obj;
        return nieVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r4.r(r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r6 != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (r4.r(r6, r5) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0032 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:10:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:10:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:31:0x008b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c3 -> B:42:0x00c6). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L6d
            afcr r0 = defpackage.afcr.a
            int r3 = r5.a
            if (r3 == 0) goto L16
            java.lang.Object r4 = r5.d
            crl r4 = (defpackage.crl) r4
            defpackage.woy.dF(r6)
            if (r3 == r2) goto L34
            goto L59
        L16:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.d
            crl r6 = (defpackage.crl) r6
            r4 = r6
        L1e:
            yph r6 = defpackage.nhm.a
            bym r6 = r5.b
            boolean r6 = defpackage.roc.ak(r6)
            if (r6 != 0) goto L4c
            cqm r6 = defpackage.cqm.a
            r5.d = r4
            r5.a = r2
            java.lang.Object r6 = r4.r(r6, r5)
            if (r6 == r0) goto L58
        L34:
            cql r6 = (defpackage.cql) r6
            java.util.List r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L1e
            java.lang.Object r3 = r6.next()
            cqu r3 = (defpackage.cqu) r3
            r3.b()
            goto L3c
        L4c:
            cqm r6 = defpackage.cqm.b
            r5.d = r4
            r5.a = r1
            java.lang.Object r6 = r4.r(r6, r5)
            if (r6 != r0) goto L59
        L58:
            return r0
        L59:
            yph r6 = defpackage.nhm.a
            bwq r6 = r5.c
            boolean r6 = defpackage.roc.af(r6)
            if (r6 != 0) goto L1e
            kxb r6 = defpackage.lau.c()
            ywk r3 = defpackage.ywk.UNKNOWN_CANCEL_TRIGGER
            r6.j(r3)
            goto L1e
        L6d:
            afcr r0 = defpackage.afcr.a
            int r3 = r5.a
            if (r3 == 0) goto L83
            java.lang.Object r4 = r5.d
            if (r3 == r2) goto L7d
            crl r4 = (defpackage.crl) r4
            defpackage.woy.dF(r6)
            goto Lc6
        L7d:
            crl r4 = (defpackage.crl) r4
            defpackage.woy.dF(r6)
            goto La1
        L83:
            defpackage.woy.dF(r6)
            java.lang.Object r6 = r5.d
            crl r6 = (defpackage.crl) r6
            r4 = r6
        L8b:
            yph r6 = defpackage.nih.a
            bym r6 = r5.b
            boolean r6 = defpackage.roc.ak(r6)
            if (r6 != 0) goto Lb9
            cqm r6 = defpackage.cqm.a
            r5.d = r4
            r5.a = r2
            java.lang.Object r6 = r4.r(r6, r5)
            if (r6 == r0) goto Lc5
        La1:
            cql r6 = (defpackage.cql) r6
            java.util.List r6 = r6.a
            java.util.Iterator r6 = r6.iterator()
        La9:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r6.next()
            cqu r3 = (defpackage.cqu) r3
            r3.b()
            goto La9
        Lb9:
            cqm r6 = defpackage.cqm.b
            r5.d = r4
            r5.a = r1
            java.lang.Object r6 = r4.r(r6, r5)
            if (r6 != r0) goto Lc6
        Lc5:
            return r0
        Lc6:
            yph r6 = defpackage.nih.a
            bwq r6 = r5.c
            boolean r6 = defpackage.roc.af(r6)
            if (r6 != 0) goto L8b
            kxb r6 = defpackage.lau.c()
            ywk r3 = defpackage.ywk.UNKNOWN_CANCEL_TRIGGER
            r6.j(r3)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nie.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((nie) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        return ((nie) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nie(bym bymVar, bwq bwqVar, afck afckVar, int i, byte[] bArr) {
        super(afckVar);
        this.e = i;
        this.b = bymVar;
        this.c = bwqVar;
    }
}
