package defpackage;

/* loaded from: classes.dex */
public final class dia implements dhz {
    private final String a;
    private final float b;

    public dia(String str, float f) {
        this.a = str;
        this.b = f;
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
        if (obj instanceof dia) {
            dia diaVar = (dia) obj;
            if (affa.f(this.a, diaVar.a) && this.b == diaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ")";
    }

    @Override // defpackage.dhz
    public final void c() {
    }
}
