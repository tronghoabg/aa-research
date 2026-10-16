package defpackage;

/* loaded from: classes2.dex */
public final class dok {
    public final Object a;
    public final int b;
    public final dos c;

    public dok(Object obj, int i, dos dosVar) {
        this.a = obj;
        this.b = i;
        this.c = dosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok)) {
            return false;
        }
        dok dokVar = (dok) obj;
        return affa.f(this.a, dokVar.a) && this.b == dokVar.b && affa.f(this.c, dokVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ")";
    }
}
