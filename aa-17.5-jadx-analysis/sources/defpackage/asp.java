package defpackage;

/* loaded from: classes.dex */
public final class asp extends asq {
    private final crw a;

    public asp(crw crwVar) {
        this.a = crwVar;
    }

    @Override // defpackage.asq
    public final int a(cuo cuoVar) {
        return cuoVar.eB(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asp) && affa.f(this.a, ((asp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.a + ")";
    }
}
