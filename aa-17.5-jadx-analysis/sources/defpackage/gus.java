package defpackage;

/* loaded from: classes2.dex */
public final class gus implements hju {
    public final gab a;
    public final gfa b;

    public gus(gab gabVar, gfa gfaVar) {
        this.a = gabVar;
        this.b = gfaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gus)) {
            return false;
        }
        gus gusVar = (gus) obj;
        return affa.f(this.a, gusVar.a) && affa.f(this.b, gusVar.b);
    }

    public final int hashCode() {
        gab gabVar = this.a;
        return ((gabVar == null ? 0 : gabVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MinimizedMessageUiModel(image=" + this.a + ", title=" + this.b + ")";
    }

    public gus() {
        this(null, gey.b);
    }
}
