package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vzf {
    public static final defpackage.vzf a;
    public static final defpackage.vzf b = new defpackage.vzf(-1, 3);
    private static final int[] e;
    public final int c;
    public final int d;

    static {
        int[] iArr = {1, 10, 100, 1000, 10000, 100000, 1000000};
        e = iArr;
        a = new defpackage.vzf(iArr[3], 3);
    }

    public vzf(int i, int i2) {
        if (i < -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
    }

    public static defpackage.vzf b(defpackage.ajgy ajgyVar) {
        int i;
        int i2 = ajgyVar.c;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 2) {
            i = i2 != 4 ? 0 : 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return new defpackage.vzf((i2 == 4 ? (defpackage.ajgx) ajgyVar.d : defpackage.ajgx.a).c, (ajgyVar.c == 4 ? (defpackage.ajgx) ajgyVar.d : defpackage.ajgx.a).d);
            }
            if (i3 != 2) {
                throw new java.lang.RuntimeException(null, null);
            }
        }
        return new defpackage.vzf(i2 == 2 ? ((java.lang.Integer) ajgyVar.d).intValue() : 0, 3);
    }

    public final int a() {
        int i = this.d;
        return i < 7 ? e[i] : (int) java.lang.Math.pow(10.0d, i);
    }

    public final boolean c(double d) {
        return d * ((double) a()) < ((double) this.c);
    }

    public final boolean d() {
        return this.c == a();
    }

    public final boolean e() {
        return this.d == 3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vzf) {
            defpackage.vzf vzfVar = (defpackage.vzf) obj;
            if (this.c == vzfVar.c && this.d == vzfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.c == -1;
    }

    final void g(defpackage.abor aborVar) {
        if (e()) {
            int i = this.c;
            aborVar.t();
            defpackage.ajgy ajgyVar = (defpackage.ajgy) aborVar.b;
            defpackage.ajgy ajgyVar2 = defpackage.ajgy.a;
            ajgyVar.c = 2;
            ajgyVar.d = java.lang.Integer.valueOf(i);
            return;
        }
        defpackage.abor aborVarN = defpackage.ajgx.a.n();
        int i2 = this.c;
        aborVarN.t();
        defpackage.ajgx ajgxVar = (defpackage.ajgx) aborVarN.b;
        ajgxVar.b |= 1;
        ajgxVar.c = i2;
        int i3 = this.d;
        aborVarN.t();
        defpackage.ajgx ajgxVar2 = (defpackage.ajgx) aborVarN.b;
        ajgxVar2.b = 2 | ajgxVar2.b;
        ajgxVar2.d = i3;
        aborVar.t();
        defpackage.ajgy ajgyVar3 = (defpackage.ajgy) aborVar.b;
        defpackage.ajgx ajgxVar3 = (defpackage.ajgx) aborVarN.q();
        defpackage.ajgy ajgyVar4 = defpackage.ajgy.a;
        ajgxVar3.getClass();
        ajgyVar3.d = ajgxVar3;
        ajgyVar3.c = 4;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d));
    }
}
