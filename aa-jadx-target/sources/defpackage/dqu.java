package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dqu {
    public int b;
    public boolean c;
    public final defpackage.dqv d;
    public defpackage.dqu e;
    public defpackage.dpj h;
    public final int i;
    public java.util.HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public dqu(defpackage.dqv dqvVar, int i) {
        this.d = dqvVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        defpackage.dqu dquVar;
        if (this.d.ar == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (dquVar = this.e) == null || dquVar.d.ar != 8) ? this.f : i;
    }

    public final defpackage.dqu c() {
        int i = this.i - 1;
        if (i == 1) {
            return this.d.V;
        }
        if (i == 2) {
            return this.d.W;
        }
        if (i == 3) {
            return this.d.T;
        }
        if (i != 4) {
            return null;
        }
        return this.d.U;
    }

    public final void d(int i, java.util.ArrayList arrayList, drq drqVar) {
        java.util.HashSet hashSet = this.a;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                defpackage.xi.e(((defpackage.dqu) it.next()).d, i, arrayList, drqVar);
            }
        }
    }

    public final void e() {
        java.util.HashSet hashSet;
        defpackage.dqu dquVar = this.e;
        if (dquVar != null && (hashSet = dquVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void f(int i) {
        this.b = i;
        this.c = true;
    }

    public final void g(int i) {
        if (j()) {
            this.g = i;
        }
    }

    public final boolean h() {
        java.util.HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((defpackage.dqu) it.next()).c().j()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        java.util.HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean j() {
        return this.e != null;
    }

    public final boolean k(defpackage.dqu dquVar) {
        if (dquVar == null) {
            return false;
        }
        int i = this.i;
        int i2 = dquVar.i;
        if (i2 == i) {
            return i != 6 || (dquVar.d.P && this.d.P);
        }
        int i3 = 9;
        int i4 = 4;
        int i5 = 2;
        switch (i - 1) {
            case 1:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = 8;
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                i5 = 3;
                i4 = 5;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return (i2 == 2 || i2 == 4) ? false : true;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                return false;
        }
        boolean z = i2 == i5 || i2 == i4;
        if (dquVar.d instanceof defpackage.dqz) {
            return z || i2 == i3;
        }
        return z;
    }

    public final void l(defpackage.dqu dquVar, int i, int i2, boolean z) {
        if (dquVar == null) {
            e();
            return;
        }
        if (z || k(dquVar)) {
            this.e = dquVar;
            if (dquVar.a == null) {
                dquVar.a = new java.util.HashSet();
            }
            java.util.HashSet hashSet = this.e.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f = i;
            this.g = i2;
        }
    }

    public final void m() {
        defpackage.dpj dpjVar = this.h;
        if (dpjVar == null) {
            this.h = new defpackage.dpj(1);
        } else {
            dpjVar.c();
        }
    }

    public final java.lang.String toString() {
        return this.d.as + ":" + defpackage.a.R(this.i);
    }
}
