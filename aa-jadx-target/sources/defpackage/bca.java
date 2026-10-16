package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bca {
    public static final defpackage.bbz a;
    public static final defpackage.bbo b;

    static {
        defpackage.bbz bbzVar = new defpackage.bbz(0);
        a = bbzVar;
        b = new defpackage.bbo(defpackage.afce.a, 0, 0, 0, defpackage.apn.b, 0, 0, 0, defpackage.arx.a, new defpackage.ayf(2), ahoi.b(defpackage.afdp.a), bbzVar, defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE));
    }

    public static final long a(defpackage.bbo bboVar, int i) {
        int i2 = bboVar.c;
        int i3 = bboVar.b + i2;
        long jA = bboVar.a();
        long j = bboVar.d;
        long j2 = i2;
        int iD = (int) (bboVar.e == defpackage.apn.b ? bboVar.d() >> 32 : bboVar.d() & 4294967295L);
        long j3 = i;
        defpackage.ary aryVar = bboVar.n;
        bboVar.a();
        long jG = ((((j3 * ((long) i3)) + jA) + j) - j2) - ((long) (iD - defpackage.afqt.g(0, 0, iD)));
        if (jG < 0) {
            return 0L;
        }
        return jG;
    }

    public static final defpackage.bby b(int i, defpackage.afer aferVar, defpackage.bve bveVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        defpackage.cdz cdzVar = defpackage.bau.b;
        boolean zA = bveVar.A(i) | bveVar.z(0.0f) | bveVar.C(aferVar);
        java.lang.Object objG = bveVar.g();
        if (zA || objG == defpackage.bvd.a) {
            objG = new defpackage.bkt(i, aferVar, 1);
            bveVar.x(objG);
        }
        defpackage.bau bauVar = (defpackage.bau) defpackage.bxi.i(objArr, cdzVar, (defpackage.afer) objG, bveVar, 0);
        bauVar.a.b(aferVar);
        return bauVar;
    }
}
