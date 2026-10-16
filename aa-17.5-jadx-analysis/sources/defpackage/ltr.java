package defpackage;

/* loaded from: classes2.dex */
public final class ltr {
    public final String a;
    public final int b;

    public ltr(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltr)) {
            return false;
        }
        ltr ltrVar = (ltr) obj;
        return affa.f(this.a, ltrVar.a) && this.b == ltrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PrimaryImageResource(packageName=" + this.a + ", resId=" + this.b + ")";
    }
}
