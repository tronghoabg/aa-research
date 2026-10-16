package defpackage;

/* loaded from: classes3.dex */
public class xsn implements xsy {
    public final String b;

    public xsn(String str) {
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
        return affa.f(a(), ((xsn) obj).a());
    }

    public final int hashCode() {
        return a().hashCode() * 31;
    }

    public String toString() {
        return "FloatUniform(name='" + a() + "')";
    }
}
