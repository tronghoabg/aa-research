package defpackage;

/* loaded from: classes2.dex */
public final class hja {
    public final hiq a;
    public final hiq b;
    public final hir c;

    public hja(hiq hiqVar, hiq hiqVar2, hir hirVar) {
        hiqVar.getClass();
        hiqVar2.getClass();
        this.a = hiqVar;
        this.b = hiqVar2;
        this.c = hirVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hja)) {
            return false;
        }
        hja hjaVar = (hja) obj;
        return affa.f(this.a, hjaVar.a) && affa.f(this.b, hjaVar.b) && affa.f(this.c, hjaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TemplatePadding(horizontal=" + this.a + ", vertical=" + this.b + ", static=" + this.c + ")";
    }
}
