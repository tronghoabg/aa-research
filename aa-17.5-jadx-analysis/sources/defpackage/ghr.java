package defpackage;

/* loaded from: classes2.dex */
public final class ghr {
    public final boolean a;
    public final boolean b;

    public ghr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghr)) {
            return false;
        }
        ghr ghrVar = (ghr) obj;
        return this.a == ghrVar.a && this.b == ghrVar.b;
    }

    public final int hashCode() {
        return (a.f(this.a) * 31) + a.f(this.b);
    }

    public final String toString() {
        return "TemplateThrottleConfig(allowThrottling=" + this.a + ", isLoading=" + this.b + ")";
    }

    public ghr() {
        this(true, false);
    }
}
