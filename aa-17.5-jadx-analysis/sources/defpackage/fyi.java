package defpackage;

/* loaded from: classes2.dex */
public final class fyi implements hju {
    public final afdr a;

    public fyi(afdr afdrVar) {
        this.a = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fyi) && affa.f(this.a, ((fyi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AlphaJumpButtonUiModel(onClick=" + this.a + ")";
    }
}
