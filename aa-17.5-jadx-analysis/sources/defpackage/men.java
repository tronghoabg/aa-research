package defpackage;

/* loaded from: classes2.dex */
public final class men {
    public final String a;
    public final String b;

    public men(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof men)) {
            return false;
        }
        men menVar = (men) obj;
        return affa.f(this.a, menVar.a) && affa.f(this.b, menVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Key(name=" + this.a + ", identifier=" + this.b + ")";
    }
}
