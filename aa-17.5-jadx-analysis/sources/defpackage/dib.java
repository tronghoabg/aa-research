package defpackage;

/* loaded from: classes.dex */
public final class dib implements dhz {
    private final String a = "wght";
    private final int b;

    public dib(int i) {
        this.b = i;
    }

    @Override // defpackage.dhz
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dhz
    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dib)) {
            return false;
        }
        dib dibVar = (dib) obj;
        return affa.f(this.a, dibVar.a) && this.b == dibVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ")";
    }

    @Override // defpackage.dhz
    public final void c() {
    }
}
