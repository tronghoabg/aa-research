package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbd {
    public dbd() {
        new afen(1);
    }

    public static final void a(android.view.View view, float f) {
        hz$.ExternalSyntheticApiModelOutline2.m(view, f);
    }

    public static final boolean b(java.util.List list) {
        java.util.List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = defpackage.afce.a;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Object obj = list.get(0);
            int size = list.size() - 1;
            int i = 0;
            while (i < size) {
                i++;
                java.lang.Object obj2 = list.get(i);
                defpackage.dec decVar = (defpackage.dec) obj2;
                defpackage.dec decVar2 = (defpackage.dec) obj;
                arrayList.add(new defpackage.cji((((long) java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (decVar2.b().a() >> 32)) - java.lang.Float.intBitsToFloat((int) (decVar.b().a() >> 32))))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (decVar2.b().a() & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (decVar.b().a() & 4294967295L))))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((defpackage.cji) defpackage.afga.az(list2)).a;
        } else {
            if (list2.isEmpty()) {
                defpackage.dmh.b("Empty collection can't be reduced.");
            }
            java.lang.Object objAz = defpackage.afga.az(list2);
            int size2 = list2.size() - 1;
            if (size2 > 0) {
                int i2 = 1;
                while (true) {
                    objAz = new defpackage.cji(defpackage.a.ah(((defpackage.cji) objAz).a, ((defpackage.cji) list2.get(i2)).a));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((defpackage.cji) objAz).a;
        }
        return java.lang.Float.intBitsToFloat((int) (4294967295L & j)) < java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean c(defpackage.dec decVar) {
        return (decVar.g().g(defpackage.def.f) == null && decVar.g().g(defpackage.def.e) == null) ? false : true;
    }

    public static final boolean d(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean e(defpackage.cju cjuVar, float f, float f2) {
        defpackage.cjj cjjVar = new defpackage.cjj(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        defpackage.cju cjuVar2 = new defpackage.cju((byte[]) null);
        cjuVar2.q(cjjVar);
        defpackage.cju cjuVar3 = new defpackage.cju((byte[]) null);
        cjuVar3.o(cjuVar, cjuVar2, 1);
        boolean zIsEmpty = cjuVar3.a.isEmpty();
        cjuVar3.k();
        cjuVar2.k();
        return !zIsEmpty;
    }

    public static final java.io.File f(android.content.Context context) {
        java.io.File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        return databasePath;
    }

    public static final fkz g(boolean z) {
        fla flaVar = new fla();
        return z ? new flb(flaVar) : flaVar;
    }

    public static defpackage.gkc h(fkz fkzVar, fok fokVar) {
        fokVar.getClass();
        return fkzVar.d(dtb.q(fokVar));
    }

    public dbd(byte[] bArr) {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        java.util.List list2 = java.util.Collections.EMPTY_LIST;
    }
}
