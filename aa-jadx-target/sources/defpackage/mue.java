package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mue extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mue(hed hedVar, hsz hszVar, htb htbVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = hedVar;
        this.d = hszVar;
        this.c = htbVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, tmy] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.f == 0) {
            defpackage.mue mueVar = new defpackage.mue(this.b, (j$.time.Duration) this.c, afdkVar, (defpackage.tmy) this.d, 0);
            mueVar.e = obj;
            return mueVar;
        }
        java.lang.Object obj2 = this.b;
        hed hedVar = (hed) obj2;
        defpackage.mue mueVar2 = new defpackage.mue(hedVar, (hsz) this.d, (htb) this.c, afdkVar, 1);
        mueVar2.e = obj;
        return mueVar2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[PHI: r6
  0x00cf: PHI (r6v3 tc) = (r6v1 tc), (r6v2 tc), (r6v4 tc), (r6v7 tc) binds: [B:37:0x00ce, B:55:0x013f, B:19:0x005d, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1 A[PHI: r6
  0x00e1: PHI (r6v2 tc) = (r6v3 tc), (r6v6 tc) binds: [B:39:0x00df, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x013f -> B:38:0x00cf). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mue.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.f != 0) {
            return ((defpackage.mue) b((aiyu) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.mue) b((defpackage.tc) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mue(java.lang.Object obj, j$.time.Duration duration, defpackage.afdk afdkVar, defpackage.tmy tmyVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.b = obj;
        this.c = duration;
        this.d = tmyVar;
    }
}
