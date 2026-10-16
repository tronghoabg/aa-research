package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class axu extends defpackage.afee implements defpackage.affg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axu(defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.a = i;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.a;
        if (i != 0) {
            return i != 1 ? new defpackage.axu(afdkVar, 2, (char[]) null) : new defpackage.axu(afdkVar, 1, (byte[]) null);
        }
        return new defpackage.axu(afdkVar, 0);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.a;
        if (i == 0) {
            defpackage.afga.cz(obj);
            return defpackage.afbk.a;
        }
        if (i != 1) {
            defpackage.afga.cz(obj);
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i == 0) {
            return new defpackage.axu((defpackage.afdk) obj2, 0).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return new defpackage.axu((defpackage.afdk) obj2, 2, (char[]) null).hf(defpackage.afbk.a);
        }
        return new defpackage.axu((defpackage.afdk) obj2, 1, (byte[]) null).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axu(defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axu(defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.a = i;
    }
}
