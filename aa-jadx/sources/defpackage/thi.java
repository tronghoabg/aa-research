package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class thi {
    public static final defpackage.thi a = new defpackage.thi();
    public static final java.util.Map b;

    static {
        java.util.Map mapSynchronizedMap = j$.util.DesugarCollections.synchronizedMap(new java.util.LinkedHashMap());
        mapSynchronizedMap.getClass();
        b = mapSynchronizedMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.tgf tgfVar, defpackage.thg thgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.thh thhVar;
        if (afdkVar instanceof defpackage.thh) {
            thhVar = (defpackage.thh) afdkVar;
            int i = thhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                thhVar.c = i - Integer.MIN_VALUE;
            } else {
                thhVar = new defpackage.thh(this, afdkVar);
            }
        } else {
            thhVar = new defpackage.thh(this, afdkVar);
        }
        java.lang.Object obj = thhVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = thhVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            long millis = thgVar.a.toMillis();
            thhVar.d = tgfVar;
            thhVar.e = thgVar;
            thhVar.c = 1;
            if (defpackage.aipw.c(millis, thhVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            thgVar = thhVar.e;
            tgfVar = thhVar.d;
            defpackage.afga.cz(obj);
        }
        int i3 = thgVar.b;
        defpackage.tgg.a.d(tgfVar, 2);
        return defpackage.afbk.a;
    }
}
