package defpackage;

/* loaded from: classes2.dex */
public final class ahs {
    public final float a;
    public final Object b;
    public final aes c;

    public ahs(float f, Object obj, aes aesVar) {
        this.a = f;
        this.b = obj;
        this.c = aesVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahs)) {
            return false;
        }
        ahs ahsVar = (ahs) obj;
        return Float.compare(this.a, ahsVar.a) == 0 && affa.f(this.b, ahsVar.b) && affa.f(this.c, ahsVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Keyframe(fraction=" + this.a + ", value=" + this.b + ", interpolator=" + this.c + ")";
    }
}
