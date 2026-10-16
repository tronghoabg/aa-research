package defpackage;

/* loaded from: classes3.dex */
public final class xsp implements xsy {
    private final String a = "inRadialGradientDirection";

    @Override // defpackage.xsy
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return affa.f(this.a, ((xsp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "IntUniform(name='" + this.a + "')";
    }
}
