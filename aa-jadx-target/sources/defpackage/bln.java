package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bln extends defpackage.afee implements defpackage.affc {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bln(defpackage.aeb aebVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.b = i;
        this.a = aebVar;
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.b;
        if (i == 0) {
            defpackage.afga.cz(obj);
            ((defpackage.blw) this.a).s = false;
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            ((defpackage.aeb) this.a).g();
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.afga.cz(obj);
            ((defpackage.blw) this.a).z();
            return defpackage.afbk.a;
        }
        if (i != 3) {
            defpackage.afga.cz(obj);
            ((defpackage.blw) this.a).A();
            return defpackage.afbk.a;
        }
        defpackage.afga.cz(obj);
        defpackage.blw blwVar = (defpackage.blw) this.a;
        blwVar.y(blwVar.s);
        return defpackage.afbk.a;
    }

    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        int i = this.b;
        if (i == 0) {
            return new defpackage.bln((defpackage.blw) this.a, (defpackage.afdk) obj, 0).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return new defpackage.bln((defpackage.aeb) this.a, (defpackage.afdk) obj, 1).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            return new defpackage.bln((defpackage.blw) this.a, (defpackage.afdk) obj, 2, (byte[]) null).hf(defpackage.afbk.a);
        }
        if (i != 3) {
            return new defpackage.bln((defpackage.blw) this.a, (defpackage.afdk) obj, 4, (short[]) null).hf(defpackage.afbk.a);
        }
        return new defpackage.bln((defpackage.blw) this.a, (defpackage.afdk) obj, 3, (char[]) null).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bln(defpackage.blw blwVar, defpackage.afdk afdkVar, int i) {
        super(1, afdkVar);
        this.b = i;
        this.a = blwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bln(defpackage.blw blwVar, defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(1, afdkVar);
        this.b = i;
        this.a = blwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bln(defpackage.blw blwVar, defpackage.afdk afdkVar, int i, char[] cArr) {
        super(1, afdkVar);
        this.b = i;
        this.a = blwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bln(defpackage.blw blwVar, defpackage.afdk afdkVar, int i, short[] sArr) {
        super(1, afdkVar);
        this.b = i;
        this.a = blwVar;
    }
}
