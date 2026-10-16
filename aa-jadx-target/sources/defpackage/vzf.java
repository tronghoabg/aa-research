package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
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

    public static defpackage.vzf b(ajgy ajgyVar) {
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
                return new defpackage.vzf((i2 == 4 ? (ajgx) ajgyVar.d : ajgx.a).c, (ajgyVar.c == 4 ? (ajgx) ajgyVar.d : ajgx.a).d);
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
            ajgy ajgyVar = aborVar.b;
            ajgy ajgyVar2 = ajgy.a;
            ajgyVar.c = 2;
            ajgyVar.d = java.lang.Integer.valueOf(i);
            return;
        }
        defpackage.abor aborVarN = ajgx.a.n();
        int i2 = this.c;
        aborVarN.t();
        ajgx ajgxVar = aborVarN.b;
        ajgxVar.b |= 1;
        ajgxVar.c = i2;
        int i3 = this.d;
        aborVarN.t();
        ajgx ajgxVar2 = aborVarN.b;
        ajgxVar2.b = 2 | ajgxVar2.b;
        ajgxVar2.d = i3;
        aborVar.t();
        ajgy ajgyVar3 = aborVar.b;
        ajgx ajgxVarN = aborVarN.q();
        ajgy ajgyVar4 = ajgy.a;
        ajgxVarN.getClass();
        ajgyVar3.d = ajgxVarN;
        ajgyVar3.c = 4;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }
}
