package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dqc {
    public static final java.lang.Object a = new java.lang.String("FIXED_DIMENSION");
    public static final java.lang.Object b = new java.lang.String("WRAP_DIMENSION");
    public static final java.lang.Object c = new java.lang.String("SPREAD_DIMENSION");
    public static final java.lang.Object d = new java.lang.String("PARENT_DIMENSION");
    public static final java.lang.Object e = new java.lang.String("PERCENT_DIMENSION");
    public static final java.lang.Object f = new java.lang.String("RATIO_DIMENSION");
    public int g;
    public int h;
    public float i;
    int j;
    public java.lang.String k;
    public java.lang.Object l;
    public boolean m;

    private dqc() {
        this.g = 0;
        this.h = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.l = b;
        this.m = false;
    }

    public static defpackage.dqc a(int i) {
        defpackage.dqc dqcVar = new defpackage.dqc(a);
        dqcVar.l = null;
        dqcVar.j = i;
        return dqcVar;
    }

    public static defpackage.dqc b(java.lang.Object obj) {
        defpackage.dqc dqcVar = new defpackage.dqc(a);
        dqcVar.l = obj;
        return dqcVar;
    }

    public static defpackage.dqc c(java.lang.Object obj) {
        defpackage.dqc dqcVar = new defpackage.dqc();
        dqcVar.f(obj);
        return dqcVar;
    }

    public final void d(defpackage.dqv dqvVar, int i) {
        java.lang.String str = this.k;
        if (str != null) {
            dqvVar.y(str);
        }
        boolean z = this.m;
        int i2 = 0;
        if (i == 0) {
            if (z) {
                dqvVar.aa(3);
                java.lang.Object obj = this.l;
                if (obj == b) {
                    i2 = 1;
                } else if (obj == e) {
                    i2 = 2;
                }
                dqvVar.C(i2, this.g, this.h, this.i);
                return;
            }
            int i3 = this.g;
            if (i3 > 0) {
                dqvVar.J(i3);
            }
            int i4 = this.h;
            if (i4 < Integer.MAX_VALUE) {
                dqvVar.H(i4);
            }
            java.lang.Object obj2 = this.l;
            if (obj2 == b) {
                dqvVar.aa(2);
                return;
            }
            if (obj2 == d) {
                dqvVar.aa(4);
                return;
            } else {
                if (obj2 == null) {
                    dqvVar.aa(1);
                    dqvVar.M(this.j);
                    return;
                }
                return;
            }
        }
        if (z) {
            dqvVar.ab(3);
            java.lang.Object obj3 = this.l;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 == e) {
                i2 = 2;
            }
            dqvVar.K(i2, this.g, this.h, this.i);
            return;
        }
        int i5 = this.g;
        if (i5 > 0) {
            dqvVar.I(i5);
        }
        int i6 = this.h;
        if (i6 < Integer.MAX_VALUE) {
            dqvVar.G(i6);
        }
        java.lang.Object obj4 = this.l;
        if (obj4 == b) {
            dqvVar.ab(2);
            return;
        }
        if (obj4 == d) {
            dqvVar.ab(4);
        } else if (obj4 == null) {
            dqvVar.ab(1);
            dqvVar.B(this.j);
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            this.g = i;
        }
    }

    public final void f(java.lang.Object obj) {
        this.l = obj;
        this.m = true;
    }

    public dqc(java.lang.Object obj) {
        this.g = 0;
        this.h = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.m = false;
        this.l = obj;
    }
}
