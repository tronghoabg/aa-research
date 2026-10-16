package defpackage;

/* loaded from: classes2.dex */
public final class ldc implements ldf {
    private final yzy a;

    public ldc(yzy yzyVar) {
        this.a = yzyVar;
    }

    @Override // defpackage.ldf
    public final yzy a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldc) && affa.f(this.a, ((ldc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(action=" + this.a + ")";
    }
}
