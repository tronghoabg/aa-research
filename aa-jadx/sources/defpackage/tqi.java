package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqi extends defpackage.tqj {
    public defpackage.tpr a;
    public final defpackage.tpm b;
    public final defpackage.tpm c;
    private int d;
    private int f;
    private int g;
    private volatile defpackage.tpm h;
    private volatile defpackage.tpm i;
    private volatile defpackage.tpm j;
    private volatile defpackage.tpm k;
    private volatile defpackage.tpm l;
    private volatile defpackage.tpm m;

    public tqi(defpackage.tpr tprVar) {
        defpackage.tpm tpmVar = new defpackage.tpm();
        this.b = tpmVar;
        defpackage.tpm tpmVar2 = new defpackage.tpm();
        this.c = tpmVar2;
        h(tpmVar, tpmVar2, tprVar);
    }

    private final void h(defpackage.tpm tpmVar, defpackage.tpm tpmVar2, defpackage.tpr tprVar) {
        this.a = tprVar;
        defpackage.tpm tpmVar3 = tprVar.a;
        int i = tpmVar3.a;
        defpackage.tpm tpmVar4 = tprVar.b;
        if (i < 0) {
            this.d = -i;
        } else {
            int i2 = tpmVar4.a;
            if (i2 > 1073741824) {
                this.d = 1073741824 - i2;
            }
        }
        tpmVar3.w(tpmVar);
        tpmVar4.w(tpmVar2);
        this.e = tpmVar.a > tpmVar2.a;
        int i3 = tpmVar3.a;
        int i4 = this.d;
        this.f = i3 + i4;
        this.g = tpmVar4.a + i4;
    }

    @Override // defpackage.tqj
    public final int a() {
        return this.e ? 6 : 4;
    }

    public final void b(defpackage.tpr tprVar) {
        h(this.b, this.c, tprVar);
    }

    @Override // defpackage.tqj
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.tpm c(int i) {
        if (i == 0) {
            if (this.h == null) {
                this.h = new defpackage.tpm(this.c.a, this.b.b);
            }
            return this.h;
        }
        if (i == 1) {
            return this.c;
        }
        if (i != 2) {
            if (i == 3) {
                return this.b;
            }
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        if (this.i == null) {
            this.i = new defpackage.tpm(this.b.a, this.c.b);
        }
        return this.i;
    }

    @Override // defpackage.tqj
    public final void e(int i, defpackage.tpm[] tpmVarArr) {
        if (!this.e) {
            tpmVarArr[0] = c(i);
            tpmVarArr[1] = c((i + 1) % 4);
            return;
        }
        if (i == 0) {
            tpmVarArr[0] = c(0);
            tpmVarArr[1] = c(1);
            return;
        }
        if (i == 1) {
            tpmVarArr[0] = c(1);
            if (this.j == null) {
                this.j = new defpackage.tpm(-536870913, this.c.b);
            }
            tpmVarArr[1] = this.j;
            return;
        }
        if (i == 2) {
            if (this.k == null) {
                this.k = new defpackage.tpm(536870912, this.c.b);
            }
            tpmVarArr[0] = this.k;
            tpmVarArr[1] = c(2);
            return;
        }
        if (i == 3) {
            tpmVarArr[0] = c(2);
            tpmVarArr[1] = c(3);
            return;
        }
        if (i == 4) {
            tpmVarArr[0] = c(3);
            if (this.l == null) {
                this.l = new defpackage.tpm(536870912, this.b.b);
            }
            tpmVarArr[1] = this.l;
            return;
        }
        if (i != 5) {
            return;
        }
        if (this.m == null) {
            this.m = new defpackage.tpm(-536870913, this.b.b);
        }
        tpmVarArr[0] = this.m;
        tpmVarArr[1] = c(0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.tqi)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        defpackage.tqi tqiVar = (defpackage.tqi) obj;
        return this.b.equals(tqiVar.b) && this.c.equals(tqiVar.c) && this.a.equals(tqiVar.a);
    }

    @Override // defpackage.tqj
    public final boolean g(defpackage.tpm tpmVar) {
        int i;
        int i2 = (tpmVar.a + this.d) & 1073741823;
        return i2 >= this.f && i2 <= this.g && (i = tpmVar.b) >= this.b.b && i <= this.c.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.b, this.c, this.a);
    }

    @Override // defpackage.tqj
    public final boolean j(defpackage.tps tpsVar) {
        if (!this.e) {
            return this.a.b(tpsVar);
        }
        if (!(tpsVar instanceof defpackage.tpr)) {
            return super.j(tpsVar);
        }
        defpackage.tpm tpmVar = this.b;
        int i = tpmVar.b;
        defpackage.tpr tprVar = (defpackage.tpr) tpsVar;
        defpackage.tpm tpmVar2 = tprVar.b;
        if (i <= tpmVar2.b) {
            defpackage.tpm tpmVar3 = this.c;
            int i2 = tpmVar3.b;
            defpackage.tpm tpmVar4 = tprVar.a;
            if (i2 >= tpmVar4.b) {
                int i3 = tpmVar.a;
                int i4 = tpmVar2.a;
                if (i3 <= i4 && tpmVar4.a < 536870912) {
                    return true;
                }
                if (i4 >= -536870912 && tpmVar3.a >= tpmVar4.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        defpackage.tpm tpmVar = this.c;
        return "[" + this.b.toString() + "," + tpmVar.toString() + "]";
    }

    @Override // defpackage.tqj
    public final defpackage.tqi d() {
        return this;
    }
}
