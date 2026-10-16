package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tpr extends defpackage.tps {
    public final defpackage.tpm a;
    public final defpackage.tpm b;
    public volatile defpackage.tpm c;
    public volatile defpackage.tpm d;

    public tpr(defpackage.tpm tpmVar, defpackage.tpm tpmVar2) {
        this.a = tpmVar;
        this.b = tpmVar2;
    }

    @Override // defpackage.tps, defpackage.tox
    public final boolean b(defpackage.tps tpsVar) {
        if (!(tpsVar instanceof defpackage.tpr)) {
            return super.b(tpsVar);
        }
        defpackage.tpr tprVar = (defpackage.tpr) tpsVar;
        defpackage.tpm tpmVar = this.a;
        int i = tpmVar.a;
        defpackage.tpm tpmVar2 = tprVar.b;
        if (i > tpmVar2.a || tpmVar.b > tpmVar2.b) {
            return false;
        }
        defpackage.tpm tpmVar3 = this.b;
        int i2 = tpmVar3.a;
        defpackage.tpm tpmVar4 = tprVar.a;
        return i2 >= tpmVar4.a && tpmVar3.b >= tpmVar4.b;
    }

    public final int c() {
        return this.b.a - this.a.a;
    }

    @Override // defpackage.tps
    public final defpackage.tpm d() {
        return this.a;
    }

    @Override // defpackage.tps
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.tpm e(int i) {
        if (i == 0) {
            if (this.c == null) {
                this.c = new defpackage.tpm(this.b.a, this.a.b);
            }
            return this.c;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            if (i == 3) {
                return this.a;
            }
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        if (this.d == null) {
            this.d = new defpackage.tpm(this.a.a, this.b.b);
        }
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tpr) {
            defpackage.tpr tprVar = (defpackage.tpr) obj;
            if (tprVar.b.equals(this.b) && tprVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tps
    public final boolean f(defpackage.tpm tpmVar) {
        int i;
        defpackage.tpm tpmVar2 = this.a;
        int i2 = tpmVar.a;
        if (i2 < tpmVar2.a) {
            return false;
        }
        defpackage.tpm tpmVar3 = this.b;
        return i2 <= tpmVar3.a && (i = tpmVar.b) >= tpmVar2.b && i <= tpmVar3.b;
    }

    public final void g(defpackage.tpm tpmVar, defpackage.tpm tpmVar2) {
        h(tpmVar.a, tpmVar.b, tpmVar2.a, tpmVar2.b);
    }

    public final void h(int i, int i2, int i3, int i4) {
        defpackage.tpm tpmVar = this.a;
        tpmVar.a = i;
        tpmVar.b = i2;
        defpackage.tpm tpmVar2 = this.b;
        tpmVar2.a = i3;
        tpmVar2.b = i4;
        if (this.c != null) {
            this.c.a = i3;
            this.c.b = i2;
        }
        if (this.d != null) {
            this.d.a = i;
            this.d.b = i4;
        }
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.a.hashCode();
    }

    public final void i(defpackage.tpm[] tpmVarArr) {
        defpackage.tpm tpmVar = tpmVarArr[0];
        int i = tpmVar.a;
        int i2 = tpmVar.b;
        int i3 = i;
        int i4 = i2;
        int i5 = i3;
        for (int i6 = 1; i6 < tpmVarArr.length; i6++) {
            defpackage.tpm tpmVar2 = tpmVarArr[i6];
            int i7 = tpmVar2.a;
            if (i7 < i5) {
                i5 = i7;
            }
            if (i7 > i3) {
                i3 = i7;
            }
            int i8 = tpmVar2.b;
            if (i8 < i2) {
                i2 = i8;
            }
            if (i8 > i4) {
                i4 = i8;
            }
        }
        h(i5, i2, i3, i4);
    }

    @Override // defpackage.tps
    public final boolean j(defpackage.tps tpsVar) {
        defpackage.tpr tprVarA = tpsVar.a();
        defpackage.tpm tpmVar = tprVarA.a;
        defpackage.tpm tpmVar2 = this.a;
        if (tpmVar2.a > tpmVar.a || tpmVar2.b > tpmVar.b) {
            return false;
        }
        defpackage.tpm tpmVar3 = this.b;
        defpackage.tpm tpmVar4 = tprVarA.b;
        return tpmVar3.a >= tpmVar4.a && tpmVar3.b >= tpmVar4.b;
    }

    public final java.lang.String toString() {
        defpackage.tpm tpmVar = this.b;
        return "[" + this.a.toString() + ", " + tpmVar.toString() + "]";
    }

    @Override // defpackage.tps, defpackage.tox
    public final defpackage.tpr a() {
        return this;
    }
}
