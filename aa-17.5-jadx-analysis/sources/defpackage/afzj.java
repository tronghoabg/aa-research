package defpackage;

/* loaded from: classes3.dex */
public final class afzj {
    private final int arity;
    private final afzh kind;

    public afzj(afzh afzhVar, int i) {
        afzhVar.getClass();
        this.kind = afzhVar;
        this.arity = i;
    }

    public final afzh component1() {
        return this.kind;
    }

    public final int component2() {
        return this.arity;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afzj)) {
            return false;
        }
        afzj afzjVar = (afzj) obj;
        return affa.f(this.kind, afzjVar.kind) && this.arity == afzjVar.arity;
    }

    public final afzh getKind() {
        return this.kind;
    }

    public int hashCode() {
        return (this.kind.hashCode() * 31) + this.arity;
    }

    public String toString() {
        return "KindWithArity(kind=" + this.kind + ", arity=" + this.arity + ')';
    }
}
