package defpackage;

/* loaded from: classes.dex */
public final class bej extends afdd implements afeg {
    Object a;
    int b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(bbt bbtVar, afck afckVar, int i) {
        super(afckVar);
        this.e = i;
        this.c = bbtVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ben, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        if (this.e != 0) {
            bej bejVar = new bej((bbt) this.c, afckVar, 1);
            bejVar.d = obj;
            return bejVar;
        }
        bej bejVar2 = new bej((ben) this.c, afckVar, 0);
        bejVar2.d = obj;
        return bejVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r14 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d8, code lost:
    
        if (r14 != r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Type inference failed for: r13v1, types: [ben, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ben, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d8 -> B:40:0x00db). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bej.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((bej) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        return ((bej) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bej(ben benVar, afck afckVar, int i) {
        super(afckVar);
        this.e = i;
        this.c = benVar;
    }
}
