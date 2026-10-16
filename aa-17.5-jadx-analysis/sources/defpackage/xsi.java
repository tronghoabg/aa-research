package defpackage;

/* loaded from: classes3.dex */
public final class xsi implements xsy {
    private final String a;

    public xsi(String str) {
        this.a = str;
    }

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
        return affa.f(this.a, ((xsi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ColorUniform(name='" + this.a + "')";
    }
}
