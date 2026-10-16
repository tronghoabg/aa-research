package defpackage;

/* loaded from: classes2.dex */
public final class hlc implements hju {
    public final hju a;
    public final aiyk b;

    public hlc(hju hjuVar, aiyk aiykVar) {
        hjuVar.getClass();
        this.a = hjuVar;
        this.b = aiykVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc)) {
            return false;
        }
        hlc hlcVar = (hlc) obj;
        return affa.f(this.a, hlcVar.a) && affa.f(this.b, hlcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PlaceholderUiUiModel(initialModel=" + this.a + ", uiModelFlow=" + this.b + ")";
    }
}
