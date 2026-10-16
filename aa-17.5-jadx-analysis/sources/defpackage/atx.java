package defpackage;

/* loaded from: classes.dex */
final class atx extends atz {
    private final cfm a;

    public atx(cfm cfmVar) {
        this.a = cfmVar;
    }

    @Override // defpackage.atz
    public final int a(int i, int i2, dlr dlrVar, cuo cuoVar, int i3) {
        return this.a.a(i2, i, dlrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atx) && affa.f(this.a, ((atx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.a + ")";
    }
}
