package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulk implements java.lang.Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final defpackage.uav d;
    public final int e;
    public final int f;
    public final int g;
    private defpackage.tpr h = null;
    private defpackage.tpm j = null;
    private defpackage.tpm i = null;

    public ulk(int i, int i2, int i3, defpackage.uav uavVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = uavVar;
        this.g = 18 - i;
        int i4 = 1073741824 >> i;
        this.e = (i2 * i4) - 536870912;
        this.f = -((i4 * (i3 + 1)) - 536870912);
    }

    public static defpackage.ulk f(int i, int i2, int i3) {
        int i4 = 0;
        if (i <= 0) {
            return new defpackage.ulk(0, 0, 0, null);
        }
        if (i > 30) {
            i = 30;
        }
        int iC = defpackage.duc.c(i3, -536870912, 536870912);
        int i5 = 30 - i;
        int i6 = (i2 + 536870912) >> i5;
        int i7 = 1 << i;
        if (i6 < 0) {
            i6 += i7;
        } else if (i6 >= i7) {
            i6 -= i7;
        }
        int i8 = ((-iC) + 536870912) >> i5;
        if (i8 >= 0) {
            i4 = i8 >= i7 ? i7 - 1 : i8;
        }
        return new defpackage.ulk(i, i6, i4, null);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static boolean j(defpackage.tqi tqiVar, int i, java.util.List list, defpackage.tqi tqiVar2) {
        if (i < 0) {
            return true;
        }
        defpackage.tpm tpmVar = tqiVar.b;
        int i2 = tpmVar.b;
        int iC = defpackage.duc.c(i2, -536870912, 536870912);
        defpackage.tpm tpmVar2 = tqiVar.c;
        int i3 = tpmVar.a;
        int i4 = tpmVar2.b;
        defpackage.ulk ulkVarF = f(i, i3, i4);
        int i5 = ulkVarF.b;
        int i6 = ulkVarF.c;
        defpackage.ulk ulkVarF2 = f(i, tpmVar2.a - 1, iC + 1);
        int i7 = ulkVarF2.b;
        int i8 = ulkVarF2.c;
        int i9 = 1 << i;
        int i10 = ((i5 > i7 ? (i9 - i5) + i7 : i7 - i5) + 1) * ((i8 - i6) + 1);
        if (i10 < 0) {
            return true;
        }
        if (i10 > 100000) {
            return false;
        }
        if (i10 == 0) {
            list.add(ulkVarF);
        } else if (i5 > i7) {
            for (int i11 = i5; i11 < i9; i11++) {
                for (int i12 = i6; i12 <= i8; i12++) {
                    list.add(new defpackage.ulk(i, i11, i12, null));
                }
            }
            for (int i13 = 0; i13 <= i7; i13++) {
                for (int i14 = i6; i14 <= i8; i14++) {
                    list.add(new defpackage.ulk(i, i13, i14, null));
                }
            }
        } else if (i5 != i7 || (i4 - i2 <= 536870912 && tqiVar.a.c() <= 536870912)) {
            for (int i15 = i5; i15 <= i7; i15++) {
                for (int i16 = i6; i16 <= i8; i16++) {
                    list.add(new defpackage.ulk(i, i15, i16, null));
                }
            }
        } else {
            for (int i17 = 0; i17 < i9; i17++) {
                for (int i18 = i6; i18 <= i8; i18++) {
                    list.add(new defpackage.ulk(i, i17, i18, null));
                }
            }
        }
        if (tqiVar2 != null) {
            int i19 = 30 - i;
            int i20 = 1073741824 >> i;
            tqiVar2.a.h((i5 << i19) - 536870912, ((-(i8 << i19)) + 536870912) - i20, ((i7 << i19) - 536870912) + i20, (-(i6 << i19)) + 536870912);
            tqiVar2.b(tqiVar2.a);
        }
        return true;
    }

    public final int a() {
        return 1073741824 >> this.a;
    }

    public final synchronized defpackage.tpm b() {
        defpackage.tpm tpmVar = this.i;
        if (tpmVar != null) {
            return tpmVar;
        }
        defpackage.tpm tpmVar2 = new defpackage.tpm();
        int i = this.a;
        int i2 = (1073741824 >> i) >> 1;
        tpmVar2.r(this.e + i2, this.f + i2);
        this.i = tpmVar2;
        return tpmVar2;
    }

    public final synchronized defpackage.tpm c() {
        defpackage.tpm tpmVar = this.j;
        if (tpmVar != null) {
            return tpmVar;
        }
        defpackage.tpm tpmVarM = e().a.m(b());
        this.j = tpmVarM;
        return tpmVarM;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.ulk ulkVar = (defpackage.ulk) obj;
        return defpackage.yek.b.c(this.a, ulkVar.a).c(this.b, ulkVar.b).c(this.c, ulkVar.c).f(this.d, ulkVar.d, defpackage.ymn.a.a()).a();
    }

    public final defpackage.tpr d() {
        int i = this.e;
        int i2 = this.f;
        defpackage.tpm tpmVar = new defpackage.tpm(i, i2);
        int i3 = 1073741824 >> this.a;
        return new defpackage.tpr(tpmVar, new defpackage.tpm(i + i3, i2 + i3));
    }

    public final synchronized defpackage.tpr e() {
        defpackage.tpr tprVar = this.h;
        if (tprVar != null) {
            return tprVar;
        }
        defpackage.tpr tprVarD = d();
        this.h = tprVarD;
        return tprVarD;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ulk)) {
            return false;
        }
        defpackage.ulk ulkVar = (defpackage.ulk) obj;
        if (this.b == ulkVar.b && this.c == ulkVar.c && this.a == ulkVar.a) {
            return j$.util.Objects.equals(this.d, ulkVar.d);
        }
        return false;
    }

    public final defpackage.ulk g(defpackage.uav uavVar) {
        return new defpackage.ulk(this.a, this.b, this.c, uavVar);
    }

    public final defpackage.ulk h(int i) {
        int i2 = this.a - i;
        if (i2 <= 0) {
            return this;
        }
        int i3 = this.b;
        return new defpackage.ulk(i, i3 >> i2, this.c >> i2, this.d);
    }

    public final int hashCode() {
        int i = this.a;
        defpackage.uav uavVar = this.d;
        int i2 = (((i * 31) + this.b) * 31) + this.c;
        return uavVar != null ? (i2 * 31) + uavVar.hashCode() : i2;
    }

    public final void i(defpackage.tpr tprVar) {
        int i = this.e;
        int i2 = this.f;
        int i3 = 1073741824 >> this.a;
        tprVar.h(i, i2, i + i3, i3 + i2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(",");
        sb.append(this.c);
        sb.append(",");
        java.lang.Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
