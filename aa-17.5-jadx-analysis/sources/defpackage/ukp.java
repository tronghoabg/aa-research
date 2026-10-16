package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public final class ukp implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final tzy d;
    public final int e;
    public final int f;
    public final int g;
    private tot h = null;
    private too j = null;
    private too i = null;

    public ukp(int i, int i2, int i3, tzy tzyVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = tzyVar;
        this.g = 18 - i;
        int i4 = 1073741824 >> i;
        this.e = (i2 * i4) - 536870912;
        this.f = -((i4 * (i3 + 1)) - 536870912);
    }

    public static ukp f(int i, int i2, int i3) {
        if (i <= 0) {
            return new ukp(0, 0, 0, null);
        }
        if (i > 30) {
            i = 30;
        }
        int iJ = dlz.j(i3, -536870912, 536870912);
        int i4 = 30 - i;
        int i5 = (i2 + 536870912) >> i4;
        int i6 = 1 << i;
        if (i5 < 0) {
            i5 += i6;
        } else if (i5 >= i6) {
            i5 -= i6;
        }
        int i7 = ((-iJ) + 536870912) >> i4;
        return new ukp(i, i5, i7 >= 0 ? i7 >= i6 ? i6 - 1 : i7 : 0, null);
    }

    @ResultIgnorabilityUnspecified
    public static boolean j(tpk tpkVar, int i, List list, tpk tpkVar2) {
        if (i < 0) {
            return true;
        }
        too tooVar = tpkVar.b;
        int i2 = tooVar.b;
        int iJ = dlz.j(i2, -536870912, 536870912);
        too tooVar2 = tpkVar.c;
        int i3 = tooVar.a;
        int i4 = tooVar2.b;
        ukp ukpVarF = f(i, i3, i4);
        int i5 = ukpVarF.b;
        int i6 = ukpVarF.c;
        ukp ukpVarF2 = f(i, tooVar2.a - 1, iJ + 1);
        int i7 = ukpVarF2.b;
        int i8 = ukpVarF2.c;
        int i9 = 1 << i;
        int i10 = ((i5 > i7 ? (i9 - i5) + i7 : i7 - i5) + 1) * ((i8 - i6) + 1);
        if (i10 < 0) {
            return true;
        }
        if (i10 > 100000) {
            return false;
        }
        if (i10 == 0) {
            list.add(ukpVarF);
        } else if (i5 > i7) {
            for (int i11 = i5; i11 < i9; i11++) {
                for (int i12 = i6; i12 <= i8; i12++) {
                    list.add(new ukp(i, i11, i12, null));
                }
            }
            for (int i13 = 0; i13 <= i7; i13++) {
                for (int i14 = i6; i14 <= i8; i14++) {
                    list.add(new ukp(i, i13, i14, null));
                }
            }
        } else if (i5 != i7 || (i4 - i2 <= 536870912 && tpkVar.a.c() <= 536870912)) {
            for (int i15 = i5; i15 <= i7; i15++) {
                for (int i16 = i6; i16 <= i8; i16++) {
                    list.add(new ukp(i, i15, i16, null));
                }
            }
        } else {
            for (int i17 = 0; i17 < i9; i17++) {
                for (int i18 = i6; i18 <= i8; i18++) {
                    list.add(new ukp(i, i17, i18, null));
                }
            }
        }
        if (tpkVar2 != null) {
            int i19 = 30 - i;
            int i20 = 1073741824 >> i;
            tpkVar2.a.h((i5 << i19) - 536870912, ((-(i8 << i19)) + 536870912) - i20, ((i7 << i19) - 536870912) + i20, (-(i6 << i19)) + 536870912);
            tpkVar2.b(tpkVar2.a);
        }
        return true;
    }

    public final int a() {
        return 1073741824 >> this.a;
    }

    public final synchronized too b() {
        too tooVar = this.i;
        if (tooVar != null) {
            return tooVar;
        }
        too tooVar2 = new too();
        int i = this.a;
        int i2 = (1073741824 >> i) >> 1;
        tooVar2.r(this.e + i2, this.f + i2);
        this.i = tooVar2;
        return tooVar2;
    }

    public final synchronized too c() {
        too tooVar = this.j;
        if (tooVar != null) {
            return tooVar;
        }
        too tooVarM = e().a.m(b());
        this.j = tooVarM;
        return tooVarM;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ukp ukpVar = (ukp) obj;
        return yde.b.c(this.a, ukpVar.a).c(this.b, ukpVar.b).c(this.c, ukpVar.c).f(this.d, ukpVar.d, yli.a.a()).a();
    }

    public final tot d() {
        int i = this.e;
        int i2 = this.f;
        too tooVar = new too(i, i2);
        int i3 = 1073741824 >> this.a;
        return new tot(tooVar, new too(i + i3, i2 + i3));
    }

    public final synchronized tot e() {
        tot totVar = this.h;
        if (totVar != null) {
            return totVar;
        }
        tot totVarD = d();
        this.h = totVarD;
        return totVarD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukp)) {
            return false;
        }
        ukp ukpVar = (ukp) obj;
        if (this.b == ukpVar.b && this.c == ukpVar.c && this.a == ukpVar.a) {
            return Objects.equals(this.d, ukpVar.d);
        }
        return false;
    }

    public final ukp g(tzy tzyVar) {
        return new ukp(this.a, this.b, this.c, tzyVar);
    }

    public final ukp h(int i) {
        int i2 = this.a - i;
        if (i2 <= 0) {
            return this;
        }
        int i3 = this.b;
        return new ukp(i, i3 >> i2, this.c >> i2, this.d);
    }

    public final int hashCode() {
        int i = this.a;
        tzy tzyVar = this.d;
        int i2 = (((i * 31) + this.b) * 31) + this.c;
        return tzyVar != null ? (i2 * 31) + tzyVar.hashCode() : i2;
    }

    public final void i(tot totVar) {
        int i = this.e;
        int i2 = this.f;
        int i3 = 1073741824 >> this.a;
        totVar.h(i, i2, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.a);
        sb.append(",");
        sb.append(this.b);
        sb.append(",");
        sb.append(this.c);
        sb.append(",");
        Object obj = this.d;
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }
}
