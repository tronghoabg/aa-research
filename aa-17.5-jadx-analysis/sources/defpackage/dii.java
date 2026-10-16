package defpackage;

/* loaded from: classes.dex */
public final class dii implements dhr {
    public final int a;
    public final dic b;
    public final int c = 0;
    private final die d;
    private final int e;

    public dii(int i, die dieVar, int i2, dic dicVar) {
        this.a = i;
        this.d = dieVar;
        this.e = i2;
        this.b = dicVar;
    }

    @Override // defpackage.dhr
    public final int a() {
        return 0;
    }

    @Override // defpackage.dhr
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dhr
    public final die c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dii)) {
            return false;
        }
        dii diiVar = (dii) obj;
        if (this.a != diiVar.a || !affa.f(this.d, diiVar.d) || this.e != diiVar.e || !affa.f(this.b, diiVar.b)) {
            return false;
        }
        int i = diiVar.c;
        return true;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.d.o) * 31) + this.e) * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.d + ", style=" + dhx.a(this.e) + ", loadingStrategy=Blocking)";
    }
}
