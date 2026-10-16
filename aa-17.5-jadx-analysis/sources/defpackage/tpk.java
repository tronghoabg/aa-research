package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class tpk extends tpl {
    public tot a;
    public final too b;
    public final too c;
    private int d;
    private int f;
    private int g;
    private volatile too h;
    private volatile too i;
    private volatile too j;
    private volatile too k;
    private volatile too l;
    private volatile too m;

    public tpk(tot totVar) {
        too tooVar = new too();
        this.b = tooVar;
        too tooVar2 = new too();
        this.c = tooVar2;
        h(tooVar, tooVar2, totVar);
    }

    private final void h(too tooVar, too tooVar2, tot totVar) {
        this.a = totVar;
        too tooVar3 = totVar.a;
        int i = tooVar3.a;
        too tooVar4 = totVar.b;
        if (i < 0) {
            this.d = -i;
        } else {
            int i2 = tooVar4.a;
            if (i2 > 1073741824) {
                this.d = 1073741824 - i2;
            }
        }
        tooVar3.w(tooVar);
        tooVar4.w(tooVar2);
        this.e = tooVar.a > tooVar2.a;
        int i3 = tooVar3.a;
        int i4 = this.d;
        this.f = i3 + i4;
        this.g = tooVar4.a + i4;
    }

    @Override // defpackage.tpl
    public final int a() {
        return this.e ? 6 : 4;
    }

    public final void b(tot totVar) {
        h(this.b, this.c, totVar);
    }

    @Override // defpackage.tpl
    @ResultIgnorabilityUnspecified
    public final too c(int i) {
        if (i == 0) {
            if (this.h == null) {
                this.h = new too(this.c.a, this.b.b);
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
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.i == null) {
            this.i = new too(this.b.a, this.c.b);
        }
        return this.i;
    }

    @Override // defpackage.tpl
    public final void e(int i, too[] tooVarArr) {
        if (!this.e) {
            tooVarArr[0] = c(i);
            tooVarArr[1] = c((i + 1) % 4);
            return;
        }
        if (i == 0) {
            tooVarArr[0] = c(0);
            tooVarArr[1] = c(1);
            return;
        }
        if (i == 1) {
            tooVarArr[0] = c(1);
            if (this.j == null) {
                this.j = new too(-536870913, this.c.b);
            }
            tooVarArr[1] = this.j;
            return;
        }
        if (i == 2) {
            if (this.k == null) {
                this.k = new too(536870912, this.c.b);
            }
            tooVarArr[0] = this.k;
            tooVarArr[1] = c(2);
            return;
        }
        if (i == 3) {
            tooVarArr[0] = c(2);
            tooVarArr[1] = c(3);
            return;
        }
        if (i == 4) {
            tooVarArr[0] = c(3);
            if (this.l == null) {
                this.l = new too(536870912, this.b.b);
            }
            tooVarArr[1] = this.l;
            return;
        }
        if (i != 5) {
            return;
        }
        if (this.m == null) {
            this.m = new too(-536870913, this.b.b);
        }
        tooVarArr[0] = this.m;
        tooVarArr[1] = c(0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tpk)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        tpk tpkVar = (tpk) obj;
        return this.b.equals(tpkVar.b) && this.c.equals(tpkVar.c) && this.a.equals(tpkVar.a);
    }

    @Override // defpackage.tpl
    public final boolean g(too tooVar) {
        int i;
        int i2 = (tooVar.a + this.d) & 1073741823;
        return i2 >= this.f && i2 <= this.g && (i = tooVar.b) >= this.b.b && i <= this.c.b;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.a);
    }

    @Override // defpackage.tpl
    public final boolean j(tou touVar) {
        if (!this.e) {
            return this.a.b(touVar);
        }
        if (!(touVar instanceof tot)) {
            return super.j(touVar);
        }
        too tooVar = this.b;
        int i = tooVar.b;
        tot totVar = (tot) touVar;
        too tooVar2 = totVar.b;
        if (i <= tooVar2.b) {
            too tooVar3 = this.c;
            int i2 = tooVar3.b;
            too tooVar4 = totVar.a;
            if (i2 >= tooVar4.b) {
                int i3 = tooVar.a;
                int i4 = tooVar2.a;
                if (i3 <= i4 && tooVar4.a < 536870912) {
                    return true;
                }
                if (i4 >= -536870912 && tooVar3.a >= tooVar4.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        too tooVar = this.c;
        return "[" + this.b.toString() + "," + tooVar.toString() + "]";
    }

    @Override // defpackage.tpl
    public final tpk d() {
        return this;
    }
}
