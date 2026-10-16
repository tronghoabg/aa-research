package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dip implements defpackage.dhy {
    public final int a;
    public final defpackage.dij b;
    public final int c = 0;
    private final defpackage.dil d;
    private final int e;

    public dip(int i, defpackage.dil dilVar, int i2, defpackage.dij dijVar) {
        this.a = i;
        this.d = dilVar;
        this.e = i2;
        this.b = dijVar;
    }

    @Override // defpackage.dhy
    public final int a() {
        return 0;
    }

    @Override // defpackage.dhy
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dhy
    public final defpackage.dil c() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dip)) {
            return false;
        }
        defpackage.dip dipVar = (defpackage.dip) obj;
        if (this.a != dipVar.a || !defpackage.afga.f(this.d, dipVar.d) || this.e != dipVar.e || !defpackage.afga.f(this.b, dipVar.b)) {
            return false;
        }
        int i = dipVar.c;
        return true;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.d.o) * 31) + this.e) * 961) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.d + ", style=" + defpackage.die.a(this.e) + ", loadingStrategy=Blocking)";
    }
}
