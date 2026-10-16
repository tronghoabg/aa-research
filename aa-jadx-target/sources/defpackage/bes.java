package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bes {
    public static final java.lang.String a = afzh.d("H", 10);

    public static final long a(defpackage.dgd dgdVar, defpackage.dlo dloVar, defpackage.wde wdeVar) throws java.io.IOException {
        defpackage.deu deuVarB = b(dgdVar, dloVar, wdeVar, 1);
        return (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarB.a.b()))) << 32) | (((long) java.lang.Math.round((float) java.lang.Math.ceil(deuVarB.d))) & 4294967295L);
    }

    public static final defpackage.deu b(defpackage.dgd dgdVar, defpackage.dlo dloVar, defpackage.wde wdeVar, int i) throws java.io.IOException {
        java.lang.String strBo = defpackage.afga.bo(new defpackage.afia(0, i - 1), "\n", null, null, new defpackage.awl(18), 30);
        defpackage.afce afceVar = defpackage.afce.a;
        return new defpackage.deu(new defpackage.dew(strBo, dgdVar, afceVar, afceVar, wdeVar, dloVar), i, 1, defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE));
    }
}
