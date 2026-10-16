package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dxd extends defpackage.afee implements defpackage.affg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.a = i;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.a;
        if (i == 0) {
            return new defpackage.dxd(afdkVar, 0);
        }
        if (i == 1) {
            return new defpackage.dxd(afdkVar, 1, (byte[]) null);
        }
        if (i == 2) {
            return new defpackage.dxd(afdkVar, 2, (char[]) null);
        }
        if (i == 3) {
            return new defpackage.dxd(afdkVar, 3, (short[]) null);
        }
        if (i != 4) {
            return i != 5 ? new defpackage.dxd(afdkVar, 6, (float[]) null) : new defpackage.dxd(afdkVar, 5, (boolean[]) null);
        }
        return new defpackage.dxd(afdkVar, 4, (int[]) null);
    }

    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        int i = this.a;
        if (i == 0) {
            defpackage.afga.cz(obj);
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.afga.cz(obj);
            return android.view.Choreographer.getInstance();
        }
        if (i == 2) {
            defpackage.afga.cz(obj);
            return defpackage.afbk.a;
        }
        if (i == 3) {
            defpackage.afga.cz(obj);
            return defpackage.afbk.a;
        }
        if (i == 4) {
            defpackage.afga.cz(obj);
            try {
                ((defpackage.ool) defpackage.mkp.a.i(defpackage.ool.class)).i();
            } catch (java.lang.Exception unused) {
            }
            return defpackage.afbk.a;
        }
        if (i != 5) {
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
            ((java.lang.Boolean) obj).booleanValue();
            return new defpackage.dxd((defpackage.afdk) obj2, 0).hf(defpackage.afbk.a);
        }
        if (i == 1) {
            return new defpackage.dxd((defpackage.afdk) obj2, 1, (byte[]) null).hf(defpackage.afbk.a);
        }
        if (i == 2) {
            ((java.lang.Number) obj).floatValue();
            return new defpackage.dxd((defpackage.afdk) obj2, 2, (char[]) null).hf(defpackage.afbk.a);
        }
        if (i == 3) {
            ((java.lang.Number) obj).floatValue();
            return new defpackage.dxd((defpackage.afdk) obj2, 3, (short[]) null).hf(defpackage.afbk.a);
        }
        if (i == 4) {
            return new defpackage.dxd((defpackage.afdk) obj2, 4, (int[]) null).hf(defpackage.afbk.a);
        }
        if (i != 5) {
            ((java.lang.Number) obj).intValue();
            return new defpackage.dxd((defpackage.afdk) obj2, 6, (float[]) null).hf(defpackage.afbk.a);
        }
        ((java.lang.Number) obj).intValue();
        return new defpackage.dxd((defpackage.afdk) obj2, 5, (boolean[]) null).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, char[] cArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, float[] fArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, int[] iArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, short[] sArr) {
        super(2, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxd(defpackage.afdk afdkVar, int i, boolean[] zArr) {
        super(2, afdkVar);
        this.a = i;
    }
}
