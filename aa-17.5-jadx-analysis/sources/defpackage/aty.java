package defpackage;

/* loaded from: classes.dex */
public final class aty extends atz {
    private final cfr a;

    public aty(cfr cfrVar) {
        this.a = cfrVar;
    }

    @Override // defpackage.atz
    public final int a(int i, int i2, dlr dlrVar, cuo cuoVar, int i3) {
        return this.a.a(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aty) && affa.f(this.a, ((aty) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.a + ")";
    }
}
