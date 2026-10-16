package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class vyk {
    public static final vyk a;
    public static final vyk b = new vyk(-1, 3);
    private static final int[] e;
    public final int c;
    public final int d;

    static {
        int[] iArr = {1, 10, 100, 1000, 10000, 100000, 1000000};
        e = iArr;
        a = new vyk(iArr[3], 3);
    }

    public vyk(int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
    }

    public static vyk b(ajfz ajfzVar) {
        int i = ajfzVar.c;
        int i2 = i != 0 ? i != 2 ? i != 4 ? 0 : 2 : 1 : 3;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return new vyk((i == 4 ? (ajfy) ajfzVar.d : ajfy.a).c, (ajfzVar.c == 4 ? (ajfy) ajfzVar.d : ajfy.a).d);
            }
            if (i3 != 2) {
                throw new RuntimeException(null, null);
            }
        }
        return new vyk(i == 2 ? ((Integer) ajfzVar.d).intValue() : 0, 3);
    }

    public final int a() {
        int i = this.d;
        return i < 7 ? e[i] : (int) Math.pow(10.0d, i);
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vyk) {
            vyk vykVar = (vyk) obj;
            if (this.c == vykVar.c && this.d == vykVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.c == -1;
    }

    final void g(abnp abnpVar) {
        if (e()) {
            int i = this.c;
            abnpVar.t();
            ajfz ajfzVar = (ajfz) abnpVar.b;
            ajfz ajfzVar2 = ajfz.a;
            ajfzVar.c = 2;
            ajfzVar.d = Integer.valueOf(i);
            return;
        }
        abnp abnpVarN = ajfy.a.n();
        int i2 = this.c;
        abnpVarN.t();
        ajfy ajfyVar = (ajfy) abnpVarN.b;
        ajfyVar.b |= 1;
        ajfyVar.c = i2;
        int i3 = this.d;
        abnpVarN.t();
        ajfy ajfyVar2 = (ajfy) abnpVarN.b;
        ajfyVar2.b = 2 | ajfyVar2.b;
        ajfyVar2.d = i3;
        abnpVar.t();
        ajfz ajfzVar3 = (ajfz) abnpVar.b;
        ajfy ajfyVar3 = (ajfy) abnpVarN.q();
        ajfz ajfzVar4 = ajfz.a;
        ajfyVar3.getClass();
        ajfzVar3.d = ajfyVar3;
        ajfzVar3.c = 4;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
