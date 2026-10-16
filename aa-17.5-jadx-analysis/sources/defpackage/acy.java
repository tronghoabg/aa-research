package defpackage;

/* loaded from: classes.dex */
public final class acy {
    public final float a;
    public final long b;
    public final aew c;

    public acy(float f, long j, aew aewVar) {
        this.a = f;
        this.b = j;
        this.c = aewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acy)) {
            return false;
        }
        acy acyVar = (acy) obj;
        return this.a == acyVar.a && a.j(this.b, acyVar.b) && affa.f(this.c, acyVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + a.g(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ScaleConfig(scale=" + this.a + ", transformOrigin=" + cla.a(this.b) + ", animationSpec=" + this.c + ")";
    }
}
