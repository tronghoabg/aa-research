package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class any extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ defpackage.afgq d;
    final /* synthetic */ defpackage.afgv e;
    final /* synthetic */ defpackage.afgv f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public any(defpackage.afgq afgqVar, defpackage.afgv afgvVar, defpackage.afgv afgvVar2, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = afgqVar;
        this.e = afgvVar;
        this.f = afgvVar2;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.any anyVar = new defpackage.any(this.d, this.e, this.f, afdkVar);
        anyVar.g = obj;
        return anyVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:2: B:13:0x0049->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x005c A[EDGE_INSN: B:70:0x005c->B:19:0x005c BREAK  A[LOOP:2: B:13:0x0049->B:17:0x0058], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009e -> B:34:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.any.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.any) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
