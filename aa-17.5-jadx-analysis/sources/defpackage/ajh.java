package defpackage;

/* loaded from: classes.dex */
public final class ajh {
    public final float a;
    public final cjs b;

    public ajh(float f, cjs cjsVar) {
        this.a = f;
        this.b = cjsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajh)) {
            return false;
        }
        ajh ajhVar = (ajh) obj;
        return Float.compare(this.a, ajhVar.a) == 0 && affa.f(this.b, ajhVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BorderStroke(width=" + dlj.b(this.a) + ", brush=" + this.b + ")";
    }
}
