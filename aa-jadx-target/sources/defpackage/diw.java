package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class diw extends defpackage.dhl {
    public final java.lang.String c;
    public final defpackage.div d;
    public final defpackage.dil e;
    public final int f;
    private final defpackage.dij g;
    private final boolean h;

    public diw(java.lang.String str, defpackage.div divVar, defpackage.dil dilVar, int i, defpackage.dij dijVar) {
        super(2, defpackage.diy.a, dijVar);
        this.c = str;
        this.d = divVar;
        this.e = dilVar;
        this.f = i;
        this.g = dijVar;
        this.h = true;
    }

    @Override // defpackage.dhy
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dhy
    public final defpackage.dil c() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.diw)) {
            return false;
        }
        defpackage.diw diwVar = (defpackage.diw) obj;
        if (!defpackage.afga.f(this.c, diwVar.c) || !defpackage.afga.f(this.d, diwVar.d) || !defpackage.afga.f(this.e, diwVar.e) || !defpackage.a.X(this.f, diwVar.f)) {
            return false;
        }
        boolean z = diwVar.h;
        return defpackage.afga.f(this.g, diwVar.g);
    }

    public final int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.o) * 31) + this.f) * 31) + 1231) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + defpackage.die.a(this.f) + ", fontVariationSettings=" + this.g + ")";
    }
}
