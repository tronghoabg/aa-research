package defpackage;

/* loaded from: classes2.dex */
public final class giy extends afde implements afeg {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = cilVar;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            return new giy((cil) this.c, afckVar, 0);
        }
        if (i == 1) {
            return new giy((fqd) this.c, afckVar, 1);
        }
        if (i == 2) {
            return new giy((cil) this.c, afckVar, 2, (byte[]) null);
        }
        Object obj2 = this.c;
        return i != 3 ? new giy((xsg) obj2, afckVar, 4) : new giy((cil) obj2, afckVar, 3, (char[]) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (defpackage.adu.k(r0, r1, r2, null, r12, 12) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0.e(r1, r12) == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.giy.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((giy) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((giy) b((fsy) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((giy) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((giy) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((giy) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(cil cilVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.d = i;
        this.c = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(cil cilVar, afck afckVar, int i, char[] cArr) {
        super(2, afckVar);
        this.d = i;
        this.c = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(fqd fqdVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = fqdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giy(xsg xsgVar, afck afckVar, int i) {
        super(2, afckVar);
        this.d = i;
        this.c = xsgVar;
    }
}
