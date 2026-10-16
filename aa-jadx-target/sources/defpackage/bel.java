package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bel extends defpackage.afed implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bel(defpackage.bby bbyVar, defpackage.afdk afdkVar, int i) {
        super(afdkVar);
        this.e = i;
        this.c = bbyVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [beq, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        if (this.e != 0) {
            defpackage.bel belVar = new defpackage.bel((defpackage.bby) this.c, afdkVar, 1);
            belVar.d = obj;
            return belVar;
        }
        defpackage.bel belVar2 = new defpackage.bel((defpackage.beq) this.c, afdkVar, 0);
        belVar2.d = obj;
        return belVar2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e A[LOOP:0: B:18:0x005f->B:22:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0045 A[EDGE_INSN: B:51:0x0045->B:13:0x0045 BREAK  A[LOOP:0: B:18:0x005f->B:22:0x006e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1, types: [beq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [beq, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d8 -> B:40:0x00db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bel.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (this.e != 0) {
            return ((defpackage.bel) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bel) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bel(defpackage.beq beqVar, defpackage.afdk afdkVar, int i) {
        super(afdkVar);
        this.e = i;
        this.c = beqVar;
    }
}
