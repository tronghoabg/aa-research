package defpackage;

/* loaded from: classes.dex */
public final class ksk {
    public final int a;
    public final ksd b;
    public final int c;
    public final ksd d;

    public ksk(int i, ksd ksdVar, int i2, ksd ksdVar2) {
        this.a = i;
        this.b = ksdVar;
        this.c = i2;
        this.d = ksdVar2;
    }

    public final int a(krt krtVar) {
        krtVar.getClass();
        ksk kskVar = krs.a;
        return ((abzz) this.b.j.invoke(krtVar)).a(this.a);
    }

    public final int b(krt krtVar) {
        krtVar.getClass();
        ksk kskVar = krs.a;
        return ((abzz) this.d.j.invoke(krtVar)).a(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksk)) {
            return false;
        }
        ksk kskVar = (ksk) obj;
        return this.a == kskVar.a && this.b == kskVar.b && this.c == kskVar.c && this.d == kskVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TokenValue(darkTone=" + this.a + ", darkColor=" + this.b + ", lightTone=" + this.c + ", lightColor=" + this.d + ")";
    }
}
