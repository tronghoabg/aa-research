package defpackage;

/* loaded from: classes2.dex */
public final class hgi extends afdd implements afeg {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(afdr afdrVar, afck afckVar, int i) {
        super(afckVar);
        this.d = i;
        this.b = afdrVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [afec, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.d;
        if (i == 0) {
            hgi hgiVar = new hgi((afdr) this.b, afckVar, 0);
            hgiVar.c = obj;
            return hgiVar;
        }
        if (i == 1) {
            hgi hgiVar2 = new hgi((afec) this.b, afckVar, 1);
            hgiVar2.c = obj;
            return hgiVar2;
        }
        if (i != 2) {
            hgi hgiVar3 = new hgi((afec) this.b, afckVar, 3, (char[]) null);
            hgiVar3.c = obj;
            return hgiVar3;
        }
        hgi hgiVar4 = new hgi((afec) this.b, afckVar, 2, (byte[]) null);
        hgiVar4.c = obj;
        return hgiVar4;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Type inference failed for: r4v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v25, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [afdr, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:12:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:27:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b9 -> B:45:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f5 -> B:55:0x00f8). Please report as a decompilation issue!!! */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgi.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((hgi) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((hgi) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 2) {
            return ((hgi) b((crl) obj, (afck) obj2)).hT(afak.a);
        }
        return ((hgi) b((crl) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(afec afecVar, afck afckVar, int i) {
        super(afckVar);
        this.d = i;
        this.b = afecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(afec afecVar, afck afckVar, int i, byte[] bArr) {
        super(afckVar);
        this.d = i;
        this.b = afecVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgi(afec afecVar, afck afckVar, int i, char[] cArr) {
        super(afckVar);
        this.d = i;
        this.b = afecVar;
    }
}
