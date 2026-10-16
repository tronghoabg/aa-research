package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsr extends defpackage.afee implements defpackage.affg {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsr(gwm gwmVar, gwk gwkVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.a = gwmVar;
        this.b = gwkVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.d;
        if (i == 0) {
            defpackage.bsr bsrVar = new defpackage.bsr((defpackage.kte) this.a, (defpackage.bcr) this.b, afdkVar, 0, null);
            bsrVar.c = obj;
            return bsrVar;
        }
        if (i == 1) {
            defpackage.bsr bsrVar2 = new defpackage.bsr((defpackage.kte) this.a, (defpackage.bcr) this.b, afdkVar, 1, null, null);
            bsrVar2.c = obj;
            return bsrVar2;
        }
        java.lang.Object obj2 = this.a;
        if (i != 2) {
            defpackage.bsr bsrVar3 = new defpackage.bsr((defpackage.kte) obj2, (defpackage.bcr) this.b, afdkVar, 3);
            bsrVar3.c = obj;
            return bsrVar3;
        }
        defpackage.bsr bsrVar4 = new defpackage.bsr((gwm) obj2, (gwk) this.b, afdkVar, 2);
        bsrVar4.c = obj;
        return bsrVar4;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.d;
        if (i == 0) {
            defpackage.afga.cz(obj);
            aiuw aiuwVar = (aiuw) this.c;
            java.lang.Object obj2 = this.b;
            defpackage.kte kteVar = (defpackage.kte) this.a;
            defpackage.bcr bcrVar = (defpackage.bcr) obj2;
            ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar, bcrVar, (defpackage.afdk) null, 10, (byte[]) null), 3);
            ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar, bcrVar, (defpackage.afdk) null, 11, (char[]) null), 3);
            ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar, bcrVar, (defpackage.afdk) null, 12, (short[]) null), 3);
            return ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar, bcrVar, (defpackage.afdk) null, 13, (int[]) null), 3);
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            aiuw aiuwVar2 = (aiuw) this.c;
            java.lang.Object obj3 = this.b;
            defpackage.kte kteVar2 = (defpackage.kte) this.a;
            defpackage.bcr bcrVar2 = (defpackage.bcr) obj3;
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar2, bcrVar2, (defpackage.afdk) null, 4, (boolean[]) null), 3);
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar2, bcrVar2, (defpackage.afdk) null, 5, (byte[]) null, (byte[]) null), 3);
            ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar2, bcrVar2, (defpackage.afdk) null, 6, (char[]) null, (byte[]) null), 3);
            return ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.bnx(kteVar2, bcrVar2, (defpackage.afdk) null, 7, (short[]) null, (byte[]) null), 3);
        }
        if (i == 2) {
            defpackage.afga.cz(obj);
            aiuw aiuwVar3 = (aiuw) this.c;
            java.lang.Object obj4 = this.b;
            gwm gwmVar = (gwm) this.a;
            gwk gwkVar = (gwk) obj4;
            ahoc.d(aiuwVar3, (defpackage.afdo) null, 0, new defpackage.ehz(gwmVar, gwkVar, (defpackage.afdk) null, 14), 3);
            ahoc.d(aiuwVar3, (defpackage.afdo) null, 0, new defpackage.ehz(gwmVar, gwkVar, (defpackage.afdk) null, 15, (byte[]) null), 3);
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        aiuw aiuwVar4 = (aiuw) this.c;
        java.lang.Object obj5 = this.b;
        defpackage.kte kteVar3 = (defpackage.kte) this.a;
        defpackage.bcr bcrVar3 = (defpackage.bcr) obj5;
        ahoc.d(aiuwVar4, (defpackage.afdo) null, 0, new defpackage.jwp(kteVar3, bcrVar3, (defpackage.afdk) null, 3, (byte[]) null), 3);
        ahoc.d(aiuwVar4, (defpackage.afdo) null, 0, new defpackage.jwp(kteVar3, bcrVar3, (defpackage.afdk) null, 4, (char[]) null), 3);
        ahoc.d(aiuwVar4, (defpackage.afdo) null, 0, new defpackage.jwp(kteVar3, bcrVar3, (defpackage.afdk) null, 5, (short[]) null), 3);
        return ahoc.d(aiuwVar4, (defpackage.afdo) null, 0, new defpackage.jwp(kteVar3, bcrVar3, (defpackage.afdk) null, 6, (int[]) null), 3);
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((defpackage.bsr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return ((defpackage.bsr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 2) {
            return ((defpackage.bsr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.bsr) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsr(defpackage.kte kteVar, defpackage.bcr bcrVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.d = i;
        this.a = kteVar;
        this.b = bcrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsr(defpackage.kte kteVar, defpackage.bcr bcrVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.d = i;
        this.a = kteVar;
        this.b = bcrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsr(defpackage.kte kteVar, defpackage.bcr bcrVar, defpackage.afdk afdkVar, int i, byte[] bArr, byte[] bArr2) {
        super(2, afdkVar);
        this.d = i;
        this.a = kteVar;
        this.b = bcrVar;
    }
}
