package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsq extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ aiyk c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsq(aiyk aiykVar, defpackage.kte kteVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.f = i;
        this.c = aiykVar;
        this.d = kteVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.f;
        if (i == 0) {
            defpackage.bsq bsqVar = new defpackage.bsq(this.c, (defpackage.kte) this.d, afdkVar, 0, null, null);
            bsqVar.e = obj;
            return bsqVar;
        }
        if (i != 1) {
            defpackage.bsq bsqVar2 = new defpackage.bsq(this.c, (defpackage.kte) this.d, afdkVar, 2);
            bsqVar2.e = obj;
            return bsqVar2;
        }
        defpackage.bsq bsqVar3 = new defpackage.bsq(this.c, (defpackage.kte) this.d, afdkVar, 1, null);
        bsqVar3.e = obj;
        return bsqVar3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a2 -> B:27:0x00a5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0108 -> B:42:0x010b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsq.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((defpackage.bsq) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return ((defpackage.bsq) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bsq) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsq(aiyk aiykVar, defpackage.kte kteVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.f = i;
        this.c = aiykVar;
        this.d = kteVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsq(aiyk aiykVar, defpackage.kte kteVar, defpackage.afdk afdkVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, afdkVar);
        this.f = i;
        this.c = aiykVar;
        this.d = kteVar;
    }
}
