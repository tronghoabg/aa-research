package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class arh extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.afgv c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arh(defpackage.afgv afgvVar, defpackage.aoj aojVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.c = afgvVar;
        this.d = aojVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.f != 0) {
            defpackage.arh arhVar = new defpackage.arh(this.c, (defpackage.aoj) this.d, afdkVar, 1);
            arhVar.e = obj;
            return arhVar;
        }
        defpackage.arh arhVar2 = new defpackage.arh((defpackage.ari) this.d, this.c, afdkVar, 0);
        arhVar2.e = obj;
        return arhVar2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0049 -> B:22:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004f -> B:25:0x0050). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a2 -> B:37:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arh.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.f != 0) {
            return ((defpackage.arh) b((defpackage.affc) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.arh) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arh(defpackage.ari ariVar, defpackage.afgv afgvVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.d = ariVar;
        this.c = afgvVar;
    }
}
