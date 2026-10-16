package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class amr {
    public static final defpackage.affc a = new defpackage.ajg(9);
    public static final defpackage.affc b = new defpackage.ajg(10);
    public static final defpackage.kwv c = new defpackage.kwv(new defpackage.amm(), (char[]) null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object a(defpackage.afer aferVar, defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.amo amoVar;
        if (afdkVar instanceof defpackage.amo) {
            amoVar = (defpackage.amo) afdkVar;
            int i = amoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                amoVar.b = i - Integer.MIN_VALUE;
            } else {
                amoVar = new defpackage.amo(afdkVar);
            }
        } else {
            amoVar = new defpackage.amo(afdkVar);
        }
        java.lang.Object obj = amoVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = amoVar.b;
        try {
            if (i2 == 0) {
                defpackage.afga.cz(obj);
                defpackage.aqx aqxVar = new defpackage.aqx(aferVar, affgVar, (defpackage.afdk) null, 1);
                amoVar.b = 1;
                if (ahoi.a(aqxVar, amoVar) == afdrVar) {
                    return afdrVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.afga.cz(obj);
            }
        } catch (defpackage.ami unused) {
        }
        return defpackage.afbk.a;
    }
}
