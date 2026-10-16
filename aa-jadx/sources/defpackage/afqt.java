package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afqt {
    private afqt() {
    }

    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static float b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static float d(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static int e(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int f(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static int g(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bz(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
        }
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static long h(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long i(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static long j(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[RETURN] */
    public static java.lang.Comparable k(java.lang.Comparable comparable, java.lang.Comparable comparable2, java.lang.Comparable comparable3) {
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 == null || comparable.compareTo(comparable2) >= 0) {
                if (comparable3 == null || comparable.compareTo(comparable3) <= 0) {
                    return comparable;
                }
                return comparable3;
            }
            return comparable2;
        }
        if (comparable2.compareTo(comparable3) > 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bv(comparable2, comparable3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
        }
        if (comparable.compareTo(comparable2) >= 0) {
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
            return comparable;
        }
        return comparable2;
    }

    public static defpackage.afhy l(defpackage.afhy afhyVar, int i) {
        afhyVar.getClass();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(numValueOf, "Step must be positive, was: ", "."));
        }
        if (afhyVar.c <= 0) {
            i = -i;
        }
        return new defpackage.afhy(afhyVar.a, afhyVar.b, i);
    }

    public static defpackage.afia m(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? defpackage.afia.d : new defpackage.afia(i, i2 - 1);
    }

    public static java.lang.Comparable n(java.lang.Comparable comparable, defpackage.afhw afhwVar) {
        afhwVar.getClass();
        if (afhwVar.b()) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(afhwVar, "Cannot coerce value to an empty range: ", "."));
        }
        if (!defpackage.afhw.e(comparable, afhwVar.d()) || defpackage.afhw.e(afhwVar.d(), comparable)) {
            return (!defpackage.afhw.e(afhwVar.c(), comparable) || defpackage.afhw.e(comparable, afhwVar.c())) ? comparable : afhwVar.c();
        }
        return afhwVar.d();
    }

    public static double o(double d) {
        if (d > 1.0d) {
            return 1.0d;
        }
        return d;
    }

    public static long p(long j) {
        java.lang.Long l = -4611686018427387903L;
        if (j < l.longValue()) {
            return l.longValue();
        }
        java.lang.Long l2 = 4611686018427387903L;
        if (j <= l2.longValue()) {
            return j;
        }
        java.lang.Long l3 = 4611686018427387903L;
        return l3.longValue();
    }

    public static /* synthetic */ defpackage.aiyk q(int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if (i == -2) {
            return i2 == 1 ? new defpackage.aiyg(defpackage.aiyj.a) : new defpackage.aiys(1, i2);
        }
        if (i == -1) {
            if (i2 == 1) {
                return new defpackage.aiys(1, 2);
            }
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == 0) {
            return i2 == 1 ? new defpackage.aiyg(0) : new defpackage.aiys(1, i2);
        }
        if (i != Integer.MAX_VALUE) {
            return i2 == 1 ? new defpackage.aiyg(i) : new defpackage.aiys(i, i2);
        }
        return new defpackage.aiyg(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
    }

    public static /* synthetic */ java.lang.String r(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    public /* synthetic */ afqt(defpackage.affu affuVar) {
        this();
    }
}
