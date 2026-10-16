package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghx {
    public final boolean a;
    public final boolean b;

    public ghx(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ghx)) {
            return false;
        }
        defpackage.ghx ghxVar = (defpackage.ghx) obj;
        return this.a == ghxVar.a && this.b == ghxVar.b;
    }

    public final int hashCode() {
        return (defpackage.a.e(this.a) * 31) + defpackage.a.e(this.b);
    }

    public final java.lang.String toString() {
        return "TemplateThrottleConfig(allowThrottling=" + this.a + ", isLoading=" + this.b + ")";
    }

    public ghx() {
        this(true, false);
    }
}
