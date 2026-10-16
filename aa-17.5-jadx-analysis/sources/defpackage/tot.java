package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class tot extends tou {
    public final too a;
    public final too b;
    public volatile too c;
    public volatile too d;

    public tot(too tooVar, too tooVar2) {
        this.a = tooVar;
        this.b = tooVar2;
    }

    @Override // defpackage.tou, defpackage.tnz
    public final boolean b(tou touVar) {
        if (!(touVar instanceof tot)) {
            return super.b(touVar);
        }
        tot totVar = (tot) touVar;
        too tooVar = this.a;
        int i = tooVar.a;
        too tooVar2 = totVar.b;
        if (i > tooVar2.a || tooVar.b > tooVar2.b) {
            return false;
        }
        too tooVar3 = this.b;
        int i2 = tooVar3.a;
        too tooVar4 = totVar.a;
        return i2 >= tooVar4.a && tooVar3.b >= tooVar4.b;
    }

    public final int c() {
        return this.b.a - this.a.a;
    }

    @Override // defpackage.tou
    public final too d() {
        return this.a;
    }

    @Override // defpackage.tou
    @ResultIgnorabilityUnspecified
    public final too e(int i) {
        if (i == 0) {
            if (this.c == null) {
                this.c = new too(this.b.a, this.a.b);
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
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.d == null) {
            this.d = new too(this.a.a, this.b.b);
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tot) {
            tot totVar = (tot) obj;
            if (totVar.b.equals(this.b) && totVar.a.equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tou
    public final boolean f(too tooVar) {
        int i;
        too tooVar2 = this.a;
        int i2 = tooVar.a;
        if (i2 < tooVar2.a) {
            return false;
        }
        too tooVar3 = this.b;
        return i2 <= tooVar3.a && (i = tooVar.b) >= tooVar2.b && i <= tooVar3.b;
    }

    public final void g(too tooVar, too tooVar2) {
        h(tooVar.a, tooVar.b, tooVar2.a, tooVar2.b);
    }

    public final void h(int i, int i2, int i3, int i4) {
        too tooVar = this.a;
        tooVar.a = i;
        tooVar.b = i2;
        too tooVar2 = this.b;
        tooVar2.a = i3;
        tooVar2.b = i4;
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

    public final void i(too[] tooVarArr) {
        too tooVar = tooVarArr[0];
        int i = tooVar.a;
        int i2 = tooVar.b;
        int i3 = i;
        int i4 = i2;
        int i5 = i3;
        for (int i6 = 1; i6 < tooVarArr.length; i6++) {
            too tooVar2 = tooVarArr[i6];
            int i7 = tooVar2.a;
            if (i7 < i5) {
                i5 = i7;
            }
            if (i7 > i3) {
                i3 = i7;
            }
            int i8 = tooVar2.b;
            if (i8 < i2) {
                i2 = i8;
            }
            if (i8 > i4) {
                i4 = i8;
            }
        }
        h(i5, i2, i3, i4);
    }

    @Override // defpackage.tou
    public final boolean j(tou touVar) {
        tot totVarA = touVar.a();
        too tooVar = totVarA.a;
        too tooVar2 = this.a;
        if (tooVar2.a > tooVar.a || tooVar2.b > tooVar.b) {
            return false;
        }
        too tooVar3 = this.b;
        too tooVar4 = totVarA.b;
        return tooVar3.a >= tooVar4.a && tooVar3.b >= tooVar4.b;
    }

    public final String toString() {
        too tooVar = this.b;
        return "[" + this.a.toString() + ", " + tooVar.toString() + "]";
    }

    @Override // defpackage.tou, defpackage.tnz
    public final tot a() {
        return this;
    }
}
