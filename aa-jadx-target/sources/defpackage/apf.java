package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class apf extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    int d;
    final /* synthetic */ defpackage.aph e;
    final /* synthetic */ defpackage.afgv f;
    final /* synthetic */ afgu g;
    final /* synthetic */ defpackage.afgv h;
    final /* synthetic */ float i;
    final /* synthetic */ float j;
    private /* synthetic */ java.lang.Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apf(defpackage.aph aphVar, defpackage.afgv afgvVar, afgu afguVar, defpackage.afgv afgvVar2, float f, float f2, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.e = aphVar;
        this.f = afgvVar;
        this.g = afguVar;
        this.h = afgvVar2;
        this.i = f;
        this.j = f2;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.apf apfVar = new defpackage.apf(this.e, this.f, this.g, this.h, this.i, this.j, afdkVar);
        apfVar.k = obj;
        return apfVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0057  */
    /* JADX WARN: Code duplicated, block: B:14:0x0098  */
    /* JADX WARN: Code duplicated, block: B:16:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:20:0x0112  */
    /* JADX WARN: Code duplicated, block: B:23:0x0160  */
    /* JADX WARN: Code duplicated, block: B:25:0x0164 A[EDGE_INSN: B:25:0x0164->B:26:0x0165 BREAK  A[LOOP:0: B:10:0x0050->B:17:0x00ad]] */
    /* JADX WARN: Code duplicated, block: B:28:0x016c  */
    /* JADX WARN: Code duplicated, block: B:30:0x018c  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x018c -> B:31:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x019c -> B:33:0x019f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apf.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.apf) b((defpackage.izq) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
