package defpackage;

/* loaded from: classes.dex */
public final class acr {
    public final float a;
    public final aew b;

    public acr(float f, aew aewVar) {
        this.a = f;
        this.b = aewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acr)) {
            return false;
        }
        acr acrVar = (acr) obj;
        return this.a == acrVar.a && affa.f(this.b, acrVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeConfig(alpha=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
