package defpackage;

/* loaded from: classes2.dex */
public final class hjo {
    public final hjn a;
    public final hjm b;
    public final int c;
    public final int d;

    public hjo(hjn hjnVar, hjm hjmVar, int i, int i2) {
        this.a = hjnVar;
        this.b = hjmVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean a(hjn hjnVar, hjm hjmVar) {
        if (this.a.d >= hjnVar.d) {
            return this.b.d >= hjmVar.d;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjo)) {
            return false;
        }
        hjo hjoVar = (hjo) obj;
        return this.a == hjoVar.a && this.b == hjoVar.b && this.c == hjoVar.c && this.d == hjoVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "TemplateBreakpoint(width=" + this.a + ", height=" + this.b + ", widthDp=" + this.c + ", heightDp=" + this.d + ")";
    }
}
