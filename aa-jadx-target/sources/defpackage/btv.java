package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class btv extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btv(defpackage.aph aphVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = aphVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.d;
        if (i == 0) {
            defpackage.btv btvVar = new defpackage.btv((defpackage.btw) this.b, afdkVar, 0);
            btvVar.c = obj;
            return btvVar;
        }
        if (i == 1) {
            defpackage.btv btvVar2 = new defpackage.btv((defpackage.aph) this.b, afdkVar, 1);
            btvVar2.c = obj;
            return btvVar2;
        }
        java.lang.Object obj2 = this.b;
        if (i != 2) {
            defpackage.btv btvVar3 = new defpackage.btv((defpackage.byl) obj2, afdkVar, 3);
            btvVar3.c = obj;
            return btvVar3;
        }
        defpackage.btv btvVar4 = new defpackage.btv((defpackage.egk) obj2, afdkVar, 2);
        btvVar4.c = obj;
        return btvVar4;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0096 A[Catch: all -> 0x008c, PHI: r5
  0x0096: PHI (r5v3 aiuw) = (r5v1 aiuw), (r5v2 aiuw), (r5v6 aiuw) binds: [B:42:0x008e, B:49:0x00d4, B:35:0x0082] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:35:0x0082, B:43:0x0096, B:46:0x00a2, B:48:0x00b0, B:38:0x0088), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #0 {all -> 0x008c, blocks: (B:35:0x0082, B:43:0x0096, B:46:0x00a2, B:48:0x00b0, B:38:0x0088), top: B:63:0x007a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0 A[Catch: all -> 0x008c, PHI: r5 r10
  0x00b0: PHI (r5v2 aiuw) = (r5v3 aiuw), (r5v5 aiuw) binds: [B:47:0x00ae, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r10v5 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:47:0x00ae, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:35:0x0082, B:43:0x0096, B:46:0x00a2, B:48:0x00b0, B:38:0x0088), top: B:63:0x007a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:43:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btv.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((defpackage.btv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.btv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 2) {
            return ((defpackage.btv) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.btv) b((defpackage.wde) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btv(defpackage.btw btwVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = btwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btv(defpackage.byl bylVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = bylVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public btv(defpackage.egk egkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.b = egkVar;
    }
}
