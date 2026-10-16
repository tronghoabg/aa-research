package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes2.dex */
public final class dpu {
    public static final Object a = new String("FIXED_DIMENSION");
    public static final Object b = new String("WRAP_DIMENSION");
    public static final Object c = new String("SPREAD_DIMENSION");
    public static final Object d = new String("PARENT_DIMENSION");
    public static final Object e = new String("PERCENT_DIMENSION");
    public static final Object f = new String("RATIO_DIMENSION");
    public int g;
    public int h;
    public float i;
    int j;
    public String k;
    public Object l;
    public boolean m;

    private dpu() {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.l = b;
        this.m = false;
    }

    public static dpu a(int i) {
        dpu dpuVar = new dpu(a);
        dpuVar.l = null;
        dpuVar.j = i;
        return dpuVar;
    }

    public static dpu b(Object obj) {
        dpu dpuVar = new dpu(a);
        dpuVar.l = obj;
        return dpuVar;
    }

    public static dpu c(Object obj) {
        dpu dpuVar = new dpu();
        dpuVar.f(obj);
        return dpuVar;
    }

    public final void d(dqn dqnVar, int i) {
        String str = this.k;
        if (str != null) {
            dqnVar.y(str);
        }
        boolean z = this.m;
        int i2 = 0;
        if (i == 0) {
            if (z) {
                dqnVar.aa(3);
                Object obj = this.l;
                if (obj == b) {
                    i2 = 1;
                } else if (obj == e) {
                    i2 = 2;
                }
                dqnVar.C(i2, this.g, this.h, this.i);
                return;
            }
            int i3 = this.g;
            if (i3 > 0) {
                dqnVar.J(i3);
            }
            int i4 = this.h;
            if (i4 < Integer.MAX_VALUE) {
                dqnVar.H(i4);
            }
            Object obj2 = this.l;
            if (obj2 == b) {
                dqnVar.aa(2);
                return;
            }
            if (obj2 == d) {
                dqnVar.aa(4);
                return;
            } else {
                if (obj2 == null) {
                    dqnVar.aa(1);
                    dqnVar.M(this.j);
                    return;
                }
                return;
            }
        }
        if (z) {
            dqnVar.ab(3);
            Object obj3 = this.l;
            if (obj3 == b) {
                i2 = 1;
            } else if (obj3 == e) {
                i2 = 2;
            }
            dqnVar.K(i2, this.g, this.h, this.i);
            return;
        }
        int i5 = this.g;
        if (i5 > 0) {
            dqnVar.I(i5);
        }
        int i6 = this.h;
        if (i6 < Integer.MAX_VALUE) {
            dqnVar.G(i6);
        }
        Object obj4 = this.l;
        if (obj4 == b) {
            dqnVar.ab(2);
            return;
        }
        if (obj4 == d) {
            dqnVar.ab(4);
        } else if (obj4 == null) {
            dqnVar.ab(1);
            dqnVar.B(this.j);
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            this.g = i;
        }
    }

    public final void f(Object obj) {
        this.l = obj;
        this.m = true;
    }

    public dpu(Object obj) {
        this.g = 0;
        this.h = Alert.DURATION_SHOW_INDEFINITELY;
        this.i = 1.0f;
        this.j = 0;
        this.k = null;
        this.m = false;
        this.l = obj;
    }
}
