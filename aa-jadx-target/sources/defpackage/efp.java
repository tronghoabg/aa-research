package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class efp extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efp(defpackage.ari ariVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.c = ariVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.e;
        java.lang.Object obj2 = this.c;
        if (i != 0) {
            defpackage.efp efpVar = new defpackage.efp((defpackage.ari) obj2, afdkVar, 1);
            efpVar.d = obj;
            return efpVar;
        }
        defpackage.efp efpVar2 = new defpackage.efp((defpackage.egk) obj2, afdkVar, 0);
        efpVar2.d = obj;
        return efpVar2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: all -> 0x0024, PHI: r4
  0x002e: PHI (r4v5 aiuw) = (r4v3 aiuw), (r4v4 aiuw), (r4v9 aiuw) binds: [B:15:0x0026, B:22:0x0059, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x0013, B:16:0x002e, B:19:0x003a, B:21:0x004b, B:11:0x001d), top: B:66:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0024, TRY_ENTER, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x0013, B:16:0x002e, B:19:0x003a, B:21:0x004b, B:11:0x001d), top: B:66:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x004b A[Catch: all -> 0x0024, PHI: r4 r5 r12
  0x004b: PHI (r4v4 aiuw) = (r4v5 aiuw), (r4v7 aiuw) binds: [B:20:0x0049, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r5v11 java.lang.Object) = (r5v13 java.lang.Object), (r5v17 java.lang.Object) binds: [B:20:0x0049, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r12v22 java.lang.Object) = (r12v30 java.lang.Object), (r12v0 java.lang.Object) binds: [B:20:0x0049, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x0013, B:16:0x002e, B:19:0x003a, B:21:0x004b, B:11:0x001d), top: B:66:0x000b }] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aizj, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0059 -> B:16:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efp.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.e != 0) {
            return ((defpackage.efp) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.efp) b((aizk) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efp(defpackage.egk egkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.c = egkVar;
    }
}
