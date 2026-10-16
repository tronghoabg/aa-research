package defpackage;

/* loaded from: classes.dex */
public final class dip extends dhe {
    public final String c;
    public final dio d;
    public final die e;
    public final int f;
    private final dic g;
    private final boolean h;

    public dip(String str, dio dioVar, die dieVar, int i, dic dicVar) {
        super(2, dir.a, dicVar);
        this.c = str;
        this.d = dioVar;
        this.e = dieVar;
        this.f = i;
        this.g = dicVar;
        this.h = true;
    }

    @Override // defpackage.dhr
    public final int b() {
        return this.f;
    }

    @Override // defpackage.dhr
    public final die c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dip)) {
            return false;
        }
        dip dipVar = (dip) obj;
        if (!affa.f(this.c, dipVar.c) || !affa.f(this.d, dipVar.d) || !affa.f(this.e, dipVar.e) || !a.Y(this.f, dipVar.f)) {
            return false;
        }
        boolean z = dipVar.h;
        return affa.f(this.g, dipVar.g);
    }

    public final int hashCode() {
        return (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.o) * 31) + this.f) * 31) + 1231) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + dhx.a(this.f) + ", fontVariationSettings=" + this.g + ")";
    }
}
