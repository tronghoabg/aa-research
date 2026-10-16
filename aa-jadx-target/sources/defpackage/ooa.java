package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ooa {
    public static boolean a;

    public static final java.lang.String a(android.content.Context context, long j) {
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        return epochMilli - j < 60000 ? context.getString(2132084652) : android.text.format.DateUtils.getRelativeTimeSpanString(j, epochMilli, 60000L, 262144).toString();
    }

    public static void b() {
    }

    public static final int c(defpackage.qsh qshVar) throws defpackage.qst {
        return qshVar.a().a();
    }

    public static final com.google.android.gms.car.CarInfo d(defpackage.qsh qshVar) throws defpackage.qst {
        return qshVar.a().c();
    }

    public static final defpackage.rpb e(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().x();
    }

    public static final defpackage.rpe f(defpackage.qsh qshVar) throws defpackage.qsu, defpackage.qst {
        return qshVar.a().y();
    }

    public static final rpg g(defpackage.qsh qshVar, java.lang.String str) throws defpackage.qsu, defpackage.qst {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        return (rpg) reiVarD.f.a(new defpackage.rdt(reiVarD, str, 3));
    }

    public static final boolean h(defpackage.qsh qshVar) {
        defpackage.rei reiVarD = ((defpackage.qtv) qshVar).d();
        try {
            return ((java.lang.Boolean) reiVarD.f.d(new defpackage.rdg(reiVarD.C(), 9), java.lang.Boolean.FALSE)).booleanValue();
        } catch (android.os.RemoteException | java.lang.IllegalStateException unused) {
            return false;
        }
    }

    public static final boolean i(java.lang.String str) {
        return a || defpackage.rrx.e(str, 3);
    }

    public static int j(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int k(int i) {
        int[] iArrK = defpackage.acmj.k();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrK[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static int l(java.lang.Integer num) {
        return ((java.lang.Integer) new defpackage.nub(num).i(0)).intValue();
    }

    public static /* synthetic */ java.lang.String m(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "CAR_SERVICE_LITE";
        }
        return "CAR_SERVICE_DEFAULT";
    }
}
