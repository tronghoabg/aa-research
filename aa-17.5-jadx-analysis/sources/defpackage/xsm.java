package defpackage;

/* loaded from: classes3.dex */
public class xsm implements xsy {
    public final String b;

    public xsm(String str) {
        this.b = str;
    }

    @Override // defpackage.xsy
    public String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return affa.f(a(), ((xsm) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() * 31;
    }

    public String toString() {
        return "FloatArrayUniform(name='" + a() + "')";
    }
}
