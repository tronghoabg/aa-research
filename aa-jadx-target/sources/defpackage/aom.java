package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aom extends defpackage.afee implements defpackage.affh {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aom(defpackage.afdk afdkVar, int i) {
        super(3, afdkVar);
        this.a = i;
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

    @Override // defpackage.affh
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.a;
        if (i == 0) {
            ((java.lang.Number) obj2).floatValue();
            return new defpackage.aom((defpackage.afdk) obj3, 0).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            long j = ((defpackage.cji) obj2).a;
            return new defpackage.aom((defpackage.afdk) obj3, 2, (char[]) null).hf(defpackage.afbk.a);
        }
        long j2 = ((defpackage.cji) obj2).a;
        return new defpackage.aom((defpackage.afdk) obj3, 1, (byte[]) null).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aom(defpackage.afdk afdkVar, int i, byte[] bArr) {
        super(3, afdkVar);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aom(defpackage.afdk afdkVar, int i, char[] cArr) {
        super(3, afdkVar);
        this.a = i;
    }
}
